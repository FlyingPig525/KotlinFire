package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object SetVariableTags {
	object String {
		enum class TextValueMerging(override val option: kotlin.String) : TagItem {
			AddSpaces("Add spaces"),
			/** **Default** */
			NoSpaces("No spaces");

			override val action: kotlin.String = "String"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
	}

	object PurgeVars {
		enum class MatchRequirement(override val option: kotlin.String) : TagItem {
			EntireName("Entire name"),
			/** **Default** */
			FullWordSInName("Full word(s) in name"),
			AnyPartOfName("Any part of name");

			override val action: kotlin.String = "PurgeVars"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Match Requirement"
		}
		enum class IgnoreCase(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "PurgeVars"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object RemoveItemAttrs {
		enum class Slot(override val option: kotlin.String) : TagItem {
			/** **Default** */
			All("All"),
			MainHand("Main hand"),
			OffHand("Off hand"),
			Head("Head"),
			Body("Body"),
			Legs("Legs"),
			Feet("Feet");

			override val action: kotlin.String = "RemoveItemAttrs"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Slot"
		}
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			All("All"),
			Armor("Armor"),
			ArmorToughness("Armor toughness"),
			AttackDamage("Attack damage"),
			AttackKnockback("Attack knockback"),
			AttackSpeed("Attack speed"),
			BurningTime("Burning time"),
			ExplosionKnockbackResistance("Explosion knockback resistance"),
			FallDamageMultiplier("Fall damage multiplier"),
			FlyingSpeed("Flying speed"),
			FollowRange("Follow range"),
			Gravity("Gravity"),
			JumpStrength("Jump strength"),
			KnockbackResistance("Knockback resistance"),
			Luck("Luck"),
			MaximumAbsorptionHealth("Maximum absorption health"),
			MaximumHealth("Maximum health"),
			MovementEfficiency("Movement efficiency"),
			WalkingSpeed("Walking speed"),
			OxygenBonus("Oxygen bonus"),
			SafeFallDistance("Safe fall distance"),
			Scale("Scale"),
			StepHeight("Step height"),
			WaterMovementEfficiency("Water movement efficiency"),
			TemptRange("Tempt range"),
			BlockBreakSpeed("Block break speed"),
			BlockInteractionRange("Block interaction range"),
			EntityInteractionRange("Entity interaction range"),
			MiningEfficiency("Mining efficiency"),
			SneakingSpeed("Sneaking speed"),
			SubmergedMiningSpeed("Submerged mining speed"),
			SweepingDamageRatio("Sweeping damage ratio"),
			ZombieSpawnReinforcements("Zombie spawn reinforcements");

			override val action: kotlin.String = "RemoveItemAttrs"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
	}

	object Mod {
		enum class RemainderMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Remainder("Remainder"),
			Modulo("Modulo");

			override val action: kotlin.String = "%"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Remainder Mode"
		}
	}

	object ShiftOnVector {
		enum class AddLocationRotation(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "ShiftOnVector"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add Location Rotation"
		}
	}

	object GetItemAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Armor("Armor"),
			ArmorToughness("Armor toughness"),
			AttackDamage("Attack damage"),
			AttackKnockback("Attack knockback"),
			AttackSpeed("Attack speed"),
			BurningTime("Burning time"),
			ExplosionKnockbackResistance("Explosion knockback resistance"),
			FallDamageMultiplier("Fall damage multiplier"),
			FlyingSpeed("Flying speed"),
			FollowRange("Follow range"),
			Gravity("Gravity"),
			JumpStrength("Jump strength"),
			KnockbackResistance("Knockback resistance"),
			Luck("Luck"),
			MaximumAbsorptionHealth("Maximum absorption health"),
			MaximumHealth("Maximum health"),
			MovementEfficiency("Movement efficiency"),
			WalkingSpeed("Walking speed"),
			OxygenBonus("Oxygen bonus"),
			SafeFallDistance("Safe fall distance"),
			Scale("Scale"),
			StepHeight("Step height"),
			WaterMovementEfficiency("Water movement efficiency"),
			TemptRange("Tempt range"),
			BlockBreakSpeed("Block break speed"),
			BlockInteractionRange("Block interaction range"),
			EntityInteractionRange("Entity interaction range"),
			MiningEfficiency("Mining efficiency"),
			SneakingSpeed("Sneaking speed"),
			SubmergedMiningSpeed("Submerged mining speed"),
			SweepingDamageRatio("Sweeping damage ratio"),
			ZombieSpawnReinforcements("Zombie spawn reinforcements");

			override val action: kotlin.String = "GetItemAttribute"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ActiveEquipmentSlot(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Any("Any"),
			MainHand("Main hand"),
			OffHand("Off hand"),
			Head("Head"),
			Body("Body"),
			Legs("Legs"),
			Feet("Feet");

			override val action: kotlin.String = "GetItemAttribute"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Active Equipment Slot"
		}
	}

	object ShiftRotation {
		enum class RotationAxis(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Pitch("Pitch"),
			Yaw("Yaw");

			override val action: kotlin.String = "ShiftRotation"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rotation Axis"
		}
	}

	object Divide {
		enum class DivisionMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Default("Default"),
			FloorResult("Floor result");

			override val action: kotlin.String = "/"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Division Mode"
		}
	}

	object GetSignText {
		enum class SignLine(override val option: kotlin.String) : TagItem {
			/** **Default** */
			One("1"),
			Two("2"),
			Three("3"),
			Four("4"),
			AllLines("All lines");

			override val action: kotlin.String = "GetSignText"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sign Line"
		}
	}

	object Bitwise {
		enum class Operator(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Or("|"),
			And("&"),
			Not("~"),
			Xor("^"),
			ShiftLeft("<<"),
			ShiftRight(">>"),
			UnsignedShiftRight(">>>");

			override val action: kotlin.String = "Bitwise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Operator"
		}
		enum class BitPrecision(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Default("Default"),
			SixFourBit("64-bit");

			override val action: kotlin.String = "Bitwise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bit Precision"
		}
	}

	object ShiftOnAxis {
		enum class Coordinate(override val option: kotlin.String) : TagItem {
			/** **Default** */
			X("X"),
			Y("Y"),
			Z("Z");

			override val action: kotlin.String = "ShiftOnAxis"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate"
		}
	}

	object GetVectorComp {
		enum class Component(override val option: kotlin.String) : TagItem {
			/** **Default** */
			X("X"),
			Y("Y"),
			Z("Z");

			override val action: kotlin.String = "GetVectorComp"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Component"
		}
	}

	object RmText {
		enum class RegularExpressions(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "RmText"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Regular Expressions"
		}
	}

	object AddItemAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Armor("Armor"),
			ArmorToughness("Armor toughness"),
			AttackDamage("Attack damage"),
			AttackKnockback("Attack knockback"),
			AttackSpeed("Attack speed"),
			BurningTime("Burning time"),
			ExplosionKnockbackResistance("Explosion knockback resistance"),
			FallDamageMultiplier("Fall damage multiplier"),
			FlyingSpeed("Flying speed"),
			FollowRange("Follow range"),
			Gravity("Gravity"),
			JumpStrength("Jump strength"),
			KnockbackResistance("Knockback resistance"),
			Luck("Luck"),
			MaximumAbsorptionHealth("Maximum absorption health"),
			MaximumHealth("Maximum health"),
			MovementEfficiency("Movement efficiency"),
			WalkingSpeed("Walking speed"),
			OxygenBonus("Oxygen bonus"),
			SafeFallDistance("Safe fall distance"),
			Scale("Scale"),
			StepHeight("Step height"),
			WaterMovementEfficiency("Water movement efficiency"),
			TemptRange("Tempt range"),
			BlockBreakSpeed("Block break speed"),
			BlockInteractionRange("Block interaction range"),
			EntityInteractionRange("Entity interaction range"),
			MiningEfficiency("Mining efficiency"),
			SneakingSpeed("Sneaking speed"),
			SubmergedMiningSpeed("Submerged mining speed"),
			SweepingDamageRatio("Sweeping damage ratio"),
			ZombieSpawnReinforcements("Zombie spawn reinforcements");

			override val action: kotlin.String = "AddItemAttribute"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class Operation(override val option: kotlin.String) : TagItem {
			/** **Default** */
			AddNumber("Add number"),
			AddPercentageToBase("Add percentage to base"),
			MultiplyModifierByPercentage("Multiply modifier by percentage");

			override val action: kotlin.String = "AddItemAttribute"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Operation"
		}
		enum class ActiveEquipmentSlot(override val option: kotlin.String) : TagItem {
			Any("Any"),
			/** **Default** */
			MainHand("Main hand"),
			OffHand("Off hand"),
			Head("Head"),
			Body("Body"),
			Legs("Legs"),
			Feet("Feet");

			override val action: kotlin.String = "AddItemAttribute"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Active Equipment Slot"
		}
	}

	object AlignLoc {
		enum class AlignmentMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			BlockCenter("Block center"),
			LowerBlockCorner("Lower block corner");

			override val action: kotlin.String = "AlignLoc"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Alignment Mode"
		}
		enum class Coordinates(override val option: kotlin.String) : TagItem {
			/** **Default** */
			AllCoordinates("All coordinates"),
			XAndZ("X and Z"),
			OnlyY("Only Y");

			override val action: kotlin.String = "AlignLoc"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinates"
		}
		enum class Rotation(override val option: kotlin.String) : TagItem {
			/** **Default** */
			KeepRotation("Keep rotation"),
			RemoveRotation("Remove rotation");

			override val action: kotlin.String = "AlignLoc"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rotation"
		}
	}

	object RandomNumber {
		enum class RoundingMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			WholeNumber("Whole number"),
			DecimalNumber("Decimal number");

			override val action: kotlin.String = "RandomNumber"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rounding Mode"
		}
	}

	object Raycast {
		enum class EntityCollision(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "Raycast"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Entity Collision"
		}
		enum class BlockCollision(override val option: kotlin.String) : TagItem {
			/** **Default** */
			AllBlocks("All blocks"),
			NonFluidBlocks("Non-fluid blocks"),
			SolidBlocks("Solid blocks"),
			None("None");

			override val action: kotlin.String = "Raycast"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Block Collision"
		}
	}

	object RotateAroundVec {
		enum class AngleUnits(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Degrees("Degrees"),
			Radians("Radians");

			override val action: kotlin.String = "RotateAroundVec"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Angle Units"
		}
	}

	object SetItemFood {
		enum class CanAlwaysEat(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "SetItemFood"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Can Always Eat"
		}
	}

	object SetConsumable {
		enum class CanAlwaysEat(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "SetConsumable"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Can Always Eat"
		}
		enum class ShowParticles(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SetConsumable"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Show Particles"
		}
		enum class ConsumingAnimation(override val option: kotlin.String) : TagItem {
			None("None"),
			/** **Default** */
			Eat("Eat"),
			Drink("Drink"),
			Block("Block"),
			Bow("Bow"),
			Spear("Spear"),
			Crossbow("Crossbow"),
			Spyglass("Spyglass"),
			TootHorn("Toot horn"),
			Brush("Brush"),
			Bundle("Bundle");

			override val action: kotlin.String = "SetConsumable"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Consuming Animation"
		}
	}

	object ClampLoc {
		enum class Coordinates(override val option: kotlin.String) : TagItem {
			/** **Default** */
			AllCoordinates("All coordinates"),
			XAndZ("X and Z");

			override val action: kotlin.String = "ClampLoc"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinates"
		}
	}

	object SortDict {
		enum class SortingType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			SortByKey("Sort by Key"),
			SortByValue("Sort by Value");

			override val action: kotlin.String = "SortDict"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sorting Type"
		}
		enum class SortingOrder(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Ascending("Ascending"),
			Descending("Descending");

			override val action: kotlin.String = "SortDict"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sorting Order"
		}
	}

	object SetArmorTrim {
		enum class TrimPattern(override val option: kotlin.String) : TagItem {
			/** **Default** */
			None("None"),
			Bolt("Bolt"),
			Coast("Coast"),
			Dune("Dune"),
			Eye("Eye"),
			Flow("Flow"),
			Rib("Rib"),
			Sentry("Sentry"),
			Snout("Snout"),
			Spire("Spire"),
			Tide("Tide"),
			Vex("Vex"),
			Ward("Ward"),
			Wayfinder("Wayfinder"),
			Shaper("Shaper"),
			Silence("Silence"),
			Raiser("Raiser"),
			Host("Host"),
			Wild("Wild");

			override val action: kotlin.String = "SetArmorTrim"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Trim Pattern"
		}
		enum class TrimMaterial(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Amethyst("Amethyst"),
			Copper("Copper"),
			Diamond("Diamond"),
			Emerald("Emerald"),
			Gold("Gold"),
			Iron("Iron"),
			LapisLazuli("Lapis Lazuli"),
			Netherite("Netherite"),
			Quartz("Quartz"),
			Resin("Resin"),
			Redstone("Redstone");

			override val action: kotlin.String = "SetArmorTrim"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Trim Material"
		}
	}

	object Noise {
		enum class ReturnType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Simplex("Simplex"),
			Perlin("Perlin"),
			Voronoi("Voronoi"),
			Worley("Worley"),
			Value("Value");

			override val action: kotlin.String = "Noise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Type"
		}
		enum class Dimensions(override val option: kotlin.String) : TagItem {
			/** **Default** */
			ThreeD("3D"),
			TwoD("2D");

			override val action: kotlin.String = "Noise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dimensions"
		}
	}

	object Sine {
		enum class SineVariant(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Sine("Sine"),
			InverseSineArcsine("Inverse sine (arcsine)"),
			HyperbolicSine("Hyperbolic sine");

			override val action: kotlin.String = "Sine"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sine Variant"
		}
		enum class Input(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Degrees("Degrees"),
			Radians("Radians");

			override val action: kotlin.String = "Sine"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Input"
		}
	}

	object GetBlockByMCTag {
		enum class ReturnValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			MaterialIdGolden_apple("Material ID (golden_apple)"),
			MaterialNameGoldenApple("Material Name (Golden Apple)"),
			Item("Item");

			override val action: kotlin.String = "GetBlockByMCTag"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Value Type"
		}
	}

	object RoundNumber {
		enum class RoundMode(override val option: kotlin.String) : TagItem {
			Floor("Floor"),
			/** **Default** */
			Nearest("Nearest"),
			Ceiling("Ceiling");

			override val action: kotlin.String = "RoundNumber"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Round Mode"
		}
	}

	object FaceLocation {
		enum class FaceDirection(override val option: kotlin.String) : TagItem {
			/** **Default** */
			TowardLocation("Toward location"),
			AwayFromLocation("Away from location");

			override val action: kotlin.String = "FaceLocation"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Face Direction"
		}
	}

	object NormalRandom {
		enum class Distribution(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Normal("Normal"),
			FoldedNormal("Folded normal");

			override val action: kotlin.String = "NormalRandom"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Distribution"
		}
	}

	object SetItemDura {
		enum class DurabilityType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			SetDamage("Set Damage"),
			SetDamagePercentage("Set Damage Percentage"),
			SetRemaining("Set Remaining"),
			SetRemainingPercentage("Set Remaining Percentage");

			override val action: kotlin.String = "SetItemDura"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Durability Type"
		}
	}

	object SetBreakability {
		enum class Breakability(override val option: kotlin.String) : TagItem {
			Breakable("Breakable"),
			/** **Default** */
			Unbreakable("Unbreakable");

			override val action: kotlin.String = "SetBreakability"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Breakability"
		}
	}

	object SetAllCoords {
		enum class CoordinateType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			PlotCoordinate("Plot coordinate"),
			WorldCoordinate("World coordinate");

			override val action: kotlin.String = "SetAllCoords"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate Type"
		}
	}

	object GetDirection {
		enum class ReturnType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			TextThreeD("Text (3D)"),
			TextTwoD("Text (2D)"),
			Vector("Vector");

			override val action: kotlin.String = " GetDirection "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Type"
		}
	}

	object CellularNoise {
		enum class ReturnType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Voronoi("Voronoi"),
			Worley("Worley"),
			Secondary("Secondary"),
			Additive("Additive"),
			Subtractive("Subtractive"),
			Divisive("Divisive"),
			Multiplicative("Multiplicative"),
			Origin("Origin");

			override val action: kotlin.String = "CellularNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Type"
		}
		enum class DistanceCalculation(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Euclidean("Euclidean"),
			Manhattan("Manhattan"),
			Natural("Natural");

			override val action: kotlin.String = "CellularNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Distance Calculation"
		}
		enum class DomainFractal(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Progressive("Progressive"),
			Independent("Independent");

			override val action: kotlin.String = "CellularNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Domain Fractal"
		}
		enum class Dimensions(override val option: kotlin.String) : TagItem {
			/** **Default** */
			ThreeD("3D"),
			TwoD("2D");

			override val action: kotlin.String = "CellularNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dimensions"
		}
	}

	object ParseMiniMessageExpr {
		enum class AllowedTags(override val option: kotlin.String) : TagItem {
			/** **Default** */
			StyleOnly("Style Only"),
			Dynamic("Dynamic"),
			Full("Full");

			override val action: kotlin.String = "ParseMiniMessageExpr"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Allowed Tags"
		}
		enum class ParseLegacyColorCodes(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "ParseMiniMessageExpr"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Parse Legacy Color Codes"
		}
	}

	object RotateAroundAxis {
		enum class Axis(override val option: kotlin.String) : TagItem {
			/** **Default** */
			X("X"),
			Y("Y"),
			Z("Z");

			override val action: kotlin.String = "RotateAroundAxis"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Axis"
		}
		enum class AngleUnits(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Degrees("Degrees"),
			Radians("Radians");

			override val action: kotlin.String = "RotateAroundAxis"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Angle Units"
		}
	}

	object GetItemDura {
		enum class DurabilityType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			GetDamage("Get Damage"),
			GetDamagePercentage("Get Damage Percentage"),
			GetRemaining("Get Remaining"),
			GetRemainingPercentage("Get Remaining Percentage"),
			GetMaximum("Get Maximum");

			override val action: kotlin.String = "GetItemDura"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Durability Type"
		}
	}

	object ShiftInDirection {
		enum class Direction(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Forward("Forward"),
			Upward("Upward"),
			Sideways("Sideways");

			override val action: kotlin.String = "ShiftInDirection"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Direction"
		}
	}

	object SetModelDataNums {
		enum class ModelValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Floats("Floats"),
			Flags("Flags"),
			Colors("Colors");

			override val action: kotlin.String = "SetModelDataNums"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Model Value Type"
		}
	}

	object ReplaceString {
		enum class RegularExpressions(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "ReplaceString"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Regular Expressions"
		}
		enum class ReplacementType(override val option: kotlin.String) : TagItem {
			FirstOccurrence("First occurrence"),
			/** **Default** */
			AllOccurrences("All occurrences");

			override val action: kotlin.String = "ReplaceString"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Replacement Type"
		}
	}

	object SetItemGlowing {
		enum class Glowing(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable"),
			Default("Default");

			override val action: kotlin.String = "SetItemGlowing"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Glowing"
		}
	}

	object SetLodestoneLoc {
		enum class RequireLodestoneatLocation(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "SetLodestoneLoc"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Require Lodestone at Location"
		}
	}

	object SetItemRarity {
		enum class Rarity(override val option: kotlin.String) : TagItem {
			/** **Default** */
			DefaultForItemType("Default for item type"),
			Common("Common"),
			Uncommon("Uncommon"),
			Rare("Rare"),
			Epic("Epic");

			override val action: kotlin.String = "SetItemRarity"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rarity"
		}
	}

	object SetCase {
		enum class CapitalizationType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Uppercase("UPPERCASE"),
			Lowercase("lowercase"),
			ProperCase("Proper Case"),
			InvertCase("iNVERT CASE"),
			RandomCase("RAnDoM cASe");

			override val action: kotlin.String = "SetCase"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Capitalization Type"
		}
	}

	object GetLight {
		enum class LightType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			CombinedLight("Combined light"),
			SkyLight("Sky light"),
			BlockLight("Block light");

			override val action: kotlin.String = "GetLight"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Light Type"
		}
	}

	object Distance {
		enum class DistanceType(override val option: kotlin.String) : TagItem {
			DistanceTwoDXOrZ("Distance 2D (X/Z)"),
			/** **Default** */
			DistanceThreeDXOrYOrZ("Distance 3D (X/Y/Z)"),
			AltitudeY("Altitude (Y)");

			override val action: kotlin.String = "Distance"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Distance Type"
		}
	}

	object ParseMiniMessage {
		enum class AllowedTags(override val option: kotlin.String) : TagItem {
			/** **Default** */
			StyleOnly("Style Only"),
			Dynamic("Dynamic"),
			Full("Full");

			override val action: kotlin.String = "ParseMiniMessage"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Allowed Tags"
		}
		enum class ParseLegacyColorCodes(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "ParseMiniMessage"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Parse Legacy Color Codes"
		}
	}

	object AddItemToolRule {
		enum class CorrectToolforLoot(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "AddItemToolRule"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Correct Tool for Loot"
		}
	}

	object GetItemType {
		enum class ReturnValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			ItemIdGolden_apple("Item ID (golden_apple)"),
			ItemNameGoldenApple("Item Name (Golden Apple)"),
			Item("Item");

			override val action: kotlin.String = "GetItemType"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Value Type"
		}
	}

	object ArcTangent2 {
		enum class OutputType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Degrees("Degrees"),
			Radians("Radians");

			override val action: kotlin.String = "ArcTangent2"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Output Type"
		}
	}

	object RemoveString {
		enum class RegularExpressions(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "RemoveString"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Regular Expressions"
		}
	}

	object GetAllBlockData {
		enum class HideDefault(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "GetAllBlockData"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hide Default"
		}
	}

	object GetCoord {
		enum class CoordinateType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			PlotCoordinate("Plot coordinate"),
			WorldCoordinate("World coordinate");

			override val action: kotlin.String = "GetCoord"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate Type"
		}
		enum class Coordinate(override val option: kotlin.String) : TagItem {
			/** **Default** */
			X("X"),
			Y("Y"),
			Z("Z"),
			Pitch("Pitch"),
			Yaw("Yaw");

			override val action: kotlin.String = "GetCoord"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate"
		}
	}

	object ShiftDirection {
		enum class Direction(override val option: kotlin.String) : TagItem {
			ForwardsTwoDXOrZ("Forwards 2D (X/Z)"),
			/** **Default** */
			ForwardsThreeDXOrYOrZ("Forwards 3D (X/Y/Z)"),
			SidewaysLOrR("Sideways (-L / +R)");

			override val action: kotlin.String = "ShiftDirection"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Direction"
		}
	}

	object IndexOfSubstring {
		enum class IgnoreCase(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "IndexOfSubstring"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
		enum class SearchType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			FirstOccurrence("First occurrence"),
			LastOccurrence("Last occurrence");

			override val action: kotlin.String = "IndexOfSubstring"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Search Type"
		}
	}

	object GetParticleSprd {
		enum class Spread(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Horizontal("Horizontal"),
			Vertical("Vertical");

			override val action: kotlin.String = "GetParticleSprd"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Spread"
		}
	}

	object GetHeadOwner {
		enum class TextValue(override val option: kotlin.String) : TagItem {
			/** **Default** */
			OwnerName("Owner Name"),
			OwnerUuid("Owner UUID");

			override val action: kotlin.String = "GetHeadOwner"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value"
		}
	}

	object GetColorChannels {
		enum class ColorChannels(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Rgb("RGB"),
			Hsb("HSB"),
			Hsl("HSL");

			override val action: kotlin.String = "GetColorChannels"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Color Channels"
		}
	}

	object SetItemFlags {
		enum class ArmorTrim(override val option: kotlin.String) : TagItem {
			Hide("Hide"),
			Show("Show"),
			/** **Default** */
			NoChange("No Change");

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Armor Trim"
		}
		enum class Color(override val option: kotlin.String) : TagItem {
			Hide("Hide"),
			Show("Show"),
			/** **Default** */
			NoChange("No Change");

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Color"
		}
		enum class Enchantments(override val option: kotlin.String) : TagItem {
			Hide("Hide"),
			Show("Show"),
			/** **Default** */
			NoChange("No Change");

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Enchantments"
		}
		enum class Attributes(override val option: kotlin.String) : TagItem {
			Hide("Hide"),
			Show("Show"),
			/** **Default** */
			NoChange("No Change");

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attributes"
		}
		enum class Unbreakable(override val option: kotlin.String) : TagItem {
			Hide("Hide"),
			Show("Show"),
			/** **Default** */
			NoChange("No Change");

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Unbreakable"
		}
		enum class CanDestroy(override val option: kotlin.String) : TagItem {
			Hide("Hide"),
			Show("Show"),
			/** **Default** */
			NoChange("No Change");

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Can Destroy"
		}
		enum class CanPlaceOn(override val option: kotlin.String) : TagItem {
			Hide("Hide"),
			Show("Show"),
			/** **Default** */
			NoChange("No Change");

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Can Place On"
		}
		enum class PotionEffects(override val option: kotlin.String) : TagItem {
			Hide("Hide"),
			Show("Show"),
			/** **Default** */
			NoChange("No Change");

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Potion Effects"
		}
		enum class Others(override val option: kotlin.String) : TagItem {
			Hide("Hide"),
			Show("Show"),
			/** **Default** */
			NoChange("No Change");

			override val action: kotlin.String = " SetItemFlags "
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Others"
		}
	}

	object Tangent {
		enum class TangentVariant(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Tangent("Tangent"),
			InverseTangentArctangent("Inverse tangent (arctangent)"),
			HyperbolicTangent("Hyperbolic tangent");

			override val action: kotlin.String = "Tangent"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Tangent Variant"
		}
		enum class Input(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Degrees("Degrees"),
			Radians("Radians");

			override val action: kotlin.String = "Tangent"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Input"
		}
	}

	object VoronoiNoise {
		enum class CellEdgeType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Euclidean("Euclidean"),
			Manhattan("Manhattan"),
			Natural("Natural");

			override val action: kotlin.String = "VoronoiNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Cell Edge Type"
		}
	}

	object Interpolate {
		enum class Easing(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Linear("Linear"),
			Quad("Quad"),
			Cubic("Cubic"),
			Quart("Quart"),
			Quint("Quint"),
			Sine("Sine"),
			Expo("Expo"),
			Circ("Circ");

			override val action: kotlin.String = "Interpolate"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Easing"
		}
		enum class Direction(override val option: kotlin.String) : TagItem {
			/** **Default** */
			In("In"),
			Out("Out"),
			InOut("In Out");

			override val action: kotlin.String = "Interpolate"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Direction"
		}
	}

	object SetCoord {
		enum class CoordinateType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			PlotCoordinate("Plot coordinate"),
			WorldCoordinate("World coordinate");

			override val action: kotlin.String = "SetCoord"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate Type"
		}
		enum class Coordinate(override val option: kotlin.String) : TagItem {
			/** **Default** */
			X("X"),
			Y("Y"),
			Z("Z"),
			Pitch("Pitch"),
			Yaw("Yaw");

			override val action: kotlin.String = "SetCoord"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Coordinate"
		}
	}

	object RaycastBlock {
		enum class IgnorePassableBlocks(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "RaycastBlock"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Passable Blocks"
		}
		enum class FluidCollision(override val option: kotlin.String) : TagItem {
			/** **Default** */
			IgnoreFluids("Ignore fluids"),
			DetectFluids("Detect fluids"),
			SourceBlocksOnly("Source blocks only");

			override val action: kotlin.String = "RaycastBlock"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fluid Collision"
		}
	}

	object PerlinNoise {
		enum class FractalType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Brownian("Brownian"),
			BillowDarkEdges("Billow (Dark edges)"),
			RigidLightEdges("Rigid (Light edges)");

			override val action: kotlin.String = "PerlinNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fractal Type"
		}
	}

	object WorleyNoise {
		enum class CellEdgeType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Euclidean("Euclidean"),
			Manhattan("Manhattan"),
			Natural("Natural");

			override val action: kotlin.String = "WorleyNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Cell Edge Type"
		}
		enum class DistanceCalculation(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Primary("Primary"),
			Secondary("Secondary"),
			Additive("Additive"),
			Subtractive("Subtractive"),
			Multiplicative("Multiplicative"),
			Divisive("Divisive");

			override val action: kotlin.String = "WorleyNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Distance Calculation"
		}
	}

	object SortList {
		enum class SortOrder(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Ascending("Ascending"),
			Descending("Descending");

			override val action: kotlin.String = "SortList"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sort Order"
		}
	}

	object FormatTime {
		enum class Format(override val option: kotlin.String) : TagItem {
			Custom("Custom"),
			/** **Default** */
			YyyyMmDdHhMmSs("2020/08/17 17:20:54"),
			YyyMmDd("2020/08/17"),
			DayMonthDate("Mon, August 17"),
			Day("Monday"),
			HhMmSs("17:20:54"),
			HhMmAmOrPm("5:20 PM"),
			HhHMmMSsS("17h20m54s"),
			Seconds("54.229 seconds");

			override val action: kotlin.String = "FormatTime"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Format"
		}
	}

	object StyledText {
		enum class TextValueMerging(override val option: kotlin.String) : TagItem {
			AddSpaces("Add spaces"),
			/** **Default** */
			NoSpaces("No spaces");

			override val action: kotlin.String = "StyledText"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "StyledText"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
		}
	}

	object GetContainerItems {
		enum class IgnoreEmptySlots(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "GetContainerItems"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Empty Slots"
		}
	}

	object GetModelDataNums {
		enum class ModelValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Floats("Floats"),
			Flags("Flags"),
			Colors("Colors");

			override val action: kotlin.String = "GetModelDataNums"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Model Value Type"
		}
	}

	object GradientNoise {
		enum class Dimensions(override val option: kotlin.String) : TagItem {
			/** **Default** */
			ThreeD("3D"),
			TwoD("2D");

			override val action: kotlin.String = "GradientNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dimensions"
		}
		enum class DomainFractal(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Progressive("Progressive"),
			Independent("Independent");

			override val action: kotlin.String = "GradientNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Domain Fractal"
		}
		enum class ReturnType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Simplex("Simplex"),
			Perlin("Perlin");

			override val action: kotlin.String = "GradientNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Type"
		}
	}

	object SetItemHideTooltip {
		enum class Tooltip(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetItemHideTooltip"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Tooltip"
		}
	}

	object Cosine {
		enum class CosineVariant(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Cosine("Cosine"),
			InverseCosineArccosine("Inverse cosine (arccosine)"),
			HyperbolicCosine("Hyperbolic cosine");

			override val action: kotlin.String = "Cosine"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Cosine Variant"
		}
		enum class Input(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Degrees("Degrees"),
			Radians("Radians");

			override val action: kotlin.String = "Cosine"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Input"
		}
	}

	object GetItemByMCTag {
		enum class ReturnValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			MaterialIdGolden_apple("Material ID (golden_apple)"),
			MaterialNameGoldenApple("Material Name (Golden Apple)"),
			Item("Item");

			override val action: kotlin.String = "GetItemByMCTag"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Value Type"
		}
	}

	object SetVectorComp {
		enum class Component(override val option: kotlin.String) : TagItem {
			/** **Default** */
			X("X"),
			Y("Y"),
			Z("Z");

			override val action: kotlin.String = "SetVectorComp"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Component"
		}
	}

	object ShiftAllDirs {
		enum class IgnorePitch(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "ShiftAllDirs"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Pitch"
		}
	}

	object GetValueIndex {
		enum class SearchOrder(override val option: kotlin.String) : TagItem {
			/** **Default** */
			AscendingFirstIndex("Ascending (first index)"),
			DescendingLastIndex("Descending (last index)");

			override val action: kotlin.String = "GetValueIndex"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Search Order"
		}
	}

	object GetConsumable {
		enum class ConsumableProperty(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Nutrition("Nutrition"),
			Saturation("Saturation"),
			UseDuration("Use Duration"),
			Animation("Animation"),
			Sound("Sound");

			override val action: kotlin.String = "GetConsumable"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Consumable Property"
		}
	}

	object ShiftLocation {
		enum class ShiftDirection(override val option: kotlin.String) : TagItem {
			UpwardsOrDownwards("(+) Upwards / (-) Downwards"),
			/** **Default** */
			ForwardsOrBackwards("(+) Forwards / (-) Backwards"),
			RightOrLeft("(+) Right / (-) Left");

			override val action: kotlin.String = "ShiftLocation"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Shift Direction"
		}
	}

	object HiddenComponents {
		enum class HidingMode(override val option: kotlin.String) : TagItem {
			Hide("Hide"),
			Show("Show"),
			/** **Default** */
			HideAll("Hide all"),
			ShowAll("Show all"),
			HideAllExcept("Hide all except"),
			ShowAllExcept("Show all except");

			override val action: kotlin.String = "HiddenComponents"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hiding Mode"
		}
	}

	object Round {
		enum class RoundMode(override val option: kotlin.String) : TagItem {
			Floor("Floor"),
			/** **Default** */
			Nearest("Nearest"),
			Ceiling("Ceiling");

			override val action: kotlin.String = "Round"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Round Mode"
		}
	}

	object GetSoundPitch {
		enum class ReturnValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			PitchNumber("Pitch (number)"),
			NoteText("Note (text)");

			override val action: kotlin.String = "GetSoundPitch"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Value Type"
		}
	}

	object TranslateColors {
		enum class TranslationType(override val option: kotlin.String) : TagItem {
			FromHexToColor("From hex to color"),
			/** **Default** */
			FromAndToColor("From & to color"),
			FromColorToAnd("From color to &"),
			StripColor("Strip color");

			override val action: kotlin.String = "TranslateColors"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Translation Type"
		}
	}

	object GetBlockGrowth {
		enum class GrowthUnit(override val option: kotlin.String) : TagItem {
			/** **Default** */
			GrowthStageNumber("Growth stage number"),
			GrowthPercentage("Growth percentage");

			override val action: kotlin.String = "GetBlockGrowth"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Growth Unit"
		}
	}

	object RemoveListValue {
		enum class Itemstoremove(override val option: kotlin.String) : TagItem {
			/** **Default** */
			AllMatches("All Matches"),
			FirstMatch("First Match"),
			LastMatch("Last Match");

			override val action: kotlin.String = "RemoveListValue"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Items to remove"
		}
	}

	object BytesToString {
		enum class Signed(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "BytesToString"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Signed"
		}
		enum class Charset(override val option: kotlin.String) : TagItem {
			/** **Default** */
			UtfEight("UTF-8"),
			Ascii("ASCII");

			override val action: kotlin.String = "BytesToString"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Charset"
		}
	}

	object ValueNoise {
		enum class Dimensions(override val option: kotlin.String) : TagItem {
			/** **Default** */
			ThreeD("3D"),
			TwoD("2D");

			override val action: kotlin.String = "ValueNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dimensions"
		}
		enum class DomainFractal(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Progressive("Progressive"),
			Independent("Independent");

			override val action: kotlin.String = "ValueNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Domain Fractal"
		}
		enum class ReturnType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Value("Value"),
			Cubic("Cubic");

			override val action: kotlin.String = "ValueNoise"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Type"
		}
	}

	object WebResponse {
		enum class RequestMethod(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Post("Post"),
			Get("Get"),
			Put("Put"),
			Delete("Delete");

			override val action: kotlin.String = "WebResponse"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Request Method"
		}
		enum class ContentType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			TextOrPlain("text/plain"),
			ApplicationOrJson("application/json");

			override val action: kotlin.String = "WebResponse"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Content Type"
		}
		enum class CodeFlow(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Synchronous("Synchronous"),
			Asynchronous("Asynchronous");

			override val action: kotlin.String = "WebResponse"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Code Flow"
		}
	}

	object GetBlockType {
		enum class ReturnValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			BlockIdOak_log("Block ID (oak_log)"),
			BlockNameOakLog("Block name (Oak Log)"),
			Item("Item");

			override val action: kotlin.String = "GetBlockType"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Return Value Type"
		}
	}

	object GetItemWeapon {
		enum class WeaponProperty(override val option: kotlin.String) : TagItem {
			/** **Default** */
			DurabilityReductionPerAttack("Durability reduction per attack"),
			SecondsToDisableBlockingFor("Seconds to disable blocking for");

			override val action: kotlin.String = "GetItemWeapon"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Weapon Property"
		}
	}

	object GetVectorLength {
		enum class LengthType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Length("Length"),
			LengthSquared("Length Squared");

			override val action: kotlin.String = "GetVectorLength"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Length Type"
		}
	}

	object StringToBytes {
		enum class Signed(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "StringToBytes"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Signed"
		}
		enum class Charset(override val option: kotlin.String) : TagItem {
			/** **Default** */
			UtfEight("UTF-8"),
			Ascii("ASCII");

			override val action: kotlin.String = "StringToBytes"
			override val block: kotlin.String = "set_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Charset"
		}
	}
}