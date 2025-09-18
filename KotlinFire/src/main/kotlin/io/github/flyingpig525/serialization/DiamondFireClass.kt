package io.github.flyingpig525.serialization

import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.type.NumItem
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.NumVariable
import io.github.flyingpig525.base.item.type.TextItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.textItem
import io.github.flyingpig525.base.item.type.TextVariable
import io.github.flyingpig525.base.item.type.VarItem

/**
 * @param [name] - The name of the variable that will hold this class. Will be defined as a dictionary.
 *
 * Should be extended to add properties delegated through [numProp], [textProp], and others.
 *
 * Before instance use, the variable must be initialized through [io.github.flyingpig525.base.Template.init]
 */
@DiamondFireClassOptIn
open class DiamondFireClass(val name: String, val scope: VarItem.Scope = VarItem.Scope.GAME) {
    internal val toInitialize: MutableMap<DiamondFireDelegate<*, *>, Item> = mutableMapOf()

    protected fun numProp(default: NumItem): DiamondFireDelegateProvider<NumVariable, NumItem> {
        return DiamondFireDelegateProvider(NumItem::class, default) as DiamondFireDelegateProvider<NumVariable, NumItem>
    }
    protected fun numProp(default: Int) = numProp(default.numItem)
    protected fun numProp(default: String) = numProp(default.numItem)
    protected fun numProp(default: NumVariable): DiamondFireDelegateProvider<NumVariable, NumItem> {
        return DiamondFireDelegateProvider(NumItem::class, default.item) as DiamondFireDelegateProvider<NumVariable, NumItem>
    }
    protected fun textProp(default: TextItem): DiamondFireDelegateProvider<TextVariable, TextItem> {
        return DiamondFireDelegateProvider(TextItem::class, default) as DiamondFireDelegateProvider<TextVariable, TextItem>
    }
    protected fun textProp(default: String) = textProp(default.textItem)
    protected fun textProp(default: TextVariable): DiamondFireDelegateProvider<TextVariable, TextItem> {
        return DiamondFireDelegateProvider(TextItem::class, default.item) as DiamondFireDelegateProvider<TextVariable, TextItem>
    }
}