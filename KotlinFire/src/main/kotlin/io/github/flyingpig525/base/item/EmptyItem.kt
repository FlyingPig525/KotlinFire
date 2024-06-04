package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.JsonData

object EmptyItem : Item(ID.ITEM), JsonData {
	override fun getJsonData(): String {
		TODO("This should never be called.")
	}
}