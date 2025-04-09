package io.github.flyingpig525.base.block.subaction

import io.github.flyingpig525.base.block.subaction.SubAction

enum class IfVarSubAction(override val codeblock: String) : SubAction {
	LessThanOrEqual("<="),
	ItemHasEnchant("ItemHasEnchant"),
	ItemIsBlock("ItemIsBlock"),
	DictValueEquals("DictValueEquals"),
	ItemHasTag("ItemHasTag"),
	StringMatches(" TextMatches "),
	ListIsEmpty("ListIsEmpty"),
	StartsWith("StartsWith"),
	ListValueEq("ListValueEq"),
	VarIsType("VarIsType"),
	TextMatches("EqIgnoreCase"),
	IsNear("VIsNear"),
	InRange("InRange"),
	VarExists("VarExists"),
	LegacyNotEqual("Legacy !="),
	BlockIsSolid("BlockIsSolid"),
	ItemEquals("VItemEquals"),
	ListContains("ListContains"),
	LegacyEquals("Legacy ="),
	LocIsNear("LocIsNear"),
	Contains("Contains"),
	NotEqual("!="),
	LessThan("<"),
	EqualTo(" = "),
	GreaterThan(">"),
	EndsWith("EndsWith"),
	GreaterThanOrEqual(">="),
	DictHasKey("DictHasKey"),
}