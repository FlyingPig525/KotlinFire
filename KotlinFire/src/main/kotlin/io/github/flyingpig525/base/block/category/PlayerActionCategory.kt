package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.*
import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.block.subaction.*
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put
import io.github.flyingpig525.base.block.subaction.*

class PlayerActionCategory<T : Item> internal constructor(private val template: Template<T>) {
    private val blocks = template.blocks

    private fun block(items: Items<T>, action: String, extra: JsonObjectBuilder.() -> Unit = {}) {
        blocks += Block("player_action", ItemCollection(items).items, action, extra)
    }
	/**
	 * Sets items in a player's
	 * hotbar.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Item(s) to set
	 *
	 * (*) = optional
	 */
	fun setHotbar(items: Items<T>) = block(items, "SetHotbar")


	/**
	 * When enabled, a player won't be
	 * able to see their coordinates,
	 * block info, or other info.
	 */
	fun setReducedDebug(items: Items<T>) = block(items, "SetReducedDebug")


	/**
	 * Closes a player's inventory.
	 */
	fun closeInv(items: Items<T>) = block(items, "CloseInv")


	/**
	 * Gives a player all of the
	 * items in the chest.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Item(s) to give
	 *
	 * [NumItem]
	 *
	 * (*) Amount to give
	 *
	 * (*) = optional
	 */
	fun giveItems(items: Items<T>) = block(items, "GiveItems")


	/**
	 */
	fun noKeepInv(items: Items<T>) = block(items, "NoKeepInv")


	/**
	 * Sets if a player is
	 * allowed to interact with
	 * their hand-crafting menu.
	 */
	fun setHandCrafting(items: Items<T>) = block(items, "SetHandCrafting")


	/**
	 */
	fun bossBar(items: Items<T>) = block(items, "BossBar")


	/**
	 * Displays a sphere of particles
	 * at a location to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [GenericItem] (Particle)
	 *
	 *  Effect
	 *
	 * [LocItem]
	 *
	 *  Center location
	 *
	 * [NumItem]
	 *
	 * (*) Diameter
	 *
	 * (*) = optional
	 */
	fun particleSphere(items: Items<T>) = block(items, "ParticleSphere")


	/**
	 * Sets a player's movement
	 * velocity.
	 *
	 * ARGUMENTS:
	 *
	 * [VecItem]
	 *
	 *  New velocity
	 *
	 * (*) = optional
	 */
	fun setVelocity(items: Items<T>) = block(items, "SetVelocity")


	/**
	 * Displays a particle effect
	 * to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [GenericItem] (Particle)
	 *
	 *  Effect
	 *
	 * [LocItem]
	 *
	 *  Effect location
	 *
	 * (*) = optional
	 */
	fun particle(items: Items<T>) = block(items, "Particle")


	/**
	 * Adds a row to the bottom of
	 * a player's current inventory
	 * menu.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 * (*) Items to display
	 *
	 * (*) = optional
	 */
	fun addInvRow(items: Items<T>) = block(items, "AddInvRow")


	/**
	 */
	fun noNatRegen(items: Items<T>) = block(items, "NoNatRegen")


	/**
	 * Displays a lightning strike
	 * effect to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Strike location
	 *
	 * (*) = optional
	 */
	fun displayLightning(items: Items<T>) = block(items, "DisplayLightning")


	/**
	 * Damages a player.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Damage to inflict
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
	 */
	fun damage(items: Items<T>) = block(items, "Damage")


	/**
	 */
	fun sendAnimation(items: Items<T>) = block(items, "SendAnimation")


	/**
	 * Sets the XP progress bar
	 * to a certain percentage.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Progress % (0-100)
	 *
	 * (*) = optional
	 */
	fun setXPProg(items: Items<T>) = block(items, "SetXPProg")


	/**
	 * Sets items in a player's
	 * upper inventory.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Item(s) to set
	 *
	 * (*) = optional
	 */
	fun setInventory(items: Items<T>) = block(items, "SetInventory")


	/**
	 * Teleports a player to multiple
	 * locations, with a delay between
	 * each teleport.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Locations to
	 *
	 *  teleport to
	 *
	 * [NumItem]
	 *
	 * (*) Teleport delay (ticks,
	 *
	 * (*) default = 60)
	 *
	 * (*) = optional
	 */
	fun tpSequence(items: Items<T>) = block(items, "TpSequence")


	/**
	 * Restores a player's health.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Amount to heal
	 *
	 * (*) = optional
	 */
	fun heal(items: Items<T>) = block(items, "Heal")


	/**
	 * Sets the location a player will
	 * spawn when they die and respawn.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  The new spawn location
	 *
	 * (*) = optional
	 */
	fun setSpawnPoint(items: Items<T>) = block(items, "SetSpawnPoint")


	/**
	 * Sets whether a player's inventory
	 * is kept after death.
	 */
	fun setInventoryKept(items: Items<T>) = block(items, "SetInventoryKept")


	/**
	 * Launches a player up or down.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Launch power
	 *
	 * (*) = optional
	 */
	fun launchUp(items: Items<T>) = block(items, "LaunchUp")


	/**
	 */
	fun getTargetEntity(items: Items<T>) = block(items, "GetTargetEntity")


	/**
	 * Forces a player to start
	 * or stop flying.
	 */
	fun forceFlight(items: Items<T>) = block(items, "ForceFlight")


	/**
	 * Loads a player's inventory.
	 */
	fun loadInv(items: Items<T>) = block(items, "LoadInv")


	/**
	 * Sets a player's chat color or
	 * decoration.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  New chat style
	 *
	 * (*) = optional
	 */
	fun chatStyle(items: Items<T>) = block(items, "ChatStyle")


