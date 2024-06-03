package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.annotation.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.BracketBlock
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection

class IfPlayerCategory <T> internal constructor(private val template: Template<T>) where T : Item, T : JsonData {
	private val blocks = template.blocks

	private fun block(items: Items<T>, action: String, wrappedCode: Template<T>.() -> Unit) {
		blocks += Block("if_player", ItemCollection(items).items, action)
		blocks += BracketBlock(type = "norm")
		blocks += Template(Template.Type.NONE, a = wrappedCode).blocks
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
	fun isLookingAt(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsLookingAt", wrappedCode)
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
	fun inWorldBorder(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "InWorldBorder", wrappedCode)
	/**
	 * Checks if a player is in
	 * a specific game mode.
	 */
	fun isInGameMode(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsInGameMode", wrappedCode)
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
	fun hasRoomForItem(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "HasRoomForItem", wrappedCode)
	fun isHoldingOff(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsHoldingOff", wrappedCode)
	/**
	 * Checks if a player is
	 * using a plot resource
	 * pack.
	 */
	@Overlord
	fun usingPack(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "UsingPack", wrappedCode)
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
	fun noItemCooldown(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "NoItemCooldown", wrappedCode)
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
	fun isUsingItem(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsUsingItem", wrappedCode)
	fun hasAllItems(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "HasAllItems", wrappedCode)
	/**
	 * Checks if a player
	 * is in water or lava.
	 */
	fun isSwimming(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsSwimming", wrappedCode)
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
	fun hasItem(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "HasItem", wrappedCode)
	@Emperor
	fun blockEquals(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "BlockEquals", wrappedCode)
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
	fun isWearing(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsWearing", wrappedCode)
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
	fun isNear(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsNear", wrappedCode)
	fun isRiding(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsRiding", wrappedCode)
	fun standingOn(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "StandingOn", wrappedCode)
	fun cmdEquals(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "CmdEquals", wrappedCode)
	/**
	 * Checks if a player is
	 * supported by a block.
	 */
	fun isGrounded(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsGrounded", wrappedCode)
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
	fun cursorItem(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "CursorItem", wrappedCode)
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
	fun slotEquals(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "SlotEquals", wrappedCode)
	fun itemEquals(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "ItemEquals", wrappedCode)
	fun isHoldingMain(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsHoldingMain", wrappedCode)
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
	fun isHolding(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsHolding", wrappedCode)
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
	fun menuSlotEquals(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "MenuSlotEquals", wrappedCode)
	/**
	 * Checks if a player is
	 * blocking with a shield.
	 */
	fun isBlocking(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsBlocking", wrappedCode)
	/**
	 * Checks if a player has a certain
	 * level of access on this plot, such
	 * as builder or owner.
	 */
	fun hasPermission(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "HasPermission", wrappedCode)
	/**
	 * Checks if a player's main hand
	 * is their left or right hand.
	 */
	fun mainHandEquals(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "MainHandEquals", wrappedCode)
	/**
	 * Checks if a player is sneaking.
	 */
	fun isSneaking(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsSneaking", wrappedCode)
	/**
	 * Checks if a player is flying.
	 */
	fun isFlying(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsFlying", wrappedCode)
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
	fun hasPotion(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "HasPotion", wrappedCode)
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
	fun nameEquals(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "NameEquals", wrappedCode)
	/**
	 * Checks if a player has a
	 * certain inventory type open.
	 */
	fun invOpen(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "InvOpen", wrappedCode)
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
	fun hasSlotItem(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "HasSlotItem", wrappedCode)
	/**
	 * Checks if a player is sprinting
	 * or using the sprint key to swim.
	 */
	fun isSprinting(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsSprinting", wrappedCode)
	/**
	 * Checks if a player is
	 * gliding with elytra.
	 */
	fun isGliding(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "IsGliding", wrappedCode)
	fun cmdArgEquals(items: Items<T>, wrappedCode: Template<T>.() -> Unit) = block(items, "CmdArgEquals", wrappedCode)

}