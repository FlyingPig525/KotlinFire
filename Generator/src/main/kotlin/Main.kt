package io.github.flyingpig525

import kotlinx.serialization.json.*
import java.io.File
import java.io.FileNotFoundException
import kotlin.io.path.*

// This is not efficient in the slightest :skull:
fun main(vararg args: String) {
    val actionDumpFile = File("dbc.json")
    if (!actionDumpFile.exists()) {
        throw FileNotFoundException("action dump file not found")
    }
    val actionDump = Json.parseToJsonElement(actionDumpFile.readText()).jsonObject
    val actions = actionDump["actions"]!!.jsonArray
    val blocks = actionDump["codeblocks"]!!.jsonArray
    val actionMap = mutableMapOf<String, MutableList<JsonObject>>()
    if ("noBlock" !in args) {
        println("creating block keys")
        blocks.forEach {
            actionMap[it.jsonObject["name"]!!.jsonPrimitive.content] = mutableListOf()
        }
        println("creating block actions")
        actions.forEach {
            actionMap[it.jsonObject["codeblockName"]!!.jsonPrimitive.content]!! += it.jsonObject
        }
        println("processing block actions")
        actionMap.forEach { (k, v) ->
            if (k.endsWith("PROCESS") || k.endsWith("FUNCTION") || k.endsWith("EVENT")) return@forEach
            if (v.isEmpty()) return@forEach
            blockActions(v.toList())
        }
    }
    if ("noEvent" !in args) {
        println("processing events")
        actionMap.filterKeys { it.endsWith("EVENT") }.forEach { (k, v) ->
            processEvents(CodeBlock.of(k), v)
        }
    }
    if ("noGameValue" !in args) {
        println("creating game value categories")
        val categories: MutableMap<String, MutableList<JsonObject>> = mutableMapOf()
        for (value in actionDump["gameValueCategories"]!!.jsonArray.map { it.jsonObject }) {
            categories[value["identifier"]!!.jsonPrimitive.content] = mutableListOf()
        }
        println("populating game value categories")
        for (value in actionDump["gameValues"]!!.jsonArray.map { it.jsonObject }) {
            categories[value["category"]!!.jsonPrimitive.content]!! += value
        }
        println("processing game value categories")
        for (category in categories) try {
            if (category.value.isEmpty()) continue
            processGameValueCategory(category.key, category.value)
        } catch (e: Throwable) {
            println("something went wrong processing category ${category.key}")
            e.printStackTrace()
            break
        }
    }

    // TODO: Add sound processing
    // TODO: Add potion processing
}