	/**
	 * Kicks a player from
	 * the plot.
	 */
	fun kick(items: Items<T>) = block(items, "Kick")


	/**
	 */
	fun projColl(items: Items<T>) = block(items, "ProjColl")


	/**
	 * Sets one of the player's miscellaneous
	 * attributes such as scale and
	 * burning time.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional
	 */
	fun miscAttribute(items: Items<T>) = block(items, "MiscAttribute")


	/**
	 * Makes a player spectate
	 * another player or entity.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  Target UUID
	 *
	 * [TextItem]
	 *
	 *  Target name
	 *
	 * (*) = optional
	 */
	fun spectateTarget(items: Items<T>) = block(items, "SpectateTarget")


	/**
	 * Makes a player perform
	 * a hurt animation.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * (*) Damage source
	 *
	 * (*) = optional
	 */
	fun hurtAnimation(items: Items<T>) = block(items, "HurtAnimation")


	/**
	 * Sets a player's game
	 * mode to Survival.
	 */
	fun survivalMode(items: Items<T>) = block(items, "SurvivalMode")


	/**
	 * Displays a bell ring animation
	 * at a location to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Block location
	 *
	 * (*) = optional
	 */
	fun displayBellRing(items: Items<T>) = block(items, "DisplayBellRing")


	/**
	 * Sets the player's game status,
	 * which is used to display information
	 * about what the player is doing
	 * in the game.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Game Status
	 *
	 * (*) = optional
	 */
	fun setStatus(items: Items<T>) = block(items, "SetStatus")


	/**
	 * Sets the item on a
	 * player's cursor.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to set
	 *
	 * (*) = optional
	 */
	fun setCursorItem(items: Items<T>) = block(items, "SetCursorItem")


	/**
	 * Sets a player's absorption
	 * health (golden hearts).
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Absorption health
	 *
	 * (*) = optional
	 */
	fun setAbsorption(items: Items<T>) = block(items, "SetAbsorption")


	/**
	 * Sets the remaining time a
	 * player is on fire for.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Ticks
	 *
	 * (*) = optional
	 */
	fun setFireTicks(items: Items<T>) = block(items, "SetFireTicks")


	/**
	 * Sets one of the player's combat-related
	 * attributes such as attack damage
	 * and attack speed.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional
	 */
	fun combatAttribute(items: Items<T>) = block(items, "CombatAttribute")


	/**
	 */
	fun setGamemode(items: Items<T>) = block(items, "SetGamemode")


	/**
	 * Removes the given number of
	 * rows from the bottom of a player's
	 * current inventory menu.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Rows to remove
	 *
	 * (*) = optional
	 */
	fun removeInvRow(items: Items<T>) = block(items, "RemoveInvRow")


	/**
	 * Displays the wake up (fade in)
	 * animation to a player.
	 */
	fun wakeUpAnimation(items: Items<T>) = block(items, "WakeUpAnimation")


	/**
	 * Prevents a player from placing
	 * and breaking certain blocks.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 * (*) Blocks to disallow
	 *
	 * (*) = optional
	 */
	fun disableBlocks(items: Items<T>) = block(items, "DisableBlocks")


	/**
	 * Sets the objective name of the
	 * scoreboard sidebar.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Objective name
	 *
	 * (*) = optional
	 */
	fun setScoreObj(items: Items<T>) = block(items, "SetScoreObj")


	/**
	 */
	fun lSetHealth(items: Items<T>) = block(items, "L SetHealth")


	/**
	 */
	fun particleEffect(items: Items<T>) = block(items, "ParticleEffect")


	/**
	 * Empties a player's inventory.
	 */
	fun clearInv(items: Items<T>) = block(items, "ClearInv")


	/**
	 * Sets how long a player
	 * is frozen for.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Ticks
	 *
	 *  (0-140)
	 *
	 * (*) = optional
	 */
	fun setFreezeTicks(items: Items<T>) = block(items, "SetFreezeTicks")


	/**
	 * Sets whether a player
	 * is gliding with elytra.
	 */
	fun setGliding(items: Items<T>) = block(items, "SetGliding")


	/**
	 * Changes a player's pitch and
	 * yaw.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Pitch (-90 to 90)
	 *
	 * [NumItem]
	 *
	 *  Yaw (-180 to 180)
	 *
	 * (*) = optional
	 */
	fun setRotation(items: Items<T>) = block(items, "SetRotation")


	/**
	 * Removes all of an item from
	 * a player.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Item(s) to clear
	 *
	 * (*) = optional
	 */
	fun clearItems(items: Items<T>) = block(items, "ClearItems")


	/**
	 * Sets whether a player
	 * is flying.
	 */
	fun setFlying(items: Items<T>) = block(items, "SetFlying")


	/**
	 * Displays a container block
	 * at a location as being open
	 * or closed to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Block location
	 *
	 * (*) = optional
	 */
	fun displayBlockOpen(items: Items<T>) = block(items, "DisplayBlockOpen")


	/**
	 */
	fun setHandItem(items: Items<T>) = block(items, "SetHandItem")


	/**
	 * Displays a custom advancement
	 * popup to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Advancement name
	 *
	 * [MinecraftItem]
	 *
	 *  Advancement icon
	 *
	 * (*) = optional
	 */
	fun sendAdvancement(items: Items<T>) = block(items, "SendAdvancement")


	/**
	 */
	fun clearChat(items: Items<T>) = block(items, "ClearChat")


	/**
	 * Sets the item in a slot
	 * of a player's current
	 * inventory menu.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Slot
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to set
	 *
	 * (*) = optional
	 */
	fun setMenuItem(items: Items<T>) = block(items, "SetMenuItem")


