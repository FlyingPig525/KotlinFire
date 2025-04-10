package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.*
import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.block.subaction.*
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put

class ControlCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(items: Items, action: String, extra: JsonObjectBuilder.() -> Unit = {}) {
        blocks += Block("control", ItemCollection(items).items, action, extra)
    }
	/**
	 * *Stops a Repeat sequence and*
	 * *continues to the next code block.*
	 */
	fun stopRepeat(items: Items) = block(items, "StopRepeat")


	/**
	 * *Skips the rest of a Function*
	 * *sequence and returns to the*
	 * *block it was called from.*
	 */
	fun returnFrom(items: Items) = block(items, "Return")


	/**
	 */
	fun returnNTimes(items: Items) = block(items, "ReturnNTimes")


	/**
	 * *Skips the rest of this repeat*
	 * *statement's code and continues*
	 * *to the next repetition.*
	 */
	fun skip(items: Items) = block(items, "Skip")


	/**
	 * *Stops the current event*
	 * *thread. Any code after this*
	 * *block will not be executed.*
	 */
	fun end(items: Items) = block(items, "End")


	/**
	 * *Pauses the current code*
	 * *sequence for a duration of*
	 * *ticks, seconds, or minutes.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Wait duration*
	 *
	 * (*) = optional
	 */
	fun wait(items: Items) = block(items, "Wait")

}