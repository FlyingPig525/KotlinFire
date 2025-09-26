package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object IfGameTags {
	object SignHasTxt {
		enum class SignLine(override val option: kotlin.String) : TagItem {
			One("1"),
			Two("2"),
			Three("3"),
			Four("4"),
			/** **Default** */
			AllLines("All lines");

			override val action: kotlin.String = "SignHasTxt"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sign Line"
		}
		enum class CheckMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Contains("Contains"),
			Equals("Equals");

			override val action: kotlin.String = "SignHasTxt"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object HasRoomForItem {
		enum class CheckMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			HasRoomForAnyItem("Has Room for Any Item"),
			HasRoomForAllItems("Has Room for All Items");

			override val action: kotlin.String = "HasRoomForItem"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object CommandEquals {
		enum class CheckMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			CheckEntireCommand("Check entire command"),
			CheckBeginning("Check beginning");

			override val action: kotlin.String = "CommandEquals"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
		enum class IgnoreCase(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "CommandEquals"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object EventItemEquals {
		enum class ComparisonMode(override val option: kotlin.String) : TagItem {
			ExactlyEquals("Exactly equals"),
			/** **Default** */
			IgnoreStackSizeOrDurability("Ignore stack size/durability"),
			MaterialOnly("Material only");

			override val action: kotlin.String = "EventItemEquals"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Comparison Mode"
		}
	}

	object MovementKey {
		enum class MovementKey(override val option: kotlin.String) : TagItem {
			/** **Default** */
			ForwardW("Forward (W)"),
			BackwardS("Backward (S)"),
			LeftA("Left (A)"),
			RightD("Right (D)"),
			JumpSpace("Jump (Space)"),
			SneakLeftShift("Sneak (Left Shift)"),
			SprintLeftControl("Sprint (Left Control)");

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Movement Key"
		}
		enum class Action(override val option: kotlin.String) : TagItem {
			/** **Default** */
			JustPressed("Just pressed"),
			JustReleased("Just released");

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Action"
		}
	}

	object BlockPowered {
		enum class RedstonePowerMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			DirectPower("Direct power"),
			IndirectPower("Indirect power");

			override val action: kotlin.String = "BlockPowered"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Redstone Power Mode"
		}
	}

	object CmdArgEquals {
		enum class IgnoreCase(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "CmdArgEquals"
			override val block: kotlin.String = "if_game"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}
}