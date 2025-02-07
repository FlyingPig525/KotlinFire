@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.*

class EventBlock<T>(val type: Type, event: String) :
    Block<T>("process", mutableListOf(), event) where T : Item, T : JsonData {
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("id", "block")
            put("block", type.toString())
            putJsonObject("args") {
                putJsonArray("items") {}
            }
            put("action", action)
        }
//        return """
//            {
//                "id": "block",
//                "block": "$type",
//                "args": {
//                    "items": []
//                },
//                "action": "$action"
//            }
//        """
    }

    enum class Type(val type: String) {
        ENTITYEVENT("entity_event"),
        PLAYEREVENT("event");

        override fun toString(): String {
            return type
        }
    }

}