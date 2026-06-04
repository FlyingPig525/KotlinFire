package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.item.type.tag.SetVariableTags
import io.github.flyingpig525.base.item.type.tag.TagItem
import kotlinx.serialization.json.JsonObjectBuilder
import kotlin.reflect.KClass
import kotlin.reflect.full.superclasses

@Suppress("unused")
class SetVariableCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(items: Items, action: String, tagClass: KClass<*>? = null, extra: JsonObjectBuilder.() -> Unit = {}) {
        val collection = ItemCollection(items)
        tagClass?.nestedClasses?.forEach { klass ->
            if (klass.superclasses.any { it.qualifiedName == "kotlin.Enum" }) {
                @Suppress("UNCHECKED_CAST")
                val entries = klass.java.enumConstants as Array<Enum<*>>
                entries.forEach { entry ->
                    if (entry is TagItem) {
                        if (!entry.default) return@forEach
                        if (collection.items.none { it is TagItem && it.tag == entry.tag })
                        collection += entry
                    }
                }
            }
        }
        blocks += Block("set_var", collection.items, action, extra)
    }
	/**
	 * Sets a particle effect's power.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to
	 * (*) change
	 *
	 * [NumItem]
	 *
	 * Particle power
	 *
	 * (*) = optional
	 */
	fun setParticlePower(items: Items) {
		block(items, "SetParticlePower")
	}


	/**
	 * Sets a variable to a string, or combines
	 * multiple values into one string.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [Item]
	 *
	 * (*) String to set to
	 *
	 * (*) = optional

	 * @see [SetVariableTags.String]
	 */
	fun string(items: Items) {
		block(items, "String", tagClass = SetVariableTags.String::class)
	}


	/**
	 * Gets a list of all capture groups
	 * in a Regex match.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * Input string
	 *
	 * [StringItem]
	 *
	 * Regex pattern
	 *
	 * (*) = optional
	 */
	fun allRegexGroups(items: Items) {
		block(items, "AllRegexGroups")
	}


	/**
	 * Sets the contents of a bundle.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Bundle
	 *
	 * [MinecraftItem]
	 *
	 * (*) Contents
	 *
	 * (*) = optional
	 */
	fun setBundleItems(items: Items) {
		block(items, "SetBundleItems")
	}


	/**
	 * Sets a particle effect's type.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to
	 * (*) change
	 *
	 * [StringItem]
	 *
	 * Type
	 *
	 * (*) = optional
	 */
	fun setParticleType(items: Items) {
		block(items, "SetParticleType")
	}


	/**
	 */
	fun setItemEnchants(items: Items) {
		block(items, "SetItemEnchants")
	}


	/**
	 * Removes all item custom tags.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * (*) = optional
	 */
	fun clearItemTag(items: Items) {
		block(items, "ClearItemTag")
	}


	/**
	 * Clears all variables with names
	 * that match the given text.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Name to match
	 *
	 * (*) = optional

	 * @see [SetVariableTags.PurgeVars]
	 */
	fun purgeVars(items: Items) {
		block(items, "PurgeVars", tagClass = SetVariableTags.PurgeVars::class)
	}


	/**
	 * Shifts a location's coordinates
	 * on the X, Y, and Z axes.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to change
	 *
	 * [NumItem]
	 *
	 * (*) X Change
	 *
	 * [NumItem]
	 *
	 * (*) Y Change
	 *
	 * [NumItem]
	 *
	 * (*) Z Change
	 *
	 * (*) = optional
	 */
	fun shiftAllAxes(items: Items) {
		block(items, "ShiftAllAxes")
	}


	/**
	 * Gets a particle effect's particle
	 * display material.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * material of
	 *
	 * (*) = optional
	 */
	fun getParticleMat(items: Items) {
		block(items, "GetParticleMat")
	}


	/**
	 * Sets a particle effect's horizontal
	 * and vertical spread.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to change
	 *
	 * [NumItem]
	 *
	 * Horizontal spread
	 *
	 * [NumItem]
	 *
	 * Vertical spread
	 *
	 * (*) = optional
	 */
	fun setParticleSprd(items: Items) {
		block(items, "SetParticleSprd")
	}


	/**
	 * Makes a number positive
	 * if it is negative.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * (*) Number input
	 *
	 * (*) = optional
	 */
	fun absoluteValue(items: Items) {
		block(items, "AbsoluteValue")
	}


	/**
	 * Removes all attributes from an
	 * item with the given attribute type and slot.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item
	 *
	 * (*) = optional

	 * @see [SetVariableTags.RemoveItemAttrs]
	 */
	fun removeItemAttrs(items: Items) {
		block(items, "RemoveItemAttrs", tagClass = SetVariableTags.RemoveItemAttrs::class)
	}


	/**
	 * Adds a value to the end of a list
	 * variable.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * List to append to
	 *
	 * [Item]
	 *
	 * Value(s) to append
	 *
	 * (*) = optional
	 */
	fun appendValue(items: Items) {
		block(items, "AppendValue")
	}


	/**
	 * Sets a variable to the remainder
	 * after dividing two numbers with
	 * a whole quotient.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Dividend
	 *
	 * [NumItem]
	 *
	 * Divisor
	 *
	 * (*) = optional

	 * @see [SetVariableTags.Mod]
	 */
	fun mod(items: Items) {
		block(items, "%", tagClass = SetVariableTags.Mod::class)
	}


	/**
	 * Shifts a location along a
	 * vector.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to shift
	 *
	 * [VecItem]
	 *
	 * Shift vector
	 *
	 * [NumItem]
	 *
	 * Shift distance
	 *
	 * (*) = optional

	 * @see [SetVariableTags.ShiftOnVector]
	 */
	fun shiftOnVector(items: Items) {
		block(items, "ShiftOnVector", tagClass = SetVariableTags.ShiftOnVector::class)
	}


	/**
	 * Get an attribute's
	 * multiplier for a specific slot.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetItemAttribute]
	 */
	fun getItemAttribute(items: Items) {
		block(items, "GetItemAttribute", tagClass = SetVariableTags.GetItemAttribute::class)
	}


	/**
	 * Removes all entries from
	 * a dictionary.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Dictionary to clear
	 *
	 * (*) = optional
	 */
	fun clearDict(items: Items) {
		block(items, "ClearDict")
	}


	/**
	 * Sets a variable to the sum of
	 * the given numbers.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Numbers to add
	 *
	 * (*) = optional
	 */
	fun plus(items: Items) {
		block(items, "+")
	}


	/**
	 * Segments a string into chunks of
	 * a specified size.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * String to segment
	 *
	 * [NumItem]
	 *
	 * (*) Segment size
	 *
	 * *Default = §c1§7*
	 *
	 * (*) = optional
	 */
	fun segmentString(items: Items) {
		block(items, "SegmentString")
	}


	/**
	 * Rotates a location by shifting its pitch
	 * (up/down) or yaw (left/right) value.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to shift
	 *
	 * [NumItem]
	 *
	 * Rotation amount
	 *
	 * (*) = optional

	 * @see [SetVariableTags.ShiftRotation]
	 */
	fun shiftRotation(items: Items) {
		block(items, "ShiftRotation", tagClass = SetVariableTags.ShiftRotation::class)
	}


	/**
	 * Sets a variable to the difference
	 * between the given numbers.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Numbers to subtract
	 *
	 * (*) = optional
	 */
	fun minus(items: Items) {
		block(items, "-")
	}


	/**
	 * Gets an item's name.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get name of
	 *
	 * (*) = optional
	 */
	fun getItemName(items: Items) {
		block(items, " GetItemName ")
	}


	/**
	 * Gets an item's rarity.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item
	 *
	 * (*) = optional
	 */
	fun getItemRarity(items: Items) {
		block(items, "GetItemRarity")
	}


	/**
	 * Multiplies a vector's length
	 * by a number.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * (*) Vector to multiply
	 *
	 * [NumItem]
	 *
	 * Multiplier
	 *
	 * (*) = optional
	 */
	fun multiplyVector(items: Items) {
		block(items, "MultiplyVector")
	}


	/**
	 * Sets a variable to the quotient
	 * of the given numbers.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Numbers to divide
	 *
	 * (*) = optional

	 * @see [SetVariableTags.Divide]
	 */
	fun divide(items: Items) {
		block(items, "/", tagClass = SetVariableTags.Divide::class)
	}


	/**
	 * Splits a list into separate variables.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * List to destructure
	 *
	 * [VarItem]
	 *
	 * Variable(s) to set
	 *
	 * (*) = optional
	 */
	fun destructureList(items: Items) {
		block(items, "DestructureList")
	}


	/**
	 */
	fun getSignText(items: Items) {
		block(items, "GetSignText", tagClass = SetVariableTags.GetSignText::class)
	}


	/**
	 * Sets a variable to the result
	 * of a bitwise operation.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Operand 1
	 *
	 * [NumItem]
	 *
	 * (*) Operand 2
	 *
	 * (*) = optional

	 * @see [SetVariableTags.Bitwise]
	 */
	fun bitwise(items: Items) {
		block(items, "Bitwise", tagClass = SetVariableTags.Bitwise::class)
	}


	/**
	 * Gets the displayed page
	 * number of a Lectern.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Lectern location
	 *
	 * (*) = optional
	 */
	fun getLecternPage(items: Items) {
		block(items, "GetLecternPage")
	}


	/**
	 */
	fun parseX(items: Items) {
		block(items, "ParseX")
	}


	/**
	 * Shifts the X, Y, or Z coordinate
	 * of a location on its axis.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to shift
	 *
	 * [NumItem]
	 *
	 * Shift distance
	 *
	 * (*) = optional

	 * @see [SetVariableTags.ShiftOnAxis]
	 */
	fun shiftOnAxis(items: Items) {
		block(items, "ShiftOnAxis", tagClass = SetVariableTags.ShiftOnAxis::class)
	}


	/**
	 */
	fun parseY(items: Items) {
		block(items, "ParseY")
	}


	/**
	 * Sets a variable to the vector
	 * between two locations.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Start location
	 *
	 * [LocItem]
	 *
	 * End location
	 *
	 * (*) = optional
	 */
	fun vectorBetween(items: Items) {
		block(items, "VectorBetween")
	}


	/**
	 */
	fun parseZ(items: Items) {
		block(items, "ParseZ")
	}


	/**
	 * Sets which sound an item
	 * makes when it breaks.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [SoundItem]
	 *
	 * Break sound
	 *
	 * (*) = optional
	 */
	fun setBreakSound(items: Items) {
		block(items, "SetBreakSound")
	}


	/**
	 * Gets a vector's X, Y, or Z
	 * component.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * Vector to get
	 * component of
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetVectorComp]
	 */
	fun getVectorComp(items: Items) {
		block(items, "GetVectorComp", tagClass = SetVariableTags.GetVectorComp::class)
	}


	/**
	 * Sets a variable to a value.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [Item]
	 *
	 * Value
	 *
	 * (*) = optional
	 */
	fun equalTo(items: Items) {
		block(items, "=")
	}


	/**
	 */
	fun rmText(items: Items) {
		block(items, "RmText", tagClass = SetVariableTags.RmText::class)
	}


	/**
	 * Adds an attribute modifier to an
	 * item, which is active in a certain
	 * equipment slot.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item
	 *
	 * [NumItem]
	 *
	 * Modifier Amount
	 *
	 * (*) = optional

	 * @see [SetVariableTags.AddItemAttribute]
	 */
	fun addItemAttribute(items: Items) {
		block(items, "AddItemAttribute", tagClass = SetVariableTags.AddItemAttribute::class)
	}


	/**
	 * Finds an average position (center)
	 * of the given locations.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Locations to center
	 *
	 * (*) = optional
	 */
	fun getCenterLoc(items: Items) {
		block(items, "GetCenterLoc")
	}


	/**
	 * Decodes Base64-encoded
	 * bytes as a list of numbers.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Base64 byte(s) to decode
	 *
	 * (*) = optional

	 * @see [SetVariableTags.Base64Decode]
	 */
	fun base64Decode(items: Items) {
		block(items, "Base64Decode", tagClass = SetVariableTags.Base64Decode::class)
	}


	/**
	 * Aligns a location to the center
	 * or corner of the block it is in.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to align
	 *
	 * (*) = optional

	 * @see [SetVariableTags.AlignLoc]
	 */
	fun alignLoc(items: Items) {
		block(items, "AlignLoc", tagClass = SetVariableTags.AlignLoc::class)
	}


	/**
	 * Gets a sound's volume.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * Sound to get volume of
	 *
	 * (*) = optional
	 */
	fun getSoundVolume(items: Items) {
		block(items, "GetSoundVolume")
	}


	/**
	 * Sets a variable to a random
	 * number between two other
	 * numbers.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Minimum number
	 *
	 * [NumItem]
	 *
	 * Maximum number
	 *
	 * (*) = optional

	 * @see [SetVariableTags.RandomNumber]
	 */
	fun randomNumber(items: Items) {
		block(items, "RandomNumber", tagClass = SetVariableTags.RandomNumber::class)
	}


	/**
	 * Gets a crossbow's
	 * loaded projectile list.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Crossbow
	 *
	 * (*) = optional
	 */
	fun getCrossbowProj(items: Items) {
		block(items, "GetCrossbowProj")
	}


	/**
	 * Decompresses Gzip-compressed
	 * bytes as a list of numbers.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Byte(s) to decompress
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GzipDecompress]
	 */
	fun gzipDecompress(items: Items) {
		block(items, "GzipDecompress", tagClass = SetVariableTags.GzipDecompress::class)
	}


	/**
	 * Gets a container's name at
	 * a location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * (*) = optional
	 */
	fun containerName(items: Items) {
		block(items, "ContainerName")
	}


	/**
	 * Raycasts from a location
	 * to the first intersection.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Ray origin
	 *
	 * [NumItem]
	 *
	 * Ray distance
	 *
	 * (*) = optional

	 * @see [SetVariableTags.Raycast]
	 */
	fun raycast(items: Items) {
		block(items, "Raycast", tagClass = SetVariableTags.Raycast::class)
	}


	/**
	 * Rotates a vector around
	 * another vector by an angle.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * (*) Vector to rotate
	 *
	 * [VecItem]
	 *
	 * Axis vector
	 *
	 * [NumItem]
	 *
	 * Angle
	 *
	 * (*) = optional

	 * @see [SetVariableTags.RotateAroundVec]
	 */
	fun rotateAroundVec(items: Items) {
		block(items, "RotateAroundVec", tagClass = SetVariableTags.RotateAroundVec::class)
	}


	/**
	 */
	fun setItemFood(items: Items) {
		block(items, "SetItemFood", tagClass = SetVariableTags.SetItemFood::class)
	}


	/**
	 * Gets a particle effect's particle
	 * motion.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * motion of
	 *
	 * (*) = optional
	 */
	fun getParticleMotion(items: Items) {
		block(items, "GetParticleMotion")
	}


	/**
	 * Sets an item's custom tooltip.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [StringItem]
	 *
	 * (*) Tooltip key
	 *
	 * *A namespaced key (§b"minecraft:"§7 by default)*
	 *
	 * (*) = optional
	 */
	fun setTooltipStyle(items: Items) {
		block(items, "SetTooltipStyle")
	}


	/**
	 * Adds consumable properties to an item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [SoundItem]
	 *
	 * (*) Consuming sound
	 *
	 * [NumItem]
	 *
	 * (*) Nutrition
	 *
	 * [NumItem]
	 *
	 * (*) Saturation
	 *
	 * [NumItem]
	 *
	 * (*) Use duration
	 * (*) (seconds)
	 *
	 * *Default = §c1.6§7*
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetConsumable]
	 */
	fun setConsumable(items: Items) {
		block(items, "SetConsumable", tagClass = SetVariableTags.SetConsumable::class)
	}


	/**
	 * Sets a particle effect's particle
	 * motion and motion variation.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to
	 * (*) change
	 *
	 * [VecItem]
	 *
	 * (*) Particle motion
	 *
	 * [NumItem]
	 *
	 * (*) Motion variation (%)
	 *
	 * (*) = optional
	 */
	fun setParticleMotion(items: Items) {
		block(items, "SetParticleMotion")
	}


	/**
	 * Sets a variable to the average
	 * of the given numbers.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Numbers to average
	 *
	 * (*) = optional
	 */
	fun average(items: Items) {
		block(items, "Average")
	}


	/**
	 */
	fun wrapNumber(items: Items) {
		block(items, "WrapNumber")
	}


	/**
	 * Clamps a location to a region
	 * defined by 2 corners.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to clamp
	 *
	 * [LocItem]
	 *
	 * Corner 1
	 *
	 * [LocItem]
	 *
	 * Corner 2
	 *
	 * (*) = optional

	 * @see [SetVariableTags.ClampLoc]
	 */
	fun clampLoc(items: Items) {
		block(items, "ClampLoc", tagClass = SetVariableTags.ClampLoc::class)
	}


	/**
	 */
	fun setY(items: Items) {
		block(items, "SetY")
	}


	/**
	 * Sets a map item's texture to the
	 * image at the given URL.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [StringItem]
	 *
	 * Image URL
	 *
	 * (*) = optional
	 */
	fun setMapTexture(items: Items) {
		block(items, "SetMapTexture")
	}


	/**
	 * Gets a block state tag
	 * value at a location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * [StringItem]
	 *
	 * Tag name
	 *
	 * (*) = optional
	 */
	fun getBlockData(items: Items) {
		block(items, "GetBlockData")
	}


	/**
	 */
	fun setX(items: Items) {
		block(items, "SetX")
	}


	/**
	 * Sorts a dictionary
	 * by its keys or values.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * (*) Dictionary to sort
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SortDict]
	 */
	fun sortDict(items: Items) {
		block(items, "SortDict", tagClass = SetVariableTags.SortDict::class)
	}


	/**
	 * Gets the book on the
	 * Lectern at a location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Lectern location
	 *
	 * (*) = optional
	 */
	fun getLecternBook(items: Items) {
		block(items, "GetLecternBook")
	}


	/**
	 * Gets the key of a custom sound.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * Sound to get key of
	 *
	 * (*) = optional
	 */
	fun getCustomSound(items: Items) {
		block(items, "GetCustomSound")
	}


	/**
	 * Sets a variable to the cross
	 * product of two vectors.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * Vector 1
	 *
	 * [VecItem]
	 *
	 * Vector 2
	 *
	 * (*) = optional
	 */
	fun crossProduct(items: Items) {
		block(items, "CrossProduct")
	}


	/**
	 * Sets a variable to the product
	 * of the given numbers.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Numbers to multiply
	 *
	 * (*) = optional
	 */
	fun x(items: Items) {
		block(items, "x")
	}


	/**
	 * Gets a particle effect's roll.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * roll of
	 *
	 * (*) = optional
	 */
	fun getParticleRoll(items: Items) {
		block(items, "GetParticleRoll")
	}


	/**
	 */
	fun parseYaw(items: Items) {
		block(items, "ParseYaw")
	}


	/**
	 * Sets a variable to the dot
	 * product of two vectors.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * Vector 1
	 *
	 * [VecItem]
	 *
	 * Vector 2
	 *
	 * (*) = optional
	 */
	fun dotProduct(items: Items) {
		block(items, "DotProduct")
	}


	/**
	 */
	fun setZ(items: Items) {
		block(items, "SetZ")
	}


	/**
	 * Sets the trim of an
	 * armor item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetArmorTrim]
	 */
	fun setArmorTrim(items: Items) {
		block(items, "SetArmorTrim", tagClass = SetVariableTags.SetArmorTrim::class)
	}


	/**
	 * Gets a list variable's value at
	 * an index and removes it.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * List to get value of
	 *
	 * [NumItem]
	 *
	 * (*) Index
	 *
	 * *Default = Last index*
	 *
	 * (*) = optional
	 */
	fun popListValue(items: Items) {
		block(items, "PopListValue")
	}


	/**
	 * Sets a particle effect's opacity.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to
	 * (*) change
	 *
	 * [NumItem]
	 *
	 * Particle opacity
	 *
	 * (*) = optional
	 */
	fun setParticleOpac(items: Items) {
		block(items, "SetParticleOpac")
	}


	/**
	 * Gets a seeded noise value.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Noise location
	 *
	 * [NumItem]
	 *
	 * (*) Frequency
	 *
	 * *Modifies the scale that the noise generates at. Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Octaves
	 *
	 * *Adds an additional layer of noise to the output. §c1§7-§c16§7, Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Lacunarity
	 *
	 * *Every time a new octave is added, the frequency is multiplied by this value. Default = §c1.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Gain
	 *
	 * *Every time a new octave is added, the weight of it is multiplied by this value. Default = §c0.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Generation seed
	 *
	 * (*) = optional

	 * @see [SetVariableTags.Noise]
	 */
	fun noise(items: Items) {
		block(items, "Noise", tagClass = SetVariableTags.Noise::class)
	}


	/**
	 * Sets a variable to the lowest
	 * number in a set.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Number set
	 * to compare
	 *
	 * (*) = optional
	 */
	fun minNumber(items: Items) {
		block(items, "MinNumber")
	}


	/**
	 * Gets a potion effect's type.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [PotionItem]
	 *
	 * Potion to get
	 * type of
	 *
	 * (*) = optional
	 */
	fun getPotionType(items: Items) {
		block(items, "GetPotionType")
	}


	/**
	 */
	fun setItemName(items: Items) {
		block(items, "SetItemName")
	}


	/**
	 * Gets the number of values
	 * a list has.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * List to measure
	 *
	 * (*) = optional
	 */
	fun listLength(items: Items) {
		block(items, "ListLength")
	}


	/**
	 * Sets a variable to the trigonometric
	 * sine function of a number.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Number input
	 *
	 * (*) = optional

	 * @see [SetVariableTags.Sine]
	 */
	fun sine(items: Items) {
		block(items, "Sine", tagClass = SetVariableTags.Sine::class)
	}


	/**
	 * Sets a variable to the name
	 * of the direction of a vector.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * Direction
	 *
	 * (*) = optional
	 */
	fun directionName(items: Items) {
		block(items, "DirectionName")
	}


	/**
	 * Repeats a string the given number
	 * of times.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * String to repeat
	 *
	 * [NumItem]
	 *
	 * Times to repeat
	 *
	 * (*) = optional
	 */
	fun repeatString(items: Items) {
		block(items, "RepeatString")
	}


	/**
	 */
	fun getItemLore(items: Items) {
		block(items, "GetItemLore")
	}


	/**
	 * Combines a list of strings.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * Strings to join
	 *
	 * [StringItem]
	 *
	 * (*) Joining string
	 *
	 * [StringItem]
	 *
	 * (*) Final joining string
	 *
	 * (*) = optional
	 */
	fun joinString(items: Items) {
		block(items, "JoinString")
	}


	/**
	 * Reverses the order of a
	 * list variable's values.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * (*) List to reverse
	 *
	 * (*) = optional
	 */
	fun reverseList(items: Items) {
		block(items, "ReverseList")
	}


	/**
	 * Removes list elements that appear
	 * more than once.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * (*) List to de-duplicate
	 *
	 * (*) = optional
	 */
	fun dedupList(items: Items) {
		block(items, "DedupList")
	}


	/**
	 * Creates a dictionary with the
	 * given keys and values.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * (*) Key list
	 *
	 * [VarItem]
	 *
	 * (*) Value list
	 *
	 * (*) = optional
	 */
	fun createDict(items: Items) {
		block(items, "CreateDict")
	}


	/**
	 * Gets an item's leftover item that
	 * gets replaced on use, e.g. drinking
	 * stew gives a bowl.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get remainder of
	 *
	 * (*) = optional
	 */
	fun getItemLeftover(items: Items) {
		block(items, "GetItemLeftover")
	}


	/**
	 * Gets a list of blocks that
	 * belongs to the specified
	 * block tag.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * Block tag ID
	 *
	 * *Example: §b"#mineable/pickaxe"§7*
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetBlockByMCTag]
	 */
	fun getBlockByMCTag(items: Items) {
		block(items, "GetBlockByMCTag", tagClass = SetVariableTags.GetBlockByMCTag::class)
	}


	/**
	 */
	fun roundNumber(items: Items) {
		block(items, "RoundNumber", tagClass = SetVariableTags.RoundNumber::class)
	}


	/**
	 * Sets a location's rotation to
	 * face another location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to change
	 *
	 * [LocItem]
	 *
	 * Target location
	 *
	 * (*) = optional

	 * @see [SetVariableTags.FaceLocation]
	 */
	fun faceLocation(items: Items) {
		block(items, "FaceLocation", tagClass = SetVariableTags.FaceLocation::class)
	}


	/**
	 */
	fun getItemLoreLine(items: Items) {
		block(items, "GetItemLoreLine")
	}


	/**
	 * Sets a vector's length. This
	 * affects all components.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * (*) Vector to change
	 *
	 * [NumItem]
	 *
	 * (*) Length
	 *
	 * *Default = §c1§7*
	 *
	 * (*) = optional
	 */
	fun setVectorLength(items: Items) {
		block(items, "SetVectorLength")
	}


	/**
	 * Sets a potion effect's duration.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [PotionItem]
	 *
	 * (*) Potion to change
	 *
	 * [NumItem]
	 *
	 * Duration (ticks)
	 *
	 * (*) = optional
	 */
	fun setPotionDur(items: Items) {
		block(items, "SetPotionDur")
	}


	/**
	 * Gets a block's blast resistance.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Block to check
	 *
	 * [LocItem]
	 *
	 * Location to check
	 *
	 * (*) = optional
	 */
	fun blockResistance(items: Items) {
		block(items, "BlockResistance")
	}


	/**
	 * Splits a string into a list of strings.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * String to split
	 *
	 * [StringItem]
	 *
	 * (*) Splitter string
	 *
	 * *Default = §b" "§7*
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SplitString]
	 */
	fun splitString(items: Items) {
		block(items, "SplitString", tagClass = SetVariableTags.SplitString::class)
	}


	/**
	 * Sets a variable to a normally distributed
	 * random number. Values closer to μ are
	 * more likely to be chosen.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * μ (Mean midpoint)
	 *
	 * [NumItem]
	 *
	 * σ (Standard deviation)
	 *
	 * (*) = optional

	 * @see [SetVariableTags.NormalRandom]
	 */
	fun normalRandom(items: Items) {
		block(items, "NormalRandom", tagClass = SetVariableTags.NormalRandom::class)
	}


	/**
	 * Sets a potion effect's type.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [PotionItem]
	 *
	 * (*) Potion to change
	 *
	 * [StringItem]
	 *
	 * Type
	 *
	 * (*) = optional
	 */
	fun setPotionType(items: Items) {
		block(items, "SetPotionType")
	}


	/**
	 * Gets the value of a specific Regex Group
	 * in a Regex match.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * Input string
	 *
	 * [StringItem]
	 *
	 * Regex pattern
	 *
	 * [StringItem]
	 *
	 * Group name
	 *
	 * [NumItem]
	 *
	 * Group index
	 *
	 * (*) = optional
	 */
	fun getRegexGroup(items: Items) {
		block(items, "GetRegexGroup")
	}


	/**
	 * Gets a particle effect's power.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * power of
	 *
	 * (*) = optional
	 */
	fun getParticlePower(items: Items) {
		block(items, "GetParticlePower")
	}


	/**
	 * Aligns a vector to the
	 * nearest axis.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * (*) Vector to align
	 *
	 * (*) = optional
	 */
	fun alignVector(items: Items) {
		block(items, "AlignVector")
	}


	/**
	 * Sets an item's durability.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item
	 *
	 * [NumItem]
	 *
	 * Item durability
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetItemDura]
	 */
	fun setItemDura(items: Items) {
		block(items, "SetItemDura", tagClass = SetVariableTags.SetItemDura::class)
	}


	/**
	 * Sets a player head's texture
	 * using an owning player
	 * or custom texture.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Player head
	 *
	 * [StringItem]
	 *
	 * Owner name, UUID or
	 * texture value
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetHeadTexture]
	 */
	fun setHeadTexture(items: Items) {
		block(items, " SetHeadTexture ", tagClass = SetVariableTags.SetHeadTexture::class)
	}


	/**
	 * Sets whether an item is
	 * unbreakable.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetBreakability]
	 */
	fun setBreakability(items: Items) {
		block(items, "SetBreakability", tagClass = SetVariableTags.SetBreakability::class)
	}


	/**
	 * Set an item's maximum stack size.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [NumItem]
	 *
	 * (*) Maximum stack size
	 * (*) (1-99)
	 *
	 * (*) = optional
	 */
	fun setMaxAmount(items: Items) {
		block(items, "SetMaxAmount")
	}


	/**
	 */
	fun raycastEntity(items: Items) {
		block(items, "RaycastEntity")
	}


	/**
	 * Sets the given key to the value.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Dictionary to add to
	 *
	 * [StringItem]
	 *
	 * Key
	 *
	 * [Item]
	 *
	 * Value
	 *
	 * (*) = optional
	 */
	fun setDictValue(items: Items) {
		block(items, "SetDictValue")
	}


	/**
	 * Sets a location's coordinates or
	 * creates a new location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to change
	 *
	 * [NumItem]
	 *
	 * (*) New X
	 *
	 * [NumItem]
	 *
	 * (*) New Y
	 *
	 * [NumItem]
	 *
	 * (*) New Z
	 *
	 * [NumItem]
	 *
	 * (*) New Pitch
	 *
	 * [NumItem]
	 *
	 * (*) New Yaw
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetAllCoords]
	 */
	fun setAllCoords(items: Items) {
		block(items, "SetAllCoords", tagClass = SetVariableTags.SetAllCoords::class)
	}


	/**
	 * Creates a color hex based on red,
	 * green, and blue channels.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Red (0-255)
	 *
	 * [NumItem]
	 *
	 * Green (0-255)
	 *
	 * [NumItem]
	 *
	 * Blue (0-255)
	 *
	 * [VarItem]
	 *
	 * R, G, B values
	 *
	 * (*) = optional
	 */
	fun rGBColor(items: Items) {
		block(items, "RGBColor")
	}


	/**
	 * Sets which blocks an item
	 * can break in Adventure Mode.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [MinecraftItem]
	 *
	 * Breakable blocks
	 *
	 * (*) = optional
	 */
	fun setCanDestroy(items: Items) {
		block(items, "SetCanDestroy")
	}


	/**
	 * Creates a color based on hue,
	 * saturation, and lightness.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Hue (Color circle, 0-360)
	 *
	 * [NumItem]
	 *
	 * (*) Saturation (0-100)
	 *
	 * *Default = §c100§7*
	 *
	 * [NumItem]
	 *
	 * (*) Lightness (0-100)
	 *
	 * *Default = §c50§7*
	 *
	 * [VarItem]
	 *
	 * H, S, L values
	 *
	 * (*) = optional
	 */
	fun hSLColor(items: Items) {
		block(items, "HSLColor")
	}


	/**
	 */
	fun getDirection(items: Items) {
		block(items, " GetDirection ", tagClass = SetVariableTags.GetDirection::class)
	}


	/**
	 * Removes a list variable's value
	 * at an index and shifts all values
	 * after it to the left.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * List to change
	 *
	 * [NumItem]
	 *
	 * Index to remove
	 *
	 * (*) = optional
	 */
	fun removeListIndex(items: Items) {
		block(items, "RemoveListIndex")
	}


	/**
	 * Gets cellular noise: A type of noise
	 * based on distance from cell origins.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Noise location
	 *
	 * [NumItem]
	 *
	 * (*) Frequency
	 *
	 * *Modifies the scale that the noise generates at. Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Marbling
	 *
	 * *Every §c0.5§7 adds an additional ring to the noise output. Default = §c0.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Octaves
	 *
	 * *Adds an additional layer of cellular noise to the output. §c1§7-§c16§7, Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Lacunarity
	 *
	 * *Every time a new octave is added, the frequency is multiplied by this value. Default = §c1.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Gain
	 *
	 * *Every time a new octave is added, the weight of it is multiplied by this value. Default = §c0.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Warping
	 *
	 * *Distorts the noise output. Default = §c0§7*
	 *
	 * [NumItem]
	 *
	 * (*) Resonance
	 *
	 * *Modifies the frequency of warping. Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Domains
	 *
	 * *Adds an additional layer of warping to the output. Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Domain lacunarity
	 *
	 * *Every time a new domain is added, the resonance is multiplied by this value. Default = §c1.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Domain gain
	 *
	 * *Every time a new domain is added, the weight of it is multiplied by this value. Default = §c0.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Generation seed
	 *
	 * (*) = optional

	 * @see [SetVariableTags.CellularNoise]
	 */
	fun cellularNoise(items: Items) {
		block(items, "CellularNoise", tagClass = SetVariableTags.CellularNoise::class)
	}


	/**
	 * Encodes bytes as a list
	 * of numbers to Base64.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Byte(s) to encode
	 *
	 * (*) = optional
	 */
	fun base64Encode(items: Items) {
		block(items, "Base64Encode")
	}


	/**
	 * Finds the logarithm of a number.
	 * A logarithm is the power the
	 * base must be raised to to get
	 * the given input.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * (*) Number input
	 *
	 * [NumItem]
	 *
	 * Base
	 *
	 * (*) = optional
	 */
	fun logarithm(items: Items) {
		block(items, "Logarithm")
	}


	/**
	 * Sets the value of or creates
	 * a custom stored tag value.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [StringItem]
	 *
	 * Tag name
	 *
	 * [NumItem]
	 *
	 * Tag value
	 *
	 * [StringItem]
	 *
	 * Tag value
	 *
	 * (*) = optional
	 */
	fun setItemTag(items: Items) {
		block(items, "SetItemTag")
	}


	/**
	 * Trims a string, starting and ending
	 * at the given positions.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * (*) String to trim
	 *
	 * [NumItem]
	 *
	 * Start character position
	 *
	 * [NumItem]
	 *
	 * (*) End character position
	 *
	 * *Default = String length*
	 *
	 * (*) = optional
	 */
	fun trimString(items: Items) {
		block(items, "TrimString")
	}


	/**
	 */
	fun parseMiniMessageExpr(items: Items) {
		block(items, "ParseMiniMessageExpr", tagClass = SetVariableTags.ParseMiniMessageExpr::class)
	}


	/**
	 * Gets an item's stack size.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get stack
	 * size of
	 *
	 * (*) = optional
	 */
	fun getItemAmount(items: Items) {
		block(items, "GetItemAmount")
	}


	/**
	 * Sets a potion effect's amplifier.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [PotionItem]
	 *
	 * (*) Potion to change
	 *
	 * [NumItem]
	 *
	 * Amplifier
	 *
	 * (*) = optional
	 */
	fun setPotionAmp(items: Items) {
		block(items, "SetPotionAmp")
	}


	/**
	 * Gets which blocks an item
	 * can break in Adventure Mode.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item
	 *
	 * (*) = optional
	 */
	fun getCanDestroy(items: Items) {
		block(items, "GetCanDestroy")
	}


	/**
	 * Rotates a vector around an
	 * axis by an angle.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * (*) Vector to rotate
	 *
	 * [NumItem]
	 *
	 * Angle
	 *
	 * (*) = optional

	 * @see [SetVariableTags.RotateAroundAxis]
	 */
	fun rotateAroundAxis(items: Items) {
		block(items, "RotateAroundAxis", tagClass = SetVariableTags.RotateAroundAxis::class)
	}


	/**
	 * Gets an item's current or
	 * maximum durability.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetItemDura]
	 */
	fun getItemDura(items: Items) {
		block(items, "GetItemDura", tagClass = SetVariableTags.GetItemDura::class)
	}


	/**
	 * Shifts a location forward, upward,
	 * or sideways based on its rotation.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to shift
	 *
	 * [NumItem]
	 *
	 * (*) Shift distance
	 *
	 * *Default = §c1§7*
	 *
	 * (*) = optional

	 * @see [SetVariableTags.ShiftInDirection]
	 */
	fun shiftInDirection(items: Items) {
		block(items, "ShiftInDirection", tagClass = SetVariableTags.ShiftInDirection::class)
	}


	/**
	 * Sets a variable to a vector
	 * facing a given rotation.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Pitch
	 *
	 * [NumItem]
	 *
	 * Yaw
	 *
	 * [NumItem]
	 *
	 * (*) Length
	 *
	 * *Default = §c1§7*
	 *
	 * (*) = optional
	 */
	fun rotationVector(items: Items) {
		block(items, "RotationVector")
	}


	/**
	 * Converts JSON to a value.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * JSON to convert
	 *
	 * (*) = optional
	 */
	fun jsonToValue(items: Items) {
		block(items, "JsonToValue")
	}


	/**
	 * Checks if a number is inside
	 * the bounds and if not, wraps
	 * it around the farthest bound.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * (*) Number to wrap
	 *
	 * [NumItem]
	 *
	 * Lower bound (inclusive)
	 *
	 * [NumItem]
	 *
	 * Upper bound (exclusive)
	 *
	 * (*) = optional
	 */
	fun wrapNum(items: Items) {
		block(items, "WrapNum")
	}


	/**
	 * Sets the numerical model values
	 * on an item, used in resource packs.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [NumItem]
	 *
	 * Number model value(s)
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetModelDataNums]
	 */
	fun setModelDataNums(items: Items) {
		block(items, "SetModelDataNums", tagClass = SetVariableTags.SetModelDataNums::class)
	}


	/**
	 * Searches for part of a string
	 * and replaces it.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable
	 * to set
	 *
	 * [StringItem]
	 *
	 * String to change
	 *
	 * [StringItem]
	 *
	 * String part to replace
	 *
	 * [StringItem]
	 *
	 * Replacement
	 *
	 * (*) = optional

	 * @see [SetVariableTags.ReplaceString]
	 */
	fun replaceString(items: Items) {
		block(items, "ReplaceString", tagClass = SetVariableTags.ReplaceString::class)
	}


	/**
	 * Sets whether an item is
	 * glowing regardless of
	 * its enchantments.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetItemGlowing]
	 */
	fun setItemGlowing(items: Items) {
		block(items, "SetItemGlowing", tagClass = SetVariableTags.SetItemGlowing::class)
	}


	/**
	 * Sets a compass's lodestone location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [LocItem]
	 *
	 * Lodestone location
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetLodestoneLoc]
	 */
	fun setLodestoneLoc(items: Items) {
		block(items, "SetLodestoneLoc", tagClass = SetVariableTags.SetLodestoneLoc::class)
	}


	/**
	 * Sets a variable to a list with
	 * its sub-lists spread out
	 * into individual elements.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * (*) List to flatten
	 *
	 * (*) = optional
	 */
	fun flattenList(items: Items) {
		block(items, "FlattenList")
	}


	/**
	 * Sets an item's rarity, affecting its
	 * default name color.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetItemRarity]
	 */
	fun setItemRarity(items: Items) {
		block(items, "SetItemRarity", tagClass = SetVariableTags.SetItemRarity::class)
	}


	/**
	 * Gets a block's hardness value.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Block to check
	 *
	 * [LocItem]
	 *
	 * Location to check
	 *
	 * (*) = optional
	 */
	fun blockHardness(items: Items) {
		block(items, "BlockHardness")
	}


	/**
	 * Gets a potion effect's amplifier.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [PotionItem]
	 *
	 * Potion to get
	 * amplifier of
	 *
	 * (*) = optional
	 */
	fun getPotionAmp(items: Items) {
		block(items, "GetPotionAmp")
	}


	/**
	 * Gets the contents of a bundle.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Bundle
	 *
	 * (*) = optional
	 */
	fun getBundleItems(items: Items) {
		block(items, "GetBundleItems")
	}


	/**
	 * Gets a particle effect's particle
	 * amount.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * amount of
	 *
	 * (*) = optional
	 */
	fun getParticleAmount(items: Items) {
		block(items, "GetParticleAmount")
	}


	/**
	 * Creates a random vector that
	 * lies on a sphere. Generated
	 * vectors will be uniformly
	 * distributed on its surface.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * (*) Vector length
	 *
	 * *Default = §c1§7*
	 *
	 * (*) = optional
	 */
	fun randomVector(items: Items) {
		block(items, "RandomVector")
	}


	/**
	 * Gets the number of entries
	 * in a dictionary.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * Dictionary to
	 * measure
	 *
	 * (*) = optional
	 */
	fun getDictSize(items: Items) {
		block(items, "GetDictSize")
	}


	/**
	 * Sets an item's stack size.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [NumItem]
	 *
	 * Stack size
	 *
	 * (*) = optional
	 */
	fun setItemAmount(items: Items) {
		block(items, "SetItemAmount")
	}


	/**
	 * Sets a variable to the difference
	 * between the given vectors.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * Vectors to subtract
	 *
	 * (*) = optional
	 */
	fun subtractVectors(items: Items) {
		block(items, "SubtractVectors")
	}


	/**
	 * Sets a string's capitalization
	 * (eg. to uppercase).
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * (*) String to change
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetCase]
	 */
	fun setCase(items: Items) {
		block(items, "SetCase", tagClass = SetVariableTags.SetCase::class)
	}


	/**
	 * Swaps two of a vector's
	 * X, Y, or Z components.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * (*) Vector to swap
	 * (*) components of
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SwapVectorComp]
	 */
	fun swapVectorComp(items: Items) {
		block(items, "SwapVectorComp", tagClass = SetVariableTags.SwapVectorComp::class)
	}


	/**
	 * Sets a particle effect's particle
	 * color and color variation.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to
	 * (*) change
	 *
	 * [StringItem]
	 *
	 * Color hexadecimal
	 *
	 * *Example: §b"#FF0000"§7 (red)*
	 *
	 * [NumItem]
	 *
	 * (*) Color variation (%)
	 *
	 * (*) = optional
	 */
	fun setParticleColor(items: Items) {
		block(items, "SetParticleColor")
	}


	/**
	 * Gets the light level at
	 * a location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Light location
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetLight]
	 */
	fun getLight(items: Items) {
		block(items, "GetLight", tagClass = SetVariableTags.GetLight::class)
	}


	/**
	 * Gets a book's text.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Book
	 *
	 * [NumItem]
	 *
	 * Page number
	 *
	 * (*) = optional
	 */
	fun getBookText(items: Items) {
		block(items, " GetBookText ")
	}


	/**
	 * Gets the list of values
	 * in this dictionary.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * Dictionary to
	 * pull from
	 *
	 * (*) = optional
	 */
	fun getDictValues(items: Items) {
		block(items, "GetDictValues")
	}


	/**
	 * Sets a variable to a vector.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * X component
	 *
	 * [NumItem]
	 *
	 * Y component
	 *
	 * [NumItem]
	 *
	 * Z component
	 *
	 * [StringItem]
	 *
	 * Direction name
	 *
	 * *One of the following: §b"north"§7, §b"east"§7, §b"south"§7, §b"west"§7,  §b"up"§7, §b"down"§7*
	 *
	 * (*) = optional
	 */
	fun vector(items: Items) {
		block(items, "Vector")
	}


	/**
	 * Sets a variable to the distance
	 * between two locations.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Location 1
	 *
	 * [LocItem]
	 *
	 * Location 2
	 *
	 * (*) = optional

	 * @see [SetVariableTags.Distance]
	 */
	fun distance(items: Items) {
		block(items, "Distance", tagClass = SetVariableTags.Distance::class)
	}


	/**
	 */
	fun setItemLore(items: Items) {
		block(items, "SetItemLore")
	}


	/**
	 * Parses a MiniMessage expression from
	 * a string value into a styled text.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * String to parse
	 *
	 * (*) = optional

	 * @see [SetVariableTags.ParseMiniMessage]
	 */
	fun parseMiniMessage(items: Items) {
		block(items, "ParseMiniMessage", tagClass = SetVariableTags.ParseMiniMessage::class)
	}


	/**
	 * Takes the root of a number.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * (*) Number input
	 *
	 * [NumItem]
	 *
	 * (*) Root index
	 *
	 * *Default = §c2§7 (²√input)*
	 *
	 * (*) = optional
	 */
	fun root(items: Items) {
		block(items, "Root")
	}


	/**
	 * Sets the model string values
	 * on an item, used in resource packs.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [StringItem]
	 *
	 * String model value(s)
	 *
	 * (*) = optional
	 */
	fun setModelDataStrs(items: Items) {
		block(items, "SetModelDataStrs")
	}


	/**
	 * Sets a particle effect's particle
	 * amount.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to
	 * (*) change
	 *
	 * [NumItem]
	 *
	 * Particle amount
	 *
	 * (*) = optional
	 */
	fun setParticleAmount(items: Items) {
		block(items, "SetParticleAmount")
	}


	/**
	 * Adds an enchantment to an item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [StringItem]
	 *
	 * Enchantment name
	 *
	 * [NumItem]
	 *
	 * Enchantment level
	 *
	 * (*) = optional
	 */
	fun addItemEnchant(items: Items) {
		block(items, "AddItemEnchant")
	}


	/**
	 * Adds a rule for breaking blocks
	 * to a tool item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [NumItem]
	 *
	 * Mining speed
	 *
	 * [MinecraftItem]
	 *
	 * Blocks to apply
	 * the rule for
	 *
	 * [StringItem]
	 *
	 * Block tag ID to
	 * apply the rule for
	 *
	 * *Example: §b"#mineable/pickaxe"§7*
	 *
	 * (*) = optional

	 * @see [SetVariableTags.AddItemToolRule]
	 */
	fun addItemToolRule(items: Items) {
		block(items, "AddItemToolRule", tagClass = SetVariableTags.AddItemToolRule::class)
	}


	/**
	 * Gets an item's material.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get material of
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetItemType]
	 */
	fun getItemType(items: Items) {
		block(items, "GetItemType", tagClass = SetVariableTags.GetItemType::class)
	}


	/**
	 * Gets a single line from
	 * an item's lore.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get lore from
	 *
	 * [NumItem]
	 *
	 * Lore line to get
	 *
	 * (*) = optional
	 */
	fun getLoreLine(items: Items) {
		block(items, "GetLoreLine")
	}


	/**
	 * Sets a variable to the
	 * arc tangent of 2 numbers.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Y
	 *
	 * [NumItem]
	 *
	 * X
	 *
	 * (*) = optional

	 * @see [SetVariableTags.ArcTangent2]
	 */
	fun arcTangent2(items: Items) {
		block(items, "ArcTangent2", tagClass = SetVariableTags.ArcTangent2::class)
	}


	/**
	 * Gets a particle effect's type.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * type of
	 *
	 * (*) = optional
	 */
	fun getParticleType(items: Items) {
		block(items, "GetParticleType")
	}


	/**
	 * Sets an item's maximum durability.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item
	 *
	 * [NumItem]
	 *
	 * (*) Maximum durability
	 *
	 * (*) = optional
	 */
	fun setItemMaxDura(items: Items) {
		block(items, "SetItemMaxDura")
	}


	/**
	 * Searches for part of a string and
	 * removes all instances of it.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable
	 * to set
	 *
	 * [StringItem]
	 *
	 * (*) String to change
	 *
	 * [StringItem]
	 *
	 * String to remove
	 *
	 * (*) = optional

	 * @see [SetVariableTags.RemoveString]
	 */
	fun removeString(items: Items) {
		block(items, "RemoveString", tagClass = SetVariableTags.RemoveString::class)
	}


	/**
	 * Gets the block state tags
	 * at a location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetAllBlockData]
	 */
	fun getAllBlockData(items: Items) {
		block(items, "GetAllBlockData", tagClass = SetVariableTags.GetAllBlockData::class)
	}


	/**
	 * Sets a crossbow's loaded projectiles.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Crossbow
	 *
	 * [MinecraftItem]
	 *
	 * (*) Projectiles
	 *
	 * (*) = optional
	 */
	fun setCrossbowProj(items: Items) {
		block(items, "SetCrossbowProj")
	}


	/**
	 * Sets a variable to the highest
	 * number in a set.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Number set
	 * to compare
	 *
	 * (*) = optional
	 */
	fun maxNumber(items: Items) {
		block(items, "MaxNumber")
	}


	/**
	 * Gets the list of keys
	 * in this dictionary.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * Dictionary to
	 * pull from
	 *
	 * (*) = optional
	 */
	fun getDictKeys(items: Items) {
		block(items, "GetDictKeys")
	}


	/**
	 * Trims the content of styled text,
	 * leaving all formatting in place.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [TextItem]
	 *
	 * (*) Text to trim
	 *
	 * [NumItem]
	 *
	 * Start character position
	 *
	 * [NumItem]
	 *
	 * (*) End character position
	 *
	 * *Default = Text length*
	 *
	 * (*) = optional
	 */
	fun trimStyledText(items: Items) {
		block(items, "TrimStyledText")
	}


	/**
	 * Sets a particle effect's particle
	 * display material.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to
	 * (*) change
	 *
	 * [MinecraftItem]
	 *
	 * Particle material
	 *
	 * (*) = optional
	 */
	fun setParticleMat(items: Items) {
		block(items, "SetParticleMat")
	}


	/**
	 * Gets a location's X, Y, Z, pitch,
	 * or yaw coordinate.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Location to get
	 * coordinate of
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetCoord]
	 */
	fun getCoord(items: Items) {
		block(items, "GetCoord", tagClass = SetVariableTags.GetCoord::class)
	}


	/**
	 * Removes a custom item tag.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [StringItem]
	 *
	 * Tag name
	 *
	 * (*) = optional
	 */
	fun removeItemTag(items: Items) {
		block(items, "RemoveItemTag")
	}


	/**
	 * Gets the model string values
	 * on an item, used in resource packs.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get model data from
	 *
	 * (*) = optional
	 */
	fun getModelDataStrs(items: Items) {
		block(items, "GetModelDataStrs")
	}


	/**
	 * Sets a particle effect's particle
	 * size and size variation.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to
	 * (*) change
	 *
	 * [NumItem]
	 *
	 * Particle size
	 *
	 * [NumItem]
	 *
	 * (*) Size variation (%)
	 *
	 * (*) = optional
	 */
	fun setParticleSize(items: Items) {
		block(items, "SetParticleSize")
	}


	/**
	 * Gets a potion effect's duration.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [PotionItem]
	 *
	 * Potion to get
	 * duration of
	 *
	 * (*) = optional
	 */
	fun getPotionDur(items: Items) {
		block(items, "GetPotionDur")
	}


	/**
	 * Sets the variable to a random
	 * location between two locations.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Location 1
	 *
	 * [LocItem]
	 *
	 * Location 2
	 *
	 * (*) = optional
	 */
	fun randomLoc(items: Items) {
		block(items, "RandomLoc")
	}


	/**
	 * Sets a sound's type.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * (*) Sound to change
	 *
	 * [StringItem]
	 *
	 * Sound name (e.g. "pling")
	 *
	 * (*) = optional
	 */
	fun setSoundType(items: Items) {
		block(items, "SetSoundType")
	}


	/**
	 * Gets a compass's lodestone location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Compass to get lodestone
	 * location of
	 *
	 * (*) = optional
	 */
	fun getLodestoneLoc(items: Items) {
		block(items, "GetLodestoneLoc")
	}


	/**
	 */
	fun shiftDirection(items: Items) {
		block(items, "ShiftDirection", tagClass = SetVariableTags.ShiftDirection::class)
	}


	/**
	 */
	fun getContainerName(items: Items) {
		block(items, "GetContainerName")
	}


	/**
	 * Searches for a string in another string
	 * and gets the index if found.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * String to search in
	 *
	 * [StringItem]
	 *
	 * String to search for
	 *
	 * [NumItem]
	 *
	 * (*) Starting index
	 *
	 * *Default = §c1§7*
	 *
	 * (*) = optional

	 * @see [SetVariableTags.IndexOfSubstring]
	 */
	fun indexOfSubstring(items: Items) {
		block(items, "IndexOfSubstring", tagClass = SetVariableTags.IndexOfSubstring::class)
	}


	/**
	 * Gets a particle effect's horizontal
	 * or vertical spread.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * spread of
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetParticleSprd]
	 */
	fun getParticleSprd(items: Items) {
		block(items, "GetParticleSprd", tagClass = SetVariableTags.GetParticleSprd::class)
	}


	/**
	 * Sets an item's leftover item that
	 * gets replaced on use, e.g. drinking
	 * stew gives a bowl.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [MinecraftItem]
	 *
	 * (*) Remainder item
	 *
	 * (*) = optional
	 */
	fun setItemLeftover(items: Items) {
		block(items, "SetItemLeftover")
	}


	/**
	 * Reflects a vector off a
	 * surface defined by another
	 * vector.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * (*) Vector to reflect
	 *
	 * [VecItem]
	 *
	 * Surface vector
	 *
	 * (*) = optional
	 */
	fun reflectVector(items: Items) {
		block(items, "ReflectVector")
	}


	/**
	 * Converts a hex code to
	 * a packed RGB integer.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * Hex code to convert
	 *
	 * (*) = optional
	 */
	fun decimalRGB(items: Items) {
		block(items, "DecimalRGB")
	}


	/**
	 * Clears all attributes from an item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item
	 *
	 * (*) = optional
	 */
	fun clearItemAttrs(items: Items) {
		block(items, "ClearItemAttrs")
	}


	/**
	 * Gets a player head's owner
	 * name or UUID.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Head to get owner of
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetHeadOwner]
	 */
	fun getHeadOwner(items: Items) {
		block(items, "GetHeadOwner", tagClass = SetVariableTags.GetHeadOwner::class)
	}


	/**
	 */
	fun getItemEnchants(items: Items) {
		block(items, "GetItemEnchants")
	}


	/**
	 * Adds all entries from one
	 * dictionary into the other.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Dictionary to
	 * add to
	 *
	 * [VarItem]
	 *
	 * Dictionary
	 * to append
	 *
	 * (*) = optional
	 */
	fun appendDict(items: Items) {
		block(items, "AppendDict")
	}


	/**
	 */
	fun getMaxItemAmount(items: Items) {
		block(items, "GetMaxItemAmount")
	}


	/**
	 * Sets an item's model.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [StringItem]
	 *
	 * (*) Model key
	 *
	 * *A namespaced key (§b"minecraft:"§7 by default)*
	 * *Example: §b"stone"§7*
	 *
	 * (*) = optional
	 */
	fun setItemModel(items: Items) {
		block(items, "SetItemModel")
	}


	/**
	 * Gets a color's RGB/HSB/HSL
	 * number values as a list.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * Color hexadecimal
	 *
	 * *Example: §b"#FF0000"§7 (red)*
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetColorChannels]
	 */
	fun getColorChannels(items: Items) {
		block(items, "GetColorChannels", tagClass = SetVariableTags.GetColorChannels::class)
	}


	/**
	 * Sets a location's rotation
	 * (pitch and yaw) to a direction.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to change
	 *
	 * [VecItem]
	 *
	 * Direction
	 *
	 * (*) = optional
	 */
	fun setDirection(items: Items) {
		block(items, " SetDirection ")
	}


	/**
	 * Sets a list variable's value at
	 * an index.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * List to change
	 *
	 * [NumItem]
	 *
	 * Index
	 *
	 * [Item]
	 *
	 * Value to set
	 *
	 * (*) = optional
	 */
	fun setListValue(items: Items) {
		block(items, "SetListValue")
	}


	/**
	 * Sets a book's text.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Book
	 *
	 * [TextItem]
	 *
	 * Pages
	 *
	 * [TextItem]
	 *
	 * Page text
	 *
	 * [NumItem]
	 *
	 * Page number
	 *
	 * (*) = optional
	 */
	fun setBookText(items: Items) {
		block(items, "SetBookText")
	}


	/**
	 * Sets a variable to a random
	 * value from a set.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [Item]
	 *
	 * Value set
	 * to choose from
	 *
	 * (*) = optional
	 */
	fun randomValue(items: Items) {
		block(items, "RandomValue")
	}


	/**
	 */
	fun setItemFlags(items: Items) {
		block(items, " SetItemFlags ", tagClass = SetVariableTags.SetItemFlags::class)
	}


	/**
	 * Sets an item's material.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [StringItem]
	 *
	 * Material
	 *
	 * (*) = optional
	 */
	fun setItemType(items: Items) {
		block(items, "SetItemType")
	}


	/**
	 * Gets the given sound's type.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * Sound to get type of
	 *
	 * (*) = optional
	 */
	fun getSoundType(items: Items) {
		block(items, "GetSoundType")
	}


	/**
	 * Gets a list variable's value at
	 * an index.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * List to get value of
	 *
	 * [NumItem]
	 *
	 * Index
	 *
	 * (*) = optional
	 */
	fun getListValue(items: Items) {
		block(items, "GetListValue")
	}


	/**
	 * Converts a value to JSON.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Value to convert
	 *
	 * [StringItem]
	 *
	 * Value to convert
	 *
	 * [VarItem]
	 *
	 * Value to convert
	 *
	 * [VarItem]
	 *
	 * Value to convert
	 *
	 * (*) = optional
	 */
	fun valueToJson(items: Items) {
		block(items, "ValueToJson")
	}


	/**
	 * Checks if a number is inside
	 * the bounds and if not, bounces
	 * it towards the other bound.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * (*) Number to bounce
	 *
	 * [NumItem]
	 *
	 * Lower bound (inclusive)
	 *
	 * [NumItem]
	 *
	 * Upper bound (exclusive)
	 *
	 * (*) = optional
	 */
	fun bounceNum(items: Items) {
		block(items, "BounceNum")
	}


	/**
	 * Sets a variable to the trigonometric
	 * tangent function of a number.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Number input
	 *
	 * (*) = optional

	 * @see [SetVariableTags.Tangent]
	 */
	fun tangent(items: Items) {
		block(items, "Tangent", tagClass = SetVariableTags.Tangent::class)
	}


	/**
	 * Gets a Voronoi noise value: A cellular
	 * noise in which the value of an entire
	 * cell is calculated.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Noise location
	 *
	 * [NumItem]
	 *
	 * (*) Cell frequency
	 *
	 * *Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Cell scatter
	 *
	 * *§c5§7-§c15§7 for cell shapes (Default = §c10§7)*
	 *
	 * [NumItem]
	 *
	 * (*) Generation seed
	 *
	 * (*) = optional

	 * @see [SetVariableTags.VoronoiNoise]
	 */
	fun voronoiNoise(items: Items) {
		block(items, "VoronoiNoise", tagClass = SetVariableTags.VoronoiNoise::class)
	}


	/**
	 * Creates a color based on hue,
	 * saturation, and brightness.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Hue (Color circle, 0-360)
	 *
	 * [NumItem]
	 *
	 * (*) Saturation (0-100)
	 *
	 * *Default = §c100§7*
	 *
	 * [NumItem]
	 *
	 * (*) Brightness (0-100)
	 *
	 * *Default = §c100§7*
	 *
	 * [VarItem]
	 *
	 * H, S, B values
	 *
	 * (*) = optional
	 */
	fun hSBColor(items: Items) {
		block(items, "HSBColor")
	}


	/**
	 * Increments a number variable
	 * by 1 or more other numbers.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable
	 * to increment
	 *
	 * [NumItem]
	 *
	 * (*) Number(s) to
	 * (*) increment by
	 *
	 * *Default = §c1§7*
	 *
	 * (*) = optional
	 */
	fun increment(items: Items) {
		block(items, "+=")
	}


	/**
	 * Interpolates two numbers
	 * based on a time value and
	 * an easing type.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Time (%)
	 *
	 * [NumItem]
	 *
	 * (*) First number
	 *
	 * *Default = §c0§7*
	 *
	 * [NumItem]
	 *
	 * (*) Second number
	 *
	 * *Default = §c1§7*
	 *
	 * (*) = optional

	 * @see [SetVariableTags.Interpolate]
	 */
	fun interpolate(items: Items) {
		block(items, "Interpolate", tagClass = SetVariableTags.Interpolate::class)
	}


	/**
	 * Gets the variant of a sound.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * Sound to get variant of
	 *
	 * (*) = optional
	 */
	fun getSoundVariant(items: Items) {
		block(items, "GetSoundVariant")
	}


	/**
	 * Gets a colorable item's color.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable
	 * to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get color of
	 *
	 * (*) = optional
	 */
	fun getItemColor(items: Items) {
		block(items, "GetItemColor")
	}


	/**
	 * Clears all formatting from the
	 * given styled text.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [TextItem]
	 *
	 * (*) Text to change
	 *
	 * (*) = optional
	 */
	fun clearFormatting(items: Items) {
		block(items, "ClearFormatting")
	}


	/**
	 * Inserts a value into a list
	 * variable at an index, shifting
	 * all values at and after it to
	 * the right.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * List to change
	 *
	 * [NumItem]
	 *
	 * Index
	 *
	 * [Item]
	 *
	 * Value to insert
	 *
	 * (*) = optional
	 */
	fun insertListValue(items: Items) {
		block(items, "InsertListValue")
	}


	/**
	 * Gets a particle effect's duration.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * duration of
	 *
	 * (*) = optional
	 */
	fun getParticleDur(items: Items) {
		block(items, "GetParticleDur")
	}


	/**
	 * Sets a sound's volume.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * (*) Sound to change
	 *
	 * [NumItem]
	 *
	 * Volume
	 *
	 * (*) = optional
	 */
	fun setSoundVolume(items: Items) {
		block(items, "SetSoundVolume")
	}


	/**
	 * Sets a location's X, Y, Z, pitch,
	 * or yaw coordinate.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to change
	 *
	 * [NumItem]
	 *
	 * Coordinate
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetCoord]
	 */
	fun setCoord(items: Items) {
		block(items, "SetCoord", tagClass = SetVariableTags.SetCoord::class)
	}


	/**
	 * Sets a variable to the sum
	 * of the given vectors.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * Vectors to add
	 *
	 * (*) = optional
	 */
	fun addVectors(items: Items) {
		block(items, "AddVectors")
	}


	/**
	 * Sanitizes all MiniMessage tags in a string.
	 * This is useful for using user input in
	 * the Parse MiniMessage Set Variable.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * (*) String to sanitize
	 *
	 * (*) = optional
	 */
	fun sanitizeTags(items: Items) {
		block(items, "SanitizeTags")
	}


	/**
	 */
	fun setPitch(items: Items) {
		block(items, "SetPitch")
	}


	/**
	 * Gets a particle effect's particle
	 * fade color.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * fade color of
	 *
	 * (*) = optional
	 */
	fun getParticleFade(items: Items) {
		block(items, "GetParticleFade")
	}


	/**
	 */
	fun raycastBlock(items: Items) {
		block(items, "RaycastBlock", tagClass = SetVariableTags.RaycastBlock::class)
	}


	/**
	 * Adds tool properties to an item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [NumItem]
	 *
	 * (*) Default mining speed
	 *
	 * *Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Damage per block
	 *
	 * *Default = §c1§7*
	 *
	 * (*) = optional
	 */
	fun setItemTool(items: Items) {
		block(items, "SetItemTool")
	}


	/**
	 * Gets an item's custom tooltip.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get tooltip style of
	 *
	 * (*) = optional
	 */
	fun getTooltipStyle(items: Items) {
		block(items, "GetTooltipStyle")
	}


	/**
	 * Compresses bytes as a
	 * list of numbers to Gzip.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Byte(s) to compress
	 *
	 * (*) = optional
	 */
	fun gzipCompress(items: Items) {
		block(items, "GzipCompress")
	}


	/**
	 * Gets a Perlin noise value: A type
	 * of fractal gradient noise.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Noise location
	 *
	 * [NumItem]
	 *
	 * (*) Frequency (Scale)
	 *
	 * *Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Octaves (Perlin layers)
	 *
	 * *§c1§7-§c8§7, default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Octave frequency gain
	 *
	 * *Default = §c1.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Octave amplitude gain
	 *
	 * *Default = §c0.75§7*
	 *
	 * [NumItem]
	 *
	 * (*) Generation seed
	 *
	 * (*) = optional

	 * @see [SetVariableTags.PerlinNoise]
	 */
	fun perlinNoise(items: Items) {
		block(items, "PerlinNoise", tagClass = SetVariableTags.PerlinNoise::class)
	}


	/**
	 * Gets a Worley noise value: A cellular
	 * noise in which the distance between
	 * two cells' nuclei is calculated.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Noise location
	 *
	 * [NumItem]
	 *
	 * (*) Cell frequency
	 *
	 * *Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Cell scatter
	 *
	 * *§c5§7-§c15§7 for cell shapes (Default = §c10§7)*
	 *
	 * [NumItem]
	 *
	 * (*) Generation seed
	 *
	 * (*) = optional

	 * @see [SetVariableTags.WorleyNoise]
	 */
	fun worleyNoise(items: Items) {
		block(items, "WorleyNoise", tagClass = SetVariableTags.WorleyNoise::class)
	}


	/**
	 * Sets a colorable item's color.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [StringItem]
	 *
	 * Color hexadecimal
	 *
	 * *Example: §b"#FF0000"§7 (red)*
	 *
	 * (*) = optional
	 */
	fun setItemColor(items: Items) {
		block(items, "SetItemColor")
	}


	/**
	 * Gets a particle effect's particle
	 * color.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * color of
	 *
	 * (*) = optional
	 */
	fun getParticleColor(items: Items) {
		block(items, "GetParticleColor")
	}


	/**
	 * Sets a sound's pitch or note
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * (*) Sound to change
	 *
	 * [NumItem]
	 *
	 * Pitch
	 *
	 * [StringItem]
	 *
	 * Note
	 *
	 * (*) = optional
	 */
	fun setSoundPitch(items: Items) {
		block(items, "SetSoundPitch")
	}


	/**
	 * Gets which blocks an item
	 * can be placed on in Adventure Mode.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item
	 *
	 * (*) = optional
	 */
	fun getCanPlaceOn(items: Items) {
		block(items, "GetCanPlaceOn")
	}


	/**
	 * Sorts a list variable's values.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * (*) List to sort
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SortList]
	 */
	fun sortList(items: Items) {
		block(items, "SortList", tagClass = SetVariableTags.SortList::class)
	}


	/**
	 * Sets the key of a custom sound.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * (*) Sound to change
	 *
	 * [StringItem]
	 *
	 * (*) Sound key
	 *
	 * (*) = optional
	 */
	fun setCustomSound(items: Items) {
		block(items, "SetCustomSound")
	}


	/**
	 * Removes the dictionary entry
	 * with the given key.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Dictionary to change
	 *
	 * [StringItem]
	 *
	 * Key to remove
	 *
	 * [Item]
	 *
	 * (*) Expected value(s)
	 *
	 * *When given, the entry will only be removed if the current value matches.*
	 *
	 * (*) = optional
	 */
	fun removeDictEntry(items: Items) {
		block(items, "RemoveDictEntry")
	}


	/**
	 * Converts a numerical timestamp to
	 * a human-readable time/date text
	 * using a date format.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Time to format
	 *
	 * [StringItem]
	 *
	 * (*) Custom Format
	 *
	 * *Used only if Tag: Format is set to Custom*
	 *
	 * (*) = optional

	 * @see [SetVariableTags.FormatTime]
	 */
	fun formatTime(items: Items) {
		block(items, "FormatTime", tagClass = SetVariableTags.FormatTime::class)
	}


	/**
	 * Sets a particle effect's duration.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to
	 * (*) change
	 *
	 * [NumItem]
	 *
	 * Particle duration in ticks
	 *
	 * (*) = optional
	 */
	fun setParticleDur(items: Items) {
		block(items, "SetParticleDur")
	}


	/**
	 * Gets the number of characters
	 * a string has.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * String to measure
	 *
	 * (*) = optional
	 */
	fun stringLength(items: Items) {
		block(items, "StringLength")
	}


	/**
	 * Gets the potion effects applied by
	 * an item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get effects from
	 *
	 * (*) = optional
	 */
	fun getItemEffects(items: Items) {
		block(items, "GetItemEffects")
	}


	/**
	 * Sets a variable to a styled text, or combines
	 * multiple values into one styled text.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [Item]
	 *
	 * (*) Text to set to
	 *
	 * (*) = optional

	 * @see [SetVariableTags.StyledText]
	 */
	fun styledText(items: Items) {
		block(items, "StyledText", tagClass = SetVariableTags.StyledText::class)
	}


	/**
	 * Gets the MiniMessage expression for
	 * a styled text value.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [TextItem]
	 *
	 * Text to read
	 *
	 * (*) = optional
	 */
	fun getMiniMessageExpr(items: Items) {
		block(items, "GetMiniMessageExpr")
	}


	/**
	 */
	fun setYaw(items: Items) {
		block(items, "SetYaw")
	}


	/**
	 * Sets the potion effects applied by
	 * an item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [PotionItem]
	 *
	 * Item effects
	 *
	 * (*) = optional
	 */
	fun setItemEffects(items: Items) {
		block(items, "SetItemEffects")
	}


	/**
	 * Decrements a number variable
	 * by 1 or more other numbers.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable
	 * to decrement
	 *
	 * [NumItem]
	 *
	 * (*) Number(s) to
	 * (*) decrement by
	 *
	 * *Default = §c1§7*
	 *
	 * (*) = optional
	 */
	fun decrement(items: Items) {
		block(items, "-=")
	}


	/**
	 * Gets the value of a custom
	 * item tag.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get tag of
	 *
	 * [StringItem]
	 *
	 * Tag name
	 *
	 * (*) = optional
	 */
	fun getItemTag(items: Items) {
		block(items, "GetItemTag")
	}


	/**
	 * Creates a list from the given
	 * values.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [Item]
	 *
	 * (*) Value list
	 *
	 * (*) = optional
	 */
	fun createList(items: Items) {
		block(items, "CreateList")
	}


	/**
	 * Adds a list to the end of
	 * another list variable.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * List to append to
	 *
	 * [VarItem]
	 *
	 * List(s) to append
	 *
	 * (*) = optional
	 */
	fun appendList(items: Items) {
		block(items, "AppendList")
	}


	/**
	 * Gets a container's contents
	 * at a location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetContainerItems]
	 */
	fun getContainerItems(items: Items) {
		block(items, "GetContainerItems", tagClass = SetVariableTags.GetContainerItems::class)
	}


	/**
	 * Gets the numerical model values
	 * on an item, used in resource packs.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get model data from
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetModelDataNums]
	 */
	fun getModelDataNums(items: Items) {
		block(items, "GetModelDataNums", tagClass = SetVariableTags.GetModelDataNums::class)
	}


	/**
	 * Shifts a location toward another
	 * location by the given distance.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to shift
	 *
	 * [LocItem]
	 *
	 * Target location
	 *
	 * [NumItem]
	 *
	 * (*) Shift distance
	 *
	 * *Default = §c1§7*
	 *
	 * (*) = optional
	 */
	fun shiftToward(items: Items) {
		block(items, "ShiftToward")
	}


	/**
	 * Trims a list, starting and ending
	 * at the given indices.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * (*) List to trim
	 *
	 * [NumItem]
	 *
	 * Start index
	 *
	 * [NumItem]
	 *
	 * (*) End index
	 *
	 * *Default = List length*
	 *
	 * (*) = optional
	 */
	fun trimList(items: Items) {
		block(items, "TrimList")
	}


	/**
	 * Gets gradient noise: A type of noise
	 * based on a lattice of random gradients.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Noise location
	 *
	 * [NumItem]
	 *
	 * (*) Frequency
	 *
	 * *Modifies the scale that the noise generates at. Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Marbling
	 *
	 * *Every §c0.5§7 adds an additional ring to the noise output. Default = §c0.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Octaves
	 *
	 * *Adds an additional layer of gradient noise to the output. §c1§7-§c16§7, Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Lacunarity
	 *
	 * *Every time a new octave is added, the frequency is multiplied by this value. Default = §c1.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Gain
	 *
	 * *Every time a new octave is added, the weight of it is multiplied by this value. Default = §c0.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Warping
	 *
	 * *Distorts the noise output. Default = §c0§7*
	 *
	 * [NumItem]
	 *
	 * (*) Resonance
	 *
	 * *Modifies the frequency of warping. Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Domains
	 *
	 * *Adds an additional layer of warping to the output. Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Domain lacunarity
	 *
	 * *Every time a new domain is added, the resonance is multiplied by this value. Default = §c1.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Domain gain
	 *
	 * *Every time a new domain is added, the weight of it is multiplied by this value. Default = §c0.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Generation seed
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GradientNoise]
	 */
	fun gradientNoise(items: Items) {
		block(items, "GradientNoise", tagClass = SetVariableTags.GradientNoise::class)
	}


	/**
	 * Sets whether an item's tooltip
	 * is visible or not.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetItemHideTooltip]
	 */
	fun setItemHideTooltip(items: Items) {
		block(items, "SetItemHideTooltip", tagClass = SetVariableTags.SetItemHideTooltip::class)
	}


	/**
	 * Gets the items dropped by a
	 * block if mined by a given tool.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Location to check
	 *
	 * [MinecraftItem]
	 *
	 * (*) Tool to use
	 *
	 * *Default = Required Tool*
	 *
	 * (*) = optional
	 */
	fun getBlockDrops(items: Items) {
		block(items, "GetBlockDrops")
	}


	/**
	 * Gets a dictionary of all named
	 * capture groups in a Regex match.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * Input string
	 *
	 * [StringItem]
	 *
	 * Regex pattern
	 *
	 * (*) = optional
	 */
	fun namedRegexGrps(items: Items) {
		block(items, "NamedRegexGrps")
	}


	/**
	 * Removes enchantments from an item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * (*) = optional
	 */
	fun clearEnchants(items: Items) {
		block(items, "ClearEnchants")
	}


	/**
	 * Sets a variable to the trigonometric
	 * cosine function of a number.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Number input
	 *
	 * (*) = optional

	 * @see [SetVariableTags.Cosine]
	 */
	fun cosine(items: Items) {
		block(items, "Cosine", tagClass = SetVariableTags.Cosine::class)
	}


	/**
	 * Gets a particle effect's opacity.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * opacity of
	 *
	 * (*) = optional
	 */
	fun getParticleOpac(items: Items) {
		block(items, "GetParticleOpac")
	}


	/**
	 * Gets which sound an item
	 * makes when it breaks.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get break sound from
	 *
	 * (*) = optional
	 */
	fun getBreakSound(items: Items) {
		block(items, "GetBreakSound")
	}


	/**
	 * Gets a list of items that
	 * belongs to the specified
	 * item tag.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * Item tag ID
	 *
	 * *Example: §b"#enchantable/sword"§7*
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetItemByMCTag]
	 */
	fun getItemByMCTag(items: Items) {
		block(items, "GetItemByMCTag", tagClass = SetVariableTags.GetItemByMCTag::class)
	}


	/**
	 * Sets a particle effect's particle
	 * fade color.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to
	 * (*) change
	 *
	 * [StringItem]
	 *
	 * Color hexadecimal
	 *
	 * *Example: §b"#FF0000"§7 (red)*
	 *
	 * (*) = optional
	 */
	fun setParticleFade(items: Items) {
		block(items, "SetParticleFade")
	}


	/**
	 * Sets a vector's X, Y, or Z
	 * component.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * (*) Vector to change
	 *
	 * [NumItem]
	 *
	 * Component
	 *
	 * (*) = optional

	 * @see [SetVariableTags.SetVectorComp]
	 */
	fun setVectorComp(items: Items) {
		block(items, "SetVectorComp", tagClass = SetVariableTags.SetVectorComp::class)
	}


	/**
	 * Converts a string to a number.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * (*) String to convert
	 *
	 * (*) = optional
	 */
	fun parseNumber(items: Items) {
		block(items, "ParseNumber")
	}


	/**
	 * Raises a number to the power
	 * of an exponent.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * (*) Number input
	 *
	 * [NumItem]
	 *
	 * (*) Exponent
	 *
	 * *Default = §c2§7 (input²)*
	 *
	 * (*) = optional
	 */
	fun exponent(items: Items) {
		block(items, "Exponent")
	}


	/**
	 */
	fun shiftAllDirs(items: Items) {
		block(items, "ShiftAllDirs", tagClass = SetVariableTags.ShiftAllDirs::class)
	}


	/**
	 * Searches for a value in a list
	 * variable and gets the index if
	 * found.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * List to search in
	 *
	 * [Item]
	 *
	 * Value to search
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetValueIndex]
	 */
	fun getValueIndex(items: Items) {
		block(items, "GetValueIndex", tagClass = SetVariableTags.GetValueIndex::class)
	}


	/**
	 * Adds weapon properties to an item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [NumItem]
	 *
	 * (*) Durability reduction per attack
	 *
	 * *Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Seconds to disable blocking for
	 *
	 * *Default = §c0§7*
	 *
	 * (*) = optional
	 */
	fun setItemWeapon(items: Items) {
		block(items, "SetItemWeapon")
	}


	/**
	 * Removes an enchantment from an item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [StringItem]
	 *
	 * Enchantment name
	 *
	 * (*) = optional
	 */
	fun remItemEnchant(items: Items) {
		block(items, "RemItemEnchant")
	}


	/**
	 * Adds lines to an item's lore.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [TextItem]
	 *
	 * Lore to add
	 *
	 * (*) = optional
	 */
	fun addItemLore(items: Items) {
		block(items, "AddItemLore")
	}


	/**
	 * Gets an item's consumable property.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get properties of
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetConsumable]
	 */
	fun getConsumable(items: Items) {
		block(items, "GetConsumable", tagClass = SetVariableTags.GetConsumable::class)
	}


	/**
	 * Sets a particle effect's roll.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) Effect to
	 * (*) change
	 *
	 * [NumItem]
	 *
	 * Particle roll
	 *
	 * (*) = optional
	 */
	fun setParticleRoll(items: Items) {
		block(items, "SetParticleRoll")
	}


	/**
	 * Sets the variant of a sound.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * (*) Sound to change
	 *
	 * [StringItem]
	 *
	 * (*) Variant ID (e.g. "break1")
	 *
	 * (*) = optional
	 */
	fun setSoundVariant(items: Items) {
		block(items, "SetSoundVariant")
	}


	/**
	 */
	fun shiftLocation(items: Items) {
		block(items, "ShiftLocation", tagClass = SetVariableTags.ShiftLocation::class)
	}


	/**
	 * Randomizes the order of a
	 * list variable's values.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * (*) List to randomize
	 *
	 * (*) = optional
	 */
	fun randomizeList(items: Items) {
		block(items, "RandomizeList")
	}


	/**
	 * Sets an item's components that should
	 * show up in its lore.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [StringItem]
	 *
	 * (*) Item component(s) to hide
	 *
	 * *Item component keys, Example: §b"attribute_modifiers"§7*
	 *
	 * (*) = optional

	 * @see [SetVariableTags.HiddenComponents]
	 */
	fun hiddenComponents(items: Items) {
		block(items, "HiddenComponents", tagClass = SetVariableTags.HiddenComponents::class)
	}


	/**
	 * Checks if a number is between
	 * a minimum and maximum value, and
	 * if not, sets it to the nearest.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * (*) Number to clamp
	 *
	 * [NumItem]
	 *
	 * Minimum
	 *
	 * [NumItem]
	 *
	 * Maximum
	 *
	 * (*) = optional
	 */
	fun clampNumber(items: Items) {
		block(items, "ClampNumber")
	}


	/**
	 */
	fun round(items: Items) {
		block(items, "Round", tagClass = SetVariableTags.Round::class)
	}


	/**
	 * Gets an item's model.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get model of
	 *
	 * (*) = optional
	 */
	fun getItemModel(items: Items) {
		block(items, "GetItemModel")
	}


	/**
	 * Gets a sound's pitch or
	 * note.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * Sound to get pitch or
	 * note of
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetSoundPitch]
	 */
	fun getSoundPitch(items: Items) {
		block(items, "GetSoundPitch", tagClass = SetVariableTags.GetSoundPitch::class)
	}


	/**
	 * Converts legacy color codes written in
	 * "&" or hex format to
	 * functional color codes, or vice versa.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * (*) String to translate
	 *
	 * (*) = optional

	 * @see [SetVariableTags.TranslateColors]
	 */
	fun translateColors(items: Items) {
		block(items, "TranslateColors", tagClass = SetVariableTags.TranslateColors::class)
	}


	/**
	 * Gets a block's current
	 * growth at a location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetBlockGrowth]
	 */
	fun getBlockGrowth(items: Items) {
		block(items, "GetBlockGrowth", tagClass = SetVariableTags.GetBlockGrowth::class)
	}


	/**
	 * Gets all tags registered
	 * on an item.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get tags of
	 *
	 * (*) = optional
	 */
	fun getAllItemTags(items: Items) {
		block(items, "GetAllItemTags")
	}


	/**
	 * Removes all matching values
	 * from a list variable.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * List to change
	 *
	 * [Item]
	 *
	 * Value(s) to
	 * remove
	 *
	 * (*) = optional

	 * @see [SetVariableTags.RemoveListValue]
	 */
	fun removeListValue(items: Items) {
		block(items, "RemoveListValue", tagClass = SetVariableTags.RemoveListValue::class)
	}


	/**
	 * Converts a list of numbers
	 * representing bytes to a string.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Byte(s) to convert
	 *
	 * (*) = optional

	 * @see [SetVariableTags.BytesToString]
	 */
	fun bytesToString(items: Items) {
		block(items, "BytesToString", tagClass = SetVariableTags.BytesToString::class)
	}


	/**
	 * Shifts a location in multiple directions
	 * based on its rotation.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * (*) Location to shift
	 *
	 * [NumItem]
	 *
	 * (*) Forwards change
	 *
	 * [NumItem]
	 *
	 * (*) Upwards change
	 *
	 * [NumItem]
	 *
	 * (*) Sideways change (-L / +R)
	 *
	 * (*) = optional
	 */
	fun shiftAllDirections(items: Items) {
		block(items, "ShiftAllDirections")
	}


	/**
	 * Gets value noise: A type of noise
	 * based on a lattice of random values.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Noise location
	 *
	 * [NumItem]
	 *
	 * (*) Frequency
	 *
	 * *Modifies the scale that the noise generates at. Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Marbling
	 *
	 * *Every §c0.5§7 adds an additional ring to the noise output. Default = §c0.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Octaves
	 *
	 * *Adds an additional layer of value noise to the output. §c1§7-§c16§7, Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Lacunarity
	 *
	 * *Every time a new octave is added, the frequency is multiplied by this value. Default = §c1.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Gain
	 *
	 * *Every time a new octave is added, the weight of it is multiplied by this value. Default = §c0.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Warping
	 *
	 * *Distorts the noise output. Default = §c0§7*
	 *
	 * [NumItem]
	 *
	 * (*) Resonance
	 *
	 * *Modifies the frequency of warping. Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Domains
	 *
	 * *Adds an additional layer of warping to the output. Default = §c1§7*
	 *
	 * [NumItem]
	 *
	 * (*) Domain lacunarity
	 *
	 * *Every time a new domain is added, the resonance is multiplied by this value. Default = §c1.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Domain gain
	 *
	 * *Every time a new domain is added, the weight of it is multiplied by this value. Default = §c0.5§7*
	 *
	 * [NumItem]
	 *
	 * (*) Generation seed
	 *
	 * (*) = optional

	 * @see [SetVariableTags.ValueNoise]
	 */
	fun valueNoise(items: Items) {
		block(items, "ValueNoise", tagClass = SetVariableTags.ValueNoise::class)
	}


	/**
	 * Gets the response from a web request.
	 * 
	 * The output dictionary has 3 keys:
	 * "status": The HTTP status code.
	 * "statusText": The HTTP status message.
	 * And "body", or "json" if the response is JSON.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to store response
	 *
	 * [StringItem]
	 *
	 * URL to request
	 *
	 * [StringItem]
	 *
	 * (*) Content body
	 *
	 * (*) = optional

	 * @see [SetVariableTags.WebResponse]
	 */
	fun webResponse(items: Items) {
		block(items, "WebResponse", tagClass = SetVariableTags.WebResponse::class)
	}


	/**
	 * Sets custom tags on an item
	 * based on the input dictionary.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [VarItem]
	 *
	 * Tags
	 *
	 * (*) = optional
	 */
	fun setAllItemTags(items: Items) {
		block(items, "SetAllItemTags")
	}


	/**
	 * Sets which blocks an item
	 * can be placed on in Adventure Mode.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * (*) Item to change
	 *
	 * [MinecraftItem]
	 *
	 * Placeable blocks
	 *
	 * (*) = optional
	 */
	fun setCanPlaceOn(items: Items) {
		block(items, "SetCanPlaceOn")
	}


	/**
	 * Gets a block's material
	 * at a location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetBlockType]
	 */
	fun getBlockType(items: Items) {
		block(items, "GetBlockType", tagClass = SetVariableTags.GetBlockType::class)
	}


	/**
	 */
	fun parsePitch(items: Items) {
		block(items, "ParsePitch")
	}


	/**
	 * Get a dictionary variable's
	 * value for a key.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VarItem]
	 *
	 * Dictionary to
	 * pull from
	 *
	 * [StringItem]
	 *
	 * Key
	 *
	 * (*) = optional
	 */
	fun getDictValue(items: Items) {
		block(items, "GetDictValue")
	}


	/**
	 * Gets a container's lock key at a
	 * location.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * (*) = optional
	 */
	fun containerLock(items: Items) {
		block(items, "ContainerLock")
	}


	/**
	 * Gets an item's weapon property.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get property of
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetItemWeapon]
	 */
	fun getItemWeapon(items: Items) {
		block(items, "GetItemWeapon", tagClass = SetVariableTags.GetItemWeapon::class)
	}


	/**
	 * Gets a block's redstone
	 * power level.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*) = optional
	 */
	fun getBlockPower(items: Items) {
		block(items, "GetBlockPower")
	}


	/**
	 * Gets a vector's length.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * Vector to get
	 * length of
	 *
	 * (*) = optional

	 * @see [SetVariableTags.GetVectorLength]
	 */
	fun getVectorLength(items: Items) {
		block(items, "GetVectorLength", tagClass = SetVariableTags.GetVectorLength::class)
	}


	/**
	 * Gets the number of characters
	 * a styled text has, ignoring all
	 * formatting tags.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [TextItem]
	 *
	 * Text to measure
	 *
	 * (*) = optional
	 */
	fun contentLength(items: Items) {
		block(items, "ContentLength")
	}


	/**
	 */
	fun setModelData(items: Items) {
		block(items, "SetModelData")
	}


	/**
	 * Converts a string to a list of
	 * numbers representing bytes.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [StringItem]
	 *
	 * String to convert
	 *
	 * (*) = optional

	 * @see [SetVariableTags.StringToBytes]
	 */
	fun stringToBytes(items: Items) {
		block(items, "StringToBytes", tagClass = SetVariableTags.StringToBytes::class)
	}


	/**
	 */
	fun setCoords(items: Items) {
		block(items, "SetCoords")
	}


	/**
	 * Gets an item's maximum stack size.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [MinecraftItem]
	 *
	 * Item to get maximum stack
	 * size of
	 *
	 * (*) = optional
	 */
	fun getMaxAmount(items: Items) {
		block(items, "GetMaxAmount")
	}


	/**
	 * Gets a particle effect's particle
	 * size.
	 *
	 * **Args:**
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [GenericItem] (Particle)
	 *
	 * Effect to get
	 * size of
	 *
	 * (*) = optional
	 */
	fun getParticleSize(items: Items) {
		block(items, "GetParticleSize")
	}

}