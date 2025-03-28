package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/*
    "item": {
        "id": "var",
        "data": {
            "name": "%uuid hand value",
            "scope": "unsaved"
        }
    }
 */
class VarItem(val name: String, val scope: Scope = Scope.GAME) : Item(ID.VAR),
    JsonData {
    enum class Scope(private val value: String) {
        GAME("unsaved"),
        LOCAL("local"),
        SAVE("saved"),
        LINE("line");

        override fun toString(): String = value
    }

    override fun getJsonData() = buildJsonObject {
        put("name", name)
        put("scope", scope.toString())
    }
//        """
//        {
//        "name": "$name",
//        "scope": "$scope"
//        }
//    """.trimIndent()

    override fun toString(): String {
        return "%var($name)"
    }

    companion object {
        fun String.toVarItem(scope: Scope = Scope.GAME): VarItem = VarItem(this, scope)
        val String.gameVar get() = toVarItem()
        val String.saveVar get() = toVarItem(Scope.SAVE)
        val String.localVar get() = toVarItem(Scope.LOCAL)
        val String.lineVar get() = toVarItem(Scope.LINE)
    }
}