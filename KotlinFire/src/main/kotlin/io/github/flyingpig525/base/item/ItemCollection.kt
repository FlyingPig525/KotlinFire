package io.github.flyingpig525.base.item

class ItemCollection<T>(func: ItemCollection<T>.() -> Unit) where T : Item, T : io.github.flyingpig525.base.JsonData {
    val items: MutableList<T> = mutableListOf()

    init {
        apply(func)
    }

    operator fun T.unaryPlus() = also { addItem(it) }

    private fun addItem(item: T) {
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