package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.*
import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.block.subaction.*
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put

class EntityActionCategory<T : Item> internal constructor(private val template: Template<T>) {
    private val blocks = template.blocks

    private fun block(items: Items<T>, action: String, extra: JsonObjectBuilder.() -> Unit = {}) {
        blocks += Block("entity_action", ItemCollection(items).items, action, extra)
    }
	/**
	 * *Sets the left or right rotation of a*
	 * *display entity from 3 angles on*
	 * *each axis.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Pitch (0-360)*
	 *
	 * [NumItem]
	 *
	 * *Yaw (0-360)*
	 *
	 * [NumItem]
	 *
	 * *Roll (0-360)*
	 *
	 * [VecItem]
	 *
	 * *Pitch/Yaw/Roll Vector*
	 *
	 * (*) = optional
	 */
	fun dispRotationEuler(items: Items<T>) = block(items, "DispRotationEuler")


	/**
	 * *Sets a mob in the sheared*
	 * *state.*
	 */
	fun shear(items: Items<T>) = block(items, "Shear")


	/**
	 * *Sets an entity's movement*
	 * *velocity.*
	 *
	 * #### Args:
	 *
	 * [VecItem]
	 *
	 * *New velocity*
	 *
	 * (*) = optional
	 */
	fun setVelocity(items: Items<T>) = block(items, "SetVelocity")


	/**
	 * *Sets the number of ticks a*
	 * *glow squid will stop glowing for.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Ticks*
	 *
	 * (*) = optional
	 */
	fun setGlowSquidDark(items: Items<T>) = block(items, "SetGlowSquidDark")


	/**
	 * *Sets a frog's color type.*
	 */
	fun setFrogType(items: Items<T>) = block(items, "SetFrogType")


	/**
	 * *Sets the left or right rotation of*
	 * *a display entity from axis-angle*
	 * *rotation.*
	 *
	 * #### Args:
	 *
	 * [VecItem]
	 *
	 * *Axis vector*
	 *
	 * [NumItem]
	 *
	 * *Angle (0-360)*
	 *
	 * (*) = optional
	 */
	fun dispRotAxisAngle(items: Items<T>) = block(items, "DispRotAxisAngle")


	/**
	 * *Damages a mob.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Damage to inflict*
	 *
	 * [StringItem]
	 *
	 * (*) *UUID of damager entity*
	 *
	 * [TextItem]
	 *
	 * (*) *Name of damager entity*
	 *
	 * (*) = optional
	 */
	fun damage(items: Items<T>) = block(items, "Damage")


	/**
	 * *Sets whether an entity*
	 * *is sitting.*
	 */
	fun setMobSitting(items: Items<T>) = block(items, "SetMobSitting")


	/**
	 * *Makes a mob perform*
	 * *an animation.*
	 */
	fun sendAnimation(items: Items<T>) = block(items, "SendAnimation")


	/**
	 */
	fun disableGlowing(items: Items<T>) = block(items, "DisableGlowing")


	/**
	 * *Sets the anger level*
	 * *of a Warden.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Anger level*
	 * *(0-150)*
	 *
	 * [StringItem]
	 *
	 * *Entity name*
	 *
	 * [TextItem]
	 *
	 * *Entity UUID*
	 *
	 * (*) = optional
	 */
	fun setWardenAnger(items: Items<T>) = block(items, "SetWardenAnger")


	/**
	 * *Sets a horse's color and pattern.*
	 */
	fun setHorsePattern(items: Items<T>) = block(items, "SetHorsePattern")


	/**
	 * *Restores a mob's health.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Amount to heal*
	 *
	 * (*) = optional
	 */
	fun heal(items: Items<T>) = block(items, "Heal")


	/**
	 * *Makes a panda sad for*
	 * *the specified duration.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Ticks*
	 *
	 * (*) = optional
	 */
	fun setPandaSadTicks(items: Items<T>) = block(items, "SetPandaSadTicks")


	/**
	 */
	fun setItemOwner(items: Items<T>) = block(items, "SetItemOwner")


	/**
	 * *Sets a mob's dye color.*
	 */
	fun setDyeColor(items: Items<T>) = block(items, "SetDyeColor")


	/**
	 * *Launches an entity up or down.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Launch power*
	 *
	 * (*) = optional
	 */
	fun launchUp(items: Items<T>) = block(items, "LaunchUp")


	/**
	 * *Sets an animal's age.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Age*
	 *
	 * (*) = optional
	 */
	fun setAge(items: Items<T>) = block(items, "SetAge")


	/**
	 * *Sets an entity's custom name.*
	 *
	 * #### Args:
	 *
	 * [TextItem]
	 *
	 * *Custom name*
	 *
	 * (*) = optional
	 */
	fun setName(items: Items<T>) = block(items, " SetName ")


	/**
	 */
	fun noGravity(items: Items<T>) = block(items, "NoGravity")


	/**
	 * *Sets whether a mob has its*
	 * *arms raised.*
	 */
	fun setArmsRaised(items: Items<T>) = block(items, "SetArmsRaised")


