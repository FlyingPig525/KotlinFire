package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.JsonData

class TextItem(val text: String) : Item(ID.RICHTEXT), JsonData {
	constructor(text: Char) : this(text.toString())

	override fun getJsonData(): String = """
		{
			"name": $text
		}
	""".trimIndent()

	fun String.toTextItem(): TextItem = TextItem(this)
}