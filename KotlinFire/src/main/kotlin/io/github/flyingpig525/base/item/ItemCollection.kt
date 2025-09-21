package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.type.NumItem
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.textItem
import io.github.flyingpig525.base.item.type.VarClass

/**
 * A class used as context to allow inserting items into codeblocks.
 */
class ItemCollection internal constructor(func: ItemCollection.() -> Unit) {
    val items: MutableList<Item> = mutableListOf()

    init {
        apply(func)
    }

    operator fun String.unaryPlus() = also { addItem(textItem) }
    operator fun Insertable.unaryPlus() = also {
        if (this is Item) {
            addItem(this)
        } else if (this is VarClass<*>) {
            addItem(item)
        }
    }

    fun addItem(item: Item) {
        items += item.apply {
            slot = items.size
        }
    }

    operator fun plusAssign(item: Item) {
        items += item.apply {
            slot = items.size
        }
    }

    operator fun get(index: Int) = items[index]
}