fun blockActions(actions: List<JsonObject>) = try {
    val alreadyDone = mutableListOf<String>()
    val codeblock = CodeBlock.of(actions[0]["codeblockName"]!!.jsonPrimitive.content)
    val className = codeblock.name
    val encloses = enclosesCode(codeblock)
    var subActionFile = """
        package io.github.flyingpig525.base.block.subaction
        
        import io.github.flyingpig525.base.block.subaction.SubAction
        
        enum class ${codeblock.name}SubAction(override val codeblock: String) : SubAction {
        
        """.trimIndent()
    var file: String = """
        package io.github.flyingpig525.base.block.category
        
        import io.github.flyingpig525.base.*
        import io.github.flyingpig525.base.item.*
        import io.github.flyingpig525.base.item.type.*
        import io.github.flyingpig525.base.block.*
        import io.github.flyingpig525.base.block.subaction.*
        import kotlinx.serialization.json.JsonObjectBuilder
        import kotlinx.serialization.json.put
        
        
    """.trimIndent()
    if (!encloses) {
        file += """
        class ${codeblock.name}Category internal constructor(private val template: Template) {
            private val blocks = template.blocks

            private fun block(items: Items, action: String, extra: JsonObjectBuilder.() -> Unit = {}) {
                blocks += Block("${codeblock.shortName}", ItemCollection(items).items, action, extra)
            }
        """.trimIndent()
    } else {
        file += """
            class ${codeblock.name}Category internal constructor(private val template: Template) {
                private val blocks = template.blocks

                private fun block(
                    items: Items,
                    action: String,
                    wrappedCode: Template.() -> Unit,
                    not: Boolean = false,
                    extra: JsonObjectBuilder.() -> Unit = {}
                ) {
                    blocks += Block("${codeblock.shortName}", ItemCollection(items).items, action) {
                        if (not) put("attribute", "NOT")
                        extra()
                    }
                    blocks += BracketBlock(type = "${if (codeblock.name == "Repeat") "repeat" else "norm"}")
                    blocks += io.github.flyingpig525.base.Template(
                        io.github.flyingpig525.base.Template.Type.NONE,
                        a = wrappedCode
                    ).blocks
                    blocks += BracketBlock(false, "${if (codeblock.name == "Repeat") "repeat" else "norm"}")
                }
        """.trimIndent()
    }
    for (action in actions) try {
        val name = action["name"]!!.jsonPrimitive.content
        val funcName = removeClutter(actionNameToFunction(name))
        if (funcName in alreadyDone) continue
        alreadyDone += funcName
        val icon = action["icon"]!!.jsonObject
        val description: List<String> = icon["description"]!!.jsonArray.map { it.jsonPrimitive.content }
        var comment = "\t/**\n"
        description.forEach {
            comment += "\t * *${removeClutter(it)}*\n"
        }
        val subAction = hasSubAction(action)
        if (subAction) {
            comment += "\t *\n"
            comment += "\t * **Accepts sub actions:**\n"
            val subActions = action["subActionBlocks"]!!.jsonArray.map { CodeBlock.of(it.jsonPrimitive.content) }
            subActions.forEach {
                comment += "\t * [${it}SubAction],\n"
            }
        }
        val arguments = icon["arguments"]?.jsonArray?.mapNotNull {
            val obj = it.jsonObject
            if (obj.containsKey("type")) obj else null
        }
        if (arguments?.isNotEmpty() == true) {
            comment +=
                "\t *\n" +
                "\t * **Args:**\n" +
                "\t *\n"
            arguments.forEach { arg ->
                val unprocessed = arg["type"]!!.jsonPrimitive.content
                if (unprocessed == "NONE") return@forEach
                val type = typeToKType(unprocessed)
                val description = arg["description"]?.jsonArray?.map { it.jsonPrimitive.content }
                val optional = arg["optional"]!!.jsonPrimitive.boolean
                comment += "\t * [$type]"
                if (type == "GenericItem") {
                    comment += " (Particle)"
                }
                comment += "\n\t *\n"
                description?.forEach {
                    comment += "\t * ${if (optional) "(*) " else ""}*${removeClutter(it)}*\n"
                }
                comment += "\t *\n"
            }
            comment += "\t * (*) = optional\n"
        }
        comment += "\t */\n"
        file += "\n$comment"
        val negatable = negatable(codeblock.name, funcName)
        file +=
            "\tfun $funcName(items: Items${
                if (subAction) ", subAction: SubAction" else ""
            }${
                if (negatable) ", not: Boolean = false" else ""
            }${
                if (encloses) ", wrappedCode: Template.() -> Unit" else ""
            }): ElseOperation {\n\t\tblock(items, \"$name\"${if (encloses) ", wrappedCode" else ""}${if (negatable) ", not" else ""})${
                if (subAction) 
                    """ { put("subAction", subAction.codeblock) }"""
                else ""
            }\n\t\treturn ElseOperation()\n\t}\n\n"
    } catch (e: Exception) {
        println(Json.encodeToString(action))
        e.printStackTrace()
    }
    if (isSubActionCategory(codeblock)) {
        val found = mutableListOf<String>()
        for (action in actions) {
            val name = action["name"]!!.jsonPrimitive.content.trim()
            if (name in found) continue
            found += name
            val aliases = action["aliases"]!!.jsonArray.map { it.jsonPrimitive.content }
            val entryName = removeClutter(name.replace(" ", "")).replaceFirstChar { it.uppercase() }
            if (aliases.isNotEmpty()) {
                subActionFile += "\t${entryName}(\"${aliases[0]}\"),\n"
            } else {
                subActionFile += "\t$entryName(\"$name\"),\n"
            }
        }
        subActionFile += "}"
        writeToDirFile("gen/subaction", "${codeblock.name}SubAction.kt", subActionFile)
    }
    file += "}"
    writeToDirFile("gen/categories", "${codeblock.name}Category.kt", file)
} catch (e: Exception) {
    e.printStackTrace()
}

