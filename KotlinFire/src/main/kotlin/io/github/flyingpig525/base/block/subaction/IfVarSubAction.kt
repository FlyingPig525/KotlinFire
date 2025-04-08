package io.flyingpig525.base.block.subaction

import io.github.flyingpig525.base.block.subaction.SubAction

enum class IfVarSubAction(override val codeblock: String) : SubAction {
	LessThanOrEqual("<="),
	ItemHasEnchant("ItemHasEnchant"),
	ItemIsBlock("ItemIsBlock"),
	DictValueEquals("DictValueEquals"),
	ItemHasTag("ItemHasTag"),
	StringMatches("StringMatches"),
	ListIsEmpty("ListIsEmpty"),
	StartsWith("StartsWith"),
	ListValueEq("ListValueEq"),
	VarIsType("VarIsType"),
	TextMatches("TextMatches"),
	IsNear("IsNear"),
	VarExists("VarExists"),
	LegacyNotEqual("Legacy !="),
	BlockIsSolid("BlockIsSolid"),
	ItemEquals("ItemEquals"),
	ListContains("ListContains"),
	LegacyEquals("Legacy ="),
	InRange("InRange"),
	LocIsNear("LocIsNear"),
	Contains("Contains"),
	NotEqual("!="),
	LessThan("<"),
	EqualTo("="),
	GreaterThan(">"),
	EndsWith("EndsWith"),
	GreaterThanOrEqual(">="),
	DictHasKey("DictHasKey"),
}