	/**
	 * Launches a player toward or away
	 * from a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Launch destination
	 *
	 * [NumItem]
	 *
	 * (*) Launch power
	 *
	 * (*) = optional
	 */
	fun launchToward(items: Items<T>) = block(items, "LaunchToward")


	/**
	 * Sets a player's armor items.
	 * Place the armor in slots 1-4
	 * of the chest, with 1 being the
	 * helmet and 4 being the boots.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Armor to set
	 *
	 * (*) = optional
	 */
	fun setArmor(items: Items<T>) = block(items, "SetArmor")


	/**
	 * Displays a vertical beam on
	 * an end gateway to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Gateway location
	 *
	 * (*) = optional
	 */
	fun displayGateway(items: Items<T>) = block(items, "DisplayGateway")


	/**
	 * Adds saturation to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Saturation to give
	 *
	 * (*) = optional
	 */
	fun giveSaturation(items: Items<T>) = block(items, "GiveSaturation")


	/**
	 * Displays equipment on an entity
	 * to a player. Equipment goes from
	 * slots 2-7 in order of Helmet,
	 * Chestplate, Leggings, Boots,
	 * Main Hand, Off Hand.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  Entity UUID
	 *
	 * [TextItem]
	 *
	 *  Entity name
	 *
	 * [MinecraftItem]
	 *
	 *  Equipment
	 *
	 * (*) = optional
	 */
	fun displayEquipment(items: Items<T>) = block(items, "DisplayEquipment")


	/**
	 * Adds experience points or
	 * levels to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Experience to give
	 *
	 * (*) = optional
	 */
	fun giveExp(items: Items<T>) = block(items, "GiveExp")


	/**
	 * Rotates a player to look
	 * toward a location without
	 * teleporting them.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Location to face
	 *
	 * (*) = optional
	 */
	fun faceLocation(items: Items<T>) = block(items, "FaceLocation")


	/**
	 * Removes all scores from
	 * the scoreboard.
	 */
	fun clearScoreboard(items: Items<T>) = block(items, "ClearScoreboard")


	/**
	 * Displays text directly above
	 * a player's hotbar.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Message to send
	 *
	 * (*) = optional
	 */
	fun actionBar(items: Items<T>) = block(items, "ActionBar")


	/**
	 * Sets a player's chat tag.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Chat tag
	 *
	 * (*) = optional
	 */
	fun setChatTag(items: Items<T>) = block(items, "SetChatTag")


	/**
	 * Changes a player's world border
	 * size if they have one active.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  New radius
	 *
	 * [NumItem]
	 *
	 * (*) Blocks per second
	 *
	 * (*) = optional
	 */
	fun shiftWorldBorder(items: Items<T>) = block(items, "ShiftWorldBorder")


	/**
	 * Displays text on a sign
	 * to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Sign location
	 *
	 * [TextItem]
	 *
	 * (*) Text line(s)
	 *
	 * (*) = optional
	 */
	fun displaySignText(items: Items<T>) = block(items, "DisplaySignText")


	/**
	 */
	fun setSpeed(items: Items<T>) = block(items, "SetSpeed")


	/**
	 * Adds 3 more rows to a player's
	 * current inventory menu using the
	 * contents of the chest.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 * (*) Items to display
	 *
	 * (*) = optional
	 */
	fun expandInv(items: Items<T>) = block(items, "ExpandInv")


	/**
	 * Launches a projectile from
	 * a player.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Projectile to
	 *
	 *  launch
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
	 * (*) = optional
	 */
	fun launchProj(items: Items<T>) = block(items, "LaunchProj")


	/**
	 */
	fun noProjColl(items: Items<T>) = block(items, "NoProjColl")


	/**
	 */
	fun showDisguise(items: Items<T>) = block(items, "ShowDisguise")


	/**
	 * Displays an animated particle
	 * cuboid to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [GenericItem] (Particle)
	 *
	 *  Effect
	 *
	 * [LocItem]
	 *
	 *  Corner 1
	 *
	 * [LocItem]
	 *
	 *  Corner 2
	 *
	 * [NumItem]
	 *
	 * (*) Effect spacing
	 *
	 * [NumItem]
	 *
	 * (*) Animation duration
	 *
	 * (*) = optional
	 */
	fun particleCuboidA(items: Items<T>) = block(items, "ParticleCuboidA")


	/**
	 * Plays a sound for a player.
	 *
	 * ARGUMENTS:
	 *
	 * [SoundItem]
	 *
	 *  Sound to play
	 *
	 * [LocItem]
	 *
	 * (*) Playback location
	 *
	 * (*) = optional
	 */
	fun playSound(items: Items<T>) = block(items, "PlaySound")


	/**
	 * Sets the location compasses
	 * point to for a player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  New Target
	 *
	 * (*) = optional
	 */
	fun setCompass(items: Items<T>) = block(items, "SetCompass")


	/**
	 * Teleports a player to a random
	 * location in the chest.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Locations to
	 *
	 *  choose from
	 *
	 * (*) = optional
	 */
	fun rngTeleport(items: Items<T>) = block(items, "RngTeleport")


	/**
	 * Disguises a player as a mob.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Mob to disguise as
	 *
	 * [TextItem]
	 *
	 * (*) Display name
	 *
	 * (*) = optional
	 */
	fun mobDisguise(items: Items<T>) = block(items, "MobDisguise")


	/**
	 * Allows a player to place
	 * and break certain blocks.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 * (*) Blocks to allow
	 *
	 * (*) = optional
	 */
	fun enableBlocks(items: Items<T>) = block(items, "EnableBlocks")


