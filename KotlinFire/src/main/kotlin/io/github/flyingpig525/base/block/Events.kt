@file:Suppress("UNUSED")
package io.github.flyingpig525.base.block

enum class PLAYEREVENT(val type: EventBlock.Type, val event: String) {
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player closes an inventory.
	 */
	CloseInv(EventBlock.Type.PLAYEREVENT, "CloseInv"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player starts flying.
	 */
	StartFly(EventBlock.Type.PLAYEREVENT, "StartFly"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player breaks a block.
	 */
	BreakBlock(EventBlock.Type.PLAYEREVENT, "BreakBlock"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player starts sprinting.
	 */
	StartSprint(EventBlock.Type.PLAYEREVENT, "StartSprint"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when
	 * a mob kills a player.
	 */
	MobKillPlayer(EventBlock.Type.PLAYEREVENT, "MobKillPlayer"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when
	 * a player is teleported.
	 */
	Teleport(EventBlock.Type.PLAYEREVENT, "Teleport"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * fires an arrow with a bow.
	 */
	ShootBow(EventBlock.Type.PLAYEREVENT, "ShootBow"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player stops flying.
	 */
	StopFly(EventBlock.Type.PLAYEREVENT, "StopFly"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * tames a mob.
	 */
	TameEntity(EventBlock.Type.PLAYEREVENT, "TameEntity"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * left clicks.
	 */
	LeftClick(EventBlock.Type.PLAYEREVENT, "LeftClick"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player takes damage.
	 */
	PlayerTakeDmg(EventBlock.Type.PLAYEREVENT, "PlayerTakeDmg"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a projectile
	 * launched by a player hits a block,
	 * an entity, or another player.
	 */
	ProjHit(EventBlock.Type.PLAYEREVENT, "ProjHit"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * kills another player.
	 */
	KillPlayer(EventBlock.Type.PLAYEREVENT, "KillPlayer"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player presses the jump key
	 * while riding a vehicle
	 * or other entity.
	 */
	VehicleJump(EventBlock.Type.PLAYEREVENT, "VehicleJump"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player clicks
	 * a slot inside their inventory.
	 */
	ClickInvSlot(EventBlock.Type.PLAYEREVENT, "ClickInvSlot"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when
	 * a player respawns.
	 */
	Respawn(EventBlock.Type.PLAYEREVENT, "Respawn"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * swaps an item or items between
	 * their main hand and off hand.
	 */
	SwapHands(EventBlock.Type.PLAYEREVENT, "SwapHands"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player finishes loading a
	 * plot resource pack.
	 */
	PackLoad(EventBlock.Type.PLAYEREVENT, "PackLoad"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player damages an entity.
	 */
	DamageEntity(EventBlock.Type.PLAYEREVENT, "DamageEntity"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when
	 * a player sneaks.
	 */
	Sneak(EventBlock.Type.PLAYEREVENT, "Sneak"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * regains health from any
	 * source.
	 */
	PlayerHeal(EventBlock.Type.PLAYEREVENT, "PlayerHeal"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * clicks another player.
	 */
	ClickPlayer(EventBlock.Type.PLAYEREVENT, "ClickPlayer"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * eats or drinks an item.
	 */
	Consume(EventBlock.Type.PLAYEREVENT, "Consume"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * dies, not as a result of another
	 * player or entity.
	 */
	Death(EventBlock.Type.PLAYEREVENT, "Death"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player places a block.
	 */
	PlaceBlock(EventBlock.Type.PLAYEREVENT, "PlaceBlock"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code while
	 * a player is walking.
	 */
	Walk(EventBlock.Type.PLAYEREVENT, "Walk"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player picks up an item.
	 */
	PickUpItem(EventBlock.Type.PLAYEREVENT, "PickUpItem"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player dismounts a vehicle
	 * or other entity.
	 */
	Dismount(EventBlock.Type.PLAYEREVENT, "Dismount"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when an area of
	 * effect cloud applies its potion
	 * effect(s) to a player.
	 */
	CloudImbuePlayer(EventBlock.Type.PLAYEREVENT, "CloudImbuePlayer"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player leaves the plot.
	 */
	Leave(EventBlock.Type.PLAYEREVENT, "Leave"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player drops an item.
	 */
	DropItem(EventBlock.Type.PLAYEREVENT, "DropItem"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * changes their hotbar slot.
	 */
	ChangeSlot(EventBlock.Type.PLAYEREVENT, "ChangeSlot"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * right clicks an entity.
	 */
	ClickEntity(EventBlock.Type.PLAYEREVENT, "ClickEntity"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * causes a horse to jump.
	 */
	HorseJump(EventBlock.Type.PLAYEREVENT, "HorseJump"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * throws a projectile such
	 * as snowballs or eggs.
	 */
	ShootProjectile(EventBlock.Type.PLAYEREVENT, "ShootProjectile"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when
	 * a player moves.
	 */
	Move(EventBlock.Type.PLAYEREVENT, "Move"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player stops sneaking.
	 */
	Unsneak(EventBlock.Type.PLAYEREVENT, "Unsneak"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * fishes an entity,
	 * player, or nothing.
	 */
	Fish(EventBlock.Type.PLAYEREVENT, "Fish"),
	/**
	 * DESCRIPTION:
	 *
	 */
	FallDamage(EventBlock.Type.PLAYEREVENT, "FallDamage"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player breaks an item.
	 */
	BreakItem(EventBlock.Type.PLAYEREVENT, "BreakItem"),
	/**
	 * DESCRIPTION:
	 *
	 */
	LoopEvent(EventBlock.Type.PLAYEREVENT, "LoopEvent"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when
	 * a player resurrects with
	 * a totem of undying.
	 */
	PlayerResurrect(EventBlock.Type.PLAYEREVENT, "PlayerResurrect"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * right clicks while looking at a
	 * block or holding an item.
	 */
	RightClick(EventBlock.Type.PLAYEREVENT, "RightClick"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * clicks a slot in an inventory
	 * menu.
	 */
	ClickMenuSlot(EventBlock.Type.PLAYEREVENT, "ClickMenuSlot"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * throws a riptide trident.
	 */
	Riptide(EventBlock.Type.PLAYEREVENT, "Riptide"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when
	 * a player kills a mob.
	 */
	KillMob(EventBlock.Type.PLAYEREVENT, "KillMob"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player joins the plot.
	 */
	Join(EventBlock.Type.PLAYEREVENT, "Join"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when an
	 * entity damages a player.
	 */
	EntityDmgPlayer(EventBlock.Type.PLAYEREVENT, "EntityDmgPlayer"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player stops sprinting.
	 */
	StopSprint(EventBlock.Type.PLAYEREVENT, "StopSprint"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player jumps.
	 */
	Jump(EventBlock.Type.PLAYEREVENT, "Jump"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * loads a crossbow.
	 */
	LoadCrossbow(EventBlock.Type.PLAYEREVENT, "LoadCrossbow"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a projectile
	 * damages a player.
	 */
	ProjDmgPlayer(EventBlock.Type.PLAYEREVENT, "ProjDmgPlayer"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * types a command on the plot.
	 */
	Command(EventBlock.Type.PLAYEREVENT, "Command"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * player declines a plot
	 * resource pack prompt.
	 */
	PackDecline(EventBlock.Type.PLAYEREVENT, "PackDecline"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a player
	 * damages another player.
	 */
	PlayerDmgPlayer(EventBlock.Type.PLAYEREVENT, "PlayerDmgPlayer"),

}
enum class ENTITYEVENT(val type: EventBlock.Type, val event: String) {
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when an entity
	 * kills another entity.
	 */
	EntityKillEntity(EventBlock.Type.ENTITYEVENT, "EntityKillEntity"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a block
	 * affected by gravity turns
	 * into a falling block.
	 */
	BlockFall(EventBlock.Type.ENTITYEVENT, "BlockFall"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when
	 * an entity takes damage.
	 */
	EntityDmg(EventBlock.Type.ENTITYEVENT, "EntityDmg"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a projectile
	 * damages an entity.
	 */
	ProjDmgEntity(EventBlock.Type.ENTITYEVENT, "ProjDmgEntity"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a
	 * projectile kills an entity.
	 */
	ProjKillEntity(EventBlock.Type.ENTITYEVENT, "ProjKillEntity"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when an
	 * entity explodes.
	 */
	EntityExplode(EventBlock.Type.ENTITYEVENT, "EntityExplode"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when an entity
	 * dies by natural causes.
	 */
	EntityDeath(EventBlock.Type.ENTITYEVENT, "EntityDeath"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a vehicle
	 * entity (minecart or boat) is
	 * damaged.
	 */
	VehicleDamage(EventBlock.Type.ENTITYEVENT, "VehicleDamage"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when an entity
	 * damages another entity.
	 */
	EntityDmgEntity(EventBlock.Type.ENTITYEVENT, "EntityDmgEntity"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a falling
	 * block lands on the ground.
	 */
	FallingBlockLand(EventBlock.Type.ENTITYEVENT, "FallingBlockLand"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when
	 * an entity resurrects with
	 * a totem of undying.
	 */
	EntityResurrect(EventBlock.Type.ENTITYEVENT, "EntityResurrect"),
	/**
	 * DESCRIPTION:
	 *
	 * Executes code when a sheep
	 * regrows its wool.
	 */
	RegrowWool(EventBlock.Type.ENTITYEVENT, "RegrowWool"),

}
