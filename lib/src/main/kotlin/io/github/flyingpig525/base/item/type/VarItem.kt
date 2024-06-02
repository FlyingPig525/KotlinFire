package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item

/*
    "item": {
        "id": "var",
        "data": {
            "name": "%uuid hand value",
            "scope": "unsaved"
        }
    }
 */
class VarItem(val name: String, val scope: Scope) : Item(ID.VAR), JsonData {
    enum class Scope(private val value: String) {
        GAME("unsaved"),
        LOCAL("local"),
        SAVE("saved"),
        LINE("line");

        override fun toString(): String = value
    }

    override fun getJsonData(): String = """
        {
        "name": "$name",
        "scope": "$scope"
        }
    """.trimIndent()
}