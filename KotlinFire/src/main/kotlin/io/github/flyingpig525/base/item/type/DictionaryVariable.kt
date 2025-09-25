@file:Suppress("NOTHING_TO_INLINE")

package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.ItemComparison
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.StringItem.Companion.stringItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.textItem

class DictionaryVariable(name: String, scope: VarItem.Scope) : VarClass<VarItem>(name, scope, VarItem::class) {
    infix fun containsKey(key: String) = containsKey_(key.stringItem)
    infix fun containsKey(key: StringItem) = containsKey_(key)
    infix fun containsKey(key: VarItem) = containsKey_(key)
    infix fun containsKey(key: StringVariable) = containsKey_(key)
    infix fun containsKey(key: GameValue<StringItem>) = containsKey_(key)
    private fun containsKey_(key: Insertable) = ItemComparison { not, nested ->
        IfVar.dictHasKey({
            +item
            +key
        }, not, nested)
    }

    fun valueEquals(key: VarItem, vararg values: Insertable) = valueEquals("%var(${key.name})".stringItem, *values)
    fun valueEquals(key: String, vararg values: Insertable) = valueEquals(key.stringItem, *values)
    fun valueEquals(key: StringVariable, vararg values: Insertable) = valueEquals(key.stringItem, *values)
    fun valueEquals(key: StringItem, vararg values: Insertable) = ItemComparison { not, nested ->
        IfVar.dictValueEquals({
            +item
            +key
            for (i in values) {
                +i
            }
        }, not, nested)
    }

    context(t: Template)
    inline operator fun set(key: StringItem, value: Insertable) {
        t.SetVariable.setDictValue {
            +key
            +value
        }
    }
    context(_: Template)
    inline operator fun set(key: String, value: Insertable) = set(key.stringItem, value)
    context(_: Template)
    inline operator fun set(key: String, value: String) = set(key, value.textItem)
    context(_: Template)
    inline operator fun set(key: String, value: Number) = set(key, value.numItem)
    context(_: Template)
    inline operator fun set(key: StringVariable, value: Insertable) = set(key.stringItem, value)
    context(_: Template)
    inline operator fun set(key: StringVariable, value: String) = set(key.stringItem, value.textItem)
    context(_: Template)
    inline operator fun set(key: StringVariable, value: Number) = set(key.stringItem, value.numItem)

    /**
     * Should only be used when the type expected is string, text, or number.
     */
    context(_: Template)
    inline operator fun get(key: String): String = "%entry($name,$key)"
    context(_: Template)
    inline operator fun get(key: StringVariable): String = "%entry($name,%var(${key.name})"
    context(_: Template)
    inline operator fun get(key: StringItem): String = "%entry($name,${key.text})"
    context(_: Template)
    inline fun getAsVariable(key: String, scope: VarItem.Scope = VarItem.Scope.LINE): VarItem = getAsVariable(key.stringItem, scope)
    context(t: Template)
    inline fun getAsVariable(key: StringVariable, scope: VarItem.Scope = VarItem.Scope.LINE): VarItem {
        val i = VarItem("$name-%var(${key.name})-GeneratedGet-oajwkfnvsiuh", scope)
        t.SetVariable.getDictValue {
            +i
            +item
            +key
        }
        return i
    }
    context(t: Template)
    inline fun getAsVariable(key: StringItem, scope: VarItem.Scope = VarItem.Scope.LINE): VarItem {
        val i = VarItem("$name-${key.text}-GeneratedGet-oajwkfnvsiuh", scope)
        t.SetVariable.getDictValue {
            +i
            +item
            +key
        }
        return i
    }
}