	/**
	 */
	fun setMoveSpeed(items: Items<T>) = block(items, "SetMoveSpeed")


	/**
	 * *Sets whether an entity is*
	 * *invulnerable to damage.*
	 */
	fun setInvulnerable(items: Items<T>) = block(items, "SetInvulnerable")


	/**
	 * *Changes the type of friction*
	 * *an entity experiences.*
	 */
	fun setFriction(items: Items<T>) = block(items, "SetFriction")


	/**
	 */
	fun projColl(items: Items<T>) = block(items, "ProjColl")


	/**
	 */
	fun armorStandTags(items: Items<T>) = block(items, "ArmorStandTags")


	/**
	 * *Sets the number of ticks a*
	 * *dropped item cannot be*
	 * *picked up for.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Delay*
	 *
	 * (*) = optional
	 */
	fun setPickupDelay(items: Items<T>) = block(items, "SetPickupDelay")


	/**
	 */
	fun dropItems(items: Items<T>) = block(items, "DropItems")


	/**
	 * *Sets one of the entity's miscellaneous*
	 * *attributes such as scale and*
	 * *burning time.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Value*
	 *
	 * (*) = optional
	 */
	fun miscAttribute(items: Items<T>) = block(items, "MiscAttribute")


	/**
	 * *Sets a creeper's explosion power.*
	 * *This affects the damage and area*
	 * *of effect.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Power (0-25)*
	 *
	 * (*) = optional
	 */
	fun setCreeperPower(items: Items<T>) = block(items, "SetCreeperPower")


	/**
	 * *Sets whether an armor stand*
	 * *is a marker.*
	 */
	fun setMarker(items: Items<T>) = block(items, "SetMarker")


	/**
	 * *Removes a custom tag*
	 * *from an entity.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Tag name*
	 *
	 * (*) = optional
	 */
	fun removeCustomTag(items: Items<T>) = block(items, "RemoveCustomTag")


	/**
	 * *Sets an entity's absorption*
	 * *health (golden hearts).*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Absorption health*
	 *
	 * (*) = optional
	 */
	fun setAbsorption(items: Items<T>) = block(items, "SetAbsorption")


	/**
	 * *Sets whether a creeper*
	 * *has the charged effect.*
	 */
	fun creeperCharged(items: Items<T>) = block(items, "CreeperCharged")


	/**
	 * *Sets the remaining time an entity is on*
	 * *fire for.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Ticks*
	 *
	 * (*) = optional
	 */
	fun setFireTicks(items: Items<T>) = block(items, "SetFireTicks")


	/**
	 * *Sets one of the entity's combat-related*
	 * *attributes such as attack damage*
	 * *and attack speed.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Value*
	 *
	 * (*) = optional
	 */
	fun combatAttribute(items: Items<T>) = block(items, "CombatAttribute")


	/**
	 * *Causes a mob to jump.*
	 */
	fun jump(items: Items<T>) = block(items, "Jump")


	/**
	 * *Sets the displayed block*
	 * *of a block display.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Displayed block*
	 *
	 * [TextItem]
	 *
	 * (*) *Block data*
	 *
	 * (*) = optional
	 */
	fun bDisplayBlock(items: Items<T>) = block(items, "BDisplayBlock")


	/**
	 * *Sets an entity's current*
	 * *freeze ticks.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Ticks*
	 * *(0-140)*
	 *
	 * (*) = optional
	 */
	fun setFreezeTicks(items: Items<T>) = block(items, "SetFreezeTicks")


	/**
	 * *Sets whether a text display*
	 * *is visible through walls*
	 * *or not.*
	 */
	fun tDisplaySeeThru(items: Items<T>) = block(items, "TDisplaySeeThru")


	/**
	 * *Sets whether an entity*
	 * *is gliding.*
	 */
	fun setGliding(items: Items<T>) = block(items, "SetGliding")


	/**
	 * *Changes an entity's pitch and*
	 * *yaw without teleporting it.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Pitch (-90 to 90)*
	 *
	 * [NumItem]
	 *
	 * *Yaw (-180 to 180)*
	 *
	 * (*) = optional
	 */
	fun setRotation(items: Items<T>) = block(items, "SetRotation")


	/**
	 * *Sets whether a panda is*
	 * *rolling or not.*
	 */
	fun setPandaRolling(items: Items<T>) = block(items, "SetPandaRolling")


	/**
	 * *Sets a tropical fish's*
	 * *color and pattern.*
	 */
	fun setFishPattern(items: Items<T>) = block(items, "SetFishPattern")


	/**
	 * *Sets a wolf's variant.*
	 */
	fun setWolfType(items: Items<T>) = block(items, "SetWolfType")


	/**
	 * *Sets the interpolation*
	 * *properties of a display*
	 * *entity.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Interpolation duration*
	 * (*) *in ticks*
	 *
	 * [NumItem]
	 *
	 * (*) *Interpolation delay*
	 * (*) *in ticks*
	 *
	 * (*) = optional
	 */
	fun dispInterpolation(items: Items<T>) = block(items, "DispInterpolation")


	/**
	 */
	fun setHandItem(items: Items<T>) = block(items, "SetHandItem")


