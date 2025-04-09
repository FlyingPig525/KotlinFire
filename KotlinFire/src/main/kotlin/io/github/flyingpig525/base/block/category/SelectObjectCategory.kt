package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.*
import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.block.subaction.*
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put

class SelectObjectCategory<T : Item> internal constructor(private val template: Template<T>) {
    private val blocks = template.blocks

    private fun block(items: Items<T>, action: String, extra: JsonObjectBuilder.() -> Unit = {}) {
        blocks += Block("select", ItemCollection(items).items, action, extra)
    }
	/**
	 */
	fun lastMob(items: Items<T>) = block(items, "LastMob")


	/**
	 * *Creates a selection using*
	 * *one or more random*
	 * *players in the game.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Selection size*
	 *
	 * (*) = optional
	 */
	fun randomPlayer(items: Items<T>) = block(items, "RandomPlayer")


	/**
	 * *Creates a selection using*
	 * *the most recently spawned*
	 * *entity.*
	 */
	fun lastEntity(items: Items<T>) = block(items, "LastEntity")


	/**
	 */
	fun shooter(items: Items<T>) = block(items, "Shooter")


	/**
	 */
	fun allMobs(items: Items<T>) = block(items, "AllMobs")


	/**
	 * *Creates a selection using all*
	 * *entities in the game whose*
	 * *name or UUID matches.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *UUID to check for*
	 *
	 * [TextItem]
	 *
	 * *Name to check for*
	 *
	 * (*) = optional
	 */
	fun entityName(items: Items<T>) = block(items, "EntityName")


	/**
	 * *Filters the selection by*
	 * *randomly picking one or*
	 * *more objects from it.*
	 *
	 * #### Args:
	 *
	 * [NumItem]
	 *
	 * (*) *Selection size*
	 *
	 * (*) = optional
	 */
	fun filterRandom(items: Items<T>) = block(items, "FilterRandom")


	/**
	 */
	fun defaultEntity(items: Items<T>) = block(items, "DefaultEntity")


	/**
	 * *Creates a selection using all*
	 * *players in the game whose*
	 * *name or UUID matches.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Name or UUID*
	 *
	 * (*) = optional
	 */
	fun playerName(items: Items<T>) = block(items, "PlayerName")


	/**
	 * *Creates a selection of*
	 * *all entities in the game.*
	 */
	fun allEntities(items: Items<T>) = block(items, "AllEntities")


	/**
	 */
	fun damager(items: Items<T>) = block(items, "Damager")


	/**
	 * *Filters the selection to the*
	 * *objects that are nearest*
	 * *or farthest to a location.*
	 *
	 * #### Args:
	 *
	 * [LocItem]
	 *
	 * *Location to*
	 * *compare to*
	 *
	 * [NumItem]
	 *
	 * (*) *Selection size*
	 *
	 * (*) = optional
	 */
	fun filterDistance(items: Items<T>) = block(items, "FilterDistance")


	/**
	 * *Filters the selected objects*
	 * *to the objects that intersect*
	 * *a ray.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * (*) *Gets the end or*
	 * (*) *final hit location*
	 *
	 * [LocItem]
	 *
	 * *Ray origin*
	 *
	 * [NumItem]
	 *
	 * *Ray distance*
	 *
	 * [NumItem]
	 *
	 * (*) *Ray width*
	 *
	 * [NumItem]
	 *
	 * (*) *Selection size*
	 *
	 * (*) = optional
	 */
	fun filterRay(items: Items<T>) = block(items, "FilterRay")


	/**
	 * *Deactivates the selection.*
	 * *Code that follows will run*
	 * *normally with event targets.*
	 */
	fun reset(items: Items<T>) = block(items, "Reset")


	/**
	 * *Creates a selection using*
	 * *a target involved in this*
	 * *Event.*
	 */
	fun eventTarget(items: Items<T>) = block(items, "EventTarget")


	/**
	 */
	fun killer(items: Items<T>) = block(items, "Killer")


	/**
	 */
	fun victim(items: Items<T>) = block(items, "Victim")


	/**
	 * *Creates a selection of*
	 * *all entities in the game*
	 * *that meet a condition.*
	 *
	 * ##### Accepts sub actions:
	 * [IfEntitySubAction],
	 * [IfVarSubAction],
	 * [IfGameSubAction],
	 */
	fun entitiesCond(items: Items<T>, subAction: SubAction) = block(items, "EntitiesCond") { put("subAction", subAction.codeblock) }


	/**
	 * *Creates a selection of*
	 * *all players in the game.*
	 */
	fun allPlayers(items: Items<T>) = block(items, "AllPlayers")


	/**
	 * *Creates a new selection by*
	 * *inverting the selection that*
	 * *is currently active.*
	 */
	fun invert(items: Items<T>) = block(items, "Invert")


	/**
	 */
	fun randomEntity(items: Items<T>) = block(items, "RandomEntity")


	/**
	 * *Filters the selection to the*
	 * *objects that meet a certain*
	 * *condition.*
	 *
	 * ##### Accepts sub actions:
	 * [IfPlayerSubAction],
	 * [IfEntitySubAction],
	 * [IfVarSubAction],
	 * [IfGameSubAction],
	 */
	fun filterCondition(items: Items<T>, subAction: SubAction) = block(items, "FilterCondition") { put("subAction", subAction.codeblock) }


	/**
	 *
	 * ##### Accepts sub actions:
	 * [IfEntitySubAction],
	 * [IfVarSubAction],
	 * [IfGameSubAction],
	 */
	fun mobsCond(items: Items<T>, subAction: SubAction) = block(items, "MobsCond") { put("subAction", subAction.codeblock) }


	/**
	 * *Filters the selection by*
	 * *sorting the value of each*
	 * *object in order.*
	 *
	 * #### Args:
	 *
	 * [Item]
	 *
	 * *Value to*
	 * *compare*
	 *
	 * [NumItem]
	 *
	 * (*) *Selection size*
	 *
	 * (*) = optional
	 */
	fun filterSort(items: Items<T>) = block(items, "FilterSort")


	/**
	 */
	fun projectile(items: Items<T>) = block(items, "Projectile")


	/**
	 */
	fun defaultPlayer(items: Items<T>) = block(items, "DefaultPlayer")


	/**
	 * *Creates a selection of*
	 * *all players in the game*
	 * *that meet a condition.*
	 *
	 * ##### Accepts sub actions:
	 * [IfPlayerSubAction],
	 * [IfVarSubAction],
	 * [IfGameSubAction],
	 */
	fun playersCond(items: Items<T>, subAction: SubAction) = block(items, "PlayersCond") { put("subAction", subAction.codeblock) }


	/**
	 */
	fun mobName(items: Items<T>) = block(items, "MobName")

}