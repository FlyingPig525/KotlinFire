@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.item.Item

class EventBlock<T>(val type: Type, event: String) :
    Block<T>("process", mutableListOf(), event) where T : Item, T : io.github.flyingpig525.base.JsonData {
    override fun getJsonData(): String {
        return """
            {
                "id": "block",
                "block": "$type",
                "args": {
                    "items": []
                },
                "action": "$action"
            }
        """
    }

    enum class Type(val type: String) {
        ENTITYEVENT("entity_event"),
        PLAYEREVENT("event");

        override fun toString(): String {
            return type
        }
    }

}