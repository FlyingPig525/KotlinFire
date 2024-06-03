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

class GameActionCategory <T> internal constructor(private val template: Template<T>) where T : Item, T : JsonData {
	private val blocks = template.blocks

	private fun block(items: Items<T>, action: String) {
		blocks += Block("game_action", ItemCollection(items).items, action)
	}

	fun chain(a: GameActionCategory<T>.() -> Unit) {
		apply(a)
	}

	fun startLoop(items: Items<T>) = block(items, "StartLoop")
	/**
	 * Sets the amount of ticks it
	 * takes for a furnace block
	 * to cook an item.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Furnace location
	 *
	 * [NumItem]
	 *
	 * Ticks
	 *
	 * (*) = Optional
	 */
	fun setFurnaceSpeed(items: Items<T>) = block(items, "SetFurnaceSpeed")
	/**
	 * Enables blocks dropping
	 * as items when broken.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun blockDropsOn(items: Items<T>) = block(items, "BlockDropsOn")
	/**
	 * Fills the container at a location
	 * with items.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * Any Item(s)
	 *
	 * Item(s) to fill with
	 *
	 * (*) = Optional
	 */
	fun fillContainer(items: Items<T>) = block(items, "FillContainer")
	/**
	 * Breaks the block at a location
	 * as if it was broken by a player.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem](s)
	 *
	 * Block(s) to break
	 *
	 * (*) = Optional
	 */
	fun breakBlock(items: Items<T>) = block(items, "BreakBlock")
	@Noble
	fun particleSphere(items: Items<T>) = block(items, "ParticleSphere")
	/**
	 * Applies bone meal to a block.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem](s)
	 *
	 * Block(s) to bone meal
	 *
	 * (*)[NumItem]
	 *
	 * Number of uses
	 *
	 * (*) = Optional
	 */
	@Noble
	fun boneMeal(items: Items<T>) = block(items, "BoneMeal")
	/**
	 * Spawns a falling block at a
	 * location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Block material
	 *
	 * (*)[](s)
	 *
	 * Block data
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Converts the block at
	 * the location to a falling block
	 *
	 * []
	 *
	 *
	 * (*) = Optional
	 */
	fun fallingBlock(items: Items<T>) = block(items, "FallingBlock")
	/**
	 * Sends a message to a Discord
	 * webhook.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * Webhook URL
	 *
	 * [TextItem]
	 *
	 * Message content
	 *
	 * (*) = Optional
	 */
	@Overlord
	fun discordWebhook(items: Items<T>) = block(items, "DiscordWebhook")
	/**
	 * Changes a line of text
	 * on a sign.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Sign location
	 *
	 * [NumItem]
	 *
	 * Line number
	 *
	 * (*)[]
	 *
	 * New text
	 *
	 * (*) = Optional
	 */
	fun changeSign(items: Items<T>) = block(items, "ChangeSign")
	/**
	 * Causes a block to get "random
	 * ticked", which could cause a
	 * block update.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem](s)
	 *
	 * Block(s) to tick
	 *
	 * (*)[NumItem]
	 *
	 * Number of ticks
	 *
	 * (*) = Optional
	 */
	fun tickBlock(items: Items<T>) = block(items, "TickBlock")
	/**
	 * Sends a web request to a URL.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem]
	 *
	 * URL to request
	 *
	 * (*)[TextItem]
	 *
	 * Content body
	 *
	 * (*) = Optional
	 */
	@Overlord
	fun webRequest(items: Items<T>) = block(items, "WebRequest")
	fun clearScBoard(items: Items<T>) = block(items, "ClearScBoard")
	fun hideSidebar(items: Items<T>) = block(items, "HideSidebar")
	/**
	 * Replaces items in the container
	 * at a location with the given item.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Container location
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
	 * Replaces the projectile fired in
	 * the Shoot Bow Event.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[]
	 *
	 * Projectile to launch
	 *
	 * (*) = Optional
	 */
	fun setEventProj(items: Items<T>) = block(items, "SetEventProj")
	@Mythic
	fun spawnItemDisplay(items: Items<T>) = block(items, "SpawnItemDisplay")
	/**
	 * Creates an explosion at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Explosion
	 * location
	 *
	 * (*)[NumItem]
	 *
	 * Explosion power (0-4)
	 *
	 * (*) = Optional
	 */
	fun explosion(items: Items<T>) = block(items, "Explosion")
	/**
	 * Spawns a mob at a location.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Mob type
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*)[NumItem]
	 *
	 * Health
	 *
	 * (*)[]
	 *
	 * Custom name
	 *
	 * (*)[](s)
	 *
	 * Effect(s)
	 *
	 * (*)Any Item(s)
	 *
	 * Equipment
	 *
	 * (*) = Optional
	 */
	fun spawnMob(items: Items<T>) = block(items, "SpawnMob")
	/**
	 * Sets the item buried in a
	 * suspicious sand or gravel.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*)Any Item
	 *
	 * Item
	 *
	 * (*) = Optional
	 */
	fun setBrushableItem(items: Items<T>) = block(items, "SetBrushableItem")
	@Mythic
	fun particleLineA(items: Items<T>) = block(items, "ParticleLineA")
	/**
	 * Spawns an eye of ender at a
	 * location, which (if specified) will
	 * float towards its destination.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Location to spawn at
	 *
	 * (*)[LocItem]
	 *
	 * Destination
	 *
	 * (*)[NumItem]
	 *
	 * Lifespan (ticks)
	 *
	 * (*)[]
	 *
	 * Custom name
	 *
	 * (*) = Optional
	 */
	fun spawnEnderEye(items: Items<T>) = block(items, "SpawnEnderEye")
	fun showSidebar(items: Items<T>) = block(items, "ShowSidebar")
	/**
	 * Spawns a lingering potion cloud
	 * at a location that imbues effects
	 * onto entities who enter it.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*)[](s)
	 *
	 * Effect to apply
	 *
	 * (*)[]
	 *
	 * Custom name
	 *
	 * (*)[NumItem]
	 *
	 * Radius (blocks)
	 *
	 * (*)[NumItem]
	 *
	 * Duration (ticks)
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun spawnPotionCloud(items: Items<T>) = block(items, "SpawnPotionCloud")
	@Noble
	fun particleSpiral(items: Items<T>) = block(items, "ParticleSpiral")
	/**
	 * Sets a data tag value of
	 * the block at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem](s)
	 *
	 * Location
	 *
	 * [](s)
	 *
	 * Block data
	 *
	 * (*) = Optional
	 */
	fun setBlockData(items: Items<T>) = block(items, "SetBlockData")
	/**
	 * Launches a projectile.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Projectile to launch
	 *
	 * [LocItem]
	 *
	 * Launch point
	 *
	 * (*)[]
	 *
	 * Custom name
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
	 * Launches a firework
	 * rocket at a location.
	 *
	 * ARGUMENTS:
	 *
	 * Any Item
	 *
	 * Firework rocket
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*) = Optional
	 */
	fun firework(items: Items<T>) = block(items, "Firework")
	/**
	 * Spawns an item display entity.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * Any Item
	 *
	 * Displayed item
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun spawnItemDisp(items: Items<T>) = block(items, "SpawnItemDisp")
	/**
	 * Sets the damage dealt in
	 * this event.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * New damage amount
	 *
	 * (*) = Optional
	 */
	fun setEventDamage(items: Items<T>) = block(items, "SetEventDamage")
	/**
	 * Sets the growth stage of the block
	 * (e.g. carrots) at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*)[NumItem]
	 *
	 * Growth stage
	 *
	 * (*) = Optional
	 */
	fun setBlockGrowth(items: Items<T>) = block(items, "SetBlockGrowth")
	fun wait(items: Items<T>) = block(items, "Wait")
	/**
	 * Sets the name of the container
	 * at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * []
	 *
	 * Name
	 *
	 * (*) = Optional
	 */
	fun setContainerName(items: Items<T>) = block(items, "SetContainerName")
	/**
	 * Spawns an item at a location.
	 *
	 * ARGUMENTS:
	 *
	 * Any Item(s)
	 *
	 * Item(s) to spawn
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*)[]
	 *
	 * Custom name
	 *
	 * (*) = Optional
	 */
	fun spawnItem(items: Items<T>) = block(items, "SpawnItem")
	/**
	 * Changes the text color
	 * of a sign.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Sign location
	 *
	 * (*) = Optional
	 */
	fun signColor(items: Items<T>) = block(items, "SignColor")
	/**
	 * Sets the block at a location
	 * to a player head.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Head location
	 *
	 * []
	 *
	 *
	 * Any Item
	 *
	 * Head
	 *
	 * []
	 *
	 *
	 * [TextItem]
	 *
	 * Head owner
	 *
	 * (*) = Optional
	 */
	fun setHead(items: Items<T>) = block(items, "SetHead")
	@Mythic
	fun removeHologram(items: Items<T>) = block(items, "RemoveHologram")
	/**
	 * Removes items from the container
	 * at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * Any Item(s)
	 *
	 * Item(s) to remove
	 *
	 * (*) = Optional
	 */
	fun removeItems(items: Items<T>) = block(items, "RemoveItems")
	/**
	 * Spawns a shulker bullet at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Spawn Location
	 *
	 * (*) = Optional
	 */
	fun shulkerBullet(items: Items<T>) = block(items, "ShulkerBullet")
	fun spawnRngItem(items: Items<T>) = block(items, "SpawnRngItem")
	fun fireworkEffect(items: Items<T>) = block(items, "FireworkEffect")
	/**
	 * Fills a region with a type of block.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Block to set
	 *
	 * [LocItem]
	 *
	 * Corner 1
	 *
	 * [LocItem]
	 *
	 * Corner 2
	 *
	 * (*)[]
	 *
	 * Block data
	 * (comma separated)
	 *
	 * (*) = Optional
	 */
	fun setRegion(items: Items<T>) = block(items, "SetRegion")
	/**
	 * Sets the contents of the container
	 * at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * Any Item(s)
	 *
	 * Item(s) to set
	 *
	 * (*) = Optional
	 */
	fun setContainer(items: Items<T>) = block(items, "SetContainer")
	/**
	 * Spawns an invisible hitbox
	 * with the specified size.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*)[NumItem]
	 *
	 * Hitbox width
	 *
	 * (*)[NumItem]
	 *
	 * Hitbox height
	 *
	 * (*) = Optional
	 */
	fun spawnInteraction(items: Items<T>) = block(items, "SpawnInteraction")
	/**
	 * Sets the item in a slot of the
	 * container at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * (*)Any Item
	 *
	 * Item to set
	 *
	 * [NumItem]
	 *
	 * Slot
	 *
	 * (*) = Optional
	 */
	fun setItemInSlot(items: Items<T>) = block(items, "SetItemInSlot")
	@Mythic
	fun particleCircleA(items: Items<T>) = block(items, "ParticleCircleA")
	/**
	 * Copies a region of blocks to another
	 * region, including air.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Corner 1
	 *
	 * [LocItem]
	 *
	 * Corner 2
	 *
	 * [LocItem]
	 *
	 * Position to copy from
	 *
	 * [LocItem]
	 *
	 * Position to paste to
	 *
	 * (*) = Optional
	 */
	@Overlord
	fun cloneRegion(items: Items<T>) = block(items, "CloneRegion")
	/**
	 * Uncancels the initial event that
	 * triggered this line of code.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun uncancelEvent(items: Items<T>) = block(items, "UncancelEvent")
	/**
	 * Sets the book and the
	 * displayed page of a Lectern.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Lectern location
	 *
	 * (*)Any Item
	 *
	 * Book to put
	 *
	 * (*)[NumItem]
	 *
	 * Displayed page
	 *
	 * (*) = Optional
	 */
	fun setLecternBook(items: Items<T>) = block(items, "SetLecternBook")
	/**
	 * Spawns primed TNT at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*)[NumItem]
	 *
	 * TNT power (0-4)
	 *
	 * (*)[NumItem]
	 *
	 * Fuse duration
	 *
	 * (*)[]
	 *
	 * Custom name
	 *
	 * (*) = Optional
	 */
	fun spawnTNT(items: Items<T>) = block(items, "SpawnTNT")
	/**
	 * Spawns an armor stand at a
	 * location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*)[]
	 *
	 * Custom name
	 *
	 * (*)Any Item(s)
	 *
	 * Equipment
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun spawnArmorStand(items: Items<T>) = block(items, "SpawnArmorStand")
	/**
	 * Spawns an experience orb at
	 * a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*)[NumItem]
	 *
	 * Experience amount
	 *
	 * (*)[]
	 *
	 * Custom name
	 *
	 * (*) = Optional
	 */
	fun spawnExpOrb(items: Items<T>) = block(items, "SpawnExpOrb")
	/**
	 * Sets the amount of health
	 * regained in this event.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * New healing amount
	 *
	 * (*) = Optional
	 */
	fun setEventHeal(items: Items<T>) = block(items, "SetEventHeal")
	/**
	 * Spawns a block display entity.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Spawn location
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
	fun spawnBlockDisp(items: Items<T>) = block(items, "SpawnBlockDisp")
	fun particleRay(items: Items<T>) = block(items, "ParticleRay")
	/**
	 * Generates a tree at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Tree location (bottom
	 * log block)
	 *
	 * (*) = Optional
	 */
	fun generateTree(items: Items<T>) = block(items, "GenerateTree")
	fun stopLoop(items: Items<T>) = block(items, "StopLoop")
	/**
	 * Empties a container at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * (*) = Optional
	 */
	fun clearContainer(items: Items<T>) = block(items, "ClearContainer")
	fun setScObj(items: Items<T>) = block(items, "SetScObj")
	/**
	 * Cancels the initial event that
	 * triggered this line of code.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun cancelEvent(items: Items<T>) = block(items, "CancelEvent")
	/**
	 * Spawns an end crystal at a
	 * location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*)[]
	 *
	 * Custom name
	 *
	 * (*) = Optional
	 */
	fun spawnCrystal(items: Items<T>) = block(items, "SpawnCrystal")
	fun particleEffect(items: Items<T>) = block(items, "ParticleEffect")
	/**
	 * Spawns evoker fangs at a
	 * location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*)[]
	 *
	 * Custom name
	 *
	 * (*) = Optional
	 */
	fun spawnFangs(items: Items<T>) = block(items, "SpawnFangs")
	/**
	 * Sets the sound to play for
	 * this event, replacing the
	 * original sound.
	 *
	 * ARGUMENTS:
	 *
	 * [SoundItem]
	 *
	 * New sound
	 *
	 * (*) = Optional
	 */
	fun setEventSound(items: Items<T>) = block(items, "SetEventSound")
	/**
	 * Sets the item being cooked in
	 * one of a campfire's slots.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Campfire location
	 *
	 * Any Item
	 *
	 * Campfire item
	 *
	 * (*)[NumItem]
	 *
	 * Cooking time (ticks)
	 *
	 * (*) = Optional
	 */
	fun setCampfireItem(items: Items<T>) = block(items, "SetCampfireItem")
	/**
	 * Spawns a text display entity.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [](s)
	 *
	 * Displayed text
	 *
	 * (*) = Optional
	 */
	@Mythic
	fun spawnTextDisplay(items: Items<T>) = block(items, "SpawnTextDisplay")
	/**
	 * Sets the amount of experience
	 * this event should drop.
	 *
	 * ARGUMENTS:
	 *
	 * [NumItem]
	 *
	 * Experience
	 *
	 * (*) = Optional
	 */
	fun setEventXP(items: Items<T>) = block(items, "SetEventXP")
	/**
	 * Sets the lock key of the container
	 * at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * []
	 *
	 *
	 * (*)[TextItem]
	 *
	 * Lock key
	 *
	 * []
	 *
	 *
	 * []
	 *
	 * Unlocks the container
	 *
	 * (*) = Optional
	 */
	fun lockContainer(items: Items<T>) = block(items, "LockContainer")
	/**
	 * Spawns a vehicle at a location.
	 *
	 * ARGUMENTS:
	 *
	 * []
	 *
	 * Vehicle type
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*)[]
	 *
	 * Custom name
	 *
	 * (*) = Optional
	 */
	fun spawnVehicle(items: Items<T>) = block(items, "SpawnVehicle")
	/**
	 * Strikes lightning at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Impact location
	 *
	 * (*) = Optional
	 */
	fun lightning(items: Items<T>) = block(items, "Lightning")
	@Mythic
	fun particleSpiralA(items: Items<T>) = block(items, "ParticleSpiralA")
	fun removeScore(items: Items<T>) = block(items, "RemoveScore")
	@Mythic
	fun createHologram(items: Items<T>) = block(items, "CreateHologram")
	fun setScore(items: Items<T>) = block(items, "SetScore")
	@Noble
	fun particleCluster(items: Items<T>) = block(items, "ParticleCluster")
	@Noble
	fun particleCircle(items: Items<T>) = block(items, "ParticleCircle")
	/**
	 * Disables blocks dropping
	 * as items when broken.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun blockDropsOff(items: Items<T>) = block(items, "BlockDropsOff")
	/**
	 * Removes all of an item from
	 * the container at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * Any Item(s)
	 *
	 * Item(s) to clear
	 *
	 * (*) = Optional
	 */
	fun clearItems(items: Items<T>) = block(items, "ClearItems")
	fun particleLine(items: Items<T>) = block(items, "ParticleLine")

}