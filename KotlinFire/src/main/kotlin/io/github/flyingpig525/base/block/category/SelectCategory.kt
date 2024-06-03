@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*

class SelectCategory <T> internal constructor(private val template: Template<T>) where T : Item, T : JsonData {
	private val blocks = template.blocks

	private fun block(items: Items<T>, action: String) {
		blocks += Block("select_obj", ItemCollection(items).items, action)
	}

	fun chain(a: SelectCategory<T>.() -> Unit) {
		apply(a)
	}

	fun lastMob(items: Items<T>) = block(items, "LastMob")
	/**
	 * Creates a selection using
	 * one or more random
	 * players in the game.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[NumItem]
	 *
	 * Selection size
	 *
	 * (*) = Optional
	 */
	fun randomPlayer(items: Items<T>) = block(items, "RandomPlayer")
	/**
	 * Creates a selection using
	 * the most recently spawned
	 * entity.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun lastEntity(items: Items<T>) = block(items, "LastEntity")
	fun shooter(items: Items<T>) = block(items, "Shooter")
	fun allMobs(items: Items<T>) = block(items, "AllMobs")
	/**
	 * Creates a selection using all
	 * entities in the game whose
	 * name or UUID matches.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem](s)
	 *
	 * UUID to check for
	 *
	 * []
	 *
	 *
	 * [](s)
	 *
	 * Name to check for
	 *
	 * (*) = Optional
	 */
	fun entityName(items: Items<T>) = block(items, "EntityName")
	/**
	 * Filters the selection by
	 * randomly picking one or
	 * more objects from it.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[NumItem]
	 *
	 * Selection size
	 *
	 * (*) = Optional
	 */
	fun filterRandom(items: Items<T>) = block(items, "FilterRandom")
	fun defaultEntity(items: Items<T>) = block(items, "DefaultEntity")
	/**
	 * Creates a selection using all
	 * players in the game whose
	 * name or UUID matches.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem](s)
	 *
	 * Name or UUID
	 *
	 * (*) = Optional
	 */
	fun playerName(items: Items<T>) = block(items, "PlayerName")
	/**
	 * Creates a selection of
	 * all entities in the game.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun allEntities(items: Items<T>) = block(items, "AllEntities")
	fun damager(items: Items<T>) = block(items, "Damager")
	/**
	 * Filters the selection to the
	 * objects that are nearest
	 * or farthest to a location.
	 *
	 * ARGUMENTS:
	 *
	 * [LocItem]
	 *
	 * Location to
	 * compare to
	 *
	 * (*)[NumItem]
	 *
	 * Selection size
	 *
	 * (*) = Optional
	 */
	fun filterDistance(items: Items<T>) = block(items, "FilterDistance")
	/**
	 * Filters the selected objects
	 * to the objects that intersect
	 * a ray.
	 *
	 * ARGUMENTS:
	 *
	 * (*)[VarItem]
	 *
	 * Gets the end or
	 * final hit location
	 *
	 * [LocItem]
	 *
	 * Ray origin
	 *
	 * [NumItem]
	 *
	 * Ray distance
	 *
	 * (*)[NumItem]
	 *
	 * Ray width
	 *
	 * (*)[NumItem]
	 *
	 * Selection size
	 *
	 * (*) = Optional
	 */
	fun filterRay(items: Items<T>) = block(items, "FilterRay")
	/**
	 * Deactivates the selection.
	 * Code that follows will run
	 * normally with event targets.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun reset(items: Items<T>) = block(items, "Reset")
	/**
	 * Creates a selection using
	 * a target involved in this
	 * Event.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun eventTarget(items: Items<T>) = block(items, "EventTarget")
	fun killer(items: Items<T>) = block(items, "Killer")
	fun victim(items: Items<T>) = block(items, "Victim")
	/**
	 * Creates a selection of
	 * all entities in the game
	 * that meet a condition.
	 *
	 * ARGUMENTS:
	 */
	fun entitiesCond(items: Items<T>) = block(items, "EntitiesCond")
	/**
	 * Creates a selection of
	 * all players in the game.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun allPlayers(items: Items<T>) = block(items, "AllPlayers")
	/**
	 * Creates a new selection by
	 * inverting the selection that
	 * is currently active.
	 *
	 * ARGUMENTS:
	 *
	 * (*) = Optional
	 */
	fun invert(items: Items<T>) = block(items, "Invert")
	fun randomEntity(items: Items<T>) = block(items, "RandomEntity")
	/**
	 * Filters the selection to the
	 * objects that meet a certain
	 * condition.
	 *
	 * ARGUMENTS:
	 */
	fun filterCondition(items: Items<T>) = block(items, "FilterCondition")
	fun mobsCond(items: Items<T>) = block(items, "MobsCond")
	/**
	 * Filters the selection by
	 * sorting the value of each
	 * object in order.
	 *
	 * ARGUMENTS:
	 *
	 * Any Value
	 *
	 * Value to
	 * compare
	 *
	 * (*)[NumItem]
	 *
	 * Selection size
	 *
	 * (*) = Optional
	 */
	fun filterSort(items: Items<T>) = block(items, "FilterSort")
	fun projectile(items: Items<T>) = block(items, "Projectile")
	fun defaultPlayer(items: Items<T>) = block(items, "DefaultPlayer")
	/**
	 * Creates a selection of
	 * all players in the game
	 * that meet a condition.
	 *
	 * ARGUMENTS:
	 */
	fun playersCond(items: Items<T>) = block(items, "PlayersCond")
	fun mobName(items: Items<T>) = block(items, "MobName")

}