package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object SelectObjectTags {
	object EntityName {
		enum class IgnoreFormatting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "EntityName"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object FilterDistance {
		enum class IgnoreYAxis(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "FilterDistance"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Y-Axis"
		}
		enum class CompareMode(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Nearest("Nearest", true),
			Farthest("Farthest", false);

			override val action: kotlin.String = "FilterDistance"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Compare Mode"
		}
	}

	object FilterRay {
		enum class BlockCollision(override val option: kotlin.String, override val default: Boolean) : TagItem {
			AllBlocks("All blocks", false),
			NonFluidBlocks("Non-fluid blocks", false),
			/** **Default** */
			SolidBlocks("Solid blocks", true),
			None("None", false);

			override val action: kotlin.String = "FilterRay"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Block Collision"
		}
	}

	object EventTarget {
		enum class EventTarget(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Default("Default", true),
			Killer("Killer", false),
			Damager("Damager", false),
			Victim("Victim", false),
			Shooter("Shooter", false),
			Projectile("Projectile", false);

			override val action: kotlin.String = "EventTarget"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Event Target"
		}
	}

	object FilterSort {
		enum class SortOrder(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Ascending("Ascending", true),
			Descending("Descending", false);

			override val action: kotlin.String = "FilterSort"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sort Order"
		}
	}
}