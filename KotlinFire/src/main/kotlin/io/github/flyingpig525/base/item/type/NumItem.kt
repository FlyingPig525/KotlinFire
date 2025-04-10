package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

class NumItem(private val value: String) : Item(ID.NUMBER) {

    constructor(value: Number) : this(value.toString())

    override fun getJsonData() = buildJsonObject {
        put("name", value)
    }
//        """
//		{
//			"name": "$value"
//		}
//	""".trimIndent()

    companion object {
        fun Number.toNumItem(): NumItem = NumItem(this)
        val Number.numItem get() = toNumItem()
        fun String.toNumItem(): NumItem = NumItem(this)
        val String.numItem get() = toNumItem()
    }
}