	/**
	 * *Set an enderman's held block.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Block to hold*
	 *
	 * (*) = optional
	 */
	fun setEndermanBlock(items: Items<T>) = block(items, "SetEndermanBlock")


	/**
	 * *Launches an entity toward or away*
	 * *from a location.*
	 *
	 * #### Args:
	 *
	 * [LocItem]
	 *
	 * *Launch destination*
	 *
	 * [NumItem]
	 *
	 * (*) *Launch power*
	 *
	 * (*) = optional
	 */
	fun launchToward(items: Items<T>) = block(items, "LaunchToward")


	/**
	 * *Sets a mob's armor items.*
	 * *Place the armor in slots 1-4*
	 * *of the chest, with 1 being the*
	 * *helmet and 4 being the boots.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Armor to set*
	 *
	 * (*) = optional
	 */
	fun setArmor(items: Items<T>) = block(items, "SetArmor")


	/**
	 * *Gets the value of a custom*
	 * *entity tag.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * *Tag name*
	 *
	 * (*) = optional
	 */
	fun getCustomTag(items: Items<T>) = block(items, "GetCustomTag")


	/**
	 * *Sets the hitbox size of*
	 * *an interaction entity.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Width*
	 *
	 * [NumItem]
	 *
	 * (*) *Height*
	 *
	 * (*) = optional
	 */
	fun interactionSize(items: Items<T>) = block(items, "InteractionSize")


	/**
	 * *Rotates an entity to look*
	 * *toward a location without*
	 * *teleporting them.*
	 *
	 * #### Args:
	 *
	 * [LocItem]
	 *
	 * *Location to face*
	 *
	 * (*) = optional
	 */
	fun faceLocation(items: Items<T>) = block(items, "FaceLocation")


	/**
	 * *Sets a cat's skin type.*
	 */
	fun setCatType(items: Items<T>) = block(items, "SetCatType")


	/**
	 * *Sets the base damage*
	 * *dealt by an arrow or trident.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Base Damage*
	 *
	 * (*) = optional
	 */
	fun setArrowDamage(items: Items<T>) = block(items, "SetArrowDamage")


	/**
	 * *Sets the scale of*
	 * *a display entity.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *X scale*
	 *
	 * [NumItem]
	 *
	 * *Y scale*
	 *
	 * [NumItem]
	 *
	 * *Z scale*
	 *
	 * [VecItem]
	 *
	 * *Scale vector*
	 *
	 * (*) = optional
	 */
	fun displayScale(items: Items<T>) = block(items, "DisplayScale")


	/**
	 * *Sets the text alignment*
	 * *of a text display.*
	 */
	fun tDisplayAlign(items: Items<T>) = block(items, "TDisplayAlign")


	/**
	 * *Launches a projectile from a mob.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Projectile to launch*
	 *
	 * [LocItem]
	 *
	 * (*) *Launch point*
	 *
	 * [TextItem]
	 *
	 * (*) *Projectile name*
	 *
	 * [NumItem]
	 *
	 * (*) *Speed*
	 *
	 * [NumItem]
	 *
	 * (*) *Inaccuracy*
	 *
	 * (*) = optional
	 */
	fun launchProj(items: Items<T>) = block(items, "LaunchProj")


	/**
	 */
	fun enableAI(items: Items<T>) = block(items, "EnableAI")


	/**
	 * *Sets how a display entity*
	 * *is rotated with a*
	 * *player's view.*
	 */
	fun displayBillboard(items: Items<T>) = block(items, "DisplayBillboard")


	/**
	 */
	fun noProjColl(items: Items<T>) = block(items, "NoProjColl")


	/**
	 * *Tames and sets the owner*
	 * *of a tameable mob.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Owner UUID*
	 *
	 * [TextItem]
	 *
	 * *Owner name*
	 *
	 * (*) = optional
	 */
	fun tame(items: Items<T>) = block(items, "Tame")


	/**
	 * *Sets whether a goat*
	 * *screams or not.*
	 */
	fun setGoatScreaming(items: Items<T>) = block(items, "SetGoatScreaming")


	/**
	 * *Sets whether a bee*
	 * *has its stinger.*
	 */
	fun setBeeStinger(items: Items<T>) = block(items, "SetBeeStinger")


	/**
	 * *Disguises an entity as a mob.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Mob to disguise as*
	 *
	 * [TextItem]
	 *
	 * (*) *Display name*
	 *
	 * (*) = optional
	 */
	fun mobDisguise(items: Items<T>) = block(items, "MobDisguise")


	/**
	 * *Sets the block shown inside*
	 * *a minecart. This does not*
	 * *affect its functionality.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Block to show*
	 *
	 * [NumItem]
	 *
	 * (*) *Block offset*
	 *
	 * (*) = optional
	 */
	fun setMinecartBlock(items: Items<T>) = block(items, "SetMinecartBlock")


	/**
	 * *Causes a fox to start*
	 * *or stop sleeping.*
	 */
	fun foxSleeping(items: Items<T>) = block(items, "FoxSleeping")


