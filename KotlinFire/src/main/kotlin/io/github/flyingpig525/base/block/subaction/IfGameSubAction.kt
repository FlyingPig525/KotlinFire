package io.github.flyingpig525.base.block.subaction

@Suppress("unused")
enum class IfGameSubAction(override val codeblock: String) : SubAction {
	SignHasTxt("SignHasTxt"),
	HasRoomForItem("HasRoomForItem"),
	EventBlockEquals("EventBlockEquals"),
	CommandEquals("CommandEquals"),
	EventItemEquals("EventItemEquals"),
	AttackIsCrit("AttackIsCrit"),
	ContainerHas("ContainerHas"),
	EventChunkNew("EventChunkNew"),
	BlockEquals("GBlockEquals"),
	InBlock("InBlock"),
	MovementKey("MovementKey"),
	BlockPowered("BlockPowered"),
	HasPlayer("HasPlayer"),
	ContainerHasAll("ContainerHasAll"),
	CmdArgEquals("CmdArgEquals"),
	EventCancelled("EventCancelled"),
	IsChunkLoaded("IsChunkLoaded"),
}