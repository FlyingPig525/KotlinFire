package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.type.tag.TagItem
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.*

open class Block(val codeBlock: String, var items: MutableList<Insertable>, val action: String, private val extra: JsonObjectBuilder.() -> Unit = {}) : JsonData {
    init {
        var i = 0
        items = items.map { item ->
            if (item !is Item) return@map item
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
                    for ((i, item) in items.withIndex()) {
                        if (item is TagItem) {
                            add(item.getJsonData())
                        } else if (item is Item) {
                            add(Item.getItemJsonArgument(item, i))
                        }
                    }
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