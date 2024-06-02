package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.JsonData

class NumItem(private val value: Float) : Item(ID.NUMBER), JsonData {

	constructor(value: Int) : this(value.toFloat())

	override fun getJsonData(): String = """
		{
			"name": $value
		}
	""".trimIndent()

	fun Number.toNumItem(): NumItem = NumItem(this.toFloat())
}