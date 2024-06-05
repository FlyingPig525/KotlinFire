@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*

class ControlCategory <T> internal constructor( private val template: Template<T>) where T : Item, T : JsonData {
	private val blocks = template.blocks

	private fun block(items: Items<T>, action: String) {
		blocks += Block("control", ItemCollection(items).items, action)
	}

	fun chain(a: ControlCategory<T>.() -> Unit) {
		apply(a)
	}
	/**
	 * Stops a Repeat sequence and
	 * continues to the next code block.
	 */
	fun stopRepeat() = block({}, "StopRepeat")
	/**
	 * Skips the rest of a Function
	 * sequence and returns to the
	 * block it was called from.
	 */
	fun returnFrom() = block({}, "Return")
	fun returnNTimes() = block({}, "ReturnNTimes")
	/**
	 * Skips the rest of this repeat
	 * statement's code and continues
	 * to the next repetition.
	 */
	fun skip() = block({}, "Skip")
	/**
	 * Stops the current event
	 * thread. Any code after this
	 * block will not be executed.
	 */
	fun end() = block({}, "End")
	/**
	 * Pauses the current code
	 * sequence for a duration of
	 * ticks, seconds, or minutes.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[NumItem]
	 *
	 * Wait duration
	 *
	 * (*) = Optional
	 */
	fun wait(items: Items<T>) = block(items, "Wait")


}