	/**
	 * Opens a container's inventory.
	 * Also works with crafting tables.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Container location
	 *
	 * (*) = optional
	 */
	fun openBlockInv(items: Items<T>) = block(items, "OpenBlockInv")


	/**
	 * Displays an animated circle
	 * of particles to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [GenericItem] (Particle)
	 *
	 *  Effect
	 *
	 * [LocItem]
	 *
	 *  Center location
	 *
	 * [NumItem]
	 *
	 * (*) Diameter
	 *
	 * [NumItem]
	 *
	 * (*) Animation duration
	 *
	 * (*) = optional
	 */
	fun particleCircleA(items: Items<T>) = block(items, "ParticleCircleA")


	/**
	 */
	fun removeBossBar(items: Items<T>) = block(items, "RemoveBossBar")


	/**
	 * Sets the item in one of the
	 * equipment slots (armor and
	 * held items) of a player.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to set
	 *
	 * (*) = optional
	 */
	fun setEquipment(items: Items<T>) = block(items, "SetEquipment")


	/**
	 */
	fun giveRngItem(items: Items<T>) = block(items, "GiveRngItem")


	/**
	 * Sets whether a player drops
	 * their items when dead.
	 */
	fun setDropsEnabled(items: Items<T>) = block(items, "SetDropsEnabled")


	/**
	 * Sends a player to another plot.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  Plot ID
	 *
	 * (*) = optional
	 */
	fun sendToPlot(items: Items<T>) = block(items, "SendToPlot")


	/**
	 * Removes one or more potion
	 * effects from a player.
	 *
	 * ARGUMENTS:
	 *
	 * [PotionItem]
	 *
	 *  Effect(s)
	 *
	 *  to remove
	 *
	 * (*) = optional
	 */
	fun removePotion(items: Items<T>) = block(items, "RemovePotion")


	/**
	 * Displays a block fracture
	 * effect at a location to a
	 * player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Block(s) to
	 *
	 *  fracture
	 *
	 * [NumItem]
	 *
	 * (*) Fracture level
	 *
	 * (*) = optional
	 */
	fun displayFracture(items: Items<T>) = block(items, "DisplayFracture")


	/**
	 * Sets if an entity is hidden
	 * to a target.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  Entity UUIDs
	 *
	 * [TextItem]
	 *
	 *  Entity names
	 *
	 * (*) = optional
	 */
	fun setEntityHidden(items: Items<T>) = block(items, "SetEntityHidden")


	/**
	 * Sets whether the scoreboard
	 * sidebar is visible to a player.
	 */
	fun setSidebar(items: Items<T>) = block(items, "SetSidebar")


	/**
	 */
	fun allowDrops(items: Items<T>) = block(items, "AllowDrops")


	/**
	 * Displays a Sculk Sensor
	 * vibration to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Origin location
	 *
	 * [LocItem]
	 *
	 *  Target location
	 *
	 * [NumItem]
	 *
	 * (*) Arrival time
	 *
	 * (*) = optional
	 */
	fun vibration(items: Items<T>) = block(items, "Vibration")


	/**
	 * Sets a player's selected
	 * hotbar slot.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  New slot
	 *
	 * (*) = optional
	 */
	fun setSlot(items: Items<T>) = block(items, "SetSlot")


	/**
	 * Displays a ray of particles
	 * to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [GenericItem] (Particle)
	 *
	 *  Effect
	 *
	 * [LocItem]
	 *
	 *  Ray location
	 *
	 * [VecItem]
	 *
	 *  Ray vector
	 *
	 * [NumItem]
	 *
	 * (*) Effect spacing
	 *
	 * (*) = optional
	 */
	fun particleRay(items: Items<T>) = block(items, "ParticleRay")


	/**
	 * Displays a particle cuboid as a
	 * solid, hollow or wireframe
	 * shape to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [GenericItem] (Particle)
	 *
	 *  Effect
	 *
	 * [LocItem]
	 *
	 *  Corner 1
	 *
	 * [LocItem]
	 *
	 *  Corner 2
	 *
	 * [NumItem]
	 *
	 * (*) Effect spacing
	 *
	 * (*) = optional
	 */
	fun particleCuboid(items: Items<T>) = block(items, "ParticleCuboid")


	/**
	 * Sends a series of messages
	 * in chat to a player, with a
	 * delay after each message.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Messages to send
	 *
	 * [NumItem]
	 *
	 * (*) Message delay ticks
	 *
	 * (*) = optional
	 */
	fun sendMessageSeq(items: Items<T>) = block(items, "SendMessageSeq")


	/**
	 * Sets the prefix or suffix
	 * for the player's name.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * (*) Prefix/suffix text
	 *
	 * (*) = optional
	 */
	fun setNamePrefix(items: Items<T>) = block(items, "SetNamePrefix")


	/**
	 * Displays the real block at a
	 * location to a player, effectively
	 * removing any client-side blocks.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Block location,
	 *
	 *  or start of region
	 *
	 * [LocItem]
	 *
	 * (*) End of region
	 *
	 * (*) = optional
	 */
	fun clearDispBlock(items: Items<T>) = block(items, "ClearDispBlock")


	/**
	 * Sets the heaviness of rain and
	 * storm visible to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Rain level (%)
	 *
	 * [NumItem]
	 *
	 *  Storm level (%)
	 *
	 * (*) = optional
	 */
	fun setRainLevel(items: Items<T>) = block(items, "SetRainLevel")


	/**
	 * Removes a player's disguise.
	 */
	fun undisguise(items: Items<T>) = block(items, "Undisguise")


