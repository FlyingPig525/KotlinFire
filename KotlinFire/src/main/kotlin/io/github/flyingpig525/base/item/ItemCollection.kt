package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.item.type.TextItem.Companion.textItem
import io.github.flyingpig525.base.item.type.VarClass
import io.github.flyingpig525.base.item.type.tag.TagItem

/**
 * A class used as context to allow inserting items into codeblocks.
 */
class ItemCollection internal constructor(func: ItemCollection.() -> Unit) {
    val items: MutableList<Insertable> = mutableListOf()

    init {
        apply(func)
    }

    operator fun String.unaryPlus() = also { addItem(textItem) }
    operator fun Insertable.unaryPlus() = also {
        if (this is Item) {
            addItem(this)
        } else if (this is VarClass<*>) {
            addItem(item)
        } else if (this is TagItem) {
            addItem(this)
        }
    }

    fun addItem(item: Item) {
        items += item.apply {
            if (item is TagItem) {
                slot = 26 - items.count { it is TagItem }
            } else {
                slot = items.size
            }
        }
    }

    private fun addItem(tag: TagItem) {
        items += tag.apply {
            slot = 26 - items.count { it is TagItem }
        }
    }

    operator fun plusAssign(item: Insertable) { item.unaryPlus() }

    operator fun get(index: Int) = items[index]
}