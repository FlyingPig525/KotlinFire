package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.GlobalActionDump
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.*

class ProcessBlock(name: String = "PutNameHere", args: MutableList<Item>) : Block("process", args, name) {
    @OptIn(ExperimentalSerializationApi::class)
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("id", "block")
            put("block", codeBlock)
            putJsonObject("args") {
                putJsonArray("items") {
                    val tags = GlobalActionDump.getTags(this@ProcessBlock)
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