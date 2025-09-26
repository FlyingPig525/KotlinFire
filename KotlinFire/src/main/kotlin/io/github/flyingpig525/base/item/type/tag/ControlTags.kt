package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object ControlTags {
	object PrintDebug {
		enum class Permission(override val option: kotlin.String) : TagItem {
			Owner("Owner"),
			/** **Default** */
			Developer("Developer"),
			Builder("Builder"),
			DeveloperOrBuilder("Developer or builder"),
			Whitelisted("Whitelisted"),
			All("All");

			override val action: kotlin.String = "PrintDebug"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Permission"
		}
		enum class TextValueMerging(override val option: kotlin.String) : TagItem {
			/** **Default** */
			AddSpaces("Add Spaces"),
			NoSpaces("No Spaces");

			override val action: kotlin.String = "PrintDebug"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class Highlighting(override val option: kotlin.String) : TagItem {
			/** **Default** */
			None("None"),
			Error("Error"),
			Warning("Warning"),
			Other("Other");

			override val action: kotlin.String = "PrintDebug"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Highlighting"
		}
		enum class Sound(override val option: kotlin.String) : TagItem {
			None("None"),
			/** **Default** */
			Default("Default"),
			Success("Success"),
			Error("Error"),
			Warning("Warning"),
			Lagslayer("LagSlayer");

			override val action: kotlin.String = "PrintDebug"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sound"
		}
		enum class MessageStyle(override val option: kotlin.String) : TagItem {
			Custom("Custom"),
			/** **Default** */
			Debug("Debug"),
			Error("Error"),
			Warning("Warning"),
			Info("Info"),
			Lagslayer("LagSlayer");

			override val action: kotlin.String = "PrintDebug"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Message Style"
		}
	}

	object Wait {
		enum class TimeUnit(override val option: kotlin.String) : TagItem {
			/** **Default** */
			Ticks("Ticks"),
			Seconds("Seconds"),
			Minutes("Minutes");

			override val action: kotlin.String = "Wait"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Time Unit"
		}
	}
}