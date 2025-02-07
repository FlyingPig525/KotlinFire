package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

class NumItem(private val value: Double) : Item(ID.NUMBER), JsonData {

    constructor(value: Int) : this(value.toDouble())

    override fun getJsonData() = buildJsonObject {
        put("name", value)
    }
//        """
//		{
//			"name": "$value"
//		}
//	""".trimIndent()

    companion object {
        fun Number.toNumItem(): NumItem = NumItem(this.toDouble())
        val Number.numItem get() = toNumItem()
    }
}