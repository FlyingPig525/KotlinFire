@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*

class EntityActionCategory<T> internal constructor(private val template: io.github.flyingpig525.base.Template<T>) where T : Item, T : io.github.flyingpig525.base.JsonData {
    private val blocks = template.blocks

    private fun block(items: io.github.flyingpig525.base.Items<T>, action: String) {
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
    @io.github.flyingpig525.annotation.Mythic
    fun dispRotationEuler(items: io.github.flyingpig525.base.Items<T>) = block(items, "DispRotationEuler")

    /**
     * Sets a parrot's color.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setParrotColor(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetParrotColor")

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
     * [VecItem]
     *
     * Translation vector
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun dispTranslation(items: io.github.flyingpig525.base.Items<T>) = block(items, "DispTranslation")

    /**
     * Deletes an entity.
     */
    fun remove(items: io.github.flyingpig525.base.Items<T>) = block(items, "Remove")

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
    fun setVelocity(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetVelocity")

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
     * [NONE]
     *
     * Uses the default
     * background color
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun tDispBackground(items: io.github.flyingpig525.base.Items<T>) = block(items, "TDispBackground")

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
    @io.github.flyingpig525.annotation.Mythic
    fun displayCullingSize(items: io.github.flyingpig525.base.Items<T>) = block(items, "DisplayCullingSize")

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
    fun setGlowSquidDark(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetGlowSquidDark")
    fun hideName(items: io.github.flyingpig525.base.Items<T>) = block(items, "HideName")

    /**
     * Sets a frog's color type.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setFrogType(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetFrogType")

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
    @io.github.flyingpig525.annotation.Mythic
    fun dispRotAxisAngle(items: io.github.flyingpig525.base.Items<T>) = block(items, "DispRotAxisAngle")

    /**
     * Damages a mob.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Damage to inflict
     *
     * (*)[TextItem]
     *
     * UUID of damager entity
     *
     * (*)[COMPONENT]
     *
     * Name of damager entity
     *
     * (*) = Optional
     */
    fun damage(items: io.github.flyingpig525.base.Items<T>) = block(items, "Damage")

    /**
     * Sets whether a sheep
     * has its wool.
     */
    fun setSheepSheared(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetSheepSheared")

    /**
     * Sets whether an entity
     * is sitting.
     */
    fun setMobSitting(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetMobSitting")

    /**
     * Sets an axolotl's color.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setAxolotlColor(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetAxolotlColor")

    /**
     * Makes a mob perform
     * an animation.
     */
    @io.github.flyingpig525.annotation.Noble
    fun sendAnimation(items: io.github.flyingpig525.base.Items<T>) = block(items, "SendAnimation")
    fun disableGlowing(items: io.github.flyingpig525.base.Items<T>) = block(items, "DisableGlowing")

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
     * [TextItem]
     *
     * Entity name
     *
     * [COMPONENT]
     *
     * Entity UUID
     *
     * (*) = Optional
     */
    fun setWardenAnger(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetWardenAnger")

    /**
     * Sets a horse's color and pattern.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setHorsePattern(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetHorsePattern")

    /**
     * Restores a mob's health.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Amount to heal
     *
     * [NONE]
     *
     * Heals to full health
     *
     * (*) = Optional
     */
    fun heal(items: io.github.flyingpig525.base.Items<T>) = block(items, "Heal")

    /**
     * Sets whether an entity is
     * sentient and/or affected
     * by physics.
     */
    fun setAI(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetAI")

    /**
     * Sets whether an entity
     * is riptiding.
     */
    @io.github.flyingpig525.annotation.Mythic
    fun setRiptiding(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetRiptiding")

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
     * [COMPONENT]
     *
     * Shooter name
     *
     * [NONE]
     *
     * Removes shooter
     *
     * (*) = Optional
     */
    fun setProjSource(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetProjSource")

    /**
     * Sets whether a fox appears
     * to be leaping.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setFoxLeaping(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetFoxLeaping")
    fun setItemOwner(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetItemOwner")

    /**
     * Sets the gene of a panda.
     * This affects their behavior
     * and appearance.
     */
    fun setPandaGene(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetPandaGene")

    /**
     * Sets a mob's dye color.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setDyeColor(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetDyeColor")

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
    fun launchUp(items: io.github.flyingpig525.base.Items<T>) = block(items, "LaunchUp")

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
    fun setMaxHealth(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetMaxHealth")

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
    fun setAge(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetAge")

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
    fun setFishingTime(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetFishingTime")

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
    fun endCrystalBeam(items: io.github.flyingpig525.base.Items<T>) = block(items, "EndCrystalBeam")

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
     * [COMPONENT]
     *
     * Target name
     *
     * (*) = Optional
     */
    fun frogEat(items: io.github.flyingpig525.base.Items<T>) = block(items, "FrogEat")

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
     * Sky light level (0-15)
     *
     * [NONE]
     *
     * Uses the light level
     * at entity's location
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun displayBrightness(items: io.github.flyingpig525.base.Items<T>) = block(items, "DisplayBrightness")

    /**
     * Sets a villager's profession.
     */
    fun setProfession(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetProfession")

    @io.github.flyingpig525.annotation.Overlord
    fun noGravity(items: io.github.flyingpig525.base.Items<T>) = block(items, "NoGravity")

    /**
     * Sets whether a mob has its
     * arms raised.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setArmsRaised(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetArmsRaised")

    /**
     * Removes all active potion
     * effects from an entity.
     */
    fun clearPotions(items: io.github.flyingpig525.base.Items<T>) = block(items, "ClearPotions")

    /**
     * Sets whether an armor stand has
     * arms and a base plate.
     */
    @io.github.flyingpig525.annotation.Mythic
    fun armorStandParts(items: io.github.flyingpig525.base.Items<T>) = block(items, "ArmorStandParts")

    /**
     * Sets whether an entity is
     * invulnerable to damage.
     */
    fun setInvulnerable(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetInvulnerable")
    fun projColl(items: io.github.flyingpig525.base.Items<T>) = block(items, "ProjColl")

    @io.github.flyingpig525.annotation.Mythic
    fun armorStandTags(items: io.github.flyingpig525.base.Items<T>) = block(items, "ArmorStandTags")

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
    fun setPickupDelay(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetPickupDelay")

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
     * [COMPONENT](s)
     *
     * Target name
     *
     * [NONE]
     *
     * Stop targeting
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Overlord
    fun setTarget(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetTarget")
    fun dropItems(items: io.github.flyingpig525.base.Items<T>) = block(items, "DropItems")

    /**
     * Sets whether the text in
     * a text display has
     * shadow or not.
     */
    @io.github.flyingpig525.annotation.Mythic
    fun tDisplayShadow(items: io.github.flyingpig525.base.Items<T>) = block(items, "TDisplayShadow")

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
    fun setCreeperPower(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetCreeperPower")

    /**
     * Sets whether an armor stand
     * is a marker.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setMarker(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetMarker")

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
    fun removeCustomTag(items: io.github.flyingpig525.base.Items<T>) = block(items, "RemoveCustomTag")

    /**
     * Sets whether an entity's
     * custom name is always
     * displayed above them.
     */
    fun setNameVisible(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetNameVisible")

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
    fun setInvulTicks(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetInvulTicks")

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
    fun setAbsorption(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetAbsorption")

    /**
     * Sets whether a horse is
     * standing on its hind legs.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setRearing(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetRearing")

    /**
     * Sets whether a creeper
     * has the charged effect.
     */
    fun creeperCharged(items: io.github.flyingpig525.base.Items<T>) = block(items, "CreeperCharged")

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
    fun setFireTicks(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetFireTicks")

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
    fun setCloudRadius(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetCloudRadius")

    /**
     * Sets whether an entity
     * is affected by gravity.
     */
    fun setGravity(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetGravity")

    /**
     * Sets an entity's custom name.
     *
     * ARGUMENTS:
     *
     * [COMPONENT]
     *
     * Custom name
     *
     * [NONE]
     *
     * Removes custom name
     *
     * (*) = Optional
     */
    fun setName(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetName")

    /**
     * Causes a mob to jump.
     */
    fun jump(items: io.github.flyingpig525.base.Items<T>) = block(items, "Jump")

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
    fun dispTPDuration(items: io.github.flyingpig525.base.Items<T>) = block(items, "DispTPDuration")

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
    fun setWitherInvul(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetWitherInvul")

    /**
     * Sets the displayed block
     * of a block display.
     *
     * ARGUMENTS:
     *
     * [BLOCK]
     *
     * Displayed block
     *
     * (*)[BLOCK_TAG](s)
     *
     * Block data
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun bDisplayBlock(items: io.github.flyingpig525.base.Items<T>) = block(items, "BDisplayBlock")

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
    fun setFreezeTicks(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetFreezeTicks")

    @io.github.flyingpig525.annotation.Noble
    fun silence(items: io.github.flyingpig525.base.Items<T>) = block(items, "Silence")

    /**
     * Sets whether a text display
     * is visible through walls
     * or not.
     */
    @io.github.flyingpig525.annotation.Mythic
    fun tDisplaySeeThru(items: io.github.flyingpig525.base.Items<T>) = block(items, "TDisplaySeeThru")

    /**
     * Sets whether an entity
     * is gliding.
     */
    fun setGliding(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetGliding")

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
    fun setRotation(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetRotation")

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
    @io.github.flyingpig525.annotation.Mythic
    fun displayShadow(items: io.github.flyingpig525.base.Items<T>) = block(items, "DisplayShadow")

    /**
     * Sets whether an interaction
     * entity has response when
     * interacting with it.
     */
    fun interactResponse(items: io.github.flyingpig525.base.Items<T>) = block(items, "InteractResponse")

    /**
     * Forces a mob to use held items
     * such as bow or spyglass.
     */
    @io.github.flyingpig525.annotation.Noble
    fun useItem(items: io.github.flyingpig525.base.Items<T>) = block(items, "UseItem")

    /**
     * Sets a tropical fish's
     * color and pattern.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setFishPattern(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetFishPattern")

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
     * [COMPONENT](s)
     *
     * Target name
     *
     * [NONE]
     *
     * Dismounts entity
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun rideEntity(items: io.github.flyingpig525.base.Items<T>) = block(items, "RideEntity")

    /**
     * Sets the affine transformation
     * matrix of a display entity.
     *
     * ARGUMENTS:
     *
     * [LIST]
     *
     * 16 numbers describing
     * a row-major matrix
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun displayMatrix(items: io.github.flyingpig525.base.Items<T>) = block(items, "DisplayMatrix")
    fun noDrops(items: io.github.flyingpig525.base.Items<T>) = block(items, "NoDrops")

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
    @io.github.flyingpig525.annotation.Mythic
    fun dispInterpolation(items: io.github.flyingpig525.base.Items<T>) = block(items, "DispInterpolation")

    /**
     * Forces a sniffer to perform
     * a specific action.
     */
    fun snifferState(items: io.github.flyingpig525.base.Items<T>) = block(items, "SnifferState")
    fun setHandItem(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetHandItem")
    fun enableGlowing(items: io.github.flyingpig525.base.Items<T>) = block(items, "EnableGlowing")

    /**
     * Set an enderman's held block.
     *
     * ARGUMENTS:
     *
     * [BLOCK]
     *
     * Block to hold
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun setEndermanBlock(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetEndermanBlock")

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
    fun teleport(items: io.github.flyingpig525.base.Items<T>) = block(items, "Teleport")

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
    fun launchToward(items: io.github.flyingpig525.base.Items<T>) = block(items, "LaunchToward")

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
    fun setArmor(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetArmor")

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
     * [NONE]
     *
     * Resets glow color
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun displayGlowColor(items: io.github.flyingpig525.base.Items<T>) = block(items, "DisplayGlowColor")

    /**
     * Sets whether an entity
     * should appear on fire.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setVisualFire(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetVisualFire")
    fun setAgeOrSize(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetAge/Size")

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
    fun getCustomTag(items: io.github.flyingpig525.base.Items<T>) = block(items, "GetCustomTag")

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
    fun interactionSize(items: io.github.flyingpig525.base.Items<T>) = block(items, "InteractionSize")

    /**
     * Sets a cat's skin type.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setCatType(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetCatType")

    /**
     * Sets whether a mob wears
     * a saddle.
     */
    fun setSaddle(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetSaddle")

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
     * (*)[COMPONENT]
     *
     * Target name
     *
     * (*) = Optional
     */
    fun setBulletTarget(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetBulletTarget")

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
     * [VecItem]
     *
     * Scale vector
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun displayScale(items: io.github.flyingpig525.base.Items<T>) = block(items, "DisplayScale")

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
    @io.github.flyingpig525.annotation.Mythic
    fun tDisplayLineWidth(items: io.github.flyingpig525.base.Items<T>) = block(items, "TDisplayLineWidth")

    /**
     * Sets the text alignment
     * of a text display.
     */
    @io.github.flyingpig525.annotation.Mythic
    fun tDisplayAlign(items: io.github.flyingpig525.base.Items<T>) = block(items, "TDisplayAlign")

    /**
     * Launches a projectile from a mob.
     *
     * ARGUMENTS:
     *
     * [PROJECTILE]
     *
     * Projectile to launch
     *
     * (*)[LocItem]
     *
     * Launch point
     *
     * (*)[COMPONENT]
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
    fun launchProj(items: io.github.flyingpig525.base.Items<T>) = block(items, "LaunchProj")

    /**
     * Sets the behavior phase
     * of an Ender Dragon.
     */
    fun setDragonPhase(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetDragonPhase")

    /**
     * Sets a llama's fur color.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setLlamaColor(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetLlamaColor")

    /**
     * Sets the biome type of a
     * villager. This affects their
     * appearance only.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setVillagerBiome(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetVillagerBiome")

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
    fun setCreeperFuse(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetCreeperFuse")

    @io.github.flyingpig525.annotation.Noble
    fun enableAI(items: io.github.flyingpig525.base.Items<T>) = block(items, "EnableAI")

    /**
     * Sets whether an entity
     * is a baby (permanently).
     */
    fun setBaby(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetBaby")

    /**
     * Sets a mooshroom's skin
     * type.
     */
    @io.github.flyingpig525.annotation.Noble
    fun mooshroomType(items: io.github.flyingpig525.base.Items<T>) = block(items, "MooshroomType")

    /**
     * Sets whether an entity
     * is invisible.
     */
    fun setInvisible(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetInvisible")

    /**
     * Sets how a display entity
     * is rotated with a
     * player's view.
     */
    @io.github.flyingpig525.annotation.Mythic
    fun displayBillboard(items: io.github.flyingpig525.base.Items<T>) = block(items, "DisplayBillboard")
    fun noProjColl(items: io.github.flyingpig525.base.Items<T>) = block(items, "NoProjColl")

    /**
     * Causes a sheep to
     * eat grass.
     */
    fun sheepEat(items: io.github.flyingpig525.base.Items<T>) = block(items, "SheepEat")

    /**
     * Sets whether a cat appears
     * to be lying down.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setCatResting(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetCatResting")

    /**
     * Gives one or more potion
     * effects to an entity.
     *
     * ARGUMENTS:
     *
     * [POTION](s)
     *
     * Effect(s)
     * to give
     *
     * (*) = Optional
     */
    fun givePotion(items: io.github.flyingpig525.base.Items<T>) = block(items, "GivePotion")

    /**
     * Sets which goat horns
     * are shown or hidden.
     */
    fun setGoatHorns(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetGoatHorns")

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
     * [COMPONENT]
     *
     * Owner name
     *
     * [NONE]
     *
     * Untames mob
     *
     * (*) = Optional
     */
    fun tame(items: io.github.flyingpig525.base.Items<T>) = block(items, "Tame")

    /**
     * Sets whether this entity has
     * a glowing outline that can
     * be seen through blocks.
     */
    fun setGlowing(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetGlowing")

    /**
     * Sets whether a goat
     * screams or not.
     */
    fun setGoatScreaming(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetGoatScreaming")

    /**
     * Sets the model type
     * of an item display.
     */
    @io.github.flyingpig525.annotation.Mythic
    fun iDisplayModelType(items: io.github.flyingpig525.base.Items<T>) = block(items, "IDisplayModelType")

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
    fun setHealth(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetHealth")

    /**
     * Disguises an entity as a mob.
     *
     * ARGUMENTS:
     *
     * [SPAWN_EGG]
     *
     * Mob to disguise as
     *
     * (*)[COMPONENT]
     *
     * Display name
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Overlord
    fun mobDisguise(items: io.github.flyingpig525.base.Items<T>) = block(items, "MobDisguise")

    /**
     * Disguises an entity as a block.
     *
     * ARGUMENTS:
     *
     * [BLOCK]
     *
     * Block to disguise as
     *
     * (*)[COMPONENT]
     *
     * Display name
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Overlord
    fun blockDisguise(items: io.github.flyingpig525.base.Items<T>) = block(items, "BlockDisguise")

    /**
     * Sets the block shown inside
     * a minecart. This does not
     * affect its functionality.
     *
     * ARGUMENTS:
     *
     * [BLOCK]
     *
     * Block to show
     *
     * (*)[NumItem]
     *
     * Block offset
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun setMinecartBlock(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetMinecartBlock")

    /**
     * Causes a fox to start
     * or stop sleeping.
     */
    @io.github.flyingpig525.annotation.Noble
    fun foxSleeping(items: io.github.flyingpig525.base.Items<T>) = block(items, "FoxSleeping")

    /**
     * Sets whether a mob is able
     * to collide with other entities.
     */
    fun setCollidable(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetCollidable")

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
    @io.github.flyingpig525.annotation.Mythic
    fun armorStandPose(items: io.github.flyingpig525.base.Items<T>) = block(items, "ArmorStandPose")

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
    fun launchFwd(items: io.github.flyingpig525.base.Items<T>) = block(items, "LaunchFwd")

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
    fun setFallDistance(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetFallDistance")

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
     * [NONE]
     *
     * Stop moving
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Overlord
    fun moveToLoc(items: io.github.flyingpig525.base.Items<T>) = block(items, "MoveToLoc")

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
    @io.github.flyingpig525.annotation.Mythic
    fun tDisplayOpacity(items: io.github.flyingpig525.base.Items<T>) = block(items, "TDisplayOpacity")

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
    @io.github.flyingpig525.annotation.Mythic
    fun iDisplayItem(items: io.github.flyingpig525.base.Items<T>) = block(items, "IDisplayItem")

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
    fun setEquipment(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetEquipment")

    /**
     * Makes a mob perform
     * an attack animation.
     */
    @io.github.flyingpig525.annotation.Noble
    fun attackAnimation(items: io.github.flyingpig525.base.Items<T>) = block(items, "AttackAnimation")

    /**
     * Sets whether an entity will
     * produce sound effects.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setSilenced(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetSilenced")

    /**
     * Sets if a bee has nectar
     * on its body.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setBeeNectar(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetBeeNectar")

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
     * [COMPONENT]
     *
     * Lead holder name
     *
     * [LocItem]
     *
     * Lead knot location
     *
     * (*) = Optional
     */
    fun attachLead(items: io.github.flyingpig525.base.Items<T>) = block(items, "AttachLead")

    /**
     * Sets whether a snow golem
     * is wearing a pumpkin.
     */
    @io.github.flyingpig525.annotation.Noble
    fun snowmanPumpkin(items: io.github.flyingpig525.base.Items<T>) = block(items, "SnowmanPumpkin")

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
     * [NumItem]
     *
     * Tag value
     *
     * [TextItem]
     *
     * Tag value
     *
     * (*) = Optional
     */
    fun setCustomTag(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetCustomTag")

    /**
     * Removes one or more potion
     * effects from an entity.
     *
     * ARGUMENTS:
     *
     * [POTION](s)
     *
     * Effect(s)
     * to remove
     *
     * (*) = Optional
     */
    fun removePotion(items: io.github.flyingpig525.base.Items<T>) = block(items, "RemovePotion")

    @io.github.flyingpig525.annotation.Overlord
    fun gravity(items: io.github.flyingpig525.base.Items<T>) = block(items, "Gravity")

    /**
     * Causes a sheep to
     * be sheared.
     */
    fun shearSheep(items: io.github.flyingpig525.base.Items<T>) = block(items, "ShearSheep")

    /**
     * Sets the possible interactions, such
     * as adding or removing items, of an
     * armor stand's slot(s).
     */
    @io.github.flyingpig525.annotation.Mythic
    fun armorStandSlots(items: io.github.flyingpig525.base.Items<T>) = block(items, "ArmorStandSlots")

    /**
     * Sets whether an allay is
     * dancing or not.
     */
    fun setAllayDancing(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetAllayDancing")

    /**
     * Sets a rabbit's skin type.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setRabbitType(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetRabbitType")

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
    @io.github.flyingpig525.annotation.Mythic
    fun displayViewRange(items: io.github.flyingpig525.base.Items<T>) = block(items, "DisplayViewRange")

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
    fun setSize(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetSize")

    @io.github.flyingpig525.annotation.Noble
    fun noAI(items: io.github.flyingpig525.base.Items<T>) = block(items, "NoAI")
    fun showName(items: io.github.flyingpig525.base.Items<T>) = block(items, "ShowName")

    /**
     * Disguises an entity as a player.
     *
     * ARGUMENTS:
     *
     * [COMPONENT]
     *
     * Player name to disguise as
     *
     * (*)Any Item
     *
     * Display skin
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Overlord
    fun playerDisguise(items: io.github.flyingpig525.base.Items<T>) = block(items, "PlayerDisguise")

    /**
     * Sets whether a mob is
     * angry at players.
     */
    fun setAngry(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetAngry")

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
    fun setItem(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetItem")

    /**
     * Causes an entity
     * to explode.
     */
    fun explode(items: io.github.flyingpig525.base.Items<T>) = block(items, "Explode")

    /**
     * Makes a warden emerge
     * or dig into the ground.
     */
    fun setDigging(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetDigging")

    @io.github.flyingpig525.annotation.Overlord
    fun moveTo(items: io.github.flyingpig525.base.Items<T>) = block(items, "MoveTo")

    /**
     * Removes an entity's disguise.
     */
    @io.github.flyingpig525.annotation.Overlord
    fun undisguise(items: io.github.flyingpig525.base.Items<T>) = block(items, "Undisguise")

    /**
     * Sets whether a mob drops
     * their items when dead.
     */
    fun setDeathDrops(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetDeathDrops")

    /**
     * Sets whether an item
     * or a falling block will
     * never despawn.
     */
    fun setPersistent(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetPersistent")

    /**
     * Sets whether a vex is
     * charging or not.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setVexCharging(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetVexCharging")

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
    fun setVillagerExp(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetVillagerExp")

    /**
     * Ignites a creeper, causing
     * it to explode after a fuse
     * period.
     */
    fun igniteCreeper(items: io.github.flyingpig525.base.Items<T>) = block(items, "IgniteCreeper")

    /**
     * Causes a mob to start
     * or stop celebrating.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setCelebrating(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetCelebrating")

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
    @io.github.flyingpig525.annotation.Noble
    fun projectileItem(items: io.github.flyingpig525.base.Items<T>) = block(items, "ProjectileItem")

    /**
     * Sets the displayed text
     * of a text display.
     *
     * ARGUMENTS:
     *
     * [COMPONENT](s)
     *
     * Displayed text
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun tDisplayText(items: io.github.flyingpig525.base.Items<T>) = block(items, "TDisplayText")

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
    fun setHorseJump(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetHorseJump")

    /**
     * Sets the color an entity's
     * name tag appears in.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setNameColor(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetNameColor")

    @io.github.flyingpig525.annotation.Noble
    fun unsilence(items: io.github.flyingpig525.base.Items<T>) = block(items, "Unsilence")

    /**
     * Sets whether a mob carries
     * a chest, which allows its
     * inventory to be accessed.
     */
    fun setCarryingChest(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetCarryingChest")

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
     * [COMPONENT]
     *
     * Target name
     *
     * (*) = Optional
     */
    fun ram(items: io.github.flyingpig525.base.Items<T>) = block(items, "Ram")

    /**
     * Sets a fox's fur type.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setFoxType(items: io.github.flyingpig525.base.Items<T>) = block(items, "SetFoxType")


}