	/**
	 * Displays an animated spiral of
	 * particles to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [GenericItem] (Particle)
	 *
	 *  Effect
	 *
	 * [LocItem]
	 *
	 *  Base location
	 *
	 * [NumItem]
	 *
	 * (*) Length
	 *
	 * [NumItem]
	 *
	 * (*) Diameter
	 *
	 * [NumItem]
	 *
	 * (*) Particle count
	 *
	 * [NumItem]
	 *
	 * (*) Rotations
	 *
	 * [NumItem]
	 *
	 * (*) Animation duration
	 *
	 * (*) = optional
	 */
	fun particleSpiralA(items: Items<T>) = block(items, "ParticleSpiralA")


	/**
	 * Sets if a player is instantly
	 * respawned upon dying.
	 */
	fun instantRespawn(items: Items<T>) = block(items, "InstantRespawn")


	/**
	 * Sets a score on the
	 * scoreboard.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Score name
	 *
	 * [NumItem]
	 *
	 * (*) Score value
	 *
	 * (*) = optional
	 */
	fun setScore(items: Items<T>) = block(items, "SetScore")


	/**
	 * Sets the color a player's
	 * name tag appears in.
	 */
	fun setNameColor(items: Items<T>) = block(items, "SetNameColor")


	/**
	 * Sets one of the player's reach-related
	 * attributes such as block and
	 * entity interaction ranges.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional
	 */
	fun reachAttribute(items: Items<T>) = block(items, "ReachAttribute")


	/**
	 */
	fun setAtkSpeed(items: Items<T>) = block(items, "SetAtkSpeed")


	/**
	 */
	fun disablePvp(items: Items<T>) = block(items, "DisablePvp")


	/**
	 * Changes the tick rate of a player.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Ticks per second (0-20)
	 *
	 * (*) = optional
	 */
	fun setTickRate(items: Items<T>) = block(items, "SetTickRate")


	/**
	 * Plays a sound that follows a
	 * moving entity or player.
	 *
	 * ARGUMENTS:
	 *
	 * [SoundItem]
	 *
	 *  Sound to play
	 *
	 * [StringItem]
	 *
	 *  Target UUID
	 *
	 * [TextItem]
	 *
	 *  Target name
	 *
	 * (*) = optional
	 */
	fun playEntitySound(items: Items<T>) = block(items, "PlayEntitySound")


	/**
	 */
	fun replaceProj(items: Items<T>) = block(items, "ReplaceProj")


	/**
	 * Sets a player's experience
	 * level, points or progress.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Experience to set
	 *
	 * (*) = optional
	 */
	fun setExp(items: Items<T>) = block(items, "SetExp")


	/**
	 * Sets one of the player's mining-related
	 * attributes such as break speed
	 * and mining efficiency.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional
	 */
	fun miningAttribute(items: Items<T>) = block(items, "MiningAttribute")


	/**
	 * Sets one of the player's knockback-related
	 * attributes such as knockback resistance.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional
	 */
	fun kBAttribute(items: Items<T>) = block(items, "KBAttribute")


	/**
	 * Sets one of the player's movement-related
	 * attributes, such as walking speed
	 * and jump height.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional
	 */
	fun movementAttribute(items: Items<T>) = block(items, "MovementAttribute")


	/**
	 * Displays a spiral of particles
	 * at a location to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [GenericItem] (Particle)
	 *
	 *  Effect
	 *
	 * [LocItem]
	 *
	 *  Base location
	 *
	 * [NumItem]
	 *
	 * (*) Length
	 *
	 * [NumItem]
	 *
	 * (*) Diameter
	 *
	 * [NumItem]
	 *
	 * (*) Effect count
	 *
	 * [NumItem]
	 *
	 * (*) Rotations
	 *
	 * (*) = optional
	 */
	fun particleSpiral(items: Items<T>) = block(items, "ParticleSpiral")


	/**
	 * Sets one of the player's falling-related
	 * attributes, such as gravity
	 * and fall damage multiplier.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional
	 */
	fun fallingAttribute(items: Items<T>) = block(items, "FallingAttribute")


	/**
	 * Sets whether a player
	 * is able to enter and exit
	 * flight mode by double
	 * tapping jump.
	 */
	fun setAllowFlight(items: Items<T>) = block(items, "SetAllowFlight")


	/**
	 * Sets a player's maximum
	 * health.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Maximum health
	 *
	 * (*) = optional
	 */
	fun setMaxHealth(items: Items<T>) = block(items, "SetMaxHealth")


	/**
	 * Sets how far the fog is
	 * displayed to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Fog distance in chunks
	 *
	 *  (2-7)
	 *
	 * (*) = optional
	 */
	fun setFogDistance(items: Items<T>) = block(items, "SetFogDistance")


	/**
	 * Sets a player's game
	 * mode to Adventure.
	 */
	fun adventureMode(items: Items<T>) = block(items, "AdventureMode")


	/**
	 * Sets a player's game
	 * mode to Spectator.
	 */
	fun spectatorMode(items: Items<T>) = block(items, "SpectatorMode")


	/**
	 * Changes a head's texture at
	 * a location for a player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Head location
	 *
	 * [MinecraftItem]
	 *
	 *  Player Head
	 *
	 * [StringItem]
	 *
	 *  Head owner
	 *
	 * (*) = optional
	 */
	fun dispHeadTexture(items: Items<T>) = block(items, "DispHeadTexture")


	/**
	 * Removes all active potion
	 * effects from a player.
	 */
	fun clearPotions(items: Items<T>) = block(items, "ClearPotions")


