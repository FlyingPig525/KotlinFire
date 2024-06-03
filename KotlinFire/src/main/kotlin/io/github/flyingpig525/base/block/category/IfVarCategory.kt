package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.annotation.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.BracketBlock
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection

class IfVarCategory <T> internal constructor(private val template: Template<T>) where T : Item, T : JsonData {
	private val blocks = template.blocks

	private fun block(items: Items<T>, action: String, wrappedCode: Template<T>.() -> Unit) {
		blocks += Block("if_var", ItemCollection(items).items, action)
		blocks += BracketBlock(type = "norm")
		blocks += Template(Template.Type.NONE, a = wrappedCode).blocks
		blocks += BracketBlock(false, "norm")
	}

	fun chain(a: IfVarCategory<T>.() -> Unit) {
		apply(a)
	}

	/**
	 * Checks if a number value is
	 * less than or equal to another
	 * number.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Number to check
	 *
	 * [NumItem]
	 *
	 * Number to compare to
	 *
	 * (*) = Optional
	 */
	fun greaterThanOrEqual(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "<=", wrappedCode)
	/**
	 * Checks if an item has a
	 * given enchantment, or,
	 * if no enchantment is specified,
	 * checks if it has any.
	 *
	 * ARGUMENTS:
	 *
	 * Any Item
	 *
	 * Item to check
	 *
	 * (*)[TextItem]
	 *
	 * Enchantment
	 *
	 * (*)[NumItem]
	 *
	 * Level
	 *
	 * (*) = Optional
	 */
	fun itemHasEnchant(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "ItemHasEnchant", wrappedCode)
	/**
	 * Checks if a dictionary's value
	 * for the given key is equal to
	 * any of the given values.
	 *
	 * ARGUMENTS:
	 *
	 * [DICT]
	 *
	 * Dictionary to check
	 *
	 * [TextItem]
	 *
	 * Key to check
	 *
	 * Any Value(s)
	 *
	 * Values to
	 * compare with
	 *
	 * (*) = Optional
	 */
	fun dictValueEquals(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "DictValueEquals", wrappedCode)
	/**
	 * Checks if an item has a
	 * given custom tag, and (if
	 * provided) whether the tag
	 * matches the given value.
	 *
	 * ARGUMENTS:
	 *
	 * Any Item
	 *
	 * Item to check
	 *
	 * [TextItem]
	 *
	 * Tag name
	 *
	 * (*)[NumItem]
	 *
	 * Tag value
	 *
	 * (*)[TextItem]
	 *
	 * Tag value
	 *
	 * (*) = Optional
	 */
	fun itemHasTag(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "ItemHasTag", wrappedCode)
	/**
	 * Checks if a string value matches
	 * other values.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * String or source expression to match
	 *
	 * [TextItem](s)
	 *
	 * String to compare
	 *
	 * (*) = Optional
	 */
	fun stringMatches(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "StringMatches", wrappedCode)
	/**
	 * Checks if the first part of
	 * a string value matches a
	 * certain string.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * String to check
	 *
	 * [TextItem](s)
	 *
	 * String to start with
	 *
	 * (*) = Optional
	 */
	fun startsWith(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "StartsWith", wrappedCode)
	/**
	 * Checks if a list's value at an
	 * index is equal to a value.
	 *
	 * ARGUMENTS:
	 *
	 * [LIST]
	 *
	 * List to check in
	 *
	 * [NumItem]
	 *
	 * Index to check at
	 *
	 * Any Value(s)
	 *
	 * Variable to
	 * compare to
	 *
	 * (*) = Optional
	 */
	fun listValueEq(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "ListValueEq", wrappedCode)
	/**
	 * Checks if a value is of a
	 * certain type.
	 *
	 * ARGUMENTS:
	 *
	 * Any Value
	 *
	 * Value to check
	 *
	 * (*) = Optional
	 */
	fun varIsType(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "VarIsType", wrappedCode)
	fun textMatches(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "TextMatches", wrappedCode)
	fun isNear(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsNear", wrappedCode)
	/**
	 * Checks if a variable exists.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to check
	 *
	 * (*) = Optional
	 */
	fun varExists(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "VarExists", wrappedCode)
	/**
	 * Works the same as Value =
	 * but has a few extra options
	 * for item comparison.
	 *
	 * ARGUMENTS:
	 *
	 * Any Item
	 *
	 * Item to check
	 *
	 * (*)Any Item(s)
	 *
	 * Item(s) to compare to
	 *
	 * (*) = Optional
	 */
	fun itemEquals(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "ItemEquals", wrappedCode)
	/**
	 * Checks if any of a list's contents
	 * match the given value.
	 *
	 * ARGUMENTS:
	 *
	 * [LIST]
	 *
	 * List to check in
	 *
	 * Any Value(s)
	 *
	 * Value to find
	 *
	 * (*) = Optional
	 */
	fun listContains(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "ListContains", wrappedCode)
	fun inRange(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "InRange", wrappedCode)
	/**
	 * Checks if a location is
	 * near another location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Location to check
	 *
	 * [LocItem](s)
	 *
	 * Location(s) to
	 * compare to
	 *
	 * [NumItem]
	 *
	 * Radius
	 *
	 * (*) = Optional
	 */
	fun locIsNear(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "LocIsNear", wrappedCode)
	/**
	 * Checks if a string value
	 * contains another string.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * String to check
	 *
	 * [TextItem](s)
	 *
	 * String to check for
	 *
	 * (*) = Optional
	 */
	fun contains(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "Contains", wrappedCode)
	/**
	 * Checks if a value does not
	 * equal another value.
	 *
	 * ARGUMENTS:
	 *
	 * Any Value
	 *
	 * Value to check
	 *
	 * Any Value(s)
	 *
	 * Values to compare to
	 *
	 * (*) = Optional
	 */
	fun notEqualTo(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "!=", wrappedCode)
	/**
	 * Checks if a number value is
	 * less than another number.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Number to check
	 *
	 * [NumItem]
	 *
	 * Number to compare to
	 *
	 * (*) = Optional
	 */
	fun lessThan(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "<", wrappedCode)
	/**
	 * Checks if a value is equal
	 * to one of the given values.
	 *
	 * ARGUMENTS:
	 *
	 * Any Value
	 *
	 * Value to check
	 *
	 * Any Value(s)
	 *
	 * Values to compare to
	 *
	 * (*) = Optional
	 */
	fun equalTo(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "=", wrappedCode)
	/**
	 * Checks if a number value is
	 * greater than another number.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Number to check
	 *
	 * [NumItem]
	 *
	 * Number to compare to
	 *
	 * (*) = Optional
	 */
	fun greaterThan(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, ">", wrappedCode)
	/**
	 * Checks if the last part of
	 * a string value matches a
	 * certain string.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * String to check
	 *
	 * [TextItem](s)
	 *
	 * String to end with
	 *
	 * (*) = Optional
	 */
	fun endsWith(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "EndsWith", wrappedCode)
	/**
	 * Checks if a number value
	 * is greater than or equal to
	 * another number.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Number to check
	 *
	 * [NumItem]
	 *
	 * Number to compare to
	 *
	 * (*) = Optional
	 */
	fun lessThanOrEqual(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, ">=", wrappedCode)
	/**
	 * Checks if a dictionary has
	 * the given key.
	 *
	 * ARGUMENTS:
	 *
	 * [DICT]
	 *
	 * Dictionary to check
	 *
	 * [TextItem]
	 *
	 * Key to look for
	 *
	 * (*) = Optional
	 */
	fun dictHasKey(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "DictHasKey", wrappedCode)

}