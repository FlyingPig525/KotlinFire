package io.flyingpig525.base.block.subaction

enum class IfEntitySubAction(codeblock: String) : SubAction(codeblock) {
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
	IsRiding("IsRiding"),
	StandingOn("StandingOn"),
	NameEquals("NameEquals"),
	StandingOn("StandingOn"),
}