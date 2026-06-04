package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.type.tag.TagItem
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.*

class FunctionBlock(name: String = "PutNameHere", items: MutableList<Insertable>) : Block("func", items, name) {
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
            put("data", action)
        }
//        return """
//            {
//                "id": "block",
//                "block": "$codeBlock",
//                "args": {
//                    "items": [
//                    ]
//                },
//                "data": "$action"
//            }
//        """
    }
}