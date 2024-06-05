@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*

class PlayerActionCategory<T> internal constructor(private val template: Template<T>) where T : Item, T : io.github.flyingpig525.base.JsonData {
    private val blocks = template.blocks

    private fun block(items: Items<T>, action: String) {
        blocks += Block("player_action", ItemCollection(items).items, action)
    }

    fun chain(a: PlayerActionCategory<T>.() -> Unit) {
        apply(a)
    }

    /**
     * Sets items in a player's
     * hotbar.
     *
     * ARGUMENTS:
     *
     * Any Item(s)
     *
     * Item(s) to set
     *
     * (*) = Optional
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
    @io.github.flyingpig525.annotation.Emperor
    fun closeInv(items: Items<T>) = block(items, "CloseInv")

    /**
     * Gives a player all of the
     * items in the chest.
     *
     * ARGUMENTS:
     *
     * Any Item(s)
     *
     * Item(s) to give
     *
     * (*)[NumItem]
     *
     * Amount to give
     *
     * (*) = Optional
     */
    fun giveItems(items: Items<T>) = block(items, "GiveItems")
    fun noKeepInv(items: Items<T>) = block(items, "NoKeepInv")

    /**
     * Sets if a player is
     * allowed to interact with
     * their hand-crafting menu.
     */
    fun setHandCrafting(items: Items<T>) = block(items, "SetHandCrafting")

    @io.github.flyingpig525.annotation.Mythic
    fun bossBar(items: Items<T>) = block(items, "BossBar")

    /**
     * Displays a sphere of particles
     * at a location to a player.
     *
     * ARGUMENTS:
     *
     * [ParticleItem]
     *
     * Effect
     *
     * [LocItem]
     *
     * Center location
     *
     * (*)[NumItem]
     *
     * Diameter
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun particleSphere(items: Items<T>) = block(items, "ParticleSphere")

    /**
     * Sets a player's movement
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
     * Displays a particle effect
     * to a player.
     *
     * ARGUMENTS:
     *
     * [ParticleItem](s)
     *
     * Effect
     *
     * [LocItem]
     *
     * Effect location
     *
     * (*) = Optional
     */
    fun particle(items: Items<T>) = block(items, "Particle")

    /**
     * Adds a row to the bottom of
     * a player's current inventory
     * menu.
     *
     * ARGUMENTS:
     *
     * (*)Any Item(s)
     *
     * Items to display
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun addInvRow(items: Items<T>) = block(items, "AddInvRow")
    fun noNatRegen(items: Items<T>) = block(items, "NoNatRegen")

    /**
     * Displays a lightning strike
     * effect to a player.
     *
     * ARGUMENTS:
     *
     * [LocItem]
     *
     * Strike location
     *
     * (*) = Optional
     */
    fun displayLightning(items: Items<T>) = block(items, "DisplayLightning")

    /**
     * Damages a player.
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
    fun damage(items: Items<T>) = block(items, "Damage")

    @io.github.flyingpig525.annotation.Noble
    fun sendAnimation(items: Items<T>) = block(items, "SendAnimation")

    /**
     * Sets the XP progress bar
     * to a certain percentage.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Progress % (0-100)
     *
     * (*) = Optional
     */
    fun setXPProg(items: Items<T>) = block(items, "SetXPProg")

    /**
     * Sets items in a player's
     * upper inventory.
     *
     * ARGUMENTS:
     *
     * Any Item(s)
     *
     * Item(s) to set
     *
     * (*) = Optional
     */
    fun setInventory(items: Items<T>) = block(items, "SetInventory")

    /**
     * Teleports a player to multiple
     * locations, with a delay between
     * each teleport.
     *
     * ARGUMENTS:
     *
     * [LocItem](s)
     *
     * Locations to
     * teleport to
     *
     * (*)[NumItem]
     *
     * Teleport delay (ticks,
     * default = 60)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun tpSequence(items: Items<T>) = block(items, "TpSequence")

    /**
     * Restores a player's health.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Amount to heal
     *
     * [NONE]
     *
     * Heals to full health)
     *
     * (*) = Optional
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
     * The new spawn location
     *
     * [NONE]
     *
     * Plot spawn)
     *
     * (*) = Optional
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
     * Launch power
     *
     * (*) = Optional
     */
    fun launchUp(items: Items<T>) = block(items, "LaunchUp")
    fun getTargetEntity(items: Items<T>) = block(items, "GetTargetEntity")

