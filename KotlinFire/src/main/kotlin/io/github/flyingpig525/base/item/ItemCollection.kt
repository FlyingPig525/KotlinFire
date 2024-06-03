package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.type.TextItem.Companion.toTextItem

class ItemCollection<T>(func: ItemCollection<T>.() -> Unit) where T : Item, T : JsonData {
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