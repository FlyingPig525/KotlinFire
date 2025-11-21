package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object RepeatTags {
	object Adjacent {
		enum class ChangeLocationRotation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "Adjacent"
			override val block: kotlin.String = "repeat"
			override var slot: Int = 26
			override val tag: kotlin.String = "Change Location Rotation"
		}
		enum class IncludeOriginBlock(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "Adjacent"
			override val block: kotlin.String = "repeat"
			override var slot: Int = 26
			override val tag: kotlin.String = "Include Origin Block"
		}
		enum class Pattern(override val option: kotlin.String, override val default: Boolean) : TagItem {
			CardinalFourBlocks("Cardinal (4 blocks)", false),
			SquareEightBlocks("Square (8 blocks)", false),
			/** **Default** */
			AdjacentSixBlocks("Adjacent (6 blocks)", true),
			CubeTwoSixBlocks("Cube (26 blocks)", false);

			override val action: kotlin.String = "Adjacent"
			override val block: kotlin.String = "repeat"
			override var slot: Int = 26
			override val tag: kotlin.String = "Pattern"
		}
	}

	object Path {
		enum class RotateLocation(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "Path"
			override val block: kotlin.String = "repeat"
			override var slot: Int = 26
			override val tag: kotlin.String = "Rotate Location"
		}
	}

	object ForEach {
		enum class AllowListChanges(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			FalseCopyList("False (copy list)", false);

			override val action: kotlin.String = "ForEach"
			override val block: kotlin.String = "repeat"
			override var slot: Int = 26
			override val tag: kotlin.String = "Allow List Changes"
		}
	}

	object Sphere {
		enum class PointLocationsInwards(override val option: kotlin.String, override val default: Boolean) : TagItem {
			True("True", false),
			/** **Default** */
			False("False", true);

			override val action: kotlin.String = "Sphere"
			override val block: kotlin.String = "repeat"
			override var slot: Int = 26
			override val tag: kotlin.String = "Point Locations Inwards"
		}
	}
}