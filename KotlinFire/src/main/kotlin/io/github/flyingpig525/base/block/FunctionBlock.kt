package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.GlobalActionDump
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.*

class FunctionBlock<T : Item>(name: String = "PutNameHere", items: MutableList<T>) : Block<T>("func", items, name) {
    @OptIn(ExperimentalSerializationApi::class)
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("id", "block")
            put("block", codeBlock)
            putJsonObject("args") {
                putJsonArray("items") {
                    val tags = GlobalActionDump.getTags(this@FunctionBlock)
                    val tagCount = tags.size
                    for ((i, item) in items.take(26-tagCount).withIndex()) {
                        add(Item.getItemJsonArgument(item, i))
                    }
                    addAll(tags)
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