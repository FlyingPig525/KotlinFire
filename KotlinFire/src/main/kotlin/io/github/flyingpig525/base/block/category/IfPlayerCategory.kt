package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.*
import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.block.subaction.*
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put

class IfPlayerCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(
        items: Items,
        action: String,
        wrappedCode: Template.() -> Unit,
        not: Boolean = false,
        extra: JsonObjectBuilder.() -> Unit = {}
    ) {
        blocks += Block("if_player", ItemCollection(items).items, action) {
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
	 * *Checks if a player is looking at*
	 * *the given block or location.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Block to check for*
	 *
	 * [LocItem]
	 *
	 * *Location to check for*
	 *
	 * [NumItem]
	 *
	 * (*) *Maximum distance from*
	 * (*) *target block/location*
	 *
	 * (*) = optional
	 */
	fun isLookingAt(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsLookingAt", wrappedCode, not)


	/**
	 * *Checks if a player (or a location)*
	 * *is within their world border.*
	 *
	 * #### Args:
	 *
	 * [LocItem]
	 *
	 * (*) *Location to check*
	 *
	 * (*) = optional
	 */
	fun inWorldBorder(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "InWorldBorder", wrappedCode, not)


	/**
	 * *Checks if a player is in*
	 * *a specific game mode.*
	 */
	fun isInGameMode(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsInGameMode", wrappedCode, not)


	/**
	 * *Checks if a player's inventory*
	 * *has room for one or more*
	 * *items to be given.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item(s) to check with*
	 *
	 * (*) = optional
	 */
	fun hasRoomForItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "HasRoomForItem", wrappedCode, not)


	/**
	 */
	fun isHoldingOff(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsHoldingOff", wrappedCode, not)


	/**
	 * *Checks if a player is*
	 * *using a plot resource*
	 * *pack.*
	 */
	fun usingPack(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "UsingPack", wrappedCode, not)


	/**
	 * *Checks if a player does not have a*
	 * *cooldown applied to an item type.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Item type(s) to check*
	 *
	 * (*) = optional
	 */
	fun noItemCooldown(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "NoItemCooldown", wrappedCode, not)


	/**
	 * *Checks if a player is currently*
	 * *using an item (eg. bow).*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item(s) to check*
	 *
	 * (*) = optional
	 */
	fun isUsingItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsUsingItem", wrappedCode, not)


	/**
	 */
	fun hasAllItems(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "HasAllItems", wrappedCode, not)


	/**
	 * *Checks if a player*
	 * *is in water or lava.*
	 */
	fun isSwimming(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsSwimming", wrappedCode, not)


	/**
	 * *Checks if a player has an item*
	 * *in their inventory.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Item(s) to check for*
	 *
	 * (*) = optional
	 */
	fun hasItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "HasItem", wrappedCode, not)


	/**
	 */
	fun blockEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "BlockEquals", wrappedCode, not)


	/**
	 * *Checks if a player is wearing*
	 * *an item.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Item(s) to check for*
	 *
	 * (*) = optional
	 */
	fun isWearing(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsWearing", wrappedCode, not)


	/**
	 * *Checks if a player is within a*
	 * *range of a location.*
	 *
	 * #### Args:
	 *
	 * [LocItem]
	 *
	 * *Center location*
	 *
	 * [NumItem]
	 *
	 * (*) *Radius*
	 *
	 * (*) = optional
	 */
	fun isNear(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsNear", wrappedCode, not)


	/**
	 */
	fun isRiding(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsRiding", wrappedCode, not)


	/**
	 */
	fun standingOn(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "StandingOn", wrappedCode, not)


	/**
	 */
	fun cmdEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "CmdEquals", wrappedCode, not)


	/**
	 * *Checks if a player is*
	 * *supported by a block.*
	 */
	fun isGrounded(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsGrounded", wrappedCode, not)


	/**
	 * *Checks if the item that is being moved*
	 * *with a player's cursor is the given item.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Items(s) to check for*
	 *
	 * (*) = optional
	 */
	fun cursorItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "CursorItem", wrappedCode, not)


	/**
	 * *Checks if a player's currently*
	 * *selected hotbar slot equals the*
	 * *given slot ID.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Slot ID to check*
	 *
	 * (*) = optional
	 */
	fun slotEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "SlotEquals", wrappedCode, not)


	/**
	 */
	fun itemEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "ItemEquals", wrappedCode, not)


	/**
	 */
	fun isHoldingMain(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsHoldingMain", wrappedCode, not)


	/**
	 * *Checks if a player is holding*
	 * *an item in their hand.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item(s) to check for*
	 *
	 * (*) = optional
	 */
	fun isHolding(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsHolding", wrappedCode, not)


	/**
	 * *Checks if a player's currently*
	 * *open inventory menu contains*
	 * *an item in the given slot.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Slot(s) to check*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item(s) to check for*
	 *
	 * (*) = optional
	 */
	fun menuSlotEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "MenuSlotEquals", wrappedCode, not)


	/**
	 * *Checks if a player is*
	 * *blocking with a shield.*
	 */
	fun isBlocking(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsBlocking", wrappedCode, not)


	/**
	 * *Checks if a player has a certain*
	 * *level of access on this plot, such*
	 * *as builder or owner.*
	 */
	fun hasPermission(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "HasPermission", wrappedCode, not)


	/**
	 * *Checks if a player's main hand*
	 * *is their left or right hand.*
	 */
	fun mainHandEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "MainHandEquals", wrappedCode, not)


	/**
	 * *Checks if a player is sneaking.*
	 */
	fun isSneaking(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsSneaking", wrappedCode, not)


	/**
	 * *Checks if a player is flying.*
	 */
	fun isFlying(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsFlying", wrappedCode, not)


	/**
	 * *Checks if a player has a*
	 * *potion effect of the given*
	 * *type active.*
	 *
	 * #### Args:
	 *
	 * [PotionItem]
	 *
	 * *Effect(s)*
	 * *to check for*
	 *
	 * (*) = optional
	 */
	fun hasPotion(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "HasPotion", wrappedCode, not)


	/**
	 * *Checks if a player's username is*
	 * *equal to one of the given*
	 * *usernames (case insensitive).*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Name(s) to check for*
	 *
	 * (*) = optional
	 */
	fun nameEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "NameEquals", wrappedCode, not)


	/**
	 * *Checks if a player has a*
	 * *certain inventory type open.*
	 */
	fun invOpen(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "InvOpen", wrappedCode, not)


	/**
	 * *Checks if a player has an item*
	 * *in the given inventory slot.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Slot(s) to check*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item(s) to check for*
	 *
	 * (*) = optional
	 */
	fun hasSlotItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "HasSlotItem", wrappedCode, not)


	/**
	 * *Checks if a player is sprinting*
	 * *or using the sprint key to swim.*
	 */
	fun isSprinting(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsSprinting", wrappedCode, not)


	/**
	 * *Checks if a player is*
	 * *gliding with elytra.*
	 */
	fun isGliding(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "IsGliding", wrappedCode, not)


	/**
	 */
	fun cmdArgEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit) = block(items, "CmdArgEquals", wrappedCode, not)

}