    /**
     * Forces a player to start
     * or stop flying.
     */
    fun forceFlight(items: Items<T>) = block(items, "ForceFlight")

    /**
     * Loads a player's inventory.
     */
    @io.github.flyingpig525.annotation.Noble
    fun loadInv(items: Items<T>) = block(items, "LoadInv")

    /**
     * Sets a player's chat color or
     * decoration.
     *
     * ARGUMENTS:
     *
     * [COMPONENT]
     *
     * New chat style
     *
     * [NONE]
     *
     * Resets chat style)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Overlord
    fun chatStyle(items: Items<T>) = block(items, "ChatStyle")

    /**
     * Kicks a player from
     * the plot.
     */
    @io.github.flyingpig525.annotation.Noble
    fun kick(items: Items<T>) = block(items, "Kick")
    fun projColl(items: Items<T>) = block(items, "ProjColl")

    /**
     * Makes a player spectate
     * another player or entity.
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
     * [NONE]
     *
     * Stops spectating)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun spectateTarget(items: Items<T>) = block(items, "SpectateTarget")

    /**
     * Makes a player perform
     * a hurt animation.
     *
     * ARGUMENTS:
     *
     * (*)[LocItem]
     *
     * Damage source
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
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
     * Block location
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun displayBellRing(items: Items<T>) = block(items, "DisplayBellRing")

    /**
     * Sets the player's game status,
     * which is used to display information
     * about what the player is doing
     * in the game.
     *
     * ARGUMENTS:
     *
     * [COMPONENT]
     *
     * Game Status
     *
     * [NONE]
     *
     * Clear status)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun setStatus(items: Items<T>) = block(items, "SetStatus")

    /**
     * Sets the item on a
     * player's cursor.
     *
     * ARGUMENTS:
     *
     * (*)Any Item
     *
     * Item to set
     *
     * (*) = Optional
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
     * Absorption health
     *
     * (*) = Optional
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
     * Ticks
     *
     * (*) = Optional
     */
    fun setFireTicks(items: Items<T>) = block(items, "SetFireTicks")
    fun setGamemode(items: Items<T>) = block(items, "SetGamemode")

    /**
     * Removes the given number of
     * rows from the bottom of a player's
     * current inventory menu.
     *
     * ARGUMENTS:
     *
     * (*)[NumItem]
     *
     * Rows to remove
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun removeInvRow(items: Items<T>) = block(items, "RemoveInvRow")

    /**
     * Displays the wake up (fade in)
     * animation to a player.
     */
    @io.github.flyingpig525.annotation.Noble
    fun wakeUpAnimation(items: Items<T>) = block(items, "WakeUpAnimation")

    /**
     * Prevents a player from placing
     * and breaking certain blocks.
     *
     * ARGUMENTS:
     *
     * (*)[BLOCK](s)
     *
     * Blocks to disallow
     *
     * (*) = Optional
     */
    fun disableBlocks(items: Items<T>) = block(items, "DisableBlocks")

    /**
     * Sets the objective name of the
     * scoreboard sidebar.
     *
     * ARGUMENTS:
     *
     * [COMPONENT]
     *
     * Objective name
     *
     * (*) = Optional
     */
    fun setScoreObj(items: Items<T>) = block(items, "SetScoreObj")
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
     * Ticks
     * (0-140)
     *
     * (*) = Optional
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
     * Removes all of an item from
     * a player.
     *
     * ARGUMENTS:
     *
     * Any Item(s)
     *
     * Item(s) to clear
     *
     * (*) = Optional
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
     * Block location
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun displayBlockOpen(items: Items<T>) = block(items, "DisplayBlockOpen")
    fun setHandItem(items: Items<T>) = block(items, "SetHandItem")

    /**
     * Displays a custom advancement
     * popup to a player.
     *
     * ARGUMENTS:
     *
     * [COMPONENT]
     *
     * Advancement name
     *
     * Any Item
     *
     * Advancement icon
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun sendAdvancement(items: Items<T>) = block(items, "SendAdvancement")
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
     * Slot
     *
     * (*)Any Item
     *
     * Item to set
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun setMenuItem(items: Items<T>) = block(items, "SetMenuItem")

    /**
     * Launches a player toward or away
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
     * Sets a player's armor items.
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
     * Displays a vertical beam on
     * an end gateway to a player.
     *
     * ARGUMENTS:
     *
     * [LocItem]
     *
     * Gateway location
     *
     * (*) = Optional
     */
    fun displayGateway(items: Items<T>) = block(items, "DisplayGateway")

