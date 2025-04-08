package io.flyingpig525.base.block.subaction

import io.github.flyingpig525.base.block.subaction.SubAction

enum class IfGameSubAction(override val codeblock: String) : SubAction {
	SignHasTxt("SignHasTxt"),
	HasRoomForItem("HasRoomForItem"),
	EventBlockEquals("EventBlockEquals"),
	CommandEquals("CommandEquals"),
	EventItemEquals("EventItemEquals"),
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