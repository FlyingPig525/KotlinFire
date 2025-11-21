package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object EntityActionTags {
	object DispRotationEuler {
		enum class RotationType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			LeftRotation("Left Rotation", true),
			RightRotation("Right Rotation", false);

			override val action: kotlin.String = "DispRotationEuler"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rotation Type"
		}
	}

	object SetVelocity {
		enum class AddtoCurrentVelocity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "SetVelocity"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
	}

	object DispRotAxisAngle {
		enum class RotationType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			LeftRotation("Left Rotation", true),
			RightRotation("Right Rotation", false);

			override val action: kotlin.String = "DispRotAxisAngle"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rotation Type"
		}
	}

	object Damage {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "Damage"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetMobSitting {
		enum class IsSitting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetMobSitting"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Is Sitting"
		}
	}

	object SendAnimation {
		enum class AnimationType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			HurtAnimation("Hurt animation", true),
			CritParticles("Crit particles", false),
			EnchantedHitParticles("Enchanted hit particles", false);

			override val action: kotlin.String = "SendAnimation"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Animation Type"
		}
	}

	object SetWardenAnger {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SetWardenAnger"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetHorsePattern {
		enum class HorseColor(override val option: kotlin.String, override val default: Boolean) : TagItem {
			White("White", false),
			Buckskin("Buckskin", false),
			/** **Default** */
			FlaxenChestnut("Flaxen chestnut", true),
			Bay("Bay", false),
			Black("Black", false),
			DappleGray("Dapple gray", false),
			DarkBay("Dark bay", false),
			DontChange("Don't change", false);

			override val action: kotlin.String = "SetHorsePattern"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Horse Color"
		}
		enum class HorseMarkings(override val option: kotlin.String, override val default: Boolean) : TagItem {
			NoMarkings("No markings", false),
			/** **Default** */
			StockingsAndBlaze("Stockings and blaze", true),
			Paint("Paint", false),
			SnowflakeAppaloosa("Snowflake appaloosa", false),
			Sooty("Sooty", false),
			DontChange("Don't change", false);

			override val action: kotlin.String = "SetHorsePattern"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Horse Markings"
		}
	}

	object SetDyeColor {
		enum class Dye(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			White("White", true),
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
			Black("Black", false);

			override val action: kotlin.String = "SetDyeColor"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dye"
		}
	}

	object LaunchUp {
		enum class AddtoCurrentVelocity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "LaunchUp"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
	}

	object SetAge {
		enum class AgeLock(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			Disable("Disable", false),
			/** **Default** */
			DontChange("Don't change", true);

			override val action: kotlin.String = "SetAge"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Age Lock"
		}
	}

	object SetName {
		enum class NameTagVisibility(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Always("Always", true),
			Default("Default", false),
			Never("Never", false),
			DontChange("Don't change", false);

			override val action: kotlin.String = " SetName "
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Name Tag Visibility"
		}
	}

	object SetArmsRaised {
		enum class ArmsRaised(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetArmsRaised"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Arms Raised"
		}
	}

	object SetMoveSpeed {
		enum class RelativetoEntityBase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetMoveSpeed"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Relative to Entity Base"
		}
	}

	object SetInvulnerable {
		enum class Invulnerable(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetInvulnerable"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Invulnerable"
		}
	}

	object SetFriction {
		enum class FrictionType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Normal("Normal", false),
			/** **Default** */
			NoFriction("No Friction", true);

			override val action: kotlin.String = "SetFriction"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Friction Type"
		}
	}

	object ArmorStandTags {
		enum class IsVisible(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			False("False", false),
			/** **Default** */
			DontChange("Don't change", true);

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Is Visible"
		}
		enum class IsMarkerNoHitbox(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			False("False", false),
			/** **Default** */
			DontChange("Don't change", true);

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Is Marker (No Hitbox)"
		}
		enum class AllowItemTakingorAdding(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			False("False", false),
			/** **Default** */
			DontChange("Don't change", true);

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Allow Item Taking / Adding"
		}
		enum class HasPhysicsorUpdates(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			False("False", false),
			/** **Default** */
			DontChange("Don't change", true);

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Physics / Updates"
		}
		enum class IsSmall(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			False("False", false),
			/** **Default** */
			DontChange("Don't change", true);

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Is Small"
		}
		enum class HasArms(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			False("False", false),
			/** **Default** */
			DontChange("Don't change", true);

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Arms"
		}
		enum class HasBasePlate(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			False("False", false),
			/** **Default** */
			DontChange("Don't change", true);

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Base Plate"
		}
	}

	object MiscAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Scale("Scale", true),
			FollowRange("Follow range", false),
			ZombieSpawnReinforcements("Zombie spawn reinforcements", false),
			OxygenBonus("Oxygen bonus", false),
			BurningTime("Burning time", false),
			CameraDistance("Camera distance", false),
			TemptRange("Tempt range", false);

			override val action: kotlin.String = "MiscAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "MiscAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetMarker {
		enum class Marker(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetMarker"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Marker"
		}
	}

	object CreeperCharged {
		enum class Charged(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "CreeperCharged"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Charged"
		}
	}

	object CombatAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AttackDamage("Attack damage", true),
			AttackKnockback("Attack knockback", false);

			override val action: kotlin.String = "CombatAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "CombatAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetFreezeTicks {
		enum class TickingLocked(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SetFreezeTicks"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ticking Locked"
		}
	}

	object TDisplaySeeThru {
		enum class Seethrough(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "TDisplaySeeThru"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "See-through"
		}
	}

	object SetGliding {
		enum class Gliding(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetGliding"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Gliding"
		}
	}

	object SetPandaRolling {
		enum class RollType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Roll("Roll", true),
			StopRolling("Stop Rolling", false);

			override val action: kotlin.String = "SetPandaRolling"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Roll Type"
		}
	}

	object SetFishPattern {
		enum class PatternColor(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			White("White", true),
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
			Black("Black", false),
			DontChange("Don't change", false);

			override val action: kotlin.String = "SetFishPattern"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Pattern Color"
		}
		enum class BodyColor(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			White("White", true),
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
			Black("Black", false),
			DontChange("Don't change", false);

			override val action: kotlin.String = "SetFishPattern"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Body Color"
		}
		enum class Pattern(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Kob("Kob", true),
			Sunstreak("Sunstreak", false),
			Snooper("Snooper", false),
			Dasher("Dasher", false),
			Brinely("Brinely", false),
			Spotty("Spotty", false),
			Flopper("Flopper", false),
			Stripey("Stripey", false),
			Glitter("Glitter", false),
			Blockfish("Blockfish", false),
			Betty("Betty", false),
			Clayfish("Clayfish", false),
			DontChange("Don't change", false);

			override val action: kotlin.String = "SetFishPattern"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Pattern"
		}
	}

	object SetTemperature {
		enum class TemperatureType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Cold("Cold", false),
			/** **Default** */
			Temperate("Temperate", true),
			Warm("Warm", false);

			override val action: kotlin.String = "SetTemperature"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Temperature Type"
		}
	}

	object SetWolfType {
		enum class WolfType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Ashen("Ashen", true),
			Black("Black", false),
			Chestnut("Chestnut", false),
			Pale("Pale", false),
			Rusty("Rusty", false),
			Snowy("Snowy", false),
			Spotted("Spotted", false),
			Striped("Striped", false),
			Woods("Woods", false);

			override val action: kotlin.String = "SetWolfType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Wolf Type"
		}
	}

	object SetHandItem {
		enum class HandSlot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			MainHand("Main Hand", true),
			OffHand("Off Hand", false);

			override val action: kotlin.String = "SetHandItem"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hand Slot"
		}
	}

	object LaunchToward {
		enum class AddtoCurrentVelocity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "LaunchToward"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
		enum class IgnoreDistance(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "LaunchToward"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Distance"
		}
	}

	object FaceLocation {
		enum class FaceDirection(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			TowardLocation("Toward location", true),
			AwayFromLocation("Away from location", false);

			override val action: kotlin.String = "FaceLocation"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Face Direction"
		}
	}

	object SetCatType {
		enum class SkinType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Tabby("Tabby", true),
			Tuxedo("Tuxedo", false),
			Red("Red", false),
			Siamese("Siamese", false),
			BritishShorthair("British Shorthair", false),
			Calico("Calico", false),
			Persian("Persian", false),
			Ragdoll("Ragdoll", false),
			White("White", false),
			Jellie("Jellie", false),
			Black("Black", false);

			override val action: kotlin.String = "SetCatType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Skin Type"
		}
	}

	object TDisplayAlign {
		enum class TextAlignment(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Center("Center", true),
			Left("Left", false),
			Right("Right", false);

			override val action: kotlin.String = "TDisplayAlign"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Alignment"
		}
	}

	object DisplayBillboard {
		enum class BillboardType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Fixed("Fixed", true),
			Vertical("Vertical", false),
			Horizontal("Horizontal", false),
			Center("Center", false);

			override val action: kotlin.String = "DisplayBillboard"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Billboard Type"
		}
	}

	object SetGoatScreaming {
		enum class Screams(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetGoatScreaming"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Screams"
		}
	}

	object SetBeeStinger {
		enum class HasStinger(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetBeeStinger"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Stinger"
		}
	}

	object FoxSleeping {
		enum class Sleeping(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "FoxSleeping"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sleeping"
		}
	}

	object SetEquipment {
		enum class EquipmentSlot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			MainHand("Main hand", true),
			OffHand("Off hand", false),
			Head("Head", false),
			Body("Body", false),
			Legs("Legs", false),
			Feet("Feet", false),
			Saddle("Saddle", false),
			HorseArmor("Horse armor", false),
			Decor("Decor", false);

			override val action: kotlin.String = "SetEquipment"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Equipment Slot"
		}
	}

	object SetSilenced {
		enum class Silenced(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetSilenced"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Silenced"
		}
	}

	object SetBeeNectar {
		enum class HasNectar(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetBeeNectar"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Nectar"
		}
	}

	object AttachLead {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "AttachLead"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object ArmorStandSlots {
		enum class Interactions(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			TakeSwapOrPlaceItem("Take, swap or place item", true),
			TakeOrSwapItem("Take or swap item", false),
			TakeItem("Take item", false),
			PlaceItem("Place item", false),
			None("None", false);

			override val action: kotlin.String = "ArmorStandSlots"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Interactions"
		}
		enum class EquipmentSlot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			All("All", true),
			MainHand("Main hand", false),
			OffHand("Off hand", false),
			Head("Head", false),
			Chest("Chest", false),
			Legs("Legs", false),
			Feet("Feet", false);

			override val action: kotlin.String = "ArmorStandSlots"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Equipment Slot"
		}
	}

	object SetAllayDancing {
		enum class Dancing(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetAllayDancing"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dancing"
		}
	}

	object SetRabbitType {
		enum class SkinType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Brown("Brown", true),
			White("White", false),
			Black("Black", false),
			BlackAndWhite("Black and White", false),
			Gold("Gold", false),
			SaltAndPepper("Salt and Pepper", false),
			Killer("Killer", false);

			override val action: kotlin.String = "SetRabbitType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Skin Type"
		}
	}

	object SetAngry {
		enum class Angry(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetAngry"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Angry"
		}
	}

	object SetDeathDrops {
		enum class HasDeathDrops(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetDeathDrops"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Death Drops"
		}
	}

	object SetPersistent {
		enum class Persistent(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetPersistent"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Persistent"
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
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Name Color"
		}
	}

	object SetCarryingChest {
		enum class CarryingChest(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetCarryingChest"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Carrying Chest"
		}
	}

	object SetParrotColor {
		enum class ParrotColor(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Red("Red", true),
			Blue("Blue", false),
			Green("Green", false),
			Cyan("Cyan", false),
			Gray("Gray", false);

			override val action: kotlin.String = "SetParrotColor"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Parrot Color"
		}
	}

	object SetSheepSheared {
		enum class Sheared(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetSheepSheared"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sheared"
		}
	}

	object SetAxolotlColor {
		enum class AxolotlColor(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Pink("Pink", true),
			Brown("Brown", false),
			Yellow("Yellow", false),
			Cyan("Cyan", false),
			Blue("Blue", false);

			override val action: kotlin.String = "SetAxolotlColor"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Axolotl Color"
		}
	}

	object SetAI {
		enum class AI(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Sentient("Sentient", false),
			Insentient("Insentient", false),
			/** **Default** */
			None("None", true);

			override val action: kotlin.String = "SetAI"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "AI"
		}
	}

	object KBAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			KnockbackResistance("Knockback resistance", true),
			ExplosionKnockbackResistance("Explosion knockback resistance", false);

			override val action: kotlin.String = "KBAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "KBAttribute"
			override val block: kotlin.String = "entity_action"
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
			StepHeight("Step height", false),
			MovementEfficiency("Movement efficiency", false),
			WaterMovementEfficiency("Water movement efficiency", false);

			override val action: kotlin.String = "MovementAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "MovementAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetRiptiding {
		enum class Riptiding(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetRiptiding"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Riptiding"
		}
	}

	object SetArrowNoClip {
		enum class HasNoClip(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetArrowNoClip"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has NoClip"
		}
	}

	object FallingAttribute {
		enum class Attribute(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Gravity("Gravity", true),
			SafeFallDistance("Safe fall distance", false),
			FallDamageMultiplier("Fall damage multiplier", false);

			override val action: kotlin.String = "FallingAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "FallingAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetProjSource {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SetProjSource"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetFoxLeaping {
		enum class Leaping(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetFoxLeaping"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Leaping"
		}
	}

	object SetPandaGene {
		enum class SetGene(override val option: kotlin.String, override val default: Boolean) : TagItem {
			MainGene("Main gene", false),
			HiddenGene("Hidden gene", false),
			/** **Default** */
			Both("Both", true);

			override val action: kotlin.String = "SetPandaGene"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Set Gene"
		}
		enum class GeneType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Aggressive("Aggressive", true),
			Lazy("Lazy", false),
			Weak("Weak", false),
			Worried("Worried", false),
			Playful("Playful", false),
			Normal("Normal", false),
			Brown("Brown", false);

			override val action: kotlin.String = "SetPandaGene"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Gene Type"
		}
	}

	object SetMaxHealth {
		enum class HealMobtoMaxHealth(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "SetMaxHealth"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Heal Mob to Max Health"
		}
	}

	object FrogEat {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "FrogEat"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetSalmonType {
		enum class SalmonType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Small("Small", false),
			/** **Default** */
			Medium("Medium", true),
			Large("Large", false);

			override val action: kotlin.String = "SetSalmonType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Salmon Type"
		}
	}

	object SetProfession {
		enum class Profession(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Unemployed("Unemployed", false),
			/** **Default** */
			Armorer("Armorer", true),
			Butcher("Butcher", false),
			Cartographer("Cartographer", false),
			Cleric("Cleric", false),
			Farmer("Farmer", false),
			Fisherman("Fisherman", false),
			Fletcher("Fletcher", false),
			Leatherworker("Leatherworker", false),
			Librarian("Librarian", false),
			Mason("Mason", false),
			Nitwit("Nitwit", false),
			Shepherd("Shepherd", false),
			Toolsmith("Toolsmith", false),
			Weaponsmith("Weaponsmith", false);

			override val action: kotlin.String = "SetProfession"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Profession"
		}
	}

	object ArmorStandParts {
		enum class Arms(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false),
			DontChange("Don't change", false);

			override val action: kotlin.String = "ArmorStandParts"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Arms"
		}
		enum class BasePlate(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false),
			DontChange("Don't change", false);

			override val action: kotlin.String = "ArmorStandParts"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Base Plate"
		}
	}

	object SetNameVisible {
		enum class NameTagVisibility(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Always("Always", true),
			Default("Default", false),
			Never("Never", false);

			override val action: kotlin.String = " SetNameVisible "
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Name Tag Visibility"
		}
	}

	object SetTarget {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SetTarget"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object TDisplayShadow {
		enum class TextShadow(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "TDisplayShadow"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Shadow"
		}
	}

	object SetShulkerPeek {
		enum class IsSilent(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetShulkerPeek"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Is Silent"
		}
	}

	object SetPose {
		enum class Pose(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Standing("Standing", true),
			Sleeping("Sleeping", false),
			Swimming("Swimming", false),
			Sneaking("Sneaking", false);

			override val action: kotlin.String = " SetPose "
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Pose"
		}
	}

	object SetRearing {
		enum class Rearing(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetRearing"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rearing"
		}
	}

	object SetGravity {
		enum class Gravity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SetGravity"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Gravity"
		}
	}

	object InteractResponse {
		enum class Responsive(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "InteractResponse"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Responsive"
		}
	}

	object UseItem {
		enum class Hand(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			MainHand("Main Hand", true),
			OffHand("Off Hand", false);

			override val action: kotlin.String = "UseItem"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hand"
		}
		enum class UseItem(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "UseItem"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Use Item"
		}
	}

	object RideEntity {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "RideEntity"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetWolfSoundType {
		enum class WolfSoundType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Angry("Angry", true),
			Big("Big", false),
			Classic("Classic", false),
			Cute("Cute", false),
			Grumpy("Grumpy", false),
			Puglin("Puglin", false),
			Sad("Sad", false);

			override val action: kotlin.String = "SetWolfSoundType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Wolf Sound Type"
		}
	}

	object SnifferState {
		enum class Behavior(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Idle("Idle", true),
			FeelingHappy("Feeling Happy", false),
			Scenting("Scenting", false),
			Sniffing("Sniffing", false),
			Searching("Searching", false),
			Digging("Digging", false);

			override val action: kotlin.String = "SnifferState"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Behavior"
		}
	}

	object Teleport {
		enum class KeepCurrentRotation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "Teleport"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Keep Current Rotation"
		}
	}

	object SetVisualFire {
		enum class OnFire(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SetVisualFire"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "On Fire"
		}
	}

	object SetSaddle {
		enum class Saddle(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetSaddle"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Saddle"
		}
	}

	object SetBulletTarget {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SetBulletTarget"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetDragonPhase {
		enum class Phase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Flying("Flying", true),
			Hovering("Hovering", false),
			BreathAttack("Breath attack", false),
			Dying("Dying", false);

			override val action: kotlin.String = "SetDragonPhase"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Phase"
		}
	}

	object SetLlamaColor {
		enum class LlamaColor(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Brown("Brown", true),
			Creamy("Creamy", false),
			White("White", false),
			Gray("Gray", false);

			override val action: kotlin.String = "SetLlamaColor"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Llama Color"
		}
	}

	object SetVillagerBiome {
		enum class Biome(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Desert("Desert", true),
			Jungle("Jungle", false),
			Plains("Plains", false),
			Savanna("Savanna", false),
			Snow("Snow", false),
			Swamp("Swamp", false),
			Taiga("Taiga", false);

			override val action: kotlin.String = "SetVillagerBiome"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Biome"
		}
	}

	object SetBaby {
		enum class Baby(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetBaby"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Baby"
		}
	}

	object MooshroomType {
		enum class MooshroomVariant(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Red("Red", true),
			Brown("Brown", false);

			override val action: kotlin.String = "MooshroomType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Mooshroom Variant"
		}
	}

	object SetInvisible {
		enum class Invisible(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetInvisible"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Invisible"
		}
	}

	object SetCatResting {
		enum class Resting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetCatResting"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Resting"
		}
	}

	object GivePotion {
		enum class OverwriteEffect(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "GivePotion"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Overwrite Effect"
		}
		enum class EffectParticles(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Regular("Regular", true),
			Ambient("Ambient", false),
			None("None", false);

			override val action: kotlin.String = "GivePotion"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Effect Particles"
		}
	}

	object SetGoatHorns {
		enum class LeftHorn(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Show("Show", false),
			Hide("Hide", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = "SetGoatHorns"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Left Horn"
		}
		enum class RightHorn(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Show("Show", false),
			Hide("Hide", false),
			/** **Default** */
			NoChange("No Change", true);

			override val action: kotlin.String = "SetGoatHorns"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Right Horn"
		}
	}

	object SetGlowing {
		enum class Glowing(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetGlowing"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Glowing"
		}
	}

	object SetPandaOnBack {
		enum class OnItsBack(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetPandaOnBack"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "On Its Back"
		}
	}

	object IDisplayModelType {
		enum class ModelType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			None("None", true),
			FirstPersonLeftHand("First Person Left Hand", false),
			FirstPersonRightHand("First Person Right Hand", false),
			ThirdPersonLeftHand("Third Person Left Hand", false),
			ThirdPersonRightHand("Third Person Right Hand", false),
			Head("Head", false),
			Gui("GUI", false),
			Ground("Ground", false),
			Fixed("Fixed", false);

			override val action: kotlin.String = "IDisplayModelType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Model Type"
		}
	}

	object SetCollidable {
		enum class Collision(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SetCollidable"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Collision"
		}
	}

	object ArmorStandPose {
		enum class ArmorStandPart(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Head("Head", true),
			Body("Body", false),
			LeftArm("Left Arm", false),
			RightArm("Right Arm", false),
			LeftLeg("Left Leg", false),
			RightLeg("Right Leg", false);

			override val action: kotlin.String = "ArmorStandPose"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Armor Stand Part"
		}
	}

	object LaunchFwd {
		enum class AddtoCurrentVelocity(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "LaunchFwd"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
		enum class LaunchAxis(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			PitchAndYaw("Pitch and Yaw", true),
			YawOnly("Yaw Only", false);

			override val action: kotlin.String = "LaunchFwd"
			override val block: kotlin.String = "entity_action"
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
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Animation Arm"
		}
	}

	object SnowmanPumpkin {
		enum class Pumpkin(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SnowmanPumpkin"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Pumpkin"
		}
	}

	object SetDigging {
		enum class DiggingType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Emerge("Emerge", true),
			DigDown("Dig Down", false);

			override val action: kotlin.String = "SetDigging"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Digging Type"
		}
	}

	object SetVexCharging {
		enum class Charging(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetVexCharging"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Charging"
		}
	}

	object SetCelebrating {
		enum class Celebrate(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Enable("Enable", true),
			Disable("Disable", false);

			override val action: kotlin.String = "SetCelebrating"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Celebrate"
		}
	}

	object TDisplayText {
		enum class TextValueMerging(override val option: kotlin.String, override val default: Boolean) : TagItem {
			AddSpaces("Add spaces", false),
			/** **Default** */
			NoSpaces("No spaces", true);

			override val action: kotlin.String = "TDisplayText"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "TDisplayText"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
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
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Direct("Direct", true),
			PercentageBase("Percentage (Base)", false),
			PercentageRelative("Percentage (Relative)", false);

			override val action: kotlin.String = "HealthAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object Ram {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "Ram"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetFoxType {
		enum class FoxType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Red("Red", true),
			Snow("Snow", false);

			override val action: kotlin.String = "SetFoxType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fox Type"
		}
	}
}