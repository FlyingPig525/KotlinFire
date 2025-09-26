package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.item.type.tag.PlayerActionTags
import kotlinx.serialization.json.JsonObjectBuilder

@Suppress("unused")
class PlayerActionCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(items: Items, action: String, extra: JsonObjectBuilder.() -> Unit = {}) {
        blocks += Block("player_action", ItemCollection(items).items, action, extra)
    }
	/**
	 * Sets items in a player's
	 * hotbar.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to set
	 *
	 * *Slots 1-9*
	 *
	 * (*) = optional
	 */
	fun setHotbar(items: Items) {
		block(items, "SetHotbar")
	}


	/**
	 * When enabled, a player won't be
	 * able to see their coordinates,
	 * block info, or other info.
	 */
	fun setReducedDebug(items: Items) {
		block(items, "SetReducedDebug")
	}


	/**
	 * Closes a player's inventory.
	 */
	fun closeInv(items: Items) {
		block(items, "CloseInv")
	}


	/**
	 * Gives a player all of the
	 * items in the chest.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to give
	 *
	 * [NumItem]
	 *
	 * (*) Amount to give
	 *
	 * (*) = optional
	 */
	fun giveItems(items: Items) {
		block(items, "GiveItems")
	}


	/**
	 */
	fun noKeepInv(items: Items) {
		block(items, "NoKeepInv")
	}


	/**
	 * Sets if a player is
	 * allowed to interact with
	 * their hand-crafting menu.
	 */
	fun setHandCrafting(items: Items) {
		block(items, "SetHandCrafting")
	}


	/**
	 */
	fun bossBar(items: Items) {
		block(items, "BossBar")
	}


	/**
	 * Displays a sphere of particles
	 * at a location to a player.
	 *
	 * **Args:**
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect
	 *
	 * [LocItem]
	 *
	 * Center location
	 *
	 * [NumItem]
	 *
	 * (*) Diameter
	 *
	 * *Default = 2 blocks*
	 *
	 * (*) = optional
	 */
	fun particleSphere(items: Items) {
		block(items, "ParticleSphere")
	}


	/**
	 * Sets a player's movement
	 * velocity.
	 *
	 * **Args:**
	 *
	 * [VecItem]
	 *
	 * New velocity
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SetVelocity]
	 */
	fun setVelocity(items: Items) {
		block(items, "SetVelocity")
	}


	/**
	 * Displays a particle effect
	 * to a player.
	 *
	 * **Args:**
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect
	 *
	 * [LocItem]
	 *
	 * Effect location
	 *
	 * (*) = optional
	 */
	fun particle(items: Items) {
		block(items, "Particle")
	}


	/**
	 * Adds a row to the bottom of
	 * a player's current inventory
	 * menu.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) Items to display
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.AddInvRow]
	 */
	fun addInvRow(items: Items) {
		block(items, "AddInvRow")
	}


	/**
	 */
	fun noNatRegen(items: Items) {
		block(items, "NoNatRegen")
	}


	/**
	 * Displays a lightning strike
	 * effect to a player.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Strike location
	 *
	 * (*) = optional
	 */
	fun displayLightning(items: Items) {
		block(items, "DisplayLightning")
	}


	/**
	 * Damages a player.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Damage to inflict
	 *
	 * *❤ = 2 Health*
	 *
	 * [StringItem]
	 *
	 * (*) UUID of damager entity
	 *
	 * [TextItem]
	 *
	 * (*) Name of damager entity
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.Damage]
	 */
	fun damage(items: Items) {
		block(items, "Damage")
	}


	/**
	 */
	fun sendAnimation(items: Items) {
		block(items, "SendAnimation")
	}


	/**
	 * Sets the XP progress bar
	 * to a certain percentage.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Progress % (0-100)
	 *
	 * (*) = optional
	 */
	fun setXPProg(items: Items) {
		block(items, "SetXPProg")
	}


	/**
	 * Sets items in a player's
	 * upper inventory.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to set
	 *
	 * (*) = optional
	 */
	fun setInventory(items: Items) {
		block(items, "SetInventory")
	}


	/**
	 * Teleports a player to multiple
	 * locations, with a delay between
	 * each teleport.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Locations to
	 * teleport to
	 *
	 * [NumItem]
	 *
	 * (*) Teleport delay (ticks,
	 * (*) default = 60)
	 *
	 * (*) = optional
	 */
	fun tpSequence(items: Items) {
		block(items, "TpSequence")
	}


	/**
	 * Restores a player's health.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Amount to heal
	 *
	 * *❤ = 2 Health*
	 *
	 * (*) = optional
	 */
	fun heal(items: Items) {
		block(items, "Heal")
	}


	/**
	 * Sets the location a player will
	 * spawn when they die and respawn.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * The new spawn location
	 *
	 * (*) = optional
	 */
	fun setSpawnPoint(items: Items) {
		block(items, "SetSpawnPoint")
	}


	/**
	 * Sets whether a player's inventory
	 * is kept after death.
	 */
	fun setInventoryKept(items: Items) {
		block(items, "SetInventoryKept")
	}


	/**
	 * Launches a player up or down.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Launch power
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.LaunchUp]
	 */
	fun launchUp(items: Items) {
		block(items, "LaunchUp")
	}


	/**
	 */
	fun getTargetEntity(items: Items) {
		block(items, "GetTargetEntity")
	}


	/**
	 * Forces a player to start
	 * or stop flying.
	 */
	fun forceFlight(items: Items) {
		block(items, "ForceFlight")
	}


	/**
	 * Loads a player's inventory.
	 */
	fun loadInv(items: Items) {
		block(items, "LoadInv")
	}


	/**
	 * Sets a player's chat color or
	 * decoration.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * New chat style
	 *
	 * (*) = optional
	 */
	fun chatStyle(items: Items) {
		block(items, "ChatStyle")
	}


	/**
	 * Kicks a player from
	 * the plot.
	 */
	fun kick(items: Items) {
		block(items, "Kick")
	}


	/**
	 */
	fun projColl(items: Items) {
		block(items, "ProjColl")
	}


	/**
	 * Sets one of the player's miscellaneous
	 * attributes such as scale and
	 * burning time.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.MiscAttribute]
	 */
	fun miscAttribute(items: Items) {
		block(items, "MiscAttribute")
	}


	/**
	 * Makes a player spectate
	 * another player or entity.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Target UUID
	 *
	 * [TextItem]
	 *
	 * Target name
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SpectateTarget]
	 */
	fun spectateTarget(items: Items) {
		block(items, "SpectateTarget")
	}


	/**
	 * Makes a player perform
	 * a hurt animation.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * (*) Damage source
	 *
	 * *Affects the direction of the screen tilt effect.*
	 *
	 * (*) = optional
	 */
	fun hurtAnimation(items: Items) {
		block(items, "HurtAnimation")
	}


	/**
	 * Sets a player's game
	 * mode to Survival.
	 */
	fun survivalMode(items: Items) {
		block(items, "SurvivalMode")
	}


	/**
	 * Displays a bell ring animation
	 * at a location to a player.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.DisplayBellRing]
	 */
	fun displayBellRing(items: Items) {
		block(items, "DisplayBellRing")
	}


	/**
	 * Sets the player's game status,
	 * which is used to display information
	 * about what the player is doing
	 * in the game.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Game Status
	 *
	 * *Limited at 50 characters*
	 *
	 * (*) = optional
	 */
	fun setStatus(items: Items) {
		block(items, "SetStatus")
	}


	/**
	 * Sets the item on a
	 * player's cursor.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item to set
	 *
	 * (*) = optional
	 */
	fun setCursorItem(items: Items) {
		block(items, "SetCursorItem")
	}


	/**
	 * Sets a player's absorption
	 * health (golden hearts).
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Absorption health
	 *
	 * *❤ = 2 Health*
	 *
	 * (*) = optional
	 */
	fun setAbsorption(items: Items) {
		block(items, "SetAbsorption")
	}


	/**
	 * Sets the remaining time a
	 * player is on fire for.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Ticks
	 *
	 * (*) = optional
	 */
	fun setFireTicks(items: Items) {
		block(items, "SetFireTicks")
	}


	/**
	 * Sets one of the player's combat-related
	 * attributes such as attack damage
	 * and attack speed.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.CombatAttribute]
	 */
	fun combatAttribute(items: Items) {
		block(items, "CombatAttribute")
	}


	/**
	 */
	fun setGamemode(items: Items) {
		block(items, "SetGamemode")
	}


	/**
	 * Removes the given number of
	 * rows from the bottom of a player's
	 * current inventory menu.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Rows to remove
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.RemoveInvRow]
	 */
	fun removeInvRow(items: Items) {
		block(items, "RemoveInvRow")
	}


	/**
	 * Displays the wake up (fade in)
	 * animation to a player.
	 */
	fun wakeUpAnimation(items: Items) {
		block(items, "WakeUpAnimation")
	}


	/**
	 * Prevents a player from placing
	 * and breaking certain blocks.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) Blocks to disallow
	 *
	 * *If no blocks are given, disallows all blocks*
	 *
	 * (*) = optional
	 */
	fun disableBlocks(items: Items) {
		block(items, "DisableBlocks")
	}


	/**
	 * Sets the objective name of the
	 * scoreboard sidebar.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Objective name
	 *
	 * (*) = optional
	 */
	fun setScoreObj(items: Items) {
		block(items, "SetScoreObj")
	}


	/**
	 */
	fun lSetHealth(items: Items) {
		block(items, "L SetHealth")
	}


	/**
	 */
	fun particleEffect(items: Items) {
		block(items, "ParticleEffect")
	}


	/**
	 * Empties a player's inventory.
	 */
	fun clearInv(items: Items) {
		block(items, "ClearInv")
	}


	/**
	 * Sets how long a player
	 * is frozen for.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Ticks
	 * (0-140)
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SetFreezeTicks]
	 */
	fun setFreezeTicks(items: Items) {
		block(items, "SetFreezeTicks")
	}


	/**
	 * Sets whether a player
	 * is gliding with elytra.
	 */
	fun setGliding(items: Items) {
		block(items, "SetGliding")
	}


	/**
	 * Changes a player's pitch and
	 * yaw.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Pitch (-90 to 90)
	 *
	 * [NumItem]
	 *
	 * Yaw (-180 to 180)
	 *
	 * (*) = optional
	 */
	fun setRotation(items: Items) {
		block(items, "SetRotation")
	}


	/**
	 * Removes all of an item from
	 * a player.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to clear
	 *
	 * (*) = optional
	 */
	fun clearItems(items: Items) {
		block(items, "ClearItems")
	}


	/**
	 * Opens a sign for a player.
	 * Also works with client-side signs.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Sign location
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.OpenSign]
	 */
	fun openSign(items: Items) {
		block(items, "OpenSign")
	}


	/**
	 * Sets whether a player
	 * is flying.
	 */
	fun setFlying(items: Items) {
		block(items, "SetFlying")
	}


	/**
	 * Displays a container block
	 * at a location as being open
	 * or closed to a player.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.DisplayBlockOpen]
	 */
	fun displayBlockOpen(items: Items) {
		block(items, "DisplayBlockOpen")
	}


	/**
	 */
	fun setHandItem(items: Items) {
		block(items, "SetHandItem")
	}


	/**
	 * Displays a custom advancement
	 * popup to a player.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Advancement name
	 *
	 * [MinecraftItem]
	 *
	 * (*) Advancement icon
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SendAdvancement]
	 */
	fun sendAdvancement(items: Items) {
		block(items, "SendAdvancement")
	}


	/**
	 */
	fun clearChat(items: Items) {
		block(items, "ClearChat")
	}


	/**
	 * Sets the item in a slot
	 * of a player's current
	 * inventory menu.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Slot
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to set
	 *
	 * (*) = optional
	 */
	fun setMenuItem(items: Items) {
		block(items, "SetMenuItem")
	}


	/**
	 * Launches a player toward or away
	 * from a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Launch destination
	 *
	 * [NumItem]
	 *
	 * (*) Launch power
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.LaunchToward]
	 */
	fun launchToward(items: Items) {
		block(items, "LaunchToward")
	}


	/**
	 * Sets a player's armor items.
	 * Place the armor in slots 1-4
	 * of the chest, with 1 being the
	 * helmet and 4 being the boots.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Armor to set
	 *
	 * (*) = optional
	 */
	fun setArmor(items: Items) {
		block(items, "SetArmor")
	}


	/**
	 * Displays a vertical beam on
	 * an end gateway to a player.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Gateway location
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.DisplayGateway]
	 */
	fun displayGateway(items: Items) {
		block(items, "DisplayGateway")
	}


	/**
	 * Adds saturation to a player.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Saturation to give
	 *
	 * (*) = optional
	 */
	fun giveSaturation(items: Items) {
		block(items, "GiveSaturation")
	}


	/**
	 * Displays equipment on an entity
	 * to a player. Equipment goes from
	 * slots 2-7 in order of Helmet,
	 * Chestplate, Leggings, Boots,
	 * Main Hand, Off Hand.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Entity UUID
	 *
	 * [TextItem]
	 *
	 * Entity name
	 *
	 * [MinecraftItem]
	 *
	 * Equipment
	 *
	 * (*) = optional
	 */
	fun displayEquipment(items: Items) {
		block(items, "DisplayEquipment")
	}


	/**
	 * Adds experience points or
	 * levels to a player.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Experience to give
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.GiveExp]
	 */
	fun giveExp(items: Items) {
		block(items, "GiveExp")
	}


	/**
	 * Rotates a player to look
	 * toward a location without
	 * teleporting them.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Location to face
	 *
	 * (*) = optional
	 */
	fun faceLocation(items: Items) {
		block(items, "FaceLocation")
	}


	/**
	 * Removes all scores from
	 * the scoreboard.
	 */
	fun clearScoreboard(items: Items) {
		block(items, "ClearScoreboard")
	}


	/**
	 * Displays text directly above
	 * a player's hotbar.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Message to send
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.ActionBar]
	 */
	fun actionBar(items: Items) {
		block(items, "ActionBar")
	}


	/**
	 * Sets a player's chat tag.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Chat tag
	 *
	 * (*) = optional
	 */
	fun setChatTag(items: Items) {
		block(items, "SetChatTag")
	}


	/**
	 * Changes a player's world border
	 * size if they have one active.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * New radius
	 *
	 * [NumItem]
	 *
	 * (*) Blocks per second
	 *
	 * (*) = optional
	 */
	fun shiftWorldBorder(items: Items) {
		block(items, "ShiftWorldBorder")
	}


	/**
	 * Displays text on a sign
	 * to a player.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Sign location
	 *
	 * [TextItem]
	 *
	 * (*) Text line(s)
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.DisplaySignText]
	 */
	fun displaySignText(items: Items) {
		block(items, "DisplaySignText")
	}


	/**
	 */
	fun setSpeed(items: Items) {
		block(items, "SetSpeed")
	}


	/**
	 * Adds 3 more rows to a player's
	 * current inventory menu using the
	 * contents of the chest.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) Items to display
	 *
	 * (*) = optional
	 */
	fun expandInv(items: Items) {
		block(items, "ExpandInv")
	}


	/**
	 * Launches a projectile from
	 * a player.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Projectile to
	 * launch
	 *
	 * [LocItem]
	 *
	 * (*) Launch point
	 *
	 * [TextItem]
	 *
	 * (*) Projectile name
	 *
	 * [NumItem]
	 *
	 * (*) Speed
	 *
	 * [NumItem]
	 *
	 * (*) Inaccuracy
	 *
	 * *Controls how much random motion is applied on launch*
	 * *Default = 1*
	 *
	 * (*) = optional
	 */
	fun launchProj(items: Items) {
		block(items, "LaunchProj")
	}


	/**
	 */
	fun noProjColl(items: Items) {
		block(items, "NoProjColl")
	}


	/**
	 */
	fun showDisguise(items: Items) {
		block(items, "ShowDisguise")
	}


	/**
	 * Displays an animated particle
	 * cuboid to a player.
	 *
	 * **Args:**
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect
	 *
	 * [LocItem]
	 *
	 * Corner 1
	 *
	 * [LocItem]
	 *
	 * Corner 2
	 *
	 * [NumItem]
	 *
	 * (*) Effect spacing
	 *
	 * *Default = 0.5 blocks*
	 *
	 * [NumItem]
	 *
	 * (*) Animation duration
	 *
	 * *Default = 40 ticks*
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.ParticleCuboidA]
	 */
	fun particleCuboidA(items: Items) {
		block(items, "ParticleCuboidA")
	}


	/**
	 * Plays a sound for a player.
	 *
	 * **Args:**
	 *
	 * [SoundItem]
	 *
	 * Sound to play
	 *
	 * [LocItem]
	 *
	 * (*) Playback location
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.PlaySound]
	 */
	fun playSound(items: Items) {
		block(items, "PlaySound")
	}


	/**
	 * Sets the location compasses
	 * point to for a player.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * New Target
	 *
	 * (*) = optional
	 */
	fun setCompass(items: Items) {
		block(items, "SetCompass")
	}


	/**
	 * Teleports a player to a random
	 * location in the chest.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Locations to
	 * choose from
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.RngTeleport]
	 */
	fun rngTeleport(items: Items) {
		block(items, "RngTeleport")
	}


	/**
	 * Disguises a player as a mob.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Mob to disguise as
	 *
	 * [TextItem]
	 *
	 * (*) Display name
	 *
	 * (*) = optional
	 */
	fun mobDisguise(items: Items) {
		block(items, "MobDisguise")
	}


	/**
	 * Allows a player to place
	 * and break certain blocks.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) Blocks to allow
	 *
	 * *If no blocks are given, allows all blocks*
	 *
	 * (*) = optional
	 */
	fun enableBlocks(items: Items) {
		block(items, "EnableBlocks")
	}


	/**
	 * Opens a container's inventory.
	 * Also works with crafting tables.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * (*) = optional
	 */
	fun openBlockInv(items: Items) {
		block(items, "OpenBlockInv")
	}


	/**
	 * Displays an animated circle
	 * of particles to a player.
	 *
	 * **Args:**
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect
	 *
	 * [LocItem]
	 *
	 * Center location
	 *
	 * [NumItem]
	 *
	 * (*) Diameter
	 *
	 * *Default = 2 blocks*
	 *
	 * [NumItem]
	 *
	 * (*) Animation duration
	 *
	 * *Default = 40 ticks*
	 *
	 * (*) = optional
	 */
	fun particleCircleA(items: Items) {
		block(items, "ParticleCircleA")
	}


	/**
	 */
	fun removeBossBar(items: Items) {
		block(items, "RemoveBossBar")
	}


	/**
	 * Sets the item in one of the
	 * equipment slots (armor and
	 * held items) of a player.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to set
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SetEquipment]
	 */
	fun setEquipment(items: Items) {
		block(items, "SetEquipment")
	}


	/**
	 */
	fun giveRngItem(items: Items) {
		block(items, "GiveRngItem")
	}


	/**
	 * Sets whether a player drops
	 * their items when dead.
	 */
	fun setDropsEnabled(items: Items) {
		block(items, "SetDropsEnabled")
	}


	/**
	 * Sends a player to another plot.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Plot handle or ID
	 *
	 * (*) = optional
	 */
	fun sendToPlot(items: Items) {
		block(items, "SendToPlot")
	}


	/**
	 * Removes one or more potion
	 * effects from a player.
	 *
	 * **Args:**
	 *
	 * [PotionItem]
	 *
	 * Effect(s)
	 * to remove
	 *
	 * (*) = optional
	 */
	fun removePotion(items: Items) {
		block(items, "RemovePotion")
	}


	/**
	 * Displays a block fracture
	 * effect at a location to a
	 * player.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Block(s) to
	 * fracture
	 *
	 * [NumItem]
	 *
	 * (*) Fracture level
	 *
	 * *0-10 (default = 0)*
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.DisplayFracture]
	 */
	fun displayFracture(items: Items) {
		block(items, "DisplayFracture")
	}


	/**
	 * Sets if an entity is hidden
	 * to a target.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Entity UUIDs
	 *
	 * [TextItem]
	 *
	 * Entity names
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SetEntityHidden]
	 */
	fun setEntityHidden(items: Items) {
		block(items, "SetEntityHidden")
	}


	/**
	 * Sets whether the scoreboard
	 * sidebar is visible to a player.
	 */
	fun setSidebar(items: Items) {
		block(items, "SetSidebar")
	}


	/**
	 */
	fun allowDrops(items: Items) {
		block(items, "AllowDrops")
	}


	/**
	 * Highlights a specific block for a player.
	 * The highlight is overlaid on a block,
	 * showing text on top if provided.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * [StringItem]
	 *
	 * (*) Color hexadecimal
	 *
	 * *Example: "#FF0000" (red)*
	 *
	 * [StringItem]
	 *
	 * (*) Name
	 *
	 * [NumItem]
	 *
	 * (*) Opacity in percentage
	 *
	 * [NumItem]
	 *
	 * (*) Duration (milliseconds)
	 *
	 * (*) = optional
	 */
	fun displayHighlighter(items: Items) {
		block(items, "DisplayHighlighter")
	}


	/**
	 */
	fun vibration(items: Items) {
		block(items, "Vibration")
	}


	/**
	 * Sets a player's selected
	 * hotbar slot.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * New slot
	 *
	 * *1 (left) to 9 (right)*
	 *
	 * (*) = optional
	 */
	fun setSlot(items: Items) {
		block(items, "SetSlot")
	}


	/**
	 * Displays a ray of particles
	 * to a player.
	 *
	 * **Args:**
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect
	 *
	 * [LocItem]
	 *
	 * Ray location
	 *
	 * [VecItem]
	 *
	 * Ray vector
	 *
	 * [NumItem]
	 *
	 * (*) Effect spacing
	 *
	 * *Default = 0.5 blocks*
	 *
	 * (*) = optional
	 */
	fun particleRay(items: Items) {
		block(items, "ParticleRay")
	}


	/**
	 * Displays a particle cuboid as a
	 * solid, hollow or wireframe
	 * shape to a player.
	 *
	 * **Args:**
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect
	 *
	 * [LocItem]
	 *
	 * Corner 1
	 *
	 * [LocItem]
	 *
	 * Corner 2
	 *
	 * [NumItem]
	 *
	 * (*) Effect spacing
	 *
	 * *Default = 0.5 blocks*
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.ParticleCuboid]
	 */
	fun particleCuboid(items: Items) {
		block(items, "ParticleCuboid")
	}


	/**
	 * Sends a series of messages
	 * in chat to a player, with a
	 * delay after each message.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Messages to send
	 *
	 * [NumItem]
	 *
	 * (*) Message delay ticks
	 *
	 * *Default = 60*
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SendMessageSeq]
	 */
	fun sendMessageSeq(items: Items) {
		block(items, "SendMessageSeq")
	}


	/**
	 * Sets the prefix or suffix
	 * for the player's name.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * (*) Prefix/suffix text
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SetNamePrefix]
	 */
	fun setNamePrefix(items: Items) {
		block(items, "SetNamePrefix")
	}


	/**
	 * Displays the real block at a
	 * location to a player, effectively
	 * removing any client-side blocks.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Block location,
	 * or start of region
	 *
	 * [LocItem]
	 *
	 * (*) End of region
	 *
	 * *Region size limit: 500 blocks*
	 *
	 * (*) = optional
	 */
	fun clearDispBlock(items: Items) {
		block(items, "ClearDispBlock")
	}


	/**
	 * Sets the heaviness of rain and
	 * storm visible to a player.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Rain level (%)
	 *
	 * [NumItem]
	 *
	 * Storm level (%)
	 *
	 * (*) = optional
	 */
	fun setRainLevel(items: Items) {
		block(items, "SetRainLevel")
	}


	/**
	 * Removes a player's disguise.
	 */
	fun undisguise(items: Items) {
		block(items, "Undisguise")
	}


	/**
	 * Displays an animated spiral of
	 * particles to a player.
	 *
	 * **Args:**
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect
	 *
	 * [LocItem]
	 *
	 * Base location
	 *
	 * [NumItem]
	 *
	 * (*) Length
	 *
	 * *Default = 10 blocks*
	 *
	 * [NumItem]
	 *
	 * (*) Diameter
	 *
	 * *Default = 2 blocks*
	 *
	 * [NumItem]
	 *
	 * (*) Effect count
	 *
	 * *Default = 50*
	 *
	 * [NumItem]
	 *
	 * (*) Rotations
	 *
	 * *Default = 4*
	 *
	 * [NumItem]
	 *
	 * (*) Animation duration
	 *
	 * *Default = 40 ticks*
	 *
	 * (*) = optional
	 */
	fun particleSpiralA(items: Items) {
		block(items, "ParticleSpiralA")
	}


	/**
	 * Sets if a player is instantly
	 * respawned upon dying.
	 */
	fun instantRespawn(items: Items) {
		block(items, "InstantRespawn")
	}


	/**
	 * Sets a score on the
	 * scoreboard.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Score name
	 *
	 * [NumItem]
	 *
	 * (*) Score value
	 *
	 * *Default = 0*
	 *
	 * (*) = optional
	 */
	fun setScore(items: Items) {
		block(items, "SetScore")
	}


	/**
	 * Sets the color a player's
	 * name tag appears in.
	 */
	fun setNameColor(items: Items) {
		block(items, "SetNameColor")
	}


	/**
	 * Sets one of the player's reach-related
	 * attributes such as block and
	 * entity interaction ranges.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.ReachAttribute]
	 */
	fun reachAttribute(items: Items) {
		block(items, "ReachAttribute")
	}


	/**
	 */
	fun setAtkSpeed(items: Items) {
		block(items, "SetAtkSpeed")
	}


	/**
	 */
	fun disablePvp(items: Items) {
		block(items, "DisablePvp")
	}


	/**
	 * Changes the tick rate of a player.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Ticks per second (0-20)
	 *
	 * *Default = 20*
	 *
	 * (*) = optional
	 */
	fun setTickRate(items: Items) {
		block(items, "SetTickRate")
	}


	/**
	 * Plays a sound that follows a
	 * moving entity or player.
	 *
	 * **Args:**
	 *
	 * [SoundItem]
	 *
	 * Sound to play
	 *
	 * [StringItem]
	 *
	 * Target UUID
	 *
	 * [TextItem]
	 *
	 * Target name
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.PlayEntitySound]
	 */
	fun playEntitySound(items: Items) {
		block(items, "PlayEntitySound")
	}


	/**
	 */
	fun replaceProj(items: Items) {
		block(items, "ReplaceProj")
	}


	/**
	 * Sets a player's experience
	 * level, points or progress.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Experience to set
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SetExp]
	 */
	fun setExp(items: Items) {
		block(items, "SetExp")
	}


	/**
	 * Sets one of the player's mining-related
	 * attributes such as break speed
	 * and mining efficiency.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.MiningAttribute]
	 */
	fun miningAttribute(items: Items) {
		block(items, "MiningAttribute")
	}


	/**
	 * Sets one of the player's knockback-related
	 * attributes such as knockback resistance.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.KBAttribute]
	 */
	fun kBAttribute(items: Items) {
		block(items, "KBAttribute")
	}


	/**
	 * Sets one of the player's movement-related
	 * attributes, such as walking speed
	 * and jump height.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.MovementAttribute]
	 */
	fun movementAttribute(items: Items) {
		block(items, "MovementAttribute")
	}


	/**
	 * Displays a spiral of particles
	 * at a location to a player.
	 *
	 * **Args:**
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect
	 *
	 * [LocItem]
	 *
	 * Base location
	 *
	 * [NumItem]
	 *
	 * (*) Length
	 *
	 * *Default = 10 blocks*
	 *
	 * [NumItem]
	 *
	 * (*) Diameter
	 *
	 * *Default = 2 blocks*
	 *
	 * [NumItem]
	 *
	 * (*) Effect count
	 *
	 * *Default = 50*
	 *
	 * [NumItem]
	 *
	 * (*) Rotations
	 *
	 * *Default = 4*
	 *
	 * (*) = optional
	 */
	fun particleSpiral(items: Items) {
		block(items, "ParticleSpiral")
	}


	/**
	 * Sets one of the player's falling-related
	 * attributes, such as gravity
	 * and fall damage multiplier.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.FallingAttribute]
	 */
	fun fallingAttribute(items: Items) {
		block(items, "FallingAttribute")
	}


	/**
	 * Sets whether a player
	 * is able to enter and exit
	 * flight mode by double
	 * tapping jump.
	 */
	fun setAllowFlight(items: Items) {
		block(items, "SetAllowFlight")
	}


	/**
	 * Sets a player's maximum
	 * health.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Maximum health
	 *
	 * *❤ = 2 Health*
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SetMaxHealth]
	 */
	fun setMaxHealth(items: Items) {
		block(items, "SetMaxHealth")
	}


	/**
	 * Sets how far the fog is
	 * displayed to a player.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Fog distance in chunks
	 * (2-7)
	 *
	 * (*) = optional
	 */
	fun setFogDistance(items: Items) {
		block(items, "SetFogDistance")
	}


	/**
	 * Sets a player's game
	 * mode to Adventure.
	 */
	fun adventureMode(items: Items) {
		block(items, "AdventureMode")
	}


	/**
	 * Sets a player's game
	 * mode to Spectator.
	 */
	fun spectatorMode(items: Items) {
		block(items, "SpectatorMode")
	}


	/**
	 * Changes a head's texture at
	 * a location for a player.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Head location
	 *
	 * [MinecraftItem]
	 *
	 * Player Head
	 *
	 * [StringItem]
	 *
	 * Head owner
	 *
	 * *Player name, UUID, or texture*
	 *
	 * (*) = optional
	 */
	fun dispHeadTexture(items: Items) {
		block(items, "DispHeadTexture")
	}


	/**
	 * Removes all active potion
	 * effects from a player.
	 */
	fun clearPotions(items: Items) {
		block(items, "ClearPotions")
	}


	/**
	 * Sets the text to be displayed
	 * above or below a player's player
	 * list shown when pressing Tab.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * (*) Header/footer text
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SetTabListInfo]
	 */
	fun setTabListInfo(items: Items) {
		block(items, "SetTabListInfo")
	}


	/**
	 */
	fun enablePvp(items: Items) {
		block(items, "EnablePvp")
	}


	/**
	 * Prompts the player to
	 * purchase a plot product.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Product ID
	 *
	 * (*) = optional
	 */
	fun promptPurchase(items: Items) {
		block(items, "PromptPurchase")
	}


	/**
	 */
	fun hideDisguise(items: Items) {
		block(items, "HideDisguise")
	}


	/**
	 * Sets the number format of a
	 * single line in the player's
	 * scoreboard.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Score name
	 *
	 * [TextItem]
	 *
	 * Content or style
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.ScoreLineFormat]
	 */
	fun scoreLineFormat(items: Items) {
		block(items, "ScoreLineFormat")
	}


	/**
	 * Creates or modifies a custom boss
	 * health bar at the top of a player's
	 * screen.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * (*) Title
	 *
	 * [NumItem]
	 *
	 * (*) Current health
	 *
	 * [NumItem]
	 *
	 * (*) Maximum health
	 *
	 * *Default = 100*
	 *
	 * [NumItem]
	 *
	 * (*) Boss bar position
	 *
	 * *Default = 1 (top)*
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SetBossBar]
	 */
	fun setBossBar(items: Items) {
		block(items, " SetBossBar ")
	}


	/**
	 * Sets the player's skin.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Player head
	 *
	 * (*) = optional
	 */
	fun setSkin(items: Items) {
		block(items, "SetSkin")
	}


	/**
	 * Toggles whether a player
	 * collides with blocks in
	 * spectator mode.
	 */
	fun spectatorCollision(items: Items) {
		block(items, "SpectatorCollision")
	}


	/**
	 * Sets whether a player's
	 * name tag is visible.
	 */
	fun setNameVisible(items: Items) {
		block(items, "SetNameVisible")
	}


	/**
	 * Sets the currently
	 * remaining ticks until a
	 * player can next be hurt.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Ticks
	 *
	 * (*) = optional
	 */
	fun setInvulTicks(items: Items) {
		block(items, "SetInvulTicks")
	}


	/**
	 */
	fun enableFlight(items: Items) {
		block(items, "EnableFlight")
	}


	/**
	 * Sets the amount of bee stings
	 * sticking out of a player's
	 * character model.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Sting Count
	 *
	 * *Default = 0*
	 *
	 * (*) = optional
	 */
	fun setStingsStuck(items: Items) {
		block(items, "SetStingsStuck")
	}


	/**
	 * Removes a score from
	 * the scoreboard.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Score name
	 *
	 * (*) = optional
	 */
	fun removeScore(items: Items) {
		block(items, "RemoveScore")
	}


	/**
	 */
	fun disallowDrops(items: Items) {
		block(items, "DisallowDrops")
	}


	/**
	 * Sets a player's exhaustion level.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Exhaustion level
	 * (0-4)
	 *
	 * (*) = optional
	 */
	fun setExhaustion(items: Items) {
		block(items, "SetExhaustion")
	}


	/**
	 * Displays a circle of particles
	 * to a player.
	 *
	 * **Args:**
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect
	 *
	 * [LocItem]
	 *
	 * Center location
	 *
	 * [NumItem]
	 *
	 * (*) Diameter
	 *
	 * *Default = 2 blocks*
	 *
	 * (*) = optional
	 */
	fun particleCircle(items: Items) {
		block(items, "ParticleCircle")
	}


	/**
	 * Displays a block at a location to
	 * a player.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Block to display
	 *
	 * [LocItem]
	 *
	 * Block location,
	 * or start of region
	 *
	 * [LocItem]
	 *
	 * (*) End of region
	 *
	 * *Region size limit: 250,000 blocks*
	 *
	 * [TextItem]
	 *
	 * (*) Block data
	 *
	 * *Example: "facing=up", "half=top"*
	 *
	 * (*) = optional
	 */
	fun displayBlock(items: Items) {
		block(items, "DisplayBlock")
	}


	/**
	 * Mounts a player on top of
	 * another player or entity.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Target UUID
	 *
	 * [TextItem]
	 *
	 * Target name
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.RideEntity]
	 */
	fun rideEntity(items: Items) {
		block(items, "RideEntity")
	}


	/**
	 */
	fun weatherRain(items: Items) {
		block(items, "WeatherRain")
	}


	/**
	 * Removes a player's world border.
	 */
	fun rmWorldBorder(items: Items) {
		block(items, "RmWorldBorder")
	}


	/**
	 * Send a resource pack to a player.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Resource Pack URL
	 *
	 * *Must link directly to a .zip file.*
	 *
	 * (*) = optional
	 */
	fun resourcePack(items: Items) {
		block(items, "ResourcePack")
	}


	/**
	 * Renames a player's current
	 * inventory menu.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Inventory name
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SetInvName]
	 */
	fun setInvName(items: Items) {
		block(items, " SetInvName ")
	}


	/**
	 * Adds exhaustion to a player.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Exhaustion to give
	 *
	 * (*) = optional
	 */
	fun giveExhaustion(items: Items) {
		block(items, "GiveExhaustion")
	}


	/**
	 * Teleports a player to
	 * a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * New position
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.Teleport]
	 */
	fun teleport(items: Items) {
		block(items, "Teleport")
	}


	/**
	 * Sets whether a player can
	 * hurt or be hurt by other
	 * players.
	 */
	fun setAllowPVP(items: Items) {
		block(items, "SetAllowPVP")
	}


	/**
	 */
	fun disableFlight(items: Items) {
		block(items, "DisableFlight")
	}


	/**
	 * Sets whether a player
	 * should appear on fire.
	 */
	fun setVisualFire(items: Items) {
		block(items, "SetVisualFire")
	}


	/**
	 * Sets a player's ability to
	 * see their own disguise. It
	 * is recommended that it is
	 * almost always hidden.
	 */
	fun setDisguiseVisible(items: Items) {
		block(items, "SetDisguiseVisible")
	}


	/**
	 * Sets the amount of arrows
	 * sticking out of a player's
	 * character model.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Arrow Count
	 *
	 * *Default = 0*
	 *
	 * (*) = optional
	 */
	fun setArrowsStuck(items: Items) {
		block(items, "SetArrowsStuck")
	}


	/**
	 * Gets the remaining cooldown
	 * on an item type.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item type to check
	 *
	 * (*) = optional
	 */
	fun getItemCooldown(items: Items) {
		block(items, "GetItemCooldown")
	}


	/**
	 */
	fun setItems(items: Items) {
		block(items, "SetItems")
	}


	/**
	 */
	fun keepInv(items: Items) {
		block(items, "KeepInv")
	}


	/**
	 * Replaces items in a player's
	 * inventory with the given item.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item(s) to replace
	 *
	 * [MinecraftItem]
	 *
	 * Item to replace with
	 *
	 * [NumItem]
	 *
	 * (*) Amount of items to
	 * (*) replace
	 *
	 * (*) = optional
	 */
	fun replaceItems(items: Items) {
		block(items, "ReplaceItems")
	}


	/**
	 * Sends a chat message to a
	 * player.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * (*) Message to send
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.SendMessage]
	 */
	fun sendMessage(items: Items) {
		block(items, "SendMessage")
	}


	/**
	 * Sets the item in a slot
	 * of a player's inventory.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to set
	 *
	 * [NumItem]
	 *
	 * Slot to set
	 *
	 * *1-9 Hotbar*
	 * *10-36 Inventory (Top to bottom)*
	 * *37-40 Armor (foot to head)*
	 * *41 Offhand*
	 *
	 * (*) = optional
	 */
	fun setSlotItem(items: Items) {
		block(items, "SetSlotItem")
	}


	/**
	 * Plays a sequence of sounds
	 * to a player, with a delay
	 * between each sound.
	 *
	 * **Args:**
	 *
	 * [SoundItem]
	 *
	 * Sounds to play
	 *
	 * [NumItem]
	 *
	 * (*) Sound delay (ticks,
	 * (*) default = 60)
	 *
	 * [LocItem]
	 *
	 * (*) Playback location
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.PlaySoundSeq]
	 */
	fun playSoundSeq(items: Items) {
		block(items, "PlaySoundSeq")
	}


	/**
	 * Displays an animated line of
	 * particles between two locations
	 * to a player.
	 *
	 * **Args:**
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect
	 *
	 * [LocItem]
	 *
	 * Start location
	 *
	 * [LocItem]
	 *
	 * End location
	 *
	 * [NumItem]
	 *
	 * (*) Effect spacing
	 *
	 * *Default = 0.5 blocks*
	 *
	 * [NumItem]
	 *
	 * (*) Animation duration
	 *
	 * *Default = 40 ticks*
	 *
	 * (*) = optional
	 */
	fun particleLineA(items: Items) {
		block(items, "ParticleLineA")
	}


	/**
	 */
	fun respawn(items: Items) {
		block(items, "Respawn")
	}


	/**
	 * Applies a cooldown visual effect
	 * to an item type.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item type to affect
	 *
	 * [NumItem]
	 *
	 * Cooldown in ticks
	 *
	 * (*) = optional
	 */
	fun setItemCooldown(items: Items) {
		block(items, "SetItemCooldown")
	}


	/**
	 * Sets the type of weather
	 * visible to a player.
	 */
	fun setPlayerWeather(items: Items) {
		block(items, "SetPlayerWeather")
	}


	/**
	 */
	fun sendHover(items: Items) {
		block(items, "SendHover")
	}


	/**
	 * Displays a parrot on the targets'
	 * shoulders.
	 */
	fun setShoulder(items: Items) {
		block(items, "SetShoulder")
	}


	/**
	 * Sets a player's remaining
	 * breath ticks.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Breath ticks
	 *
	 * (*) = optional
	 */
	fun setAirTicks(items: Items) {
		block(items, "SetAirTicks")
	}


	/**
	 * Displays a pickup animation
	 * of one entity being collected
	 * by another entity.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Entity UUID
	 *
	 * [TextItem]
	 *
	 * Entity name
	 *
	 * [StringItem]
	 *
	 * Collector UUID
	 *
	 * [TextItem]
	 *
	 * Collector name
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.DisplayPickup]
	 */
	fun displayPickup(items: Items) {
		block(items, "DisplayPickup")
	}


	/**
	 * Creates a world border only
	 * visible to a player.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Center position
	 *
	 * [NumItem]
	 *
	 * Radius in blocks
	 *
	 * [NumItem]
	 *
	 * (*) Warning distance
	 *
	 * *Default = 0*
	 *
	 * (*) = optional
	 */
	fun setWorldBorder(items: Items) {
		block(items, "SetWorldBorder")
	}


	/**
	 * Sets the time of day visible
	 * to a player.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Daylight ticks
	 *
	 * *Day: 1000*
	 * *Noon: 6000*
	 * *Night: 13000*
	 * *Midnight: 18000*
	 *
	 * (*) = optional
	 */
	fun setPlayerTime(items: Items) {
		block(items, "SetPlayerTime")
	}


	/**
	 * Adds food to a player.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Food to give
	 *
	 * (*) = optional
	 */
	fun giveFood(items: Items) {
		block(items, "GiveFood")
	}


	/**
	 */
	fun natRegen(items: Items) {
		block(items, "NatRegen")
	}


	/**
	 * Gives one or more potion
	 * effects to a player.
	 *
	 * **Args:**
	 *
	 * [PotionItem]
	 *
	 * Effect(s)
	 * to give
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.GivePotion]
	 */
	fun givePotion(items: Items) {
		block(items, "GivePotion")
	}


	/**
	 * Removes items from a player.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to remove
	 *
	 * (*) = optional
	 */
	fun removeItems(items: Items) {
		block(items, "RemoveItems")
	}


	/**
	 * Boosts a player's elytra
	 * using a firework rocket.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Firework
	 *
	 * (*) = optional
	 */
	fun boostElytra(items: Items) {
		block(items, "BoostElytra")
	}


	/**
	 * Saves a player's inventory.
	 * It can be loaded later with
	 * 'Load Saved Inventory'.
	 */
	fun saveInv(items: Items) {
		block(items, "SaveInv")
	}


	/**
	 * Opens a written book
	 * menu for a player.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Book item
	 *
	 * (*) = optional
	 */
	fun openBook(items: Items) {
		block(items, "OpenBook")
	}


	/**
	 * Sets a player's current
	 * health.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Current health
	 *
	 * *❤ = 2 Health*
	 *
	 * (*) = optional
	 */
	fun setHealth(items: Items) {
		block(items, "SetHealth")
	}


	/**
	 * Disguises a player as a block.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Block to disguise as
	 *
	 * [TextItem]
	 *
	 * (*) Display name
	 *
	 * (*) = optional
	 */
	fun blockDisguise(items: Items) {
		block(items, "BlockDisguise")
	}


	/**
	 * Undoes the interactions with
	 * blocks by a player.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Rollback time
	 *
	 * (*) = optional
	 */
	fun rollbackBlocks(items: Items) {
		block(items, "RollbackBlocks")
	}


	/**
	 */
	fun noDeathDrops(items: Items) {
		block(items, "NoDeathDrops")
	}


	/**
	 * Sets a player's walk
	 * speed.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * % of normal
	 * walk speed (0 to 500)
	 *
	 * (*) = optional
	 */
	fun walkSpeed(items: Items) {
		block(items, "WalkSpeed")
	}


	/**
	 * Clears all block highlighters
	 * displayed to a player.
	 */
	fun clearHighlighters(items: Items) {
		block(items, "ClearHighlighters")
	}


	/**
	 * Sets whether a player is
	 * able to collide with other
	 * entities.
	 */
	fun setCollidable(items: Items) {
		block(items, "SetCollidable")
	}


	/**
	 * Launches a player forward
	 * or backward.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Launch power
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.LaunchFwd]
	 */
	fun launchFwd(items: Items) {
		block(items, "LaunchFwd")
	}


	/**
	 * Sets a player's fall distance,
	 * affecting fall damage upon
	 * landing.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Fall distance (blocks)
	 *
	 * (*) = optional
	 */
	fun setFallDistance(items: Items) {
		block(items, "SetFallDistance")
	}


	/**
	 * Sets a player's game
	 * mode to Creative.
	 */
	fun creativeMode(items: Items) {
		block(items, "CreativeMode")
	}


	/**
	 * Makes a player perform
	 * an attack animation.
	 */
	fun attackAnimation(items: Items) {
		block(items, "AttackAnimation")
	}


	/**
	 * Displays a floating name tag
	 * at a location to a player.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Display location
	 *
	 * [TextItem]
	 *
	 * Text to display
	 *
	 * (*) = optional
	 */
	fun displayHologram(items: Items) {
		block(items, "DisplayHologram")
	}


	/**
	 */
	fun deathDrops(items: Items) {
		block(items, "DeathDrops")
	}


	/**
	 * Opens a custom inventory
	 * for a player.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) Items to display
	 *
	 * (*) = optional
	 */
	fun showInv(items: Items) {
		block(items, "ShowInv")
	}


	/**
	 * Sets a player's food hunger level.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Food level
	 * (1-20)
	 *
	 * (*) = optional
	 */
	fun setFoodLevel(items: Items) {
		block(items, "SetFoodLevel")
	}


	/**
	 * Disguises a player as another
	 * player.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Player name to disguise as
	 *
	 * [MinecraftItem]
	 *
	 * (*) Display skin
	 *
	 * (*) = optional
	 */
	fun playerDisguise(items: Items) {
		block(items, "PlayerDisguise")
	}


	/**
	 * Sets a player's saturation
	 * level.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Saturation level
	 * (1-20)
	 *
	 * (*) = optional
	 */
	fun setSaturation(items: Items) {
		block(items, "SetSaturation")
	}


	/**
	 */
	fun weatherClear(items: Items) {
		block(items, "WeatherClear")
	}


	/**
	 * Displays text in the center
	 * of a player's screen.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Title text
	 *
	 * [TextItem]
	 *
	 * (*) Subtitle text
	 *
	 * [NumItem]
	 *
	 * (*) Title duration
	 *
	 * *Default = 60 ticks*
	 *
	 * [NumItem]
	 *
	 * (*) Fade in length
	 *
	 * *Default = 20 ticks*
	 *
	 * [NumItem]
	 *
	 * (*) Fade out length
	 *
	 * *Default = 20 ticks*
	 *
	 * (*) = optional
	 */
	fun sendTitle(items: Items) {
		block(items, "SendTitle")
	}


	/**
	 * Sets the default number format
	 * of the player's scoreboard.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * Content or style
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.ScoreDefFormat]
	 */
	fun scoreDefFormat(items: Items) {
		block(items, "ScoreDefFormat")
	}


	/**
	 * Stops all or specific sounds
	 * for a player.
	 *
	 * **Args:**
	 *
	 * [SoundItem]
	 *
	 * (*) Sounds to stop
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.StopSound]
	 */
	fun stopSound(items: Items) {
		block(items, "StopSound")
	}


	/**
	 * Sets one of the player's health-related
	 * attributes such as max health
	 * and armor defense points.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional

	 * @see [PlayerActionTags.HealthAttribute]
	 */
	fun healthAttribute(items: Items) {
		block(items, "HealthAttribute")
	}


	/**
	 * Displays a line of particles
	 * between two locations to
	 * a player.
	 *
	 * **Args:**
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect
	 *
	 * [LocItem]
	 *
	 * Start location
	 *
	 * [LocItem]
	 *
	 * End location
	 *
	 * [NumItem]
	 *
	 * (*) Effect spacing
	 *
	 * *Default = 0.5 blocks*
	 *
	 * (*) = optional
	 */
	fun particleLine(items: Items) {
		block(items, "ParticleLine")
	}

}