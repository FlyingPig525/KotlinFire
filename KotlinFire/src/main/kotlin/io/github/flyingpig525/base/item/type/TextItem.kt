package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item

class TextItem(val text: String) : Item(ID.RICHTEXT), JsonData {
    constructor(text: Char) : this(text.toString())

    override fun getJsonData(): String = """
		{
			"name": "$text"
		}
	""".trimIndent()

    companion object {
        fun String.toTextItem(): TextItem = TextItem(this)
    }
}