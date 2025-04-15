package io.github.flyingpig525.base.item.type.gamevalue

import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*

object EventValues {
	/**
	 * *Gets the location of*
	 * *the block in this event.*
	 *
	 * **Type:** [LocItem]
	 *
	 * *Block center*
	 */
	val EventBlockLocation get() = GameValue<LocItem>("Event Block Location")

	/**
	 * *Gets the side of the block*
	 * *that was hit in this event*
	 * *as a direction.*
	 *
	 * **Type:** [VecItem]
	 *
	 * *Block side*
	 */
	val EventBlockSide get() = GameValue<VecItem>("Event Block Side")

	/**
	 * *Gets the amount of damage*
	 * *dealt in this event.*
	 * *Includes damage reduction.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 or above*
	 *
	 * **Additional Info**
	 *
	 * *§c❤§7 = §c2§7 Health*
	 */
	val EventDamage get() = GameValue<NumItem>("Event Damage")

	/**
	 * *Gets the type of damage taken or dealt*
	 * *in this event.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Damage Cause:*
	 * *"block_explosion", "contact" (cactus),*
	 * *"cramming", "custom" (damage action),*
	 * *"dragon_breath", "drowning", "dryout",*
	 * *(fish on land), "entity_attack",*
	 * *"entity_explosion", "entity_sweep_attack",*
	 * *"fall", "falling_block", "fire" (in fire block),*
	 * *"fire_tick", "fly_into_wall", "hot_floor",*
	 * *(magma block), "kill", "lava", "magic",*
	 * *"melting" (snowman), "poison", "projectile",*
	 * *"starvation", "suffocation", "thorns", "void",*
	 * *"wither", "world_border", "freeze"*
	 */
	val DamageEventCause get() = GameValue<StringItem>("Damage Event Cause")

	/**
	 * *Gets the amount of damage*
	 * *dealt in this event*
	 * *before any damage reductions.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 or above*
	 *
	 * **Additional Info**
	 *
	 * *§c❤§7 = §c2§7 Health*
	 */
	val RawEventDamage get() = GameValue<NumItem>("Raw Event Damage")

	/**
	 * *Gets the death message for*
	 * *this death event.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Death message*
	 */
	val EventDeathMessage get() = GameValue<StringItem>("Event Death Message")

	/**
	 * *Gets the amount of health*
	 * *regained in this event.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Health regained*
	 *
	 * **Additional Info**
	 *
	 * *§c❤§7 = §c2§7 Health*
	 */
	val EventHealAmount get() = GameValue<NumItem>("Event Heal Amount")

	/**
	 * *Gets the reason the target*
	 * *regained health in this event.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Healing Cause:*
	 * *"natural" (natural regeneration),*
	 * *"magic" (instant health effect),*
	 * *"magic_regen" (regen effect),*
	 * *"custom" (code)*
	 */
	val HealEventCause get() = GameValue<StringItem>("Heal Event Cause")

	/**
	 * *Gets the locations of blocks*
	 * *affected by the explosion*
	 * *in this event.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one Location*
	 * *entry for each block*
	 */
	val EventExplosionAffectedBlocks get() = GameValue<VarItem>("Event Explosion Affected Blocks")

	/**
	 * *Gets the percentage of*
	 * *power this event was*
	 * *executed with.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0% to 100.0%*
	 */
	val EventPower get() = GameValue<NumItem>("Event Power")

	/**
	 * *Gets the entire command line*
	 * *entered in this event.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Command, with the*
	 * *first "@" excluded*
	 */
	val EventCommand get() = GameValue<StringItem>("Event Command")

	/**
	 * *Gets the separated parts*
	 * *of the event command.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one String*
	 * *entry for each word in the*
	 * *command (split by " ")*
	 */
	val EventCommandArguments get() = GameValue<VarItem>("Event Command Arguments")

	/**
	 * *Gets the item in an item*
	 * *related event.*
	 *
	 * **Type:** [MinecraftItem]
	 *
	 * *Main item in*
	 * *event*
	 */
	val EventItem get() = GameValue<MinecraftItem>("Event Item")

	/**
	 * *Gets the hotbar slot being*
	 * *changed to in this event.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *1 (leftmost slot)*
	 * *to 9 (rightmost slot)*
	 */
	val EventHotbarSlot get() = GameValue<NumItem>("Event Hotbar Slot")

