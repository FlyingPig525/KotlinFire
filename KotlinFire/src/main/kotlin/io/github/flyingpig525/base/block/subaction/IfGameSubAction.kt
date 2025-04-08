package io.flyingpig525.base.block.subaction

enum class IfGameSubAction(codeblock: String) : SubAction(codeblock) {
	SignHasTxt("SignHasTxt"),
	HasRoomForItem("HasRoomForItem"),
	EventBlockEquals("EventBlockEquals"),
	CommandEquals("CommandEquals"),
	EventItemEquals("EventItemEquals"),
	SignHasTxt("SignHasTxt"),
	AttackIsCrit("AttackIsCrit"),
	ContainerHas("ContainerHas"),
	BlockEquals("BlockEquals"),
	InBlock("InBlock"),
	BlockPowered("BlockPowered"),
	HasPlayer("HasPlayer"),
	ContainerHasAll("ContainerHasAll"),
	CmdArgEquals("CmdArgEquals"),
	EventCancelled("EventCancelled"),
	IsChunkLoaded("IsChunkLoaded"),
}