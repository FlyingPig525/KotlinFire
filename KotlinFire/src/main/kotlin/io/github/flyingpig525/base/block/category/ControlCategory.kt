package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.*
import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.block.subaction.*
import kotlinx.serialization.json.JsonObjectBuilder

class ControlCategory<T : Item> internal constructor(private val template: Template<T>) {
    private val blocks = template.blocks

    private fun block(items: Items<T>, action: String, extra: JsonObjectBuilder.() -> Unit = {}) {
        blocks += Block("control", ItemCollection(items).items, action, extra)
    }
	/**
	 * Stops a Repeat sequence and
	 * continues to the next code block.
	 */
	fun stopRepeat(items: Items<T>) = block(items, "StopRepeat")


	/**
	 * Skips the rest of a Function
	 * sequence and returns to the
	 * block it was called from.
	 */
	fun returnFrom(items: Items<T>) = block(items, "Return")


	/**
	 */
	fun returnNTimes(items: Items<T>) = block(items, "ReturnNTimes")


	/**
	 * Skips the rest of this repeat
	 * statement's code and continues
	 * to the next repetition.
	 */
	fun skip(items: Items<T>) = block(items, "Skip")


	/**
	 * Stops the current event
	 * thread. Any code after this
	 * block will not be executed.
	 */
	fun end(items: Items<T>) = block(items, "End")


	/**
	 * Pauses the current code
	 * sequence for a duration of
	 * ticks, seconds, or minutes.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Wait duration
	 *
	 * (*) = optional
	 */
	fun wait(items: Items<T>) = block(items, "Wait")

}