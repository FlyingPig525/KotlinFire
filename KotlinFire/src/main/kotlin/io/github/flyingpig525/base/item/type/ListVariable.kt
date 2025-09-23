package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.block.category.SetVariableCategory

/**
 * A DiamondFire list.
 *
 * Can be constructed through the [listVarOf] and [emptyListVar] functions.
 *
 * Is represented in DF code as a normal variable, and all type-safety is compile-time only.
 */
class ListVariable internal constructor(name: String, scope: VarItem.Scope = VarItem.Scope.GAME) : VarClass<VarItem>(name, scope)

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