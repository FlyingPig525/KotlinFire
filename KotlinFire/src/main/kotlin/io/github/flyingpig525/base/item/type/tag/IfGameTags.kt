package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object IfGameTags {
	object SignHasTxt {
		enum class SignLine(override val option: kotlin.String, override val default: Boolean) : TagItem {
			One("1", false),
			Two("2", false),
			Three("3", false),
			Four("4", false),
			/** **Default** */
			AllLines("All lines", true);

			override val action: kotlin.String = "SignHasTxt"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sign Line"
		}
		enum class CheckMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Contains("Contains", true),
			Equals("Equals", false);

			override val action: kotlin.String = "SignHasTxt"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object HasRoomForItem {
		enum class CheckMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			HasRoomForAnyItem("Has Room for Any Item", true),
			HasRoomForAllItems("Has Room for All Items", false);

			override val action: kotlin.String = "HasRoomForItem"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object CommandEquals {
		enum class CheckMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			CheckEntireCommand("Check entire command", true),
			CheckBeginning("Check beginning", false);

			override val action: kotlin.String = "CommandEquals"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
		enum class IgnoreCase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "CommandEquals"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object EventItemEquals {
		enum class ComparisonMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			ExactlyEquals("Exactly equals", false),
			/** **Default** */
			IgnoreStackSizeOrDurability("Ignore stack size/durability", true),
			MaterialOnly("Material only", false);

			override val action: kotlin.String = "EventItemEquals"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Comparison Mode"
		}
	}

	object MovementKey {
		enum class MovementKey(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			ForwardW("Forward (W)", true),
			BackwardS("Backward (S)", false),
			LeftA("Left (A)", false),
			RightD("Right (D)", false),
			JumpSpace("Jump (Space)", false),
			SneakLeftShift("Sneak (Left Shift)", false),
			SprintLeftControl("Sprint (Left Control)", false);

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Movement Key"
		}
		enum class Action(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			JustPressed("Just pressed", true),
			JustReleased("Just released", false);

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Action"
		}
	}

	object BlockPowered {
		enum class RedstonePowerMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			DirectPower("Direct power", true),
			IndirectPower("Indirect power", false);

			override val action: kotlin.String = "BlockPowered"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Redstone Power Mode"
		}
	}

	object CmdArgEquals {
		enum class IgnoreCase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "CmdArgEquals"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}
}