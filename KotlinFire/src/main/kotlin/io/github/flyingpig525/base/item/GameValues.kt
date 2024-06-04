@file:Suppress("UNUSED")
package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.item.type.GameValue

object StatisticalValues {
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's remaining
	 * health points.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0 (dead) up
	 * to the target's maximum
	 * health (20.0 by default)
	 */
	val CurrentHealth = GameValue("Current Health")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's maximum
	 * health points.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Maximum
	 * health, 1.0 or above
	 */
	val MaximumHealth = GameValue("Maximum Health")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's
	 * absorption health
	 * (golden hearts).
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Absorption
	 * health
	 */
	val AbsorptionHealth = GameValue("Absorption Health")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's remaining
	 * food points.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0 (starving)
	 * to 20 (full bar)
	 */
	val FoodLevel = GameValue("Food Level")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's saturation level,
	 * which depends on the types
	 * of food consumed.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0 (minimum), up to
	 * the player's food level
	 */
	val FoodSaturation = GameValue("Food Saturation")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's exhaustion
	 * level, which is increased
	 * by the player's actions.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0 (minimum) to
	 * 4.0 (reset point)
	 */
	val FoodExhaustion = GameValue("Food Exhaustion")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's attack damage,
	 * which has a base value that
	 * can be altered by items.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0 or higher
	 * (more damage)
	 */
	val AttackDamage = GameValue("Attack Damage")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's attack speed,
	 * which has a base value that
	 * can be altered by items.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0 or higher
	 * (faster)
	 */
	val AttackSpeed = GameValue("Attack Speed")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's current attack
	 * cooldown as a percentage of the
	 * way to fully charged
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0 (fully uncharged)
	 * to 100.0 (fully charged)
	 */
	val AttackCooldown = GameValue("Attack Cooldown")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the number of ticks
	 * it will take to fully charge a
	 * target's attack cooldown after
	 * attacking with their held item.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0 (instant)
	 * or above
	 */
	val AttackCooldownTicks = GameValue("Attack Cooldown Ticks")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's armor points,
	 * which has a base value that
	 * can be altered by items.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0 (no armor)
	 * to 20.0 (full bar)
	 */
	val ArmorPoints = GameValue("Armor Points")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's armor toughness,
	 * which has a base value that
	 * can be altered by items.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0 or above (full
	 * set of diamond armor = 8.0)
	 */
	val ArmorToughness = GameValue("Armor Toughness")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's remaining
	 * ticks of invulnerability.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0 (can be hurt)
	 * or above (invulnerable)
	 */
	val InvulnerabilityTicks = GameValue("Invulnerability Ticks")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's experience
	 * level.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0 (no levels)
	 * or above
	 */
	val ExperienceLevel = GameValue("Experience Level")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's experience
	 * progress percentage to
	 * the next level.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0% (no progress)
	 * to 100.0% (next level)
	 */
	val ExperienceProgress = GameValue("Experience Progress")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the remaining ticks a
	 * target is on fire for.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0 (not on fire)
	 * or above (burning)
	 */
	val FireTicks = GameValue("Fire Ticks")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the remaining ticks a
	 * target is freezing for.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0 (not frozen)
	 * or above (freezing)
	 */
	val FreezeTicks = GameValue("Freeze Ticks")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's remaining
	 * air ticks.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0 (drowning)
	 * to 300 (maximum air)
	 */
	val RemainingAir = GameValue("Remaining Air")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's distance fallen
	 * in blocks.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0 (not falling)
	 * or higher (falling down)
	 */
	val FallDistance = GameValue("Fall Distance")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's selected
	 * hotbar slot index.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 1 (leftmost slot)
	 * to 9 (rightmost slot)
	 */
	val HeldSlot = GameValue("Held Slot")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the latency between
	 * a player and the server
	 * in milliseconds.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Player ping
	 * ,,╻╻┃ 0 to 149
	 * ,,╻╻┃ 150 to 299
	 * ,,╻╻┃ 300 to 599
	 * ,,╻╻┃ 600 to 999
	 * ,,╻╻┃ over 1000
	 */
	val Ping = GameValue("Ping")
	/**
	 * DESCRIPTION:
	 *
	 * While a player is steering
	 * an entity, gets the sideways
	 * movement of the steering.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * -1.0 (right)
	 * to 1.0 (left)
	 */
	val SteerSidewaysMovement = GameValue("Steer Sideways Movement")
	/**
	 * DESCRIPTION:
	 *
	 * While a player is steering
	 * an entity, gets the forward
	 * movement of the steering.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * -1.0 (backward)
	 * to 1.0 (forward)
	 */
	val SteerForwardMovement = GameValue("Steer Forward Movement")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the progress percentage
	 * of a target using their held
	 * item, such as food.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0 (not using an item),
	 * or 0.0% (start) to 100.0%
	 */
	val ItemUsageProgress = GameValue("Item Usage Progress")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the width of an entity's
	 * bounding box.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Width in blocks
	 */
	val EntityWidth = GameValue("Entity Width")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the height of an entity's
	 * bounding box.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Height in blocks
	 */
	val EntityHeight = GameValue("Entity Height")

}
object LocationalValues {
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's location.
	 *
	 * RETURNS:
	 *
	 * [LocItem]
	 *
	 * Location and
	 * rotation, at feet height
	 */
	val Location = GameValue("Location")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the location of the
	 * block a target is looking at.
	 *
	 * RETURNS:
	 *
	 * [LocItem]
	 *
	 * Block center
	 */
	val TargetBlockLocation = GameValue("Target Block Location")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the side of the
	 * block a target is looking
	 * at as a direction.
	 *
	 * RETURNS:
	 *
	 * [VecItem]
	 *
	 * Block side
	 */
	val TargetBlockSide = GameValue("Target Block Side")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's location, but
	 * adjusted to its eye height.
	 *
	 * RETURNS:
	 *
	 * [LocItem]
	 *
	 * Eye location
	 * and rotation
	 */
	val EyeLocation = GameValue("Eye Location")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the X coordinate
	 * of a target's position.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Coordinate
	 */
	val XCoordinate = GameValue("X-Coordinate")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the Y coordinate
	 * of a target's position.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Coordinate
	 */
	val YCoordinate = GameValue("Y-Coordinate")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the Z coordinate
	 * of a target's position.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Coordinate
	 */
	val ZCoordinate = GameValue("Z-Coordinate")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the location of the center of
	 * the target's bounding box.
	 *
	 * RETURNS:
	 *
	 * [LocItem]
	 *
	 * Location and
	 * rotation, at midpoint
	 */
	val MidpointLocation = GameValue("Midpoint Location")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the pitch (up/down
	 * rotation) of a target's
	 * position.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * -90.0 to 90.0
	 */
	val Pitch = GameValue("Pitch")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the yaw (left/right
	 * rotation) of a target's
	 * position.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * -180.0 to 180.0
	 */
	val Yaw = GameValue("Yaw")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the yaw (left/right
	 * rotation) of a target's
	 * body.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * -180.0 to 180.0
	 */
	val BodyYaw = GameValue("Body Yaw")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the location of the block
	 * that is supporting the player.
	 *
	 * RETURNS:
	 *
	 * [LocItem]
	 *
	 * Block center
	 */
	val StandingBlockLocation = GameValue("Standing Block Location")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's original spawn
	 * location.
	 *
	 * RETURNS:
	 *
	 * [LocItem]
	 *
	 * Location this
	 * entity was created at
	 */
	val SpawnLocation = GameValue("Spawn Location")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the speed at which a
	 * target is moving (not walking)
	 * in each direction.
	 *
	 * RETURNS:
	 *
	 * [VecItem]
	 *
	 * Movement velocity
	 */
	val Velocity = GameValue("Velocity")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the looking direction
	 * of a target's location as
	 * a vector.
	 *
	 * RETURNS:
	 *
	 * [VecItem]
	 *
	 * Direction vector
	 * (length of 1.0)
	 */
	val Direction = GameValue("Direction")

}
object ItemValues {
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's currently
	 * held item.
	 *
	 * RETURNS:
	 *
	 * [Any Item]
	 *
	 * Item in the
	 * selected hotbar slot
	 */
	val MainHandItem = GameValue("Main Hand Item")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's currently
	 * held off hand item.
	 *
	 * RETURNS:
	 *
	 * [Any Item]
	 *
	 * Item in the
	 * offhand slot
	 */
	val OffHandItem = GameValue("Off Hand Item")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the items in a target's
	 * armor slots.
	 *
	 * RETURNS:
	 *
	 * [LIST]
	 *
	 * Contains one Item
	 * entry for each armor
	 * slot (air if empty, 4 in
	 * total)
	 */
	val ArmorItems = GameValue("Armor Items")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's current
	 * hotbar items.
	 *
	 * RETURNS:
	 *
	 * [LIST]
	 *
	 * Contains one Item
	 * entry for each hotbar
	 * slot (air if empty, 9 in
	 * total)
	 */
	val HotbarItems = GameValue("Hotbar Items")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's inventory
	 * items (includes hotbar).
	 *
	 * RETURNS:
	 *
	 * [LIST]
	 *
	 * Contains one Item
	 * entry for each inventory
	 * slot (air if empty, 36 in
	 * total)
	 */
	val InventoryItems = GameValue("Inventory Items")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the item on a target's
	 * cursor (used when moving
	 * items in the inventory).
	 *
	 * RETURNS:
	 *
	 * [Any Item]
	 *
	 * Cursor item
	 */
	val CursorItem = GameValue("Cursor Item")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's current
	 * inventory menu items.
	 *
	 * RETURNS:
	 *
	 * [LIST]
	 *
	 * Contains one Item
	 * entry for each menu
	 * slot (air if empty)
	 */
	val InventoryMenuItems = GameValue("Inventory Menu Items")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's currently
	 * worn saddle or carpet.
	 *
	 * RETURNS:
	 *
	 * [Any Item]
	 *
	 * Item in the
	 * saddle/decor slot
	 */
	val SaddleItem = GameValue("Saddle Item")
	/**
	 * DESCRIPTION:
	 *
	 * The item form of the
	 * target.
	 *
	 * RETURNS:
	 *
	 * [Any Item]
	 *
	 * The entity item
	 */
	val EntityItem = GameValue("Entity Item")

}
object InformationalValues {
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's name.
	 *
	 * RETURNS:
	 *
	 * [COMPONENT]
	 *
	 * Target name
	 */
	val Name = GameValue("Name ")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's universally
	 * unique identifier.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Target UUID
	 */
	val UUID = GameValue("UUID")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's entity type.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Entity type, e.g.
	 * "tipped_arrow" or "cow"
	 */
	val EntityType = GameValue("Entity Type")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a player's game mode.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Game mode:
	 * "survival", "creative", "adventure",
	 * "spectator",
	 */
	val GameMode = GameValue("Game Mode")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the title of a target's
	 * opened inventory.
	 *
	 * RETURNS:
	 *
	 * [COMPONENT]
	 *
	 * Inventory title, or
	 * "none" if either no menu
	 * or the player's regular
	 * inventory is open
	 */
	val OpenInventoryTitle = GameValue("Open Inventory Title ")
	/**
	 * DESCRIPTION:
	 *
	 * Gets a target's active
	 * potion effects.
	 *
	 * RETURNS:
	 *
	 * [LIST]
	 *
	 * Contains one
	 * Potion Effect entry
	 * for each active
	 * effect on the target
	 */
	val PotionEffects = GameValue("Potion Effects")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the UUID of the entity
	 * that the target is riding.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * UUID of the ridden
	 * entity, or "none" if the
	 * target is not riding one
	 */
	val Vehicle = GameValue("Vehicle")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the UUIDs of any
	 * entities riding a target.
	 *
	 * RETURNS:
	 *
	 * [LIST]
	 *
	 * Contains one String
	 * entry (UUID) for each
	 * passenger riding the target
	 * (Empty List if the target
	 * has no passengers)
	 */
	val Passengers = GameValue("Passengers ")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the entity that is holding
	 * a target on a lead.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Lead holder UUID,
	 * or "none" if the target
	 * is not on a lead
	 */
	val LeadHolder = GameValue("Lead Holder")
	/**
	 * DESCRIPTION:
	 *
	 * Gets all entities attached to
	 * to a target by a lead.
	 *
	 * RETURNS:
	 *
	 * [LIST]
	 *
	 * Contains one String
	 * entry (UUID) for each
	 * leashed entity
	 * (Empty List if the target
	 * holds no leads)
	 */
	val AttachedLeads = GameValue("Attached Leads")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the UUID of the entity
	 * that the target is targeting.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * UUID of the targeted
	 * entity, or "none" if the
	 * target is not chasing one
	 */
	val TargetedEntityUUID = GameValue("Targeted Entity UUID")

}
object EventValues {
	/**
	 * DESCRIPTION:
	 *
	 * Gets the location of
	 * the block in this event.
	 *
	 * RETURNS:
	 *
	 * [LocItem]
	 *
	 * Block center
	 */
	val EventBlockLocation = GameValue("Event Block Location")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the side of the block
	 * that was hit in this event
	 * as a direction.
	 *
	 * RETURNS:
	 *
	 * [VecItem]
	 *
	 * Block side
	 */
	val EventBlockSide = GameValue("Event Block Side")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the amount of damage
	 * dealt in this event.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0 or above
	 */
	val EventDamage = GameValue("Event Damage")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the type of damage taken or dealt
	 * in this event.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Damage Cause:
	 * "block_explosion", "contact" (cactus),
	 * "cramming", "custom" (damage action),
	 * "dragon_breath", "drowning", "dryout",
	 * (fish on land), "entity_attack",
	 * "entity_explosion", "entity_sweep_attack",
	 * "fall", "falling_block", "fire" (in fire block),
	 * "fire_tick", "fly_into_wall", "hot_floor",
	 * (magma block), "kill", "lava", "magic",
	 * "melting" (snowman), "poison", "projectile",
	 * "starvation", "suffocation", "thorns", "void",
	 * "wither", "world_border", "freeze"
	 */
	val DamageEventCause = GameValue("Damage Event Cause")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the death message for
	 * this death event.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Death message
	 */
	val EventDeathMessage = GameValue("Event Death Message")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the amount of health
	 * regained in this event.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Health regained
	 */
	val EventHealAmount = GameValue("Event Heal Amount")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the reason the target
	 * regained health in this event.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Healing Cause:
	 * "natural" (natural regeneration),
	 * "magic" (instant health effect),
	 * "magic_regen" (regen effect),
	 * "custom" (code)
	 */
	val HealEventCause = GameValue("Heal Event Cause")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the locations of blocks
	 * affected by the explosion
	 * in this event.
	 *
	 * RETURNS:
	 *
	 * [LIST]
	 *
	 * Contains one Location
	 * entry for each block
	 */
	val EventExplosionAffectedBlocks = GameValue("Event Explosion Affected Blocks")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the percentage of
	 * power this event was
	 * executed with.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0.0% to 100.0%
	 */
	val EventPower = GameValue("Event Power")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the entire command line
	 * entered in this event.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Command, with the
	 * first "@" excluded
	 */
	val EventCommand = GameValue("Event Command")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the separated parts
	 * of the event command.
	 *
	 * RETURNS:
	 *
	 * [LIST]
	 *
	 * Contains one String
	 * entry for each word in the
	 * command (split by " ")
	 */
	val EventCommandArguments = GameValue("Event Command Arguments")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the item in an item
	 * related event.
	 *
	 * RETURNS:
	 *
	 * [Any Item]
	 *
	 * Main item in
	 * event
	 */
	val EventItem = GameValue("Event Item")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the hotbar slot being
	 * changed to in this event.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 1 (leftmost slot)
	 * to 9 (rightmost slot)
	 */
	val EventHotbarSlot = GameValue("Event Hotbar Slot")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the index of the
	 * clicked inventory slot
	 * in this event.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * From 1 (first slot)
	 * up to the inventory's size
	 */
	val EventClickedSlotIndex = GameValue("Event Clicked Slot Index")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the inventory item
	 * clicked on in this event.
	 *
	 * RETURNS:
	 *
	 * [Any Item]
	 *
	 * Item in slot
	 * (before the click event)
	 */
	val EventClickedSlotItem = GameValue("Event Clicked Slot Item")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the inventory item
	 * clicked with in this event.
	 *
	 * RETURNS:
	 *
	 * [Any Item]
	 *
	 * Item in slot
	 * (after the click event)
	 */
	val EventClickedSlotNewItem = GameValue("Event Clicked Slot New Item")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the reason the target's
	 * inventory was closed in this
	 * event.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Close Cause:
	 * "player", "code", "open_new",
	 * "teleport", "unloaded",
	 * "cant_use", "disconnect",
	 * "death", "unknown"
	 */
	val CloseInventoryEventCause = GameValue("Close Inventory Event Cause")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the click type in this
	 * inventory click event.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Click Type:
	 * "left", "shift_left", "double_left",
	 * "right", "shift_right",
	 * "drop" (Q), "drop_stack" (Ctrl+Q),
	 * "copy" (middle click), "creative",
	 * "swap_offhand" (F),
	 * "swap_hotbar" (1 ... 9)
	 */
	val InventoryEventClickType = GameValue("Inventory Event Click Type")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the cause of this
	 * fish event.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Event Type:
	 * "cast", "bite", "catch",
	 * "cancel", "cancel_block",
	 * "miss", "pull_entity"
	 */
	val FishEventCause = GameValue("Fish Event Cause")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the reason the target
	 * was teleported in this
	 * event.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Teleport Cause:
	 * "code", "ender_pearl",
	 * "chorus_fruit", "unknown",
	 */
	val TeleportEventCause = GameValue("Teleport Event Cause")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the location that will be
	 * teleported to in this event.
	 *
	 * RETURNS:
	 *
	 * [LocItem]
	 *
	 * Location
	 */
	val TeleportLocation = GameValue("Teleport Location")

}
object PlotValues {
	/**
	 * DESCRIPTION:
	 *
	 * Gets the amount of players
	 * playing on the plot.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Player count
	 */
	val PlayerCount = GameValue("Player Count")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the percentage of the
	 * plot's CPU being used this
	 * instant.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Usage as a percentage.
	 * Can go above 100%.
	 */
	val CPUUsage = GameValue("CPU Usage")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the amount of game Ticks
	 * Per Second the server is
	 * currently able to handle.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 20.0 (no server
	 * lag) or below (decreases
	 * with more lag)
	 */
	val ServerTPS = GameValue("Server TPS")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the current time as
	 * one number in seconds.
	 * E.g.: 1418840496.5 means
	 * Dec 17, 2014, 18:21:36.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Current time
	 */
	val Timestamp = GameValue("Timestamp")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the amount of targets
	 * in the selection.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * 0 (no targets)
	 * or above
	 */
	val SelectionSize = GameValue("Selection Size")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the name of each target
	 * in the selection.
	 *
	 * RETURNS:
	 *
	 * [LIST]
	 *
	 * Contains one String
	 * entry (name) for each
	 * target
	 */
	val SelectionTargetNames = GameValue("Selection Target Names")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the UUID of each target
	 * in the selection.
	 *
	 * RETURNS:
	 *
	 * [LIST]
	 *
	 * Contains one String
	 * entry (UUID) for each
	 * target
	 */
	val SelectionTargetUUIDs = GameValue("Selection Target UUIDs")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the id of the plot as text.
	 *
	 * RETURNS:
	 *
	 * [TextItem]
	 *
	 * Plot ID
	 */
	val PlotID = GameValue("Plot ID")
	/**
	 * DESCRIPTION:
	 *
	 * Gets the size of the plot.
	 *
	 * RETURNS:
	 *
	 * [NumItem]
	 *
	 * Plot size in blocks
	 */
	val PlotSize = GameValue("Plot Size")

}
