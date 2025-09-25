package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.BracketBlock
import io.github.flyingpig525.base.block.ElseOperation
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*
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
	 * *Checks if a player's inventory*
	 * *has room for one or more*
	 * *items to be given.*
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * *Item(s) to check with*
	 *
	 * (*) = optional
	 */
	fun hasRoomForItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "HasRoomForItem", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun isHoldingOff(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsHoldingOff", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player does not have a*
	 * *cooldown applied to an item type.*
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * *Item type(s) to check*
	 *
	 * (*) = optional
	 */
	fun noItemCooldown(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "NoItemCooldown", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is currently*
	 * *using an item (eg. bow).*
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item(s) to check*
	 *
	 * (*) = optional
	 */
	fun isUsingItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsUsingItem", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun hasAllItems(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "HasAllItems", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player has an item*
	 * *in their inventory.*
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * *Item(s) to check for*
	 *
	 * (*) = optional
	 */
	fun hasItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "HasItem", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun blockEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "BlockEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is wearing*
	 * *an item.*
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * *Item(s) to check for*
	 *
	 * (*) = optional
	 */
	fun isWearing(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsWearing", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is within a*
	 * *range of a location.*
	 *
	 * **Args:**
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
	fun isNear(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsNear", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun isRiding(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsRiding", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun cmdEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "CmdEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if the item that is being moved*
	 * *with a player's cursor is the given item.*
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Items(s) to check for*
	 *
	 * (*) = optional
	 */
	fun cursorItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "CursorItem", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player's currently*
	 * *selected hotbar slot equals the*
	 * *given slot ID.*
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * *Slot ID to check*
	 *
	 * (*) = optional
	 */
	fun slotEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "SlotEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun itemEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ItemEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player's currently*
	 * *open inventory menu contains*
	 * *an item in the given slot.*
	 *
	 * **Args:**
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
	fun menuSlotEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "MenuSlotEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player has a certain*
	 * *level of access on this plot, such*
	 * *as builder or owner.*
	 */
	fun hasPermission(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "HasPermission", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player's main hand*
	 * *is their left or right hand.*
	 */
	fun mainHandEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "MainHandEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is sneaking.*
	 */
	fun isSneaking(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsSneaking", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is holding*
	 * *a specific movement key.*
	 */
	fun movementKey(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "MovementKey", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is flying.*
	 */
	fun isFlying(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsFlying", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player has a*
	 * *certain inventory type open.*
	 */
	fun invOpen(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "InvOpen", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player has an item*
	 * *in the given inventory slot.*
	 *
	 * **Args:**
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
	fun hasSlotItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "HasSlotItem", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is sprinting*
	 * *or using the sprint key to swim.*
	 */
	fun isSprinting(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsSprinting", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is*
	 * *gliding with elytra.*
	 */
	fun isGliding(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsGliding", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun cmdArgEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "CmdArgEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is looking at*
	 * *the given block or location.*
	 *
	 * **Args:**
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
	fun isLookingAt(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsLookingAt", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player (or a location)*
	 * *is within their world border.*
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * *Location to check*
	 *
	 * (*) = optional
	 */
	fun inWorldBorder(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "InWorldBorder", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is in*
	 * *a specific game mode.*
	 */
	fun isInGameMode(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsInGameMode", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is*
	 * *using a plot resource*
	 * *pack.*
	 */
	fun usingPack(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "UsingPack", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player*
	 * *is in water or lava.*
	 */
	fun isSwimming(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsSwimming", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun standingOn(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "StandingOn", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is*
	 * *supported by a block.*
	 */
	fun isGrounded(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsGrounded", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player owns a plot*
	 * *product or is a developer or*
	 * *builder.*
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * *Product ID*
	 *
	 * (*) = optional
	 */
	fun ownsProduct(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "OwnsProduct", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun isHoldingMain(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsHoldingMain", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is holding*
	 * *an item in their hand.*
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item(s) to check for*
	 *
	 * (*) = optional
	 */
	fun isHolding(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsHolding", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player is*
	 * *blocking with a shield.*
	 */
	fun isBlocking(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsBlocking", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player's hitbox is*
	 * *within a range of a location.*
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * *Center location*
	 *
	 * [NumItem]
	 *
	 * (*) *Range*
	 *
	 * (*) = optional
	 */
	fun isHitboxNear(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsHitboxNear", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player has a*
	 * *potion effect of the given*
	 * *type active.*
	 *
	 * **Args:**
	 *
	 * [PotionItem]
	 *
	 * *Effect(s)*
	 * *to check for*
	 *
	 * (*) = optional
	 */
	fun hasPotion(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "HasPotion", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player's username is*
	 * *equal to one of the given*
	 * *usernames (case insensitive).*
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * *Name(s) to check for*
	 *
	 * (*) = optional
	 */
	fun nameEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "NameEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a player can fly.*
	 */
	fun canFly(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "CanFly", wrappedCode, not)
		return ElseOperation()
	}

}