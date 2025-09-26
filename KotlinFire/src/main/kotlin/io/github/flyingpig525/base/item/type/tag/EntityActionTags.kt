package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object EntityActionTags {
	object DispRotationEuler {
		enum class RotationType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			LeftRotation("Left Rotation"),
			RightRotation("Right Rotation");

			override val action: kotlin.String = "DispRotationEuler"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rotation Type"
		}
	}

	object SetVelocity {
		enum class AddtoCurrentVelocity(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "SetVelocity"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
	}

	object DispRotAxisAngle {
		enum class RotationType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			LeftRotation("Left Rotation"),
			RightRotation("Right Rotation");

			override val action: kotlin.String = "DispRotAxisAngle"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rotation Type"
		}
	}

	object Damage {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "Damage"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetMobSitting {
		enum class IsSitting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetMobSitting"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Is Sitting"
		}
	}

	object SendAnimation {
		enum class AnimationType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			HurtAnimation("Hurt animation"),
			CritParticles("Crit particles"),
			EnchantedHitParticles("Enchanted hit particles");

			override val action: kotlin.String = "SendAnimation"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Animation Type"
		}
	}

	object SetWardenAnger {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SetWardenAnger"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetHorsePattern {
		enum class HorseColor(override val option: kotlin.String) : TagItem {
			White("White"),
			Buckskin("Buckskin"),
			/** **Default** */
			FlaxenChestnut("Flaxen chestnut"),
			Bay("Bay"),
			Black("Black"),
			DappleGray("Dapple gray"),
			DarkBay("Dark bay"),
			DontChange("Don't change");

			override val action: kotlin.String = "SetHorsePattern"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Horse Color"
		}
		enum class HorseMarkings(override val option: kotlin.String) : TagItem {
			NoMarkings("No markings"),
			/** **Default** */
			StockingsAndBlaze("Stockings and blaze"),
			Paint("Paint"),
			SnowflakeAppaloosa("Snowflake appaloosa"),
			Sooty("Sooty"),
			DontChange("Don't change");

			override val action: kotlin.String = "SetHorsePattern"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Horse Markings"
		}
	}

	object SetDyeColor {
		enum class Dye(override val option: kotlin.String) : TagItem {
			/** **Default** */
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
			Black("Black");

			override val action: kotlin.String = "SetDyeColor"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dye"
		}
	}

	object LaunchUp {
		enum class AddtoCurrentVelocity(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "LaunchUp"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
	}

	object SetAge {
		enum class AgeLock(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			Disable("Disable"),
			/** **Default** */
			DontChange("Don't change");

			override val action: kotlin.String = "SetAge"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Age Lock"
		}
	}

	object SetName {
		enum class NameTagVisibility(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Always("Always"),
			Default("Default"),
			Never("Never"),
			DontChange("Don't change");

			override val action: kotlin.String = " SetName "
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Name Tag Visibility"
		}
	}

	object SetArmsRaised {
		enum class ArmsRaised(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetArmsRaised"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Arms Raised"
		}
	}

	object SetMoveSpeed {
		enum class RelativetoEntityBase(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetMoveSpeed"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Relative to Entity Base"
		}
	}

	object SetInvulnerable {
		enum class Invulnerable(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetInvulnerable"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Invulnerable"
		}
	}

	object SetFriction {
		enum class FrictionType(override val option: kotlin.String) : TagItem {
			Normal("Normal"),
			/** **Default** */
			NoFriction("No Friction");

			override val action: kotlin.String = "SetFriction"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Friction Type"
		}
	}

	object ArmorStandTags {
		enum class IsVisible(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False"),
			/** **Default** */
			DontChange("Don't change");

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Is Visible"
		}
		enum class IsMarkerNoHitbox(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False"),
			/** **Default** */
			DontChange("Don't change");

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Is Marker (No Hitbox)"
		}
		enum class AllowItemTakingorAdding(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False"),
			/** **Default** */
			DontChange("Don't change");

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Allow Item Taking / Adding"
		}
		enum class HasPhysicsorUpdates(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False"),
			/** **Default** */
			DontChange("Don't change");

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Physics / Updates"
		}
		enum class IsSmall(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False"),
			/** **Default** */
			DontChange("Don't change");

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Is Small"
		}
		enum class HasArms(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False"),
			/** **Default** */
			DontChange("Don't change");

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Arms"
		}
		enum class HasBasePlate(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False"),
			/** **Default** */
			DontChange("Don't change");

			override val action: kotlin.String = "ArmorStandTags"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Base Plate"
		}
	}

	object MiscAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Scale("Scale"),
			FollowRange("Follow range"),
			ZombieSpawnReinforcements("Zombie spawn reinforcements"),
			OxygenBonus("Oxygen bonus"),
			BurningTime("Burning time"),
			CameraDistance("Camera distance"),
			TemptRange("Tempt range");

			override val action: kotlin.String = "MiscAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "MiscAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetMarker {
		enum class Marker(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetMarker"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Marker"
		}
	}

	object CreeperCharged {
		enum class Charged(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "CreeperCharged"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Charged"
		}
	}

	object CombatAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			AttackDamage("Attack damage"),
			AttackKnockback("Attack knockback");

			override val action: kotlin.String = "CombatAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "CombatAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetFreezeTicks {
		enum class TickingLocked(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "SetFreezeTicks"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ticking Locked"
		}
	}

	object TDisplaySeeThru {
		enum class Seethrough(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "TDisplaySeeThru"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "See-through"
		}
	}

	object SetGliding {
		enum class Gliding(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetGliding"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Gliding"
		}
	}

	object SetPandaRolling {
		enum class RollType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Roll("Roll"),
			StopRolling("Stop Rolling");

			override val action: kotlin.String = "SetPandaRolling"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Roll Type"
		}
	}

	object SetFishPattern {
		enum class PatternColor(override val option: kotlin.String) : TagItem {
			/** **Default** */
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
			Black("Black"),
			DontChange("Don't change");

			override val action: kotlin.String = "SetFishPattern"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Pattern Color"
		}
		enum class BodyColor(override val option: kotlin.String) : TagItem {
			/** **Default** */
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
			Black("Black"),
			DontChange("Don't change");

			override val action: kotlin.String = "SetFishPattern"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Body Color"
		}
		enum class Pattern(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Kob("Kob"),
			Sunstreak("Sunstreak"),
			Snooper("Snooper"),
			Dasher("Dasher"),
			Brinely("Brinely"),
			Spotty("Spotty"),
			Flopper("Flopper"),
			Stripey("Stripey"),
			Glitter("Glitter"),
			Blockfish("Blockfish"),
			Betty("Betty"),
			Clayfish("Clayfish"),
			DontChange("Don't change");

			override val action: kotlin.String = "SetFishPattern"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Pattern"
		}
	}

	object SetTemperature {
		enum class TemperatureType(override val option: kotlin.String) : TagItem {
			Cold("Cold"),
			/** **Default** */
			Temperate("Temperate"),
			Warm("Warm");

			override val action: kotlin.String = "SetTemperature"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Temperature Type"
		}
	}

	object SetWolfType {
		enum class WolfType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Ashen("Ashen"),
			Black("Black"),
			Chestnut("Chestnut"),
			Pale("Pale"),
			Rusty("Rusty"),
			Snowy("Snowy"),
			Spotted("Spotted"),
			Striped("Striped"),
			Woods("Woods");

			override val action: kotlin.String = "SetWolfType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Wolf Type"
		}
	}

	object SetHandItem {
		enum class HandSlot(override val option: kotlin.String) : TagItem {
			/** **Default** */
			MainHand("Main Hand"),
			OffHand("Off Hand");

			override val action: kotlin.String = "SetHandItem"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hand Slot"
		}
	}

	object LaunchToward {
		enum class AddtoCurrentVelocity(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "LaunchToward"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
		enum class IgnoreDistance(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "LaunchToward"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Distance"
		}
	}

	object FaceLocation {
		enum class FaceDirection(override val option: kotlin.String) : TagItem {
			/** **Default** */
			TowardLocation("Toward location"),
			AwayFromLocation("Away from location");

			override val action: kotlin.String = "FaceLocation"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Face Direction"
		}
	}

	object SetCatType {
		enum class SkinType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Tabby("Tabby"),
			Tuxedo("Tuxedo"),
			Red("Red"),
			Siamese("Siamese"),
			BritishShorthair("British Shorthair"),
			Calico("Calico"),
			Persian("Persian"),
			Ragdoll("Ragdoll"),
			White("White"),
			Jellie("Jellie"),
			Black("Black");

			override val action: kotlin.String = "SetCatType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Skin Type"
		}
	}

	object TDisplayAlign {
		enum class TextAlignment(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Center("Center"),
			Left("Left"),
			Right("Right");

			override val action: kotlin.String = "TDisplayAlign"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Alignment"
		}
	}

	object DisplayBillboard {
		enum class BillboardType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Fixed("Fixed"),
			Vertical("Vertical"),
			Horizontal("Horizontal"),
			Center("Center");

			override val action: kotlin.String = "DisplayBillboard"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Billboard Type"
		}
	}

	object SetGoatScreaming {
		enum class Screams(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetGoatScreaming"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Screams"
		}
	}

	object SetBeeStinger {
		enum class HasStinger(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetBeeStinger"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Stinger"
		}
	}

	object FoxSleeping {
		enum class Sleeping(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "FoxSleeping"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sleeping"
		}
	}

	object SetEquipment {
		enum class EquipmentSlot(override val option: kotlin.String) : TagItem {
			/** **Default** */
			MainHand("Main hand"),
			OffHand("Off hand"),
			Head("Head"),
			Body("Body"),
			Legs("Legs"),
			Feet("Feet"),
			Saddle("Saddle"),
			HorseArmor("Horse armor"),
			Decor("Decor");

			override val action: kotlin.String = "SetEquipment"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Equipment Slot"
		}
	}

	object SetSilenced {
		enum class Silenced(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetSilenced"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Silenced"
		}
	}

	object SetBeeNectar {
		enum class HasNectar(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetBeeNectar"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Nectar"
		}
	}

	object AttachLead {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "AttachLead"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object ArmorStandSlots {
		enum class Interactions(override val option: kotlin.String) : TagItem {
			/** **Default** */
			TakeSwapOrPlaceItem("Take, swap or place item"),
			TakeOrSwapItem("Take or swap item"),
			TakeItem("Take item"),
			PlaceItem("Place item"),
			None("None");

			override val action: kotlin.String = "ArmorStandSlots"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Interactions"
		}
		enum class EquipmentSlot(override val option: kotlin.String) : TagItem {
			/** **Default** */
			All("All"),
			MainHand("Main hand"),
			OffHand("Off hand"),
			Head("Head"),
			Chest("Chest"),
			Legs("Legs"),
			Feet("Feet");

			override val action: kotlin.String = "ArmorStandSlots"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Equipment Slot"
		}
	}

	object SetAllayDancing {
		enum class Dancing(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetAllayDancing"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Dancing"
		}
	}

	object SetRabbitType {
		enum class SkinType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Brown("Brown"),
			White("White"),
			Black("Black"),
			BlackAndWhite("Black and White"),
			Gold("Gold"),
			SaltAndPepper("Salt and Pepper"),
			Killer("Killer");

			override val action: kotlin.String = "SetRabbitType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Skin Type"
		}
	}

	object SetAngry {
		enum class Angry(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetAngry"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Angry"
		}
	}

	object SetDeathDrops {
		enum class HasDeathDrops(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetDeathDrops"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has Death Drops"
		}
	}

	object SetPersistent {
		enum class Persistent(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetPersistent"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Persistent"
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
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Name Color"
		}
	}

	object SetCarryingChest {
		enum class CarryingChest(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetCarryingChest"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Carrying Chest"
		}
	}

	object SetParrotColor {
		enum class ParrotColor(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Red("Red"),
			Blue("Blue"),
			Green("Green"),
			Cyan("Cyan"),
			Gray("Gray");

			override val action: kotlin.String = "SetParrotColor"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Parrot Color"
		}
	}

	object SetSheepSheared {
		enum class Sheared(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetSheepSheared"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sheared"
		}
	}

	object SetAxolotlColor {
		enum class AxolotlColor(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Pink("Pink"),
			Brown("Brown"),
			Yellow("Yellow"),
			Cyan("Cyan"),
			Blue("Blue");

			override val action: kotlin.String = "SetAxolotlColor"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Axolotl Color"
		}
	}

	object SetAI {
		enum class AI(override val option: kotlin.String) : TagItem {
			Sentient("Sentient"),
			Insentient("Insentient"),
			/** **Default** */
			None("None");

			override val action: kotlin.String = "SetAI"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "AI"
		}
	}

	object KBAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			KnockbackResistance("Knockback resistance"),
			ExplosionKnockbackResistance("Explosion knockback resistance");

			override val action: kotlin.String = "KBAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "KBAttribute"
			override val block: kotlin.String = "entity_action"
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
			StepHeight("Step height"),
			MovementEfficiency("Movement efficiency"),
			WaterMovementEfficiency("Water movement efficiency");

			override val action: kotlin.String = "MovementAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "MovementAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetRiptiding {
		enum class Riptiding(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetRiptiding"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Riptiding"
		}
	}

	object SetArrowNoClip {
		enum class HasNoClip(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetArrowNoClip"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Has NoClip"
		}
	}

	object FallingAttribute {
		enum class Attribute(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Gravity("Gravity"),
			SafeFallDistance("Safe fall distance"),
			FallDamageMultiplier("Fall damage multiplier");

			override val action: kotlin.String = "FallingAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "FallingAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object SetProjSource {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SetProjSource"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetFoxLeaping {
		enum class Leaping(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetFoxLeaping"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Leaping"
		}
	}

	object SetPandaGene {
		enum class SetGene(override val option: kotlin.String) : TagItem {
			MainGene("Main gene"),
			HiddenGene("Hidden gene"),
			/** **Default** */
			Both("Both");

			override val action: kotlin.String = "SetPandaGene"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Set Gene"
		}
		enum class GeneType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Aggressive("Aggressive"),
			Lazy("Lazy"),
			Weak("Weak"),
			Worried("Worried"),
			Playful("Playful"),
			Normal("Normal"),
			Brown("Brown");

			override val action: kotlin.String = "SetPandaGene"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Gene Type"
		}
	}

	object SetMaxHealth {
		enum class HealMobtoMaxHealth(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "SetMaxHealth"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Heal Mob to Max Health"
		}
	}

	object FrogEat {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "FrogEat"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetSalmonType {
		enum class SalmonType(override val option: kotlin.String) : TagItem {
			Small("Small"),
			/** **Default** */
			Medium("Medium"),
			Large("Large");

			override val action: kotlin.String = "SetSalmonType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Salmon Type"
		}
	}

	object SetProfession {
		enum class Profession(override val option: kotlin.String) : TagItem {
			Unemployed("Unemployed"),
			/** **Default** */
			Armorer("Armorer"),
			Butcher("Butcher"),
			Cartographer("Cartographer"),
			Cleric("Cleric"),
			Farmer("Farmer"),
			Fisherman("Fisherman"),
			Fletcher("Fletcher"),
			Leatherworker("Leatherworker"),
			Librarian("Librarian"),
			Mason("Mason"),
			Nitwit("Nitwit"),
			Shepherd("Shepherd"),
			Toolsmith("Toolsmith"),
			Weaponsmith("Weaponsmith");

			override val action: kotlin.String = "SetProfession"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Profession"
		}
	}

	object ArmorStandParts {
		enum class Arms(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable"),
			DontChange("Don't change");

			override val action: kotlin.String = "ArmorStandParts"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Arms"
		}
		enum class BasePlate(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable"),
			DontChange("Don't change");

			override val action: kotlin.String = "ArmorStandParts"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Base Plate"
		}
	}

	object SetNameVisible {
		enum class NameTagVisibility(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Always("Always"),
			Default("Default"),
			Never("Never");

			override val action: kotlin.String = " SetNameVisible "
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Name Tag Visibility"
		}
	}

	object SetTarget {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SetTarget"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object TDisplayShadow {
		enum class TextShadow(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "TDisplayShadow"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Shadow"
		}
	}

	object SetShulkerPeek {
		enum class IsSilent(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetShulkerPeek"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Is Silent"
		}
	}

	object SetPose {
		enum class Pose(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Standing("Standing"),
			Sleeping("Sleeping"),
			Swimming("Swimming"),
			Sneaking("Sneaking");

			override val action: kotlin.String = " SetPose "
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Pose"
		}
	}

	object SetRearing {
		enum class Rearing(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetRearing"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rearing"
		}
	}

	object SetGravity {
		enum class Gravity(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "SetGravity"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Gravity"
		}
	}

	object InteractResponse {
		enum class Responsive(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "InteractResponse"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Responsive"
		}
	}

	object UseItem {
		enum class Hand(override val option: kotlin.String) : TagItem {
			/** **Default** */
			MainHand("Main Hand"),
			OffHand("Off Hand");

			override val action: kotlin.String = "UseItem"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hand"
		}
		enum class UseItem(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "UseItem"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Use Item"
		}
	}

	object RideEntity {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "RideEntity"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetWolfSoundType {
		enum class WolfSoundType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Angry("Angry"),
			Big("Big"),
			Classic("Classic"),
			Cute("Cute"),
			Grumpy("Grumpy"),
			Puglin("Puglin"),
			Sad("Sad");

			override val action: kotlin.String = "SetWolfSoundType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Wolf Sound Type"
		}
	}

	object SnifferState {
		enum class Behavior(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Idle("Idle"),
			FeelingHappy("Feeling Happy"),
			Scenting("Scenting"),
			Sniffing("Sniffing"),
			Searching("Searching"),
			Digging("Digging");

			override val action: kotlin.String = "SnifferState"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Behavior"
		}
	}

	object Teleport {
		enum class KeepCurrentRotation(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "Teleport"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Keep Current Rotation"
		}
	}

	object SetVisualFire {
		enum class OnFire(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SetVisualFire"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "On Fire"
		}
	}

	object SetSaddle {
		enum class Saddle(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetSaddle"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Saddle"
		}
	}

	object SetBulletTarget {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "SetBulletTarget"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetDragonPhase {
		enum class Phase(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Flying("Flying"),
			Hovering("Hovering"),
			BreathAttack("Breath attack"),
			Dying("Dying");

			override val action: kotlin.String = "SetDragonPhase"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Phase"
		}
	}

	object SetLlamaColor {
		enum class LlamaColor(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Brown("Brown"),
			Creamy("Creamy"),
			White("White"),
			Gray("Gray");

			override val action: kotlin.String = "SetLlamaColor"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Llama Color"
		}
	}

	object SetVillagerBiome {
		enum class Biome(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Desert("Desert"),
			Jungle("Jungle"),
			Plains("Plains"),
			Savanna("Savanna"),
			Snow("Snow"),
			Swamp("Swamp"),
			Taiga("Taiga");

			override val action: kotlin.String = "SetVillagerBiome"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Biome"
		}
	}

	object SetBaby {
		enum class Baby(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetBaby"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Baby"
		}
	}

	object MooshroomType {
		enum class MooshroomVariant(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Red("Red"),
			Brown("Brown");

			override val action: kotlin.String = "MooshroomType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Mooshroom Variant"
		}
	}

	object SetInvisible {
		enum class Invisible(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetInvisible"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Invisible"
		}
	}

	object SetCatResting {
		enum class Resting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetCatResting"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Resting"
		}
	}

	object GivePotion {
		enum class OverwriteEffect(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "GivePotion"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Overwrite Effect"
		}
		enum class EffectParticles(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Regular("Regular"),
			Ambient("Ambient"),
			None("None");

			override val action: kotlin.String = "GivePotion"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Effect Particles"
		}
	}

	object SetGoatHorns {
		enum class LeftHorn(override val option: kotlin.String) : TagItem {
			Show("Show"),
			Hide("Hide"),
			/** **Default** */
			NoChange("No Change");

			override val action: kotlin.String = "SetGoatHorns"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Left Horn"
		}
		enum class RightHorn(override val option: kotlin.String) : TagItem {
			Show("Show"),
			Hide("Hide"),
			/** **Default** */
			NoChange("No Change");

			override val action: kotlin.String = "SetGoatHorns"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Right Horn"
		}
	}

	object SetGlowing {
		enum class Glowing(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetGlowing"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Glowing"
		}
	}

	object SetPandaOnBack {
		enum class OnItsBack(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetPandaOnBack"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "On Its Back"
		}
	}

	object IDisplayModelType {
		enum class ModelType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			None("None"),
			FirstPersonLeftHand("First Person Left Hand"),
			FirstPersonRightHand("First Person Right Hand"),
			ThirdPersonLeftHand("Third Person Left Hand"),
			ThirdPersonRightHand("Third Person Right Hand"),
			Head("Head"),
			Gui("GUI"),
			Ground("Ground"),
			Fixed("Fixed");

			override val action: kotlin.String = "IDisplayModelType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Model Type"
		}
	}

	object SetCollidable {
		enum class Collision(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "SetCollidable"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Collision"
		}
	}

	object ArmorStandPose {
		enum class ArmorStandPart(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Head("Head"),
			Body("Body"),
			LeftArm("Left Arm"),
			RightArm("Right Arm"),
			LeftLeg("Left Leg"),
			RightLeg("Right Leg");

			override val action: kotlin.String = "ArmorStandPose"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Armor Stand Part"
		}
	}

	object LaunchFwd {
		enum class AddtoCurrentVelocity(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "LaunchFwd"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Add to Current Velocity"
		}
		enum class LaunchAxis(override val option: kotlin.String) : TagItem {
			/** **Default** */
			PitchAndYaw("Pitch and Yaw"),
			YawOnly("Yaw Only");

			override val action: kotlin.String = "LaunchFwd"
			override val block: kotlin.String = "entity_action"
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
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Animation Arm"
		}
	}

	object SnowmanPumpkin {
		enum class Pumpkin(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			/** **Default** */
			Disable("Disable");

			override val action: kotlin.String = "SnowmanPumpkin"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Pumpkin"
		}
	}

	object SetDigging {
		enum class DiggingType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Emerge("Emerge"),
			DigDown("Dig Down");

			override val action: kotlin.String = "SetDigging"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Digging Type"
		}
	}

	object SetVexCharging {
		enum class Charging(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetVexCharging"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Charging"
		}
	}

	object SetCelebrating {
		enum class Celebrate(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SetCelebrating"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Celebrate"
		}
	}

	object TDisplayText {
		enum class TextValueMerging(override val option: kotlin.String) : TagItem {
			AddSpaces("Add spaces"),
			/** **Default** */
			NoSpaces("No spaces");

			override val action: kotlin.String = "TDisplayText"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "TDisplayText"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
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
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Attribute"
		}
		enum class ValueType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Direct("Direct"),
			PercentageBase("Percentage (Base)"),
			PercentageRelative("Percentage (Relative)");

			override val action: kotlin.String = "HealthAttribute"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Value Type"
		}
	}

	object Ram {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "Ram"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object SetFoxType {
		enum class FoxType(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Red("Red"),
			Snow("Snow");

			override val action: kotlin.String = "SetFoxType"
			override val block: kotlin.String = "entity_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Fox Type"
		}
	}
}