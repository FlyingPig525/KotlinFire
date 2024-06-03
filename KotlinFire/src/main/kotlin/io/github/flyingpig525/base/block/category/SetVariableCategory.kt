@file:Suppress("UNUSED")
package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.annotation.Emperor
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*


class SetVariableCategory<T> internal constructor(private val template: Template<T>) where T : Item, T : JsonData {
	private val blocks = template.blocks

	fun chain(a: SetVariableCategory<T>.() -> Unit) {
		apply(a)
	}

	/**
	 * Sets a variable to a string, or combines
	 * multiple values into one string.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Value(s)
	 *
	 * String to set to
	 *
	 * (*) = Optional
	 */
	fun string(items: Items<T>) = block(items, "String")
	/**
	 * Sets a particle effect's type.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[ParticleItem]
	 *
	 * Effect to
	 * change
	 *
	 * [TextItem]
	 *
	 * Type
	 *
	 * (*) = Optional
	 */
	fun setParticleType(items: Items<T>) = block(items, "SetParticleType")
	fun setItemEnchants(items: Items<T>) = block(items, "SetItemEnchants")
	/**
	 * Removes all item custom tags.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * (*) = Optional
	 */
	fun clearItemTag(items: Items<T>) = block(items, "ClearItemTag")
	/**
	 * Clears all variables with names
	 * that match the given text.
	 *
	 * ARGUMENTS:
	 *
	 * [TextItem](s)
	 *
	 * Name to match
	 *
	 * (*) = Optional
	 */
	fun purgeVars(items: Items<T>) = block(items, "PurgeVars")
	/**
	 * Shifts a location's coordinates
	 * on the X, Y, and Z axes.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LocItem]
	 *
	 * Location to change
	 *
	 * (*)[NumItem]
	 *
	 * X Change
	 *
	 * (*)[NumItem]
	 *
	 * Y Change
	 *
	 * (*)[NumItem]
	 *
	 * Z Change
	 *
	 * (*) = Optional
	 */
	fun shiftAllAxes(items: Items<T>) = block(items, "ShiftAllAxes")
	/**
	 * Gets a particle effect's particle
	 * display material.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [ParticleItem]
	 *
	 * Effect to get
	 * material of
	 *
	 * (*) = Optional
	 */
	fun getParticleMat(items: Items<T>) = block(items, "GetParticleMat")
	/**
	 * Sets a particle effect's horizontal
	 * and vertical spread.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[ParticleItem]
	 *
	 * Effect to change
	 *
	 * [NumItem]
	 *
	 * Horizontal spread
	 *
	 * [NumItem]
	 *
	 * Vertical spread
	 *
	 * (*) = Optional
	 */
	fun setParticleSprd(items: Items<T>) = block(items, "SetParticleSprd")
	/**
	 * Makes a number positive
	 * if it is negative.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[NumItem]
	 *
	 * Number input
	 *
	 * (*) = Optional
	 */
	fun absoluteValue(items: Items<T>) = block(items, "AbsoluteValue")
	/**
	 * Adds a value to the end of a list
	 * variable.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * List to append to
	 *
	 * Any Value(s)
	 *
	 * Value(s) to append
	 *
	 * (*) = Optional
	 */
	fun appendValue(items: Items<T>) = block(items, "AppendValue")
	/**
	 * Sets a variable to the remainder
	 * after dividing two numbers with
	 * a whole quotient.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun remainder(items: Items<T>) = block(items, "%")
	/**
	 * Shifts a location along a
	 * vector.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LocItem]
	 *
	 * Location to shift
	 *
	 * [VecItem]
	 *
	 * Shift vector
	 *
	 * [NumItem]
	 *
	 * Shift distance
	 *
	 * [NONE]
	 *
	 * Adds full vector
	 *
	 * (*) = Optional
	 */
	fun shiftOnVector(items: Items<T>) = block(items, "ShiftOnVector")
	/**
	 * Get an attribute's
	 * multiplier for a specific slot.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item
	 *
	 * (*) = Optional
	 */
	fun getItemAttribute(items: Items<T>) = block(items, "GetItemAttribute")
	/**
	 * Removes all entries from
	 * a dictionary.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Dictionary to clear
	 *
	 * (*) = Optional
	 */
	fun clearDict(items: Items<T>) = block(items, "ClearDict")
	/**
	 * Sets a variable to the sum of
	 * the given numbers.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem](s)
	 *
	 * Numbers to add
	 *
	 * (*) = Optional
	 */
	fun add(items: Items<T>) = block(items, "+")
	/**
	 * Rotates a location by shifting its pitch
	 * (up/down) or yaw (left/right) value.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LocItem]
	 *
	 * Location to shift
	 *
	 * [NumItem]
	 *
	 * Rotation amount
	 *
	 * (*) = Optional
	 */
	fun shiftRotation(items: Items<T>) = block(items, "ShiftRotation")
	/**
	 * Sets a variable to the difference
	 * between the given numbers.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem](s)
	 *
	 * Numbers to subtract
	 *
	 * (*) = Optional
	 */
	fun subtract(items: Items<T>) = block(items, "-")
	/**
	 * Gets an item's rarity.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item
	 *
	 * (*) = Optional
	 */
	fun getItemRarity(items: Items<T>) = block(items, "GetItemRarity")
	/**
	 * Multiplies a vector's length
	 * by a number.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[VecItem]
	 *
	 * Vector to multiply
	 *
	 * [NumItem]
	 *
	 * Multiplier
	 *
	 * (*) = Optional
	 */
	fun multiplyVector(items: Items<T>) = block(items, "MultiplyVector")
	/**
	 * Sets a variable to the quotient
	 * of the given numbers.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem](s)
	 *
	 * Numbers to divide
	 *
	 * (*) = Optional
	 */
	fun divide(items: Items<T>) = block(items, "/")
	fun getSignText(items: Items<T>) = block(items, "GetSignText")
	/**
	 * Sets a variable to the result
	 * of a bitwise operation.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Operand 1
	 *
	 * (*)[NumItem]
	 *
	 * Operand 2
	 *
	 * (*) = Optional
	 */
	fun bitwise(items: Items<T>) = block(items, "Bitwise")
	/**
	 * Gets the displayed page
	 * number of a Lectern.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Lectern location
	 *
	 * (*) = Optional
	 */
	fun getLecternPage(items: Items<T>) = block(items, "GetLecternPage")
	fun parseX(items: Items<T>) = block(items, "ParseX")
	/**
	 * Shifts the X, Y, or Z coordinate
	 * of a location on its axis.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LocItem]
	 *
	 * Location to shift
	 *
	 * [NumItem]
	 *
	 * Shift distance
	 *
	 * (*) = Optional
	 */
	fun shiftOnAxis(items: Items<T>) = block(items, "ShiftOnAxis")
	fun parseY(items: Items<T>) = block(items, "ParseY")
	/**
	 * Sets a variable to the vector
	 * between two locations.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun vectorBetween(items: Items<T>) = block(items, "VectorBetween")
	fun parseZ(items: Items<T>) = block(items, "ParseZ")
	/**
	 * Gets a vector's X, Y, or Z
	 * component.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun getVectorComp(items: Items<T>) = block(items, "GetVectorComp")
	/**
	 * Sets a variable to a value.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Value
	 *
	 * Value
	 *
	 * (*) = Optional
	 */
	fun set(items: Items<T>) = block(items, "=")
	fun rmText(items: Items<T>) = block(items, "RmText")
	/**
	 * Adds an attribute modifier to the
	 * item, which is active in a certain
	 * equipment slot.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item
	 *
	 * [NumItem]
	 *
	 * Modifier Amount
	 *
	 * (*) = Optional
	 */
	fun addItemAttribute(items: Items<T>) = block(items, "AddItemAttribute")
	/**
	 * Finds an average position (center)
	 * of the given locations.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem](s)
	 *
	 * Locations to center
	 *
	 * (*) = Optional
	 */
	fun getCenterLoc(items: Items<T>) = block(items, "GetCenterLoc")
	/**
	 * Aligns a location to the center
	 * or corner of the block it is in.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LocItem]
	 *
	 * Location to align
	 *
	 * (*) = Optional
	 */
	fun alignLoc(items: Items<T>) = block(items, "AlignLoc")
	/**
	 * Gets a sound's volume.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * Sound to get volume of
	 *
	 * (*) = Optional
	 */
	fun getSoundVolume(items: Items<T>) = block(items, "GetSoundVolume")
	/**
	 * Sets a variable to a random
	 * number between two other
	 * numbers.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun randomNumber(items: Items<T>) = block(items, "RandomNumber")
	/**
	 * Gets a container's name at
	 * a location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * (*) = Optional
	 */
	fun containerName(items: Items<T>) = block(items, "ContainerName")
	/**
	 * Raycasts from a location
	 * to the first intersection.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun raycast(items: Items<T>) = block(items, "Raycast")
	/**
	 * Rotates a vector around
	 * another vector by an angle.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[VecItem]
	 *
	 * Vector to rotate
	 *
	 * [VecItem]
	 *
	 * Axis vector
	 *
	 * [NumItem]
	 *
	 * Angle
	 *
	 * (*) = Optional
	 */
	fun rotateAroundVec(items: Items<T>) = block(items, "RotateAroundVec")
	/**
	 * Gets a particle effect's particle
	 * motion.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [ParticleItem]
	 *
	 * Effect to get
	 * motion of
	 *
	 * (*) = Optional
	 */
	fun getParticleMotion(items: Items<T>) = block(items, "GetParticleMotion")
	/**
	 * Sets a particle effect's particle
	 * motion and motion variation.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[ParticleItem]
	 *
	 * Effect to
	 * change
	 *
	 * (*)[VecItem]
	 *
	 * Particle motion
	 *
	 * (*)[NumItem]
	 *
	 * Motion variation (%)
	 *
	 * (*) = Optional
	 */
	fun setParticleMotion(items: Items<T>) = block(items, "SetParticleMotion")
	/**
	 * Sets a variable to the average
	 * of the given numbers.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem](s)
	 *
	 * Numbers to average
	 *
	 * (*) = Optional
	 */
	fun average(items: Items<T>) = block(items, "Average")
	/**
	 * Checks if a number is between
	 * two bounds and if not, wraps
	 * it around the farthest bound.
	 */
	fun wrapNumber(items: Items<T>) = block(items, "WrapNumber")
	fun setY(items: Items<T>) = block(items, "SetY")
	/**
	 * Sets a map item's texture to the
	 * image at the given URL.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [TextItem]
	 *
	 * Image URL
	 *
	 * (*) = Optional
	 */
	@Emperor
	fun setMapTexture(items: Items<T>) = block(items, "SetMapTexture")
	/**
	 * Gets a block state tag
	 * value at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * [TextItem]
	 *
	 * Tag name
	 *
	 * (*) = Optional
	 */
	fun getBlockData(items: Items<T>) = block(items, "GetBlockData")
	fun setX(items: Items<T>) = block(items, "SetX")
	/**
	 * Sorts a dictionary
	 * by its keys or values.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[DICT]
	 *
	 * Dictionary to sort
	 *
	 * (*) = Optional
	 */
	fun sortDict(items: Items<T>) = block(items, "SortDict")
	/**
	 * Gets the book on the
	 * Lectern at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Lectern location
	 *
	 * (*) = Optional
	 */
	fun getLecternBook(items: Items<T>) = block(items, "GetLecternBook")
	/**
	 * Gets the key of a custom sound.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * Sound to get key of
	 *
	 * (*) = Optional
	 */
	fun getCustomSound(items: Items<T>) = block(items, "GetCustomSound")
	/**
	 * Sets a variable to the cross
	 * product of two vectors.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun crossProduct(items: Items<T>) = block(items, "CrossProduct")
	/**
	 * Sets a variable to the product
	 * of the given numbers.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem](s)
	 *
	 * Numbers to multiply
	 *
	 * (*) = Optional
	 */
	fun x(items: Items<T>) = block(items, "x")
	/**
	 * Gets a particle effect's roll.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[ParticleItem]
	 *
	 * Effect to get
	 * roll of
	 *
	 * (*) = Optional
	 */
	fun getParticleRoll(items: Items<T>) = block(items, "GetParticleRoll")
	fun parseYaw(items: Items<T>) = block(items, "ParseYaw")
	/**
	 * Sets a variable to the dot
	 * product of two vectors.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun dotProduct(items: Items<T>) = block(items, "DotProduct")
	fun setZ(items: Items<T>) = block(items, "SetZ")
	/**
	 * Sets the trim of an
	 * armor item.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * (*) = Optional
	 */
	fun setArmorTrim(items: Items<T>) = block(items, "SetArmorTrim")
	/**
	 * Gets a list variable's value at
	 * an index and removes it.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LIST]
	 *
	 * List to get value of
	 *
	 * (*)[NumItem]
	 *
	 * Index
	 *
	 * (*) = Optional
	 */
	fun popListValue(items: Items<T>) = block(items, "PopListValue")
	/**
	 * Sets a variable to the lowest
	 * number in a set.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem](s)
	 *
	 * Number set
	 * to compare
	 *
	 * (*) = Optional
	 */
	fun minNumber(items: Items<T>) = block(items, "MinNumber")
	/**
	 * Gets a potion effect's type.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [POTION]
	 *
	 * Potion to get
	 * type of
	 *
	 * (*) = Optional
	 */
	fun getPotionType(items: Items<T>) = block(items, "GetPotionType")
	fun setItemName(items: Items<T>) = block(items, "SetItemName")
	/**
	 * Gets the number of values
	 * a list has.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LIST]
	 *
	 * List to measure
	 *
	 * (*) = Optional
	 */
	fun listLength(items: Items<T>) = block(items, "ListLength")
	/**
	 * Sets a variable to the trigonometric
	 * sine function of a number.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Number input
	 *
	 * (*) = Optional
	 */
	fun sine(items: Items<T>) = block(items, "Sine")
	/**
	 * Sets a variable to the name
	 * of the direction of a vector.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem]
	 *
	 * Direction
	 *
	 * (*) = Optional
	 */
	fun directionName(items: Items<T>) = block(items, "DirectionName")
	/**
	 * Repeats a string the given number
	 * of times.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [TextItem]
	 *
	 * String to repeat
	 *
	 * [NumItem]
	 *
	 * Times to repeat
	 *
	 * (*) = Optional
	 */
	fun repeatString(items: Items<T>) = block(items, "RepeatString")
	fun getItemLore(items: Items<T>) = block(items, "GetItemLore")
	/**
	 * Combines a list of strings.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LIST]
	 *
	 * Strings to join
	 *
	 * (*)[TextItem]
	 *
	 * Joining string
	 *
	 * (*)[TextItem]
	 *
	 * Final joining string
	 *
	 * (*) = Optional
	 */
	fun joinString(items: Items<T>) = block(items, "JoinString")
	/**
	 * Reverses the order of a
	 * list variable's values.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LIST]
	 *
	 * List to reverse
	 *
	 * (*) = Optional
	 */
	fun reverseList(items: Items<T>) = block(items, "ReverseList")
	/**
	 * Removes list elements that appear
	 * more than once.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LIST]
	 *
	 * List to de-duplicate
	 *
	 * (*) = Optional
	 */
	fun dedupList(items: Items<T>) = block(items, "DedupList")
	/**
	 * Creates a dictionary with the
	 * given keys and values.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LIST]
	 *
	 * Key list
	 *
	 * (*)[LIST]
	 *
	 * Value list
	 *
	 * (*) = Optional
	 */
	fun createDict(items: Items<T>) = block(items, "CreateDict")
	fun roundNumber(items: Items<T>) = block(items, "RoundNumber")
	/**
	 * Sets a location's rotation to
	 * face another location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LocItem]
	 *
	 * Location to change
	 *
	 * [LocItem]
	 *
	 * Target location
	 *
	 * (*) = Optional
	 */
	fun faceLocation(items: Items<T>) = block(items, "FaceLocation")
	fun getItemLoreLine(items: Items<T>) = block(items, "GetItemLoreLine")
	/**
	 * Sets a vector's length. This
	 * affects all components.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[VecItem]
	 *
	 * Vector to change
	 *
	 * (*)[NumItem]
	 *
	 * Length
	 *
	 * (*) = Optional
	 */
	fun setVectorLength(items: Items<T>) = block(items, "SetVectorLength")
	/**
	 * Sets a potion effect's duration.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[POTION]
	 *
	 * Potion to change
	 *
	 * [NumItem]
	 *
	 * Duration (ticks)
	 *
	 * (*) = Optional
	 */
	fun setPotionDur(items: Items<T>) = block(items, "SetPotionDur")
	/**
	 * Gets a block's blast resistance.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Block to check
	 *
	 * [LocItem]
	 *
	 * Location to check
	 *
	 * (*) = Optional
	 */
	fun blockResistance(items: Items<T>) = block(items, "BlockResistance")
	/**
	 * Splits a string into a list of strings.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [TextItem]
	 *
	 * String to split
	 *
	 * (*)[TextItem]
	 *
	 * Splitter string
	 *
	 * (*) = Optional
	 */
	fun splitString(items: Items<T>) = block(items, "SplitString")
	/**
	 * Sets a variable to a normally distributed
	 * random number. Values closer to μ are
	 * more likely to be chosen.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun normalRandom(items: Items<T>) = block(items, "NormalRandom")
	/**
	 * Sets a potion effect's type.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[POTION]
	 *
	 * Potion to change
	 *
	 * [TextItem]
	 *
	 * Type
	 *
	 * (*) = Optional
	 */
	fun setPotionType(items: Items<T>) = block(items, "SetPotionType")
	/**
	 * Aligns a vector to the
	 * nearest axis.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[VecItem]
	 *
	 * Vector to align
	 *
	 * (*) = Optional
	 */
	fun alignVector(items: Items<T>) = block(items, "AlignVector")
	/**
	 * Sets the given item's durability.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item
	 *
	 * [NumItem]
	 *
	 * Item durability
	 *
	 * (*) = Optional
	 */
	fun setItemDura(items: Items<T>) = block(items, "SetItemDura")
	/**
	 * Sets whether an item is
	 * unbreakable.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item
	 *
	 * (*) = Optional
	 */
	fun setBreakability(items: Items<T>) = block(items, "SetBreakability")
	fun raycastEntity(items: Items<T>) = block(items, "RaycastEntity")
	/**
	 * Sets the given key to the value.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Dictionary to add to
	 *
	 * [TextItem]
	 *
	 * Key
	 *
	 * Any Value
	 *
	 * Value
	 *
	 * (*) = Optional
	 */
	fun setDictValue(items: Items<T>) = block(items, "SetDictValue")
	/**
	 * Sets a location's coordinates or
	 * creates a new location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LocItem]
	 *
	 * Location to change
	 *
	 * (*)[NumItem]
	 *
	 * New X
	 *
	 * (*)[NumItem]
	 *
	 * New Y
	 *
	 * (*)[NumItem]
	 *
	 * New Z
	 *
	 * (*)[NumItem]
	 *
	 * New Pitch
	 *
	 * (*)[NumItem]
	 *
	 * New Yaw
	 *
	 * (*) = Optional
	 */
	fun setAllCoords(items: Items<T>) = block(items, "SetAllCoords")
	/**
	 * Creates a color hex based on red,
	 * green, and blue channels.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Red (§c0§7-§c255§7)
	 *
	 * [NumItem]
	 *
	 * Green (§c0§7-§c255§7)
	 *
	 * [NumItem]
	 *
	 * Blue (§c0§7-§c255§7)
	 *
	 * [LIST]
	 *
	 * R, G, B values
	 *
	 * (*) = Optional
	 */
	fun rGBColor(items: Items<T>) = block(items, "RGBColor")
	/**
	 * Sets which blocks an item
	 * can break in Adventure Mode.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [BLOCK](s)
	 *
	 * Breakable blocks
	 *
	 * (*) = Optional
	 */
	fun setCanDestroy(items: Items<T>) = block(items, "SetCanDestroy")
	/**
	 * Creates a color based on hue,
	 * saturation, and lightness.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Hue (Color circle, §c0§7-§c360§7)
	 *
	 * (*)[NumItem]
	 *
	 * Saturation (§c0§7-§c100§7)
	 *
	 * (*)[NumItem]
	 *
	 * Lightness (§c0§7-§c100§7)
	 *
	 * [LIST]
	 *
	 * H, S, L values
	 *
	 * (*) = Optional
	 */
	fun hSLColor(items: Items<T>) = block(items, "HSLColor")
	/**
	 * Removes a list variable's value
	 * at an index and shifts all values
	 * after it to the left.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * List to change
	 *
	 * [NumItem](s)
	 *
	 * Index to remove
	 *
	 * (*) = Optional
	 */
	fun removeListIndex(items: Items<T>) = block(items, "RemoveListIndex")
	/**
	 * Finds the logarithm of a number.
	 * A logarithm is the power the
	 * base must be raised to to get
	 * the given input.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[NumItem]
	 *
	 * Number input
	 *
	 * [NumItem]
	 *
	 * Base
	 *
	 * (*) = Optional
	 */
	fun logarithm(items: Items<T>) = block(items, "Logarithm")
	/**
	 * Sets the value of or creates
	 * a custom stored tag value.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [TextItem]
	 *
	 * Tag name
	 *
	 * [NumItem]
	 *
	 * Tag value
	 *
	 * [TextItem]
	 *
	 * Tag value
	 *
	 * (*) = Optional
	 */
	fun setItemTag(items: Items<T>) = block(items, "SetItemTag")
	/**
	 * Trims a string, starting and ending
	 * at the given positions.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[TextItem]
	 *
	 * String to trim
	 *
	 * [NumItem]
	 *
	 * Start character position
	 *
	 * (*)[NumItem]
	 *
	 * End character position
	 *
	 * (*) = Optional
	 */
	fun trimString(items: Items<T>) = block(items, "TrimString")
	/**
	 * Parses a MiniMessage expression from
	 * a string value into a styled text.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [TextItem]
	 *
	 * String to parse
	 *
	 * (*) = Optional
	 */
	fun parseMiniMessageExpr(items: Items<T>) = block(items, "ParseMiniMessageExpr")
	/**
	 * Gets an item's stack size.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item to get stack
	 * size of
	 *
	 * (*) = Optional
	 */
	fun getItemAmount(items: Items<T>) = block(items, "GetItemAmount")
	/**
	 * Sets a potion effect's amplifier.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[POTION]
	 *
	 * Potion to change
	 *
	 * [NumItem]
	 *
	 * Amplifier
	 *
	 * (*) = Optional
	 */
	fun setPotionAmp(items: Items<T>) = block(items, "SetPotionAmp")
	/**
	 * Gets which blocks an item
	 * can break in Adventure Mode.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item
	 *
	 * (*) = Optional
	 */
	fun getCanDestroy(items: Items<T>) = block(items, "GetCanDestroy")
	/**
	 * Rotates a vector around an
	 * axis by an angle.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[VecItem]
	 *
	 * Vector to rotate
	 *
	 * [NumItem]
	 *
	 * Angle
	 *
	 * (*) = Optional
	 */
	fun rotateAroundAxis(items: Items<T>) = block(items, "RotateAroundAxis")
	fun getItemName(items: Items<T>) = block(items, "GetItemName")
	/**
	 * Gets the given item's current or
	 * maximum durability.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item
	 *
	 * (*) = Optional
	 */
	fun getItemDura(items: Items<T>) = block(items, "GetItemDura")
	/**
	 * Shifts a location forward, upward,
	 * or sideways based on its rotation.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LocItem]
	 *
	 * Location to shift
	 *
	 * (*)[NumItem]
	 *
	 * Shift distance
	 *
	 * (*) = Optional
	 */
	fun shiftInDirection(items: Items<T>) = block(items, "ShiftInDirection")
	/**
	 * Checks if a number is inside
	 * the bounds and if not, wraps
	 * it around the farthest bound.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[NumItem]
	 *
	 * Number to wrap
	 *
	 * [NumItem]
	 *
	 * Lower bound (inclusive)
	 *
	 * [NumItem]
	 *
	 * Upper bound (exclusive)
	 *
	 * (*) = Optional
	 */
	fun wrapNum(items: Items<T>) = block(items, "WrapNum")
	/**
	 * Searches for part of a string
	 * and replaces it.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable
	 * to set
	 *
	 * [TextItem]
	 *
	 * String to change
	 *
	 * [TextItem]
	 *
	 * String part to replace
	 *
	 * [TextItem]
	 *
	 * Replacement
	 *
	 * (*) = Optional
	 */
	fun replaceString(items: Items<T>) = block(items, "ReplaceString")
	/**
	 * Sets a compass's lodestone location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [LocItem]
	 *
	 * Lodestone location
	 *
	 * (*) = Optional
	 */
	fun setLodestoneLoc(items: Items<T>) = block(items, "SetLodestoneLoc")
	/**
	 * Sets a variable to a list with
	 * its sub-lists spread out
	 * into individual elements.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LIST]
	 *
	 * List to flatten
	 *
	 * (*) = Optional
	 */
	fun flattenList(items: Items<T>) = block(items, "FlattenList")
	/**
	 * Gets a block's hardness value.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Block to check
	 *
	 * [LocItem]
	 *
	 * Location to check
	 *
	 * (*) = Optional
	 */
	fun blockHardness(items: Items<T>) = block(items, "BlockHardness")
	/**
	 * Gets a potion effect's amplifier.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [POTION]
	 *
	 * Potion to get
	 * amplifier of
	 *
	 * (*) = Optional
	 */
	fun getPotionAmp(items: Items<T>) = block(items, "GetPotionAmp")
	/**
	 * Gets a particle effect's particle
	 * amount.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [ParticleItem]
	 *
	 * Effect to get
	 * amount of
	 *
	 * (*) = Optional
	 */
	fun getParticleAmount(items: Items<T>) = block(items, "GetParticleAmount")
	/**
	 * Gets the number of entries
	 * in a dictionary.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [DICT]
	 *
	 * Dictionary to
	 * measure
	 *
	 * (*) = Optional
	 */
	fun getDictSize(items: Items<T>) = block(items, "GetDictSize")
	/**
	 * Sets an item's stack size.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [NumItem]
	 *
	 * Stack size
	 *
	 * (*) = Optional
	 */
	fun setItemAmount(items: Items<T>) = block(items, "SetItemAmount")
	/**
	 * Sets a variable to the difference
	 * between the given vectors.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem](s)
	 *
	 * Vectors to subtract
	 *
	 * (*) = Optional
	 */
	fun subtractVectors(items: Items<T>) = block(items, "SubtractVectors")
	/**
	 * Sets a string's capitalization
	 * (eg. to uppercase).
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[TextItem]
	 *
	 * String to change
	 *
	 * (*) = Optional
	 */
	fun setCase(items: Items<T>) = block(items, "SetCase")
	/**
	 * Sets a particle effect's particle
	 * color and color variation.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[ParticleItem]
	 *
	 * Effect to
	 * change
	 *
	 * [TextItem]
	 *
	 * Color hexadecimal
	 *
	 * (*)[NumItem]
	 *
	 * Color variation (%)
	 *
	 * (*) = Optional
	 */
	fun setParticleColor(items: Items<T>) = block(items, "SetParticleColor")
	/**
	 * Gets the light level at
	 * a location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Light location
	 *
	 * (*) = Optional
	 */
	fun getLight(items: Items<T>) = block(items, "GetLight")
	/**
	 * Gets the list of values
	 * in this dictionary.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [DICT]
	 *
	 * Dictionary to
	 * pull from
	 *
	 * (*) = Optional
	 */
	fun getDictValues(items: Items<T>) = block(items, "GetDictValues")
	/**
	 * Sets a variable to a vector.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun vector(items: Items<T>) = block(items, "Vector")
	/**
	 * Sets a variable to the distance
	 * between two locations.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun distance(items: Items<T>) = block(items, "Distance")
	fun setItemLore(items: Items<T>) = block(items, "SetItemLore")
	/**
	 * Takes the root of a number.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[NumItem]
	 *
	 * Number input
	 *
	 * (*)[NumItem]
	 *
	 * Root index
	 *
	 * (*) = Optional
	 */
	fun root(items: Items<T>) = block(items, "Root")
	/**
	 * Sets a particle effect's particle
	 * amount.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[ParticleItem]
	 *
	 * Effect to
	 * change
	 *
	 * [NumItem]
	 *
	 * Particle amount
	 *
	 * (*) = Optional
	 */
	fun setParticleAmount(items: Items<T>) = block(items, "SetParticleAmount")
	/**
	 * Adds an enchantment to an item.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [TextItem]
	 *
	 * Enchantment name
	 *
	 * [NumItem]
	 *
	 * Enchantment level
	 *
	 * (*) = Optional
	 */
	fun addItemEnchant(items: Items<T>) = block(items, "AddItemEnchant")
	/**
	 * Gets an item's material.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item to get material of
	 *
	 * (*) = Optional
	 */
	fun getItemType(items: Items<T>) = block(items, "GetItemType")
	/**
	 * Gets a location's rotation
	 * (pitch and yaw) as a direction.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Location to get
	 * direction of
	 *
	 * (*) = Optional
	 */
	fun getDirection(items: Items<T>) = block(items, "GetDirection")
	/**
	 * Gets a single line from
	 * an item's lore.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item to get lore from
	 *
	 * [NumItem]
	 *
	 * Lore line to get
	 *
	 * (*) = Optional
	 */
	fun getLoreLine(items: Items<T>) = block(items, "GetLoreLine")
	/**
	 * Gets a particle effect's type.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [ParticleItem]
	 *
	 * Effect to get
	 * type of
	 *
	 * (*) = Optional
	 */
	fun getParticleType(items: Items<T>) = block(items, "GetParticleType")
	/**
	 * Searches for part of a string and
	 * removes all instances of it.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable
	 * to set
	 *
	 * (*)[TextItem]
	 *
	 * String to change
	 *
	 * [TextItem](s)
	 *
	 * String to remove
	 *
	 * (*) = Optional
	 */
	fun removeString(items: Items<T>) = block(items, "RemoveString")
	/**
	 * Gets the block state tags
	 * at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*) = Optional
	 */
	fun getAllBlockData(items: Items<T>) = block(items, "GetAllBlockData")
	/**
	 * Sets a variable to the highest
	 * number in a set.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem](s)
	 *
	 * Number set
	 * to compare
	 *
	 * (*) = Optional
	 */
	fun maxNumber(items: Items<T>) = block(items, "MaxNumber")
	/**
	 * Gets the list of keys
	 * in this dictionary.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [DICT]
	 *
	 * Dictionary to
	 * pull from
	 *
	 * (*) = Optional
	 */
	fun getDictKeys(items: Items<T>) = block(items, "GetDictKeys")
	/**
	 * Trims the content of styled text,
	 * leaving all formatting in place.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[COMPONENT]
	 *
	 * Text to trim
	 *
	 * [NumItem]
	 *
	 * Start character position
	 *
	 * (*)[NumItem]
	 *
	 * End character position
	 *
	 * (*) = Optional
	 */
	fun trimStyledText(items: Items<T>) = block(items, "TrimStyledText")
	/**
	 * Sets a particle effect's particle
	 * display material.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[ParticleItem]
	 *
	 * Effect to
	 * change
	 *
	 * Any Item
	 *
	 * Particle material
	 *
	 * (*) = Optional
	 */
	fun setParticleMat(items: Items<T>) = block(items, "SetParticleMat")
	/**
	 * Gets a location's X, Y, Z, pitch,
	 * or yaw coordinate.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun getCoord(items: Items<T>) = block(items, "GetCoord")
	/**
	 * Removes a custom item tag.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [TextItem]
	 *
	 * Tag name
	 *
	 * (*) = Optional
	 */
	fun removeItemTag(items: Items<T>) = block(items, "RemoveItemTag")
	/**
	 * Sets a particle effect's particle
	 * size and size variation.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[ParticleItem]
	 *
	 * Effect to
	 * change
	 *
	 * [NumItem]
	 *
	 * Particle size
	 *
	 * (*)[NumItem]
	 *
	 * Size variation (%)
	 *
	 * (*) = Optional
	 */
	fun setParticleSize(items: Items<T>) = block(items, "SetParticleSize")
	/**
	 * Gets a potion effect's duration.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [POTION]
	 *
	 * Potion to get
	 * duration of
	 *
	 * (*) = Optional
	 */
	fun getPotionDur(items: Items<T>) = block(items, "GetPotionDur")
	/**
	 * Sets the variable to a random
	 * location between two locations.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun randomLoc(items: Items<T>) = block(items, "RandomLoc")
	/**
	 * Sets a sound's type.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[SoundItem]
	 *
	 * Sound to change
	 *
	 * [TextItem]
	 *
	 * Sound name (e.g. "rabbit eat")
	 *
	 * (*) = Optional
	 */
	fun setSoundType(items: Items<T>) = block(items, "SetSoundType")
	/**
	 * Gets a compass's lodestone location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Compass to get lodestone
	 * location of
	 *
	 * (*) = Optional
	 */
	fun getLodestoneLoc(items: Items<T>) = block(items, "GetLodestoneLoc")
	fun shiftDirection(items: Items<T>) = block(items, "ShiftDirection")
	fun getContainerName(items: Items<T>) = block(items, "GetContainerName")
	/**
	 * Gets a particle effect's horizontal
	 * or vertical spread.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [ParticleItem]
	 *
	 * Effect to get
	 * spread of
	 *
	 * (*) = Optional
	 */
	fun getParticleSprd(items: Items<T>) = block(items, "GetParticleSprd")
	/**
	 * Reflects a vector off a
	 * surface defined by another
	 * vector.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[VecItem]
	 *
	 * Vector to reflect
	 *
	 * [VecItem]
	 *
	 * Surface vector
	 *
	 * (*) = Optional
	 */
	fun reflectVector(items: Items<T>) = block(items, "ReflectVector")
	/**
	 * Gets a player head's owner
	 * name or UUID.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Head to get owner of
	 *
	 * (*) = Optional
	 */
	fun getHeadOwner(items: Items<T>) = block(items, "GetHeadOwner")
	fun getItemEnchants(items: Items<T>) = block(items, "GetItemEnchants")
	/**
	 * Adds all entries from one
	 * dictionary into the other.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Dictionary to
	 * add to
	 *
	 * [DICT]
	 *
	 * Dictionary
	 * to append
	 *
	 * (*) = Optional
	 */
	fun appendDict(items: Items<T>) = block(items, "AppendDict")
	/**
	 * Gets an item's maximum stack size.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item to get maximum stack
	 * size of
	 *
	 * (*) = Optional
	 */
	fun getMaxItemAmount(items: Items<T>) = block(items, "GetMaxItemAmount")
	/**
	 * Gets a color's RGB/HSB/HSL
	 * number values as a list.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [TextItem]
	 *
	 * Color hexadecimal
	 *
	 * (*) = Optional
	 */
	fun getColorChannels(items: Items<T>) = block(items, "GetColorChannels")
	/**
	 * Sets a list variable's value at
	 * an index.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * List to change
	 *
	 * [NumItem]
	 *
	 * Index
	 *
	 * Any Value
	 *
	 * Value to set
	 *
	 * (*) = Optional
	 */
	fun setListValue(items: Items<T>) = block(items, "SetListValue")
	/**
	 * Sets a book's text.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Book
	 *
	 * [COMPONENT](s)
	 *
	 * Pages
	 *
	 * [COMPONENT]
	 *
	 * Page text
	 *
	 * [NumItem]
	 *
	 * Page number
	 *
	 * (*) = Optional
	 */
	fun setBookText(items: Items<T>) = block(items, "SetBookText")
	/**
	 * Sets a variable to a random
	 * value from a set.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Value(s)
	 *
	 * Value set
	 * to choose from
	 *
	 * (*) = Optional
	 */
	fun randomValue(items: Items<T>) = block(items, "RandomValue")
	/**
	 * Sets an item's material.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [TextItem]
	 *
	 * Material
	 *
	 * (*) = Optional
	 */
	fun setItemType(items: Items<T>) = block(items, "SetItemType")
	/**
	 * Gets the given sound's type.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * Sound to get type of
	 *
	 * (*) = Optional
	 */
	fun getSoundType(items: Items<T>) = block(items, "GetSoundType")
	/**
	 * Gets a list variable's value at
	 * an index.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LIST]
	 *
	 * List to get value of
	 *
	 * [NumItem]
	 *
	 * Index
	 *
	 * (*) = Optional
	 */
	fun getListValue(items: Items<T>) = block(items, "GetListValue")
	/**
	 * Sets a variable to the trigonometric
	 * tangent function of a number.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Number input
	 *
	 * (*) = Optional
	 */
	fun tangent(items: Items<T>) = block(items, "Tangent")
	/**
	 * Gets a Voronoi noise value: A cellular
	 * noise in which the value of an entire
	 * cell is calculated.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Noise location
	 *
	 * (*)[NumItem]
	 *
	 * Cell frequency
	 *
	 * (*)[NumItem]
	 *
	 * Cell scatter
	 *
	 * (*)[NumItem]
	 *
	 * Generation seed
	 *
	 * (*) = Optional
	 */
	fun voronoiNoise(items: Items<T>) = block(items, "VoronoiNoise")
	fun setDirection(items: Items<T>) = block(items, "SetDirection")
	/**
	 * Creates a color based on hue,
	 * saturation, and brightness.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Hue (Color circle, §c0§7-§c360§7)
	 *
	 * (*)[NumItem]
	 *
	 * Saturation (§c0§7-§c100§7)
	 *
	 * (*)[NumItem]
	 *
	 * Brightness (§c0§7-§c100§7)
	 *
	 * [LIST]
	 *
	 * H, S, B values
	 *
	 * (*) = Optional
	 */
	fun hSBColor(items: Items<T>) = block(items, "HSBColor")
	/**
	 * Increments a number variable
	 * by 1 or more other numbers.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable
	 * to increment
	 *
	 * (*)[NumItem](s)
	 *
	 * Number(s) to
	 * increment by
	 *
	 * (*) = Optional
	 */
	fun increment(items: Items<T>) = block(items, "+=")
	/**
	 * Gets the variant of a sound.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [SoundItem]
	 *
	 * Sound to get variant of
	 *
	 * (*) = Optional
	 */
	fun getSoundVariant(items: Items<T>) = block(items, "GetSoundVariant")
	/**
	 * Gets a colorable item's color.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable
	 * to set
	 *
	 * Any Item
	 *
	 * Item to get color of
	 *
	 * (*) = Optional
	 */
	fun getItemColor(items: Items<T>) = block(items, "GetItemColor")
	/**
	 * Clears all formatting from the
	 * given styled text.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[COMPONENT]
	 *
	 * Text to change
	 *
	 * (*) = Optional
	 */
	fun clearFormatting(items: Items<T>) = block(items, "ClearFormatting")
	/**
	 * Inserts a value into a list
	 * variable at an index, shifting
	 * all values at and after it to
	 * the right.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * List to change
	 *
	 * [NumItem]
	 *
	 * Index
	 *
	 * Any Value
	 *
	 * Value to insert
	 *
	 * (*) = Optional
	 */
	fun insertListValue(items: Items<T>) = block(items, "InsertListValue")
	/**
	 * Sets a sound's volume.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[SoundItem]
	 *
	 * Sound to change
	 *
	 * [NumItem]
	 *
	 * Volume
	 *
	 * (*) = Optional
	 */
	fun setSoundVolume(items: Items<T>) = block(items, "SetSoundVolume")
	/**
	 * Sets a location's X, Y, Z, pitch,
	 * or yaw coordinate.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LocItem]
	 *
	 * Location to change
	 *
	 * [NumItem]
	 *
	 * Coordinate
	 *
	 * (*) = Optional
	 */
	fun setCoord(items: Items<T>) = block(items, "SetCoord")
	/**
	 * Sets a variable to the sum
	 * of the given vectors.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [VecItem](s)
	 *
	 * Vectors to add
	 *
	 * (*) = Optional
	 */
	fun addVectors(items: Items<T>) = block(items, "AddVectors")
	fun setPitch(items: Items<T>) = block(items, "SetPitch")
	fun raycastBlock(items: Items<T>) = block(items, "RaycastBlock")
	/**
	 * Sets a player head's texture
	 * using an owning player
	 * or custom texture.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Player head
	 *
	 * [TextItem]
	 *
	 * Owner name, UUID or
	 * texture value
	 *
	 * (*) = Optional
	 */
	fun setHeadTexture(items: Items<T>) = block(items, "SetHeadTexture")
	/**
	 * Gets a Perlin noise value: A type
	 * of fractal gradient noise.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Noise location
	 *
	 * (*)[NumItem]
	 *
	 * Frequency (Scale)
	 *
	 * (*)[NumItem]
	 *
	 * Octaves (Perlin layers)
	 *
	 * (*)[NumItem]
	 *
	 * Octave frequency gain
	 *
	 * (*)[NumItem]
	 *
	 * Octave amplitude gain
	 *
	 * (*)[NumItem]
	 *
	 * Generation seed
	 *
	 * (*) = Optional
	 */
	fun perlinNoise(items: Items<T>) = block(items, "PerlinNoise")
	/**
	 * Gets a Worley noise value: A cellular
	 * noise in which the distance between
	 * two cells' nuclei is calculated.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Noise location
	 *
	 * (*)[NumItem]
	 *
	 * Cell frequency
	 *
	 * (*)[NumItem]
	 *
	 * Cell scatter
	 *
	 * (*)[NumItem]
	 *
	 * Generation seed
	 *
	 * (*) = Optional
	 */
	fun worleyNoise(items: Items<T>) = block(items, "WorleyNoise")
	/**
	 * Sets a colorable item's color.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [TextItem]
	 *
	 * Color hexadecimal
	 *
	 * (*) = Optional
	 */
	fun setItemColor(items: Items<T>) = block(items, "SetItemColor")
	/**
	 * Gets a particle effect's particle
	 * color.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [ParticleItem]
	 *
	 * Effect to get
	 * color of
	 *
	 * (*) = Optional
	 */
	fun getParticleColor(items: Items<T>) = block(items, "GetParticleColor")
	/**
	 * Sets a sound's pitch or note
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[SoundItem]
	 *
	 * Sound to change
	 *
	 * [NumItem]
	 *
	 * Pitch
	 *
	 * [TextItem]
	 *
	 * Note
	 *
	 * (*) = Optional
	 */
	fun setSoundPitch(items: Items<T>) = block(items, "SetSoundPitch")
	/**
	 * Gets which blocks an item
	 * can be placed on in Adventure Mode.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item
	 *
	 * (*) = Optional
	 */
	fun getCanPlaceOn(items: Items<T>) = block(items, "GetCanPlaceOn")
	/**
	 * Sorts a list variable's values.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LIST]
	 *
	 * List to sort
	 *
	 * (*) = Optional
	 */
	fun sortList(items: Items<T>) = block(items, "SortList")
	/**
	 * Sets the key of a custom sound.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[SoundItem]
	 *
	 * Sound to change
	 *
	 * (*)[TextItem]
	 *
	 * Sound key
	 *
	 * (*) = Optional
	 */
	fun setCustomSound(items: Items<T>) = block(items, "SetCustomSound")
	/**
	 * Removes the dictionary entry
	 * with the given key.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Dictionary to change
	 *
	 * [TextItem]
	 *
	 * Key to remove
	 *
	 * (*)Any Value(s)
	 *
	 * Expected value(s)
	 *
	 * (*) = Optional
	 */
	fun removeDictEntry(items: Items<T>) = block(items, "RemoveDictEntry")
	/**
	 * Converts a numerical timestamp to
	 * a human-readable time/date text
	 * using a date format.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Time to format
	 *
	 * (*)[TextItem]
	 *
	 * Custom Format
	 *
	 * (*) = Optional
	 */
	fun formatTime(items: Items<T>) = block(items, "FormatTime")
	/**
	 * Sets which components of an item
	 * are visible, similar to /hideflags.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item
	 *
	 * (*) = Optional
	 */
	fun setItemFlags(items: Items<T>) = block(items, "SetItemFlags")
	/**
	 * Gets the number of characters
	 * a string has.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [TextItem]
	 *
	 * String to measure
	 *
	 * (*) = Optional
	 */
	fun stringLength(items: Items<T>) = block(items, "StringLength")
	/**
	 * Gets the potion effects applied by
	 * an item.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item to get effects from
	 *
	 * (*) = Optional
	 */
	fun getItemEffects(items: Items<T>) = block(items, "GetItemEffects")
	/**
	 * Sets a variable to a styled text, or combines
	 * multiple values into one styled text.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Value(s)
	 *
	 * Text to set to
	 *
	 * (*) = Optional
	 */
	fun styledText(items: Items<T>) = block(items, "StyledText")
	/**
	 * Gets the MiniMessage expression for
	 * a styled text value.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [COMPONENT]
	 *
	 * Text to read
	 *
	 * (*) = Optional
	 */
	fun getMiniMessageExpr(items: Items<T>) = block(items, "GetMiniMessageExpr")
	fun setYaw(items: Items<T>) = block(items, "SetYaw")
	/**
	 * Sets the potion effects applied by
	 * an item.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [POTION](s)
	 *
	 * Item effects
	 *
	 * (*) = Optional
	 */
	fun setItemEffects(items: Items<T>) = block(items, "SetItemEffects")
	/**
	 * Decrements a number variable
	 * by 1 or more other numbers.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable
	 * to decrement
	 *
	 * (*)[NumItem](s)
	 *
	 * Number(s) to
	 * decrement by
	 *
	 * (*) = Optional
	 */
	fun decrement(items: Items<T>) = block(items, "-=")
	/**
	 * Gets the value of a custom
	 * item tag.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item to get tag of
	 *
	 * [TextItem]
	 *
	 * Tag name
	 *
	 * (*) = Optional
	 */
	fun getItemTag(items: Items<T>) = block(items, "GetItemTag")
	/**
	 * Creates a list from the given
	 * values.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Value(s)
	 *
	 * Value list
	 *
	 * (*) = Optional
	 */
	fun createList(items: Items<T>) = block(items, "CreateList")
	/**
	 * Adds a list to the end of
	 * another list variable.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * List to append to
	 *
	 * [LIST](s)
	 *
	 * List(s) to append
	 *
	 * (*) = Optional
	 */
	fun appendList(items: Items<T>) = block(items, "AppendList")
	/**
	 * Gets a container's contents
	 * at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * (*) = Optional
	 */
	fun getContainerItems(items: Items<T>) = block(items, "GetContainerItems")
	/**
	 * Shifts a location toward another
	 * location by the given distance.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LocItem]
	 *
	 * Location to shift
	 *
	 * [LocItem]
	 *
	 * Target location
	 *
	 * (*)[NumItem]
	 *
	 * Shift distance
	 *
	 * (*) = Optional
	 */
	fun shiftToward(items: Items<T>) = block(items, "ShiftToward")
	/**
	 * Trims a list, starting and ending
	 * at the given indices.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LIST]
	 *
	 * List to trim
	 *
	 * [NumItem]
	 *
	 * Start index
	 *
	 * (*)[NumItem]
	 *
	 * End index
	 *
	 * (*) = Optional
	 */
	fun trimList(items: Items<T>) = block(items, "TrimList")
	/**
	 * Removes enchantments from an item.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * (*) = Optional
	 */
	fun clearEnchants(items: Items<T>) = block(items, "ClearEnchants")
	/**
	 * Sets a variable to the trigonometric
	 * cosine function of a number.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [NumItem]
	 *
	 * Number input
	 *
	 * (*) = Optional
	 */
	fun cosine(items: Items<T>) = block(items, "Cosine")
	/**
	 * Sets a vector's X, Y, or Z
	 * component.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[VecItem]
	 *
	 * Vector to change
	 *
	 * [NumItem]
	 *
	 * Component
	 *
	 * (*) = Optional
	 */
	fun setVectorComp(items: Items<T>) = block(items, "SetVectorComp")
	/**
	 * Converts a string to a number.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[TextItem]
	 *
	 * String to convert
	 *
	 * (*) = Optional
	 */
	fun parseNumber(items: Items<T>) = block(items, "ParseNumber")
	/**
	 * Raises a number to the power
	 * of an exponent.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[NumItem]
	 *
	 * Number input
	 *
	 * (*)[NumItem]
	 *
	 * Exponent
	 *
	 * (*) = Optional
	 */
	fun exponent(items: Items<T>) = block(items, "Exponent")
	fun shiftAllDirs(items: Items<T>) = block(items, "ShiftAllDirs")
	/**
	 * Searches for a value in a list
	 * variable and gets the index if
	 * found.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LIST]
	 *
	 * List to search in
	 *
	 * Any Value
	 *
	 * Value to search
	 *
	 * (*) = Optional
	 */
	fun getValueIndex(items: Items<T>) = block(items, "GetValueIndex")
	/**
	 * Removes an enchantment from an item.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [TextItem]
	 *
	 * Enchantment name
	 *
	 * (*) = Optional
	 */
	fun remItemEnchant(items: Items<T>) = block(items, "RemItemEnchant")
	fun getBookText(items: Items<T>) = block(items, "GetBookText")
	/**
	 * Sets a particle effect's roll.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[ParticleItem]
	 *
	 * Effect to
	 * change
	 *
	 * [NumItem]
	 *
	 * Particle roll
	 *
	 * (*) = Optional
	 */
	fun setParticleRoll(items: Items<T>) = block(items, "SetParticleRoll")
	/**
	 * Sets the variant of a sound.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[SoundItem]
	 *
	 * Sound to change
	 *
	 * (*)[TextItem]
	 *
	 * Variant ID (e.g. "break1")
	 *
	 * (*) = Optional
	 */
	fun setSoundVariant(items: Items<T>) = block(items, "SetSoundVariant")
	fun shiftLocation(items: Items<T>) = block(items, "ShiftLocation")
	/**
	 * Randomizes the order of a
	 * list variable's values.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LIST]
	 *
	 * List to randomize
	 *
	 * (*) = Optional
	 */
	fun randomizeList(items: Items<T>) = block(items, "RandomizeList")
	/**
	 * Checks if a number is between
	 * a minimum and maximum value, and
	 * if not, sets it to the nearest.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[NumItem]
	 *
	 * Number to clamp
	 *
	 * [NumItem]
	 *
	 * Minimum
	 *
	 * [NumItem]
	 *
	 * Maximum
	 *
	 * (*) = Optional
	 */
	fun clampNumber(items: Items<T>) = block(items, "ClampNumber")
	fun round(items: Items<T>) = block(items, "Round")
	/**
	 * Gets a sound's pitch or
	 * note.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun getSoundPitch(items: Items<T>) = block(items, "GetSoundPitch")
	/**
	 * Converts legacy color codes written in
	 * §b"&"§7 or hex format to
	 * functional color codes, or vice versa.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[TextItem]
	 *
	 * String to translate
	 *
	 * (*) = Optional
	 */
	fun translateColors(items: Items<T>) = block(items, "TranslateColors")
	/**
	 * Gets a block's current
	 * growth at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*) = Optional
	 */
	fun getBlockGrowth(items: Items<T>) = block(items, "GetBlockGrowth")
	/**
	 * Gets all tags registered
	 * on an item.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * Any Item
	 *
	 * Item to get tags from
	 *
	 * (*) = Optional
	 */
	fun getAllItemTags(items: Items<T>) = block(items, "GetAllItemTags")
	/**
	 * Removes all matching values
	 * from a list variable.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * List to change
	 *
	 * Any Value(s)
	 *
	 * Value(s) to
	 * remove
	 *
	 * (*) = Optional
	 */
	fun removeListValue(items: Items<T>) = block(items, "RemoveListValue")
	/**
	 * Shifts a location in multiple directions
	 * based on its rotation.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[LocItem]
	 *
	 * Location to shift
	 *
	 * (*)[NumItem]
	 *
	 * Forwards change
	 *
	 * (*)[NumItem]
	 *
	 * Upwards change
	 *
	 * (*)[NumItem]
	 *
	 * Sideways change (-L / +R)
	 *
	 * (*) = Optional
	 */
	fun shiftAllDirections(items: Items<T>) = block(items, "ShiftAllDirections")
	/**
	 * Sets which blocks an item
	 * can be placed on in Adventure Mode.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [BLOCK](s)
	 *
	 * Placeable blocks
	 *
	 * (*) = Optional
	 */
	fun setCanPlaceOn(items: Items<T>) = block(items, "SetCanPlaceOn")
	/**
	 * Gets a block's material
	 * at a location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*) = Optional
	 */
	fun getBlockType(items: Items<T>) = block(items, "GetBlockType")
	fun parsePitch(items: Items<T>) = block(items, "ParsePitch")
	/**
	 * Get a dictionary variable's
	 * value for a key.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [DICT]
	 *
	 * Dictionary to
	 * pull from
	 *
	 * [TextItem]
	 *
	 * Key
	 *
	 * (*) = Optional
	 */
	fun getDictValue(items: Items<T>) = block(items, "GetDictValue")
	/**
	 * Gets a container's lock key at a
	 * location.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * (*) = Optional
	 */
	fun containerLock(items: Items<T>) = block(items, "ContainerLock")
	/**
	 * Gets a block's redstone
	 * power level.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [LocItem]
	 *
	 * Block location
	 *
	 * (*) = Optional
	 */
	fun getBlockPower(items: Items<T>) = block(items, "GetBlockPower")
	/**
	 * Gets a vector's length.
	 *
	 * ARGUMENTS:
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
	 * (*) = Optional
	 */
	fun getVectorLength(items: Items<T>) = block(items, "GetVectorLength")
	/**
	 * Gets the number of characters
	 * a styled text has, ignoring all
	 * formatting tags.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * [COMPONENT]
	 *
	 * Text to measure
	 *
	 * (*) = Optional
	 */
	fun contentLength(items: Items<T>) = block(items, "ContentLength")
	/**
	 * Sets the model value
	 * used in resource packs.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)Any Item
	 *
	 * Item to change
	 *
	 * [NumItem]
	 *
	 * Model value
	 *
	 * (*) = Optional
	 */
	fun setModelData(items: Items<T>) = block(items, "SetModelData")
	fun setCoords(items: Items<T>) = block(items, "SetCoords")
	/**
	 * Gets a particle effect's particle
	 * size.
	 *
	 * ARGUMENTS:
	 *
	 * [VarItem]
	 *
	 * Variable to set
	 *
	 * (*)[ParticleItem]
	 *
	 * Effect to get
	 * size of
	 *
	 * (*) = Optional
	 */
	fun getParticleSize(items: Items<T>) = block(items, "GetParticleSize")





	private fun block(items: Items<T>, action: String) {
		blocks += Block("set_var", ItemCollection(items).items, action)
	}
}