    /**
     * Adds saturation to a player.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Saturation to give
     *
     * (*) = Optional
     */
    fun giveSaturation(items: Items<T>) = block(items, "GiveSaturation")

    /**
     * Adds experience points or
     * levels to a player.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Experience to give
     *
     * (*) = Optional
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
     * Location to face
     *
     * (*) = Optional
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
     * [COMPONENT](s)
     *
     * Message to send
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun actionBar(items: Items<T>) = block(items, "ActionBar")

    /**
     * Sets a player's chat tag.
     *
     * ARGUMENTS:
     *
     * [COMPONENT](s)
     *
     * Chat tag
     *
     * [NONE]
     *
     * Resets chat tag)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun setChatTag(items: Items<T>) = block(items, "SetChatTag")

    /**
     * Changes a player's world border
     * size if they have one active.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * New radius
     *
     * (*)[NumItem]
     *
     * Blocks per second
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun shiftWorldBorder(items: Items<T>) = block(items, "ShiftWorldBorder")

    /**
     * Displays text on a sign
     * to a player.
     *
     * ARGUMENTS:
     *
     * [LocItem]
     *
     * Sign location
     *
     * (*)[COMPONENT](s)
     *
     * Text line(s)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun displaySignText(items: Items<T>) = block(items, "DisplaySignText")

    /**
     * Sets a player's walking
     * and/or flight speed.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Movement speed
     * percentage (0% to 1000%)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun setSpeed(items: Items<T>) = block(items, "SetSpeed")

    /**
     * Adds 3 more rows to a player's
     * current inventory menu using the
     * contents of the chest.
     *
     * ARGUMENTS:
     *
     * (*)Any Item(s)
     *
     * Items to display
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun expandInv(items: Items<T>) = block(items, "ExpandInv")

    /**
     * Launches a projectile from
     * a player.
     *
     * ARGUMENTS:
     *
     * [PROJECTILE]
     *
     * Projectile to
     * launch
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
    fun launchProj(items: Items<T>) = block(items, "LaunchProj")
    fun noProjColl(items: Items<T>) = block(items, "NoProjColl")

    @io.github.flyingpig525.annotation.Overlord
    fun showDisguise(items: Items<T>) = block(items, "ShowDisguise")

    /**
     * Displays an animated particle
     * cuboid to a player.
     *
     * ARGUMENTS:
     *
     * [ParticleItem]
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
     * (*)[NumItem]
     *
     * Effect spacing
     *
     * (*)[NumItem]
     *
     * Animation duration
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun particleCuboidA(items: Items<T>) = block(items, "ParticleCuboidA")

    /**
     * Plays a sound for a player.
     *
     * ARGUMENTS:
     *
     * [SoundItem](s)
     *
     * Sound to play
     *
     * (*)[LocItem]
     *
     * Playback location
     *
     * (*) = Optional
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
     * New Target
     *
     * (*) = Optional
     */
    fun setCompass(items: Items<T>) = block(items, "SetCompass")

    /**
     * Teleports a player to a random
     * location in the chest.
     *
     * ARGUMENTS:
     *
     * [LocItem](s)
     *
     * Locations to
     * choose from
     *
     * (*) = Optional
     */
    fun rngTeleport(items: Items<T>) = block(items, "RngTeleport")