	/**
	 * *Sets the item in one of the*
	 * *equipment slots (including*
	 * *horse items) of an entity.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to set*
	 *
	 * (*) = optional
	 */
	fun setEquipment(items: Items<T>) = block(items, "SetEquipment")


	/**
	 * *Sets whether an entity will*
	 * *produce sound effects.*
	 */
	fun setSilenced(items: Items<T>) = block(items, "SetSilenced")


	/**
	 * *Sets if a bee has nectar*
	 * *on its body.*
	 */
	fun setBeeNectar(items: Items<T>) = block(items, "SetBeeNectar")


	/**
	 * *Attaches a lead to the target,*
	 * *held by an entity or lead knot.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Lead holder UUID*
	 *
	 * [TextItem]
	 *
	 * *Lead holder name*
	 *
	 * [LocItem]
	 *
	 * *Lead knot location*
	 *
	 * (*) = optional
	 */
	fun attachLead(items: Items<T>) = block(items, "AttachLead")


	/**
	 * *Removes one or more potion*
	 * *effects from an entity.*
	 *
	 * #### Args:
	 *
	 * [PotionItem]
	 *
	 * *Effect(s)*
	 * *to remove*
	 *
	 * (*) = optional
	 */
	fun removePotion(items: Items<T>) = block(items, "RemovePotion")


	/**
	 * *Causes a sheep to*
	 * *be sheared.*
	 */
	fun shearSheep(items: Items<T>) = block(items, "ShearSheep")


	/**
	 * *Sets the possible interactions, such*
	 * *as adding or removing items, of an*
	 * *armor stand's slot(s).*
	 */
	fun armorStandSlots(items: Items<T>) = block(items, "ArmorStandSlots")


	/**
	 * *Sets whether an allay is*
	 * *dancing or not.*
	 */
	fun setAllayDancing(items: Items<T>) = block(items, "SetAllayDancing")


	/**
	 * *Sets a rabbit's skin type.*
	 */
	fun setRabbitType(items: Items<T>) = block(items, "SetRabbitType")


	/**
	 * *Sets the size of an entity.*
	 * *This may also affect its*
	 * *health and strength.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Size*
	 *
	 * (*) = optional
	 */
	fun setSize(items: Items<T>) = block(items, "SetSize")


	/**
	 */
	fun showName(items: Items<T>) = block(items, "ShowName")


	/**
	 * *Sets whether a mob is*
	 * *angry at players.*
	 */
	fun setAngry(items: Items<T>) = block(items, "SetAngry")


	/**
	 * *Removes an entity's disguise.*
	 */
	fun undisguise(items: Items<T>) = block(items, "Undisguise")


	/**
	 * *Sets whether a mob drops*
	 * *their items when dead.*
	 */
	fun setDeathDrops(items: Items<T>) = block(items, "SetDeathDrops")


	/**
	 * *Sets whether an item*
	 * *or a falling block will*
	 * *never despawn.*
	 */
	fun setPersistent(items: Items<T>) = block(items, "SetPersistent")


	/**
	 * *Sets the item a projectile*
	 * *displays as.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Display item*
	 *
	 * (*) = optional
	 */
	fun projectileItem(items: Items<T>) = block(items, "ProjectileItem")


	/**
	 * *Sets the color an entity's*
	 * *name tag appears in.*
	 */
	fun setNameColor(items: Items<T>) = block(items, "SetNameColor")


	/**
	 * *Sets whether a mob carries*
	 * *a chest, which allows its*
	 * *inventory to be accessed.*
	 */
	fun setCarryingChest(items: Items<T>) = block(items, "SetCarryingChest")


	/**
	 * *Sets a parrot's color.*
	 */
	fun setParrotColor(items: Items<T>) = block(items, "SetParrotColor")


	/**
	 * *Sets the translation values*
	 * *of a display entity.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *X translation*
	 *
	 * [NumItem]
	 *
	 * *Y translation*
	 *
	 * [NumItem]
	 *
	 * *Z translation*
	 *
	 * [VecItem]
	 *
	 * *Translation vector*
	 *
	 * (*) = optional
	 */
	fun dispTranslation(items: Items<T>) = block(items, "DispTranslation")


	/**
	 * *Deletes an entity.*
	 */
	fun remove(items: Items<T>) = block(items, "Remove")


	/**
	 * *Sets the background color*
	 * *and opacity of a text display.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * (*) *Color hexadecimal*
	 *
	 * [NumItem]
	 *
	 * *Opacity in percentage*
	 *
	 * (*) = optional
	 */
	fun tDispBackground(items: Items<T>) = block(items, "TDispBackground")


	/**
	 * *Sets the culling width*
	 * *and height of a*
	 * *display entity.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Width*
	 *
	 * [NumItem]
	 *
	 * (*) *Height*
	 *
	 * (*) = optional
	 */
	fun displayCullingSize(items: Items<T>) = block(items, "DisplayCullingSize")


	/**
	 */
	fun hideName(items: Items<T>) = block(items, "HideName")


	/**
	 * *Sets whether a sheep*
	 * *has its wool.*
	 */
	fun setSheepSheared(items: Items<T>) = block(items, "SetSheepSheared")