fun processEvents(codeblock: CodeBlock, events: List<JsonObject>) = try {
    if (codeblock != CodeBlock.PlayerEvent && codeblock != CodeBlock.EntityEvent) throw IllegalArgumentException("codeblock cannot be a non-event block")
    var file = """
        package io.github.flyingpig525.base.block
        
        enum class ${codeblock.name}(val type: EventBlock.Type, val event: String) {
    """.trimIndent()
    for (event in events) {
        val name = event["name"]!!.jsonPrimitive.content
        val iconName = removeClutter(event["icon"]!!.jsonObject["name"]!!.jsonPrimitive.content)
        val desc = event["icon"]!!.jsonObject["description"]!!.jsonArray.map { removeClutter(it.jsonPrimitive.content) }
        file += "\n"
        file += "\t/**\n"
        file += "\t * $iconName\n"
        file += "\t *\n"
        file += "\t * **Description:**\n"
        file += "\t *\n"
        for (line in desc) {
            file += "\t * *$line*\n"
        }
        file += "\t */\n"
        file += "\t$name(EventBlock.Type.${codeblock.name}, \"$name\"),\n"
    }
    file += "}"
    writeToDirFile("gen/events", "${codeblock.name}.kt", file)
} catch (e: Exception) {
    println("an error occurred during event processing")
    e.printStackTrace()
}

fun processGameValueCategory(category: String, values: List<JsonObject>) {
    val className = category.replace(" ", "")
    println(className)
    var file = """
        package io.github.flyingpig525.base.item.type.gamevalue
        
        import io.github.flyingpig525.base.item.*
        import io.github.flyingpig525.base.item.type.*
        
        object $className {
        
    """.trimIndent()
    for (value in values) try {
        val icon = value["icon"]!!.jsonObject
        val id = removeClutter(icon["name"]!!.jsonPrimitive.content)
        val name = id.replace(" ", "").replace("-", "")
        val description = icon["description"]!!.jsonArray.map { it.jsonPrimitive.content }
        val type = typeToKType(icon["returnType"]!!.jsonPrimitive.content)
        val typeDescription = icon["returnDescription"]!!.jsonArray.map { it.jsonPrimitive.content }
        val additionalInfo = icon["additionalInfo"]!!.jsonArray.map { it.jsonArray.map { it.jsonPrimitive.content } }.flatten()
        file += "\t/**\n"
        if (description.isNotEmpty()) {
            for (line in description) {
                file += "\t * *${removeClutter(line)}*\n"
            }
            file += "\t *\n"
        }
        file += "\t * **Type:** [$type]\n"
        if (typeDescription.isNotEmpty()) {
            file += "\t *\n"
            for (line in typeDescription) {
                file += "\t * *${removeClutter(line)}*\n"
            }
        }
        if (additionalInfo.isNotEmpty()) {
            file += "\t *\n"
            file += "\t * **Additional Info**\n\t *\n"
            for (line in additionalInfo) {
                file += "\t * *$line*\n"
            }
        }
        file += "\t */\n"
        file += "\tval $name get() = GameValue<$type>(\"$id\")\n\n"
    } catch (e: Throwable) {
        println("something went wrong processing $value")
        e.printStackTrace()
    }
    file += "}"
    println(file)
    writeToDirFile("gen/gamevalue", "$className.kt", file)
}

