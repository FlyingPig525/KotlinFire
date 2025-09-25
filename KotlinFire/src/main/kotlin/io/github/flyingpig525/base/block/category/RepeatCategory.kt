package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.BracketBlock
import io.github.flyingpig525.base.block.subaction.*
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.LocItem
import io.github.flyingpig525.base.item.type.NumItem
import io.github.flyingpig525.base.item.type.VarItem
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put

class RepeatCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(
        items: Items,
        action: String,
        wrappedCode: Template.() -> Unit,
        not: Boolean = false,
        extra: JsonObjectBuilder.() -> Unit = {}
    ) {
        blocks += Block("repeat", ItemCollection(items).items, action) {
            if (not) put("attribute", "NOT")
            extra()
        }
        blocks += BracketBlock(type = "repeat")
        blocks += io.github.flyingpig525.base.Template(
            io.github.flyingpig525.base.Template.Type.NONE,
            a = wrappedCode
        ).blocks
        blocks += BracketBlock(false, "repeat")
    }
	/**
	 * *Repeats code once for each*
	 * *block adjacent to a location.*
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * *Gets the current*
	 * *block location each iteration*
	 *
	 * [LocItem]
	 *
	 * *Center block*
	 *
	 * (*) = optional
	 */
	fun adjacent(items: Items, wrappedCode: Template.() -> Unit) {
		block(items, "Adjacent", wrappedCode)
	}


	/**
	 * *Repeats code once for*
	 * *each interpolated point in*
	 * *a path of locations.*
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * *Gets the current*
	 * *path location each iteration*
	 *
	 * [LocItem]
	 *
	 * *Path locations*
	 *
	 * [NumItem]
	 *
	 * (*) *Point spacing*
	 *
	 * (*) = optional
	 */
	fun path(items: Items, wrappedCode: Template.() -> Unit) {
		block(items, "Path", wrappedCode)
	}


	/**
	 * *Repeats code multiple times.*
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * (*) *Gets the*
	 * (*) *current index each iteration*
	 *
	 * [NumItem]
	 *
	 * *Amount*
	 *
	 * (*) = optional
	 */
	fun multiple(items: Items, wrappedCode: Template.() -> Unit) {
		block(items, "Multiple", wrappedCode)
	}


	/**
	 * *Repeats code once for each*
	 * *block in a region in order:*
	 * *X → Z → Y. Iterates from the*
	 * *first to the second location.*
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * *Gets the current*
	 * *block location each iteration*
	 *
	 * [LocItem]
	 *
	 * *Start of region*
	 *
	 * [LocItem]
	 *
	 * *End of region*
	 *
	 * (*) = optional
	 */
	fun grid(items: Items, wrappedCode: Template.() -> Unit) {
		block(items, "Grid", wrappedCode)
	}


	/**
	 * *Repeats code as long as a*
	 * *condition is true.*
	 * *The condition is evaluated*
	 * *at the end of each*
	 * *loop iteration.*
	 *
	 * **Accepts sub actions:**
	 * [IfPlayerSubAction],
	 * [IfEntitySubAction],
	 * [IfVarSubAction],
	 * [IfGameSubAction],
	 */
	fun doWhile(items: Items, subAction: SubAction, wrappedCode: Template.() -> Unit) {
		block(items, "DoWhile", wrappedCode) { put("subAction", subAction.codeblock) }
	}


	/**
	 * *Repeats code as long as a*
	 * *condition is true.*
	 * *The condition is evaluated*
	 * *before each loop iteration.*
	 *
	 * **Accepts sub actions:**
	 * [IfPlayerSubAction],
	 * [IfEntitySubAction],
	 * [IfVarSubAction],
	 * [IfGameSubAction],
	 */
	fun whileLoop(items: Items, subAction: SubAction, not: Boolean = false, wrappedCode: Template.() -> Unit) {
		block(items, "While", wrappedCode, not) { put("subAction", subAction.codeblock) }
	}


	/**
	 */
	fun range(items: Items, wrappedCode: Template.() -> Unit) {
		block(items, "Range", wrappedCode)
	}


	/**
	 * *Repeats code once for each*
	 * *index of a list.*
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * *Gets the current*
	 * *value each iteration*
	 *
	 * [VarItem]
	 *
	 * *List to repeat through*
	 *
	 * (*) = optional
	 */
	fun forEach(items: Items, wrappedCode: Template.() -> Unit) {
		block(items, "ForEach", wrappedCode)
	}


	/**
	 * *Repeats code once for every*
	 * *evenly distributed sphere point.*
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * *Gets the current*
	 * *sphere location each iteration*
	 *
	 * [LocItem]
	 *
	 * *Sphere center*
	 *
	 * [NumItem]
	 *
	 * *Sphere radius*
	 *
	 * [NumItem]
	 *
	 * (*) *Sphere points*
	 *
	 * (*) = optional
	 */
	fun sphere(items: Items, wrappedCode: Template.() -> Unit) {
		block(items, "Sphere", wrappedCode)
	}


	/**
	 * *Repeats code indefinitely.*
	 */
	fun forever(items: Items, wrappedCode: Template.() -> Unit) {
		block(items, "Forever", wrappedCode)
	}


	/**
	 * *Repeats code once per entry in*
	 * *a dictionary*
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * *Gets the current key*
	 * *each iteration*
	 *
	 * [VarItem]
	 *
	 * *Gets the current value*
	 * *each iteration*
	 *
	 * [VarItem]
	 *
	 * *Dictionary to*
	 * *repeat through*
	 *
	 * (*) = optional
	 */
	fun forEachEntry(items: Items, wrappedCode: Template.() -> Unit) {
		block(items, "ForEachEntry", wrappedCode)
	}

}