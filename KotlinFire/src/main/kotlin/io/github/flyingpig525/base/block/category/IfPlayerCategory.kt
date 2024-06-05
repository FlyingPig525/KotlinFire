@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.annotation.*
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.BracketBlock
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*

class IfPlayerCategory<T> internal constructor(private val template: io.github.flyingpig525.base.Template<T>) where T : Item, T : io.github.flyingpig525.base.JsonData {
    private val blocks = template.blocks

    private fun block(
        items: io.github.flyingpig525.base.Items<T>,
        action: String,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit,
        not: Boolean = false
    ) {
        blocks += Block("if_player", ItemCollection(items).items, action, if (not) "attribute: \"NOT\"" else "")
        blocks += BracketBlock(type = "norm")
        blocks += io.github.flyingpig525.base.Template(
            io.github.flyingpig525.base.Template.Type.NONE,
            a = wrappedCode
        ).blocks
        blocks += BracketBlock(false, "norm")
    }

    fun chain(a: IfPlayerCategory<T>.() -> Unit) {
        apply(a)
    }

    /**
     * Checks if a player is looking at
     * the given block or location.
     *
     * ARGUMENTS:
     *
     * (*)[BLOCK](s)
     *
     * Block to check for
     *
     * [LocItem](s)
     *
     * Location to check for
     *
     * (*)[NumItem]
     *
     * Maximum distance from
     * target block/location
     *
     * (*) = Optional
     */
    fun isLookingAt(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsLookingAt", wrappedCode, not)

    /**
     * Checks if a player (or a location)
     * is within their world border.
     *
     * ARGUMENTS:
     *
     * (*)[LocItem]
     *
     * Location to check
     *
     * (*) = Optional
     */
    @Emperor
    fun inWorldBorder(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "InWorldBorder", wrappedCode, not)

    /**
     * Checks if a player is in
     * a specific game mode.
     */
    fun isInGameMode(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsInGameMode", wrappedCode, not)

    /**
     * Checks if a player's inventory
     * has room for one or more
     * items to be given.
     *
     * ARGUMENTS:
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

    fun isHoldingOff(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsHoldingOff", wrappedCode, not)

    /**
     * Checks if a player is
     * using a plot resource
     * pack.
     */
    @Overlord
    fun usingPack(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "UsingPack", wrappedCode, not)

    /**
     * Checks if a player does not have a
     * cooldown applied to an item type.
     *
     * ARGUMENTS:
     *
     * Any Item(s)
     *
     * Item type(s) to check
     *
     * (*) = Optional
     */
    fun noItemCooldown(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "NoItemCooldown", wrappedCode, not)

    /**
     * Checks if a player is currently
     * using an item (eg. bow).
     *
     * ARGUMENTS:
     *
     * (*)Any Item(s)
     *
     * Item(s) to check
     *
     * (*) = Optional
     */
    fun isUsingItem(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsUsingItem", wrappedCode, not)

    fun hasAllItems(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "HasAllItems", wrappedCode, not)

    /**
     * Checks if a player
     * is in water or lava.
     */
    fun isSwimming(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsSwimming", wrappedCode, not)

    /**
     * Checks if a player has an item
     * in their inventory.
     *
     * ARGUMENTS:
     *
     * Any Item(s)
     *
     * Item(s) to check for
     *
     * (*) = Optional
     */
    fun hasItem(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "HasItem", wrappedCode, not)

    @Emperor
    fun blockEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "BlockEquals", wrappedCode, not)

    /**
     * Checks if a player is wearing
     * an item.
     *
     * ARGUMENTS:
     *
     * Any Item(s)
     *
     * Item(s) to check for
     *
     * (*) = Optional
     */
    fun isWearing(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsWearing", wrappedCode, not)

    /**
     * Checks if a player is within a
     * range of a location.
     *
     * ARGUMENTS:
     *
     * [LocItem](s)
     *
     * Center location
     *
     * (*)[NumItem]
     *
     * Radius
     *
     * (*) = Optional
     */
    fun isNear(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsNear", wrappedCode, not)

    fun isRiding(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsRiding", wrappedCode, not)

    fun standingOn(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "StandingOn", wrappedCode, not)

    fun cmdEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "CmdEquals", wrappedCode, not)

    /**
     * Checks if a player is
     * supported by a block.
     */
    fun isGrounded(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsGrounded", wrappedCode, not)

    /**
     * Checks if the item that is being moved
     * with a player's cursor is the given item.
     *
     * ARGUMENTS:
     *
     * (*)Any Item(s)
     *
     * Items(s) to check for
     *
     * (*) = Optional
     */
    fun cursorItem(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "CursorItem", wrappedCode, not)

    /**
     * Checks if a player's currently
     * selected hotbar slot equals the
     * given slot ID.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Slot ID to check
     *
     * (*) = Optional
     */
    fun slotEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "SlotEquals", wrappedCode, not)

    fun itemEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "ItemEquals", wrappedCode, not)

    fun isHoldingMain(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsHoldingMain", wrappedCode, not)

    /**
     * Checks if a player is holding
     * an item in their hand.
     *
     * ARGUMENTS:
     *
     * (*)Any Item(s)
     *
     * Item(s) to check for
     *
     * (*) = Optional
     */
    fun isHolding(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsHolding", wrappedCode, not)

    /**
     * Checks if a player's currently
     * open inventory menu contains
     * an item in the given slot.
     *
     * ARGUMENTS:
     *
     * [NumItem](s)
     *
     * Slot(s) to check
     *
     * (*)Any Item(s)
     *
     * Item(s) to check for
     *
     * (*) = Optional
     */
    fun menuSlotEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "MenuSlotEquals", wrappedCode, not)

    /**
     * Checks if a player is
     * blocking with a shield.
     */
    fun isBlocking(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsBlocking", wrappedCode, not)

    /**
     * Checks if a player has a certain
     * level of access on this plot, such
     * as builder or owner.
     */
    fun hasPermission(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "HasPermission", wrappedCode, not)

    /**
     * Checks if a player's main hand
     * is their left or right hand.
     */
    fun mainHandEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "MainHandEquals", wrappedCode, not)

    /**
     * Checks if a player is sneaking.
     */
    fun isSneaking(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsSneaking", wrappedCode, not)

    /**
     * Checks if a player is flying.
     */
    fun isFlying(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsFlying", wrappedCode, not)

    /**
     * Checks if a player has a
     * potion effect of the given
     * type active.
     *
     * ARGUMENTS:
     *
     * [POTION](s)
     *
     * Effect(s)
     * to check for
     *
     * (*) = Optional
     */
    fun hasPotion(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "HasPotion", wrappedCode, not)

    /**
     * Checks if a player's username is
     * equal to one of the given
     * usernames (case insensitive).
     *
     * ARGUMENTS:
     *
     * [TextItem](s)
     *
     * Name(s) to check for
     *
     * (*) = Optional
     */
    fun nameEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "NameEquals", wrappedCode, not)

    /**
     * Checks if a player has a
     * certain inventory type open.
     */
    fun invOpen(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "InvOpen", wrappedCode, not)

    /**
     * Checks if a player has an item
     * in the given inventory slot.
     *
     * ARGUMENTS:
     *
     * [NumItem](s)
     *
     * Slot(s) to check
     *
     * (*)Any Item(s)
     *
     * Item(s) to check for
     *
     * (*) = Optional
     */
    fun hasSlotItem(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "HasSlotItem", wrappedCode, not)

    /**
     * Checks if a player is sprinting
     * or using the sprint key to swim.
     */
    fun isSprinting(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsSprinting", wrappedCode, not)

    /**
     * Checks if a player is
     * gliding with elytra.
     */
    fun isGliding(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "IsGliding", wrappedCode, not)

    fun cmdArgEquals(
        items: io.github.flyingpig525.base.Items<T>,
        not: Boolean = false,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "CmdArgEquals", wrappedCode, not)

}