	/**
	 * Sets the text to be displayed
	 * above or below a player's player
	 * list shown when pressing Tab.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * (*) Header/footer text
	 *
	 * (*) = optional
	 */
	fun setTabListInfo(items: Items<T>) = block(items, "SetTabListInfo")


	/**
	 */
	fun enablePvp(items: Items<T>) = block(items, "EnablePvp")


	/**
	 */
	fun hideDisguise(items: Items<T>) = block(items, "HideDisguise")


	/**
	 * Sets the number format of a
	 * single line in the player's
	 * scoreboard.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Score name
	 *
	 * [TextItem]
	 *
	 *  Content or style
	 *
	 * (*) = optional
	 */
	fun scoreLineFormat(items: Items<T>) = block(items, "ScoreLineFormat")


	/**
	 * Creates or modifies a custom boss
	 * health bar at the top of a player's
	 * screen.
	 *
	 * ARGUMENTS:
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
	 * [NumItem]
	 *
	 * (*) Boss bar position
	 *
	 * (*) = optional
	 */
	fun setBossBar(items: Items<T>) = block(items, " SetBossBar ")


	/**
	 * Sets the player's skin.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Player head
	 *
	 * (*) = optional
	 */
	fun setSkin(items: Items<T>) = block(items, "SetSkin")


	/**
	 * Toggles whether a player
	 * collides with blocks in
	 * spectator mode.
	 */
	fun spectatorCollision(items: Items<T>) = block(items, "SpectatorCollision")


	/**
	 * Sets whether a player's
	 * name tag is visible.
	 */
	fun setNameVisible(items: Items<T>) = block(items, "SetNameVisible")


	/**
	 * Sets the currently
	 * remaining ticks until a
	 * player can next be hurt.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Ticks
	 *
	 * (*) = optional
	 */
	fun setInvulTicks(items: Items<T>) = block(items, "SetInvulTicks")


	/**
	 */
	fun enableFlight(items: Items<T>) = block(items, "EnableFlight")


	/**
	 * Sets the amount of bee stings
	 * sticking out of a player's
	 * character model.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Sting Count
	 *
	 * (*) = optional
	 */
	fun setStingsStuck(items: Items<T>) = block(items, "SetStingsStuck")


	/**
	 * Removes a score from
	 * the scoreboard.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Score name
	 *
	 * (*) = optional
	 */
	fun removeScore(items: Items<T>) = block(items, "RemoveScore")


	/**
	 */
	fun disallowDrops(items: Items<T>) = block(items, "DisallowDrops")


	/**
	 * Sets a player's exhaustion level.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Exhaustion level
	 *
	 *  (0-4)
	 *
	 * (*) = optional
	 */
	fun setExhaustion(items: Items<T>) = block(items, "SetExhaustion")


	/**
	 * Displays a circle of particles
	 * to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [GenericItem] (Particle)
	 *
	 *  Effect
	 *
	 * [LocItem]
	 *
	 *  Center location
	 *
	 * [NumItem]
	 *
	 * (*) Diameter
	 *
	 * (*) = optional
	 */
	fun particleCircle(items: Items<T>) = block(items, "ParticleCircle")


	/**
	 * Displays a block at a location to
	 * a player.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Block to display
	 *
	 * [LocItem]
	 *
	 *  Block location,
	 *
	 *  or start of region
	 *
	 * [LocItem]
	 *
	 * (*) End of region
	 *
	 * [TextItem]
	 *
	 * (*) Block data
	 *
	 * (*) = optional
	 */
	fun displayBlock(items: Items<T>) = block(items, "DisplayBlock")


	/**
	 * Mounts a player on top of
	 * another player or entity.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  Target UUID
	 *
	 * [TextItem]
	 *
	 *  Target name
	 *
	 * (*) = optional
	 */
	fun rideEntity(items: Items<T>) = block(items, "RideEntity")


	/**
	 */
	fun weatherRain(items: Items<T>) = block(items, "WeatherRain")


	/**
	 * Removes a player's world border.
	 */
	fun rmWorldBorder(items: Items<T>) = block(items, "RmWorldBorder")


	/**
	 * Send a resource pack to the player.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  Resource Pack URL
	 *
	 * (*) = optional
	 */
	fun resourcePack(items: Items<T>) = block(items, "ResourcePack")


	/**
	 * Renames a player's current
	 * inventory menu.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Inventory name
	 *
	 * (*) = optional
	 */
	fun setInvName(items: Items<T>) = block(items, " SetInvName ")


	/**
	 * Adds exhaustion to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Exhaustion to give
	 *
	 * (*) = optional
	 */
	fun giveExhaustion(items: Items<T>) = block(items, "GiveExhaustion")


	/**
	 * Teleports a player to
	 * a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  New position
	 *
	 * (*) = optional
	 */
	fun teleport(items: Items<T>) = block(items, "Teleport")


	/**
	 * Sets whether a player can
	 * hurt or be hurt by other
	 * players.
	 */
	fun setAllowPVP(items: Items<T>) = block(items, "SetAllowPVP")


	/**
	 */
	fun disableFlight(items: Items<T>) = block(items, "DisableFlight")


	/**
	 * Sets whether a player
	 * should appear on fire.
	 */
	fun setVisualFire(items: Items<T>) = block(items, "SetVisualFire")


	/**
	 * Sets a player's ability to
	 * see their own disguise. It
	 * is recommended that it is
	 * almost always hidden.
	 */
	fun setDisguiseVisible(items: Items<T>) = block(items, "SetDisguiseVisible")


	/**
	 * Sets the amount of arrows
	 * sticking out of a player's
	 * character model.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Arrow Count
	 *
	 * (*) = optional
	 */
	fun setArrowsStuck(items: Items<T>) = block(items, "SetArrowsStuck")


