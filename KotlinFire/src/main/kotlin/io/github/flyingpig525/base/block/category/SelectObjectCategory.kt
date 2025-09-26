package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.subaction.*
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.item.type.tag.SelectObjectTags
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put

@Suppress("unused")
class SelectObjectCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(items: Items, action: String, extra: JsonObjectBuilder.() -> Unit = {}) {
        blocks += Block("select", ItemCollection(items).items, action, extra)
    }
	/**
	 */
	fun lastMob(items: Items) {
		block(items, "LastMob")
	}


	/**
	 * Creates a selection using
	 * one or more random
	 * players in the game.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Selection size
	 *
	 * *Default = 1*
	 *
	 * (*) = optional
	 */
	fun randomPlayer(items: Items) {
		block(items, "RandomPlayer")
	}


	/**
	 * Creates a selection using
	 * the most recently spawned
	 * entity.
	 */
	fun lastEntity(items: Items) {
		block(items, "LastEntity")
	}


	/**
	 */
	fun shooter(items: Items) {
		block(items, "Shooter")
	}


	/**
	 */
	fun allMobs(items: Items) {
		block(items, "AllMobs")
	}


	/**
	 * Creates a selection using all
	 * entities in the game whose
	 * name or UUID matches.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * UUID to check for
	 *
	 * [TextItem]
	 *
	 * Name to check for
	 *
	 * (*) = optional

	 * @see [SelectObjectTags.EntityName]
	 */
	fun entityName(items: Items) {
		block(items, "EntityName")
	}


	/**
	 * Filters the selection by
	 * randomly picking one or
	 * more objects from it.
	 *
	 * **Args:**
	 *
	 * [NumItem]
	 *
	 * (*) Selection size
	 *
	 * *Default = 1*
	 *
	 * (*) = optional
	 */
	fun filterRandom(items: Items) {
		block(items, "FilterRandom")
	}


	/**
	 */
	fun defaultEntity(items: Items) {
		block(items, "DefaultEntity")
	}


	/**
	 * Creates a selection using all
	 * players in the game whose
	 * name or UUID matches.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Name or UUID
	 *
	 * (*) = optional
	 */
	fun playerName(items: Items) {
		block(items, "PlayerName")
	}


	/**
	 * Creates a selection of
	 * all entities in the game.
	 */
	fun allEntities(items: Items) {
		block(items, "AllEntities")
	}


	/**
	 */
	fun damager(items: Items) {
		block(items, "Damager")
	}


	/**
	 * Filters the selection to the
	 * objects that are nearest
	 * or farthest to a location.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Location to
	 * compare to
	 *
	 * [NumItem]
	 *
	 * (*) Selection size
	 *
	 * *Default = 1*
	 *
	 * (*) = optional

	 * @see [SelectObjectTags.FilterDistance]
	 */
	fun filterDistance(items: Items) {
		block(items, "FilterDistance")
	}


	/**
	 * Filters the selected objects
	 * to the objects that intersect
	 * a ray.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * (*) Gets the end or
	 * (*) final hit location
	 *
	 * [LocItem]
	 *
	 * Ray origin
	 *
	 * [NumItem]
	 *
	 * Ray distance
	 *
	 * [NumItem]
	 *
	 * (*) Ray width
	 *
	 * *Default = 0.0*
	 *
	 * [NumItem]
	 *
	 * (*) Selection size
	 *
	 * *Default = 1*
	 *
	 * (*) = optional

	 * @see [SelectObjectTags.FilterRay]
	 */
	fun filterRay(items: Items) {
		block(items, "FilterRay")
	}


	/**
	 * Deactivates the selection.
	 * Code that follows will run
	 * normally with event targets.
	 */
	fun reset(items: Items) {
		block(items, "Reset")
	}


	/**
	 * Creates a selection using
	 * a target involved in this
	 * Event.
	 */
	fun eventTarget(items: Items) {
		block(items, "EventTarget")
	}


	/**
	 */
	fun killer(items: Items) {
		block(items, "Killer")
	}


	/**
	 */
	fun victim(items: Items) {
		block(items, "Victim")
	}


	/**
	 * Creates a selection of
	 * all entities in the game
	 * that meet a condition.
	 *
	 * **Accepts sub actions:**
	 * [IfEntitySubAction],
	 * [IfVarSubAction],
	 * [IfGameSubAction],
	 */
	fun entitiesCond(items: Items, subAction: SubAction) {
		block(items, "EntitiesCond") { put("subAction", subAction.codeblock) }
	}


	/**
	 * Creates a selection of
	 * all players in the game.
	 */
	fun allPlayers(items: Items) {
		block(items, "AllPlayers")
	}


	/**
	 * Creates a new selection by
	 * inverting the selection that
	 * is currently active.
	 */
	fun invert(items: Items) {
		block(items, "Invert")
	}


	/**
	 */
	fun randomEntity(items: Items) {
		block(items, "RandomEntity")
	}


	/**
	 * Filters the selection to the
	 * objects that meet a certain
	 * condition.
	 *
	 * **Accepts sub actions:**
	 * [IfPlayerSubAction],
	 * [IfEntitySubAction],
	 * [IfVarSubAction],
	 * [IfGameSubAction],
	 */
	fun filterCondition(items: Items, subAction: SubAction) {
		block(items, "FilterCondition") { put("subAction", subAction.codeblock) }
	}


	/**
	 *
	 * **Accepts sub actions:**
	 * [IfEntitySubAction],
	 * [IfVarSubAction],
	 * [IfGameSubAction],
	 */
	fun mobsCond(items: Items, subAction: SubAction) {
		block(items, "MobsCond") { put("subAction", subAction.codeblock) }
	}


	/**
	 * Filters the selection by
	 * sorting the value of each
	 * object in order.
	 *
	 * **Args:**
	 *
	 * [Item]
	 *
	 * Value to
	 * compare
	 *
	 * [NumItem]
	 *
	 * (*) Selection size
	 *
	 * *Default = 1*
	 *
	 * (*) = optional

	 * @see [SelectObjectTags.FilterSort]
	 */
	fun filterSort(items: Items) {
		block(items, "FilterSort")
	}


	/**
	 */
	fun projectile(items: Items) {
		block(items, "Projectile")
	}


	/**
	 */
	fun defaultPlayer(items: Items) {
		block(items, "DefaultPlayer")
	}


	/**
	 * Creates a selection of
	 * all players in the game
	 * that meet a condition.
	 *
	 * **Accepts sub actions:**
	 * [IfPlayerSubAction],
	 * [IfVarSubAction],
	 * [IfGameSubAction],
	 */
	fun playersCond(items: Items, subAction: SubAction) {
		block(items, "PlayersCond") { put("subAction", subAction.codeblock) }
	}


	/**
	 */
	fun mobName(items: Items) {
		block(items, "MobName")
	}

}