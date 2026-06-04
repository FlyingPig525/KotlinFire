package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object PlayerActionTags {
	object SetReducedDebug {
		enum class ReducedDebugInfoEnabled(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetReducedDebug"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Reduced Debug Info Enabled"
		}
	}

	object SetHandCrafting {
		enum class AllowHandCrafting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SetHandCrafting"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Allow Hand Crafting"
		}
	}

	object BossBar {
		enum class BarSlot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			SlotOne("Slot 1", true),
			SlotTwo("Slot 2", false),
			SlotThree("Slot 3", false),
			SlotFour("Slot 4", false),
			SlotFive("Slot 5", false),
			SlotSix("Slot 6", false),
			SlotSeven("Slot 7", false),
			SlotEight("Slot 8", false),
			SlotNine("Slot 9", false);

			override val action: kotlin.String = "BossBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bar Slot"
		}
		enum class BarStyle(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Solid("Solid", true),
			SixSegments("6 segments", false),
			TenSegments("10 segments", false),
			TwelveSegments("12 segments", false),
			TwentySegments("20 segments", false);

			override val action: kotlin.String = "BossBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bar Style"
		}
		enum class SkyEffect(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			None("None", true),
			CreateFog("Create fog", false),
			DarkenSky("Darken sky", false),
			Both("Both", false);

			override val action: kotlin.String = "BossBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sky Effect"
		}
		enum class BarColor(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Red("Red", false),
			/** **Default** */
			Purple("Purple", true),
			Pink("Pink", false),
			Blue("Blue", false),
			Green("Green", false),
			Yellow("Yellow", false),
			White("White", false);

			override val action: kotlin.String = "BossBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bar Color"
		}
	}

	object SetVelocity {
		enum class AddtoCurrentVelocity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "SetVelocity"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
	}

	object AddInvRow {
		enum class NewRowPosition(override val option: kotlin.String, override val default: Boolean) : TagItem {
			TopRow("Top row", false),
			/** **Default** */
			BottomRow("Bottom row", true);

			override val action: kotlin.String = "AddInvRow"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "New Row Position"
		}
	}

	object Damage {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "Damage"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SendAnimation {
		enum class AnimationType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			HurtAnimation("Hurt animation", true),
			WakeUpFadeEffect("Wake up (fade effect)", false);

			override val action: kotlin.String = "SendAnimation"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Animation Type"
		}
	}

	object SetInventoryKept {
		enum class InventoryKept(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetInventoryKept"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inventory Kept"
		}
	}

	object LaunchUp {
		enum class AddtoCurrentVelocity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "LaunchUp"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
	}

	object GetTargetEntity {
		enum class IgnoreBlocks(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "GetTargetEntity"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Blocks"
		}
	}

	object ForceFlight {
		enum class FlightMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			StartFlight("Start Flight", true),
			StopFlight("Stop Flight", false);

			override val action: kotlin.String = "ForceFlight"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Flight Mode"
		}
	}

	object LoadInv {
		enum class CodeFlow(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Synchronous("Synchronous", true),
			Asynchronous("Asynchronous", false);

			override val action: kotlin.String = "LoadInv"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Code Flow"
		}
	}

	object MiscAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Scale("Scale", true),
			Luck("Luck", false),
			OxygenBonus("Oxygen bonus", false),
			BurningTime("Burning time", false),
			CameraDistance("Camera distance", false);

			override val action: kotlin.String = "MiscAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "MiscAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SpectateTarget {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SpectateTarget"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object DisplayBellRing {
		enum class RingDirection(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			North("North", true),
			South("South", false),
			West("West", false),
			East("East", false);

			override val action: kotlin.String = "DisplayBellRing"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ring Direction"
		}
	}

	object CombatAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AttackDamage("Attack damage", true),
			AttackSpeed("Attack speed", false),
			SweepingDamageRatio("Sweeping damage ratio", false);

			override val action: kotlin.String = "CombatAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "CombatAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetGamemode {
		enum class FlightMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			RespectGamemode("Respect Gamemode", true),
			KeepOriginal("Keep Original", false);

			override val action: kotlin.String = "SetGamemode"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Flight Mode"
		}
		enum class Gamemode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Survival("Survival", true),
			Creative("Creative", false),
			Adventure("Adventure", false);

			override val action: kotlin.String = "SetGamemode"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Gamemode"
		}
	}

	object RemoveInvRow {
		enum class RowtoRemove(override val option: kotlin.String, override val default: Boolean) : TagItem {
			TopRow("Top row", false),
			/** **Default** */
			BottomRow("Bottom row", true);

			override val action: kotlin.String = "RemoveInvRow"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Row to Remove"
		}
	}

	object LSetHealth {
		enum class HealType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			RegularHealth("Regular Health", true),
			AbsorptionHealth("Absorption Health", false),
			CombinedHealth("Combined Health", false);

			override val action: kotlin.String = "L SetHealth"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Heal Type"
		}
	}

	object ClearInv {
		enum class ClearMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			EntireInventory("Entire inventory", true),
			MainInventory("Main inventory", false),
			UpperInventory("Upper inventory", false),
			Hotbar("Hotbar", false),
			Armor("Armor", false);

			override val action: kotlin.String = "ClearInv"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Clear Mode"
		}
		enum class ClearCraftingandCursor(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "ClearInv"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Clear Crafting and Cursor"
		}
	}

	object SetFreezeTicks {
		enum class TickingLocked(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SetFreezeTicks"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ticking Locked"
		}
	}

	object SetGliding {
		enum class Gliding(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetGliding"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Gliding"
		}
	}

	object OpenSign {
		enum class SignSide(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Front("Front", true),
			Back("Back", false);

			override val action: kotlin.String = "OpenSign"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sign Side"
		}
	}

	object SetFlying {
		enum class Flying(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetFlying"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Flying"
		}
	}

	object DisplayBlockOpen {
		enum class ContainerState(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Open("Open", true),
			Closed("Closed", false);

			override val action: kotlin.String = "DisplayBlockOpen"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Container State"
		}
	}

	object SetHandItem {
		enum class HandSlot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			MainHand("Main Hand", true),
			OffHand("Off Hand", false);

			override val action: kotlin.String = "SetHandItem"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hand Slot"
		}
	}

	object SendAdvancement {
		enum class ToastType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Advancement("Advancement", true),
			Goal("Goal", false),
			Challenge("Challenge", false);

			override val action: kotlin.String = "SendAdvancement"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Toast Type"
		}
	}

	object LaunchToward {
		enum class AddtoCurrentVelocity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "LaunchToward"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
		enum class IgnoreDistance(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "LaunchToward"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Distance"
		}
	}

	object DisplayGateway {
		enum class AnimationType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			InitialBeam("Initial beam", true),
			PeriodicBeam("Periodic beam", false);

			override val action: kotlin.String = "DisplayGateway"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Animation Type"
		}
	}

	object GiveExp {
		enum class GiveExperience(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Points("Points", true),
			Levels("Levels", false),
			LevelPercentage("Level Percentage", false);

			override val action: kotlin.String = "GiveExp"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Give Experience"
		}
	}

	object ActionBar {
		enum class TextValueMerging(override val option: kotlin.String, override val default: Boolean) : TagItem {
			AddSpaces("Add spaces", false),
			/** **Default** */
			NoSpaces("No spaces", true);

			override val action: kotlin.String = "ActionBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "ActionBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
		}
	}

	object DisplaySignText {
		enum class SignSide(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Front("Front", true),
			Back("Back", false);

			override val action: kotlin.String = "DisplaySignText"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sign Side"
		}
		enum class TextColor(override val option: kotlin.String, override val default: Boolean) : TagItem {
			White("White", false),
			Orange("Orange", false),
			Magenta("Magenta", false),
			LightBlue("Light blue", false),
			Yellow("Yellow", false),
			Lime("Lime", false),
			Pink("Pink", false),
			Gray("Gray", false),
			LightGray("Light gray", false),
			Cyan("Cyan", false),
			Purple("Purple", false),
			Blue("Blue", false),
			Brown("Brown", false),
			Green("Green", false),
			Red("Red", false),
			/** **Default** */
			Black("Black", true);

			override val action: kotlin.String = "DisplaySignText"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Color"
		}
		enum class Glowing(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "DisplaySignText"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Glowing"
		}
	}

	object SetSpeed {
		enum class SpeedType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			GroundSpeed("Ground speed", true),
			FlightSpeed("Flight speed", false),
			Both("Both", false);

			override val action: kotlin.String = "SetSpeed"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Speed Type"
		}
	}

	object ParticleCuboidA {
		enum class FillType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Wireframe("Wireframe", true),
			Hollow("Hollow", false),
			Solid("Solid", false);

			override val action: kotlin.String = "ParticleCuboidA"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fill Type"
		}
	}

	object PlaySound {
		enum class SoundSource(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Master("Master", true),
			Music("Music", false),
			JukeboxOrNoteBlocks("Jukebox/Note Blocks", false),
			Weather("Weather", false),
			Blocks("Blocks", false),
			HostileCreatures("Hostile Creatures", false),
			FriendlyCreatures("Friendly Creatures", false),
			Players("Players", false),
			AmbientOrEnvironment("Ambient/Environment", false),
			VoiceOrSpeech("Voice/Speech", false),
			Ui("UI", false);

			override val action: kotlin.String = "PlaySound"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sound Source"
		}
	}

	object RngTeleport {
		enum class KeepCurrentRotation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "RngTeleport"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Keep Current Rotation"
		}
	}

	object LockDisgRotation {
		enum class Pitch(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Lock("Lock", false),
			Unlock("Unlock", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = "LockDisgRotation"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Pitch"
		}
		enum class Yaw(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Lock("Lock", false),
			Unlock("Unlock", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = "LockDisgRotation"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Yaw"
		}
	}

	object RemoveBossBar {
		enum class BossBarSlot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AllBossBars("All boss bars", true),
			One("1", false),
			Two("2", false),
			Three("3", false),
			Four("4", false),
			Five("5", false),
			Six("6", false),
			Seven("7", false),
			Eight("8", false),
			Nine("9", false);

			override val action: kotlin.String = "RemoveBossBar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Boss Bar Slot"
		}
	}

	object SetEquipment {
		enum class EquipmentSlot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			MainHand("Main hand", true),
			OffHand("Off hand", false),
			Head("Head", false),
			Chest("Chest", false),
			Legs("Legs", false),
			Feet("Feet", false);

			override val action: kotlin.String = "SetEquipment"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Equipment Slot"
		}
	}

	object SetDropsEnabled {
		enum class SpawnDeathDrops(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetDropsEnabled"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Spawn Death Drops"
		}
	}

	object DisplayFracture {
		enum class OverwritePreviousFracture(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "DisplayFracture"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Overwrite Previous Fracture"
		}
	}

	object SetEntityHidden {
		enum class Hidden(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetEntityHidden"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hidden"
		}
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SetEntityHidden"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetSidebar {
		enum class Sidebar(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetSidebar"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sidebar"
		}
	}

	object ParticleCuboid {
		enum class FillType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Wireframe("Wireframe", true),
			Hollow("Hollow", false),
			Solid("Solid", false);

			override val action: kotlin.String = "ParticleCuboid"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fill Type"
		}
	}

	object SendMessageSeq {
		enum class AlignmentMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Regular("Regular", true),
			Centered("Centered", false);

			override val action: kotlin.String = "SendMessageSeq"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Alignment Mode"
		}
	}

	object SetNamePrefix {
		enum class TextType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Prefix("Prefix", true),
			Suffix("Suffix", false);

			override val action: kotlin.String = "SetNamePrefix"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Type"
		}
	}

	object InstantRespawn {
		enum class InstantRespawn(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "InstantRespawn"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Instant Respawn"
		}
	}

	object SetNameColor {
		enum class NameColor(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Black("Black", true),
			DarkBlue("Dark blue", false),
			DarkGreen("Dark green", false),
			DarkAqua("Dark aqua", false),
			DarkRed("Dark red", false),
			DarkPurple("Dark purple", false),
			Gold("Gold", false),
			Gray("Gray", false),
			DarkGray("Dark gray", false),
			Blue("Blue", false),
			Green("Green", false),
			Aqua("Aqua", false),
			Red("Red", false),
			LightPurple("Light purple", false),
			Yellow("Yellow", false),
			White("White", false),
			None("None", false);

			override val action: kotlin.String = "SetNameColor"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Name Color"
		}
	}

	object ReachAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			BlockInteractionRange("Block interaction range", true),
			EntityInteractionRange("Entity interaction range", false);

			override val action: kotlin.String = "ReachAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "ReachAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object PlayEntitySound {
		enum class SoundSource(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Master("Master", true),
			Music("Music", false),
			JukeboxOrNoteBlocks("Jukebox/Note Blocks", false),
			Weather("Weather", false),
			Blocks("Blocks", false),
			HostileCreatures("Hostile Creatures", false),
			FriendlyCreatures("Friendly Creatures", false),
			Players("Players", false),
			AmbientOrEnvironment("Ambient/Environment", false),
			VoiceOrSpeech("Voice/Speech", false),
			Ui("UI", false);

			override val action: kotlin.String = "PlayEntitySound"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sound Source"
		}
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "PlayEntitySound"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetExp {
		enum class SetExperience(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Points("Points", false),
			/** **Default** */
			Level("Level", true),
			LevelPercentage("Level Percentage", false);

			override val action: kotlin.String = "SetExp"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Set Experience"
		}
	}

	object MiningAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			BlockBreakSpeed("Block break speed", true),
			MiningEfficiency("Mining efficiency", false),
			SubmergedMiningSpeed("Submerged mining speed", false);

			override val action: kotlin.String = "MiningAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "MiningAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object KBAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			KnockbackResistance("Knockback resistance", true),
			ExplosionKnockbackResistance("Explosion knockback resistance", false);

			override val action: kotlin.String = "KBAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "KBAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object MovementAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			WalkingSpeed("Walking speed", true),
			FlyingSpeed("Flying speed", false),
			JumpStrength("Jump strength", false),
			SneakingSpeed("Sneaking speed", false),
			StepHeight("Step height", false),
			MovementEfficiency("Movement efficiency", false),
			WaterMovementEfficiency("Water movement efficiency", false);

			override val action: kotlin.String = "MovementAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "MovementAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object FallingAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Gravity("Gravity", true),
			SafeFallDistance("Safe fall distance", false),
			FallDamageMultiplier("Fall damage multiplier", false);

			override val action: kotlin.String = "FallingAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "FallingAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetAllowFlight {
		enum class AllowFlight(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetAllowFlight"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Allow Flight"
		}
	}

	object SetMaxHealth {
		enum class HealPlayertoMaxHealth(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "SetMaxHealth"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Heal Player to Max Health"
		}
	}

	object SetTabListInfo {
		enum class PlayerListField(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Header("Header", true),
			Footer("Footer", false);

			override val action: kotlin.String = "SetTabListInfo"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Player List Field"
		}
		enum class TextValueMerging(override val option: kotlin.String, override val default: Boolean) : TagItem {
			AddSpaces("Add spaces", false),
			/** **Default** */
			NoSpaces("No spaces", true);

			override val action: kotlin.String = "SetTabListInfo"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SetTabListInfo"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
		}
	}

	object ScoreLineFormat {
		enum class NumberFormat(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Fixed("Fixed", true),
			Styled("Styled", false),
			Blank("Blank", false),
			Reset("Reset", false);

			override val action: kotlin.String = "ScoreLineFormat"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Number Format"
		}
	}

	object SetBossBar {
		enum class BarStyle(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Solid("Solid", true),
			SixSegments("6 segments", false),
			TenSegments("10 segments", false),
			TwelveSegments("12 segments", false),
			TwentySegments("20 segments", false);

			override val action: kotlin.String = " SetBossBar "
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bar Style"
		}
		enum class SkyEffect(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			None("None", true),
			CreateFog("Create fog", false),
			DarkenSky("Darken sky", false),
			Both("Both", false);

			override val action: kotlin.String = " SetBossBar "
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sky Effect"
		}
		enum class BarColor(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Red("Red", false),
			/** **Default** */
			Purple("Purple", true),
			Pink("Pink", false),
			Blue("Blue", false),
			Green("Green", false),
			Yellow("Yellow", false),
			White("White", false);

			override val action: kotlin.String = " SetBossBar "
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Bar Color"
		}
	}

	object SpectatorCollision {
		enum class SpectatorCollision(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SpectatorCollision"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Spectator Collision"
		}
	}

	object SetNameVisible {
		enum class NameTagVisible(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SetNameVisible"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Name Tag Visible"
		}
	}

	object Mimic {
		enum class RemoveOriginalEntity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "Mimic"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Remove Original Entity"
		}
	}

	object RideEntity {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "RideEntity"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetInvName {
		enum class AlignmentMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Regular("Regular", true),
			Centered("Centered", false);

			override val action: kotlin.String = " SetInvName "
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Alignment Mode"
		}
	}

	object Teleport {
		enum class KeepCurrentRotation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "Teleport"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Keep Current Rotation"
		}
		enum class KeepVelocity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "Teleport"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Keep Velocity"
		}
	}

	object SetAllowPVP {
		enum class PVP(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SetAllowPVP"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "PVP"
		}
	}

	object SetVisualFire {
		enum class OnFire(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetVisualFire"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "On Fire"
		}
	}

	object SetDisguiseVisible {
		enum class DisguiseVisible(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SetDisguiseVisible"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Disguise Visible"
		}
	}

	object SendMessage {
		enum class AlignmentMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Regular("Regular", true),
			Centered("Centered", false);

			override val action: kotlin.String = "SendMessage"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Alignment Mode"
		}
		enum class TextValueMerging(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AddSpaces("Add spaces", true),
			NoSpaces("No spaces", false);

			override val action: kotlin.String = "SendMessage"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SendMessage"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
		}
	}

	object PlaySoundSeq {
		enum class SoundSource(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Master("Master", true),
			Music("Music", false),
			JukeboxOrNoteBlocks("Jukebox/Note Blocks", false),
			Weather("Weather", false),
			Blocks("Blocks", false),
			HostileCreatures("Hostile Creatures", false),
			FriendlyCreatures("Friendly Creatures", false),
			Players("Players", false),
			AmbientOrEnvironment("Ambient/Environment", false),
			VoiceOrSpeech("Voice/Speech", false),
			Ui("UI", false);

			override val action: kotlin.String = "PlaySoundSeq"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sound Source"
		}
	}

	object SetPlayerWeather {
		enum class Weather(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Clear("Clear", false),
			/** **Default** */
			Downfall("Downfall", true);

			override val action: kotlin.String = "SetPlayerWeather"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Weather"
		}
	}

	object SetShoulder {
		enum class Shoulder(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Left("Left", true),
			Right("Right", false);

			override val action: kotlin.String = "SetShoulder"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Shoulder"
		}
		enum class Type(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Remove("Remove", true),
			Red("Red", false),
			Blue("Blue", false),
			Green("Green", false),
			Cyan("Cyan", false),
			Gray("Gray", false);

			override val action: kotlin.String = "SetShoulder"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Type"
		}
	}

	object DisplayPickup {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "DisplayPickup"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object GivePotion {
		enum class ShowIcon(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "GivePotion"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Show Icon"
		}
		enum class OverwriteEffect(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "GivePotion"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Overwrite Effect"
		}
		enum class EffectParticles(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Regular("Regular", true),
			Ambient("Ambient", false),
			None("None", false);

			override val action: kotlin.String = "GivePotion"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Effect Particles"
		}
	}

	object SetCollidable {
		enum class Collision(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SetCollidable"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Collision"
		}
	}

	object LaunchFwd {
		enum class AddtoCurrentVelocity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "LaunchFwd"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
		enum class LaunchAxis(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			PitchAndYaw("Pitch and Yaw", true),
			YawOnly("Yaw Only", false);

			override val action: kotlin.String = "LaunchFwd"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Launch Axis"
		}
	}

	object AttackAnimation {
		enum class AnimationArm(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			SwingMainArm("Swing main arm", true),
			SwingOffArm("Swing off arm", false);

			override val action: kotlin.String = "AttackAnimation"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Animation Arm"
		}
	}

	object ScoreDefFormat {
		enum class NumberFormat(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Fixed("Fixed", true),
			Styled("Styled", false),
			Blank("Blank", false),
			Reset("Reset", false);

			override val action: kotlin.String = "ScoreDefFormat"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Number Format"
		}
	}

	object StopSound {
		enum class SoundSource(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Master("Master", true),
			Music("Music", false),
			JukeboxOrNoteBlocks("Jukebox/Note Blocks", false),
			Weather("Weather", false),
			Blocks("Blocks", false),
			HostileCreatures("Hostile Creatures", false),
			FriendlyCreatures("Friendly Creatures", false),
			Players("Players", false),
			AmbientOrEnvironment("Ambient/Environment", false),
			VoiceOrSpeech("Voice/Speech", false),
			Ui("UI", false);

			override val action: kotlin.String = "StopSound"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sound Source"
		}
	}

	object HealthAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			MaximumHealth("Maximum health", true),
			MaximumAbsorptionHealth("Maximum absorption health", false),
			Armor("Armor", false),
			ArmorToughness("Armor toughness", false);

			override val action: kotlin.String = "HealthAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "HealthAttribute"
			override val block: kotlin.String = "player_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}
}