    /**
     * Disguises a player as a mob.
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
    fun mobDisguise(items: Items<T>) = block(items, "MobDisguise")

    /**
     * Allows a player to place
     * and break certain blocks.
     *
     * ARGUMENTS:
     *
     * (*)[BLOCK](s)
     *
     * Blocks to allow
     *
     * (*) = Optional
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
     * Container location
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun openBlockInv(items: Items<T>) = block(items, "OpenBlockInv")

    /**
     * Displays an animated circle
     * of particles to a player.
     *
     * ARGUMENTS:
     *
     * [ParticleItem]
     *
     * Effect
     *
     * [LocItem]
     *
     * Center location
     *
     * (*)[NumItem]
     *
     * Diameter
     *
     * (*)[NumItem]
     *
     * Animation duration
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun particleCircleA(items: Items<T>) = block(items, "ParticleCircleA")
    fun removeBossBar(items: Items<T>) = block(items, "RemoveBossBar")

    /**
     * Sets the item in one of the
     * equipment slots (armor and
     * held items) of a player.
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
     * [TextItem]
     *
     * Plot ID
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun sendToPlot(items: Items<T>) = block(items, "SendToPlot")

    /**
     * Removes one or more potion
     * effects from a player.
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
    fun removePotion(items: Items<T>) = block(items, "RemovePotion")

    /**
     * Displays a block fracture
     * effect at a location to a
     * player.
     *
     * ARGUMENTS:
     *
     * [LocItem](s)
     *
     * Block(s) to
     * fracture
     *
     * (*)[NumItem]
     *
     * Fracture level
     *
     * (*) = Optional
     */
    fun displayFracture(items: Items<T>) = block(items, "DisplayFracture")

    /**
     * Sets if an entity is hidden
     * to a target.
     *
     * ARGUMENTS:
     *
     * [TextItem]
     *
     * Entity UUID
     *
     * [COMPONENT]
     *
     * Entity name
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun setEntityHidden(items: Items<T>) = block(items, "SetEntityHidden")

    /**
     * Sets whether the scoreboard
     * sidebar is visible to a player.
     */
    fun setSidebar(items: Items<T>) = block(items, "SetSidebar")
    fun allowDrops(items: Items<T>) = block(items, "AllowDrops")

    /**
     * Displays a Sculk Sensor
     * vibration to a player.
     *
     * ARGUMENTS:
     *
     * [LocItem]
     *
     * Origin location
     *
     * [LocItem]
     *
     * Target location
     *
     * (*)[NumItem]
     *
     * Arrival time
     *
     * (*) = Optional
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
     * New slot
     *
     * (*) = Optional
     */
    fun setSlot(items: Items<T>) = block(items, "SetSlot")

    /**
     * Displays a ray of particles
     * to a player.
     *
     * ARGUMENTS:
     *
     * [ParticleItem]
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
     * (*)[NumItem]
     *
     * Effect spacing
     *
     * (*) = Optional
     */
    fun particleRay(items: Items<T>) = block(items, "ParticleRay")

    /**
     * Displays a particle cuboid as a
     * solid, hollow or wireframe
     * shape to a player.
     *
     * ARGUMENTS:
     *
     * [ParticleItem]
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
     * (*)[NumItem]
     *
     * Effect spacing
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun particleCuboid(items: Items<T>) = block(items, "ParticleCuboid")

    /**
     * Sends a series of messages
     * in chat to a player, with a
     * delay after each message.
     *
     * ARGUMENTS:
     *
     * [COMPONENT](s)
     *
     * Messages to send
     *
     * (*)[NumItem]
     *
     * Message delay ticks
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun sendMessageSeq(items: Items<T>) = block(items, "SendMessageSeq")

    /**
     * Sets the prefix or suffix
     * for the player's name.
     *
     * ARGUMENTS:
     *
     * (*)[COMPONENT]
     *
     * Prefix/suffix text
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
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
     * Block location,
     * or start of region
     *
     * (*)[LocItem]
     *
     * End of region
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun clearDispBlock(items: Items<T>) = block(items, "ClearDispBlock")

    /**
     * Sets the heaviness of rain and
     * storm visible to a player.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Rain level (%)
     *
     * [NumItem]
     *
     * Storm level (%)
     *
     * (*) = Optional
     */
    fun setRainLevel(items: Items<T>) = block(items, "SetRainLevel")

    /**
     * Removes a player's disguise.
     */
    @io.github.flyingpig525.annotation.Overlord
    fun undisguise(items: Items<T>) = block(items, "Undisguise")

    /**
     * Displays an animated spiral of
     * particles to a player.
     *
     * ARGUMENTS:
     *
     * [ParticleItem]
     *
     * Effect
     *
     * [LocItem]
     *
     * Base location
     *
     * (*)[NumItem]
     *
     * Length
     *
     * (*)[NumItem]
     *
     * Diameter
     *
     * (*)[NumItem]
     *
     * Particle count
     *
     * (*)[NumItem]
     *
     * Rotations
     *
     * (*)[NumItem]
     *
     * Animation duration
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun particleSpiralA(items: Items<T>) = block(items, "ParticleSpiralA")

    /**
     * Sets if a player is instantly
     * respawned upon dying.
     */
    @io.github.flyingpig525.annotation.Noble
    fun instantRespawn(items: Items<T>) = block(items, "InstantRespawn")

