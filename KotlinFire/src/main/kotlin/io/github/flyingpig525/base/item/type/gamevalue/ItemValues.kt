package io.github.flyingpig525.base.item.type.gamevalue

import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*

object ItemValues {
	/**
	 * *Gets a target's currently*
	 * *held item.*
	 *
	 * **Type:** [MinecraftItem]
	 *
	 * *Item in the*
	 * *selected hotbar slot*
	 */
	val MainHandItem get() = GameValue<MinecraftItem>("Main Hand Item")

	/**
	 * *Gets a target's currently*
	 * *held off hand item.*
	 *
	 * **Type:** [MinecraftItem]
	 *
	 * *Item in the*
	 * *offhand slot*
	 */
	val OffHandItem get() = GameValue<MinecraftItem>("Off Hand Item")

	/**
	 * *Gets the items in a target's*
	 * *armor slots.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one Item*
	 * *entry for each armor*
	 * *slot (air if empty, 4 in*
	 * *total)*
	 *
	 * **Additional Info**
	 *
	 * *Armor slots are ordered*
	 * *from helmet to boots.*
	 */
	val ArmorItems get() = GameValue<VarItem>("Armor Items")

	/**
	 * *Gets a target's current*
	 * *hotbar items.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one Item*
	 * *entry for each hotbar*
	 * *slot (air if empty, 9 in*
	 * *total)*
	 */
	val HotbarItems get() = GameValue<VarItem>("Hotbar Items")

	/**
	 * *Gets a target's inventory*
	 * *items (includes hotbar).*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one Item*
	 * *entry for each inventory*
	 * *slot (air if empty, 36 in*
	 * *total)*
	 */
	val InventoryItems get() = GameValue<VarItem>("Inventory Items")

	/**
	 * *Gets the item on a target's*
	 * *cursor (used when moving*
	 * *items in the inventory).*
	 *
	 * **Type:** [MinecraftItem]
	 *
	 * *Cursor item*
	 */
	val CursorItem get() = GameValue<MinecraftItem>("Cursor Item")

	/**
	 * *Gets a target's current*
	 * *inventory menu items.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one Item*
	 * *entry for each menu*
	 * *slot (air if empty)*
	 *
	 * **Additional Info**
	 *
	 * *Works with container*
	 * *inventories.*
	 */
	val InventoryMenuItems get() = GameValue<VarItem>("Inventory Menu Items")

	/**
	 * *Gets a target's currently*
	 * *worn saddle or carpet.*
	 *
	 * **Type:** [MinecraftItem]
	 *
	 * *Item in the*
	 * *saddle/decor slot*
	 */
	val SaddleItem get() = GameValue<MinecraftItem>("Saddle Item")

	/**
	 * *The item form of the*
	 * *target.*
	 *
	 * **Type:** [MinecraftItem]
	 *
	 * *The entity item*
	 */
	val EntityItem get() = GameValue<MinecraftItem>("Entity Item")

}