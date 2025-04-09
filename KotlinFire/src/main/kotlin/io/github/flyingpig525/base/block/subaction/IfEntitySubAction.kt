package io.github.flyingpig525.base.block.subaction

import io.github.flyingpig525.base.block.subaction.SubAction

enum class IfEntitySubAction(override val codeblock: String) : SubAction {
	IsVehicle("IsVehicle"),
	IsGrounded("EIsGrounded"),
	IsType("IsType"),
	IsProj("IsProj"),
	IsMob("IsMob"),
	HasCustomTag("HasCustomTag"),
	IsSheared("IsSheared"),
	IsItem("IsItem"),
	IsRiding("IsRiding"),
	Exists("Exists"),
	IsNear("EIsNear"),
	HasPotion("HasPotion"),
	StandingOn("EStandingOn"),
	NameEquals("ENameEquals"),
}