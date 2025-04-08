package io.flyingpig525.base.block.subaction

import io.github.flyingpig525.base.block.subaction.SubAction

enum class IfEntitySubAction(override val codeblock: String) : SubAction {
	IsVehicle("IsVehicle"),
	IsGrounded("IsGrounded"),
	IsType("IsType"),
	IsProj("IsProj"),
	IsMob("IsMob"),
	HasCustomTag("HasCustomTag"),
	IsSheared("IsSheared"),
	IsItem("IsItem"),
	IsRiding("IsRiding"),
	Exists("Exists"),
	IsNear("IsNear"),
	HasPotion("HasPotion"),
	NameEquals("NameEquals"),
	StandingOn("StandingOn"),
}