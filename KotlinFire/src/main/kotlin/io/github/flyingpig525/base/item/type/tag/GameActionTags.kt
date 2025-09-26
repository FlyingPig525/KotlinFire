package io.github.flyingpig525.base.item.type.tag

@Suppress("unused")
object GameActionTags {
	object ChangeSign {
		enum class SignSide(override val option: kotlin.String) : TagItem {
			Front("Front"),
			Back("Back");

			override val action: kotlin.String = "ChangeSign"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sign Side"
		}
	}

	object WebRequest {
		enum class RequestMethod(override val option: kotlin.String) : TagItem {
			Post("Post"),
			Get("Get"),
			Put("Put"),
			Delete("Delete");

			override val action: kotlin.String = "WebRequest"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Request Method"
		}
		enum class ContentType(override val option: kotlin.String) : TagItem {
			TextOrPlain("text/plain"),
			ApplicationOrJson("application/json");

			override val action: kotlin.String = "WebRequest"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Content Type"
		}
	}

	object SetBlockData {
		enum class OverwriteExistingData(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "SetBlockData"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Overwrite Existing Data"
		}
	}

	object Firework {
		enum class Instant(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "Firework"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Instant"
		}
		enum class Movement(override val option: kotlin.String) : TagItem {
			Upwards("Upwards"),
			Directional("Directional");

			override val action: kotlin.String = "Firework"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Movement"
		}
	}

	object SpawnItem {
		enum class ApplyItemMotion(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "SpawnItem"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Apply Item Motion"
		}
	}

	object SignColor {
		enum class SignSide(override val option: kotlin.String) : TagItem {
			Front("Front"),
			Back("Back");

			override val action: kotlin.String = "SignColor"
			override val block: kotlin.String = "game_action"
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
			Black("Black");

			override val action: kotlin.String = "SignColor"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Color"
		}
		enum class Glowing(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SignColor"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Glowing"
		}
	}

	object SpawnInteraction {
		enum class Responsive(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "SpawnInteraction"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Responsive"
		}
	}

	object CloneRegion {
		enum class IgnoreAir(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "CloneRegion"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Air"
		}
		enum class CloneBlockEntities(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "CloneRegion"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Clone Block Entities"
		}
	}

	object SpawnArmorStand {
		enum class Visibility(override val option: kotlin.String) : TagItem {
			Visible("Visible"),
			VisibleNoHitbox("Visible (No hitbox)"),
			Invisible("Invisible"),
			InvisibleNoHitbox("Invisible (No hitbox)");

			override val action: kotlin.String = "SpawnArmorStand"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Visibility"
		}
	}

	object BoneMeal {
		enum class ShowParticles(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "BoneMeal"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Show Particles"
		}
	}

	object FallingBlock {
		enum class HurtHitEntities(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "FallingBlock"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Hurt Hit Entities"
		}
		enum class ReformonImpact(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "FallingBlock"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Reform on Impact"
		}
	}

	object SpawnEnderEye {
		enum class EndofLifespan(override val option: kotlin.String) : TagItem {
			DropItem("Drop item"),
			Shatter("Shatter"),
			Random("Random");

			override val action: kotlin.String = "SpawnEnderEye"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "End of Lifespan"
		}
	}

	object SetBlockGrowth {
		enum class GrowthUnit(override val option: kotlin.String) : TagItem {
			GrowthStageNumber("Growth Stage Number"),
			GrowthPercentage("Growth Percentage");

			override val action: kotlin.String = "SetBlockGrowth"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Growth Unit"
		}
	}

	object Wait {
		enum class DelayUnit(override val option: kotlin.String) : TagItem {
			Ticks("Ticks"),
			Seconds("Seconds"),
			Minutes("Minutes");

			override val action: kotlin.String = "Wait"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Delay Unit"
		}
	}

	object SpawnRngItem {
		enum class ApplyItemMotion(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "SpawnRngItem"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Apply Item Motion"
		}
	}

	object GenerateTree {
		enum class TreeType(override val option: kotlin.String) : TagItem {
			OakTree("Oak Tree"),
			BigOakTree("Big Oak Tree"),
			SwampTree("Swamp Tree"),
			SpruceTree("Spruce Tree"),
			SlightlyTallerSpruceTree("Slightly Taller Spruce Tree"),
			BigSpruceTree("Big Spruce Tree"),
			BirchTree("Birch Tree"),
			TallBirchTree("Tall Birch Tree"),
			JungleTree("Jungle Tree"),
			BigJungleTree("Big Jungle Tree"),
			JungleBush("Jungle Bush"),
			AcaciaTree("Acacia Tree"),
			DarkOakTree("Dark Oak Tree"),
			MangroveTree("Mangrove Tree"),
			TallMangroveTree("Tall Mangrove Tree"),
			CherryTree("Cherry Tree"),
			AzaleaTree("Azalea Tree"),
			RedMushroom("Red Mushroom"),
			BrownMushroom("Brown Mushroom"),
			CrimsonFungus("Crimson Fungus"),
			WarpedFungus("Warped Fungus"),
			ChorusPlant("Chorus Plant");

			override val action: kotlin.String = "GenerateTree"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Tree Type"
		}
	}

	object SpawnCrystal {
		enum class ShowBottom(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "SpawnCrystal"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Show Bottom"
		}
	}

	object SetCampfireItem {
		enum class CampfireSlot(override val option: kotlin.String) : TagItem {
			One("1"),
			Two("2"),
			Three("3"),
			Four("4");

			override val action: kotlin.String = "SetCampfireItem"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Campfire Slot"
		}
	}

	object SpawnTextDisplay {
		enum class TextValueMerging(override val option: kotlin.String) : TagItem {
			AddSpaces("Add spaces"),
			NoSpaces("No spaces");

			override val action: kotlin.String = "SpawnTextDisplay"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class InheritStyles(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "SpawnTextDisplay"
			override val block: kotlin.String = "game_action"
			override var slot: Int = 26
			override val tag: kotlin.String = "Inherit Styles"
		}
	}
}