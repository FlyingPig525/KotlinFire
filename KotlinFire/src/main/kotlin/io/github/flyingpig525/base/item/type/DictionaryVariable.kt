package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.ItemComparison
import io.github.flyingpig525.base.item.type.StringItem.Companion.stringItem

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
}