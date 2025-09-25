package io.github.flyingpig525.base.block

enum class PlayerEvent(val type: EventBlock.Type, val event: String) {
	/**
	 * Player Click Container Slot Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *clicks a slot in a container.*
	 */
	ClickContainerSlot(EventBlock.Type.PlayerEvent, "ClickContainerSlot"),

	/**
	 * Player Close Inventory Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player closes an inventory.*
	 */
	CloseInv(EventBlock.Type.PlayerEvent, "CloseInv"),

	/**
	 * Player Start Flight Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player starts flying.*
	 */
	StartFly(EventBlock.Type.PlayerEvent, "StartFly"),

	/**
	 * Player Break Block Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player breaks a block.*
	 */
	BreakBlock(EventBlock.Type.PlayerEvent, "BreakBlock"),

	/**
	 * Player Start Sprint Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player starts sprinting.*
	 */
	StartSprint(EventBlock.Type.PlayerEvent, "StartSprint"),

	/**
	 * Mob Kill Player Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a mob kills a player.*
	 */
	MobKillPlayer(EventBlock.Type.PlayerEvent, "MobKillPlayer"),

	/**
	 * Player Teleport Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a player is teleported.*
	 */
	Teleport(EventBlock.Type.PlayerEvent, "Teleport"),

	/**
	 * Player Shoot Bow Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *fires an arrow with a bow.*
	 */
	ShootBow(EventBlock.Type.PlayerEvent, "ShootBow"),

	/**
	 * Player Change Sign Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player changes a sign.*
	 */
	ChangeSign(EventBlock.Type.PlayerEvent, "ChangeSign"),

	/**
	 * Player Stop Flight Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player stops flying.*
	 */
	StopFly(EventBlock.Type.PlayerEvent, "StopFly"),

	/**
	 * Player Tame Mob Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *tames a mob.*
	 */
	TameEntity(EventBlock.Type.PlayerEvent, "TameEntity"),

	/**
	 * Player Left Click Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *left clicks.*
	 */
	LeftClick(EventBlock.Type.PlayerEvent, "LeftClick"),

	/**
	 * Player Take Damage Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player takes damage.*
	 */
	PlayerTakeDmg(EventBlock.Type.PlayerEvent, "PlayerTakeDmg"),

	/**
	 * Player Projectile Hit Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a projectile*
	 * *launched by a player hits a block,*
	 * *an entity, or another player.*
	 */
	ProjHit(EventBlock.Type.PlayerEvent, "ProjHit"),

	/**
	 * Player Kill Player Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *kills another player.*
	 */
	KillPlayer(EventBlock.Type.PlayerEvent, "KillPlayer"),

	/**
	 * Player Vehicle Jump Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player presses the jump key*
	 * *while riding a vehicle*
	 * *or other entity.*
	 */
	VehicleJump(EventBlock.Type.PlayerEvent, "VehicleJump"),

	/**
	 * Player Click Inventory Slot Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player clicks*
	 * *a slot inside their inventory.*
	 */
	ClickInvSlot(EventBlock.Type.PlayerEvent, "ClickInvSlot"),

	/**
	 * Player Respawn Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a player respawns.*
	 */
	Respawn(EventBlock.Type.PlayerEvent, "Respawn"),

	/**
	 * Player Swap Hands Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *swaps an item or items between*
	 * *their main hand and off hand.*
	 */
	SwapHands(EventBlock.Type.PlayerEvent, "SwapHands"),

	/**
	 * Resource Pack Load
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player finishes loading a*
	 * *plot resource pack.*
	 */
	PackLoad(EventBlock.Type.PlayerEvent, "PackLoad"),

	/**
	 * Player Damage Entity Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player damages an entity.*
	 */
	DamageEntity(EventBlock.Type.PlayerEvent, "DamageEntity"),

	/**
	 * Player Sneak Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a player sneaks.*
	 */
	Sneak(EventBlock.Type.PlayerEvent, "Sneak"),

	/**
	 * Player Heal Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *regains health from any*
	 * *source.*
	 */
	PlayerHeal(EventBlock.Type.PlayerEvent, "PlayerHeal"),

