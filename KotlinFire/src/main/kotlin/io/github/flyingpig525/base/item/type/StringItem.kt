package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/**
 * A DiamondFire string.
 *
 * Can be constructed through the class constructor or the String extensions.
 *
 * For a DF variable containing this type, use [StringVariable].
 *
 * Generally not recommended for player-facing use, as [TextItem] support mini-message tags.
 *
 * @see toStringItem
 * @see stringItem
 * @see StringVariable
 * @see TextItem
 */
class StringItem(val text: String) : Item(ID.STRING) {

    constructor(text: Char) : this(text.toString())

    override fun getJsonData() = buildJsonObject {
        put("name", text)
    }

    companion object {
        fun String.toStringItem(): StringItem = StringItem(this)
        val String.stringItem get() = toStringItem()
        val StringVariable.stringItem get() = "%var($name)".stringItem
    }
}

class StringVariable(name: String, scope: VarItem.Scope) : VarClass<StringItem>(name, scope, StringItem::class)