    /**
     * Sets a score on the
     * scoreboard.
     *
     * ARGUMENTS:
     *
     * [COMPONENT]
     *
     * Score name
     *
     * (*)[NumItem]
     *
     * Score value
     *
     * (*) = Optional
     */
    fun setScore(items: Items<T>) = block(items, "SetScore")

    /**
     * Sets the color a player's
     * name tag appears in.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setNameColor(items: Items<T>) = block(items, "SetNameColor")

    /**
     * Sets a player's attack speed.
     *
     * ARGUMENTS:
     *
     * (*)[NumItem]
     *
     * Attack speed
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun setAtkSpeed(items: Items<T>) = block(items, "SetAtkSpeed")
    fun disablePvp(items: Items<T>) = block(items, "DisablePvp")

    /**
     * Changes the tick rate of a player.
     *
     * ARGUMENTS:
     *
     * (*)[NumItem]
     *
     * Ticks per second (0-20)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun setTickRate(items: Items<T>) = block(items, "SetTickRate")

    /**
     * Plays a sound that follows a
     * moving entity or player.
     *
     * ARGUMENTS:
     *
     * [SoundItem](s)
     *
     * Sound to play
     *
     * [TextItem](s)
     *
     * Target UUID
     *
     * [COMPONENT](s)
     *
     * Target name
     *
     * (*) = Optional
     */
    fun playEntitySound(items: Items<T>) = block(items, "PlayEntitySound")
    fun replaceProj(items: Items<T>) = block(items, "ReplaceProj")

    /**
     * Sets a player's experience
     * level, points or progress.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Experience to set
     *
     * (*) = Optional
     */
    fun setExp(items: Items<T>) = block(items, "SetExp")

    /**
     * Displays a spiral of particles
     * at a location to a player.
     *
     * ARGUMENTS:
     *
     * [ParticleItem]
     *
     * Effect
     *
     * [LocItem]
     *
     * Base location
     *
     * (*)[NumItem]
     *
     * Length
     *
     * (*)[NumItem]
     *
     * Diameter
     *
     * (*)[NumItem]
     *
     * Effect count
     *
     * (*)[NumItem]
     *
     * Rotations
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun particleSpiral(items: Items<T>) = block(items, "ParticleSpiral")

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
     * Maximum health
     *
     * (*) = Optional
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
     * Fog distance in chunks
     * (2-7)
     *
     * [NONE]
     *
     * Removes fog)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
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
    @io.github.flyingpig525.annotation.Mythic
    fun spectatorMode(items: Items<T>) = block(items, "SpectatorMode")

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
     * (*)[COMPONENT](s)
     *
     * Header/footer text
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun setTabListInfo(items: Items<T>) = block(items, "SetTabListInfo")
    fun enablePvp(items: Items<T>) = block(items, "EnablePvp")

    @io.github.flyingpig525.annotation.Overlord
    fun hideDisguise(items: Items<T>) = block(items, "HideDisguise")

    /**
     * Sets the number format of a
     * single line in the player's
     * scoreboard.
     *
     * ARGUMENTS:
     *
     * [COMPONENT]
     *
     * Score name
     *
     * [COMPONENT]
     *
     * Content or style
     *
     * [NONE]
     *
     *
     * (*) = Optional
     */
    fun scoreLineFormat(items: Items<T>) = block(items, "ScoreLineFormat")

    /**
     * Sets the player's skin.
     *
     * ARGUMENTS:
     *
     * Any Item
     *
     * Player head
     *
     * [NONE]
     *
     * Clear Skin)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Overlord
    fun setSkin(items: Items<T>) = block(items, "SetSkin")

    /**
     * Toggles whether a player
     * collides with blocks in
     * spectator mode.
     */
    @io.github.flyingpig525.annotation.Mythic
    fun spectatorCollision(items: Items<T>) = block(items, "SpectatorCollision")

