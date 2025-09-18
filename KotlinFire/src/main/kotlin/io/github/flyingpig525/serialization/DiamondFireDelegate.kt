package io.github.flyingpig525.serialization

import io.github.flyingpig525.base.TemplateContext
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.type.NumItem
import io.github.flyingpig525.base.item.type.StringItem.Companion.stringItem
import io.github.flyingpig525.base.item.type.TextItem
import io.github.flyingpig525.base.item.type.VarClass
import io.github.flyingpig525.base.item.type.VarItem.Companion.toVarItem
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
class DiamondFireDelegate<T : VarClass<I>, I : Item> internal constructor(val type: KClass<I>, val name: String) {
    operator fun getValue(thisRef: DiamondFireClass, property: KProperty<*>): I {
        return when (type) {
            NumItem::class -> {
                NumItem("%dict(${thisRef.name}, $name)")
            }

            TextItem::class -> {
                TextItem("%dict(${thisRef.name}, $name)")
            }

            else -> throw RuntimeException("Unknown item type ${type.simpleName}")
        } as I
    }

    operator fun setValue(thisRef: DiamondFireClass, property: KProperty<*>, value: I) {
        TemplateContext.current.SetVariable.setDictValue {
            +thisRef.name.toVarItem(thisRef.scope)
            +name.stringItem
            +value
        }
    }

    operator fun setValue(thisRef: DiamondFireClass, property: KProperty<*>, value: T) {
        TemplateContext.current.SetVariable.setDictValue {
            +thisRef.name.toVarItem(thisRef.scope)
            +name.stringItem
            +value
        }
    }
}