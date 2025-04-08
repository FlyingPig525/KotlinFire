package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.*
import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.block.subaction.*
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put
import io.github.flyingpig525.base.block.subaction.*

class IfVarCategory<T : Item> internal constructor(private val template: Template<T>) {
    private val blocks = template.blocks

    private fun block(
        items: Items<T>,
        action: String,
        wrappedCode: Template<T>.() -> Unit,
        not: Boolean = false,
        extra: JsonObjectBuilder.() -> Unit = {}
    ) {
        blocks += Block("if_var", ItemCollection(items).items, action) {
            if (not) put("attribute", "NOT")
            extra()
        }
        blocks += BracketBlock(type = "norm")
        blocks += io.github.flyingpig525.base.Template(
            io.github.flyingpig525.base.Template.Type.NONE,
            a = wrappedCode
        ).blocks
        blocks += BracketBlock(false, "norm")
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
	 *  Number to check
	 *
	 * [NumItem]
	 *
	 *  Number to compare to
	 *
	 * (*) = optional
	 */
	fun lessThanOrEqual(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "<=", wrappedCode, not)


	/**
	 * Checks if an item has a
	 * given enchantment, or,
	 * if no enchantment is specified,
	 * checks if it has any.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Item to check
	 *
	 * [StringItem]
	 *
	 * (*) Enchantment
	 *
	 * [NumItem]
	 *
	 * (*) Level
	 *
	 * (*) = optional
	 */
	fun itemHasEnchant(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "ItemHasEnchant", wrappedCode, not)


	/**
	 * Checks if an item is
	 * able to be placed.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Item to check
	 *
	 * (*) = optional
	 */
	fun itemIsBlock(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "ItemIsBlock", wrappedCode, not)


	/**
	 * Checks if a dictionary's value
	 * for the given key is equal to
	 * any of the given values.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 *  Dictionary to check
	 *
	 * [StringItem]
	 *
	 *  Key to check
	 *
	 * [Item]
	 *
	 *  Values to
	 *
	 *  compare with
	 *
	 * (*) = optional
	 */
	fun dictValueEquals(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "DictValueEquals", wrappedCode, not)


	/**
	 * Checks if an item has a
	 * given custom tag, and (if
	 * provided) whether the tag
	 * matches the given value.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Item to check
	 *
	 * [StringItem]
	 *
	 *  Tag name
	 *
	 * [NumItem]
	 *
	 * (*) Tag value
	 *
	 * [StringItem]
	 *
	 * (*) Tag value
	 *
	 * (*) = optional
	 */
	fun itemHasTag(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "ItemHasTag", wrappedCode, not)


	/**
	 * Checks if a string value matches
	 * other values.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  String or source expression to match
	 *
	 * [StringItem]
	 *
	 *  String to compare
	 *
	 * (*) = optional
	 */
	fun stringMatches(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "StringMatches", wrappedCode, not)


	/**
	 * Checks if a list is empty.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 *  List to check
	 *
	 * (*) = optional
	 */
	fun listIsEmpty(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "ListIsEmpty", wrappedCode, not)


	/**
	 * Checks if the first part of
	 * a string value matches a
	 * certain string.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  String to check
	 *
	 * [StringItem]
	 *
	 *  String to start with
	 *
	 * (*) = optional
	 */
	fun startsWith(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "StartsWith", wrappedCode, not)


	/**
	 * Checks if a list's value at an
	 * index is equal to a value.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 *  List to check in
	 *
	 * [NumItem]
	 *
	 *  Index to check at
	 *
	 * [Item]
	 *
	 *  Variable to
	 *
	 *  compare to
	 *
	 * (*) = optional
	 */
	fun listValueEq(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "ListValueEq", wrappedCode, not)


	/**
	 * Checks if a value is of a
	 * certain type.
	 *
	 * ARGUMENTS:
	 *
	 * [Item]
	 *
	 *  Value to check
	 *
	 * (*) = optional
	 */
	fun varIsType(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "VarIsType", wrappedCode, not)


	/**
	 */
	fun textMatches(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "TextMatches", wrappedCode, not)


	/**
	 */
	fun isNear(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "IsNear", wrappedCode, not)


	/**
	 * Checks if a number value is
	 * in between 2 other numbers or
	 * a location value is within the
	 * region of 2 other locations.
	 *
	 * ARGUMENTS:
	 *
	 * [Item]
	 *
	 *  Check value
	 *
	 * [Item]
	 *
	 *  Minimum value
	 *
	 * [Item]
	 *
	 *  Maximum value
	 *
	 * (*) = optional
	 */
	fun inRange(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, " InRange ", wrappedCode, not)


	/**
	 * Checks if a variable exists.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 *  Variable to check
	 *
	 * (*) = optional
	 */
	fun varExists(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "VarExists", wrappedCode, not)


	/**
	 */
	fun legacyNotEqual(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "Legacy !=", wrappedCode, not)


	/**
	 * Checks if a material will collide
	 * with entities.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Block to check for
	 *
	 * (*) = optional
	 */
	fun blockIsSolid(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "BlockIsSolid", wrappedCode, not)


	/**
	 * Works the same as Value =
	 * but has a few extra options
	 * for item comparison.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Item to check
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item(s) to compare to
	 *
	 * (*) = optional
	 */
	fun itemEquals(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "ItemEquals", wrappedCode, not)


	/**
	 * Checks if any of a list's contents
	 * match the given value.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 *  List to check in
	 *
	 * [Item]
	 *
	 *  Value to find
	 *
	 * (*) = optional
	 */
	fun listContains(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "ListContains", wrappedCode, not)


	/**
	 */
	fun legacyEquals(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "Legacy =", wrappedCode, not)


	/**
	 * Checks if a location is
	 * near another location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Location to check
	 *
	 * [LocItem]
	 *
	 *  Location(s) to
	 *
	 *  compare to
	 *
	 * [NumItem]
	 *
	 *  Radius
	 *
	 * (*) = optional
	 */
	fun locIsNear(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "LocIsNear", wrappedCode, not)


	/**
	 * Checks if a string value
	 * contains another string.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  String to check
	 *
	 * [StringItem]
	 *
	 *  String to check for
	 *
	 * (*) = optional
	 */
	fun contains(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "Contains", wrappedCode, not)


	/**
	 * Checks if a value does not
	 * equal another value.
	 *
	 * ARGUMENTS:
	 *
	 * [Item]
	 *
	 *  Value to check
	 *
	 * [Item]
	 *
	 *  Values to compare to
	 *
	 * (*) = optional
	 */
	fun notEqual(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "!=", wrappedCode, not)


	/**
	 * Checks if a number value is
	 * less than another number.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Number to check
	 *
	 * [NumItem]
	 *
	 *  Number to compare to
	 *
	 * (*) = optional
	 */
	fun lessThan(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "<", wrappedCode, not)


	/**
	 * Checks if a value is equal
	 * to one of the given values.
	 *
	 * ARGUMENTS:
	 *
	 * [Item]
	 *
	 *  Value to check
	 *
	 * [Item]
	 *
	 *  Values to compare to
	 *
	 * (*) = optional
	 */
	fun equalTo(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "=", wrappedCode, not)


	/**
	 * Checks if a number value is
	 * greater than another number.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Number to check
	 *
	 * [NumItem]
	 *
	 *  Number to compare to
	 *
	 * (*) = optional
	 */
	fun greaterThan(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, ">", wrappedCode, not)


	/**
	 * Checks if the last part of
	 * a string value matches a
	 * certain string.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  String to check
	 *
	 * [StringItem]
	 *
	 *  String to end with
	 *
	 * (*) = optional
	 */
	fun endsWith(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "EndsWith", wrappedCode, not)


	/**
	 * Checks if a number value
	 * is greater than or equal to
	 * another number.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Number to check
	 *
	 * [NumItem]
	 *
	 *  Number to compare to
	 *
	 * (*) = optional
	 */
	fun greaterThanOrEqual(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, ">=", wrappedCode, not)


	/**
	 * Checks if a dictionary has
	 * the given key.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 *  Dictionary to check
	 *
	 * [StringItem]
	 *
	 *  Key to look for
	 *
	 * (*) = optional
	 */
	fun dictHasKey(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "DictHasKey", wrappedCode, not)

}