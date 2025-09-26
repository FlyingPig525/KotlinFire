package io.github.flyingpig525.base.item.type.tag

@Suppress("unused")
object IfPlayerTags {
	object HasRoomForItem {
		enum class CheckMode(override val option: kotlin.String) : TagItem {
			HasRoomForAnyItem("Has Room for Any Item"),
			HasRoomForAllItems("Has Room for All Items");

			override val action: kotlin.String = "HasRoomForItem"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
		enum class CheckedSlots(override val option: kotlin.String) : TagItem {
			EntireInventory("Entire inventory"),
			MainInventory("Main inventory"),
			UpperInventory("Upper inventory"),
			Hotbar("Hotbar"),
			Armor("Armor");

			override val action: kotlin.String = "HasRoomForItem"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Checked Slots"
		}
	}

	object HasItem {
		enum class CheckMode(override val option: kotlin.String) : TagItem {
			HasAnyItem("Has Any Item"),
			HasAllItems("Has All Items");

			override val action: kotlin.String = "HasItem"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object IsWearing {
		enum class CheckMode(override val option: kotlin.String) : TagItem {
			IsWearingSome("Is Wearing Some"),
			IsWearingAll("Is Wearing All");

			override val action: kotlin.String = "IsWearing"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object IsNear {
		enum class Shape(override val option: kotlin.String) : TagItem {
			Sphere("Sphere"),
			Circle("Circle"),
			Cube("Cube"),
			Square("Square");

			override val action: kotlin.String = "IsNear"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Shape"
		}
	}

	object IsRiding {
		enum class CompareTextTo(override val option: kotlin.String) : TagItem {
			EntityType("Entity type"),
			NameOrUuid("Name or UUID");

			override val action: kotlin.String = "IsRiding"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Compare Text To"
		}
	}

	object CmdEquals {
		enum class CheckMode(override val option: kotlin.String) : TagItem {
			CheckEntireCommand("Check Entire Command"),
			CheckFirstWord("Check First Word");

			override val action: kotlin.String = "CmdEquals"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
		enum class IgnoreCase(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "CmdEquals"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object HasPermission {
		enum class Permission(override val option: kotlin.String) : TagItem {
			Owner("Owner"),
			Developer("Developer"),
			Builder("Builder"),
			DeveloperOrBuilder("Developer or builder"),
			Whitelisted("Whitelisted");

			override val action: kotlin.String = "HasPermission"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Permission"
		}
	}

	object MainHandEquals {
		enum class MainHand(override val option: kotlin.String) : TagItem {
			LeftHand("Left Hand"),
			RightHand("Right Hand");

			override val action: kotlin.String = "MainHandEquals"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Main Hand"
		}
	}

	object MovementKey {
		enum class ForwardW(override val option: kotlin.String) : TagItem {
			Pressed("Pressed"),
			Released("Released"),
			DontCheck("Don't check");

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Forward (W)"
		}
		enum class BackwardS(override val option: kotlin.String) : TagItem {
			Pressed("Pressed"),
			Released("Released"),
			DontCheck("Don't check");

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Backward (S)"
		}
		enum class LeftA(override val option: kotlin.String) : TagItem {
			Pressed("Pressed"),
			Released("Released"),
			DontCheck("Don't check");

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Left (A)"
		}
		enum class RightD(override val option: kotlin.String) : TagItem {
			Pressed("Pressed"),
			Released("Released"),
			DontCheck("Don't check");

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Right (D)"
		}
		enum class JumpSpace(override val option: kotlin.String) : TagItem {
			Pressed("Pressed"),
			Released("Released"),
			DontCheck("Don't check");

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Jump (Space)"
		}
		enum class SneakLeftShift(override val option: kotlin.String) : TagItem {
			Pressed("Pressed"),
			Released("Released"),
			DontCheck("Don't check");

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sneak (Left Shift)"
		}
		enum class SprintLeftControl(override val option: kotlin.String) : TagItem {
			Pressed("Pressed"),
			Released("Released"),
			DontCheck("Don't check");

			override val action: kotlin.String = "MovementKey"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sprint (Left Control)"
		}
	}

	object InvOpen {
		enum class InventoryType(override val option: kotlin.String) : TagItem {
			AnyInventory("Any Inventory"),
			PlotMenu("Plot Menu"),
			CraftingTable("Crafting Table"),
			Chest("Chest"),
			DoubleChest("Double Chest"),
			EnderChest("Ender Chest"),
			ShulkerBox("Shulker Box"),
			Barrel("Barrel"),
			FurnaceAny("Furnace (any)"),
			Furnace("Furnace"),
			BlastFurnace("Blast Furnace"),
			Smoker("Smoker"),
			Dropper("Dropper"),
			Dispenser("Dispenser"),
			Beacon("Beacon"),
			Hopper("Hopper"),
			Anvil("Anvil"),
			BrewingStand("Brewing Stand"),
			CartographyTable("Cartography Table"),
			SmithingTable("Smithing Table"),
			Loom("Loom"),
			Grindstone("Grindstone"),
			Stonecutter("Stonecutter"),
			EnchantingTable("Enchanting Table"),
			TraderMenuAny("Trader Menu (any)"),
			VillagerMenu("Villager Menu"),
			WanderingTraderMenu("Wandering Trader Menu"),
			HorseInventory("Horse Inventory"),
			LlamaInventory("Llama Inventory");

			override val action: kotlin.String = "InvOpen"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inventory Type"
		}
	}

	object CmdArgEquals {
		enum class IgnoreCase(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "CmdArgEquals"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object IsLookingAt {
		enum class FluidMode(override val option: kotlin.String) : TagItem {
			IgnoreFluids("Ignore fluids"),
			DetectFluids("Detect fluids");

			override val action: kotlin.String = "IsLookingAt"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fluid Mode"
		}
	}

	object IsInGameMode {
		enum class GameMode(override val option: kotlin.String) : TagItem {
			Survival("Survival"),
			Creative("Creative"),
			Adventure("Adventure"),
			Spectator("Spectator");

			override val action: kotlin.String = "IsInGameMode"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Game Mode"
		}
	}

	object IsHolding {
		enum class HandSlot(override val option: kotlin.String) : TagItem {
			EitherHand("Either hand"),
			MainHand("Main hand"),
			OffHand("Off hand");

			override val action: kotlin.String = "IsHolding"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hand Slot"
		}
	}

	object IsHitboxNear {
		enum class Shape(override val option: kotlin.String) : TagItem {
			Sphere("Sphere"),
			Circle("Circle"),
			Cube("Cube"),
			Square("Square");

			override val action: kotlin.String = "IsHitboxNear"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Shape"
		}
	}

	object HasPotion {
		enum class CheckProperties(override val option: kotlin.String) : TagItem {
			None("None"),
			Amplifier("Amplifier"),
			Duration("Duration"),
			AmplifierAndDuration("Amplifier and duration");

			override val action: kotlin.String = "HasPotion"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Properties"
		}
		enum class CheckMode(override val option: kotlin.String) : TagItem {
			HasAnyEffect("Has any effect"),
			HasAllEffects("Has all effects");

			override val action: kotlin.String = "HasPotion"
			override val block: kotlin.String = "if_player"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}
}