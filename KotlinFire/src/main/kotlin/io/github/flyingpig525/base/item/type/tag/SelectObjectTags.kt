package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object SelectObjectTags {
	object EntityName {
		enum class IgnoreFormatting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			True("True"),
			False("False");

			override val action: kotlin.String = "EntityName"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Formatting"
		}
	}

	object FilterDistance {
		enum class IgnoreYAxis(override val option: kotlin.String) : TagItem {
			True("True"),
			/** **Default** */
			False("False");

			override val action: kotlin.String = "FilterDistance"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Ignore Y-Axis"
		}
		enum class CompareMode(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Nearest("Nearest"),
			Farthest("Farthest");

			override val action: kotlin.String = "FilterDistance"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Compare Mode"
		}
	}

	object FilterRay {
		enum class BlockCollision(override val option: kotlin.String) : TagItem {
			AllBlocks("All blocks"),
			NonFluidBlocks("Non-fluid blocks"),
			/** **Default** */
			SolidBlocks("Solid blocks"),
			None("None");

			override val action: kotlin.String = "FilterRay"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Block Collision"
		}
	}

	object EventTarget {
		enum class EventTarget(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Default("Default"),
			Killer("Killer"),
			Damager("Damager"),
			Victim("Victim"),
			Shooter("Shooter"),
			Projectile("Projectile");

			override val action: kotlin.String = "EventTarget"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Event Target"
		}
	}

	object FilterSort {
		enum class SortOrder(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Ascending("Ascending"),
			Descending("Descending");

			override val action: kotlin.String = "FilterSort"
			override val block: kotlin.String = "select"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sort Order"
		}
	}
}