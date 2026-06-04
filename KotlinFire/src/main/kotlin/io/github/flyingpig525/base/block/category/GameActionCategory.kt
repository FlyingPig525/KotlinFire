package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.item.type.tag.GameActionTags
import io.github.flyingpig525.base.item.type.tag.TagItem
import kotlinx.serialization.json.JsonObjectBuilder
import kotlin.reflect.KClass
import kotlin.reflect.full.superclasses

@Suppress("unused")
class GameActionCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(items: Items, action: String, tagClass: KClass<*>? = null, extra: JsonObjectBuilder.() -> Unit = {}) {
        val collection = ItemCollection(items)
        tagClass?.nestedClasses?.forEach { klass ->
            if (klass.superclasses.any { it.qualifiedName == "kotlin.Enum" }) {
                @Suppress("UNCHECKED_CAST")
                val entries = klass.java.enumConstants as Array<Enum<*>>
                entries.forEach { entry ->
                    if (entry is TagItem) {
                        if (!entry.default) return@forEach
                        if (collection.items.none { it is TagItem && it.tag == entry.tag })
                        collection += entry
                    }
                }
            }
        }
        blocks += Block("game_action", collection.items, action, extra)
    }
	/**
	 * Fills the container at a location
	 * with items.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to fill with
	 *
	 * (*) = optional
	 */
	fun fillContainer(items: Items) {
		block(items, "FillContainer")
	}


	/**
	 * Breaks the block at a location
	 * as if it was broken by a player.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Block(s) to break
	 *
	 * (*) = optional
	 */
	fun breakBlock(items: Items) {
		block(items, "BreakBlock")
	}


	/**
	 */
	fun lPFXSpiral(items: Items) {
		block(items, "L PFX Spiral")
	}


	/**
	 */
	fun particleSphere(items: Items) {
		block(items, "ParticleSphere")
	}


	/**
	 * Changes a line of text
	 * on a sign.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Sign location
	 *
	 * [NumItem]
	 *
	 * Line number
	 *
	 * [TextItem]
	 *
	 * (*) New text
	 *
	 * (*) = optional

	 * @see [GameActionTags.ChangeSign]
	 */
	fun changeSign(items: Items) {
		block(items, "ChangeSign", tagClass = GameActionTags.ChangeSign::class)
	}


	/**
	 * Sends a web request to a URL.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * URL to request
	 *
	 * [StringItem]
	 *
	 * (*) Content body
	 *
	 * (*) = optional

	 * @see [GameActionTags.WebRequest]
	 */
	fun webRequest(items: Items) {
		block(items, "WebRequest", tagClass = GameActionTags.WebRequest::class)
	}


	/**
	 * Sets the simulation distance
	 * in the world.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Simulation distance
	 *
	 * *Limit: §c2§7-§c32§7*
	 *
	 * (*) = optional
	 */
	fun simulationDistance(items: Items) {
		block(items, "SimulationDistance")
	}


	/**
	 */
	fun clearScBoard(items: Items) {
		block(items, "ClearScBoard")
	}


	/**
	 */
	fun hideSidebar(items: Items) {
		block(items, "HideSidebar")
	}


	/**
	 * Sets the death message in
	 * this event.
	 *
	 * **Args:**
	 *
	 * [TextItem]
	 *
	 * New death message
	 *
	 * (*) = optional
	 */
	fun setEventDeathMsg(items: Items) {
		block(items, "SetEventDeathMsg")
	}


	/**
	 */
	fun spawnItemDisplay(items: Items) {
		block(items, "SpawnItemDisplay")
	}


	/**
	 * Adds blocks to the next transaction; a method
	 * of queuing up block operations so that
	 * they can be sent simultaneously.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
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
	 * [TextItem]
	 *
	 * (*) Block data
	 * (*) (comma separated)
	 *
	 * *Example: §b"facing=up,half=top"§7*
	 *
	 * (*) = optional
	 */
	fun writeTransaction(items: Items) {
		block(items, "WriteTransaction")
	}


	/**
	 * Sets the time in the world.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Daylight ticks
	 *
	 * *Day: §c1000§7*
	 * *Noon: §c6000§7*
	 * *Night: §c13000§7*
	 * *Midnight: §c18000§7*
	 *
	 * (*) = optional
	 */
	fun setWorldTime(items: Items) {
		block(items, "SetWorldTime")
	}


	/**
	 */
	fun particleSpiral(items: Items) {
		block(items, "ParticleSpiral")
	}


	/**
	 * Sets a data tag value of
	 * the block at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Location
	 *
	 * [TextItem]
	 *
	 * Block data
	 *
	 * *Example: §b"facing=up"§7*
	 *
	 * (*) = optional

	 * @see [GameActionTags.SetBlockData]
	 */
	fun setBlockData(items: Items) {
		block(items, "SetBlockData", tagClass = GameActionTags.SetBlockData::class)
	}


	/**
	 * Launches a firework
	 * rocket at a location.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Firework rocket
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * (*) = optional

	 * @see [GameActionTags.Firework]
	 */
	fun firework(items: Items) {
		block(items, "Firework", tagClass = GameActionTags.Firework::class)
	}


	/**
	 * Sets the damage dealt in
	 * this event.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * New damage amount
	 *
	 * *§c❤§7 = §c2§7 Health*
	 *
	 * (*) = optional
	 */
	fun setEventDamage(items: Items) {
		block(items, "SetEventDamage")
	}


	/**
	 * Sets if this world has a
	 * natural weather cycle.
	 */
	fun advanceWeather(items: Items) {
		block(items, "AdvanceWeather", tagClass = GameActionTags.AdvanceWeather::class)
	}


	/**
	 * Sets the radius fire spreads
	 * around a player.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Radius in blocks
	 *
	 * *Set to §c-1§7 to disable fire spreading.*
	 * *Set to §c0§7 to allow fire spreading away from players.*
	 *
	 * (*) = optional
	 */
	fun fireSpreadRadius(items: Items) {
		block(items, "FireSpreadRadius")
	}


	/**
	 * Spawns an item at a location.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to spawn
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [TextItem]
	 *
	 * (*) Custom name
	 *
	 * (*) = optional

	 * @see [GameActionTags.SpawnItem]
	 */
	fun spawnItem(items: Items) {
		block(items, "SpawnItem", tagClass = GameActionTags.SpawnItem::class)
	}


	/**
	 * Changes the text color
	 * of a sign.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Sign location
	 *
	 * (*) = optional

	 * @see [GameActionTags.SignColor]
	 */
	fun signColor(items: Items) {
		block(items, "SignColor", tagClass = GameActionTags.SignColor::class)
	}


	/**
	 * Spawns a shulker bullet at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Spawn Location
	 *
	 * (*) = optional
	 */
	fun shulkerBullet(items: Items) {
		block(items, "ShulkerBullet")
	}


	/**
	 */
	fun fireworkEffect(items: Items) {
		block(items, "FireworkEffect")
	}


	/**
	 * Sets if this world spawns mobs.
	 */
	fun mobSpawning(items: Items) {
		block(items, "MobSpawning", tagClass = GameActionTags.MobSpawning::class)
	}


	/**
	 * Sets the contents of the container
	 * at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to set
	 *
	 * (*) = optional
	 */
	fun setContainer(items: Items) {
		block(items, "SetContainer")
	}


	/**
	 * Spawns an invisible hitbox
	 * with the specified size.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [NumItem]
	 *
	 * (*) Hitbox width
	 *
	 * [NumItem]
	 *
	 * (*) Hitbox height
	 *
	 * (*) = optional

	 * @see [GameActionTags.SpawnInteraction]
	 */
	fun spawnInteraction(items: Items) {
		block(items, "SpawnInteraction", tagClass = GameActionTags.SpawnInteraction::class)
	}


	/**
	 * Sets the item in a slot of the
	 * container at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to set
	 *
	 * [NumItem]
	 *
	 * Slot
	 *
	 * (*) = optional
	 */
	fun setItemInSlot(items: Items) {
		block(items, "SetItemInSlot")
	}


	/**
	 * Copies a region of blocks to another
	 * region, including air.
	 *
	 * **Args:**
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
	 * (*) = optional

	 * @see [GameActionTags.CloneRegion]
	 */
	fun cloneRegion(items: Items) {
		block(items, "CloneRegion", tagClass = GameActionTags.CloneRegion::class)
	}


	/**
	 * Uncancels the initial event that
	 * triggered this line of code.
	 */
	fun uncancelEvent(items: Items) {
		block(items, "UncancelEvent")
	}


	/**
	 * Sets the book and the
	 * displayed page of a Lectern.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Lectern location
	 *
	 * [MinecraftItem]
	 *
	 * (*) Book to put
	 *
	 * [NumItem]
	 *
	 * (*) Displayed page
	 *
	 * (*) = optional
	 */
	fun setLecternBook(items: Items) {
		block(items, "SetLecternBook")
	}


	/**
	 * Spawns an armor stand at a
	 * location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [TextItem]
	 *
	 * (*) Custom name
	 *
	 * [MinecraftItem]
	 *
	 * (*) Equipment
	 *
	 * (*) = optional

	 * @see [GameActionTags.SpawnArmorStand]
	 */
	fun spawnArmorStand(items: Items) {
		block(items, "SpawnArmorStand", tagClass = GameActionTags.SpawnArmorStand::class)
	}


	/**
	 * Spawns a block display entity.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [MinecraftItem]
	 *
	 * Displayed block
	 *
	 * [TextItem]
	 *
	 * (*) Block data
	 *
	 * *Example: §b"facing=up"§7, §b"half=top"§7*
	 *
	 * (*) = optional
	 */
	fun spawnBlockDisp(items: Items) {
		block(items, "SpawnBlockDisp")
	}


	/**
	 * Sets the current strength
	 * in this event.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * New current strength
	 *
	 * *Range: §c0§7-§c15§7*
	 *
	 * (*) = optional
	 */
	fun redstoneStrength(items: Items) {
		block(items, "RedstoneStrength")
	}


	/**
	 * Empties a container at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * (*) = optional
	 */
	fun clearContainer(items: Items) {
		block(items, "ClearContainer")
	}


	/**
	 * Sets if this world spawns wandering traders.
	 */
	fun traderSpawning(items: Items) {
		block(items, "TraderSpawning", tagClass = GameActionTags.TraderSpawning::class)
	}


	/**
	 * Cancels the initial event that
	 * triggered this line of code.
	 */
	fun cancelEvent(items: Items) {
		block(items, "CancelEvent")
	}


	/**
	 */
	fun particleEffect(items: Items) {
		block(items, "ParticleEffect")
	}


	/**
	 * Spawns evoker fangs at a
	 * location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [TextItem]
	 *
	 * (*) Custom name
	 *
	 * (*) = optional
	 */
	fun spawnFangs(items: Items) {
		block(items, "SpawnFangs")
	}


	/**
	 * Sets the sound to play for
	 * this event, replacing the
	 * original sound.
	 *
	 * **Args:**
	 *
	 * [SoundItem]
	 *
	 * New sound
	 *
	 * (*) = optional
	 */
	fun setEventSound(items: Items) {
		block(items, "SetEventSound")
	}


	/**
	 * Sets the amount of experience
	 * this event should drop.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Experience
	 *
	 * (*) = optional
	 */
	fun setEventXP(items: Items) {
		block(items, "SetEventXP")
	}


	/**
	 * Sets the lock key of the container
	 * at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * [StringItem]
	 *
	 * Lock key
	 *
	 * (*) = optional
	 */
	fun lockContainer(items: Items) {
		block(items, "LockContainer")
	}


	/**
	 */
	fun removeScore(items: Items) {
		block(items, "RemoveScore")
	}


	/**
	 */
	fun createHologram(items: Items) {
		block(items, "CreateHologram")
	}


	/**
	 * Sets the exhaustion
	 * gained in this event.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * New exhaustion amount
	 *
	 * (*) = optional
	 */
	fun setExhaustion(items: Items) {
		block(items, "SetExhaustion")
	}


	/**
	 */
	fun particleCircle(items: Items) {
		block(items, "ParticleCircle")
	}


	/**
	 * Sets if this world has a
	 * natural time cycle.
	 */
	fun advanceTime(items: Items) {
		block(items, "AdvanceTime", tagClass = GameActionTags.AdvanceTime::class)
	}


	/**
	 */
	fun pFXLineA(items: Items) {
		block(items, "PFX Line [A]")
	}


	/**
	 * Removes all of an item from
	 * the container at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
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
	 */
	fun startLoop(items: Items) {
		block(items, "StartLoop")
	}


	/**
	 * Sets the amount of ticks it
	 * takes for a furnace block
	 * to cook an item.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Furnace location
	 *
	 * [NumItem]
	 *
	 * Ticks
	 *
	 * (*) = optional
	 */
	fun setFurnaceSpeed(items: Items) {
		block(items, "SetFurnaceSpeed")
	}


	/**
	 * Enables blocks dropping
	 * as items when broken.
	 */
	fun blockDropsOn(items: Items) {
		block(items, "BlockDropsOn")
	}


	/**
	 * Spawns a mannequin at a location.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Mannequin player head
	 *
	 * [StringItem]
	 *
	 * Mannequin player name or UUID
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [TextItem]
	 *
	 * (*) Description
	 *
	 * *Only shown if name is visible*
	 *
	 * (*) = optional

	 * @see [GameActionTags.SpawnMannequin]
	 */
	fun spawnMannequin(items: Items) {
		block(items, "SpawnMannequin", tagClass = GameActionTags.SpawnMannequin::class)
	}


	/**
	 * Sets the view distance in the world.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * View distance
	 *
	 * *Limit: §c2§7-§c32§7*
	 *
	 * (*) = optional
	 */
	fun viewDistance(items: Items) {
		block(items, "ViewDistance")
	}


	/**
	 * Applies bone meal to a block.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Block(s) to bone meal
	 *
	 * [NumItem]
	 *
	 * (*) Number of uses
	 *
	 * (*) = optional

	 * @see [GameActionTags.BoneMeal]
	 */
	fun boneMeal(items: Items) {
		block(items, "BoneMeal", tagClass = GameActionTags.BoneMeal::class)
	}


	/**
	 */
	fun debugStackTrace(items: Items) {
		block(items, "DebugStackTrace")
	}


	/**
	 * Spawns a falling block at a
	 * location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * [MinecraftItem]
	 *
	 * Block material
	 *
	 * [TextItem]
	 *
	 * (*) Block data
	 *
	 * (*) = optional

	 * @see [GameActionTags.FallingBlock]
	 */
	fun fallingBlock(items: Items) {
		block(items, "FallingBlock", tagClass = GameActionTags.FallingBlock::class)
	}


	/**
	 * Sets the item displayed
	 * in this event.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item to display
	 *
	 * (*) = optional
	 */
	fun setDisplayedItem(items: Items) {
		block(items, "SetDisplayedItem")
	}


	/**
	 * Sends a message to a Discord
	 * webhook.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Webhook URL
	 *
	 * [StringItem]
	 *
	 * Message content
	 *
	 * (*) = optional
	 */
	fun discordWebhook(items: Items) {
		block(items, "DiscordWebhook")
	}


	/**
	 * Causes a block to get "random
	 * ticked", which could cause a
	 * block update.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Block(s) to tick
	 *
	 * [NumItem]
	 *
	 * (*) Number of ticks
	 *
	 * (*) = optional
	 */
	fun tickBlock(items: Items) {
		block(items, "TickBlock")
	}


	/**
	 * Replaces items in the container
	 * at a location with the given item.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
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
	 * Replaces the projectile fired in
	 * the Shoot Bow Event.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * (*) Projectile to launch
	 *
	 * (*) = optional
	 */
	fun setEventProj(items: Items) {
		block(items, "SetEventProj")
	}


	/**
	 * Sets the random tick speed
	 * in the world.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * Tick speed
	 *
	 * (*) = optional
	 */
	fun randomTickSpeed(items: Items) {
		block(items, "RandomTickSpeed")
	}


	/**
	 * Creates an explosion at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Explosion
	 * location
	 *
	 * [NumItem]
	 *
	 * (*) Explosion power (0-4)
	 *
	 * *Default = §c4§7*
	 *
	 * (*) = optional
	 */
	fun explosion(items: Items) {
		block(items, "Explosion")
	}


	/**
	 * Spawns a mob at a location.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Mob type
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [NumItem]
	 *
	 * (*) Health
	 *
	 * [TextItem]
	 *
	 * (*) Custom name
	 *
	 * [PotionItem]
	 *
	 * (*) Effect(s)
	 *
	 * [MinecraftItem]
	 *
	 * (*) Equipment
	 *
	 * (*) = optional
	 */
	fun spawnMob(items: Items) {
		block(items, "SpawnMob")
	}


	/**
	 * Sets the item buried in a
	 * suspicious sand or gravel.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item
	 *
	 * (*) = optional
	 */
	fun setBrushableItem(items: Items) {
		block(items, "SetBrushableItem")
	}


	/**
	 */
	fun particleLineA(items: Items) {
		block(items, "ParticleLineA")
	}


	/**
	 * Spawns an eye of ender at a
	 * location, which (if specified) will
	 * float towards its destination.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Location to spawn at
	 *
	 * [LocItem]
	 *
	 * (*) Destination
	 *
	 * [NumItem]
	 *
	 * (*) Lifespan (ticks)
	 *
	 * [TextItem]
	 *
	 * (*) Custom name
	 *
	 * (*) = optional

	 * @see [GameActionTags.SpawnEnderEye]
	 */
	fun spawnEnderEye(items: Items) {
		block(items, "SpawnEnderEye", tagClass = GameActionTags.SpawnEnderEye::class)
	}


	/**
	 */
	fun showSidebar(items: Items) {
		block(items, "ShowSidebar")
	}


	/**
	 * Spawns a lingering potion cloud
	 * at a location that imbues effects
	 * onto entities who enter it.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [PotionItem]
	 *
	 * (*) Effect to apply
	 *
	 * [TextItem]
	 *
	 * (*) Custom name
	 *
	 * [NumItem]
	 *
	 * (*) Radius (blocks)
	 *
	 * *Default = §c3§7*
	 *
	 * [NumItem]
	 *
	 * (*) Duration (ticks)
	 *
	 * *Default = §c200§7*
	 *
	 * (*) = optional
	 */
	fun spawnPotionCloud(items: Items) {
		block(items, "SpawnPotionCloud")
	}


	/**
	 * Launches a projectile.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Projectile to launch
	 *
	 * [LocItem]
	 *
	 * Launch point
	 *
	 * [TextItem]
	 *
	 * (*) Custom name
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
	 * *Default = §c1§7*
	 *
	 * (*) = optional
	 */
	fun launchProj(items: Items) {
		block(items, "LaunchProj")
	}


	/**
	 * Sets the block at a location.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Block to set
	 *
	 * [LocItem]
	 *
	 * Block location(s)
	 *
	 * [TextItem]
	 *
	 * (*) Block data
	 *
	 * *Example: §b"facing=up"§7, §b"half=top"§7*
	 *
	 * (*) = optional
	 */
	fun setBlock(items: Items) {
		block(items, " SetBlock ")
	}


	/**
	 * Spawns an item display entity.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [MinecraftItem]
	 *
	 * Displayed item
	 *
	 * (*) = optional
	 */
	fun spawnItemDisp(items: Items) {
		block(items, "SpawnItemDisp")
	}


	/**
	 * Sets the growth stage of the block
	 * (eg. carrots) at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * [NumItem]
	 *
	 * (*) Growth stage
	 *
	 * *Default = §c0§7*
	 *
	 * (*) = optional

	 * @see [GameActionTags.SetBlockGrowth]
	 */
	fun setBlockGrowth(items: Items) {
		block(items, "SetBlockGrowth", tagClass = GameActionTags.SetBlockGrowth::class)
	}


	/**
	 */
	fun wait(items: Items) {
		block(items, "Wait", tagClass = GameActionTags.Wait::class)
	}


	/**
	 * Sets the name of the container
	 * at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * [TextItem]
	 *
	 * Name
	 *
	 * (*) = optional
	 */
	fun setContainerName(items: Items) {
		block(items, "SetContainerName")
	}


	/**
	 * Sets the block at a location
	 * to a player head.
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
	 * *Player name or UUID*
	 *
	 * (*) = optional
	 */
	fun setHead(items: Items) {
		block(items, "SetHead")
	}


	/**
	 */
	fun removeHologram(items: Items) {
		block(items, "RemoveHologram")
	}


	/**
	 * Removes items from the container
	 * at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
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
	 */
	fun spawnRngItem(items: Items) {
		block(items, "SpawnRngItem", tagClass = GameActionTags.SpawnRngItem::class)
	}


	/**
	 * Fills a region with a type of block.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
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
	 * [TextItem]
	 *
	 * (*) Block data
	 * (*) (comma separated)
	 *
	 * *Example: §b"facing=up,half=top"§7*
	 *
	 * (*) = optional
	 */
	fun setRegion(items: Items) {
		block(items, "SetRegion")
	}


	/**
	 */
	fun particleCircleA(items: Items) {
		block(items, "ParticleCircleA")
	}


	/**
	 * Sets if this world spreads vines.
	 */
	fun vineSpreading(items: Items) {
		block(items, "VineSpreading", tagClass = GameActionTags.VineSpreading::class)
	}


	/**
	 * Spawns primed TNT at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [NumItem]
	 *
	 * (*) TNT power (0-4)
	 *
	 * *Default = §c4§7*
	 *
	 * [NumItem]
	 *
	 * (*) Fuse duration
	 *
	 * *Default = §c80§7*
	 *
	 * [TextItem]
	 *
	 * (*) Custom name
	 *
	 * (*) = optional
	 */
	fun spawnTNT(items: Items) {
		block(items, "SpawnTNT")
	}


	/**
	 * Spawns an experience orb at
	 * a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [NumItem]
	 *
	 * (*) Experience amount
	 *
	 * [TextItem]
	 *
	 * (*) Custom name
	 *
	 * (*) = optional
	 */
	fun spawnExpOrb(items: Items) {
		block(items, "SpawnExpOrb")
	}


	/**
	 * Sets the biome of a region.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Biome to set
	 *
	 * *Example: §b"basalt_deltas"§7, §b"plains"§7*
	 *
	 * [LocItem]
	 *
	 * Corner 1
	 *
	 * [LocItem]
	 *
	 * Corner 2
	 *
	 * (*) = optional
	 */
	fun setBiome(items: Items) {
		block(items, "SetBiome")
	}


	/**
	 * Sets the amount of health
	 * regained in this event.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * New healing amount
	 *
	 * *§c❤§7 = §c2§7 Health*
	 *
	 * (*) = optional
	 */
	fun setEventHeal(items: Items) {
		block(items, "SetEventHeal")
	}


	/**
	 */
	fun pFXPath(items: Items) {
		block(items, "PFX Path")
	}


	/**
	 * Applies the current transaction
	 * and generates a new one.
	 */
	fun applyTransaction(items: Items) {
		block(items, "ApplyTransaction")
	}


	/**
	 */
	fun particleRay(items: Items) {
		block(items, "ParticleRay")
	}


	/**
	 * Generates a tree at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Tree location (bottom
	 * log block)
	 *
	 * (*) = optional

	 * @see [GameActionTags.GenerateTree]
	 */
	fun generateTree(items: Items) {
		block(items, "GenerateTree", tagClass = GameActionTags.GenerateTree::class)
	}


	/**
	 */
	fun stopLoop(items: Items) {
		block(items, "StopLoop")
	}


	/**
	 */
	fun setScObj(items: Items) {
		block(items, "SetScObj")
	}


	/**
	 * Spawns an end crystal at a
	 * location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [TextItem]
	 *
	 * (*) Custom name
	 *
	 * (*) = optional

	 * @see [GameActionTags.SpawnCrystal]
	 */
	fun spawnCrystal(items: Items) {
		block(items, "SpawnCrystal", tagClass = GameActionTags.SpawnCrystal::class)
	}


	/**
	 * Sets the item being cooked in
	 * one of a campfire's slots.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Campfire location
	 *
	 * [MinecraftItem]
	 *
	 * Campfire item
	 *
	 * [NumItem]
	 *
	 * (*) Cooking time (ticks)
	 *
	 * *Default = §c600§7*
	 *
	 * (*) = optional

	 * @see [GameActionTags.SetCampfireItem]
	 */
	fun setCampfireItem(items: Items) {
		block(items, "SetCampfireItem", tagClass = GameActionTags.SetCampfireItem::class)
	}


	/**
	 * Spawns a text display entity.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [TextItem]
	 *
	 * Displayed text
	 *
	 * (*) = optional

	 * @see [GameActionTags.SpawnTextDisplay]
	 */
	fun spawnTextDisplay(items: Items) {
		block(items, "SpawnTextDisplay", tagClass = GameActionTags.SpawnTextDisplay::class)
	}


	/**
	 * Spawns a vehicle at a location.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Vehicle type
	 *
	 * [LocItem]
	 *
	 * Spawn location
	 *
	 * [TextItem]
	 *
	 * (*) Custom name
	 *
	 * (*) = optional
	 */
	fun spawnVehicle(items: Items) {
		block(items, "SpawnVehicle")
	}


	/**
	 * Strikes lightning at a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Impact location
	 *
	 * (*) = optional
	 */
	fun lightning(items: Items) {
		block(items, "Lightning")
	}


	/**
	 */
	fun particleSpiralA(items: Items) {
		block(items, "ParticleSpiralA")
	}


	/**
	 */
	fun setScore(items: Items) {
		block(items, "SetScore")
	}


	/**
	 */
	fun particleCluster(items: Items) {
		block(items, "ParticleCluster")
	}


	/**
	 * Disables blocks dropping
	 * as items when broken.
	 */
	fun blockDropsOff(items: Items) {
		block(items, "BlockDropsOff")
	}


	/**
	 */
	fun particleLine(items: Items) {
		block(items, "ParticleLine")
	}

}