	/**
	 * *Gets the index of the*
	 * *clicked inventory slot*
	 * *in this event.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *From 1 (first slot)*
	 * *up to the inventory's size*
	 */
	val EventClickedSlotIndex get() = GameValue<NumItem>("Event Clicked Slot Index")

	/**
	 * *Gets the inventory item*
	 * *clicked on in this event.*
	 *
	 * **Type:** [MinecraftItem]
	 *
	 * *Item in slot*
	 * *(before the click event)*
	 */
	val EventClickedSlotItem get() = GameValue<MinecraftItem>("Event Clicked Slot Item")

	/**
	 * *Gets the inventory item*
	 * *clicked with in this event.*
	 *
	 * **Type:** [MinecraftItem]
	 *
	 * *Item in slot*
	 * *(after the click event)*
	 */
	val EventClickedSlotNewItem get() = GameValue<MinecraftItem>("Event Clicked Slot New Item")

	/**
	 * *Gets the reason the target's*
	 * *inventory was closed in this*
	 * *event.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Close Cause:*
	 * *"player", "code", "open_new",*
	 * *"teleport", "unloaded",*
	 * *"cant_use", "disconnect",*
	 * *"death", "unknown"*
	 */
	val CloseInventoryEventCause get() = GameValue<StringItem>("Close Inventory Event Cause")

	/**
	 * *Gets the click type in this*
	 * *inventory click event.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Click Type:*
	 * *"left", "shift_left", "double_left",*
	 * *"right", "shift_right",*
	 * *"drop" (Q), "drop_stack" (Ctrl+Q),*
	 * *"copy" (middle click), "creative",*
	 * *"swap_offhand" (F),*
	 * *"swap_hotbar" (1 ... 9)*
	 */
	val InventoryEventClickType get() = GameValue<StringItem>("Inventory Event Click Type")

	/**
	 * *Gets the cause of this*
	 * *fish event.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Event Type:*
	 * *"cast", "bite", "catch",*
	 * *"cancel", "cancel_block",*
	 * *"miss", "pull_entity"*
	 */
	val FishEventCause get() = GameValue<StringItem>("Fish Event Cause")

	/**
	 * *Gets the reason the player*
	 * *was teleported in this*
	 * *event.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Teleport Cause:*
	 * *"code", "ender_pearl",*
	 * *"chorus_fruit", "unknown",*
	 */
	val TeleportEventCause get() = GameValue<StringItem>("Teleport Event Cause")

	/**
	 * *Gets the location that will be*
	 * *teleported to in this event.*
	 *
	 * **Type:** [LocItem]
	 *
	 * *Location*
	 */
	val TeleportLocation get() = GameValue<LocItem>("Teleport Location")

	/**
	 * *Gets the reason the target*
	 * *became exhausted in this*
	 * *event.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Exhaustion Cause:*
	 * *"attack", "block_mined", "custom",*
	 * *"crouch", "damaged", "hunger_effect",*
	 * *"jump", "jump_sprint", "none",*
	 * *"regen", "sprint", "swim", "walk",*
	 * *"walk_on_water", "walk_underwater",*
	 */
	val ExhaustionEventCause get() = GameValue<StringItem>("Exhaustion Event Cause")

	/**
	 * *Gets the amount of exhaustion*
	 * *gained in this event.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Number*
	 */
	val EventExhaustion get() = GameValue<NumItem>("Event Exhaustion")

	/**
	 * *Gets the reason the target*
	 * *transformed in this event.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Transform Cause:*
	 * *"cured" (Zombie Villager → Villager),*
	 * *"drowned" (Zombie → Drowned),*
	 * *"frozen" (Skeleton → Stray),*
	 * *"infection" (Villager → Zombie Villager),*
	 * *"metamorphosis" (Tadpole → Frog),*
	 * *"sheared" (Mooshroom → Cow),*
	 * *"split" (Slime → Small Slimes),*
	 * *"lightning", "piglin_zombified",*
	 * *"unknown"*
	 */
	val TransformEventCause get() = GameValue<StringItem>("Transform Event Cause")

	/**
	 * *Gets the entities an*
	 * *entity transforms into.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *UUIDs of the new entity/entities*
	 */
	val EventTransformEntities get() = GameValue<VarItem>("Event Transform Entities")

	/**
	 * *Gets the type of object that*
	 * *the projectile collided with*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Hit Type:*
	 * *"block", "entity"*
	 */
	val EventHitType get() = GameValue<StringItem>("Event Hit Type")

}