    /**
     * Sets whether a player's
     * name tag is visible.
     */
    @io.github.flyingpig525.annotation.Noble
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
     * Ticks
     *
     * (*) = Optional
     */
    fun setInvulTicks(items: Items<T>) = block(items, "SetInvulTicks")
    fun enableFlight(items: Items<T>) = block(items, "EnableFlight")

    /**
     * Sets the amount of bee stings
     * sticking out of a player's
     * character model.
     *
     * ARGUMENTS:
     *
     * (*)[NumItem]
     *
     * Sting Count
     *
     * (*) = Optional
     */
    fun setStingsStuck(items: Items<T>) = block(items, "SetStingsStuck")

    /**
     * Removes a score from
     * the scoreboard.
     *
     * ARGUMENTS:
     *
     * [COMPONENT]
     *
     * Score name
     *
     * (*) = Optional
     */
    fun removeScore(items: Items<T>) = block(items, "RemoveScore")
    fun disallowDrops(items: Items<T>) = block(items, "DisallowDrops")

    /**
     * Displays a circle of particles
     * to a player.
     *
     * ARGUMENTS:
     *
     * [ParticleItem]
     *
     * Effect
     *
     * [LocItem]
     *
     * Center location
     *
     * (*)[NumItem]
     *
     * Diameter
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun particleCircle(items: Items<T>) = block(items, "ParticleCircle")

    /**
     * Displays a block at a location to
     * a player.
     *
     * ARGUMENTS:
     *
     * [BLOCK]
     *
     * Block to display
     *
     * [LocItem]
     *
     * Block location,
     * or start of region
     *
     * (*)[LocItem]
     *
     * End of region
     *
     * (*)[BLOCK_TAG](s)
     *
     * Block data
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun displayBlock(items: Items<T>) = block(items, "DisplayBlock")

    /**
     * Mounts a player on top of
     * another player or entity.
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
     * Dismounts player)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
    fun rideEntity(items: Items<T>) = block(items, "RideEntity")
    fun weatherRain(items: Items<T>) = block(items, "WeatherRain")

    /**
     * Removes a player's world border.
     */
    @io.github.flyingpig525.annotation.Emperor
    fun rmWorldBorder(items: Items<T>) = block(items, "RmWorldBorder")

    /**
     * Send a resource pack to the player.
     *
     * ARGUMENTS:
     *
     * [TextItem]
     *
     * Resource Pack URL
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Overlord
    fun resourcePack(items: Items<T>) = block(items, "ResourcePack")

    /**
     * Teleports a player to
     * a location.
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
     * Sets whether a player can
     * hurt or be hurt by other
     * players.
     */
    fun setAllowPVP(items: Items<T>) = block(items, "SetAllowPVP")
    fun disableFlight(items: Items<T>) = block(items, "DisableFlight")

    /**
     * Sets whether a player
     * should appear on fire.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setVisualFire(items: Items<T>) = block(items, "SetVisualFire")

    /**
     * Sets a player's ability to
     * see their own disguise. It
     * is recommended that it is
     * almost always hidden.
     */
    @io.github.flyingpig525.annotation.Overlord
    fun setDisguiseVisible(items: Items<T>) = block(items, "SetDisguiseVisible")

    /**
     * Sets the amount of arrows
     * sticking out of a player's
     * character model.
     *
     * ARGUMENTS:
     *
     * (*)[NumItem]
     *
     * Arrow Count
     *
     * (*) = Optional
     */
    fun setArrowsStuck(items: Items<T>) = block(items, "SetArrowsStuck")
    fun setItems(items: Items<T>) = block(items, "SetItems")
    fun keepInv(items: Items<T>) = block(items, "KeepInv")

    /**
     * Replaces items in a player's
     * inventory with the given item.
     *
     * ARGUMENTS:
     *
     * (*)Any Item(s)
     *
     * Item(s) to replace
     *
     * Any Item
     *
     * Item to replace with
     *
     * (*)[NumItem]
     *
     * Amount of items to
     * replace
     *
     * (*) = Optional
     */
    fun replaceItems(items: Items<T>) = block(items, "ReplaceItems")

    /**
     * Sends a chat message to a
     * player.
     *
     * ARGUMENTS:
     *
     * (*)[COMPONENT](s)
     *
     * Message to send
     *
     * (*) = Optional
     */
    fun sendMessage(items: Items<T>) = block(items, "SendMessage")

