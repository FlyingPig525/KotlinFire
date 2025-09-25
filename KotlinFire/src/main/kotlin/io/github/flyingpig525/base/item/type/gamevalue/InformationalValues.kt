package io.github.flyingpig525.base.item.type.gamevalue

import io.github.flyingpig525.base.item.type.*

object InformationalValues {
	/**
	 * *Gets a target's name.*
	 *
	 * **Type:** [TextItem]
	 *
	 * *Target name*
	 */
	val Name get() = GameValue<TextItem>("Name")

	/**
	 * *Gets a target's universally*
	 * *unique identifier.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Target UUID*
	 */
	val UUID get() = GameValue<StringItem>("UUID")

	/**
	 * *Gets a target's entity type.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Entity type, e.g.*
	 * *"tipped_arrow" or "cow"*
	 */
	val EntityType get() = GameValue<StringItem>("Entity Type")

	/**
	 * *Gets a player's game mode.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Game mode:*
	 * *"survival", "creative", "adventure",*
	 * *"spectator"*
	 */
	val GameMode get() = GameValue<StringItem>("Game Mode")

	/**
	 * *Gets the title of a target's*
	 * *opened inventory.*
	 *
	 * **Type:** [TextItem]
	 *
	 * *Inventory title, or*
	 * *"none" if either no menu*
	 * *or the player's regular*
	 * *inventory is open*
	 */
	val OpenInventoryTitle get() = GameValue<TextItem>("Open Inventory Title")

	/**
	 * *Gets a target's active*
	 * *potion effects.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one*
	 * *Potion Effect entry*
	 * *for each active*
	 * *effect on the target*
	 */
	val PotionEffects get() = GameValue<VarItem>("Potion Effects")

	/**
	 * *Gets the UUID of the entity*
	 * *that the target is riding.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *UUID of the ridden*
	 * *entity, or "none" if the*
	 * *target is not riding one*
	 *
	 * **Additional Info**
	 *
	 * *The ridden entity does not*
	 * *need to be of vehicular type.*
	 * *In a stack of entities, the*
	 * *vehicle is the bottom entity.*
	 */
	val Vehicle get() = GameValue<StringItem>("Vehicle")

	/**
	 * *Gets the UUIDs of any*
	 * *entities riding a target.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one String*
	 * *entry (UUID) for each*
	 * *passenger riding the target*
	 * *(Empty List if the target*
	 * *has no passengers)*
	 */
	val Passengers get() = GameValue<VarItem>("Passengers")

	/**
	 * *Gets the entity that is holding*
	 * *a target on a lead.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Lead holder UUID,*
	 * *or "none" if the target*
	 * *is not on a lead*
	 */
	val LeadHolder get() = GameValue<StringItem>("Lead Holder")

	/**
	 * *Gets all entities attached to*
	 * *to a target by a lead.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one String*
	 * *entry (UUID) for each*
	 * *leashed entity*
	 * *(Empty List if the target*
	 * *holds no leads)*
	 */
	val AttachedLeads get() = GameValue<VarItem>("Attached Leads")

	/**
	 * *Gets the UUID of the entity*
	 * *that the target is targeting.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *UUID of the targeted*
	 * *entity, or "none" if the*
	 * *target is not chasing one*
	 *
	 * **Additional Info**
	 *
	 * *The targeted entity is the*
	 * *entity the target is chasing.*
	 */
	val TargetedEntityUUID get() = GameValue<StringItem>("Targeted Entity UUID")

	/**
	 * *Gets the UUID of a projectile's*
	 * *shooter, or "none" if not set.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Shooter UUID*
	 */
	val ProjectileShooterUUID get() = GameValue<StringItem>("Projectile Shooter UUID")

	/**
	 * *Gets the translation of a*
	 * *display entity's transformation.*
	 *
	 * **Type:** [VecItem]
	 *
	 * *Translation*
	 */
	val DisplayEntityTranslation get() = GameValue<VecItem>("Display Entity Translation")

	/**
	 * *Gets the scale of a display*
	 * *entity's transformation.*
	 *
	 * **Type:** [VecItem]
	 *
	 * *Scale*
	 */
	val DisplayEntityScale get() = GameValue<VecItem>("Display Entity Scale")

	/**
	 * *Gets the target's pose.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Pose:*
	 * *"dying" (dead),*
	 * *"fall_flying" (gliding),*
	 * *"sleeping", "sneaking",*
	 * *"spin_attack" (riptiding with a trident),*
	 * *"standing" (standing normally),*
	 * *"swimming" (swimming/crawling)*
	 * *Camel Only:*
	 * *"sitting"*
	 * *Frog Only:*
	 * *"croaking", "long_jumping",*
	 * *"using_tongue"*
	 * *Warden Only:*
	 * *"digging", "emerging", "roaring", "sniffing"*
	 * *Breeze Only:*
	 * *"inhaling", "shooting", "sliding"*
	 */
	val Pose get() = GameValue<StringItem>("Pose")

	/**
	 * *Gets a player's weather type.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Weather:*
	 * *"clear", "downfall"*
	 */
	val WeatherType get() = GameValue<StringItem>("Weather Type")

	/**
	 * *Gets the item that would be created*
	 * *when a player middle clicks*
	 * *the target in Creative mode.*
	 *
	 * **Type:** [MinecraftItem]
	 *
	 * *Item or air*
	 */
	val PickEntityResult get() = GameValue<MinecraftItem>("Pick Entity Result")

	/**
	 * *Gets the target's Particles setting.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Particle Visibility Status:*
	 * *"all", "decreased", "minimal"*
	 */
	val ParticleVisibilityStatus get() = GameValue<StringItem>("Particle Visibility Status")

	/**
	 * *Gets a list of all movement*
	 * *keys that are currently*
	 * *pressed by a player.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one String*
	 * *value for each movement type:*
	 * *"forward", "backward", "left",*
	 * *"right", "jump", "sneak",*
	 * *"sprint"*
	 */
	val PressedMovementKeys get() = GameValue<VarItem>("Pressed Movement Keys")

}