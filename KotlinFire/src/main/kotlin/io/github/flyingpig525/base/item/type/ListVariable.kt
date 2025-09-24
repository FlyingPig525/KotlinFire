package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.block.category.SetVariableCategory
import io.github.flyingpig525.base.item.ItemComparison
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.textItem

/**
 * A DiamondFire list.
 *
 * Can be constructed through the [listVarOf] and [emptyListVar] functions.
 *
 * Is represented in DF code as a normal variable, and all type-safety is compile-time only.
 */
class ListVariable internal constructor(name: String, scope: VarItem.Scope = VarItem.Scope.GAME) : VarClass<VarItem>(name, scope) {
    infix fun contains(value: Insertable) = ItemComparison { not, nested ->
        IfVar.listContains({
            +item
            +value
        }, not, nested)
    }
    infix fun contains(value: String) = contains(value.textItem)
    infix fun contains(value: Int) = contains(value.numItem)

    fun isEmpty() = ItemComparison { not, nested ->
        IfVar.listIsEmpty({
            +item
        }, not, nested)
    }

    fun valueEquals(index: NumItem, value: Insertable) = ItemComparison { not, nested ->
        IfVar.listValueEq({
            +item
            +index
            +value
        }, not, nested)
    }
    fun valueEquals(index: Int, value: Insertable) = valueEquals(index.numItem, value)
    fun valueEquals(index: NumVariable, value: Insertable) = valueEquals(index.numItem, value)
}

// TODO: if [items] is too long, split into multiple appends
/**
 * Creates a [ListVariable] through inserting a [SetVariableCategory.createList] call
 */
fun Template.listVarOf(name: String, scope: VarItem.Scope, vararg items: Insertable): ListVariable {
    val list = ListVariable(name, scope)
    SetVariable.createList {
        +list
        for (i in items) {
            +i
        }
    }
    return list
}
/**
 * Creates a [ListVariable] through inserting a [SetVariableCategory.createList] call
 */
fun Template.emptyListVar(name: String, scope: VarItem.Scope): ListVariable {
    val list = ListVariable(name, scope)
    SetVariable.createList {
        +list
    }
    return list
}