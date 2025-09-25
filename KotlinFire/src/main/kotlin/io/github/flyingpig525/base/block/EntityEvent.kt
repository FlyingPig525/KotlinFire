package io.github.flyingpig525.base.block

enum class EntityEvent(val type: EventBlock.Type, val event: String) {
	/**
	 * Entity Kill Entity Event
	 *
	 * **Description:**
	 *
	 * *Executes code when an entity*
	 * *kills another entity.*
	 */
	EntityKillEntity(EventBlock.Type.EntityEvent, "EntityKillEntity"),

	/**
	 * Entity Combust Event
	 *
	 * **Description:**
	 *
	 * *Executes code when an*
	 * *entity catches on fire.*
	 */
	EntityCombust(EventBlock.Type.EntityEvent, "EntityCombust"),

	/**
	 * Block Fall Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a block*
	 * *affected by gravity turns*
	 * *into a falling block.*
	 */
	BlockFall(EventBlock.Type.EntityEvent, "BlockFall"),

	/**
	 * Projectile Kill Entity Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *projectile kills an entity.*
	 */
	ProjKillEntity(EventBlock.Type.EntityEvent, "ProjKillEntity"),

	/**
	 * Entity Damage Entity Event
	 *
	 * **Description:**
	 *
	 * *Executes code when an entity*
	 * *damages another entity.*
	 */
	EntityDmgEntity(EventBlock.Type.EntityEvent, "EntityDmgEntity"),

	/**
	 * Falling Block Land Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a falling*
	 * *block lands on the ground.*
	 */
	FallingBlockLand(EventBlock.Type.EntityEvent, "FallingBlockLand"),

	/**
	 * Entity Resurrect Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *an entity resurrects with*
	 * *a totem of undying.*
	 */
	EntityResurrect(EventBlock.Type.EntityEvent, "EntityResurrect"),

	/**
	 * Item Merge Event
	 *
	 * **Description:**
	 *
	 * *Executes code when dropped items*
	 * *try to merge into a stack.*
	 */
	ItemMerge(EventBlock.Type.EntityEvent, "ItemMerge"),

	/**
	 * Entity Heal Event
	 *
	 * **Description:**
	 *
	 * *Executes code when an*
	 * *entity regains health.*
	 */
	EntityHeal(EventBlock.Type.EntityEvent, "EntityHeal"),

	/**
	 * Entity Teleport Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *an entity is teleported.*
	 */
	Teleport(EventBlock.Type.EntityEvent, "Teleport"),

	/**
	 * Entity Shoot Bow Event
	 *
	 * **Description:**
	 *
	 * *Executes code when an*
	 * *entity shoots a bow.*
	 */
	ShootBow(EventBlock.Type.EntityEvent, "ShootBow"),

	/**
	 * Entity Take Damage Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *an entity takes damage.*
	 */
	EntityDmg(EventBlock.Type.EntityEvent, "EntityDmg"),

	/**
	 * Projectile Damage Entity Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a projectile*
	 * *damages an entity.*
	 */
	ProjDmgEntity(EventBlock.Type.EntityEvent, "ProjDmgEntity"),

	/**
	 * Entity Explode Event
	 *
	 * **Description:**
	 *
	 * *Executes code when an*
	 * *entity explodes.*
	 */
	EntityExplode(EventBlock.Type.EntityEvent, "EntityExplode"),

	/**
	 * Entity Death Event
	 *
	 * **Description:**
	 *
	 * *Executes code when an entity*
	 * *dies by natural causes.*
	 */
	EntityDeath(EventBlock.Type.EntityEvent, "EntityDeath"),

	/**
	 * Vehicle Take Damage Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a vehicle*
	 * *entity (minecart or boat) is*
	 * *damaged.*
	 */
	VehicleDamage(EventBlock.Type.EntityEvent, "VehicleDamage"),

	/**
	 * Entity Transform Event
	 *
	 * **Description:**
	 *
	 * *Executes code when an*
	 * *entity turns into another or*
	 * *group of others for any reason.*
	 */
	Transform(EventBlock.Type.EntityEvent, "Transform"),

	/**
	 * Sheep Regrow Wool Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a sheep*
	 * *regrows its wool.*
	 */
	RegrowWool(EventBlock.Type.EntityEvent, "RegrowWool"),
}