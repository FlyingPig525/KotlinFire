package io.github.flyingpig525.serialization

import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.type.LocItem
import io.github.flyingpig525.base.item.type.LocItem.Companion.toLocItem
import io.github.flyingpig525.base.item.type.LocVariable
import io.github.flyingpig525.base.item.type.MinecraftItem
import io.github.flyingpig525.base.item.type.MinecraftItem.Companion.mcItem
import io.github.flyingpig525.base.item.type.NumItem
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.NumVariable
import io.github.flyingpig525.base.item.type.PotionItem
import io.github.flyingpig525.base.item.type.SoundItem
import io.github.flyingpig525.base.item.type.SoundItem.Companion.soundItem
import io.github.flyingpig525.base.item.type.StringItem
import io.github.flyingpig525.base.item.type.StringItem.Companion.stringItem
import io.github.flyingpig525.base.item.type.StringVariable
import io.github.flyingpig525.base.item.type.TextItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.textItem
import io.github.flyingpig525.base.item.type.TextVariable
import io.github.flyingpig525.base.item.type.VarClass
import io.github.flyingpig525.base.item.type.VarItem
import io.github.flyingpig525.base.item.type.VecItem
import io.github.flyingpig525.base.item.type.VecItem.Companion.toVecItem
import io.github.flyingpig525.base.item.type.VecVariable

private typealias Provider<T, I> = DiamondFireDelegateProvider<T, I>

/**
 * @param [name] - The name of the variable that will hold this class. Will be defined as a dictionary.
 *
 * Should be extended to add properties delegated through [numProp], [textProp], and others. These will be accessible
 * in DiamondFire when generated code runs.
 *
 * Before instance use, the variable must be initialized through [io.github.flyingpig525.base.Template.init]
 */
@DiamondFireClassOptIn
open class DiamondFireClass(val name: String, val scope: VarItem.Scope = VarItem.Scope.GAME) {
    internal val toInitialize: MutableMap<DiamondFireDelegate<*, *>, Item> = mutableMapOf()

    protected fun numProp(default: NumItem): Provider<NumVariable, NumItem> {
        return Provider(NumItem::class, default)
    }
    protected fun numProp(default: Int) = numProp(default.numItem)
    protected fun numProp(default: String) = numProp(default.numItem)
    protected fun numProp(default: NumVariable): Provider<NumVariable, NumItem> {
        return Provider(NumItem::class, default.item)
    }

    protected fun textProp(default: TextItem): Provider<TextVariable, TextItem> {
        return Provider(TextItem::class, default)
    }
    protected fun textProp(default: String) = textProp(default.textItem)
    protected fun textProp(default: TextVariable): Provider<TextVariable, TextItem> {
        return Provider(TextItem::class, default.item)
    }

    protected fun itemProp(default: MinecraftItem): Provider<VarClass<MinecraftItem>, MinecraftItem> {
        return Provider(MinecraftItem::class, default)
    }
    protected fun itemProp(default: String) = itemProp(default.mcItem)

    protected fun soundProp(default: SoundItem): Provider<VarClass<SoundItem>, SoundItem> {
        return Provider(SoundItem::class, default)
    }
    protected fun soundProp(default: String) = soundProp(default.soundItem)

    protected fun stringProp(default: StringItem): Provider<StringVariable, StringItem> {
        return Provider(StringItem::class, default)
    }
    protected fun stringProp(default: String) = stringProp(default.stringItem)
    protected fun stringProp(default: StringVariable): Provider<StringVariable, StringItem> {
        return Provider(StringItem::class, default.item)
    }

    protected fun locProp(default: LocItem): Provider<LocVariable, LocItem> {
        return Provider(LocItem::class, default)
    }
    protected fun locProp(default: List<Number>) = locProp(default.toLocItem() ?: throw DiamondFireClassDefaultException())
    protected fun locProp(default: LocVariable): Provider<LocVariable, LocItem> {
        return Provider(LocItem::class, default.item)
    }

    protected fun vecProp(default: VecItem): Provider<VecVariable, VecItem> {
        return Provider(VecItem::class, default)
    }
    protected fun vecProp(default: List<Number>) = vecProp(default.toVecItem() ?: throw DiamondFireClassDefaultException())
    protected fun vecProp(default: VecVariable): Provider<VecVariable, VecItem> {
        return Provider(VecItem::class, default.item)
    }

    protected fun potionProp(default: PotionItem): Provider<VarClass<PotionItem>, PotionItem> {
        return Provider(PotionItem::class, default)
    }

    class DiamondFireClassDefaultException : Exception("Invalid default input for DiamondFireClass delegated property")
}