	/**
	 * Gets the remaining cooldown
	 * on an item type.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 *  Variable to set
	 *
	 * [MinecraftItem]
	 *
	 *  Item type to check
	 *
	 * (*) = optional
	 */
	fun getItemCooldown(items: Items<T>) = block(items, "GetItemCooldown")


	/**
	 */
	fun setItems(items: Items<T>) = block(items, "SetItems")


	/**
	 */
	fun keepInv(items: Items<T>) = block(items, "KeepInv")


	/**
	 * Replaces items in a player's
	 * inventory with the given item.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item(s) to replace
	 *
	 * [MinecraftItem]
	 *
	 *  Item to replace with
	 *
	 * [NumItem]
	 *
	 * (*) Amount of items to
	 *
	 * (*) replace
	 *
	 * (*) = optional
	 */
	fun replaceItems(items: Items<T>) = block(items, "ReplaceItems")


	/**
	 * Sends a chat message to a
	 * player.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * (*) Message to send
	 *
	 * (*) = optional
	 */
	fun sendMessage(items: Items<T>) = block(items, "SendMessage")


	/**
	 * Sets the item in a slot
	 * of a player's inventory.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to set
	 *
	 * [NumItem]
	 *
	 *  Slot to set
	 *
	 * (*) = optional
	 */
	fun setSlotItem(items: Items<T>) = block(items, "SetSlotItem")


	/**
	 * Plays a sequence of sounds
	 * to a player, with a delay
	 * between each sound.
	 *
	 * ARGUMENTS:
	 *
	 * [SoundItem]
	 *
	 *  Sounds to play
	 *
	 * [NumItem]
	 *
	 * (*) Sound delay (ticks,
	 *
	 * (*) default = 60)
	 *
	 * [LocItem]
	 *
	 * (*) Playback location
	 *
	 * (*) = optional
	 */
	fun playSoundSeq(items: Items<T>) = block(items, "PlaySoundSeq")


	/**
	 * Displays an animated line of
	 * particles between two locations
	 * to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [GenericItem] (Particle)
	 *
	 *  Effect
	 *
	 * [LocItem]
	 *
	 *  Start location
	 *
	 * [LocItem]
	 *
	 *  End location
	 *
	 * [NumItem]
	 *
	 * (*) Effect spacing
	 *
	 * [NumItem]
	 *
	 * (*) Animation duration
	 *
	 * (*) = optional
	 */
	fun particleLineA(items: Items<T>) = block(items, "ParticleLineA")


	/**
	 */
	fun respawn(items: Items<T>) = block(items, "Respawn")


	/**
	 * Applies a cooldown visual effect
	 * to an item type.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Item type to affect
	 *
	 * [NumItem]
	 *
	 *  Cooldown in ticks
	 *
	 * (*) = optional
	 */
	fun setItemCooldown(items: Items<T>) = block(items, "SetItemCooldown")


	/**
	 * Sets the type of weather
	 * visible to a player.
	 */
	fun setPlayerWeather(items: Items<T>) = block(items, "SetPlayerWeather")


	/**
	 */
	fun sendHover(items: Items<T>) = block(items, "SendHover")


	/**
	 * Displays a parrot on the targets'
	 * shoulders.
	 */
	fun setShoulder(items: Items<T>) = block(items, "SetShoulder")


	/**
	 * Sets a player's remaining
	 * breath ticks.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Breath ticks
	 *
	 * (*) = optional
	 */
	fun setAirTicks(items: Items<T>) = block(items, "SetAirTicks")


	/**
	 * Displays a pickup animation
	 * of one entity being collected
	 * by another entity.
	 *
	 * ARGUMENTS:
	 *
	 * [StringItem]
	 *
	 *  Entity UUID
	 *
	 * [TextItem]
	 *
	 *  Entity name
	 *
	 * [StringItem]
	 *
	 *  Collector UUID
	 *
	 * [TextItem]
	 *
	 *  Collector name
	 *
	 * (*) = optional
	 */
	fun displayPickup(items: Items<T>) = block(items, "DisplayPickup")


	/**
	 * Creates a world border only
	 * visible to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Center position
	 *
	 * [NumItem]
	 *
	 *  Radius in blocks
	 *
	 * [NumItem]
	 *
	 * (*) Warning distance
	 *
	 * (*) = optional
	 */
	fun setWorldBorder(items: Items<T>) = block(items, "SetWorldBorder")


	/**
	 * Sets the time of day visible
	 * to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Daylight ticks
	 *
	 * (*) = optional
	 */
	fun setPlayerTime(items: Items<T>) = block(items, "SetPlayerTime")


	/**
	 * Adds food to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Food to give
	 *
	 * (*) = optional
	 */
	fun giveFood(items: Items<T>) = block(items, "GiveFood")


	/**
	 */
	fun natRegen(items: Items<T>) = block(items, "NatRegen")


	/**
	 * Gives one or more potion
	 * effects to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [PotionItem]
	 *
	 *  Effect(s)
	 *
	 *  to give
	 *
	 * (*) = optional
	 */
	fun givePotion(items: Items<T>) = block(items, "GivePotion")


	/**
	 * Removes items from a player.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Item(s) to remove
	 *
	 * (*) = optional
	 */
	fun removeItems(items: Items<T>) = block(items, "RemoveItems")


	/**
	 * Boosts a player's elytra
	 * using a firework rocket.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Firework
	 *
	 * (*) = optional
	 */
	fun boostElytra(items: Items<T>) = block(items, "BoostElytra")


