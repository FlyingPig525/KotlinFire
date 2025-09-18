package io.github.flyingpig525.base

import io.github.flyingpig525.base.block.category.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.ItemComparison
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.StringItem.Companion.stringItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.textItem
import io.github.flyingpig525.base.item.type.VarItem.Companion.lineVar
import io.github.flyingpig525.base.item.type.VarItem.Companion.toVarItem
import io.github.flyingpig525.encoding.TemplateEncoder
import io.github.flyingpig525.serialization.DiamondFireClass
import io.github.flyingpig525.serialization.DiamondFireClassOptIn
import io.github.flyingpig525.serialization.DiamondFireDelegate
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
import kotlin.reflect.KProperty

typealias Items = ItemCollection.() -> Unit

@Suppress("LeakingThis", "NOTHING_TO_INLINE")
@OptIn(DiamondFireClassOptIn::class)
open class Template(
    type: Type = Type.FUNCTION,
    val name: String = "PutNameHere",
    vararg args: ParameterItem,
    a: Template.() -> Unit
) : JsonData {
    val blocks: MutableList<Block> = mutableListOf()
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

    fun callFunction(name: String, items: Items = {}) {
        blocks += CallFunctionBlock(name, items)
    }
    fun callProcess(name: String, items: Items = {}) {
        blocks += CallProcessBlock(name, items)
    }

    fun invokeTemplate(template: Template, items: Items = {}) {
        if (template is EventTemplate) {
            throw Error("Cannot invoke Event template!")
        }
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

    operator fun invoke(thisValue: Template, items: Items = {}) = thisValue.invokeTemplate(this, items)

    infix fun ElseOperation.Else(wrappedCode: Template.() -> Unit) {
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
                Type.FUNCTION -> FunctionBlock(name, args.toMutableList()) as Block
                Type.PROCESS -> ProcessBlock(name, args.toMutableList()) as Block
                // This will get changed by `EventTemplate`
                Type.EVENT -> Block("", mutableListOf(), "")
                // This will never get called, so it doesn't have to be implemented
                Type.NONE -> TODO()
            }
        }
        TemplateContext.push(this)
        apply(a)
        TemplateContext.pop()
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

    // Extension operator functions
    // All VarClass implementations
    infix fun <T : Item> VarClass<T>.set(value: T) {
        VarClass.assertInsertable(value)
        SetVariable.equalTo {
            +item
            +value
        }
    }
    // bullshit
    infix fun <T : Item> VarClass<T>.set(value: GameValue<*>) {
        SetVariable.equalTo {
            +item
            +value
        }
    }
    infix fun VarClass<*>.set(value: VarItem) {
        SetVariable.equalTo {
            +item
            +value
        }
    }

    // NumVariable
    // +=
    inline operator fun NumVariable.plusAssign(other: Number) = plusAssign(other.numItem)
    inline operator fun NumVariable.plusAssign(other: String) = plusAssign(other.numItem)
    inline operator fun NumVariable.plusAssign(other: NumVariable) = plusAssign(other.item)
    inline operator fun NumVariable.plusAssign(other: NumItem) {
        SetVariable.increment {
            +item
            +other
        }
    }
    inline operator fun NumVariable.plusAssign(other: VarItem) {
        SetVariable.increment {
            +item
            +other
        }
    }
    // -=
    inline operator fun NumVariable.minusAssign(other: Number) = minusAssign(other.numItem)
    inline operator fun NumVariable.minusAssign(other: String) = minusAssign(other.numItem)
    inline operator fun NumVariable.minusAssign(other: NumVariable) = minusAssign(other.item)
    inline operator fun NumVariable.minusAssign(other: NumItem) {
        SetVariable.increment {
            +item
            +other
        }
    }
    inline operator fun NumVariable.minusAssign(other: VarItem) {
        SetVariable.increment {
            +item
            +other
        }
    }
    // /=
    inline operator fun NumVariable.divAssign(other: Number) = divAssign(other.numItem)
    inline operator fun NumVariable.divAssign(other: String) = divAssign(other.numItem)
    inline operator fun NumVariable.divAssign(other: NumVariable) = divAssign(other.item)
    inline operator fun NumVariable.divAssign(other: NumItem) {
        SetVariable.divide {
            +item
            +item
            +other
        }
    }
    inline operator fun NumVariable.divAssign(other: VarItem) {
        SetVariable.divide {
            +item
            +item
            +other
        }
    }
    // *=
    inline operator fun NumVariable.timesAssign(other: Number) = timesAssign(other.numItem)
    inline operator fun NumVariable.timesAssign(other: String) = timesAssign(other.numItem)
    inline operator fun NumVariable.timesAssign(other: NumVariable) = timesAssign(other.item)
    inline operator fun NumVariable.timesAssign(other: NumItem) {
        SetVariable.x {
            +item
            +item
            +other
        }
    }
    inline operator fun NumVariable.timesAssign(other: VarItem) {
        SetVariable.x {
            +item
            +item
            +other
        }
    }
    // %=
    inline operator fun NumVariable.remAssign(other: Number) = remAssign(other.numItem)
    inline operator fun NumVariable.remAssign(other: String) = remAssign(other.numItem)
    inline operator fun NumVariable.remAssign(other: NumVariable) = remAssign(other.item)
    inline operator fun NumVariable.remAssign(other: NumItem) {
        SetVariable.mod {
            +item
            +item
            +other
        }
    }
    inline operator fun NumVariable.remAssign(other: VarItem) {
        SetVariable.mod {
            +item
            +item
            +other
        }
    }
    inline operator fun NumVariable.unaryMinus() = "-%var($name)".numItem
    // TextVariable
    // +=
    inline operator fun TextVariable.plusAssign(other: String) = plusAssign(other.textItem)
    inline operator fun TextVariable.plusAssign(other: VarClass<*>) { plusAssign(other.item) }
    inline operator fun TextVariable.plusAssign(other: TextItem) {
        SetVariable.styledText {
            +item
            +item
            +other
        }
    }
    inline operator fun TextVariable.plusAssign(other: VarItem) {
        SetVariable.styledText {
            +item
            +item
            +other
        }
    }
    // Trim
    /**
     * Trims the content of a styled text
     */
    inline fun TextVariable.trim(from: Number, to: Number? = null) = trim(from.numItem, to?.numItem)
    /**
     * Trims the content of a styled text
     *
     * [from] and [to] must be [NumItem] parsable strings
     */
    inline fun TextVariable.trim(from: String, to: String? = null) = trim(from.numItem, to?.numItem)
    /**
     * Trims the content of a styled text
     *
     * @param [to] - Can be an uninitialized variable
     */
    inline fun TextVariable.trim(from: VarItem, to: VarItem? = null) {
        SetVariable.trimStyledText {
            +item
            +from
            if (to != null) {
                +to
            }
        }
    }
    /**
     * Trims the content of a styled text
     */
    inline fun TextVariable.trim(from: NumItem, to: NumItem? = null) {
        SetVariable.trimStyledText {
            +item
            +from
            if (to != null) {
                +to
            }
        }
    }
    // Replace
    /**
     * @param [replace] - A regex used to find replacement targets
     */
    inline fun TextVariable.replace(replace: String, with: String) = replace(replace.textItem, with.textItem)
    /**
     * @param [replace] - A regex used to find replacement targets
     */
    inline fun TextVariable.replace(replace: VarClass<*>, with: VarClass<*>) = replace(replace.item, with.item)
    /**
     * @param [replace] - A regex used to find replacement targets
     */
    inline fun TextVariable.replace(replace: TextItem, with: TextItem) {
        SetVariable.rmText {
            +item
            +item
            +replace
            +with
        }
    }
    /**
     * @param [replace] - A regex used to find replacement targets
     */
    inline fun TextVariable.replace(replace: VarItem, with: VarItem) {
        SetVariable.rmText {
            +item
            +item
            +replace
            +with
        }
    }
    // VecVariable
    // Length
    inline fun VecVariable.setLength(length: Number) = setLength(length.numItem)
    inline fun VecVariable.setLength(length: NumVariable) {
        SetVariable.setVectorLength {
            +item
            +length
        }
    }
    inline fun VecVariable.setLength(length: NumItem) {
        SetVariable.setVectorLength {
            +item
            +length
        }
    }

    fun ifVal(comp: ItemComparison, wrappedCode: Template.() -> Unit): ElseOperation {
        comp(this, wrappedCode)
        return ElseOperation()
    }

//    operator fun <T : VarClass<I>, I : Item> DiamondFireDelegate<T, I>.setValue(thisRef: Any?, property: KMutableProperty1<*, *>, value: I) {
//        SetVariable.setDictValue {
//            +clazz.name.toVarItem(clazz.scope)
//            +property.name.stringItem
//            +value
//        }
//    }
//
//    operator fun <T : VarClass<I>, I : Item> DiamondFireDelegate<T, I>.setValue(thisRef: Any?, property: KMutableProperty<*>, value: T) {
//        SetVariable.setDictValue {
//            +clazz.name.toVarItem(clazz.scope)
//            +property.name.stringItem
//            +value
//        }
//    }

    @OptIn(DiamondFireClassOptIn::class)
    fun DiamondFireClass.init() {
        // TODO: add appending if toInitialize is too long for one chest
        SetVariable.createList {
            +"${name}-KeyList-ajowdoiwajdpowd".lineVar
            for (prop in toInitialize.keys) {
                +prop.name.stringItem
            }
        }
        SetVariable.createList {
            +"${name}-ValueList-ajowdoiwajdpowd".lineVar
            for (default in toInitialize.values) {
                +default
            }
        }
        SetVariable.createDict {
            +name.toVarItem(scope)
            +"${name}-KeyList-ajowdoiwajdpowd".lineVar
            +"${name}-ValueList-ajowdoiwajdpowd".lineVar
        }
    }


    companion object {
        @Deprecated("Recode is no longer being worked on")
        fun recodeSendTemplate(template: Template) {
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

        fun codeClientPlaceTemplate(template: Template) = codeClientPlaceMultipleTemplates(listOf(template))

        fun codeClientPlaceMultipleTemplates(templates: List<Template>, ignoreSizeWarning: Boolean = false) {
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

    fun codeClientPlaceMultipleTemplates(vararg templates: Template) =
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

