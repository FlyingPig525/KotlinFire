package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.NumItem
import kotlinx.serialization.json.JsonObjectBuilder

class ControlCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(items: Items, action: String, extra: JsonObjectBuilder.() -> Unit = {}) {
        blocks += Block("control", ItemCollection(items).items, action, extra)
    }
	/**
	 * Stops a Repeat sequence and
	 * continues to the next code block.
	 */
	fun stopRepeat(items: Items) {
		block(items, "StopRepeat")
	}


	/**
	 * Skips the rest of a Function
	 * sequence and returns to the
	 * block it was called from.
	 */
	fun returnFrom(items: Items) {
		block(items, "Return")
	}


	/**
	 * Sends a formatted message to
	 * the specified plot staff group
	 * regardless of which mode
	 * they're currently in.
	 * Clicking on the message will
	 * teleport you to this block.
	 *
	 * **Args:**
	 *
	 * [Item]
	 *
	 * (*) Message to format
	 *
	 * (*) = optional
	 */
	fun printDebug(items: Items) {
		block(items, "PrintDebug")
	}


	/**
	 */
	fun returnNTimes(items: Items) {
		block(items, "ReturnNTimes")
	}


	/**
	 * Skips the rest of this repeat
	 * statement's code and continues
	 * to the next repetition.
	 */
	fun skip(items: Items) {
		block(items, "Skip")
	}


	/**
	 * Stops the current event
	 * thread. Any code after this
	 * block will not be executed.
	 */
	fun end(items: Items) {
		block(items, "End")
	}


	/**
	 * Pauses the current code
	 * sequence for a duration of
	 * ticks, seconds, or minutes.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Wait duration
	 *
	 * *Default = 1*
	 *
	 * (*) = optional
	 */
	fun wait(items: Items) {
		block(items, "Wait")
	}

}