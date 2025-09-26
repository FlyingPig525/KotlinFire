package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object PlayerActionTags {
	object SetReducedDebug {
		enum class ReducedDebugInfoEnabled(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SetReducedDebug"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Reduced Debug Info Enabled"
		}
	}

	object SetHandCrafting {
		enum class AllowHandCrafting(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "SetHandCrafting"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Allow Hand Crafting"
		}
	}

	object BossBar {
		enum class BarSlot(override val option: kotlin.String) : TagItem {
			/** **Default** */
			SlotOne("Slot 1"),
			SlotTwo("Slot 2"),
			SlotThree("Slot 3"),
			SlotFour("Slot 4"),
			SlotFive("Slot 5"),
			SlotSix("Slot 6"),
			SlotSeven("Slot 7"),
			SlotEight("Slot 8"),
			SlotNine("Slot 9");

			override val action: kotlin.String = "BossBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bar Slot"
		}
		enum class BarStyle(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Solid("Solid"),
			SixSegments("6 segments"),
			TenSegments("10 segments"),
			TwelveSegments("12 segments"),
			TwentySegments("20 segments");

			override val action: kotlin.String = "BossBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bar Style"
		}
		enum class SkyEffect(override val option: kotlin.String) : TagItem {
			/** **Default** */
			None("None"),
			CreateFog("Create fog"),
			DarkenSky("Darken sky"),
			Both("Both");

			override val action: kotlin.String = "BossBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sky Effect"
		}
		enum class BarColor(override val option: kotlin.String) : TagItem {
			Red("Red"),
			/** **Default** */
			Purple("Purple"),
			Pink("Pink"),
			Blue("Blue"),
			Green("Green"),
			Yellow("Yellow"),
			White("White");

			override val action: kotlin.String = "BossBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bar Color"
		}
	}

	object SetVelocity {
		enum class AddtoCurrentVelocity(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "SetVelocity"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
	}

	object AddInvRow {
		enum class NewRowPosition(override val option: kotlin.String) : TagItem {
			TopRow("Top row"),
			/** **Default** */
			BottomRow("Bottom row");

			override val action: kotlin.String = "AddInvRow"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "New Row Position"
		}
	}

	object Damage {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "Damage"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SendAnimation {
		enum class AnimationType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			HurtAnimation("Hurt animation"),
			WakeUpFadeEffect("Wake up (fade effect)");

			override val action: kotlin.String = "SendAnimation"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Animation Type"
		}
	}

	object SetInventoryKept {
		enum class InventoryKept(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetInventoryKept"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inventory Kept"
		}
	}

	object LaunchUp {
		enum class AddtoCurrentVelocity(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "LaunchUp"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
	}

	object GetTargetEntity {
		enum class IgnoreBlocks(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "GetTargetEntity"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Blocks"
		}
	}

	object ForceFlight {
		enum class FlightMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			StartFlight("Start Flight"),
			StopFlight("Stop Flight");

			override val action: kotlin.String = "ForceFlight"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Flight Mode"
		}
	}

	object LoadInv {
		enum class CodeFlow(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Synchronous("Synchronous"),
			Asynchronous("Asynchronous");

			override val action: kotlin.String = "LoadInv"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Code Flow"
		}
	}

	object MiscAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Scale("Scale"),
			Luck("Luck"),
			OxygenBonus("Oxygen bonus"),
			BurningTime("Burning time"),
			CameraDistance("Camera distance");

			override val action: kotlin.String = "MiscAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "MiscAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SpectateTarget {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SpectateTarget"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object DisplayBellRing {
		enum class RingDirection(override val option: kotlin.String) : TagItem {
			/** **Default** */
			North("North"),
			South("South"),
			West("West"),
			East("East");

			override val action: kotlin.String = "DisplayBellRing"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ring Direction"
		}
	}

	object CombatAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			AttackDamage("Attack damage"),
			AttackSpeed("Attack speed"),
			SweepingDamageRatio("Sweeping damage ratio");

			override val action: kotlin.String = "CombatAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "CombatAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetGamemode {
		enum class FlightMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			RespectGamemode("Respect Gamemode"),
			KeepOriginal("Keep Original");

			override val action: kotlin.String = "SetGamemode"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Flight Mode"
		}
		enum class Gamemode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Survival("Survival"),
			Creative("Creative"),
			Adventure("Adventure");

			override val action: kotlin.String = "SetGamemode"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Gamemode"
		}
	}

	object RemoveInvRow {
		enum class RowtoRemove(override val option: kotlin.String) : TagItem {
			TopRow("Top row"),
			/** **Default** */
			BottomRow("Bottom row");

			override val action: kotlin.String = "RemoveInvRow"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Row to Remove"
		}
	}

	object LSetHealth {
		enum class HealType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			RegularHealth("Regular Health"),
			AbsorptionHealth("Absorption Health"),
			CombinedHealth("Combined Health");

			override val action: kotlin.String = "L SetHealth"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Heal Type"
		}
	}

	object ClearInv {
		enum class ClearMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			EntireInventory("Entire inventory"),
			MainInventory("Main inventory"),
			UpperInventory("Upper inventory"),
			Hotbar("Hotbar"),
			Armor("Armor");

			override val action: kotlin.String = "ClearInv"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Clear Mode"
		}
		enum class ClearCraftingandCursor(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "ClearInv"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Clear Crafting and Cursor"
		}
	}

	object SetFreezeTicks {
		enum class TickingLocked(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "SetFreezeTicks"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ticking Locked"
		}
	}

	object SetGliding {
		enum class Gliding(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetGliding"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Gliding"
		}
	}

	object OpenSign {
		enum class SignSide(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Front("Front"),
			Back("Back");

			override val action: kotlin.String = "OpenSign"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sign Side"
		}
	}

	object SetFlying {
		enum class Flying(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetFlying"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Flying"
		}
	}

	object DisplayBlockOpen {
		enum class ContainerState(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Open("Open"),
			Closed("Closed");

			override val action: kotlin.String = "DisplayBlockOpen"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Container State"
		}
	}

	object SetHandItem {
		enum class HandSlot(override val option: kotlin.String) : TagItem {
			/** **Default** */
			MainHand("Main Hand"),
			OffHand("Off Hand");

			override val action: kotlin.String = "SetHandItem"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hand Slot"
		}
	}

	object SendAdvancement {
		enum class ToastType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Advancement("Advancement"),
			Goal("Goal"),
			Challenge("Challenge");

			override val action: kotlin.String = "SendAdvancement"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Toast Type"
		}
	}

	object LaunchToward {
		enum class AddtoCurrentVelocity(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "LaunchToward"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
		enum class IgnoreDistance(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "LaunchToward"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Distance"
		}
	}

	object DisplayGateway {
		enum class AnimationType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			InitialBeam("Initial beam"),
			PeriodicBeam("Periodic beam");

			override val action: kotlin.String = "DisplayGateway"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Animation Type"
		}
	}

	object GiveExp {
		enum class GiveExperience(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Points("Points"),
			Levels("Levels"),
			LevelPercentage("Level Percentage");

			override val action: kotlin.String = "GiveExp"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Give Experience"
		}
	}

	object ActionBar {
		enum class TextValueMerging(override val option: kotlin.String) : TagItem {
			AddSpaces("Add spaces"),
			/** **Default** */
			NoSpaces("No spaces");

			override val action: kotlin.String = "ActionBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "ActionBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
		}
	}

	object DisplaySignText {
		enum class SignSide(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Front("Front"),
			Back("Back");

			override val action: kotlin.String = "DisplaySignText"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sign Side"
		}
		enum class TextColor(override val option: kotlin.String) : TagItem {
			White("White"),
			Orange("Orange"),
			Magenta("Magenta"),
			LightBlue("Light blue"),
			Yellow("Yellow"),
			Lime("Lime"),
			Pink("Pink"),
			Gray("Gray"),
			LightGray("Light gray"),
			Cyan("Cyan"),
			Purple("Purple"),
			Blue("Blue"),
			Brown("Brown"),
			Green("Green"),
			Red("Red"),
			/** **Default** */
			Black("Black");

			override val action: kotlin.String = "DisplaySignText"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Color"
		}
		enum class Glowing(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "DisplaySignText"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Glowing"
		}
	}

	object SetSpeed {
		enum class SpeedType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			GroundSpeed("Ground speed"),
			FlightSpeed("Flight speed"),
			Both("Both");

			override val action: kotlin.String = "SetSpeed"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Speed Type"
		}
	}

	object ParticleCuboidA {
		enum class FillType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Wireframe("Wireframe"),
			Hollow("Hollow"),
			Solid("Solid");

			override val action: kotlin.String = "ParticleCuboidA"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fill Type"
		}
	}

	object PlaySound {
		enum class SoundSource(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Master("Master"),
			Music("Music"),
			JukeboxOrNoteBlocks("Jukebox/Note Blocks"),
			Weather("Weather"),
			Blocks("Blocks"),
			HostileCreatures("Hostile Creatures"),
			FriendlyCreatures("Friendly Creatures"),
			Players("Players"),
			AmbientOrEnvironment("Ambient/Environment"),
			VoiceOrSpeech("Voice/Speech"),
			Ui("UI");

			override val action: kotlin.String = "PlaySound"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sound Source"
		}
	}

	object RngTeleport {
		enum class KeepCurrentRotation(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "RngTeleport"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Keep Current Rotation"
		}
	}

	object RemoveBossBar {
		enum class BossBarSlot(override val option: kotlin.String) : TagItem {
			/** **Default** */
			AllBossBars("All boss bars"),
			One("1"),
			Two("2"),
			Three("3"),
			Four("4"),
			Five("5"),
			Six("6"),
			Seven("7"),
			Eight("8"),
			Nine("9");

			override val action: kotlin.String = "RemoveBossBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Boss Bar Slot"
		}
	}

	object SetEquipment {
		enum class EquipmentSlot(override val option: kotlin.String) : TagItem {
			/** **Default** */
			MainHand("Main hand"),
			OffHand("Off hand"),
			Head("Head"),
			Chest("Chest"),
			Legs("Legs"),
			Feet("Feet");

			override val action: kotlin.String = "SetEquipment"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Equipment Slot"
		}
	}

	object SetDropsEnabled {
		enum class SpawnDeathDrops(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetDropsEnabled"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Spawn Death Drops"
		}
	}

	object DisplayFracture {
		enum class OverwritePreviousFracture(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "DisplayFracture"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Overwrite Previous Fracture"
		}
	}

	object SetEntityHidden {
		enum class Hidden(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetEntityHidden"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hidden"
		}
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SetEntityHidden"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetSidebar {
		enum class Sidebar(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetSidebar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sidebar"
		}
	}

	object ParticleCuboid {
		enum class FillType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Wireframe("Wireframe"),
			Hollow("Hollow"),
			Solid("Solid");

			override val action: kotlin.String = "ParticleCuboid"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fill Type"
		}
	}

	object SendMessageSeq {
		enum class AlignmentMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Regular("Regular"),
			Centered("Centered");

			override val action: kotlin.String = "SendMessageSeq"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Alignment Mode"
		}
	}

	object SetNamePrefix {
		enum class TextType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Prefix("Prefix"),
			Suffix("Suffix");

			override val action: kotlin.String = "SetNamePrefix"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Type"
		}
	}

	object InstantRespawn {
		enum class InstantRespawn(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "InstantRespawn"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Instant Respawn"
		}
	}

	object SetNameColor {
		enum class NameColor(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Black("Black"),
			DarkBlue("Dark blue"),
			DarkGreen("Dark green"),
			DarkAqua("Dark aqua"),
			DarkRed("Dark red"),
			DarkPurple("Dark purple"),
			Gold("Gold"),
			Gray("Gray"),
			DarkGray("Dark gray"),
			Blue("Blue"),
			Green("Green"),
			Aqua("Aqua"),
			Red("Red"),
			LightPurple("Light purple"),
			Yellow("Yellow"),
			White("White"),
			None("None");

			override val action: kotlin.String = "SetNameColor"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Name Color"
		}
	}

	object ReachAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			BlockInteractionRange("Block interaction range"),
			EntityInteractionRange("Entity interaction range");

			override val action: kotlin.String = "ReachAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "ReachAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object PlayEntitySound {
		enum class SoundSource(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Master("Master"),
			Music("Music"),
			JukeboxOrNoteBlocks("Jukebox/Note Blocks"),
			Weather("Weather"),
			Blocks("Blocks"),
			HostileCreatures("Hostile Creatures"),
			FriendlyCreatures("Friendly Creatures"),
			Players("Players"),
			AmbientOrEnvironment("Ambient/Environment"),
			VoiceOrSpeech("Voice/Speech"),
			Ui("UI");

			override val action: kotlin.String = "PlayEntitySound"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sound Source"
		}
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "PlayEntitySound"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetExp {
		enum class SetExperience(override val option: kotlin.String) : TagItem {
			Points("Points"),
			/** **Default** */
			Level("Level"),
			LevelPercentage("Level Percentage");

			override val action: kotlin.String = "SetExp"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Set Experience"
		}
	}

	object MiningAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			BlockBreakSpeed("Block break speed"),
			MiningEfficiency("Mining efficiency"),
			SubmergedMiningSpeed("Submerged mining speed");

			override val action: kotlin.String = "MiningAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "MiningAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object KBAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			KnockbackResistance("Knockback resistance"),
			ExplosionKnockbackResistance("Explosion knockback resistance");

			override val action: kotlin.String = "KBAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "KBAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object MovementAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			WalkingSpeed("Walking speed"),
			FlyingSpeed("Flying speed"),
			JumpStrength("Jump strength"),
			SneakingSpeed("Sneaking speed"),
			StepHeight("Step height"),
			MovementEfficiency("Movement efficiency"),
			WaterMovementEfficiency("Water movement efficiency");

			override val action: kotlin.String = "MovementAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "MovementAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object FallingAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Gravity("Gravity"),
			SafeFallDistance("Safe fall distance"),
			FallDamageMultiplier("Fall damage multiplier");

			override val action: kotlin.String = "FallingAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "FallingAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetAllowFlight {
		enum class AllowFlight(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetAllowFlight"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Allow Flight"
		}
	}

	object SetMaxHealth {
		enum class HealPlayertoMaxHealth(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "SetMaxHealth"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Heal Player to Max Health"
		}
	}

	object SetTabListInfo {
		enum class PlayerListField(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Header("Header"),
			Footer("Footer");

			override val action: kotlin.String = "SetTabListInfo"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Player List Field"
		}
		enum class TextValueMerging(override val option: kotlin.String) : TagItem {
			AddSpaces("Add spaces"),
			/** **Default** */
			NoSpaces("No spaces");

			override val action: kotlin.String = "SetTabListInfo"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SetTabListInfo"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
		}
	}

	object ScoreLineFormat {
		enum class NumberFormat(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Fixed("Fixed"),
			Styled("Styled"),
			Blank("Blank"),
			Reset("Reset");

			override val action: kotlin.String = "ScoreLineFormat"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Number Format"
		}
	}

	object SetBossBar {
		enum class BarStyle(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Solid("Solid"),
			SixSegments("6 segments"),
			TenSegments("10 segments"),
			TwelveSegments("12 segments"),
			TwentySegments("20 segments");

			override val action: kotlin.String = " SetBossBar "
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bar Style"
		}
		enum class SkyEffect(override val option: kotlin.String) : TagItem {
			/** **Default** */
			None("None"),
			CreateFog("Create fog"),
			DarkenSky("Darken sky"),
			Both("Both");

			override val action: kotlin.String = " SetBossBar "
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sky Effect"
		}
		enum class BarColor(override val option: kotlin.String) : TagItem {
			Red("Red"),
			/** **Default** */
			Purple("Purple"),
			Pink("Pink"),
			Blue("Blue"),
			Green("Green"),
			Yellow("Yellow"),
			White("White");

			override val action: kotlin.String = " SetBossBar "
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bar Color"
		}
	}

	object SpectatorCollision {
		enum class SpectatorCollision(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SpectatorCollision"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Spectator Collision"
		}
	}

	object SetNameVisible {
		enum class NameTagVisible(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "SetNameVisible"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Name Tag Visible"
		}
	}

	object RideEntity {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "RideEntity"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetInvName {
		enum class AlignmentMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Regular("Regular"),
			Centered("Centered");

			override val action: kotlin.String = " SetInvName "
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Alignment Mode"
		}
	}

	object Teleport {
		enum class KeepCurrentRotation(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "Teleport"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Keep Current Rotation"
		}
		enum class KeepVelocity(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "Teleport"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Keep Velocity"
		}
	}

	object SetAllowPVP {
		enum class PVP(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "SetAllowPVP"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "PVP"
		}
	}

	object SetVisualFire {
		enum class OnFire(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SetVisualFire"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "On Fire"
		}
	}

	object SetDisguiseVisible {
		enum class DisguiseVisible(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "SetDisguiseVisible"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Disguise Visible"
		}
	}

	object SendMessage {
		enum class AlignmentMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Regular("Regular"),
			Centered("Centered");

			override val action: kotlin.String = "SendMessage"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Alignment Mode"
		}
		enum class TextValueMerging(override val option: kotlin.String) : TagItem {
			/** **Default** */
			AddSpaces("Add spaces"),
			NoSpaces("No spaces");

			override val action: kotlin.String = "SendMessage"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SendMessage"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
		}
	}

	object PlaySoundSeq {
		enum class SoundSource(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Master("Master"),
			Music("Music"),
			JukeboxOrNoteBlocks("Jukebox/Note Blocks"),
			Weather("Weather"),
			Blocks("Blocks"),
			HostileCreatures("Hostile Creatures"),
			FriendlyCreatures("Friendly Creatures"),
			Players("Players"),
			AmbientOrEnvironment("Ambient/Environment"),
			VoiceOrSpeech("Voice/Speech"),
			Ui("UI");

			override val action: kotlin.String = "PlaySoundSeq"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sound Source"
		}
	}

	object SetPlayerWeather {
		enum class Weather(override val option: kotlin.String) : TagItem {
			Clear("Clear"),
			/** **Default** */
			Downfall("Downfall");

			override val action: kotlin.String = "SetPlayerWeather"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Weather"
		}
	}

	object SetShoulder {
		enum class Shoulder(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Left("Left"),
			Right("Right");

			override val action: kotlin.String = "SetShoulder"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Shoulder"
		}
		enum class Type(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Remove("Remove"),
			Red("Red"),
			Blue("Blue"),
			Green("Green"),
			Cyan("Cyan"),
			Gray("Gray");

			override val action: kotlin.String = "SetShoulder"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Type"
		}
	}

	object DisplayPickup {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "DisplayPickup"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object GivePotion {
		enum class ShowIcon(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "GivePotion"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Show Icon"
		}
		enum class OverwriteEffect(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "GivePotion"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Overwrite Effect"
		}
		enum class EffectParticles(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Regular("Regular"),
			Ambient("Ambient"),
			None("None");

			override val action: kotlin.String = "GivePotion"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Effect Particles"
		}
	}

	object SetCollidable {
		enum class Collision(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "SetCollidable"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Collision"
		}
	}

	object LaunchFwd {
		enum class AddtoCurrentVelocity(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "LaunchFwd"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
		enum class LaunchAxis(override val option: kotlin.String) : TagItem {
			/** **Default** */
			PitchAndYaw("Pitch and Yaw"),
			YawOnly("Yaw Only");

			override val action: kotlin.String = "LaunchFwd"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Launch Axis"
		}
	}

	object AttackAnimation {
		enum class AnimationArm(override val option: kotlin.String) : TagItem {
			/** **Default** */
			SwingMainArm("Swing main arm"),
			SwingOffArm("Swing off arm");

			override val action: kotlin.String = "AttackAnimation"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Animation Arm"
		}
	}

	object ScoreDefFormat {
		enum class NumberFormat(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Fixed("Fixed"),
			Styled("Styled"),
			Blank("Blank"),
			Reset("Reset");

			override val action: kotlin.String = "ScoreDefFormat"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Number Format"
		}
	}

	object StopSound {
		enum class SoundSource(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Master("Master"),
			Music("Music"),
			JukeboxOrNoteBlocks("Jukebox/Note Blocks"),
			Weather("Weather"),
			Blocks("Blocks"),
			HostileCreatures("Hostile Creatures"),
			FriendlyCreatures("Friendly Creatures"),
			Players("Players"),
			AmbientOrEnvironment("Ambient/Environment"),
			VoiceOrSpeech("Voice/Speech"),
			Ui("UI");

			override val action: kotlin.String = "StopSound"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sound Source"
		}
	}

	object HealthAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			MaximumHealth("Maximum health"),
			MaximumAbsorptionHealth("Maximum absorption health"),
			Armor("Armor"),
			ArmorToughness("Armor toughness");

			override val action: kotlin.String = "HealthAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "HealthAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}
}