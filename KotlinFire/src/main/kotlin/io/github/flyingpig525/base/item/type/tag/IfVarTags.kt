package io.github.flyingpig525.base.item.type.tag

@Suppress("unused")
object IfVarTags {
	object StringMatches {
		enum class RegularExpressions(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "StringMatches"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Regular Expressions"
		}
		enum class IgnoreCase(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "StringMatches"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object IsFiltered {
		enum class LinkFilter(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "IsFiltered"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Link Filter"
		}
		enum class SwearFilter(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "IsFiltered"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Swear Filter"
		}
		enum class CapsFilter(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "IsFiltered"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Caps Filter"
		}
		enum class CharacterSpacing(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "IsFiltered"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Character Spacing"
		}
		enum class CharacterDragFilter(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "IsFiltered"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Character Drag Filter"
		}
	}

	object StartsWith {
		enum class IgnoreCase(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "StartsWith"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object VarIsType {
		enum class VariableType(override val option: kotlin.String) : TagItem {
			Number("Number"),
			String("String"),
			StyledText("Styled Text"),
			Location("Location"),
			Item("Item"),
			List("List"),
			PotionEffect("Potion effect"),
			Sound("Sound"),
			Particle("Particle"),
			Vector("Vector"),
			Dictionary("Dictionary");

			override val action: kotlin.String = "VarIsType"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Variable Type"
		}
	}

	object TextMatches {
		enum class RegularExpressions(override val option: kotlin.String) : TagItem {
			Enable("Enable"),
			Disable("Disable");

			override val action: kotlin.String = "TextMatches"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Regular Expressions"
		}
		enum class IgnoreCase(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "TextMatches"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object InRange {
		enum class LocationHandling(override val option: kotlin.String) : TagItem {
			Block("Block"),
			Exact("Exact");

			override val action: kotlin.String = " InRange "
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Location Handling"
		}
	}

	object DictHasKeys {
		enum class CheckMode(override val option: kotlin.String) : TagItem {
			HasAnyKey("Has Any Key"),
			HasAllKeys("Has All Keys");

			override val action: kotlin.String = "DictHasKeys"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object ItemEquals {
		enum class ComparisonMode(override val option: kotlin.String) : TagItem {
			ExactlyEquals("Exactly equals"),
			IgnoreStackSize("Ignore stack size"),
			IgnoreDurabilityAndStackSize("Ignore durability and stack size"),
			MaterialOnly("Material only");

			override val action: kotlin.String = "ItemEquals"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Comparison Mode"
		}
	}

	object ListContains {
		enum class CheckMode(override val option: kotlin.String) : TagItem {
			HasAnyValue("Has Any Value"),
			HasAllValues("Has All Values");

			override val action: kotlin.String = "ListContains"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Check Mode"
		}
	}

	object LocIsNear {
		enum class Shape(override val option: kotlin.String) : TagItem {
			Sphere("Sphere"),
			Circle("Circle"),
			Cube("Cube"),
			Square("Square");

			override val action: kotlin.String = "LocIsNear"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Shape"
		}
	}

	object Contains {
		enum class IgnoreCase(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "Contains"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}

	object EndsWith {
		enum class IgnoreCase(override val option: kotlin.String) : TagItem {
			True("True"),
			False("False");

			override val action: kotlin.String = "EndsWith"
			override val block: kotlin.String = "if_var"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Case"
		}
	}
}