@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.annotation.Mythic
import io.github.flyingpig525.annotation.Noble
import io.github.flyingpig525.annotation.Overlord
import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*

class EntityActionCategory<T> internal constructor(private val template: Template<T>) where T : Item, T : JsonData {
	private val blocks = template.blocks

	private fun block(items: Items<T>, action: String) {
		blocks += Block("entity_action", ItemCollection(items).items, action)
	}

	fun chain(a: EntityActionCategory<T>.() -> Unit) {
		apply(a)
	}

	/**
	 * Sets the left or right rotation of a
	 * display entity from 3 angles on
	 * each axis.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Pitch (0-360)
	 *
	 * [NumItem]
	 *
	 * Yaw (0-360)
	 *
	 * [NumItem]
	 *
	 * Roll (0-360)
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun dispRotationEuler(items: Items<T>) = block(items, "DispRotationEuler")
	/**
	 * Sets a parrot's color.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setParrotColor(items: Items<T>) = block(items, "SetParrotColor")
	/**
	 * Sets the translation values
	 * of a display entity.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * X translation
	 *
	 * [NumItem]
	 *
	 * Y translation
	 *
	 * [NumItem]
	 *
	 * Z translation
	 *
	 * []
	 *
	 *
	 * [VecItem]
	 *
	 * Translation vector
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun dispTranslation(items: Items<T>) = block(items, "DispTranslation")
	/**
	 * Deletes an entity.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun remove(items: Items<T>) = block(items, "Remove")
	/**
	 * Sets an entity's movement
	 * velocity.
	 *
	 * ARGUMENTS:
	 *
	 * [VecItem]
	 *
	 * New velocity
	 *
	 * (*) = Optional
	 */
	fun setVelocity(items: Items<T>) = block(items, "SetVelocity")
	/**
	 * Sets the background color
	 * and opacity of a text display.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[TextItem]
	 *
	 * Color hexadecimal
	 *
	 * [NumItem]
	 *
	 * Opacity in percentage
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Uses the default
	 * background color
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun tDispBackground(items: Items<T>) = block(items, "TDispBackground")
	/**
	 * Sets the culling width
	 * and height of a
	 * display entity.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[NumItem]
	 *
	 * Width
	 *
	 * (*)[NumItem]
	 *
	 * Height
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun displayCullingSize(items: Items<T>) = block(items, "DisplayCullingSize")
	/**
	 * Sets the number of ticks a
	 * glow squid will stop glowing for.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Ticks
	 *
	 * (*) = Optional
	 */
	fun setGlowSquidDark(items: Items<T>) = block(items, "SetGlowSquidDark")
	fun hideName(items: Items<T>) = block(items, "HideName")
	/**
	 * Sets a frog's color type.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setFrogType(items: Items<T>) = block(items, "SetFrogType")
	/**
	 * Sets the left or right rotation of
	 * a display entity from axis-angle
	 * rotation.
	 *
	 * ARGUMENTS:
	 *
	 * [VecItem]
	 *
	 * Axis vector
	 *
	 * [NumItem]
	 *
	 * Angle (0-360)
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun dispRotAxisAngle(items: Items<T>) = block(items, "DispRotAxisAngle")
	/**
	 * Damages a mob.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Damage to inflict
	 *
	 * []
	 *
	 *
	 * (*)[TextItem]
	 *
	 * UUID of damager entity
	 *
	 * []
	 *
	 *
	 * (*)[]
	 *
	 * Name of damager entity
	 *
	 * (*) = Optional
	 */
	fun damage(items: Items<T>) = block(items, "Damage")
	/**
	 * Sets whether a sheep
	 * has its wool.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setSheepSheared(items: Items<T>) = block(items, "SetSheepSheared")
	/**
	 * Sets whether an entity
	 * is sitting.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setMobSitting(items: Items<T>) = block(items, "SetMobSitting")
	/**
	 * Sets an axolotl's color.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setAxolotlColor(items: Items<T>) = block(items, "SetAxolotlColor")
	/**
	 * Makes a mob perform
	 * an animation.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun sendAnimation(items: Items<T>) = block(items, "SendAnimation")
	fun disableGlowing(items: Items<T>) = block(items, "DisableGlowing")
	/**
	 * Sets the anger level
	 * of a Warden.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Anger level
	 * (0-150)
	 *
	 * []
	 *
	 *
	 * [TextItem]
	 *
	 * Entity name
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Entity UUID
	 *
	 * (*) = Optional
	 */
	fun setWardenAnger(items: Items<T>) = block(items, "SetWardenAnger")
	/**
	 * Sets a horse's color and pattern.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setHorsePattern(items: Items<T>) = block(items, "SetHorsePattern")
	/**
	 * Restores a mob's health.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Amount to heal
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Heals to full health
	 *
	 * (*) = Optional
	 */
	fun heal(items: Items<T>) = block(items, "Heal")
	/**
	 * Sets whether an entity is
	 * sentient and/or affected
	 * by physics.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setAI(items: Items<T>) = block(items, "SetAI")
	/**
	 * Sets whether an entity
	 * is riptiding.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun setRiptiding(items: Items<T>) = block(items, "SetRiptiding")
	/**
	 * Sets the projectile source of
	 * a projectile (or removes it).
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * Shooter UUID
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Shooter name
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Removes shooter
	 *
	 * (*) = Optional
	 */
	fun setProjSource(items: Items<T>) = block(items, "SetProjSource")
	/**
	 * Sets whether a fox appears
	 * to be leaping.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setFoxLeaping(items: Items<T>) = block(items, "SetFoxLeaping")
	fun setItemOwner(items: Items<T>) = block(items, "SetItemOwner")
	/**
	 * Sets the gene of a panda.
	 * This affects their behavior
	 * and appearance.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setPandaGene(items: Items<T>) = block(items, "SetPandaGene")
	/**
	 * Sets a mob's dye color.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setDyeColor(items: Items<T>) = block(items, "SetDyeColor")
	/**
	 * Launches an entity up or down.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Launch power
	 *
	 * (*) = Optional
	 */
	fun launchUp(items: Items<T>) = block(items, "LaunchUp")
	/**
	 * Sets an entity's maximum
	 * health.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Maximum health
	 *
	 * (*) = Optional
	 */
	fun setMaxHealth(items: Items<T>) = block(items, "SetMaxHealth")
	/**
	 * Sets an animal's age.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Age
	 *
	 * (*) = Optional
	 */
	fun setAge(items: Items<T>) = block(items, "SetAge")
	/**
	 * Sets the time until a fish
	 * starts to approach a
	 * fishing hook.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Wait time (ticks)
	 *
	 * (*) = Optional
	 */
	fun setFishingTime(items: Items<T>) = block(items, "SetFishingTime")
	/**
	 * Sets the location an end
	 * crystal points its beam at.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[LocItem]
	 *
	 * Target
	 *
	 * (*) = Optional
	 */
	fun endCrystalBeam(items: Items<T>) = block(items, "EndCrystalBeam")
	/**
	 * Makes a frog try to eat the
	 * specified mob or player.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * Target UUID
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Target name
	 *
	 * (*) = Optional
	 */
	fun frogEat(items: Items<T>) = block(items, "FrogEat")
	/**
	 * Sets the brightness
	 * of a display entity.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Block light level (0-15)
	 *
	 * [NumItem]
	 *
	 * Skylight level (0-15)
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Uses the light level
	 * at entity's location
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun displayBrightness(items: Items<T>) = block(items, "DisplayBrightness")
	/**
	 * Sets a villager's profession.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setProfession(items: Items<T>) = block(items, "SetProfession")
	@Overlord
	fun noGravity(items: Items<T>) = block(items, "NoGravity")
	/**
	 * Sets whether a mob has its
	 * arms raised.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setArmsRaised(items: Items<T>) = block(items, "SetArmsRaised")
	/**
	 * Removes all active potion
	 * effects from an entity.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun clearPotions(items: Items<T>) = block(items, "ClearPotions")
	/**
	 * Sets whether an armor stand has
	 * arms and a baseplate.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun armorStandParts(items: Items<T>) = block(items, "ArmorStandParts")
	/**
	 * Sets whether an entity is
	 * invulnerable to damage.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setInvulnerable(items: Items<T>) = block(items, "SetInvulnerable")
	fun projColl(items: Items<T>) = block(items, "ProjColl")
	@Mythic
	fun armorStandTags(items: Items<T>) = block(items, "ArmorStandTags")
	/**
	 * Sets the number of ticks a
	 * dropped item cannot be
	 * picked up for.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Delay
	 *
	 * (*) = Optional
	 */
	fun setPickupDelay(items: Items<T>) = block(items, "SetPickupDelay")
	/**
	 * Instructs a mob's AI to target
	 * a specific mob or player.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem](s)
	 *
	 * Target UUID
	 *
	 * []
	 *
	 *
	 * [](s)
	 *
	 * Target name
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Stop targeting
	 *
	 * (*) = Optional
	 */
	@Overlord
	fun setTarget(items: Items<T>) = block(items, "SetTarget")
	fun dropItems(items: Items<T>) = block(items, "DropItems")
	/**
	 * Sets whether the text in
	 * a text display has
	 * shadow or not.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun tDisplayShadow(items: Items<T>) = block(items, "TDisplayShadow")
	/**
	 * Sets a creeper's explosion power.
	 * This affects the damage and area
	 * of effect.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Power (0-25)
	 *
	 * (*) = Optional
	 */
	fun setCreeperPower(items: Items<T>) = block(items, "SetCreeperPower")
	/**
	 * Sets whether an armor stand
	 * is a marker.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setMarker(items: Items<T>) = block(items, "SetMarker")
	/**
	 * Removes a custom tag
	 * from an entity.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * Tag name
	 *
	 * (*) = Optional
	 */
	fun removeCustomTag(items: Items<T>) = block(items, "RemoveCustomTag")
	/**
	 * Sets whether an entity's
	 * custom name is always
	 * displayed above them.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setNameVisible(items: Items<T>) = block(items, "SetNameVisible")
	/**
	 * Sets the currently
	 * remaining ticks until an
	 * entity can next be hurt.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Ticks
	 *
	 * (*) = Optional
	 */
	fun setInvulTicks(items: Items<T>) = block(items, "SetInvulTicks")
	/**
	 * Sets an entity's absorption
	 * health (golden hearts).
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Absorption health
	 *
	 * (*) = Optional
	 */
	fun setAbsorption(items: Items<T>) = block(items, "SetAbsorption")
	/**
	 * Sets whether a horse is
	 * standing on its hind legs.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setRearing(items: Items<T>) = block(items, "SetRearing")
	/**
	 * Sets whether a creeper
	 * has the charged effect.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun creeperCharged(items: Items<T>) = block(items, "CreeperCharged")
	/**
	 * Sets the remaining time an entity is on
	 * fire for.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Ticks
	 *
	 * (*) = Optional
	 */
	fun setFireTicks(items: Items<T>) = block(items, "SetFireTicks")
	/**
	 * Sets an area of effect cloud's
	 * radius and shrinking speed.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Radius
	 *
	 * (*)[NumItem]
	 *
	 * Shrinking speed
	 * (blocks per second)
	 *
	 * (*) = Optional
	 */
	fun setCloudRadius(items: Items<T>) = block(items, "SetCloudRadius")
	/**
	 * Sets whether an entity
	 * is affected by gravity.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setGravity(items: Items<T>) = block(items, "SetGravity")
	/**
	 * Sets an entity's custom name.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Custom name
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Removes custom name
	 *
	 * (*) = Optional
	 */
	fun setName(items: Items<T>) = block(items, "SetName")
	/**
	 * Causes a mob to jump.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun jump(items: Items<T>) = block(items, "Jump")
	/**
	 * Sets how long a display entity takes
	 * to visually move to its destination
	 * when it teleports.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[NumItem]
	 *
	 * Teleport duration
	 * in ticks
	 *
	 * (*) = Optional
	 */
	fun dispTPDuration(items: Items<T>) = block(items, "DispTPDuration")
	/**
	 * Sets the remaining ticks of
	 * invulnerability a wither has.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Ticks
	 *
	 * (*) = Optional
	 */
	fun setWitherInvul(items: Items<T>) = block(items, "SetWitherInvul")
	/**
	 * Sets the displayed block
	 * of a block display.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Displayed block
	 *
	 * (*)[](s)
	 *
	 * Block data
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun bDisplayBlock(items: Items<T>) = block(items, "BDisplayBlock")
	/**
	 * Sets an entity's current
	 * freeze ticks.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Ticks
	 * (0-140)
	 *
	 * (*) = Optional
	 */
	fun setFreezeTicks(items: Items<T>) = block(items, "SetFreezeTicks")
	@Noble
	fun silence(items: Items<T>) = block(items, "Silence")
	/**
	 * Sets whether a text display
	 * is visible through walls
	 * or not.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun tDisplaySeeThru(items: Items<T>) = block(items, "TDisplaySeeThru")
	/**
	 * Sets whether an entity
	 * is gliding.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setGliding(items: Items<T>) = block(items, "SetGliding")
	/**
	 * Changes an entity's pitch and
	 * yaw without teleporting it.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Pitch (-90 to 90)
	 *
	 * [NumItem]
	 *
	 * Yaw (-180 to 180)
	 *
	 * (*) = Optional
	 */
	fun setRotation(items: Items<T>) = block(items, "SetRotation")
	/**
	 * Sets the shadow properties
	 * of a display entity.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[NumItem]
	 *
	 * Shadow radius in blocks
	 *
	 * (*)[NumItem]
	 *
	 * Shadow opacity in
	 * percentage
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun displayShadow(items: Items<T>) = block(items, "DisplayShadow")
	/**
	 * Sets whether an interaction
	 * entity has response when
	 * interacting with it.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun interactResponse(items: Items<T>) = block(items, "InteractResponse")
	/**
	 * Forces a mob to use held items
	 * such as bow or spyglass.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun useItem(items: Items<T>) = block(items, "UseItem")
	/**
	 * Sets a tropical fish's
	 * color and pattern.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setFishPattern(items: Items<T>) = block(items, "SetFishPattern")
	/**
	 * Mounts an entity on top of
	 * another entity or player.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem](s)
	 *
	 * Target UUID
	 *
	 * []
	 *
	 *
	 * [](s)
	 *
	 * Target name
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Dismounts entity
	 *
	 * (*) = Optional
	 */
	@Noble
	fun rideEntity(items: Items<T>) = block(items, "RideEntity")
	/**
	 * Sets the affine transformation
	 * matrix of a display entity.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * 16 numbers describing
	 * a row-major matrix
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun displayMatrix(items: Items<T>) = block(items, "DisplayMatrix")
	fun noDrops(items: Items<T>) = block(items, "NoDrops")
	/**
	 * Sets the interpolation
	 * properties of a display
	 * entity.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[NumItem]
	 *
	 * Interpolation duration
	 * in ticks
	 *
	 * (*)[NumItem]
	 *
	 * Interpolation delay
	 * in ticks
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun dispInterpolation(items: Items<T>) = block(items, "DispInterpolation")
	/**
	 * Forces a sniffer to perform
	 * a specific action.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun snifferState(items: Items<T>) = block(items, "SnifferState")
	fun setHandItem(items: Items<T>) = block(items, "SetHandItem")
	fun enableGlowing(items: Items<T>) = block(items, "EnableGlowing")
	/**
	 * Set an enderman's held block.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Block to hold
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setEndermanBlock(items: Items<T>) = block(items, "SetEndermanBlock")
	/**
	 * Teleports an entity to a
	 * specified location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * New position
	 *
	 * (*) = Optional
	 */
	fun teleport(items: Items<T>) = block(items, "Teleport")
	/**
	 * Launches an entity toward or away
	 * from a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Launch destination
	 *
	 * (*)[NumItem]
	 *
	 * Launch power
	 *
	 * (*) = Optional
	 */
	fun launchToward(items: Items<T>) = block(items, "LaunchToward")
	/**
	 * Sets a mob's armor items.
	 * Place the armor in slots 1-4
	 * of the chest, with 1 being the
	 * helmet and 4 being the boots.
	 *
	 * ARGUMENTS:
	 *
	 * Any Item(s)
	 *
	 * Armor to set
	 *
	 * (*) = Optional
	 */
	fun setArmor(items: Items<T>) = block(items, "SetArmor")
	/**
	 * Sets the glowing color
	 * of a display entity.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * Color hexadecimal
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Resets glow color
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun displayGlowColor(items: Items<T>) = block(items, "DisplayGlowColor")
	/**
	 * Sets whether an entity
	 * should appear on fire.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setVisualFire(items: Items<T>) = block(items, "SetVisualFire")
	fun setAgeOrSize(items: Items<T>) = block(items, "SetAge/Size")
	/**
	 * Gets the value of a custom
	 * entity tag.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [TextItem]
	 *
	 * Tag name
	 *
	 * (*) = Optional
	 */
	fun getCustomTag(items: Items<T>) = block(items, "GetCustomTag")
	/**
	 * Sets the hitbox size of
	 * an interaction entity.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[NumItem]
	 *
	 * Width
	 *
	 * (*)[NumItem]
	 *
	 * Height
	 *
	 * (*) = Optional
	 */
	fun interactionSize(items: Items<T>) = block(items, "InteractionSize")
	/**
	 * Sets a cat's skin type.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setCatType(items: Items<T>) = block(items, "SetCatType")
	/**
	 * Sets whether a mob wears
	 * a saddle.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setSaddle(items: Items<T>) = block(items, "SetSaddle")
	/**
	 * Causes a shulker bullet to start
	 * targeting the provided entity.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[TextItem]
	 *
	 * Target UUID
	 *
	 * []
	 *
	 *
	 * (*)[]
	 *
	 * Target name
	 *
	 * (*) = Optional
	 */
	fun setBulletTarget(items: Items<T>) = block(items, "SetBulletTarget")
	/**
	 * Sets the scale of
	 * a display entity.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * X scale
	 *
	 * [NumItem]
	 *
	 * Y scale
	 *
	 * [NumItem]
	 *
	 * Z scale
	 *
	 * []
	 *
	 *
	 * [VecItem]
	 *
	 * Scale vector
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun displayScale(items: Items<T>) = block(items, "DisplayScale")
	/**
	 * Sets the maximum line width
	 * of a text display.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[NumItem]
	 *
	 * Line width
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun tDisplayLineWidth(items: Items<T>) = block(items, "TDisplayLineWidth")
	/**
	 * Sets the text alignment
	 * of a text display.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun tDisplayAlign(items: Items<T>) = block(items, "TDisplayAlign")
	/**
	 * Launches a projectile from a mob.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Projectile to launch
	 *
	 * (*)[LocItem]
	 *
	 * Launch point
	 *
	 * (*)[]
	 *
	 * Projectile name
	 *
	 * (*)[NumItem]
	 *
	 * Speed
	 *
	 * (*)[NumItem]
	 *
	 * Inaccuracy
	 *
	 * (*) = Optional
	 */
	fun launchProj(items: Items<T>) = block(items, "LaunchProj")
	/**
	 * Sets the behavior phase
	 * of an Ender Dragon.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setDragonPhase(items: Items<T>) = block(items, "SetDragonPhase")
	/**
	 * Sets a llama's fur color.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setLlamaColor(items: Items<T>) = block(items, "SetLlamaColor")
	/**
	 * Sets the biome type of a
	 * villager. This affects their
	 * appearance only.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setVillagerBiome(items: Items<T>) = block(items, "SetVillagerBiome")
	/**
	 * Sets the starting amount
	 * of ticks it takes for a
	 * creeper to explode.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Fuse ticks
	 *
	 * (*) = Optional
	 */
	fun setCreeperFuse(items: Items<T>) = block(items, "SetCreeperFuse")
	@Noble
	fun enableAI(items: Items<T>) = block(items, "EnableAI")
	/**
	 * Sets whether an entity
	 * is a baby (permanently).
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setBaby(items: Items<T>) = block(items, "SetBaby")
	/**
	 * Sets a mooshroom's skin
	 * type.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun mooshroomType(items: Items<T>) = block(items, "MooshroomType")
	/**
	 * Sets whether an entity
	 * is invisible.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setInvisible(items: Items<T>) = block(items, "SetInvisible")
	/**
	 * Sets how a display entity
	 * is rotated with a
	 * player's view.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun displayBillboard(items: Items<T>) = block(items, "DisplayBillboard")
	fun noProjColl(items: Items<T>) = block(items, "NoProjColl")
	/**
	 * Causes a sheep to
	 * eat grass.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun sheepEat(items: Items<T>) = block(items, "SheepEat")
	/**
	 * Sets whether a cat appears
	 * to be lying down.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setCatResting(items: Items<T>) = block(items, "SetCatResting")
	/**
	 * Gives one or more potion
	 * effects to an entity.
	 *
	 * ARGUMENTS:
	 *
	 * [](s)
	 *
	 * Effect(s)
	 * to give
	 *
	 * (*) = Optional
	 */
	fun givePotion(items: Items<T>) = block(items, "GivePotion")
	/**
	 * Sets which goat horns
	 * are shown or hidden.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setGoatHorns(items: Items<T>) = block(items, "SetGoatHorns")
	/**
	 * Tames and sets the owner
	 * of a tameable mob.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * Owner UUID
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Owner name
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Untames mob
	 *
	 * (*) = Optional
	 */
	fun tame(items: Items<T>) = block(items, "Tame")
	/**
	 * Sets whether this entity has
	 * a glowing outline that can
	 * be seen through blocks.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setGlowing(items: Items<T>) = block(items, "SetGlowing")
	/**
	 * Sets whether a goat
	 * screams or not.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setGoatScreaming(items: Items<T>) = block(items, "SetGoatScreaming")
	/**
	 * Sets the model type
	 * of an item display.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun iDisplayModelType(items: Items<T>) = block(items, "IDisplayModelType")
	/**
	 * Sets an entity's current
	 * health.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Current health
	 *
	 * (*) = Optional
	 */
	fun setHealth(items: Items<T>) = block(items, "SetHealth")
	/**
	 * Disguises an entity as a mob.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Mob to disguise as
	 *
	 * (*)[]
	 *
	 * Display name
	 *
	 * (*) = Optional
	 */
	@Overlord
	fun mobDisguise(items: Items<T>) = block(items, "MobDisguise")
	/**
	 * Disguises an entity as a block.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Block to disguise as
	 *
	 * (*)[]
	 *
	 * Display name
	 *
	 * (*) = Optional
	 */
	@Overlord
	fun blockDisguise(items: Items<T>) = block(items, "BlockDisguise")
	/**
	 * Sets the block shown inside
	 * a minecart. This does not
	 * affect its functionality.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Block to show
	 *
	 * (*)[NumItem]
	 *
	 * Block offset
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setMinecartBlock(items: Items<T>) = block(items, "SetMinecartBlock")
	/**
	 * Causes a fox to start
	 * or stop sleeping.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun foxSleeping(items: Items<T>) = block(items, "FoxSleeping")
	/**
	 * Sets whether a mob is able
	 * to collide with other entities.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setCollidable(items: Items<T>) = block(items, "SetCollidable")
	/**
	 * Sets the rotation of an armor
	 * stand part.
	 *
	 * ARGUMENTS:
	 *
	 * [VecItem]
	 *
	 * Direction
	 *
	 * []
	 *
	 *
	 * (*)[NumItem]
	 *
	 * X Rotation (0-360)
	 *
	 * (*)[NumItem]
	 *
	 * Y Rotation (0-360)
	 *
	 * (*)[NumItem]
	 *
	 * Z Rotation (0-360)
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun armorStandPose(items: Items<T>) = block(items, "ArmorStandPose")
	/**
	 * Launches an entity forward
	 * or backward.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Launch power
	 *
	 * (*) = Optional
	 */
	fun launchFwd(items: Items<T>) = block(items, "LaunchFwd")
	/**
	 * Sets an entity's fall distance,
	 * affecting fall damage upon
	 * landing.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Fall distance (blocks)
	 *
	 * (*) = Optional
	 */
	fun setFallDistance(items: Items<T>) = block(items, "SetFallDistance")
	/**
	 * Instructs a mob's AI to always
	 * pathfind to a certain location
	 * at a certain speed.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Target location
	 *
	 * (*)[NumItem]
	 *
	 * Walk speed
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Stop moving
	 *
	 * (*) = Optional
	 */
	@Overlord
	fun moveToLoc(items: Items<T>) = block(items, "MoveToLoc")
	/**
	 * Sets the text opacity
	 * of a text display.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[NumItem]
	 *
	 * Text opacity
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun tDisplayOpacity(items: Items<T>) = block(items, "TDisplayOpacity")
	/**
	 * Sets the displayed item
	 * of an item display.
	 *
	 * ARGUMENTS:
	 *
	 * Any Item
	 *
	 * Displayed item
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun iDisplayItem(items: Items<T>) = block(items, "IDisplayItem")
	/**
	 * Sets the item in one of the
	 * equipment slots (including
	 * horse items) of an entity.
	 *
	 * ARGUMENTS:
	 *
	 * (*)Any Item
	 *
	 * Item to set
	 *
	 * (*) = Optional
	 */
	fun setEquipment(items: Items<T>) = block(items, "SetEquipment")
	/**
	 * Makes a mob perform
	 * an attack animation.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun attackAnimation(items: Items<T>) = block(items, "AttackAnimation")
	/**
	 * Sets whether an entity will
	 * produce sound effects.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setSilenced(items: Items<T>) = block(items, "SetSilenced")
	/**
	 * Sets if a bee has nectar
	 * on its body.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setBeeNectar(items: Items<T>) = block(items, "SetBeeNectar")
	/**
	 * Attaches a lead to the target,
	 * held by an entity or lead knot.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * Lead holder UUID
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Lead holder name
	 *
	 * []
	 *
	 *
	 * [LocItem]
	 *
	 * Lead knot location
	 *
	 * (*) = Optional
	 */
	fun attachLead(items: Items<T>) = block(items, "AttachLead")
	/**
	 * Sets whether a snow golem
	 * is wearing a pumpkin.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun snowmanPumpkin(items: Items<T>) = block(items, "SnowmanPumpkin")
	/**
	 * Sets the value of or creates
	 * a custom tag value.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * Tag name
	 *
	 * []
	 *
	 *
	 * [NumItem]
	 *
	 * Tag value
	 *
	 * []
	 *
	 *
	 * [TextItem]
	 *
	 * Tag value
	 *
	 * (*) = Optional
	 */
	fun setCustomTag(items: Items<T>) = block(items, "SetCustomTag")
	/**
	 * Removes one or more potion
	 * effects from an entity.
	 *
	 * ARGUMENTS:
	 *
	 * [](s)
	 *
	 * Effect(s)
	 * to remove
	 *
	 * (*) = Optional
	 */
	fun removePotion(items: Items<T>) = block(items, "RemovePotion")
	@Overlord
	fun gravity(items: Items<T>) = block(items, "Gravity")
	/**
	 * Causes a sheep to
	 * be sheared.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun shearSheep(items: Items<T>) = block(items, "ShearSheep")
	/**
	 * Sets the possible interactions, such
	 * as adding or removing items, of an
	 * armor stand's slot(s).
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun armorStandSlots(items: Items<T>) = block(items, "ArmorStandSlots")
	/**
	 * Sets whether an allay is
	 * dancing or not.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setAllayDancing(items: Items<T>) = block(items, "SetAllayDancing")
	/**
	 * Sets a rabbit's skin type.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setRabbitType(items: Items<T>) = block(items, "SetRabbitType")
	/**
	 * Sets the view range of a
	 * display entity.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[NumItem]
	 *
	 * View range in blocks
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun displayViewRange(items: Items<T>) = block(items, "DisplayViewRange")
	/**
	 * Sets the size of an entity.
	 * This may also affect its
	 * health and strength.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Size
	 *
	 * (*) = Optional
	 */
	fun setSize(items: Items<T>) = block(items, "SetSize")
	@Noble
	fun noAI(items: Items<T>) = block(items, "NoAI")
	fun showName(items: Items<T>) = block(items, "ShowName")
	/**
	 * Disguises an entity as a player.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Player name to disguise as
	 *
	 * (*)Any Item
	 *
	 * Display skin
	 *
	 * (*) = Optional
	 */
	@Overlord
	fun playerDisguise(items: Items<T>) = block(items, "PlayerDisguise")
	/**
	 * Sets whether a mob is
	 * angry at players.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setAngry(items: Items<T>) = block(items, "SetAngry")
	/**
	 * Sets the item of
	 * an item entity.
	 *
	 * ARGUMENTS:
	 *
	 * Any Item
	 *
	 * New item
	 *
	 * (*) = Optional
	 */
	fun setItem(items: Items<T>) = block(items, "SetItem")
	/**
	 * Causes an entity
	 * to explode.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun explode(items: Items<T>) = block(items, "Explode")
	/**
	 * Makes a warden emerge
	 * or dig into the ground.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setDigging(items: Items<T>) = block(items, "SetDigging")
	@Overlord
	fun moveTo(items: Items<T>) = block(items, "MoveTo")
	/**
	 * Removes an entity's disguise.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Overlord
	fun undisguise(items: Items<T>) = block(items, "Undisguise")
	/**
	 * Sets whether a mob drops
	 * their items when dead.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setDeathDrops(items: Items<T>) = block(items, "SetDeathDrops")
	/**
	 * Sets whether an item
	 * or a falling block will
	 * never despawn.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setPersistent(items: Items<T>) = block(items, "SetPersistent")
	/**
	 * Sets whether a vex is
	 * charging or not.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setVexCharging(items: Items<T>) = block(items, "SetVexCharging")
	/**
	 * Sets a villager's experience
	 * points, which affects their level.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Experience
	 *
	 * (*) = Optional
	 */
	fun setVillagerExp(items: Items<T>) = block(items, "SetVillagerExp")
	/**
	 * Ignites a creeper, causing
	 * it to explode after a fuse
	 * period.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun igniteCreeper(items: Items<T>) = block(items, "IgniteCreeper")
	/**
	 * Causes a mob to start
	 * or stop celebrating.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setCelebrating(items: Items<T>) = block(items, "SetCelebrating")
	/**
	 * Sets the item a projectile
	 * displays as.
	 *
	 * ARGUMENTS:
	 *
	 * Any Item
	 *
	 * Display item
	 *
	 * (*) = Optional
	 */
	@Noble
	fun projectileItem(items: Items<T>) = block(items, "ProjectileItem")
	/**
	 * Sets the displayed text
	 * of a text display.
	 *
	 * ARGUMENTS:
	 *
	 * [](s)
	 *
	 * Displayed text
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun tDisplayText(items: Items<T>) = block(items, "TDisplayText")
	/**
	 * Sets a horse's jump strength.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Strength
	 *
	 * (*) = Optional
	 */
	fun setHorseJump(items: Items<T>) = block(items, "SetHorseJump")
	/**
	 * Sets the color an entity's
	 * name tag appears in.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setNameColor(items: Items<T>) = block(items, "SetNameColor")
	@Noble
	fun unsilence(items: Items<T>) = block(items, "Unsilence")
	/**
	 * Sets whether a mob carries
	 * a chest, which allows its
	 * inventory to be accessed.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun setCarryingChest(items: Items<T>) = block(items, "SetCarryingChest")
	/**
	 * Makes a goat ram the
	 * specified mob or player.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * Target UUID
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Target name
	 *
	 * (*) = Optional
	 */
	fun ram(items: Items<T>) = block(items, "Ram")
	/**
	 * Sets a fox's fur type.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	@Noble
	fun setFoxType(items: Items<T>) = block(items, "SetFoxType")

}