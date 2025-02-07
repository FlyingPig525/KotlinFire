package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.GlobalActionDump
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.*

open class Block<T>(val codeBlock: String, var items: MutableList<T>, val action: String, private val extra: JsonObjectBuilder.() -> Unit = {}) :
    JsonData where T : Item, T : JsonData {
    init {
        var i = 0
        items = items.map { item ->
            val copy = i
            val newItem = item.apply {
                slot = copy
            }
            i++
            newItem
        }.toMutableList()

    }

    @OptIn(ExperimentalSerializationApi::class)
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("id", "block")
            put("block", codeBlock)
            putJsonObject("args") {
                putJsonArray("items") {
                    val tags = GlobalActionDump.getTags(this@Block)
                    val tagCount = tags.size
                    for ((i, item) in items.take(26-tagCount).withIndex()) {
                        add(Item.getItemJsonArgument(item, i))
                    }
                    addAll(tags)
                }
            }
            put("action", action)
            extra()
        }
//        var tags = ""
//        var string = """
//            {
//                "id": "block",
//                "block": "$codeBlock",
//                "args": {
//                    "items": [
//
//        """.trimIndent()
//        var i = 1
//        tags = GlobalActionDump.getTags(this)
//        val tagCount = GlobalActionDump.tagAmount(tags)
//        for (item in items.take(26-tagCount)) {
//            string += Item.getItemJsonArgument(item, i - 1)
//            if (items.size > i || tagCount != 0) string += ','
//            i++
//        }
//        string += tags
//
//        string += """
//                    ]
//                },
//                "action": "$action" ${if (extra != "") ", $extra" else ""}
//            }
//        """
//        return string
    }

}