	/**
	 * Player Right Click Player Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *right clicks another player.*
	 */
	ClickPlayer(EventBlock.Type.PlayerEvent, "ClickPlayer"),

	/**
	 * Player Consume Item Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *eats or drinks an item.*
	 */
	Consume(EventBlock.Type.PlayerEvent, "Consume"),

	/**
	 * Player Start Glide Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player starts gliding.*
	 */
	StartGlide(EventBlock.Type.PlayerEvent, "StartGlide"),

	/**
	 * Player Movement Key Change Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *presses or releases movement*
	 * *keys.*
	 */
	MovementKey(EventBlock.Type.PlayerEvent, "MovementKey"),

	/**
	 * Player Death Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *dies, not as a result of another*
	 * *player or entity.*
	 */
	Death(EventBlock.Type.PlayerEvent, "Death"),

	/**
	 * Player Place Block Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player places a block.*
	 */
	PlaceBlock(EventBlock.Type.PlayerEvent, "PlaceBlock"),

	/**
	 * Player Walk Event
	 *
	 * **Description:**
	 *
	 * *Executes code while*
	 * *a player is walking.*
	 */
	Walk(EventBlock.Type.PlayerEvent, "Walk"),

	/**
	 * Player Pick Up Item Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player picks up an item.*
	 */
	PickUpItem(EventBlock.Type.PlayerEvent, "PickUpItem"),

	/**
	 * Player Dismount Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player dismounts a vehicle*
	 * *or other entity.*
	 */
	Dismount(EventBlock.Type.PlayerEvent, "Dismount"),

	/**
	 * Potion Cloud Imbue Player Event
	 *
	 * **Description:**
	 *
	 * *Executes code when an area of*
	 * *effect cloud applies its potion*
	 * *effect(s) to a player.*
	 */
	CloudImbuePlayer(EventBlock.Type.PlayerEvent, "CloudImbuePlayer"),

	/**
	 * Player Leave Game Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player leaves the plot.*
	 */
	Leave(EventBlock.Type.PlayerEvent, "Leave"),

	/**
	 * Player Drop Item Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player drops an item.*
	 */
	DropItem(EventBlock.Type.PlayerEvent, "DropItem"),

	/**
	 * Player Left Click Player Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *left clicks another player.*
	 */
	LeftClickPlayer(EventBlock.Type.PlayerEvent, "LeftClickPlayer"),

	/**
	 * Player Change Slot Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *changes their hotbar slot.*
	 */
	ChangeSlot(EventBlock.Type.PlayerEvent, "ChangeSlot"),

	/**
	 * Player Right Click Entity Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *right clicks an entity.*
	 */
	ClickEntity(EventBlock.Type.PlayerEvent, "ClickEntity"),

	/**
	 * Player Pick Entity Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *uses their Pick Block*
	 * *key bind on an entity.*
	 */
	PickEntity(EventBlock.Type.PlayerEvent, "PickEntity"),

	/**
	 * Player Horse Jump Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *causes a horse to jump.*
	 */
	HorseJump(EventBlock.Type.PlayerEvent, "HorseJump"),

	/**
	 * Player Shoot Projectile Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *throws a projectile such*
	 * *as snowballs or eggs.*
	 */
	ShootProjectile(EventBlock.Type.PlayerEvent, "ShootProjectile"),

	/**
	 * Player Move Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a player moves.*
	 */
	Move(EventBlock.Type.PlayerEvent, "Move"),

	/**
	 * Player Unsneak Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player stops sneaking.*
	 */
	Unsneak(EventBlock.Type.PlayerEvent, "Unsneak"),

	/**
	 * Player Combust Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player catches on fire.*
	 */
	PlayerCombust(EventBlock.Type.PlayerEvent, "PlayerCombust"),

	/**
	 * Player Chat Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player sends a chat*
	 * *message.*
	 */
	Chat(EventBlock.Type.PlayerEvent, "Chat"),

