package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item

class StringItem(val text: String) : Item(ID.STRING), JsonData {

    constructor(text: Char) : this(text.toString())

    override fun getJsonData(): String = """
		{
			"name": "$text"
		}
	""".trimIndent()

    companion object {
        fun String.toStringItem(): StringItem = StringItem(this)
        val String.stringItem get() = toStringItem()
    }
}