    /**
     * Sets the item in a slot
     * of a player's inventory.
     *
     * ARGUMENTS:
     *
     * (*)Any Item
     *
     * Item to set
     *
     * [NumItem]
     *
     * Slot to set
     *
     * (*) = Optional
     */
    fun setSlotItem(items: Items<T>) = block(items, "SetSlotItem")

    /**
     * Plays a sequence of sounds
     * to a player, with a delay
     * between each sound.
     *
     * ARGUMENTS:
     *
     * [SoundItem](s)
     *
     * Sounds to play
     *
     * (*)[NumItem]
     *
     * Sound delay (ticks,
     * default = 60)
     *
     * (*)[LocItem]
     *
     * Playback location
     *
     * (*) = Optional
     */
    fun playSoundSeq(items: Items<T>) = block(items, "PlaySoundSeq")

    /**
     * Displays an animated line of
     * particles between two locations
     * to a player.
     *
     * ARGUMENTS:
     *
     * [ParticleItem]
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
     * (*)[NumItem]
     *
     * Effect spacing
     *
     * (*)[NumItem]
     *
     * Animation duration
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun particleLineA(items: Items<T>) = block(items, "ParticleLineA")

    @io.github.flyingpig525.annotation.Mythic
    fun respawn(items: Items<T>) = block(items, "Respawn")

    @io.github.flyingpig525.annotation.Emperor
    fun setInvName(items: Items<T>) = block(items, "SetInvName")

    /**
     * Applies a cooldown visual effect
     * to an item type.
     *
     * ARGUMENTS:
     *
     * Any Item
     *
     * Item type to affect
     *
     * [NumItem]
     *
     * Cooldown in ticks
     *
     * (*) = Optional
     */
    fun setItemCooldown(items: Items<T>) = block(items, "SetItemCooldown")

    /**
     * Sets the type of weather
     * visible to a player.
     */
    fun setPlayerWeather(items: Items<T>) = block(items, "SetPlayerWeather")
    fun sendHover(items: Items<T>) = block(items, "SendHover")

    /**
     * Displays a parrot on the targets'
     * shoulders.
     */
    @io.github.flyingpig525.annotation.Noble
    fun setShoulder(items: Items<T>) = block(items, "SetShoulder")

    /**
     * Sets a player's remaining
     * breath ticks.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Breath ticks
     *
     * (*) = Optional
     */
    fun setAirTicks(items: Items<T>) = block(items, "SetAirTicks")

    /**
     * Displays a pickup animation
     * of one entity being collected
     * by another entity.
     *
     * ARGUMENTS:
     *
     * [TextItem]
     *
     * Entity UUID
     *
     * [COMPONENT]
     *
     * Entity name
     *
     * [TextItem]
     *
     * Collector UUID
     *
     * [COMPONENT]
     *
     * Collector name
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Mythic
    fun displayPickup(items: Items<T>) = block(items, "DisplayPickup")

    /**
     * Creates a world border only
     * visible to a player.
     *
     * ARGUMENTS:
     *
     * [LocItem]
     *
     * Center position
     *
     * [NumItem]
     *
     * Radius in blocks
     *
     * (*)[NumItem]
     *
     * Warning distance
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun setWorldBorder(items: Items<T>) = block(items, "SetWorldBorder")

    /**
     * Sets the time of day visible
     * to a player.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Daylight ticks
     *
     * [NONE]
     *
     * Resets player time)
     *
     * (*) = Optional
     */
    fun setPlayerTime(items: Items<T>) = block(items, "SetPlayerTime")

    /**
     * Adds food to a player.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Food to give
     *
     * (*) = Optional
     */
    fun giveFood(items: Items<T>) = block(items, "GiveFood")
    fun natRegen(items: Items<T>) = block(items, "NatRegen")

    /**
     * Gives one or more potion
     * effects to a player.
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
    fun givePotion(items: Items<T>) = block(items, "GivePotion")

    /**
     * Removes items from a player.
     *
     * ARGUMENTS:
     *
     * Any Item(s)
     *
     * Item(s) to remove
     *
     * (*) = Optional
     */
    fun removeItems(items: Items<T>) = block(items, "RemoveItems")

    /**
     * Boosts a player's elytra
     * using a firework rocket.
     *
     * ARGUMENTS:
     *
     * Any Item
     *
     * Firework
     *
     * (*) = Optional
     */
    fun boostElytra(items: Items<T>) = block(items, "BoostElytra")

