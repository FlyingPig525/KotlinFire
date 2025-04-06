package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.JsonData

class ItemCollection<T : Item>(func: ItemCollection<T>.() -> Unit) {
    val items: MutableList<T> = mutableListOf()

    init {
        apply(func)
    }

    operator fun T.unaryPlus() = also { addItem(it) }

    fun addItem(item: T) {
        items += item.apply {
            slot = items.size
        }
    }

    operator fun plusAssign(item: T) {
        items += item.apply {
            slot = items.size
        }
    }

    operator fun get(index: Int) = items[index]
}