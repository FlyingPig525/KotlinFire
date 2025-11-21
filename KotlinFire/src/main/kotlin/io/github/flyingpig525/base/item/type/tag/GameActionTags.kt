package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object GameActionTags {
	object ChangeSign {
		enum class SignSide(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Front("Front", true),
			Back("Back", false);

			override val action: kotlin.String = "ChangeSign"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sign Side"
		}
	}

	object WebRequest {
		enum class RequestMethod(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Post("Post", true),
			Get("Get", false),
			Put("Put", false),
			Delete("Delete", false);

			override val action: kotlin.String = "WebRequest"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Request Method"
		}
		enum class ContentType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			TextOrPlain("text/plain", true),
			ApplicationOrJson("application/json", false);

			override val action: kotlin.String = "WebRequest"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Content Type"
		}
	}

	object SetBlockData {
		enum class OverwriteExistingData(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "SetBlockData"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Overwrite Existing Data"
		}
	}

	object Firework {
		enum class Instant(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "Firework"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Instant"
		}
		enum class Movement(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Upwards("Upwards", true),
			Directional("Directional", false);

			override val action: kotlin.String = "Firework"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Movement"
		}
	}

	object SpawnItem {
		enum class ApplyItemMotion(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SpawnItem"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Apply Item Motion"
		}
	}

	object SignColor {
		enum class SignSide(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Front("Front", true),
			Back("Back", false);

			override val action: kotlin.String = "SignColor"
			override val block: kotlin.String = "game_action"
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

			override val action: kotlin.String = "SignColor"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Color"
		}
		enum class Glowing(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SignColor"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Glowing"
		}
	}

	object SpawnInteraction {
		enum class Responsive(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "SpawnInteraction"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Responsive"
		}
	}

	object CloneRegion {
		enum class IgnoreAir(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "CloneRegion"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Air"
		}
		enum class CloneBlockEntities(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "CloneRegion"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Clone Block Entities"
		}
	}

	object SpawnArmorStand {
		enum class Visibility(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Visible("Visible", true),
			VisibleNoHitbox("Visible (No hitbox)", false),
			Invisible("Invisible", false),
			InvisibleNoHitbox("Invisible (No hitbox)", false);

			override val action: kotlin.String = "SpawnArmorStand"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Visibility"
		}
	}

	object BoneMeal {
		enum class ShowParticles(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "BoneMeal"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Show Particles"
		}
	}

	object FallingBlock {
		enum class HurtHitEntities(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "FallingBlock"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hurt Hit Entities"
		}
		enum class ReformonImpact(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "FallingBlock"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Reform on Impact"
		}
	}

	object SpawnEnderEye {
		enum class EndofLifespan(override val option: kotlin.String, override val default: Boolean) : TagItem {
			DropItem("Drop item", false),
			Shatter("Shatter", false),
			/** **Default** */
			Random("Random", true);

			override val action: kotlin.String = "SpawnEnderEye"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "End of Lifespan"
		}
	}

	object SetBlockGrowth {
		enum class GrowthUnit(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			GrowthStageNumber("Growth Stage Number", true),
			GrowthPercentage("Growth Percentage", false);

			override val action: kotlin.String = "SetBlockGrowth"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Growth Unit"
		}
	}

	object Wait {
		enum class DelayUnit(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Ticks("Ticks", true),
			Seconds("Seconds", false),
			Minutes("Minutes", false);

			override val action: kotlin.String = "Wait"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Delay Unit"
		}
	}

	object SpawnRngItem {
		enum class ApplyItemMotion(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SpawnRngItem"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Apply Item Motion"
		}
	}

	object GenerateTree {
		enum class TreeType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			OakTree("Oak Tree", true),
			BigOakTree("Big Oak Tree", false),
			SwampTree("Swamp Tree", false),
			SpruceTree("Spruce Tree", false),
			SlightlyTallerSpruceTree("Slightly Taller Spruce Tree", false),
			BigSpruceTree("Big Spruce Tree", false),
			BirchTree("Birch Tree", false),
			TallBirchTree("Tall Birch Tree", false),
			JungleTree("Jungle Tree", false),
			BigJungleTree("Big Jungle Tree", false),
			JungleBush("Jungle Bush", false),
			AcaciaTree("Acacia Tree", false),
			DarkOakTree("Dark Oak Tree", false),
			MangroveTree("Mangrove Tree", false),
			TallMangroveTree("Tall Mangrove Tree", false),
			CherryTree("Cherry Tree", false),
			AzaleaTree("Azalea Tree", false),
			RedMushroom("Red Mushroom", false),
			BrownMushroom("Brown Mushroom", false),
			CrimsonFungus("Crimson Fungus", false),
			WarpedFungus("Warped Fungus", false),
			ChorusPlant("Chorus Plant", false);

			override val action: kotlin.String = "GenerateTree"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Tree Type"
		}
	}

	object SpawnCrystal {
		enum class ShowBottom(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SpawnCrystal"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Show Bottom"
		}
	}

	object SetCampfireItem {
		enum class CampfireSlot(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			One("1", true),
			Two("2", false),
			Three("3", false),
			Four("4", false);

			override val action: kotlin.String = "SetCampfireItem"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Campfire Slot"
		}
	}

	object SpawnTextDisplay {
		enum class TextValueMerging(override val option: kotlin.String, override val default: Boolean) : TagItem {
			AddSpaces("Add spaces", false),
			/** **Default** */
			NoSpaces("No spaces", true);

			override val action: kotlin.String = "SpawnTextDisplay"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "SpawnTextDisplay"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
		}
	}
}