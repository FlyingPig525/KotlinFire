package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemComparison
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.textItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.toTextItem
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

    // +=
    context(_: Template)
    inline operator fun plusAssign(other: String) = plusAssign(other.textItem)
    context(_: Template)
    inline operator fun plusAssign(other: VarClass<*>) { plusAssign(other.item) }
    context(t: Template)
    inline operator fun plusAssign(other: TextItem) {
        t.SetVariable.styledText {
            +item
            +item
            +other
        }
    }
    context(t: Template)
    inline operator fun plusAssign(other: VarItem) {
        t.SetVariable.styledText {
            +item
            +item
            +other
        }
    }
    // Trim
    /**
     * Trims the content of a styled text
     */
    context(_: Template)
    inline fun trim(from: Number, to: Number? = null) = trim(from.numItem, to?.numItem)
    /**
     * Trims the content of a styled text
     *
     * [from] and [to] must be [NumItem] parsable strings
     */
    context(_: Template)
    inline fun trim(from: String, to: String? = null) = trim(from.numItem, to?.numItem)
    /**
     * Trims the content of a styled text
     *
     * @param [to] - Can be an uninitialized variable
     */
    context(t: Template)
    inline fun trim(from: VarItem, to: VarItem? = null) {
        t.SetVariable.trimStyledText {
            +item
            +from
            if (to != null) {
                +to
            }
        }
    }
    /**
     * Trims the content of a styled text
     */
    context(t: Template)
    inline fun trim(from: NumItem, to: NumItem? = null) {
        t.SetVariable.trimStyledText {
            +item
            +from
            if (to != null) {
                +to
            }
        }
    }
    // Replace
    /**
     * @param [replace] - A regex used to find replacement targets
     */
    context(_: Template)
    inline fun replace(replace: String, with: String) = replace(replace.textItem, with.textItem)
    /**
     * @param [replace] - A regex used to find replacement targets
     */
    context(_: Template)
    inline fun replace(replace: VarClass<*>, with: VarClass<*>) = replace(replace.item, with.item)
    /**
     * @param [replace] - A regex used to find replacement targets
     */
    context(t: Template)
    inline fun replace(replace: TextItem, with: TextItem) {
        t.SetVariable.rmText {
            +item
            +item
            +replace
            +with
        }
    }
    /**
     * @param [replace] - A regex used to find replacement targets
     */
    context(t: Template)
    inline fun replace(replace: VarItem, with: VarItem) {
        t.SetVariable.rmText {
            +item
            +item
            +replace
            +with
        }
    }
}