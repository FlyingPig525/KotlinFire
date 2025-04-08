package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.*
import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.block.subaction.*
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put
import io.github.flyingpig525.base.block.subaction.*

class IfGameCategory<T : Item> internal constructor(private val template: Template<T>) {
    private val blocks = template.blocks

    private fun block(
        items: Items<T>,
        action: String,
        wrappedCode: Template<T>.() -> Unit,
        not: Boolean = false,
        extra: JsonObjectBuilder.() -> Unit = {}
    ) {
        blocks += Block("if_game", ItemCollection(items).items, action) {
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
	 */
	fun signHasTxt(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "SignHasTxt", wrappedCode, not)


	/**
	 * Checks if the container at a
	 * location has room for one or
	 * more items to be given.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Container location
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item(s) to check with
	 *
	 * (*) = optional
	 */
	fun hasRoomForItem(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "HasRoomForItem", wrappedCode, not)


	/**
	 * Checks if the block in a block
	 * related event is the given block.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Block(s) to check for
	 *
	 * (*) = optional
	 */
	fun eventBlockEquals(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "EventBlockEquals", wrappedCode, not)


	/**
	 * Checks if the command entered
	 * in the Command Event is equal
	 * to the given string.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  String(s) to check for
	 *
	 * (*) = optional
	 */
	fun commandEquals(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "CommandEquals", wrappedCode, not)


	/**
	 * Checks if the item in a item
	 * related event is the given item.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Item(s) to check for
	 *
	 * (*) = optional
	 */
	fun eventItemEquals(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "EventItemEquals", wrappedCode, not)


	/**
	 * Checks if an event attack
	 * is critical.
	 */
	fun attackIsCrit(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "AttackIsCrit", wrappedCode, not)


	/**
	 * Checks if the container at a
	 * location has the given item.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Container location
	 *
	 * [MinecraftItem]
	 *
	 *  Item(s) to check for
	 *
	 * (*) = optional
	 */
	fun containerHas(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "ContainerHas", wrappedCode, not)


	/**
	 * Checks if the block at a location
	 * is the given block.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Check location
	 *
	 * [MinecraftItem]
	 *
	 * (*) Block(s) to check for
	 *
	 * [TextItem]
	 *
	 * (*) Block data
	 *
	 * (*) = optional
	 */
	fun blockEquals(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "BlockEquals", wrappedCode, not)


	/**
	 * Checks if a location collides with
	 * the hitbox of the nearest block.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Check location
	 *
	 * (*) = optional
	 */
	fun inBlock(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "InBlock", wrappedCode, not)


	/**
	 * Checks if the block at a location
	 * is powered by redstone.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Check location(s)
	 *
	 * (*) = optional
	 */
	fun blockPowered(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "BlockPowered", wrappedCode, not)


	/**
	 * Checks if there is currently
	 * a player in the game with the
	 * given name or UUID.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  Name or UUID
	 *
	 * (*) = optional
	 */
	fun hasPlayer(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "HasPlayer", wrappedCode, not)


	/**
	 * Checks if the container at a
	 * location has all of the given
	 * items.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Container location
	 *
	 * [MinecraftItem]
	 *
	 *  Item(s) to check for
	 *
	 * (*) = optional
	 */
	fun containerHasAll(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "ContainerHasAll", wrappedCode, not)


	/**
	 * Checks if a part of the command
	 * entered in the Command Event
	 * is equal to the given string.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  String(s) to check for
	 *
	 * [NumItem]
	 *
	 *  Argument number
	 *
	 * (*) = optional
	 */
	fun cmdArgEquals(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "CmdArgEquals", wrappedCode, not)


	/**
	 * Checks if the current
	 * event is cancelled.
	 */
	fun eventCancelled(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "EventCancelled", wrappedCode, not)


	/**
	 * Checks if the chunk at a location
	 * is currently loaded.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Location in chunk
	 *
	 * (*) = optional
	 */
	fun isChunkLoaded(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "IsChunkLoaded", wrappedCode, not)

}