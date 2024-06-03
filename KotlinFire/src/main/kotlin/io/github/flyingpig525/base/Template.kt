package io.github.flyingpig525.base

import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.FunctionBlock
import io.github.flyingpig525.base.block.ProcessBlock
import io.github.flyingpig525.base.block.category.SetVariableCategory
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.encoding.TemplateEncoder
import io.ktor.client.*
import io.ktor.client.engine.java.*
import io.ktor.client.plugins.websocket.*
import io.ktor.http.*
import io.ktor.websocket.*
import kotlinx.coroutines.runBlocking

typealias Items<T> = ItemCollection<T>.() -> Unit

class Template<T>(type: Type = Type.FUNCTION, name: String = "PutNameHere", a: Template<T>.() -> Unit) : JsonData where T : Item, T : JsonData {
    val blocks: MutableList<Block<T>> = mutableListOf()
    val SetVariable = SetVariableCategory(this)

    init {
        blocks += when(type) {
            Type.FUNCTION -> FunctionBlock(name)
            Type.PROCESS -> ProcessBlock(name)
            Type.EVENT -> TODO()
        }
        apply(a)
    }

    override fun getJsonData(): String {
        var string = """
            {
            "blocks": [
        """.trimIndent()
        var i = 1
        for (block in blocks) {
            string += block.getJsonData()
            if (blocks.size > i) string += ','
            i++
        }
        string += """
            ]
            }
        """.trimIndent()
        return string
    }

    fun getTemplateString(): String = TemplateEncoder.encode(this)

    companion object {
        @Deprecated("Recode ItemAPI doesn't work")
        fun <T> recodeSendTemplate(template: Template<T>) where T : Item, T : JsonData {
            val client = HttpClient(Java) {
                install(WebSockets)
                developmentMode = true
            }
            runBlocking {
                    println("AIODhjAWIOPDHAWIPDH")
                client.webSocket(method = HttpMethod.Post, host = "localhost", port = 31371, path = "/codeutilities/item") {
                    send("""
                        {
                        "type": "template",
                        "source": "KotlinFire",
                        "data": "${template.getJsonData().replace("\"", "\\\"")}"
                        }
                    """.trimIndent()
                        .replace("\n", "") + "\n"
                    )

//                    send("{id:\"minecraft:stone\",Count:1b}")
                }
            }
        }
        private val codeClientHttp = HttpClient(Java) {
            install(WebSockets)
            developmentMode = true
        }
        fun <T> codeClientPlaceTemplate(template: Template<T>) where T : Item, T : JsonData {
            runBlocking {
                codeClientHttp.webSocket(method = HttpMethod.Get, host = "localhost", port = 31375) {
                    val inc = incoming.receive()
                    if ("auth" in String(inc.data)) {
                        send("place ${template.getTemplateString()}")
                        send("place go")
                    }
                    close()
                }
            }
        }
    }

    enum class Type {
        FUNCTION,
        PROCESS,
        EVENT;
    }

}

