package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

class TextItem(val text: String) : Item(ID.RICHTEXT), JsonData {
    constructor(text: Char) : this(text.toString())

    override fun getJsonData() = buildJsonObject {
        put("name", text)
    }
//        """
//		{
//			"name": "$text"
//		}
//	""".trimIndent()

    companion object {
        fun String.toTextItem(): TextItem = TextItem(this)
        val String.textItem get() = toTextItem()
    }
}