    /**
     * Saves a player's inventory.
     * It can be loaded later with
     * 'Load Saved Inventory'.
     */
    @io.github.flyingpig525.annotation.Noble
    fun saveInv(items: Items<T>) = block(items, "SaveInv")

    /**
     * Opens a written book
     * menu for a player.
     *
     * ARGUMENTS:
     *
     * Any Item
     *
     * Book item
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun openBook(items: Items<T>) = block(items, "OpenBook")

    /**
     * Sets a player's current
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
     * Disguises a player as a block.
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
    fun blockDisguise(items: Items<T>) = block(items, "BlockDisguise")

    /**
     * Undoes the interactions with
     * blocks by a player.
     *
     * ARGUMENTS:
     *
     * (*)[NumItem]
     *
     * Rollback time
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Overlord
    fun rollbackBlocks(items: Items<T>) = block(items, "RollbackBlocks")
    fun noDeathDrops(items: Items<T>) = block(items, "NoDeathDrops")

    /**
     * Sets a player's walk
     * speed.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * % of normal
     * walk speed (0 to 500)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Noble
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
     * Launch power
     *
     * (*) = Optional
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
     * Fall distance (blocks)
     *
     * (*) = Optional
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
    @io.github.flyingpig525.annotation.Noble
    fun attackAnimation(items: Items<T>) = block(items, "AttackAnimation")

    /**
     * Displays a floating name tag
     * at a location to a player.
     *
     * ARGUMENTS:
     *
     * [LocItem]
     *
     * Display location
     *
     * [COMPONENT]
     *
     * Text to display
     *
     * [NONE]
     *
     * Removes hologram)
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun displayHologram(items: Items<T>) = block(items, "DisplayHologram")
    fun deathDrops(items: Items<T>) = block(items, "DeathDrops")

    /**
     * Opens a custom inventory
     * for a player.
     *
     * ARGUMENTS:
     *
     * (*)Any Item(s)
     *
     * Items to display
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun showInv(items: Items<T>) = block(items, "ShowInv")

    /**
     * Sets a player's food hunger level.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Food level
     * (1-20)
     *
     * (*) = Optional
     */
    fun setFoodLevel(items: Items<T>) = block(items, "SetFoodLevel")

    /**
     * Disguises a player as another
     * player.
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
    fun playerDisguise(items: Items<T>) = block(items, "PlayerDisguise")

    /**
     * Sets a player's saturation
     * level.
     *
     * ARGUMENTS:
     *
     * [NumItem]
     *
     * Saturation level
     * (1-20)
     *
     * (*) = Optional
     */
    fun setSaturation(items: Items<T>) = block(items, "SetSaturation")
    fun weatherClear(items: Items<T>) = block(items, "WeatherClear")

    /**
     * Displays text in the center
     * of a player's screen.
     *
     * ARGUMENTS:
     *
     * [COMPONENT]
     *
     * Title text
     *
     * (*)[COMPONENT]
     *
     * Subtitle text
     *
     * (*)[NumItem]
     *
     * Title duration
     *
     * (*)[NumItem]
     *
     * Fade in length
     *
     * (*)[NumItem]
     *
     * Fade out length
     *
     * (*) = Optional
     */
    @io.github.flyingpig525.annotation.Emperor
    fun sendTitle(items: Items<T>) = block(items, "SendTitle")

    /**
     * Sets the default number format
     * of the player's scoreboard.
     *
     * ARGUMENTS:
     *
     * [COMPONENT]
     *
     * Content or style
     *
     * [NONE]
     *
     *
     * (*) = Optional
     */
    fun scoreDefFormat(items: Items<T>) = block(items, "ScoreDefFormat")

    /**
     * Stops all or specific sounds
     * for a player.
     *
     * ARGUMENTS:
     *
     * (*)[SoundItem](s)
     *
     * Sounds to stop
     *
     * (*) = Optional
     */
    fun stopSound(items: Items<T>) = block(items, "StopSound")

    /**
     * Displays a line of particles
     * between two locations to
     * a player.
     *
     * ARGUMENTS:
     *
     * [ParticleItem]
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
     * (*)[NumItem]
     *
     * Effect spacing
     *
     * (*) = Optional
     */
    fun particleLine(items: Items<T>) = block(items, "ParticleLine")


}