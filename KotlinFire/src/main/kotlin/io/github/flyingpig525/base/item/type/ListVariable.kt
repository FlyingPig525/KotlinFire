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

    context(t: Template)
    inline operator fun set(index: NumItem, value: Insertable) {
        t.SetVariable.setListValue {
            +item
            +index
            +value
        }
    }
    context(_: Template)
    inline operator fun set(index: Int, value: Insertable) = set(index.numItem, value)
    context(_: Template)
    inline operator fun set(index: Int, value: String) = set(index, value.textItem)
    context(_: Template)
    inline operator fun set(index: Int, value: Number) = set(index, value.numItem)
    context(_: Template)
    inline operator fun set(index: NumItem, value: String) = set(index, value.textItem)
    context(_: Template)
    inline operator fun set(index: NumItem, value: Number) = set(index, value.numItem)
    context(_: Template)
    inline operator fun set(index: NumVariable, value: String) = set(index.numItem, value.textItem)
    context(_: Template)
    inline operator fun set(index: NumVariable, value: Number) = set(index.numItem, value.numItem)

    context(_: Template)
    inline operator fun get(index: NumVariable): String = "%index($name,%var(${index.name})"
    context(_: Template)
    inline operator fun get(index: NumItem): String = "%index($name,${index.value})"
    context(_: Template)
    inline operator fun get(index: Int): String = get(index.numItem)

    context(t: Template)
    inline operator fun plusAssign(value: Insertable) {
        t.SetVariable.appendValue {
            +item
            +value
        }
    }

    context(t: Template)
    inline operator fun minusAssign(value: Insertable) {
        t.SetVariable.removeListValue {
            +item
            +value
        }
    }

    context(t: Template)
    inline fun getAsVariable(index: NumItem, scope: VarItem.Scope = VarItem.Scope.LINE): VarItem {
        val i = VarItem("$name-GeneratedGet-${index.value}-aiwhdoaiuhdioa", scope)
        t.SetVariable.getListValue {
            +i
            +item
            +index
        }
        return i
    }
    context(t: Template)
    inline fun getAsVariable(index: Int, scope: VarItem.Scope = VarItem.Scope.LINE): VarItem {
        val i = VarItem("$name-GeneratedGet-$index-aiwhdoaiuhdioa", scope)
        t.SetVariable.getListValue {
            +i
            +item
            +index.numItem
        }
        return i
    }
    context(t: Template)
    inline fun getAsVariable(index: NumVariable, scope: VarItem.Scope = VarItem.Scope.LINE): VarItem {
        val i = VarItem("$name-GeneratedGet-%var(${index.name})-aiwhdoaiuhdioa", scope)
        t.SetVariable.getListValue {
            +i
            +item
            +index
        }
        return i
    }

    context(t: Template)
    inline fun flatten() = apply {
        t.SetVariable.flattenList {
            +item
        }
    }
    context(t: Template)
    inline fun flatten(out: ListVariable) {
        t.SetVariable.flattenList {
            +out
            +item
        }
    }

    // TODO: separate into multiple appends if [values] is too long
    context(t: Template)
    inline fun append(vararg values: Insertable) = apply {
        t.SetVariable.appendValue {
            +item
            for (i in values) {
                +i
            }
        }
    }

    context(t: Template)
    inline fun appendAll(value: ListVariable) = apply {
        t.SetVariable.appendList {
            +item
            +value
        }
    }

    context(t: Template)
    inline fun dedup() = apply {
        t.SetVariable.dedupList {
            +item
        }
    }
    context(t: Template)
    inline fun dedup(out: ListVariable) {
        t.SetVariable.dedupList {
            +out
            +item
        }
    }

    context(t: Template)
    inline fun reverse() = apply {
        t.SetVariable.reverseList {
            +item
        }
    }
    context(t: Template)
    inline fun reverse(out: ListVariable) {
        t.SetVariable.reverseList {
            +out
            +item
        }
    }

    context(t: Template)
    inline fun randomize() = apply {
        t.SetVariable.randomizeList {
            +item
            +item
        }
    }
    context(t: Template)
    inline fun randomize(out: ListVariable) {
        t.SetVariable.randomizeList {
            +out
            +item
        }
    }

    context(t: Template)
    inline fun trim(startIndex: NumItem, endIndex: NumItem) = apply {
        t.SetVariable.trimList {
            +item
            +startIndex
            +endIndex
        }
    }
    context(_: Template)
    inline fun trim(startIndex: Int, endIndex: Int) =
        trim(startIndex.numItem, endIndex.numItem)
    context(_: Template)
    inline fun trim(startIndex: NumVariable, endIndex: NumVariable) =
        trim(startIndex.numItem, endIndex.numItem)
    context(t: Template)
    inline fun trim(startIndex: NumItem, endIndex: NumItem, out: ListVariable) = apply {
        t.SetVariable.trimList {
            +out
            +item
            +startIndex
            +endIndex
        }
    }
    context(_: Template)
    inline fun trim(startIndex: Int, endIndex: Int, out: ListVariable) =
        trim(startIndex.numItem, endIndex.numItem, out)
    context(_: Template)
    inline fun trim(startIndex: NumVariable, endIndex: NumVariable, out: ListVariable) =
        trim(startIndex.numItem, endIndex.numItem, out)

    context(t: Template)
    inline fun sort() = apply {
        t.SetVariable.sortList {
            +item
        }
    }
    context(t: Template)
    inline fun sort(out: ListVariable) {
        t.SetVariable.sortList {
            +out
            +item
        }
    }

    context(t: Template)
    inline fun removeIndex(index: NumItem) = apply {
        t.SetVariable.removeListIndex {
            +item
            +index
        }
    }
    context(_: Template)
    inline fun removeIndex(index: Int) = removeIndex(index.numItem)
    context(_: Template)
    inline fun removeIndex(index: NumVariable) = removeIndex(index.numItem)

    context(t: Template)
    inline fun removeValue(value: Insertable) = apply {
        t.SetVariable.removeListValue {
            +item
            +value
        }
    }

    context(t: Template)
    inline fun pop(
        index: NumItem,
        out: VarItem = VarItem("$name-${index.value}-PopValue", VarItem.Scope.LINE)
    ): VarItem {
        t.SetVariable.popListValue {
            +out
            +item
            +index
        }
        return out
    }
    context(_: Template)
    inline fun pop(
        index: Int,
        out: VarItem = VarItem("$name-$index-PopValue", VarItem.Scope.LINE)
    ) = pop(index.numItem, out)
    context(_: Template)
    inline fun pop(
        index: NumVariable,
        out: VarItem = VarItem("$name-%var(${index.name})-PopValue", VarItem.Scope.LINE)
    ) = pop(index.numItem, out)

    context(t: Template)
    inline val size: NumItem get() {
        val i = VarItem("$name-ListLength-auhdoiwauhisd", VarItem.Scope.LINE)
        t.SetVariable.listLength {
            +i
            +item
        }
        return "%var(${i.name})".numItem
    }
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