	/**
	 * *Sets an axolotl's color.*
	 */
	fun setAxolotlColor(items: Items<T>) = block(items, "SetAxolotlColor")


	/**
	 * *Gets all tags registered*
	 * *on an entity.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * (*) = optional
	 */
	fun getAllEntityTags(items: Items<T>) = block(items, "GetAllEntityTags")


	/**
	 * *Sets whether an entity is*
	 * *sentient and/or affected*
	 * *by physics.*
	 */
	fun setAI(items: Items<T>) = block(items, "SetAI")


	/**
	 * *Sets one of the entity's knockback-related*
	 * *attributes such as knockback resistance.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Value*
	 *
	 * (*) = optional
	 */
	fun kBAttribute(items: Items<T>) = block(items, "KBAttribute")


	/**
	 * *Sets one of the entity's movement-related*
	 * *attributes, such as walking speed*
	 * *and jump height.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Value*
	 *
	 * (*) = optional
	 */
	fun movementAttribute(items: Items<T>) = block(items, "MovementAttribute")


	/**
	 * *Sets whether an entity*
	 * *is riptiding.*
	 */
	fun setRiptiding(items: Items<T>) = block(items, "SetRiptiding")


	/**
	 * *Sets whether an arrow*
	 * *will pass through blocks*
	 * *and through entities.*
	 */
	fun setArrowNoClip(items: Items<T>) = block(items, "SetArrowNoClip")


	/**
	 * *Sets one of the entity's falling-related*
	 * *attributes, such as gravity*
	 * *and fall damage multiplier.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Value*
	 *
	 * (*) = optional
	 */
	fun fallingAttribute(items: Items<T>) = block(items, "FallingAttribute")


	/**
	 * *Sets the projectile source of*
	 * *a projectile (or removes it).*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Shooter UUID*
	 *
	 * [TextItem]
	 *
	 * *Shooter name*
	 *
	 * (*) = optional
	 */
	fun setProjSource(items: Items<T>) = block(items, "SetProjSource")


	/**
	 * *Sets whether a fox appears*
	 * *to be leaping.*
	 */
	fun setFoxLeaping(items: Items<T>) = block(items, "SetFoxLeaping")


	/**
	 * *Sets the gene of a panda.*
	 * *This affects their behavior*
	 * *and appearance.*
	 */
	fun setPandaGene(items: Items<T>) = block(items, "SetPandaGene")


	/**
	 * *Sets an entity's maximum*
	 * *health.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Maximum health*
	 *
	 * (*) = optional
	 */
	fun setMaxHealth(items: Items<T>) = block(items, "SetMaxHealth")


	/**
	 * *Sets the time until a fish*
	 * *starts to approach a*
	 * *fishing hook.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Wait time (ticks)*
	 *
	 * (*) = optional
	 */
	fun setFishingTime(items: Items<T>) = block(items, "SetFishingTime")


	/**
	 * *Sets the location an end*
	 * *crystal points its beam at.*
	 *
	 * #### Args:
	 *
	 * [LocItem]
	 *
	 * (*) *Target*
	 *
	 * (*) = optional
	 */
	fun endCrystalBeam(items: Items<T>) = block(items, "EndCrystalBeam")


	/**
	 * *Makes a frog try to eat the*
	 * *specified mob or player.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Target UUID*
	 *
	 * [TextItem]
	 *
	 * *Target name*
	 *
	 * (*) = optional
	 */
	fun frogEat(items: Items<T>) = block(items, "FrogEat")


	/**
	 * *Sets the brightness*
	 * *of a display entity.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Block light level (0-15)*
	 *
	 * [NumItem]
	 *
	 * *Sky light level (0-15)*
	 *
	 * (*) = optional
	 */
	fun displayBrightness(items: Items<T>) = block(items, "DisplayBrightness")


	/**
	 * *Sets a villager's profession.*
	 */
	fun setProfession(items: Items<T>) = block(items, "SetProfession")


	/**
	 * *Removes all active potion*
	 * *effects from an entity.*
	 */
	fun clearPotions(items: Items<T>) = block(items, "ClearPotions")


	/**
	 * *Sets whether an armor stand has*
	 * *arms and a base plate.*
	 */
	fun armorStandParts(items: Items<T>) = block(items, "ArmorStandParts")


	/**
	 * *Sets whether an entity's*
	 * *custom name is always*
	 * *displayed above them.*
	 */
	fun setNameVisible(items: Items<T>) = block(items, " SetNameVisible ")


	/**
	 * *Instructs a mob's AI to target*
	 * *a specific mob or player.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Target UUID*
	 *
	 * [TextItem]
	 *
	 * *Target name*
	 *
	 * (*) = optional
	 */
	fun setTarget(items: Items<T>) = block(items, "SetTarget")


	/**
	 * *Sets whether the text in*
	 * *a text display has*
	 * *shadow or not.*
	 */
	fun tDisplayShadow(items: Items<T>) = block(items, "TDisplayShadow")


