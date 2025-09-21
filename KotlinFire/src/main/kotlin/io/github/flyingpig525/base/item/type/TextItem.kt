package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemComparison
import io.github.flyingpig525.base.item.type.StringItem.Companion.stringItem
import io.github.flyingpig525.base.item.type.StringItem.Companion.toStringItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.textItem
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

class TextVariable(name: String, scope: VarItem.Scope) : VarClass<TextItem>(name, scope, TextItem::class) {
    infix fun contains(value: String) = contains_(value.textItem)
    infix fun contains(value: VarItem) = contains_(value)
    infix fun contains(value: TextItem) = contains_(value)
    infix fun contains(value: TextVariable) = contains_(value.item)
    infix fun contains(value: GameValue<TextItem>) = contains_(value)
    private fun contains_(value: Insertable) = ItemComparison { not, nested ->
        IfVar.contains({
            +item
            +value
        }, not, nested)
    }
}