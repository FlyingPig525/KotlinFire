package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.*

class FunctionBlock<T>(name: String = "PutNameHere") :
    Block<T>("func", mutableListOf(), name) where T : Item, T : JsonData {
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("id", "block")
            put("block", codeBlock)
            putJsonObject("args") {
                putJsonArray("items") {}
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