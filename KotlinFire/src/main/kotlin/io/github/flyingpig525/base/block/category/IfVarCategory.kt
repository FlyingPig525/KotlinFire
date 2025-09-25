package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.BracketBlock
import io.github.flyingpig525.base.block.ElseOperation
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put

class IfVarCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(
        items: Items,
        action: String,
        wrappedCode: Template.() -> Unit,
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
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Number to check
	 *
	 * [NumItem]
	 *
	 * Number to compare to
	 *
	 * (*) = optional
	 */
	fun lessThanOrEqual(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "<=", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if an item has a
	 * given enchantment, or,
	 * if no enchantment is specified,
	 * checks if it has any.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item to check
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
	fun itemHasEnchant(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ItemHasEnchant", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if an item is
	 * able to be placed.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item to check
	 *
	 * (*) = optional
	 */
	fun itemIsBlock(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ItemIsBlock", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a dictionary's value
	 * for the given key is equal to
	 * any of the given values.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Dictionary to check
	 *
	 * [StringItem]
	 *
	 * Key to check
	 *
	 * [Item]
	 *
	 * Values to
	 * compare with
	 *
	 * (*) = optional
	 */
	fun dictValueEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "DictValueEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if an item has a
	 * given custom tag, and (if
	 * provided) whether the tag
	 * matches the given value.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item to check
	 *
	 * [StringItem]
	 *
	 * Tag name
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
	fun itemHasTag(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ItemHasTag", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a list is of a given size.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * List to check
	 *
	 * [NumItem]
	 *
	 * (*) Size to compare
	 *
	 * *Default = 0*
	 *
	 * (*) = optional
	 */
	fun listSizeEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ListSizeEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a string value matches
	 * other values.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * String or source expression to match
	 *
	 * [StringItem]
	 *
	 * String to compare
	 *
	 * (*) = optional
	 */
	fun stringMatches(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "StringMatches", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if the input string
	 * would be filtered by the
	 * selected chat filters.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * String to check
	 *
	 * (*) = optional
	 */
	fun isFiltered(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsFiltered", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if the first part of
	 * a string value matches a
	 * certain string.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * String to check
	 *
	 * [StringItem]
	 *
	 * String to start with
	 *
	 * (*) = optional
	 */
	fun startsWith(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "StartsWith", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a list's value at an
	 * index is equal to a value.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * List to check in
	 *
	 * [NumItem]
	 *
	 * Index to check at
	 *
	 * [Item]
	 *
	 * Variable to
	 * compare to
	 *
	 * (*) = optional
	 */
	fun listValueEq(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ListValueEq", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a value is of a
	 * certain type.
	 *
	 * **Args:**
	 *
	 * [Item]
	 *
	 * Value to check
	 *
	 * (*) = optional
	 */
	fun varIsType(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "VarIsType", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun textMatches(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "TextMatches", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun isNear(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsNear", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a number value is
	 * in between 2 other numbers or
	 * a location value is within the
	 * region of 2 other locations.
	 *
	 * **Args:**
	 *
	 * [Item]
	 *
	 * Check value
	 *
	 * [Item]
	 *
	 * Minimum value
	 *
	 * [Item]
	 *
	 * Maximum value
	 *
	 * (*) = optional
	 */
	fun inRange(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, " InRange ", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a value is empty.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * String to check if empty
	 *
	 * [TextItem]
	 *
	 * Text to compare
	 * content length to 0
	 *
	 * [VarItem]
	 *
	 * List to compare size to 0
	 *
	 * [VarItem]
	 *
	 * Dictionary to
	 * compare size to 0
	 *
	 * [MinecraftItem]
	 *
	 * Item to compare to air
	 *
	 * (*) = optional
	 */
	fun valueIsEmpty(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ValueIsEmpty", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a variable exists.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to check
	 *
	 * (*) = optional
	 */
	fun varExists(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "VarExists", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a dictionary has
	 * the given keys.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Dictionary to check
	 *
	 * [StringItem]
	 *
	 * Key(s) to look for
	 *
	 * (*) = optional
	 */
	fun dictHasKeys(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "DictHasKeys", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun legacyNotEqual(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "Legacy !=", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a material will collide
	 * with entities.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Block to check for
	 *
	 * (*) = optional
	 */
	fun blockIsSolid(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "BlockIsSolid", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Works the same as Value =
	 * but has a few extra options
	 * for item comparison.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item to check
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item(s) to compare to
	 *
	 * (*) = optional
	 */
	fun itemEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ItemEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if any of a list's contents
	 * match the given value.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * List to check in
	 *
	 * [Item]
	 *
	 * Value to find
	 *
	 * (*) = optional
	 */
	fun listContains(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ListContains", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun legacyEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "Legacy =", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a location is
	 * near another location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Location to check
	 *
	 * [LocItem]
	 *
	 * Location(s) to
	 * compare to
	 *
	 * [NumItem]
	 *
	 * Radius
	 *
	 * (*) = optional
	 */
	fun locIsNear(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "LocIsNear", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if an item is unbreakable.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item to check
	 *
	 * (*) = optional
	 */
	fun itemIsUnbreakable(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ItemIsUnbreakable", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a string value
	 * contains another string.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * String to check
	 *
	 * [StringItem]
	 *
	 * String to check for
	 *
	 * (*) = optional
	 */
	fun contains(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "Contains", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a value does not
	 * equal another value.
	 *
	 * **Args:**
	 *
	 * [Item]
	 *
	 * Value to check
	 *
	 * [Item]
	 *
	 * Values to compare to
	 *
	 * (*) = optional
	 */
	fun notEqual(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "!=", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a number value is
	 * less than another number.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Number to check
	 *
	 * [NumItem]
	 *
	 * Number to compare to
	 *
	 * (*) = optional
	 */
	fun lessThan(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "<", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a value is equal
	 * to one of the given values.
	 *
	 * **Args:**
	 *
	 * [Item]
	 *
	 * Value to check
	 *
	 * [Item]
	 *
	 * Values to compare to
	 *
	 * (*) = optional
	 */
	fun equalTo(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "=", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a number value is
	 * greater than another number.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Number to check
	 *
	 * [NumItem]
	 *
	 * Number to compare to
	 *
	 * (*) = optional
	 */
	fun greaterThan(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, ">", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if the last part of
	 * a string value matches a
	 * certain string.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * String to check
	 *
	 * [StringItem]
	 *
	 * String to end with
	 *
	 * (*) = optional
	 */
	fun endsWith(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "EndsWith", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a number value
	 * is greater than or equal to
	 * another number.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Number to check
	 *
	 * [NumItem]
	 *
	 * Number to compare to
	 *
	 * (*) = optional
	 */
	fun greaterThanOrEqual(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, ">=", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a dictionary has
	 * the given key.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Dictionary to check
	 *
	 * [StringItem]
	 *
	 * Key to look for
	 *
	 * (*) = optional
	 */
	fun dictHasKey(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "DictHasKey", wrappedCode, not)
		return ElseOperation()
	}

}