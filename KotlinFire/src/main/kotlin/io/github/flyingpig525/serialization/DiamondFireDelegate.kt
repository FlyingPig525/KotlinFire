package io.github.flyingpig525.serialization

import com.sun.jdi.InvalidTypeException
import io.github.flyingpig525.base.TemplateContext
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.type.LocItem
import io.github.flyingpig525.base.item.type.MinecraftItem
import io.github.flyingpig525.base.item.type.NumItem
import io.github.flyingpig525.base.item.type.PotionItem
import io.github.flyingpig525.base.item.type.SoundItem
import io.github.flyingpig525.base.item.type.StringItem
import io.github.flyingpig525.base.item.type.StringItem.Companion.stringItem
import io.github.flyingpig525.base.item.type.TextItem
import io.github.flyingpig525.base.item.type.VarClass
import io.github.flyingpig525.base.item.type.VarItem
import io.github.flyingpig525.base.item.type.VarItem.Companion.toVarItem
import io.github.flyingpig525.base.item.type.VecItem
import kotlinx.coroutines.runBlocking
import java.io.InvalidClassException
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

@OptIn(DiamondFireClassOptIn::class)
class DiamondFireDelegateProvider<T : VarClass<I>, I : Item> internal constructor(val type: KClass<I>, val default: Item) {
    operator fun provideDelegate(thisRef: DiamondFireClass, property: KProperty<*>) : DiamondFireDelegate<T, I> {
        val delegate = DiamondFireDelegate<T, I>(type, property.name)
        thisRef.toInitialize[delegate] = default
        return delegate
    }
}

@OptIn(DiamondFireClassOptIn::class)
class DiamondFireDelegate<T : VarClass<*>, I : Item> internal constructor(val type: KClass<I>, val name: String) {
    operator fun getValue(thisRef: DiamondFireClass, property: KProperty<*>): I {
        return when (type) {
            NumItem::class -> {
                NumItem("%entry(${thisRef.name},$name)")
            }

            TextItem::class -> {
                TextItem("%entry(${thisRef.name},$name)")
            }

            StringItem::class -> {
                StringItem("%entry(${thisRef.name},$name")
            }

            SoundItem::class -> {
                insertDictGetCodeblock(thisRef)
            }
            MinecraftItem::class -> {
                insertDictGetCodeblock(thisRef)
            }
            LocItem::class -> {
                insertDictGetCodeblock(thisRef)
            }
            VecItem::class -> {
                insertDictGetCodeblock(thisRef)
            }
            PotionItem::class -> {
                insertDictGetCodeblock(thisRef)
            }

            else -> throw RuntimeException("Unknown item type ${type.simpleName}")
        } as I
    }

    private fun insertDictGetCodeblock(thisRef: DiamondFireClass): I {
        val item = VarItem("${thisRef.name}-$name-ValueGenerated-Line", VarItem.Scope.LINE) as? I ?: throw InvalidTypeException()
        TemplateContext.current.SetVariable.getDictValue {
            +item
            +thisRef.name.toVarItem(thisRef.scope)
            +name.stringItem
        }
        return item
    }

    operator fun setValue(thisRef: DiamondFireClass, property: KProperty<*>, value: I) {
        TemplateContext.current.SetVariable.setDictValue {
            +thisRef.name.toVarItem(thisRef.scope)
            +name.stringItem
            +value
        }
    }
}