	/**
	 * *Sets the currently*
	 * *remaining ticks until an*
	 * *entity can next be hurt.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Ticks*
	 *
	 * (*) = optional
	 */
	fun setInvulTicks(items: Items<T>) = block(items, "SetInvulTicks")


	/**
	 * *Sets how far a shulker*
	 * *should peek up to.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Peek Percentage*
	 *
	 * (*) = optional
	 */
	fun setShulkerPeek(items: Items<T>) = block(items, "SetShulkerPeek")


	/**
	 * *Changes the pose of an entity.*
	 * *This affects their animations*
	 * *and/or hitbox, depending on*
	 * *the pose and entity type.*
	 */
	fun setPose(items: Items<T>) = block(items, " SetPose ")


	/**
	 * *Sets whether a horse is*
	 * *standing on its hind legs.*
	 */
	fun setRearing(items: Items<T>) = block(items, "SetRearing")


	/**
	 * *Sets an area of effect cloud's*
	 * *radius and shrinking speed.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Radius*
	 *
	 * [NumItem]
	 *
	 * (*) *Shrinking speed*
	 * (*) *(blocks per second)*
	 *
	 * (*) = optional
	 */
	fun setCloudRadius(items: Items<T>) = block(items, "SetCloudRadius")


	/**
	 * *Sets whether an entity*
	 * *is affected by gravity.*
	 */
	fun setGravity(items: Items<T>) = block(items, "SetGravity")


	/**
	 * *Sets how long a display entity takes*
	 * *to visually move to its destination*
	 * *when it teleports.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Teleport duration*
	 * (*) *in ticks*
	 *
	 * (*) = optional
	 */
	fun dispTPDuration(items: Items<T>) = block(items, "DispTPDuration")


	/**
	 * *Sets the remaining ticks of*
	 * *invulnerability a wither has.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Ticks*
	 *
	 * (*) = optional
	 */
	fun setWitherInvul(items: Items<T>) = block(items, "SetWitherInvul")


	/**
	 */
	fun silence(items: Items<T>) = block(items, "Silence")


	/**
	 * *Sets how many targets an*
	 * *arrow can pierce through.*
	 * *A pierce of 1 can hit*
	 * *up to 2 entities.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Targets to pierce*
	 *
	 * (*) = optional
	 */
	fun setArrowPierce(items: Items<T>) = block(items, "SetArrowPierce")


	/**
	 * *Sets the shadow properties*
	 * *of a display entity.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Shadow radius in blocks*
	 *
	 * [NumItem]
	 *
	 * (*) *Shadow opacity in*
	 * (*) *percentage*
	 *
	 * (*) = optional
	 */
	fun displayShadow(items: Items<T>) = block(items, "DisplayShadow")


	/**
	 * *Sets whether an interaction*
	 * *entity has response when*
	 * *interacting with it.*
	 */
	fun interactResponse(items: Items<T>) = block(items, "InteractResponse")


	/**
	 * *Forces a mob to use held items*
	 * *such as bow or spyglass.*
	 */
	fun useItem(items: Items<T>) = block(items, "UseItem")


	/**
	 * *Mounts an entity on top of*
	 * *another entity or player.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Target UUID*
	 *
	 * [TextItem]
	 *
	 * *Target name*
	 *
	 * (*) = optional
	 */
	fun rideEntity(items: Items<T>) = block(items, "RideEntity")


	/**
	 * *Sets the affine transformation*
	 * *matrix of a display entity.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *16 numbers describing*
	 * *a row-major matrix*
	 *
	 * (*) = optional
	 */
	fun displayMatrix(items: Items<T>) = block(items, "DisplayMatrix")


	/**
	 */
	fun noDrops(items: Items<T>) = block(items, "NoDrops")


	/**
	 * *Forces a sniffer to perform*
	 * *a specific action.*
	 */
	fun snifferState(items: Items<T>) = block(items, "SnifferState")


	/**
	 */
	fun enableGlowing(items: Items<T>) = block(items, "EnableGlowing")


	/**
	 * *Teleports an entity to a*
	 * *specified location.*
	 *
	 * #### Args:
	 *
	 * [LocItem]
	 *
	 * *New position*
	 *
	 * (*) = optional
	 */
	fun teleport(items: Items<T>) = block(items, "Teleport")


	/**
	 * *Sets the glowing color*
	 * *of a display entity.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Color hexadecimal*
	 *
	 * (*) = optional
	 */
	fun displayGlowColor(items: Items<T>) = block(items, "DisplayGlowColor")


	/**
	 * *Sets whether an entity*
	 * *should appear on fire.*
	 */
	fun setVisualFire(items: Items<T>) = block(items, "SetVisualFire")


	/**
	 */
	fun setAgeOrSize(items: Items<T>) = block(items, "SetAge/Size")


	/**
	 */
	fun lSetArmor(items: Items<T>) = block(items, "L SetArmor")


	/**
	 * *Sets whether a mob wears*
	 * *a saddle.*
	 */
	fun setSaddle(items: Items<T>) = block(items, "SetSaddle")


