@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.*

class EventBlock<T : Item>(val type: Type, event: String) :
    Block<T>("process", mutableListOf(), event) {
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
        EntityEvent("entity_event"),
        PlayerEvent("event");

        override fun toString(): String {
            return type
        }
    }

}