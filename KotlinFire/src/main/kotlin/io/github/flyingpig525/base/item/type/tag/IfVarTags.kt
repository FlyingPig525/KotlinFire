package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object IfVarTags {
	object StringMatches {
		enum class RegularExpressions(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "StringMatches"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Regular Expressions"
		}
		enum class IgnoreCase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "StringMatches"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object IsFiltered {
		enum class LinkFilter(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "IsFiltered"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Link Filter"
		}
		enum class SwearFilter(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "IsFiltered"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Swear Filter"
		}
		enum class CapsFilter(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "IsFiltered"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Caps Filter"
		}
		enum class CharacterSpacing(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "IsFiltered"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Character Spacing"
		}
		enum class CharacterDragFilter(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "IsFiltered"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Character Drag Filter"
		}
	}

	object StartsWith {
		enum class IgnoreCase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "StartsWith"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object VarIsType {
		enum class VariableType(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Number("Number", true),
			String("String", false),
			StyledText("Styled Text", false),
			Location("Location", false),
			Item("Item", false),
			List("List", false),
			PotionEffect("Potion effect", false),
			Sound("Sound", false),
			Particle("Particle", false),
			Vector("Vector", false),
			Dictionary("Dictionary", false);

			override val action: kotlin.String = "VarIsType"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Variable Type"
		}
	}

	object TextMatches {
		enum class RegularExpressions(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Enable("Enable", false),
			/** **Default** */
			Disable("Disable", true);

			override val action: kotlin.String = "TextMatches"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Regular Expressions"
		}
		enum class IgnoreCase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "TextMatches"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object InRange {
		enum class LocationHandling(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Block("Block", false),
			/** **Default** */
			Exact("Exact", true);

			override val action: kotlin.String = " InRange "
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Location Handling"
		}
	}

	object DictHasKeys {
		enum class CheckMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			HasAnyKey("Has Any Key", true),
			HasAllKeys("Has All Keys", false);

			override val action: kotlin.String = "DictHasKeys"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object ItemEquals {
		enum class ComparisonMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			ExactlyEquals("Exactly equals", true),
			IgnoreStackSize("Ignore stack size", false),
			IgnoreDurabilityAndStackSize("Ignore durability and stack size", false),
			MaterialOnly("Material only", false);

			override val action: kotlin.String = "ItemEquals"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Comparison Mode"
		}
	}

	object ListContains {
		enum class CheckMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			HasAnyValue("Has Any Value", true),
			HasAllValues("Has All Values", false);

			override val action: kotlin.String = "ListContains"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object LocIsNear {
		enum class Shape(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Sphere("Sphere", true),
			Circle("Circle", false),
			Cube("Cube", false),
			Square("Square", false);

			override val action: kotlin.String = "LocIsNear"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Shape"
		}
	}

	object Contains {
		enum class IgnoreCase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "Contains"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object EndsWith {
		enum class IgnoreCase(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "EndsWith"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}
}