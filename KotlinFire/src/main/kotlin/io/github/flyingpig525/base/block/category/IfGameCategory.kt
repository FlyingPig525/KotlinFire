@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.annotation.*
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.BracketBlock
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*

class IfGameCategory<T> internal constructor(private val template: io.github.flyingpig525.base.Template<T>) where T : Item, T : io.github.flyingpig525.base.JsonData {
    private val blocks = template.blocks

    private fun block(
        items: io.github.flyingpig525.base.Items<T>,
        action: String,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit,
        not: Boolean = false
    ) {
        blocks += Block("if_game", ItemCollection(items).items, action, if (not) "attribute: \"NOT\"" else "")
        blocks += BracketBlock(type = "norm")
        blocks += io.github.flyingpig525.base.Template(
            io.github.flyingpig525.base.Template.Type.NONE,
            a = wrappedCode
        ).blocks
        blocks += BracketBlock(false, "norm")
    }

    fun chain(a: IfGameCategory<T>.() -> Unit) {
        apply(a)
    }

    fun signHasTxt(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "SignHasTxt", wrappedCode, not)

    /**
     * Checks if the container at a
     * location has room for one or
     * more items to be given.
     *
     * ARGUMENTS:
     *
     * [LocItem]
     *
     * Container location
     *
     * (*)Any Item
     *
     * Item(s) to check with
     *
     * (*)[NONE]
     *
     * Checks for empty slot
     *
     * (*) = Optional
     */
    fun hasRoomForItem(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "HasRoomForItem", wrappedCode, not)

    /**
     * Checks if the block in a block
     * related event is the given block.
     *
     * ARGUMENTS:
     *
     * [BLOCK](s)
     *
     * Block(s) to check for
     *
     * (*) = Optional
     */
    fun eventBlockEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "EventBlockEquals", wrappedCode, not)

    /**
     * Checks if the command entered
     * in the Command Event is equal
     * to the given string.
     *
     * ARGUMENTS:
     *
     * [TextItem](s)
     *
     * String(s) to check for
     *
     * (*) = Optional
     */
    @Emperor
    fun commandEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "CommandEquals", wrappedCode, not)

    /**
     * Checks if the item in a item
     * related event is the given item.
     *
     * ARGUMENTS:
     *
     * Any Item(s)
     *
     * Item(s) to check for
     *
     * (*) = Optional
     */
    fun eventItemEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "EventItemEquals", wrappedCode, not)

    /**
     * Checks if an event attack
     * is critical.
     */
    fun attackIsCrit(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "AttackIsCrit", wrappedCode, not)

    /**
     * Checks if the container at a
     * location has the given item.
     *
     * ARGUMENTS:
     *
     * [LocItem]
     *
     * Container location
     *
     * Any Item(s)
     *
     * Item(s) to check for
     *
     * (*) = Optional
     */
    fun containerHas(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "ContainerHas", wrappedCode, not)

    /**
     * Checks if the block at a location
     * is the given block.
     *
     * ARGUMENTS:
     *
     * [LocItem]
     *
     * Check location
     *
     * (*)[BLOCK](s)
     *
     * Block(s) to check for
     *
     * (*)[BLOCK_TAG](s)
     *
     * Block data
     *
     * (*) = Optional
     */
    fun blockEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "BlockEquals", wrappedCode, not)

    /**
     * Checks if the block at a location
     * is powered by redstone.
     *
     * ARGUMENTS:
     *
     * [LocItem](s)
     *
     * Check location(s)
     *
     * (*) = Optional
     */
    fun blockPowered(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "BlockPowered", wrappedCode, not)

    /**
     * Checks if there is currently
     * a player in the game with the
     * given name or UUID.
     *
     * ARGUMENTS:
     *
     * [TextItem](s)
     *
     * Name or UUID
     *
     * (*) = Optional
     */
    fun hasPlayer(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "HasPlayer", wrappedCode, not)

    /**
     * Checks if the container at a
     * location has all of the given
     * items.
     *
     * ARGUMENTS:
     *
     * [LocItem]
     *
     * Container location
     *
     * Any Item(s)
     *
     * Item(s) to check for
     *
     * (*) = Optional
     */
    fun containerHasAll(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "ContainerHasAll", wrappedCode, not)

    /**
     * Checks if a part of the command
     * entered in the Command Event
     * is equal to the given string.
     *
     * ARGUMENTS:
     *
     * [TextItem](s)
     *
     * String(s) to check for
     *
     * [NumItem]
     *
     * Argument number
     *
     * (*) = Optional
     */
    @Emperor
    fun cmdArgEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "CmdArgEquals", wrappedCode, not)

    /**
     * Checks if the current
     * event is cancelled.
     */
    fun eventCancelled(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "EventCancelled", wrappedCode, not)


}