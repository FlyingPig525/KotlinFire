package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object SetVariableTags {
	object String {
		enum class TextValueMerging(override val option: kotlin.String, override val default: Boolean) : TagItem {
			AddSpaces("Add spaces", false),
			/** **Default** */
			NoSpaces("No spaces", true);

			override val action: kotlin.String = "String"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
	}

	object PurgeVars {
		enum class MatchRequirement(override val option: kotlin.String, override val default: Boolean) : TagItem {
			EntireName("Entire name", false),
			/** **Default** */
			FullWordSInName("Full word(s) in name", true),
			AnyPartOfName("Any part of name", false);

			override val action: kotlin.String = "PurgeVars"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Match Requirement"
		}
		enum class IgnoreCase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "PurgeVars"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object RemoveItemAttrs {
		enum class Slot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			All("All", true),
			MainHand("Main hand", false),
			OffHand("Off hand", false),
			Head("Head", false),
			Body("Body", false),
			Legs("Legs", false),
			Feet("Feet", false);

			override val action: kotlin.String = "RemoveItemAttrs"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Slot"
		}
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			All("All", true),
			Armor("Armor", false),
			ArmorToughness("Armor toughness", false),
			AttackDamage("Attack damage", false),
			AttackKnockback("Attack knockback", false),
			AttackSpeed("Attack speed", false),
			BurningTime("Burning time", false),
			ExplosionKnockbackResistance("Explosion knockback resistance", false),
			FallDamageMultiplier("Fall damage multiplier", false),
			FlyingSpeed("Flying speed", false),
			FollowRange("Follow range", false),
			Gravity("Gravity", false),
			JumpStrength("Jump strength", false),
			KnockbackResistance("Knockback resistance", false),
			Luck("Luck", false),
			MaximumAbsorptionHealth("Maximum absorption health", false),
			MaximumHealth("Maximum health", false),
			MovementEfficiency("Movement efficiency", false),
			WalkingSpeed("Walking speed", false),
			OxygenBonus("Oxygen bonus", false),
			SafeFallDistance("Safe fall distance", false),
			Scale("Scale", false),
			StepHeight("Step height", false),
			WaterMovementEfficiency("Water movement efficiency", false),
			TemptRange("Tempt range", false),
			BlockBreakSpeed("Block break speed", false),
			BlockInteractionRange("Block interaction range", false),
			EntityInteractionRange("Entity interaction range", false),
			MiningEfficiency("Mining efficiency", false),
			SneakingSpeed("Sneaking speed", false),
			SubmergedMiningSpeed("Submerged mining speed", false),
			SweepingDamageRatio("Sweeping damage ratio", false),
			ZombieSpawnReinforcements("Zombie spawn reinforcements", false);

			override val action: kotlin.String = "RemoveItemAttrs"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
	}

	object Mod {
		enum class RemainderMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Remainder("Remainder", true),
			Modulo("Modulo", false);

			override val action: kotlin.String = "%"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Remainder Mode"
		}
	}

	object ShiftOnVector {
		enum class AddLocationRotation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "ShiftOnVector"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add Location Rotation"
		}
	}

	object GetItemAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Armor("Armor", true),
			ArmorToughness("Armor toughness", false),
			AttackDamage("Attack damage", false),
			AttackKnockback("Attack knockback", false),
			AttackSpeed("Attack speed", false),
			BurningTime("Burning time", false),
			ExplosionKnockbackResistance("Explosion knockback resistance", false),
			FallDamageMultiplier("Fall damage multiplier", false),
			FlyingSpeed("Flying speed", false),
			FollowRange("Follow range", false),
			Gravity("Gravity", false),
			JumpStrength("Jump strength", false),
			KnockbackResistance("Knockback resistance", false),
			Luck("Luck", false),
			MaximumAbsorptionHealth("Maximum absorption health", false),
			MaximumHealth("Maximum health", false),
			MovementEfficiency("Movement efficiency", false),
			WalkingSpeed("Walking speed", false),
			OxygenBonus("Oxygen bonus", false),
			SafeFallDistance("Safe fall distance", false),
			Scale("Scale", false),
			StepHeight("Step height", false),
			WaterMovementEfficiency("Water movement efficiency", false),
			TemptRange("Tempt range", false),
			BlockBreakSpeed("Block break speed", false),
			BlockInteractionRange("Block interaction range", false),
			EntityInteractionRange("Entity interaction range", false),
			MiningEfficiency("Mining efficiency", false),
			SneakingSpeed("Sneaking speed", false),
			SubmergedMiningSpeed("Submerged mining speed", false),
			SweepingDamageRatio("Sweeping damage ratio", false),
			ZombieSpawnReinforcements("Zombie spawn reinforcements", false);

			override val action: kotlin.String = "GetItemAttribute"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ActiveEquipmentSlot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Any("Any", true),
			MainHand("Main hand", false),
			OffHand("Off hand", false),
			Head("Head", false),
			Body("Body", false),
			Legs("Legs", false),
			Feet("Feet", false);

			override val action: kotlin.String = "GetItemAttribute"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Active Equipment Slot"
		}
	}

	object ShiftRotation {
		enum class RotationAxis(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Pitch("Pitch", true),
			Yaw("Yaw", false);

			override val action: kotlin.String = "ShiftRotation"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rotation Axis"
		}
	}

	object Divide {
		enum class DivisionMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Default("Default", true),
			FloorResult("Floor result", false);

			override val action: kotlin.String = "/"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Division Mode"
		}
	}

	object GetSignText {
		enum class SignLine(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			One("1", true),
			Two("2", false),
			Three("3", false),
			Four("4", false),
			AllLines("All lines", false);

			override val action: kotlin.String = "GetSignText"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sign Line"
		}
	}

	object Bitwise {
		enum class Operator(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Or("|", true),
			And("&", false),
			Not("~", false),
			Xor("^", false),
			ShiftLeft("<<", false),
			ShiftRight(">>", false),
			UnsignedShiftRight(">>>", false);

			override val action: kotlin.String = "Bitwise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Operator"
		}
		enum class BitPrecision(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Default("Default", true),
			SixFourBit("64-bit", false);

			override val action: kotlin.String = "Bitwise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bit Precision"
		}
	}

	object ShiftOnAxis {
		enum class Coordinate(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			X("X", true),
			Y("Y", false),
			Z("Z", false);

			override val action: kotlin.String = "ShiftOnAxis"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate"
		}
	}

	object GetVectorComp {
		enum class Component(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			X("X", true),
			Y("Y", false),
			Z("Z", false);

			override val action: kotlin.String = "GetVectorComp"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Component"
		}
	}

	object RmText {
		enum class RegularExpressions(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "RmText"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Regular Expressions"
		}
	}

	object AddItemAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Armor("Armor", true),
			ArmorToughness("Armor toughness", false),
			AttackDamage("Attack damage", false),
			AttackKnockback("Attack knockback", false),
			AttackSpeed("Attack speed", false),
			BurningTime("Burning time", false),
			ExplosionKnockbackResistance("Explosion knockback resistance", false),
			FallDamageMultiplier("Fall damage multiplier", false),
			FlyingSpeed("Flying speed", false),
			FollowRange("Follow range", false),
			Gravity("Gravity", false),
			JumpStrength("Jump strength", false),
			KnockbackResistance("Knockback resistance", false),
			Luck("Luck", false),
			MaximumAbsorptionHealth("Maximum absorption health", false),
			MaximumHealth("Maximum health", false),
			MovementEfficiency("Movement efficiency", false),
			WalkingSpeed("Walking speed", false),
			OxygenBonus("Oxygen bonus", false),
			SafeFallDistance("Safe fall distance", false),
			Scale("Scale", false),
			StepHeight("Step height", false),
			WaterMovementEfficiency("Water movement efficiency", false),
			TemptRange("Tempt range", false),
			BlockBreakSpeed("Block break speed", false),
			BlockInteractionRange("Block interaction range", false),
			EntityInteractionRange("Entity interaction range", false),
			MiningEfficiency("Mining efficiency", false),
			SneakingSpeed("Sneaking speed", false),
			SubmergedMiningSpeed("Submerged mining speed", false),
			SweepingDamageRatio("Sweeping damage ratio", false),
			ZombieSpawnReinforcements("Zombie spawn reinforcements", false);

			override val action: kotlin.String = "AddItemAttribute"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class Operation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AddNumber("Add number", true),
			AddPercentageToBase("Add percentage to base", false),
			MultiplyModifierByPercentage("Multiply modifier by percentage", false);

			override val action: kotlin.String = "AddItemAttribute"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Operation"
		}
		enum class ActiveEquipmentSlot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Any("Any", false),
			/** **Default** */
			MainHand("Main hand", true),
			OffHand("Off hand", false),
			Head("Head", false),
			Body("Body", false),
			Legs("Legs", false),
			Feet("Feet", false);

			override val action: kotlin.String = "AddItemAttribute"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Active Equipment Slot"
		}
	}

	object AlignLoc {
		enum class AlignmentMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			BlockCenter("Block center", true),
			LowerBlockCorner("Lower block corner", false);

			override val action: kotlin.String = "AlignLoc"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Alignment Mode"
		}
		enum class Coordinates(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AllCoordinates("All coordinates", true),
			XAndZ("X and Z", false),
			OnlyY("Only Y", false);

			override val action: kotlin.String = "AlignLoc"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinates"
		}
		enum class Rotation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			KeepRotation("Keep rotation", true),
			RemoveRotation("Remove rotation", false);

			override val action: kotlin.String = "AlignLoc"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rotation"
		}
	}

	object RandomNumber {
		enum class RoundingMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			WholeNumber("Whole number", true),
			DecimalNumber("Decimal number", false);

			override val action: kotlin.String = "RandomNumber"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rounding Mode"
		}
	}

	object Raycast {
		enum class EntityCollision(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "Raycast"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Entity Collision"
		}
		enum class BlockCollision(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AllBlocks("All blocks", true),
			NonFluidBlocks("Non-fluid blocks", false),
			SolidBlocks("Solid blocks", false),
			None("None", false);

			override val action: kotlin.String = "Raycast"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Block Collision"
		}
	}

	object RotateAroundVec {
		enum class AngleUnits(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Degrees("Degrees", true),
			Radians("Radians", false);

			override val action: kotlin.String = "RotateAroundVec"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Angle Units"
		}
	}

	object SetItemFood {
		enum class CanAlwaysEat(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "SetItemFood"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Can Always Eat"
		}
	}

	object SetConsumable {
		enum class CanAlwaysEat(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "SetConsumable"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Can Always Eat"
		}
		enum class ShowParticles(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SetConsumable"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Show Particles"
		}
		enum class ConsumingAnimation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			None("None", false),
			/** **Default** */
			Eat("Eat", true),
			Drink("Drink", false),
			Block("Block", false),
			Bow("Bow", false),
			Spear("Spear", false),
			Crossbow("Crossbow", false),
			Spyglass("Spyglass", false),
			TootHorn("Toot horn", false),
			Brush("Brush", false),
			Bundle("Bundle", false);

			override val action: kotlin.String = "SetConsumable"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Consuming Animation"
		}
	}

	object ClampLoc {
		enum class Coordinates(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AllCoordinates("All coordinates", true),
			XAndZ("X and Z", false);

			override val action: kotlin.String = "ClampLoc"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinates"
		}
	}

	object SortDict {
		enum class SortingType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			SortByKey("Sort by Key", true),
			SortByValue("Sort by Value", false);

			override val action: kotlin.String = "SortDict"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sorting Type"
		}
		enum class SortingOrder(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Ascending("Ascending", true),
			Descending("Descending", false);

			override val action: kotlin.String = "SortDict"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sorting Order"
		}
	}

	object SetArmorTrim {
		enum class TrimPattern(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			None("None", true),
			Bolt("Bolt", false),
			Coast("Coast", false),
			Dune("Dune", false),
			Eye("Eye", false),
			Flow("Flow", false),
			Rib("Rib", false),
			Sentry("Sentry", false),
			Snout("Snout", false),
			Spire("Spire", false),
			Tide("Tide", false),
			Vex("Vex", false),
			Ward("Ward", false),
			Wayfinder("Wayfinder", false),
			Shaper("Shaper", false),
			Silence("Silence", false),
			Raiser("Raiser", false),
			Host("Host", false),
			Wild("Wild", false);

			override val action: kotlin.String = "SetArmorTrim"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Trim Pattern"
		}
		enum class TrimMaterial(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Amethyst("Amethyst", true),
			Copper("Copper", false),
			Diamond("Diamond", false),
			Emerald("Emerald", false),
			Gold("Gold", false),
			Iron("Iron", false),
			LapisLazuli("Lapis Lazuli", false),
			Netherite("Netherite", false),
			Quartz("Quartz", false),
			Resin("Resin", false),
			Redstone("Redstone", false);

			override val action: kotlin.String = "SetArmorTrim"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Trim Material"
		}
	}

	object Noise {
		enum class ReturnType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Simplex("Simplex", true),
			Perlin("Perlin", false),
			Voronoi("Voronoi", false),
			Worley("Worley", false),
			Value("Value", false);

			override val action: kotlin.String = "Noise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Type"
		}
		enum class Dimensions(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			ThreeD("3D", true),
			TwoD("2D", false);

			override val action: kotlin.String = "Noise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dimensions"
		}
	}

	object Sine {
		enum class SineVariant(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Sine("Sine", true),
			InverseSineArcsine("Inverse sine (arcsine)", false),
			HyperbolicSine("Hyperbolic sine", false);

			override val action: kotlin.String = "Sine"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sine Variant"
		}
		enum class Input(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Degrees("Degrees", true),
			Radians("Radians", false);

			override val action: kotlin.String = "Sine"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Input"
		}
	}

	object GetBlockByMCTag {
		enum class ReturnValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			MaterialIdGolden_apple("Material ID (golden_apple)", true),
			MaterialNameGoldenApple("Material Name (Golden Apple)", false),
			Item("Item", false);

			override val action: kotlin.String = "GetBlockByMCTag"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Value Type"
		}
	}

	object RoundNumber {
		enum class RoundMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Floor("Floor", false),
			/** **Default** */
			Nearest("Nearest", true),
			Ceiling("Ceiling", false);

			override val action: kotlin.String = "RoundNumber"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Round Mode"
		}
	}

	object FaceLocation {
		enum class FaceDirection(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			TowardLocation("Toward location", true),
			AwayFromLocation("Away from location", false);

			override val action: kotlin.String = "FaceLocation"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Face Direction"
		}
	}

	object NormalRandom {
		enum class Distribution(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Normal("Normal", true),
			FoldedNormal("Folded normal", false);

			override val action: kotlin.String = "NormalRandom"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Distribution"
		}
	}

	object SetItemDura {
		enum class DurabilityType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			SetDamage("Set Damage", true),
			SetDamagePercentage("Set Damage Percentage", false),
			SetRemaining("Set Remaining", false),
			SetRemainingPercentage("Set Remaining Percentage", false);

			override val action: kotlin.String = "SetItemDura"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Durability Type"
		}
	}

	object SetBreakability {
		enum class Breakability(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Breakable("Breakable", false),
			/** **Default** */
			Unbreakable("Unbreakable", true);

			override val action: kotlin.String = "SetBreakability"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Breakability"
		}
	}

	object SetAllCoords {
		enum class CoordinateType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			PlotCoordinate("Plot coordinate", true),
			WorldCoordinate("World coordinate", false);

			override val action: kotlin.String = "SetAllCoords"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate Type"
		}
	}

	object GetDirection {
		enum class ReturnType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			TextThreeD("Text (3D)", true),
			TextTwoD("Text (2D)", false),
			Vector("Vector", false);

			override val action: kotlin.String = " GetDirection "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Type"
		}
	}

	object CellularNoise {
		enum class ReturnType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Voronoi("Voronoi", true),
			Worley("Worley", false),
			Secondary("Secondary", false),
			Additive("Additive", false),
			Subtractive("Subtractive", false),
			Divisive("Divisive", false),
			Multiplicative("Multiplicative", false),
			Origin("Origin", false);

			override val action: kotlin.String = "CellularNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Type"
		}
		enum class DistanceCalculation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Euclidean("Euclidean", true),
			Manhattan("Manhattan", false),
			Natural("Natural", false);

			override val action: kotlin.String = "CellularNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Distance Calculation"
		}
		enum class DomainFractal(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Progressive("Progressive", true),
			Independent("Independent", false);

			override val action: kotlin.String = "CellularNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Domain Fractal"
		}
		enum class Dimensions(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			ThreeD("3D", true),
			TwoD("2D", false);

			override val action: kotlin.String = "CellularNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dimensions"
		}
	}

	object ParseMiniMessageExpr {
		enum class AllowedTags(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			StyleOnly("Style Only", true),
			Dynamic("Dynamic", false),
			Full("Full", false);

			override val action: kotlin.String = "ParseMiniMessageExpr"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Allowed Tags"
		}
		enum class ParseLegacyColorCodes(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "ParseMiniMessageExpr"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Parse Legacy Color Codes"
		}
	}

	object RotateAroundAxis {
		enum class Axis(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			X("X", true),
			Y("Y", false),
			Z("Z", false);

			override val action: kotlin.String = "RotateAroundAxis"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Axis"
		}
		enum class AngleUnits(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Degrees("Degrees", true),
			Radians("Radians", false);

			override val action: kotlin.String = "RotateAroundAxis"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Angle Units"
		}
	}

	object GetItemDura {
		enum class DurabilityType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			GetDamage("Get Damage", true),
			GetDamagePercentage("Get Damage Percentage", false),
			GetRemaining("Get Remaining", false),
			GetRemainingPercentage("Get Remaining Percentage", false),
			GetMaximum("Get Maximum", false);

			override val action: kotlin.String = "GetItemDura"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Durability Type"
		}
	}

	object ShiftInDirection {
		enum class Direction(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Forward("Forward", true),
			Upward("Upward", false),
			Sideways("Sideways", false);

			override val action: kotlin.String = "ShiftInDirection"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Direction"
		}
	}

	object SetModelDataNums {
		enum class ModelValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Floats("Floats", true),
			Flags("Flags", false),
			Colors("Colors", false);

			override val action: kotlin.String = "SetModelDataNums"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Model Value Type"
		}
	}

	object ReplaceString {
		enum class RegularExpressions(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "ReplaceString"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Regular Expressions"
		}
		enum class ReplacementType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			FirstOccurrence("First occurrence", false),
			/** **Default** */
			AllOccurrences("All occurrences", true);

			override val action: kotlin.String = "ReplaceString"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Replacement Type"
		}
	}

	object SetItemGlowing {
		enum class Glowing(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false),
			Default("Default", false);

			override val action: kotlin.String = "SetItemGlowing"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Glowing"
		}
	}

	object SetLodestoneLoc {
		enum class RequireLodestoneatLocation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "SetLodestoneLoc"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Require Lodestone at Location"
		}
	}

	object SetItemRarity {
		enum class Rarity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			DefaultForItemType("Default for item type", true),
			Common("Common", false),
			Uncommon("Uncommon", false),
			Rare("Rare", false),
			Epic("Epic", false);

			override val action: kotlin.String = "SetItemRarity"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rarity"
		}
	}

	object SetCase {
		enum class CapitalizationType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Uppercase("UPPERCASE", true),
			Lowercase("lowercase", false),
			ProperCase("Proper Case", false),
			InvertCase("iNVERT CASE", false),
			RandomCase("RAnDoM cASe", false);

			override val action: kotlin.String = "SetCase"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Capitalization Type"
		}
	}

	object GetLight {
		enum class LightType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			CombinedLight("Combined light", true),
			SkyLight("Sky light", false),
			BlockLight("Block light", false);

			override val action: kotlin.String = "GetLight"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Light Type"
		}
	}

	object Distance {
		enum class DistanceType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			DistanceTwoDXOrZ("Distance 2D (X/Z)", false),
			/** **Default** */
			DistanceThreeDXOrYOrZ("Distance 3D (X/Y/Z)", true),
			AltitudeY("Altitude (Y)", false);

			override val action: kotlin.String = "Distance"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Distance Type"
		}
	}

	object ParseMiniMessage {
		enum class AllowedTags(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			StyleOnly("Style Only", true),
			Dynamic("Dynamic", false),
			Full("Full", false);

			override val action: kotlin.String = "ParseMiniMessage"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Allowed Tags"
		}
		enum class ParseLegacyColorCodes(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "ParseMiniMessage"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Parse Legacy Color Codes"
		}
	}

	object AddItemToolRule {
		enum class CorrectToolforLoot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "AddItemToolRule"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Correct Tool for Loot"
		}
	}

	object GetItemType {
		enum class ReturnValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			ItemIdGolden_apple("Item ID (golden_apple)", true),
			ItemNameGoldenApple("Item Name (Golden Apple)", false),
			Item("Item", false);

			override val action: kotlin.String = "GetItemType"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Value Type"
		}
	}

	object ArcTangent2 {
		enum class OutputType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Degrees("Degrees", true),
			Radians("Radians", false);

			override val action: kotlin.String = "ArcTangent2"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Output Type"
		}
	}

	object RemoveString {
		enum class RegularExpressions(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "RemoveString"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Regular Expressions"
		}
	}

	object GetAllBlockData {
		enum class HideDefault(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "GetAllBlockData"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hide Default"
		}
	}

	object GetCoord {
		enum class CoordinateType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			PlotCoordinate("Plot coordinate", true),
			WorldCoordinate("World coordinate", false);

			override val action: kotlin.String = "GetCoord"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate Type"
		}
		enum class Coordinate(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			X("X", true),
			Y("Y", false),
			Z("Z", false),
			Pitch("Pitch", false),
			Yaw("Yaw", false);

			override val action: kotlin.String = "GetCoord"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate"
		}
	}

	object ShiftDirection {
		enum class Direction(override val option: kotlin.String, override val default: Boolean) : TagItem {
			ForwardsTwoDXOrZ("Forwards 2D (X/Z)", false),
			/** **Default** */
			ForwardsThreeDXOrYOrZ("Forwards 3D (X/Y/Z)", true),
			SidewaysLOrR("Sideways (-L / +R)", false);

			override val action: kotlin.String = "ShiftDirection"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Direction"
		}
	}

	object IndexOfSubstring {
		enum class IgnoreCase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "IndexOfSubstring"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
		enum class SearchType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			FirstOccurrence("First occurrence", true),
			LastOccurrence("Last occurrence", false);

			override val action: kotlin.String = "IndexOfSubstring"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Search Type"
		}
	}

	object GetParticleSprd {
		enum class Spread(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Horizontal("Horizontal", true),
			Vertical("Vertical", false);

			override val action: kotlin.String = "GetParticleSprd"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Spread"
		}
	}

	object GetHeadOwner {
		enum class TextValue(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			OwnerName("Owner Name", true),
			OwnerUuid("Owner UUID", false);

			override val action: kotlin.String = "GetHeadOwner"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value"
		}
	}

	object GetColorChannels {
		enum class ColorChannels(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Rgb("RGB", true),
			Hsb("HSB", false),
			Hsl("HSL", false);

			override val action: kotlin.String = "GetColorChannels"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Color Channels"
		}
	}

	object SetItemFlags {
		enum class ArmorTrim(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Hide("Hide", false),
			Show("Show", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Armor Trim"
		}
		enum class Color(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Hide("Hide", false),
			Show("Show", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Color"
		}
		enum class Enchantments(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Hide("Hide", false),
			Show("Show", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Enchantments"
		}
		enum class Attributes(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Hide("Hide", false),
			Show("Show", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attributes"
		}
		enum class Unbreakable(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Hide("Hide", false),
			Show("Show", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Unbreakable"
		}
		enum class CanDestroy(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Hide("Hide", false),
			Show("Show", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Can Destroy"
		}
		enum class CanPlaceOn(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Hide("Hide", false),
			Show("Show", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Can Place On"
		}
		enum class PotionEffects(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Hide("Hide", false),
			Show("Show", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Potion Effects"
		}
		enum class Others(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Hide("Hide", false),
			Show("Show", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Others"
		}
	}

	object Tangent {
		enum class TangentVariant(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Tangent("Tangent", true),
			InverseTangentArctangent("Inverse tangent (arctangent)", false),
			HyperbolicTangent("Hyperbolic tangent", false);

			override val action: kotlin.String = "Tangent"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Tangent Variant"
		}
		enum class Input(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Degrees("Degrees", true),
			Radians("Radians", false);

			override val action: kotlin.String = "Tangent"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Input"
		}
	}

	object VoronoiNoise {
		enum class CellEdgeType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Euclidean("Euclidean", true),
			Manhattan("Manhattan", false),
			Natural("Natural", false);

			override val action: kotlin.String = "VoronoiNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Cell Edge Type"
		}
	}

	object Interpolate {
		enum class Easing(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Linear("Linear", true),
			Quad("Quad", false),
			Cubic("Cubic", false),
			Quart("Quart", false),
			Quint("Quint", false),
			Sine("Sine", false),
			Expo("Expo", false),
			Circ("Circ", false);

			override val action: kotlin.String = "Interpolate"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Easing"
		}
		enum class Direction(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			In("In", true),
			Out("Out", false),
			InOut("In Out", false);

			override val action: kotlin.String = "Interpolate"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Direction"
		}
	}

	object SetCoord {
		enum class CoordinateType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			PlotCoordinate("Plot coordinate", true),
			WorldCoordinate("World coordinate", false);

			override val action: kotlin.String = "SetCoord"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate Type"
		}
		enum class Coordinate(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			X("X", true),
			Y("Y", false),
			Z("Z", false),
			Pitch("Pitch", false),
			Yaw("Yaw", false);

			override val action: kotlin.String = "SetCoord"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate"
		}
	}

	object RaycastBlock {
		enum class IgnorePassableBlocks(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "RaycastBlock"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Passable Blocks"
		}
		enum class FluidCollision(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			IgnoreFluids("Ignore fluids", true),
			DetectFluids("Detect fluids", false),
			SourceBlocksOnly("Source blocks only", false);

			override val action: kotlin.String = "RaycastBlock"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fluid Collision"
		}
	}

	object PerlinNoise {
		enum class FractalType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Brownian("Brownian", true),
			BillowDarkEdges("Billow (Dark edges)", false),
			RigidLightEdges("Rigid (Light edges)", false);

			override val action: kotlin.String = "PerlinNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fractal Type"
		}
	}

	object WorleyNoise {
		enum class CellEdgeType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Euclidean("Euclidean", true),
			Manhattan("Manhattan", false),
			Natural("Natural", false);

			override val action: kotlin.String = "WorleyNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Cell Edge Type"
		}
		enum class DistanceCalculation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Primary("Primary", true),
			Secondary("Secondary", false),
			Additive("Additive", false),
			Subtractive("Subtractive", false),
			Multiplicative("Multiplicative", false),
			Divisive("Divisive", false);

			override val action: kotlin.String = "WorleyNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Distance Calculation"
		}
	}

	object SortList {
		enum class SortOrder(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Ascending("Ascending", true),
			Descending("Descending", false);

			override val action: kotlin.String = "SortList"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sort Order"
		}
	}

	object FormatTime {
		enum class Format(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Custom("Custom", false),
			/** **Default** */
			YyyyMmDdHhMmSs("2020/08/17 17:20:54", true),
			YyyMmDd("2020/08/17", false),
			DayMonthDate("Mon, August 17", false),
			Day("Monday", false),
			HhMmSs("17:20:54", false),
			HhMmAmOrPm("5:20 PM", false),
			HhHMmMSsS("17h20m54s", false),
			Seconds("54.229 seconds", false);

			override val action: kotlin.String = "FormatTime"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Format"
		}
	}

	object StyledText {
		enum class TextValueMerging(override val option: kotlin.String, override val default: Boolean) : TagItem {
			AddSpaces("Add spaces", false),
			/** **Default** */
			NoSpaces("No spaces", true);

			override val action: kotlin.String = "StyledText"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "StyledText"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
		}
	}

	object GetContainerItems {
		enum class IgnoreEmptySlots(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "GetContainerItems"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Empty Slots"
		}
	}

	object GetModelDataNums {
		enum class ModelValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Floats("Floats", true),
			Flags("Flags", false),
			Colors("Colors", false);

			override val action: kotlin.String = "GetModelDataNums"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Model Value Type"
		}
	}

	object GradientNoise {
		enum class Dimensions(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			ThreeD("3D", true),
			TwoD("2D", false);

			override val action: kotlin.String = "GradientNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dimensions"
		}
		enum class DomainFractal(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Progressive("Progressive", true),
			Independent("Independent", false);

			override val action: kotlin.String = "GradientNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Domain Fractal"
		}
		enum class ReturnType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Simplex("Simplex", true),
			Perlin("Perlin", false);

			override val action: kotlin.String = "GradientNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Type"
		}
	}

	object SetItemHideTooltip {
		enum class Tooltip(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetItemHideTooltip"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Tooltip"
		}
	}

	object Cosine {
		enum class CosineVariant(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Cosine("Cosine", true),
			InverseCosineArccosine("Inverse cosine (arccosine)", false),
			HyperbolicCosine("Hyperbolic cosine", false);

			override val action: kotlin.String = "Cosine"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Cosine Variant"
		}
		enum class Input(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Degrees("Degrees", true),
			Radians("Radians", false);

			override val action: kotlin.String = "Cosine"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Input"
		}
	}

	object GetItemByMCTag {
		enum class ReturnValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			MaterialIdGolden_apple("Material ID (golden_apple)", true),
			MaterialNameGoldenApple("Material Name (Golden Apple)", false),
			Item("Item", false);

			override val action: kotlin.String = "GetItemByMCTag"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Value Type"
		}
	}

	object SetVectorComp {
		enum class Component(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			X("X", true),
			Y("Y", false),
			Z("Z", false);

			override val action: kotlin.String = "SetVectorComp"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Component"
		}
	}

	object ShiftAllDirs {
		enum class IgnorePitch(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "ShiftAllDirs"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Pitch"
		}
	}

	object GetValueIndex {
		enum class SearchOrder(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AscendingFirstIndex("Ascending (first index)", true),
			DescendingLastIndex("Descending (last index)", false);

			override val action: kotlin.String = "GetValueIndex"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Search Order"
		}
	}

	object GetConsumable {
		enum class ConsumableProperty(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Nutrition("Nutrition", true),
			Saturation("Saturation", false),
			UseDuration("Use Duration", false),
			Animation("Animation", false),
			Sound("Sound", false);

			override val action: kotlin.String = "GetConsumable"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Consumable Property"
		}
	}

	object ShiftLocation {
		enum class ShiftDirection(override val option: kotlin.String, override val default: Boolean) : TagItem {
			UpwardsOrDownwards("(+) Upwards / (-) Downwards", false),
			/** **Default** */
			ForwardsOrBackwards("(+) Forwards / (-) Backwards", true),
			RightOrLeft("(+) Right / (-) Left", false);

			override val action: kotlin.String = "ShiftLocation"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Shift Direction"
		}
	}

	object HiddenComponents {
		enum class HidingMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Hide("Hide", false),
			Show("Show", false),
			/** **Default** */
			HideAll("Hide all", true),
			ShowAll("Show all", false),
			HideAllExcept("Hide all except", false),
			ShowAllExcept("Show all except", false);

			override val action: kotlin.String = "HiddenComponents"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hiding Mode"
		}
	}

	object Round {
		enum class RoundMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Floor("Floor", false),
			/** **Default** */
			Nearest("Nearest", true),
			Ceiling("Ceiling", false);

			override val action: kotlin.String = "Round"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Round Mode"
		}
	}

	object GetSoundPitch {
		enum class ReturnValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			PitchNumber("Pitch (number)", true),
			NoteText("Note (text)", false);

			override val action: kotlin.String = "GetSoundPitch"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Value Type"
		}
	}

	object TranslateColors {
		enum class TranslationType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			FromHexToColor("From hex to color", false),
			/** **Default** */
			FromAndToColor("From & to color", true),
			FromColorToAnd("From color to &", false),
			StripColor("Strip color", false);

			override val action: kotlin.String = "TranslateColors"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Translation Type"
		}
	}

	object GetBlockGrowth {
		enum class GrowthUnit(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			GrowthStageNumber("Growth stage number", true),
			GrowthPercentage("Growth percentage", false);

			override val action: kotlin.String = "GetBlockGrowth"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Growth Unit"
		}
	}

	object RemoveListValue {
		enum class Itemstoremove(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AllMatches("All Matches", true),
			FirstMatch("First Match", false),
			LastMatch("Last Match", false);

			override val action: kotlin.String = "RemoveListValue"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Items to remove"
		}
	}

	object BytesToString {
		enum class Signed(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "BytesToString"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Signed"
		}
		enum class Charset(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			UtfEight("UTF-8", true),
			Ascii("ASCII", false);

			override val action: kotlin.String = "BytesToString"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Charset"
		}
	}

	object ValueNoise {
		enum class Dimensions(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			ThreeD("3D", true),
			TwoD("2D", false);

			override val action: kotlin.String = "ValueNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dimensions"
		}
		enum class DomainFractal(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Progressive("Progressive", true),
			Independent("Independent", false);

			override val action: kotlin.String = "ValueNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Domain Fractal"
		}
		enum class ReturnType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Value("Value", true),
			Cubic("Cubic", false);

			override val action: kotlin.String = "ValueNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Type"
		}
	}

	object WebResponse {
		enum class RequestMethod(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Post("Post", true),
			Get("Get", false),
			Put("Put", false),
			Delete("Delete", false);

			override val action: kotlin.String = "WebResponse"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Request Method"
		}
		enum class ContentType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			TextOrPlain("text/plain", true),
			ApplicationOrJson("application/json", false);

			override val action: kotlin.String = "WebResponse"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Content Type"
		}
		enum class CodeFlow(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Synchronous("Synchronous", true),
			Asynchronous("Asynchronous", false);

			override val action: kotlin.String = "WebResponse"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Code Flow"
		}
	}

	object GetBlockType {
		enum class ReturnValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			BlockIdOak_log("Block ID (oak_log)", true),
			BlockNameOakLog("Block name (Oak Log)", false),
			Item("Item", false);

			override val action: kotlin.String = "GetBlockType"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Value Type"
		}
	}

	object GetItemWeapon {
		enum class WeaponProperty(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			DurabilityReductionPerAttack("Durability reduction per attack", true),
			SecondsToDisableBlockingFor("Seconds to disable blocking for", false);

			override val action: kotlin.String = "GetItemWeapon"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Weapon Property"
		}
	}

	object GetVectorLength {
		enum class LengthType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Length("Length", true),
			LengthSquared("Length Squared", false);

			override val action: kotlin.String = "GetVectorLength"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Length Type"
		}
	}

	object StringToBytes {
		enum class Signed(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "StringToBytes"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Signed"
		}
		enum class Charset(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			UtfEight("UTF-8", true),
			Ascii("ASCII", false);

			override val action: kotlin.String = "StringToBytes"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Charset"
		}
	}
}