package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemComparison
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.NumItem.Companion.toNumItem
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/**
 * A DiamondFire number.
 *
 * Can be constructed through the class constructor, number extensions, or string extensions.
 *
 * For a DF variable containing this type, use [NumVariable].
 *
 * @see toNumItem
 * @see numItem
 * @see NumVariable
 */
class NumItem(val value: String) : Item(ID.NUMBER) {

    constructor(value: Number) : this(value.toString())

    override fun getJsonData() = buildJsonObject {
        put("name", value)
    }

    companion object {
        fun Number.toNumItem(): NumItem = NumItem(this)
        val Number.numItem get() = toNumItem()
        fun String.toNumItem(): NumItem = NumItem(this)
        val String.numItem get() = toNumItem()
        val NumVariable.numItem get() = "%var($name)".numItem
    }
}

@Suppress("NOTHING_TO_INLINE")
class NumVariable(name: String, scope: VarItem.Scope) : VarClass<NumItem>(name, scope, NumItem::class) {
    private fun lessThan(other: Insertable): ItemComparison {
        assertInsertable(other)
        return ItemComparison { not, nested ->
            IfVar.lessThan({
                +item
                +other
            }, not, nested)
        }
    }
    infix fun lessThan(other: NumVariable) = lessThan(other as Insertable)
    infix fun lessThan(other: NumItem) = lessThan(other as Insertable)
    infix fun lessThan(other: GameValue<NumItem>) = lessThan(other as Insertable)

    private fun lessThanOrEqual(other: Insertable): ItemComparison {
        assertInsertable(other)
        return ItemComparison { not, nested ->
            IfVar.lessThanOrEqual({
                +item
                +other
            }, not, nested)
        }
    }
    infix fun lessThanOrEqual(other: NumVariable) = lessThanOrEqual(other as Insertable)
    infix fun lessThanOrEqual(other: NumItem) = lessThanOrEqual(other as Insertable)
    infix fun lessThanOrEqual(other: GameValue<NumItem>) = lessThanOrEqual(other as Insertable)

    private fun greaterThan(other: Insertable): ItemComparison {
        assertInsertable(other)
        return ItemComparison { not, nested ->
            IfVar.greaterThan({
                +item
                +other
            }, not, nested)
        }
    }
    infix fun greaterThan(other: NumVariable) = greaterThan(other as Insertable)
    infix fun greaterThan(other: NumItem) = greaterThan(other as Insertable)
    infix fun greaterThan(other: GameValue<NumItem>) = greaterThan(other as Insertable)

    private fun greaterThanOrEqual(other: Insertable): ItemComparison {
        assertInsertable(other)
        return ItemComparison { not, nested ->
            IfVar.greaterThanOrEqual({
                +item
                +other
            }, not, nested)
        }
    }
    infix fun greaterThanOrEqual(other: NumVariable) = greaterThanOrEqual(other as Insertable)
    infix fun greaterThanOrEqual(other: NumItem) = greaterThanOrEqual(other as Insertable)
    infix fun greaterThanOrEqual(other: GameValue<NumItem>) = greaterThanOrEqual(other as Insertable)

    // +=
    context(_: Template)
    inline operator fun plusAssign(other: Number) = plusAssign(other.numItem)
    context(_: Template)
    inline operator fun plusAssign(other: String) = plusAssign(other.numItem)
    context(_: Template)
    inline operator fun plusAssign(other: NumVariable) = plusAssign(other.item)
    context(t: Template)
    inline operator fun plusAssign(other: NumItem) {
        t.SetVariable.increment {
            +item
            +other
        }
    }
    context(t: Template)
    inline operator fun plusAssign(other: VarItem) {
        t.SetVariable.increment {
            +item
            +other
        }
    }
    // -=
    context(_: Template)
    inline operator fun minusAssign(other: Number) = minusAssign(other.numItem)
    context(_: Template)
    inline operator fun minusAssign(other: String) = minusAssign(other.numItem)
    context(_: Template)
    inline operator fun minusAssign(other: NumVariable) = minusAssign(other.item)
    context(t: Template)
    inline operator fun minusAssign(other: NumItem) {
        t.SetVariable.decrement {
            +item
            +other
        }
    }
    context(t: Template)
    inline operator fun minusAssign(other: VarItem) {
        t.SetVariable.decrement {
            +item
            +other
        }
    }
    // /=
    context(_: Template)
    inline operator fun divAssign(other: Number) = divAssign(other.numItem)
    context(_: Template)
    inline operator fun divAssign(other: String) = divAssign(other.numItem)
    context(_: Template)
    inline operator fun divAssign(other: NumVariable) = divAssign(other.item)
    context(t: Template)
    inline operator fun divAssign(other: NumItem) {
        t.SetVariable.divide {
            +item
            +item
            +other
        }
    }
    context(t: Template)
    inline operator fun divAssign(other: VarItem) {
        t.SetVariable.divide {
            +item
            +item
            +other
        }
    }
    // *=
    context(_: Template)
    inline operator fun timesAssign(other: Number) = timesAssign(other.numItem)
    context(_: Template)
    inline operator fun timesAssign(other: String) = timesAssign(other.numItem)
    context(_: Template)
    inline operator fun timesAssign(other: NumVariable) = timesAssign(other.item)
    context(t: Template)
    inline operator fun timesAssign(other: NumItem) {
        t.SetVariable.x {
            +item
            +item
            +other
        }
    }
    context(t: Template)
    inline operator fun timesAssign(other: VarItem) {
        t.SetVariable.x {
            +item
            +item
            +other
        }
    }
    // %=
    context(_: Template)
    inline operator fun remAssign(other: Number) = remAssign(other.numItem)
    context(_: Template)
    inline operator fun remAssign(other: String) = remAssign(other.numItem)
    context(_: Template)
    inline operator fun remAssign(other: NumVariable) = remAssign(other.item)
    context(t: Template)
    inline operator fun remAssign(other: NumItem) {
        t.SetVariable.mod {
            +item
            +item
            +other
        }
    }
    context(t: Template)
    inline operator fun remAssign(other: VarItem) {
        t.SetVariable.mod {
            +item
            +item
            +other
        }
    }
    context(_: Template)
    inline operator fun unaryMinus() = "-%var($name)".numItem
}