	/**
	 * *Causes a shulker bullet to start*
	 * *targeting the provided entity.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * (*) *Target UUID*
	 *
	 * [TextItem]
	 *
	 * (*) *Target name*
	 *
	 * (*) = optional
	 */
	fun setBulletTarget(items: Items<T>) = block(items, "SetBulletTarget")


	/**
	 * *Sets the maximum line width*
	 * *of a text display.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Line width*
	 *
	 * (*) = optional
	 */
	fun tDisplayLineWidth(items: Items<T>) = block(items, "TDisplayLineWidth")


	/**
	 * *Sets the behavior phase*
	 * *of an Ender Dragon.*
	 */
	fun setDragonPhase(items: Items<T>) = block(items, "SetDragonPhase")


	/**
	 * *Sets a llama's fur color.*
	 */
	fun setLlamaColor(items: Items<T>) = block(items, "SetLlamaColor")


	/**
	 * *Sets the biome type of a*
	 * *villager. This affects their*
	 * *appearance only.*
	 */
	fun setVillagerBiome(items: Items<T>) = block(items, "SetVillagerBiome")


	/**
	 * *Sets the starting amount*
	 * *of ticks it takes for a*
	 * *creeper to explode.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Fuse ticks*
	 *
	 * (*) = optional
	 */
	fun setCreeperFuse(items: Items<T>) = block(items, "SetCreeperFuse")


	/**
	 * *Sets whether an entity*
	 * *is a baby (permanently).*
	 */
	fun setBaby(items: Items<T>) = block(items, "SetBaby")


	/**
	 * *Sets a mooshroom's skin*
	 * *type.*
	 */
	fun mooshroomType(items: Items<T>) = block(items, "MooshroomType")


	/**
	 * *Sets whether an entity*
	 * *is invisible.*
	 */
	fun setInvisible(items: Items<T>) = block(items, "SetInvisible")


	/**
	 * *Causes a sheep to*
	 * *eat grass.*
	 */
	fun sheepEat(items: Items<T>) = block(items, "SheepEat")


	/**
	 * *Sets whether a cat appears*
	 * *to be lying down.*
	 */
	fun setCatResting(items: Items<T>) = block(items, "SetCatResting")


	/**
	 * *Gives one or more potion*
	 * *effects to an entity.*
	 *
	 * #### Args:
	 *
	 * [PotionItem]
	 *
	 * *Effect(s)*
	 * *to give*
	 *
	 * (*) = optional
	 */
	fun givePotion(items: Items<T>) = block(items, "GivePotion")


	/**
	 * *Sets which goat horns*
	 * *are shown or hidden.*
	 */
	fun setGoatHorns(items: Items<T>) = block(items, "SetGoatHorns")


	/**
	 * *Sets whether this entity has*
	 * *a glowing outline that can*
	 * *be seen through blocks.*
	 */
	fun setGlowing(items: Items<T>) = block(items, "SetGlowing")


	/**
	 * *Sets whether a panda is*
	 * *laying on its back or not.*
	 */
	fun setPandaOnBack(items: Items<T>) = block(items, "SetPandaOnBack")


	/**
	 * *Sets the model type*
	 * *of an item display.*
	 */
	fun iDisplayModelType(items: Items<T>) = block(items, "IDisplayModelType")


	/**
	 * *Sets an entity's current*
	 * *health.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Current health*
	 *
	 * (*) = optional
	 */
	fun setHealth(items: Items<T>) = block(items, "SetHealth")


	/**
	 * *Disguises an entity as a block.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Block to disguise as*
	 *
	 * [TextItem]
	 *
	 * (*) *Display name*
	 *
	 * (*) = optional
	 */
	fun blockDisguise(items: Items<T>) = block(items, "BlockDisguise")


	/**
	 * *Sets whether a mob is able*
	 * *to collide with other entities.*
	 */
	fun setCollidable(items: Items<T>) = block(items, "SetCollidable")


	/**
	 * *Sets the rotation of an armor*
	 * *stand part.*
	 *
	 * #### Args:
	 *
	 * [VecItem]
	 *
	 * *Direction*
	 *
	 * [NumItem]
	 *
	 * (*) *X Rotation (0-360)*
	 *
	 * [NumItem]
	 *
	 * (*) *Y Rotation (0-360)*
	 *
	 * [NumItem]
	 *
	 * (*) *Z Rotation (0-360)*
	 *
	 * (*) = optional
	 */
	fun armorStandPose(items: Items<T>) = block(items, "ArmorStandPose")


	/**
	 * *Launches an entity forward*
	 * *or backward.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Launch power*
	 *
	 * (*) = optional
	 */
	fun launchFwd(items: Items<T>) = block(items, "LaunchFwd")


	/**
	 * *Sets an entity's fall distance,*
	 * *affecting fall damage upon*
	 * *landing.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Fall distance (blocks)*
	 *
	 * (*) = optional
	 */
	fun setFallDistance(items: Items<T>) = block(items, "SetFallDistance")