	/**
	 * Saves a player's inventory.
	 * It can be loaded later with
	 * 'Load Saved Inventory'.
	 */
	fun saveInv(items: Items<T>) = block(items, "SaveInv")


	/**
	 * Opens a written book
	 * menu for a player.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Book item
	 *
	 * (*) = optional
	 */
	fun openBook(items: Items<T>) = block(items, "OpenBook")


	/**
	 * Sets a player's current
	 * health.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Current health
	 *
	 * (*) = optional
	 */
	fun setHealth(items: Items<T>) = block(items, "SetHealth")


	/**
	 * Disguises a player as a block.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 *  Block to disguise as
	 *
	 * [TextItem]
	 *
	 * (*) Display name
	 *
	 * (*) = optional
	 */
	fun blockDisguise(items: Items<T>) = block(items, "BlockDisguise")


	/**
	 * Undoes the interactions with
	 * blocks by a player.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Rollback time
	 *
	 * (*) = optional
	 */
	fun rollbackBlocks(items: Items<T>) = block(items, "RollbackBlocks")


	/**
	 */
	fun noDeathDrops(items: Items<T>) = block(items, "NoDeathDrops")


	/**
	 * Sets a player's walk
	 * speed.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  % of normal
	 *
	 *  walk speed (0 to 500)
	 *
	 * (*) = optional
	 */
	fun walkSpeed(items: Items<T>) = block(items, "WalkSpeed")


	/**
	 * Sets whether a player is
	 * able to collide with other
	 * entities.
	 */
	fun setCollidable(items: Items<T>) = block(items, "SetCollidable")


	/**
	 * Launches a player forward
	 * or backward.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Launch power
	 *
	 * (*) = optional
	 */
	fun launchFwd(items: Items<T>) = block(items, "LaunchFwd")


	/**
	 * Sets a player's fall distance,
	 * affecting fall damage upon
	 * landing.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Fall distance (blocks)
	 *
	 * (*) = optional
	 */
	fun setFallDistance(items: Items<T>) = block(items, "SetFallDistance")


	/**
	 * Sets a player's game
	 * mode to Creative.
	 */
	fun creativeMode(items: Items<T>) = block(items, "CreativeMode")


	/**
	 * Makes a player perform
	 * an attack animation.
	 */
	fun attackAnimation(items: Items<T>) = block(items, "AttackAnimation")


	/**
	 * Displays a floating name tag
	 * at a location to a player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 *  Display location
	 *
	 * [TextItem]
	 *
	 *  Text to display
	 *
	 * (*) = optional
	 */
	fun displayHologram(items: Items<T>) = block(items, "DisplayHologram")


	/**
	 */
	fun deathDrops(items: Items<T>) = block(items, "DeathDrops")


	/**
	 * Opens a custom inventory
	 * for a player.
	 *
	 * ARGUMENTS:
	 *
	 * [MinecraftItem]
	 *
	 * (*) Items to display
	 *
	 * (*) = optional
	 */
	fun showInv(items: Items<T>) = block(items, "ShowInv")


	/**
	 * Sets a player's food hunger level.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Food level
	 *
	 *  (1-20)
	 *
	 * (*) = optional
	 */
	fun setFoodLevel(items: Items<T>) = block(items, "SetFoodLevel")


	/**
	 * Disguises a player as another
	 * player.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Player name to disguise as
	 *
	 * [MinecraftItem]
	 *
	 * (*) Display skin
	 *
	 * (*) = optional
	 */
	fun playerDisguise(items: Items<T>) = block(items, "PlayerDisguise")


	/**
	 * Sets a player's saturation
	 * level.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 *  Saturation level
	 *
	 *  (1-20)
	 *
	 * (*) = optional
	 */
	fun setSaturation(items: Items<T>) = block(items, "SetSaturation")


	/**
	 */
	fun weatherClear(items: Items<T>) = block(items, "WeatherClear")


	/**
	 * Displays text in the center
	 * of a player's screen.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Title text
	 *
	 * [TextItem]
	 *
	 * (*) Subtitle text
	 *
	 * [NumItem]
	 *
	 * (*) Title duration
	 *
	 * [NumItem]
	 *
	 * (*) Fade in length
	 *
	 * [NumItem]
	 *
	 * (*) Fade out length
	 *
	 * (*) = optional
	 */
	fun sendTitle(items: Items<T>) = block(items, "SendTitle")


	/**
	 * Sets the default number format
	 * of the player's scoreboard.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 *  Content or style
	 *
	 * (*) = optional
	 */
	fun scoreDefFormat(items: Items<T>) = block(items, "ScoreDefFormat")


	/**
	 * Stops all or specific sounds
	 * for a player.
	 *
	 * ARGUMENTS:
	 *
	 * [SoundItem]
	 *
	 * (*) Sounds to stop
	 *
	 * (*) = optional
	 */
	fun stopSound(items: Items<T>) = block(items, "StopSound")


	/**
	 * Sets one of the player's health-related
	 * attributes such as max health
	 * and armor defense points.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * (*) Value
	 *
	 * (*) = optional
	 */
	fun healthAttribute(items: Items<T>) = block(items, "HealthAttribute")


	/**
	 * Displays a line of particles
	 * between two locations to
	 * a player.
	 *
	 * ARGUMENTS:
	 *
	 * [GenericItem] (Particle)
	 *
	 *  Effect
	 *
	 * [LocItem]
	 *
	 *  Start location
	 *
	 * [LocItem]
	 *
	 *  End location
	 *
	 * [NumItem]
	 *
	 * (*) Effect spacing
	 *
	 * (*) = optional
	 */
	fun particleLine(items: Items<T>) = block(items, "ParticleLine")

}