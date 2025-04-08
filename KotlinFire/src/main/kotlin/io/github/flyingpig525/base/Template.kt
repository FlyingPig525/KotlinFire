package io.github.flyingpig525.base

import io.github.flyingpig525.base.block.category.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.ParameterItem
import io.github.flyingpig525.encoding.TemplateEncoder
import io.ktor.client.*
import io.ktor.client.engine.java.*
import io.ktor.client.plugins.websocket.*
import io.ktor.http.*
import io.ktor.websocket.*
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.putJsonArray
import org.jetbrains.annotations.ApiStatus.Internal

typealias Items<T> = ItemCollection<T>.() -> Unit

@Suppress("LeakingThis")
open class Template<T : Item>(
    type: Type = Type.FUNCTION,
    val name: String = "PutNameHere",
    vararg args: ParameterItem,
    a: Template<T>.() -> Unit
) : JsonData {
    val blocks: MutableList<Block<T>> = mutableListOf()
    val SetVariable = SetVariableCategory(this)
    val EntityAction = EntityActionCategory(this)
    val GameAction = GameActionCategory(this)
    val PlayerAction = PlayerActionCategory(this)
    val Select = SelectObjectCategory(this)
    val Repeat = RepeatCategory(this)
    val IfVar = IfVarCategory(this)
    val IfPlayer = IfPlayerCategory(this)
    val IfEntity = IfEntityCategory(this)
    val IfGame = IfGameCategory(this)
    val Control = ControlCategory(this)

    fun callFunction(name: String, items: Items<T> = {}) {
        blocks += CallFunctionBlock(name, items)
    }
    fun callProcess(name: String, items: Items<T> = {}) {
        blocks += CallProcessBlock(name, items)
    }

    fun invokeTemplate(template: Template<T>, items: Items<T> = {}) {
        if (template.blocks[0] is FunctionBlock) {
            callFunction(template.name, items)
            return
        }
        if (template.blocks[0] is ProcessBlock) {
            callProcess(template.name, items)
            return
        }
        throw Error("Cannot invoke Event template!")
    }

    fun Else(wrappedCode: Template<T>.() -> Unit) {
        blocks += ElseBlock()
        blocks += BracketBlock(type = "norm")
        blocks += Template(
            Type.NONE,
            a = wrappedCode
        ).blocks
        blocks += BracketBlock(false, "norm")
    }

    init {
        if (type != Type.NONE) {
            blocks += when (type) {
                Type.FUNCTION -> FunctionBlock(name, args.toMutableList()) as Block<T>
                Type.PROCESS -> ProcessBlock(name, args.toMutableList()) as Block<T>
                // This will get changed by `EventTemplate`
                Type.EVENT -> Block("", mutableListOf(), "")
                // This will never get called, so it doesn't have to be implemented
                Type.NONE -> TODO()
            }
        }
        apply(a)
    }

    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            putJsonArray("blocks") {
                for (block in blocks) {
                    add(block.getJsonData())
                }
            }
        }

//        var string = """
//            {
//            "blocks": [
//        """.trimIndent()
//        var i = 1
//        for (block in blocks) {
//            string += block.getJsonData()
//            if (blocks.size > i) string += ','
//            i++
//        }
//        string += """
//            ]
//            }
//        """.trimIndent()
//        return string
    }

    fun getTemplateString(): String = TemplateEncoder.encode(this)

    companion object {
        @Deprecated("Recode is no longer being worked on")
        fun <T> recodeSendTemplate(template: Template<T>) where T : Item, T : JsonData {
            val client = HttpClient(Java) {
                install(WebSockets)
            }
            runBlocking {
                client.webSocket(
                    method = HttpMethod.Post,
                    host = "localhost",
                    port = 31371,
                    path = "/codeutilities/item"
                ) {
                    send(
                        """
                        {
                        "type": "template",
                        "source": "KotlinFire",
                        "data": "${Json.encodeToString(template.getJsonData()).replace("\"", "\\\"")}"
                        }
                    """.trimIndent()
                            .replace("\n", "") + "\n"
                    )
                }
            }
        }

        private val codeClientHttp = HttpClient(Java) {
            install(WebSockets)
        }

        fun <T> codeClientPlaceTemplate(template: Template<T>) where T : Item, T : JsonData = codeClientPlaceMultipleTemplates(listOf(template))

        fun <T> codeClientPlaceMultipleTemplates(templates: List<Template<T>>, ignoreSizeWarning: Boolean = false) where T : Item, T : JsonData {
            runBlocking {
                codeClientHttp.webSocket(
                    method = HttpMethod.Get,
                    host = "localhost",
                    port = 31375
                ) {
                    send("scopes read_plot write_code")
                    
                    if ("auth" !in String(incoming.receive().data)) {
                        close()
                        return@webSocket
                    }

                    send("size")
                    val size = String(incoming.receive().data)

                    val sizeNum = when(size) {
                        "BASIC" -> 50
                        "LARGE" -> 100
                        "MASSIVE" -> 300
                        "MEGA" -> 300
                        else -> 0
                    }
                    
                    if (sizeNum == 0) {
                        close()
                        return@webSocket
                    }
                    
                    for (temp in templates) {
                        if (temp.blocks.size*2 > sizeNum && !ignoreSizeWarning) {
                            println("TEMPLATE PLACE ERROR\n"
                                    + "Template ${temp.name} may not fit in codespace, cancelling\n"
                                    + "Disable this by passing `true` for the `ignoreSizeWarning` parameter"
                            )
                            close(CloseReason(CloseReason.Codes.INTERNAL_ERROR, "Template may not fit in codespace"))
                            return@webSocket
                        }
                    }

                    send("place swap")
                    
                    for (temp in templates) {
                        send("place ${temp.getTemplateString()}")
                    }
                    
                    send("place go")
                    incoming.receive()
                    
                    close(CloseReason(CloseReason.Codes.NORMAL, "Function done."))
                }
            }
        }
    }

    fun <T> codeClientPlaceMultipleTemplates(vararg templates: Template<T>) where T : Item, T : JsonData =
        codeClientPlaceMultipleTemplates(templates.toList())

    enum class Type {
        FUNCTION,
        PROCESS,

        @Internal
        NONE,

        @Internal
        EVENT;
    }

}

