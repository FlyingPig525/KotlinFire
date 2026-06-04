package io.github.flyingpig525.base.item.type.tag

@Suppress("unused", "RemoveRedundantQualifierName")
object ControlTags {
	object PrintDebug {
		enum class Permission(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Owner("Owner", false),
			/** **Default** */
			Developer("Developer", true),
			Builder("Builder", false),
			DeveloperOrBuilder("Developer or builder", false),
			Whitelisted("Whitelisted", false),
			All("All", false);

			override val action: kotlin.String = "PrintDebug"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Permission"
		}
		enum class TextValueMerging(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			AddSpaces("Add Spaces", true),
			NoSpaces("No Spaces", false);

			override val action: kotlin.String = "PrintDebug"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Text Value Merging"
		}
		enum class Highlighting(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			None("None", true),
			Error("Error", false),
			Warning("Warning", false),
			Other("Other", false);

			override val action: kotlin.String = "PrintDebug"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Highlighting"
		}
		enum class Sound(override val option: kotlin.String, override val default: Boolean) : TagItem {
			None("None", false),
			/** **Default** */
			Default("Default", true),
			Success("Success", false),
			Error("Error", false),
			Warning("Warning", false),
			Lagslayer("LagSlayer", false);

			override val action: kotlin.String = "PrintDebug"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Sound"
		}
		enum class MessageStyle(override val option: kotlin.String, override val default: Boolean) : TagItem {
			Custom("Custom", false),
			/** **Default** */
			Debug("Debug", true),
			Error("Error", false),
			Warning("Warning", false),
			Info("Info", false),
			Lagslayer("LagSlayer", false);

			override val action: kotlin.String = "PrintDebug"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Message Style"
		}
	}

	object EndAllThreads {
		enum class EndCurrentThread(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			True("True", true),
			False("False", false);

			override val action: kotlin.String = "EndAllThreads"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "End Current Thread"
		}
	}

	object Wait {
		enum class TimeUnit(override val option: kotlin.String, override val default: Boolean) : TagItem {
			/** **Default** */
			Ticks("Ticks", true),
			Seconds("Seconds", false),
			Minutes("Minutes", false);

			override val action: kotlin.String = "Wait"
			override val block: kotlin.String = "control"
			override var slot: Int = 26
			override val tag: kotlin.String = "Time Unit"
		}
	}
}