enum class CodeBlock(val block: String, val shortName: String) {
    PlayerAction("PLAYER ACTION", "player_action"),
    EntityAction("ENTITY ACTION", "entity_action"),
    Control("CONTROL", "control"),
    GameAction("GAME ACTION", "game_action"),
    IfEntity("IF ENTITY", "if_entity"),
    IfGame("IF GAME", "if_game"),
    IfPlayer("IF PLAYER", "if_player"),
    IfVar("IF VARIABLE", "if_var"),
    Repeat("REPEAT", "repeat"),
    SetVariable("SET VARIABLE", "set_var"),
    PlayerEvent("PLAYER EVENT", "player_event"),
    EntityEvent("ENTITY EVENT", "entity_event"),
    SelectObject("SELECT OBJECT", "select");

    override fun toString(): String = name

    companion object {
        fun of(block: String) = entries.firstOrNull { it.block == block.trim() }
            ?: entries.firstOrNull { it.name == block.trim() }
            ?: entries.firstOrNull { it.shortName == block.trim() }
            ?: throw UnknownError("Unknown codeblock \"${block.trim()}\"")
    }
}

fun isSubActionCategory(codeblock: CodeBlock): Boolean =
    codeblock in listOf(
        CodeBlock.IfGame,
        CodeBlock.IfEntity,
        CodeBlock.IfVar,
        CodeBlock.IfPlayer
    )

fun typeToKType(type: String): String = when (type) {
    "NUMBER" -> "NumItem"
    "VARIABLE" -> "VarItem"
    "ITEM" -> "MinecraftItem"
    "BLOCK" -> "MinecraftItem"
    "PROJECTILE" -> "MinecraftItem"
    "SPAWN_EGG" -> "MinecraftItem"
    "ENTITY_TYPE" -> "MinecraftItem"
    "VEHICLE" -> "MinecraftItem"
    "BLOCK_TAG" -> "TextItem"
    "TEXT" -> "StringItem"
    "COMPONENT" -> "TextItem"
    "VECTOR" -> "VecItem"
    "SOUND" -> "SoundItem"
    "POTION" -> "PotionItem"
    "PARTICLE" -> "GenericItem"
    "LOCATION" -> "LocItem"
    "ANY_TYPE" -> "Item"
    "DICT" -> "VarItem"
    "LIST" -> "VarItem"
    else -> throw UnknownError("Unknown type $type")
}

fun actionNameToFunction(name: String): String {
    return name.replace(" ", "").replaceFirstChar { it.lowercase() }
}

fun removeClutter(str: String): String {
    return when (str) {
        "+" -> "plus"
        "-" -> "minus"
        "return" -> "returnFrom"
        "%" -> "mod"
        "/" -> "divide"
        "=" -> "equalTo"
        "+=" -> "increment"
        "-=" -> "decrement"
        "setAge/Size" -> "setAgeOrSize"
        "pFXLine[A]" -> "pFXLineA"
        "<=" -> "lessThanOrEqual"
        "legacy!=" -> "legacyNotEqual"
        "Legacy!=" -> "legacyNotEqual"
        "legacy=" -> "legacyEquals"
        "Legacy=" -> "legacyEquals"
        "!=" -> "notEqual"
        "<" -> "lessThan"
        ">" -> "greaterThan"
        ">=" -> "greaterThanOrEqual"
        "while" -> "whileLoop"
        else -> str.replace(Regex("§."), "").trim()
    }
}

fun enclosesCode(codeblock: CodeBlock): Boolean = when (codeblock) {
    CodeBlock.IfEntity -> true
    CodeBlock.IfPlayer -> true
    CodeBlock.IfVar -> true
    CodeBlock.IfGame -> true
    CodeBlock.Repeat -> true
    else -> false
}

fun negatable(codeblock: String, action: String): Boolean {
    if (codeblock.startsWith("If")) return true
    if (action == "whileLoop") return true
    return false
}

fun hasSubAction(obj: JsonObject): Boolean = obj.containsKey("subActionBlocks")

fun writeToDirFile(directories: String, fileName: String, text: String) {
    val path = Path(directories)
    if (!path.exists())
        path.createDirectories()
    val kFile = path.resolve(fileName).toFile()
    if (!kFile.exists())
        kFile.createNewFile()
    kFile.writeText(text)
}