@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*

class RepeatCategory <T> internal constructor(private val template: Template<T>) where T : Item, T : JsonData {
	private val blocks = template.blocks

	private fun block(items: Items<T>, action: String) {
		blocks += Block("repeat", ItemCollection(items).items, action)
	}

	fun chain(a: RepeatCategory<T>.() -> Unit) {
		apply(a)
	}

	/**
	 * Repeats code once for each
	 * block adjacent to a location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Gets the current
	 * block location each iteration
	 *
	 * [LocItem]
	 *
	 * Center block
	 *
	 * (*) = Optional
	 */
	fun adjacent(items: Items<T>) = block(items, "Adjacent")
	/**
	 * Repeats code once for
	 * each interpolated point in
	 * a path of locations.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Gets the current
	 * path location each iteration
	 *
	 * [LocItem](s)
	 *
	 * Path locations
	 *
	 * (*)[NumItem]
	 *
	 * Point spacing
	 *
	 * (*) = Optional
	 */
	fun path(items: Items<T>) = block(items, "Path")
	/**
	 * Repeats code multiple times.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[VarItem]
	 *
	 * Gets the
	 * current index each iteration
	 *
	 * [NumItem]
	 *
	 * Amount
	 *
	 * (*) = Optional
	 */
	fun multiple(items: Items<T>) = block(items, "Multiple")
	/**
	 * Repeats code once for each
	 * block in a region.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Gets the current
	 * block location each iteration
	 *
	 * [LocItem]
	 *
	 * Start of region
	 *
	 * [LocItem]
	 *
	 * End of region
	 *
	 * (*) = Optional
	 */
	fun grid(items: Items<T>) = block(items, "Grid")
	/**
	 * Repeats code as long as a
	 * condition is true.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun whileLoop(items: Items<T>) = block(items, "While")
	fun range(items: Items<T>) = block(items, "Range")
	/**
	 * Repeats code once for each
	 * index of a list.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Gets the current
	 * value each iteration
	 *
	 * []
	 *
	 * List to repeat through
	 *
	 * (*) = Optional
	 */
	fun forEach(items: Items<T>) = block(items, "ForEach")
	/**
	 * Repeats code once for every
	 * evenly distributed sphere point.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Gets the current
	 * sphere location each iteration
	 *
	 * [LocItem]
	 *
	 * Sphere center
	 *
	 * [NumItem]
	 *
	 * Sphere radius
	 *
	 * (*)[NumItem]
	 *
	 * Sphere points
	 *
	 * (*) = Optional
	 */
	fun sphere(items: Items<T>) = block(items, "Sphere")
	/**
	 * Repeats code indefinitely.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun forever(items: Items<T>) = block(items, "Forever")
	/**
	 * Repeats code once per entry in
	 * a dictionary
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Gets the current key
	 * each iteration
	 *
	 * [VarItem]
	 *
	 * Gets the current value
	 * each iteration
	 *
	 * []
	 *
	 * Dictionary to
	 * repeat through
	 *
	 * (*) = Optional
	 */
	fun forEachEntry(items: Items<T>) = block(items, "ForEachEntry")

}