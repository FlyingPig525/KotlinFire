package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemComparison
import io.github.flyingpig525.base.item.type.VarItem.Companion.toVarItem
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
import kotlin.reflect.KClass
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty0

/*
    "item": {
        "id": "var",
        "data": {
            "name": "%uuid hand value",
            "scope": "unsaved"
        }
    }
 */
class VarItem(val name: String, val scope: Scope = Scope.GAME) : Item(ID.VAR) {
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

open class VarClass<T : Item>(val name: String, scope: VarItem.Scope, internal vararg val permittedTypes: KClass<*>) : Insertable {
    val item = name.toVarItem(scope)

    private fun equalTo(other: Insertable): ItemComparison {
        assertInsertable(other)
        return ItemComparison { not, nested ->
            IfVar.equalTo({
                +item
                +other
            }, not, nested)
        }
    }
    infix fun equalTo(other: VarClass<T>): ItemComparison = equalTo(other as Insertable)
    infix fun equalTo(other: T): ItemComparison = equalTo(other as Insertable)
    infix fun equalTo(other: GameValue<T>): ItemComparison = equalTo(other as Insertable)

    fun exists(): ItemComparison = ItemComparison { not, nested ->
        IfVar.varExists({
            +item
        }, not, nested)
    }

    companion object {
        @OptIn(ExperimentalContracts::class)
        internal fun assertInsertable(o: Insertable) {
            contract {
                returns() implies(o is VarClass<*> || o is Item)
            }
            if (o !is VarClass<*> && o !is Item) throw IllegalArgumentException("this should never happen, other is type ${o::class.simpleName}")
        }
    }
}