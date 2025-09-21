package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemComparison
import io.github.flyingpig525.base.item.type.StringItem.Companion.stringItem
import io.github.flyingpig525.base.item.type.StringItem.Companion.toStringItem
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/**
 * A DiamondFire rich text.
 *
 * Can be constructed through the class constructor or the String extensions.
 *
 * For a DF variable containing this type, use [TextVariable].
 *
 * @see toTextItem
 * @see textItem
 * @see TextVariable
 */
class TextItem(val text: String) : Item(ID.RICHTEXT) {
    constructor(text: Char) : this(text.toString())

    override fun getJsonData() = buildJsonObject {
        put("name", text)
    }

    companion object {
        fun String.toTextItem(): TextItem = TextItem(this)
        val String.textItem get() = toTextItem()
        val TextVariable.textItem get() = "%var($name)".textItem
    }
}

class TextVariable(name: String, scope: VarItem.Scope) : VarClass<TextItem>(name, scope, TextItem::class)