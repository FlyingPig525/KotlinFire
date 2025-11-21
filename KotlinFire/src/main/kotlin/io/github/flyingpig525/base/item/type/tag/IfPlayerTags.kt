package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object IfPlayerTags {
	object HasRoomForItem {
		enum class CheckMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			HasRoomForAnyItem("Has Room for Any Item", true),
			HasRoomForAllItems("Has Room for All Items", false);

			override val action: kotlin.String = "HasRoomForItem"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
		enum class CheckedSlots(override val option: kotlin.String, override val default: Boolean) : TagItem {
			EntireInventory("Entire inventory", false),
			/** **Default** */
			MainInventory("Main inventory", true),
			UpperInventory("Upper inventory", false),
			Hotbar("Hotbar", false),
			Armor("Armor", false);

			override val action: kotlin.String = "HasRoomForItem"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Checked Slots"
		}
	}

	object HasItem {
		enum class CheckMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			HasAnyItem("Has Any Item", true),
			HasAllItems("Has All Items", false);

			override val action: kotlin.String = "HasItem"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object IsWearing {
		enum class CheckMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			IsWearingSome("Is Wearing Some", true),
			IsWearingAll("Is Wearing All", false);

			override val action: kotlin.String = "IsWearing"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object IsNear {
		enum class Shape(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Sphere("Sphere", true),
			Circle("Circle", false),
			Cube("Cube", false),
			Square("Square", false);

			override val action: kotlin.String = "IsNear"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Shape"
		}
	}

	object IsRiding {
		enum class CompareTextTo(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			EntityType("Entity type", true),
			NameOrUuid("Name or UUID", false);

			override val action: kotlin.String = "IsRiding"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Compare Text To"
		}
	}

	object CmdEquals {
		enum class CheckMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			CheckEntireCommand("Check Entire Command", true),
			CheckFirstWord("Check First Word", false);

			override val action: kotlin.String = "CmdEquals"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
		enum class IgnoreCase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "CmdEquals"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object HasPermission {
		enum class Permission(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Owner("Owner", false),
			Developer("Developer", false),
			Builder("Builder", false),
			/** **Default** */
			DeveloperOrBuilder("Developer or builder", true),
			Whitelisted("Whitelisted", false);

			override val action: kotlin.String = "HasPermission"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Permission"
		}
	}

	object MainHandEquals {
		enum class MainHand(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			LeftHand("Left Hand", true),
			RightHand("Right Hand", false);

			override val action: kotlin.String = "MainHandEquals"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Main Hand"
		}
	}

	object MovementKey {
		enum class ForwardW(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Pressed("Pressed", false),
			Released("Released", false),
			/** **Default** */
			DontCheck("Don't check", true);

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Forward (W)"
		}
		enum class BackwardS(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Pressed("Pressed", false),
			Released("Released", false),
			/** **Default** */
			DontCheck("Don't check", true);

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Backward (S)"
		}
		enum class LeftA(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Pressed("Pressed", false),
			Released("Released", false),
			/** **Default** */
			DontCheck("Don't check", true);

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Left (A)"
		}
		enum class RightD(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Pressed("Pressed", false),
			Released("Released", false),
			/** **Default** */
			DontCheck("Don't check", true);

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Right (D)"
		}
		enum class JumpSpace(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Pressed("Pressed", false),
			Released("Released", false),
			/** **Default** */
			DontCheck("Don't check", true);

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Jump (Space)"
		}
		enum class SneakLeftShift(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Pressed("Pressed", false),
			Released("Released", false),
			/** **Default** */
			DontCheck("Don't check", true);

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sneak (Left Shift)"
		}
		enum class SprintLeftControl(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Pressed("Pressed", false),
			Released("Released", false),
			/** **Default** */
			DontCheck("Don't check", true);

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sprint (Left Control)"
		}
	}

	object InvOpen {
		enum class InventoryType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AnyInventory("Any Inventory", true),
			PlotMenu("Plot Menu", false),
			CraftingTable("Crafting Table", false),
			Chest("Chest", false),
			DoubleChest("Double Chest", false),
			EnderChest("Ender Chest", false),
			ShulkerBox("Shulker Box", false),
			Barrel("Barrel", false),
			FurnaceAny("Furnace (any)", false),
			Furnace("Furnace", false),
			BlastFurnace("Blast Furnace", false),
			Smoker("Smoker", false),
			Dropper("Dropper", false),
			Dispenser("Dispenser", false),
			Beacon("Beacon", false),
			Hopper("Hopper", false),
			Anvil("Anvil", false),
			BrewingStand("Brewing Stand", false),
			CartographyTable("Cartography Table", false),
			SmithingTable("Smithing Table", false),
			Loom("Loom", false),
			Grindstone("Grindstone", false),
			Stonecutter("Stonecutter", false),
			EnchantingTable("Enchanting Table", false),
			TraderMenuAny("Trader Menu (any)", false),
			VillagerMenu("Villager Menu", false),
			WanderingTraderMenu("Wandering Trader Menu", false),
			HorseInventory("Horse Inventory", false),
			LlamaInventory("Llama Inventory", false);

			override val action: kotlin.String = "InvOpen"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inventory Type"
		}
	}

	object CmdArgEquals {
		enum class IgnoreCase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "CmdArgEquals"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object IsLookingAt {
		enum class FluidMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			IgnoreFluids("Ignore fluids", true),
			DetectFluids("Detect fluids", false);

			override val action: kotlin.String = "IsLookingAt"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fluid Mode"
		}
	}

	object IsInGameMode {
		enum class GameMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Survival("Survival", true),
			Creative("Creative", false),
			Adventure("Adventure", false),
			Spectator("Spectator", false);

			override val action: kotlin.String = "IsInGameMode"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Game Mode"
		}
	}

	object IsHolding {
		enum class HandSlot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			EitherHand("Either hand", true),
			MainHand("Main hand", false),
			OffHand("Off hand", false);

			override val action: kotlin.String = "IsHolding"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hand Slot"
		}
	}

	object IsHitboxNear {
		enum class Shape(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Sphere("Sphere", true),
			Circle("Circle", false),
			Cube("Cube", false),
			Square("Square", false);

			override val action: kotlin.String = "IsHitboxNear"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Shape"
		}
	}

	object HasPotion {
		enum class CheckProperties(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			None("None", true),
			Amplifier("Amplifier", false),
			Duration("Duration", false),
			AmplifierAndDuration("Amplifier and duration", false);

			override val action: kotlin.String = "HasPotion"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Properties"
		}
		enum class CheckMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			HasAnyEffect("Has any effect", true),
			HasAllEffects("Has all effects", false);

			override val action: kotlin.String = "HasPotion"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}
}