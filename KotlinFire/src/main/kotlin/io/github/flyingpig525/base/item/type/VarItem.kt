package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemComparison
import io.github.flyingpig525.base.item.type.StringItem.Companion.stringItem
import io.github.flyingpig525.base.item.type.StringItem.Companion.toStringItem
import io.github.flyingpig525.base.item.type.VarItem.Companion.toVarItem
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
import kotlin.reflect.KClass
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty0

/**
 * A DiamondFire variable.
 *
 * Can be constructed through the class constructor or the String extensions.
 *
 * The [Scope] of a variable defines when it is destroyed to free memory. Each value represents a different life cycle.
 *
 * For a DF variable containing no specific type, use [VarClass] with a type parameter of [Item]
 *
 * @see toVarItem
 * @see gameVar
 * @see saveVar
 * @see localVar
 * @see lineVar
 * @see Scope
 * @see VarClass
 */
class VarItem(val name: String, val scope: Scope = Scope.GAME) : Item(ID.VAR) {
    enum class Scope(private val value: String) {
        /**
         * Variables with this scope are destroyed when the plot no longer has any players.
         */
        GAME("unsaved"),

        /**
         * Variables with this scope are destroyed when the original caller of this template (and all processes)
         * complete execution.
         */
        LOCAL("local"),

        /**
         * Values set to variables with this scope are saved (hence the name) and not destroyed.
         */
        SAVE("saved"),

        /**
         * Variables with this scope are destroyed when the current template finished execution, and are private to this
         * specific "line" of codeblocks.
         */
        LINE("line");

        override fun toString(): String = value
    }

    override fun getJsonData() = buildJsonObject {
        put("name", name)
        put("scope", scope.toString())
    }

    override fun toString(): String {
        return "%var($name)"
    }

    companion object {
        fun String.toVarItem(scope: Scope = Scope.GAME): VarItem = VarItem(this, scope)

        /**
         * @see Scope.GAME
         */
        val String.gameVar get() = toVarItem()

        /**
         * @see Scope.SAVE
         */
        val String.saveVar get() = toVarItem(Scope.SAVE)

        /**
         * @see Scope.LOCAL
         */
        val String.localVar get() = toVarItem(Scope.LOCAL)

        /**
         * @see Scope.LINE
         */
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