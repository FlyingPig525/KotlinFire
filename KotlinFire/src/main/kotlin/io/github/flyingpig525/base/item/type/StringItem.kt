package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

class StringItem(val text: String) : Item(ID.STRING) {

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
        fun String.toStringItem(): StringItem = StringItem(this)
        val String.stringItem get() = toStringItem()
    }
}

class StringVariable(name: String, scope: VarItem.Scope) : VarClass<StringItem>(name, scope, StringItem::class)
