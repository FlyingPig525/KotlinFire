package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object IfEntityTags {
	object IsRiding {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = " IsRiding "
			override val block: kotlin.String = "if_entity"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
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
			override val block: kotlin.String = "if_entity"
			override var slot: Int = 26
			override val tag: kotlin.String = "Shape"
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
			override val block: kotlin.String = "if_entity"
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
			override val block: kotlin.String = "if_entity"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Properties"
		}
		enum class CheckMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			HasAnyEffect("Has any effect", true),
			HasAllEffects("Has all effects", false);

			override val action: kotlin.String = "HasPotion"
			override val block: kotlin.String = "if_entity"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object NameEquals {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "NameEquals"
			override val block: kotlin.String = "if_entity"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}
}