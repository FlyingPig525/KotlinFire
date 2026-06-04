package io.github.flyingpig525.base.block

@Suppress("unused")
enum class GameEvent(val type: EventBlock.Type, val event: String) {
	/**
	 * Cauldron Change Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a cauldron's*
	 * *level or contents changes.*
	 */
	CauldronChange(EventBlock.Type.GameEvent, "CauldronChange"),

	/**
	 * Furnace Burn Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *furnace consumes fuel.*
	 */
	FurnaceBurn(EventBlock.Type.GameEvent, "FurnaceBurn"),

	/**
	 * Leaves Decay Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *leaves decay.*
	 */
	LeavesDecay(EventBlock.Type.GameEvent, "LeavesDecay"),

	/**
	 * Block Ignite Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a block ignites.*
	 */
	BlockIgnite(EventBlock.Type.GameEvent, "BlockIgnite"),

	/**
	 * Crafter Craft Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *crafter crafts an item.*
	 */
	CrafterCraft(EventBlock.Type.GameEvent, "CrafterCraft"),

	/**
	 * Chunk Load Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a chunk is loaded.*
	 */
	ChunkLoad(EventBlock.Type.GameEvent, "ChunkLoad"),

	/**
	 * Block Grow Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *block grows naturally.*
	 */
	BlockGrow(EventBlock.Type.GameEvent, "BlockGrow"),

	/**
	 * Beacon Activated Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *beacon is activated.*
	 */
	BeaconActivated(EventBlock.Type.GameEvent, "BeaconActivated"),

	/**
	 * Block Explode Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *block explodes.*
	 */
	BlockExplode(EventBlock.Type.GameEvent, "BlockExplode"),

	/**
	 * Block Dispense Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *block dispenses an item.*
	 */
	BlockDispense(EventBlock.Type.GameEvent, "BlockDispense"),

	/**
	 * Piston Retract Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a piston retracts.*
	 */
	PistonRetract(EventBlock.Type.GameEvent, "PistonRetract"),

	/**
	 * Vault Display Item Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *vault displays an item.*
	 */
	VaultDisplayItem(EventBlock.Type.GameEvent, "VaultDisplayItem"),

	/**
	 * Fluid Level Change
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *liquid's level changes.*
	 */
	FluidLevelChange(EventBlock.Type.GameEvent, "FluidLevelChange"),

	/**
	 * Block Fertilize Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a block is fertilized.*
	 */
	BlockFertilize(EventBlock.Type.GameEvent, "BlockFertilize"),

	/**
	 * Sponge Absorb Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *sponge absorbs water.*
	 */
	SpongeAbsorb(EventBlock.Type.GameEvent, "SpongeAbsorb"),

	/**
	 * Piston Extend Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a piston extends.*
	 */
	PistonExtend(EventBlock.Type.GameEvent, "PistonExtend"),

	/**
	 * Sculk Bloom Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *sculk catalyst blooms.*
	 */
	SculkBloom(EventBlock.Type.GameEvent, "SculkBloom"),

	/**
	 * Block Fade Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a block fades.*
	 */
	BlockFade(EventBlock.Type.GameEvent, "BlockFade"),

	/**
	 * Vault Change State Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *vault changes its state.*
	 */
	VaultChangeState(EventBlock.Type.GameEvent, "VaultChangeState"),

	/**
	 * Campfire Start Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *campfire starts cooking.*
	 */
	CampfireStart(EventBlock.Type.GameEvent, "CampfireStart"),

	/**
	 * Plot Shutdown Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a plot no longer*
	 * *has players and is shutting down.*
	 */
	PlotShutdown(EventBlock.Type.GameEvent, "PlotShutdown"),

	/**
	 * Chunk Unload Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a chunk is unloaded.*
	 */
	ChunkUnload(EventBlock.Type.GameEvent, "ChunkUnload"),

	/**
	 * Block Spread Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *block spreads.*
	 */
	BlockSpread(EventBlock.Type.GameEvent, "BlockSpread"),

	/**
	 * Note Block Play Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *note block plays a note.*
	 */
	NotePlay(EventBlock.Type.GameEvent, "NotePlay"),

	/**
	 * Redstone Power Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *redstone current changes.*
	 */
	Redstone(EventBlock.Type.GameEvent, "Redstone"),

	/**
	 * Block Move Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a block moves.*
	 */
	BlockMove(EventBlock.Type.GameEvent, "BlockMove"),

	/**
	 * Moisture Change Event
	 *
	 * **Description:**
	 *
	 * *Executes code when soil*
	 * *moisture changes.*
	 */
	MoistureChange(EventBlock.Type.GameEvent, "MoistureChange"),

	/**
	 * Bell Ring Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *a bell is rung.*
	 */
	BellRing(EventBlock.Type.GameEvent, "BellRing"),

	/**
	 * Plot LagSlayer Recover Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a plot recovers*
	 * *from a LagSlayer halt.*
	 */
	LagSlayRecover(EventBlock.Type.GameEvent, "LagSlayRecover"),

	/**
	 * Block Burn Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *block is destroyed by fire.*
	 */
	BlockBurn(EventBlock.Type.GameEvent, "BlockBurn"),

	/**
	 * Plot Startup Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a plot is*
	 * *first started.*
	 */
	PlotStartup(EventBlock.Type.GameEvent, "PlotStartup"),

	/**
	 * TNT Prime Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *TNT is ignited.*
	 */
	TNTPrime(EventBlock.Type.GameEvent, "TNTPrime"),

	/**
	 * Block Form Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a block*
	 * *is formed, typically through*
	 * *natural means.*
	 */
	BlockForm(EventBlock.Type.GameEvent, "BlockForm"),

	/**
	 * Brew Event
	 *
	 * **Description:**
	 *
	 * *Executes code when*
	 * *brewing completes.*
	 */
	Brew(EventBlock.Type.GameEvent, "Brew"),

	/**
	 * Block Cook Event
	 *
	 * **Description:**
	 *
	 * *Executes code when a*
	 * *block cooks an item.*
	 */
	BlockCook(EventBlock.Type.GameEvent, "BlockCook"),
}