	/**
	 * Player Fish Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *fishes an entity,*
	 * *player, or nothing.*
	 */
	Fish(EventBlock.Type.PlayerEvent, "Fish"),

	/**
	 * 
	 *
	 * **Description:**
	 *
	 */
	FallDamage(EventBlock.Type.PlayerEvent, "FallDamage"),

	/**
	 * Player Break Item Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player breaks an item.*
	 */
	BreakItem(EventBlock.Type.PlayerEvent, "BreakItem"),

	/**
	 * 
	 *
	 * **Description:**
	 *
	 */
	LoopEvent(EventBlock.Type.PlayerEvent, "LoopEvent"),

	/**
	 * Player Resurrect Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a player resurrects with*
	 * *a totem of undying.*
	 */
	PlayerResurrect(EventBlock.Type.PlayerEvent, "PlayerResurrect"),

	/**
	 * Player Right Click Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *right clicks while looking at a*
	 * *block or holding an item.*
	 */
	RightClick(EventBlock.Type.PlayerEvent, "RightClick"),

	/**
	 * Purchase Product
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *purchases a plot product.*
	 */
	Purchase(EventBlock.Type.PlayerEvent, "Purchase"),

	/**
	 * Player Click Menu Slot Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *clicks a slot in an inventory*
	 * *menu.*
	 */
	ClickMenuSlot(EventBlock.Type.PlayerEvent, "ClickMenuSlot"),

	/**
	 * Player Riptide Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *throws a riptide trident.*
	 */
	Riptide(EventBlock.Type.PlayerEvent, "Riptide"),

	/**
	 * Player Stop Glide Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player stops gliding.*
	 */
	StopGlide(EventBlock.Type.PlayerEvent, "StopGlide"),

	/**
	 * Player Kill Mob Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a player kills a mob.*
	 */
	KillMob(EventBlock.Type.PlayerEvent, "KillMob"),

	/**
	 * Player Join Game Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player joins the plot.*
	 */
	Join(EventBlock.Type.PlayerEvent, "Join"),

	/**
	 * Entity Damage Player Event
	 *
	 * **Description:**
	 *
	 * *Executes code when an*
	 * *entity damages a player.*
	 */
	EntityDmgPlayer(EventBlock.Type.PlayerEvent, "EntityDmgPlayer"),

	/**
	 * Player Stop Sprinting Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player stops sprinting.*
	 */
	StopSprint(EventBlock.Type.PlayerEvent, "StopSprint"),

	/**
	 * Player Jump Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player jumps.*
	 */
	Jump(EventBlock.Type.PlayerEvent, "Jump"),

	/**
	 * Player Load Crossbow Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *loads a crossbow.*
	 */
	LoadCrossbow(EventBlock.Type.PlayerEvent, "LoadCrossbow"),

	/**
	 * Projectile Damage Player Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a projectile*
	 * *damages a player.*
	 */
	ProjDmgPlayer(EventBlock.Type.PlayerEvent, "ProjDmgPlayer"),

	/**
	 * Player Command Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *types a command on the plot.*
	 */
	Command(EventBlock.Type.PlayerEvent, "Command"),

	/**
	 * Player Left Click Entity Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *left clicks an entity.*
	 */
	LeftClickEntity(EventBlock.Type.PlayerEvent, "LeftClickEntity"),

	/**
	 * Player Exhaustion Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player gains exhaustion.*
	 */
	Exhaustion(EventBlock.Type.PlayerEvent, "Exhaustion"),

	/**
	 * Resource Pack Decline
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *player declines a plot*
	 * *resource pack prompt.*
	 */
	PackDecline(EventBlock.Type.PlayerEvent, "PackDecline"),

	/**
	 * Player Pick Block Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *uses their Pick Block*
	 * *key bind on a block.*
	 */
	PickBlock(EventBlock.Type.PlayerEvent, "PickBlock"),

	/**
	 * Player Damage Player Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a player*
	 * *damages another player.*
	 */
	PlayerDmgPlayer(EventBlock.Type.PlayerEvent, "PlayerDmgPlayer"),
}