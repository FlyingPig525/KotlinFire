package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item

class NumItem(private val value: Float) : Item(ID.NUMBER), JsonData {

    constructor(value: Int) : this(value.toFloat())

    override fun getJsonData(): String = """
		{
			"name": "$value"
		}
	""".trimIndent()

    companion object {
        fun Number.toNumItem(): NumItem = NumItem(this.toFloat())
    }
}