	/**
	 * *Instructs a mob's AI to always*
	 * *pathfind to a certain location*
	 * *at a certain speed.*
	 *
	 * #### Args:
	 *
	 * [LocItem]
	 *
	 * *Target location*
	 *
	 * [NumItem]
	 *
	 * (*) *Walk speed*
	 *
	 * (*) = optional
	 */
	fun moveToLoc(items: Items<T>) = block(items, "MoveToLoc")


	/**
	 * *Sets the text opacity*
	 * *of a text display.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Text opacity*
	 *
	 * (*) = optional
	 */
	fun tDisplayOpacity(items: Items<T>) = block(items, "TDisplayOpacity")


	/**
	 * *Sets the displayed item*
	 * *of an item display.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Displayed item*
	 *
	 * (*) = optional
	 */
	fun iDisplayItem(items: Items<T>) = block(items, "IDisplayItem")


	/**
	 * *Makes a mob perform*
	 * *an attack animation.*
	 */
	fun attackAnimation(items: Items<T>) = block(items, "AttackAnimation")


	/**
	 * *Sets whether a snow golem*
	 * *is wearing a pumpkin.*
	 */
	fun snowmanPumpkin(items: Items<T>) = block(items, "SnowmanPumpkin")


	/**
	 * *Sets the value of or creates*
	 * *a custom tag value.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Tag name*
	 *
	 * [NumItem]
	 *
	 * *Tag value*
	 *
	 * [StringItem]
	 *
	 * *Tag value*
	 *
	 * (*) = optional
	 */
	fun setCustomTag(items: Items<T>) = block(items, "SetCustomTag")


	/**
	 */
	fun gravity(items: Items<T>) = block(items, "Gravity")


	/**
	 * *Sets the view range of a*
	 * *display entity.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *View range in blocks*
	 *
	 * (*) = optional
	 */
	fun displayViewRange(items: Items<T>) = block(items, "DisplayViewRange")


	/**
	 */
	fun noAI(items: Items<T>) = block(items, "NoAI")


	/**
	 * *Disguises an entity as a player.*
	 *
	 * #### Args:
	 *
	 * [TextItem]
	 *
	 * *Player name to disguise as*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Display skin*
	 *
	 * (*) = optional
	 */
	fun playerDisguise(items: Items<T>) = block(items, "PlayerDisguise")


	/**
	 * *Sets the item of*
	 * *an item entity.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *New item*
	 *
	 * (*) = optional
	 */
	fun setItem(items: Items<T>) = block(items, "SetItem")


	/**
	 * *Causes an entity*
	 * *to explode.*
	 */
	fun explode(items: Items<T>) = block(items, "Explode")


	/**
	 * *Makes a warden emerge*
	 * *or dig into the ground.*
	 */
	fun setDigging(items: Items<T>) = block(items, "SetDigging")


	/**
	 */
	fun moveTo(items: Items<T>) = block(items, "MoveTo")


	/**
	 * *Sets the sound an arrow*
	 * *plays whenever it lands.*
	 *
	 * #### Args:
	 *
	 * [SoundItem]
	 *
	 * *Sound to play*
	 *
	 * (*) = optional
	 */
	fun setArrowHitSound(items: Items<T>) = block(items, "SetArrowHitSound")


	/**
	 * *Sets whether a vex is*
	 * *charging or not.*
	 */
	fun setVexCharging(items: Items<T>) = block(items, "SetVexCharging")


	/**
	 * *Sets a villager's experience*
	 * *points, which affects their level.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Experience*
	 *
	 * (*) = optional
	 */
	fun setVillagerExp(items: Items<T>) = block(items, "SetVillagerExp")


	/**
	 * *Ignites a creeper, causing*
	 * *it to explode after a fuse*
	 * *period.*
	 */
	fun igniteCreeper(items: Items<T>) = block(items, "IgniteCreeper")


	/**
	 * *Causes a mob to start*
	 * *or stop celebrating.*
	 */
	fun setCelebrating(items: Items<T>) = block(items, "SetCelebrating")


	/**
	 * *Sets the displayed text*
	 * *of a text display.*
	 *
	 * #### Args:
	 *
	 * [TextItem]
	 *
	 * *Displayed text*
	 *
	 * (*) = optional
	 */
	fun tDisplayText(items: Items<T>) = block(items, "TDisplayText")


	/**
	 * *Sets a horse's jump strength.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * *Strength*
	 *
	 * (*) = optional
	 */
	fun setHorseJump(items: Items<T>) = block(items, "SetHorseJump")


	/**
	 */
	fun unsilence(items: Items<T>) = block(items, "Unsilence")


	/**
	 * *Sets one of the entity's health-related*
	 * *attributes such as max health*
	 * *and armor defense points.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Value*
	 *
	 * (*) = optional
	 */
	fun healthAttribute(items: Items<T>) = block(items, "HealthAttribute")


	/**
	 * *Makes a goat ram the*
	 * *specified mob or player.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Target UUID*
	 *
	 * [TextItem]
	 *
	 * *Target name*
	 *
	 * (*) = optional
	 */
	fun ram(items: Items<T>) = block(items, "Ram")


	/**
	 * *Sets a fox's fur type.*
	 */
	fun setFoxType(items: Items<T>) = block(items, "SetFoxType")

}