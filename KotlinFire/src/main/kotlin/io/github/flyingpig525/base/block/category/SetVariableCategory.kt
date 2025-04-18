package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.*
import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.block.subaction.*
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put

class SetVariableCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(items: Items, action: String, extra: JsonObjectBuilder.() -> Unit = {}) {
        blocks += Block("set_var", ItemCollection(items).items, action, extra)
    }
	/**
	 * *Gets an item's food property.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item to get properties of*
	 *
	 * (*) = optional
	 */
	fun getItemFood(items: Items) = block(items, "GetItemFood")


	/**
	 * *Sets a variable to a string, or combines*
	 * *multiple values into one string.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [Item]
	 *
	 * (*) *String to set to*
	 *
	 * (*) = optional
	 */
	fun string(items: Items) = block(items, "String")


	/**
	 * *Sets a particle effect's type.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to*
	 * (*) *change*
	 *
	 * [StringItem]
	 *
	 * *Type*
	 *
	 * (*) = optional
	 */
	fun setParticleType(items: Items) = block(items, "SetParticleType")


	/**
	 */
	fun setItemEnchants(items: Items) = block(items, "SetItemEnchants")


	/**
	 * *Removes all item custom tags.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * (*) = optional
	 */
	fun clearItemTag(items: Items) = block(items, "ClearItemTag")


	/**
	 * *Clears all variables with names*
	 * *that match the given text.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Name to match*
	 *
	 * (*) = optional
	 */
	fun purgeVars(items: Items) = block(items, "PurgeVars")


	/**
	 * *Shifts a location's coordinates*
	 * *on the X, Y, and Z axes.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to change*
	 *
	 * [NumItem]
	 *
	 * (*) *X Change*
	 *
	 * [NumItem]
	 *
	 * (*) *Y Change*
	 *
	 * [NumItem]
	 *
	 * (*) *Z Change*
	 *
	 * (*) = optional
	 */
	fun shiftAllAxes(items: Items) = block(items, "ShiftAllAxes")


	/**
	 * *Gets a particle effect's particle*
	 * *display material.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * *Effect to get*
	 * *material of*
	 *
	 * (*) = optional
	 */
	fun getParticleMat(items: Items) = block(items, "GetParticleMat")


	/**
	 * *Sets a particle effect's horizontal*
	 * *and vertical spread.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to change*
	 *
	 * [NumItem]
	 *
	 * *Horizontal spread*
	 *
	 * [NumItem]
	 *
	 * *Vertical spread*
	 *
	 * (*) = optional
	 */
	fun setParticleSprd(items: Items) = block(items, "SetParticleSprd")


	/**
	 * *Makes a number positive*
	 * *if it is negative.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * (*) *Number input*
	 *
	 * (*) = optional
	 */
	fun absoluteValue(items: Items) = block(items, "AbsoluteValue")


	/**
	 * *Adds a value to the end of a list*
	 * *variable.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *List to append to*
	 *
	 * [Item]
	 *
	 * *Value(s) to append*
	 *
	 * (*) = optional
	 */
	fun appendValue(items: Items) = block(items, "AppendValue")


	/**
	 * *Sets a variable to the remainder*
	 * *after dividing two numbers with*
	 * *a whole quotient.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Dividend*
	 *
	 * [NumItem]
	 *
	 * *Divisor*
	 *
	 * (*) = optional
	 */
	fun mod(items: Items) = block(items, "%")


	/**
	 * *Shifts a location along a*
	 * *vector.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to shift*
	 *
	 * [VecItem]
	 *
	 * *Shift vector*
	 *
	 * [NumItem]
	 *
	 * *Shift distance*
	 *
	 * (*) = optional
	 */
	fun shiftOnVector(items: Items) = block(items, "ShiftOnVector")


	/**
	 * *Get an attribute's*
	 * *multiplier for a specific slot.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item*
	 *
	 * (*) = optional
	 */
	fun getItemAttribute(items: Items) = block(items, "GetItemAttribute")


	/**
	 * *Removes all entries from*
	 * *a dictionary.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Dictionary to clear*
	 *
	 * (*) = optional
	 */
	fun clearDict(items: Items) = block(items, "ClearDict")


	/**
	 * *Sets a variable to the sum of*
	 * *the given numbers.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Numbers to add*
	 *
	 * (*) = optional
	 */
	fun plus(items: Items) = block(items, "+")


	/**
	 * *Rotates a location by shifting its pitch*
	 * *(up/down) or yaw (left/right) value.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to shift*
	 *
	 * [NumItem]
	 *
	 * *Rotation amount*
	 *
	 * (*) = optional
	 */
	fun shiftRotation(items: Items) = block(items, "ShiftRotation")


	/**
	 * *Sets a variable to the difference*
	 * *between the given numbers.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Numbers to subtract*
	 *
	 * (*) = optional
	 */
	fun minus(items: Items) = block(items, "-")


	/**
	 * *Gets an item's name.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item to get name of*
	 *
	 * (*) = optional
	 */
	fun getItemName(items: Items) = block(items, " GetItemName ")


	/**
	 * *Gets an item's rarity.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item*
	 *
	 * (*) = optional
	 */
	fun getItemRarity(items: Items) = block(items, "GetItemRarity")


	/**
	 * *Multiplies a vector's length*
	 * *by a number.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * (*) *Vector to multiply*
	 *
	 * [NumItem]
	 *
	 * *Multiplier*
	 *
	 * (*) = optional
	 */
	fun multiplyVector(items: Items) = block(items, "MultiplyVector")


	/**
	 * *Sets a variable to the quotient*
	 * *of the given numbers.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Numbers to divide*
	 *
	 * (*) = optional
	 */
	fun divide(items: Items) = block(items, "/")


	/**
	 */
	fun getSignText(items: Items) = block(items, "GetSignText")


	/**
	 * *Sets a variable to the result*
	 * *of a bitwise operation.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Operand 1*
	 *
	 * [NumItem]
	 *
	 * (*) *Operand 2*
	 *
	 * (*) = optional
	 */
	fun bitwise(items: Items) = block(items, "Bitwise")


	/**
	 * *Gets the displayed page*
	 * *number of a Lectern.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Lectern location*
	 *
	 * (*) = optional
	 */
	fun getLecternPage(items: Items) = block(items, "GetLecternPage")


	/**
	 */
	fun parseX(items: Items) = block(items, "ParseX")


	/**
	 * *Shifts the X, Y, or Z coordinate*
	 * *of a location on its axis.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to shift*
	 *
	 * [NumItem]
	 *
	 * *Shift distance*
	 *
	 * (*) = optional
	 */
	fun shiftOnAxis(items: Items) = block(items, "ShiftOnAxis")


	/**
	 */
	fun parseY(items: Items) = block(items, "ParseY")


	/**
	 * *Sets a variable to the vector*
	 * *between two locations.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Start location*
	 *
	 * [LocItem]
	 *
	 * *End location*
	 *
	 * (*) = optional
	 */
	fun vectorBetween(items: Items) = block(items, "VectorBetween")


	/**
	 */
	fun parseZ(items: Items) = block(items, "ParseZ")


	/**
	 * *Gets a vector's X, Y, or Z*
	 * *component.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * *Vector to get*
	 * *component of*
	 *
	 * (*) = optional
	 */
	fun getVectorComp(items: Items) = block(items, "GetVectorComp")


	/**
	 * *Sets a variable to a value.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [Item]
	 *
	 * *Value*
	 *
	 * (*) = optional
	 */
	fun equalTo(items: Items) = block(items, "=")


	/**
	 */
	fun rmText(items: Items) = block(items, "RmText")


	/**
	 * *Adds an attribute modifier to the*
	 * *item, which is active in a certain*
	 * *equipment slot.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item*
	 *
	 * [NumItem]
	 *
	 * *Modifier Amount*
	 *
	 * (*) = optional
	 */
	fun addItemAttribute(items: Items) = block(items, "AddItemAttribute")


	/**
	 * *Finds an average position (center)*
	 * *of the given locations.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Locations to center*
	 *
	 * (*) = optional
	 */
	fun getCenterLoc(items: Items) = block(items, "GetCenterLoc")


	/**
	 * *Aligns a location to the center*
	 * *or corner of the block it is in.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to align*
	 *
	 * (*) = optional
	 */
	fun alignLoc(items: Items) = block(items, "AlignLoc")


	/**
	 * *Gets a sound's volume.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [SoundItem]
	 *
	 * *Sound to get volume of*
	 *
	 * (*) = optional
	 */
	fun getSoundVolume(items: Items) = block(items, "GetSoundVolume")


	/**
	 * *Sets a variable to a random*
	 * *number between two other*
	 * *numbers.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Minimum number*
	 *
	 * [NumItem]
	 *
	 * *Maximum number*
	 *
	 * (*) = optional
	 */
	fun randomNumber(items: Items) = block(items, "RandomNumber")


	/**
	 * *Gets a container's name at*
	 * *a location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Container location*
	 *
	 * (*) = optional
	 */
	fun containerName(items: Items) = block(items, "ContainerName")


	/**
	 * *Raycasts from a location*
	 * *to the first intersection.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Ray origin*
	 *
	 * [NumItem]
	 *
	 * *Ray distance*
	 *
	 * (*) = optional
	 */
	fun raycast(items: Items) = block(items, "Raycast")


	/**
	 * *Rotates a vector around*
	 * *another vector by an angle.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * (*) *Vector to rotate*
	 *
	 * [VecItem]
	 *
	 * *Axis vector*
	 *
	 * [NumItem]
	 *
	 * *Angle*
	 *
	 * (*) = optional
	 */
	fun rotateAroundVec(items: Items) = block(items, "RotateAroundVec")


	/**
	 * *Adds food properties to an item.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [NumItem]
	 *
	 * *Nutrition*
	 *
	 * [NumItem]
	 *
	 * *Saturation*
	 *
	 * [NumItem]
	 *
	 * (*) *Eating duration*
	 * (*) *(seconds)*
	 *
	 * (*) = optional
	 */
	fun setItemFood(items: Items) = block(items, "SetItemFood")


	/**
	 * *Gets a particle effect's particle*
	 * *motion.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * *Effect to get*
	 * *motion of*
	 *
	 * (*) = optional
	 */
	fun getParticleMotion(items: Items) = block(items, "GetParticleMotion")


	/**
	 * *Sets a particle effect's particle*
	 * *motion and motion variation.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to*
	 * (*) *change*
	 *
	 * [VecItem]
	 *
	 * (*) *Particle motion*
	 *
	 * [NumItem]
	 *
	 * (*) *Motion variation (%)*
	 *
	 * (*) = optional
	 */
	fun setParticleMotion(items: Items) = block(items, "SetParticleMotion")


	/**
	 * *Sets a variable to the average*
	 * *of the given numbers.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Numbers to average*
	 *
	 * (*) = optional
	 */
	fun average(items: Items) = block(items, "Average")


	/**
	 */
	fun wrapNumber(items: Items) = block(items, "WrapNumber")


	/**
	 */
	fun setY(items: Items) = block(items, "SetY")


	/**
	 * *Sets a map item's texture to the*
	 * *image at the given URL.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [StringItem]
	 *
	 * *Image URL*
	 *
	 * (*) = optional
	 */
	fun setMapTexture(items: Items) = block(items, "SetMapTexture")


	/**
	 * *Gets a block state tag*
	 * *value at a location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Block location*
	 *
	 * [StringItem]
	 *
	 * *Tag name*
	 *
	 * (*) = optional
	 */
	fun getBlockData(items: Items) = block(items, "GetBlockData")


	/**
	 */
	fun setX(items: Items) = block(items, "SetX")


	/**
	 * *Sorts a dictionary*
	 * *by its keys or values.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * (*) *Dictionary to sort*
	 *
	 * (*) = optional
	 */
	fun sortDict(items: Items) = block(items, "SortDict")


	/**
	 * *Gets the book on the*
	 * *Lectern at a location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Lectern location*
	 *
	 * (*) = optional
	 */
	fun getLecternBook(items: Items) = block(items, "GetLecternBook")


	/**
	 * *Gets the key of a custom sound.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [SoundItem]
	 *
	 * *Sound to get key of*
	 *
	 * (*) = optional
	 */
	fun getCustomSound(items: Items) = block(items, "GetCustomSound")


	/**
	 * *Sets a variable to the cross*
	 * *product of two vectors.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * *Vector 1*
	 *
	 * [VecItem]
	 *
	 * *Vector 2*
	 *
	 * (*) = optional
	 */
	fun crossProduct(items: Items) = block(items, "CrossProduct")


	/**
	 * *Sets a variable to the product*
	 * *of the given numbers.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Numbers to multiply*
	 *
	 * (*) = optional
	 */
	fun x(items: Items) = block(items, "x")


	/**
	 * *Gets a particle effect's roll.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to get*
	 * (*) *roll of*
	 *
	 * (*) = optional
	 */
	fun getParticleRoll(items: Items) = block(items, "GetParticleRoll")


	/**
	 */
	fun parseYaw(items: Items) = block(items, "ParseYaw")


	/**
	 * *Sets a variable to the dot*
	 * *product of two vectors.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * *Vector 1*
	 *
	 * [VecItem]
	 *
	 * *Vector 2*
	 *
	 * (*) = optional
	 */
	fun dotProduct(items: Items) = block(items, "DotProduct")


	/**
	 */
	fun setZ(items: Items) = block(items, "SetZ")


	/**
	 * *Sets the trim of an*
	 * *armor item.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * (*) = optional
	 */
	fun setArmorTrim(items: Items) = block(items, "SetArmorTrim")


	/**
	 * *Gets a list variable's value at*
	 * *an index and removes it.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * *List to get value of*
	 *
	 * [NumItem]
	 *
	 * (*) *Index*
	 *
	 * (*) = optional
	 */
	fun popListValue(items: Items) = block(items, "PopListValue")


	/**
	 * *Sets a particle effect's opacity.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to*
	 * (*) *change*
	 *
	 * [NumItem]
	 *
	 * *Particle opacity*
	 *
	 * (*) = optional
	 */
	fun setParticleOpac(items: Items) = block(items, "SetParticleOpac")


	/**
	 * *Gets a seeded noise value.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Noise location*
	 *
	 * [NumItem]
	 *
	 * (*) *Frequency*
	 *
	 * [NumItem]
	 *
	 * (*) *Octaves*
	 *
	 * [NumItem]
	 *
	 * (*) *Lacunarity*
	 *
	 * [NumItem]
	 *
	 * (*) *Gain*
	 *
	 * [NumItem]
	 *
	 * (*) *Generation seed*
	 *
	 * (*) = optional
	 */
	fun noise(items: Items) = block(items, "Noise")


	/**
	 * *Sets a variable to the lowest*
	 * *number in a set.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Number set*
	 * *to compare*
	 *
	 * (*) = optional
	 */
	fun minNumber(items: Items) = block(items, "MinNumber")


	/**
	 * *Gets a potion effect's type.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [PotionItem]
	 *
	 * *Potion to get*
	 * *type of*
	 *
	 * (*) = optional
	 */
	fun getPotionType(items: Items) = block(items, "GetPotionType")


	/**
	 */
	fun setItemName(items: Items) = block(items, "SetItemName")


	/**
	 * *Gets the number of values*
	 * *a list has.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * *List to measure*
	 *
	 * (*) = optional
	 */
	fun listLength(items: Items) = block(items, "ListLength")


	/**
	 * *Sets a variable to the trigonometric*
	 * *sine function of a number.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Number input*
	 *
	 * (*) = optional
	 */
	fun sine(items: Items) = block(items, "Sine")


	/**
	 * *Sets a variable to the name*
	 * *of the direction of a vector.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * *Direction*
	 *
	 * (*) = optional
	 */
	fun directionName(items: Items) = block(items, "DirectionName")


	/**
	 * *Repeats a string the given number*
	 * *of times.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * *String to repeat*
	 *
	 * [NumItem]
	 *
	 * *Times to repeat*
	 *
	 * (*) = optional
	 */
	fun repeatString(items: Items) = block(items, "RepeatString")


	/**
	 */
	fun getItemLore(items: Items) = block(items, "GetItemLore")


	/**
	 * *Combines a list of strings.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * *Strings to join*
	 *
	 * [StringItem]
	 *
	 * (*) *Joining string*
	 *
	 * [StringItem]
	 *
	 * (*) *Final joining string*
	 *
	 * (*) = optional
	 */
	fun joinString(items: Items) = block(items, "JoinString")


	/**
	 * *Reverses the order of a*
	 * *list variable's values.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * (*) *List to reverse*
	 *
	 * (*) = optional
	 */
	fun reverseList(items: Items) = block(items, "ReverseList")


	/**
	 * *Removes list elements that appear*
	 * *more than once.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * (*) *List to de-duplicate*
	 *
	 * (*) = optional
	 */
	fun dedupList(items: Items) = block(items, "DedupList")


	/**
	 * *Creates a dictionary with the*
	 * *given keys and values.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * (*) *Key list*
	 *
	 * [VarItem]
	 *
	 * (*) *Value list*
	 *
	 * (*) = optional
	 */
	fun createDict(items: Items) = block(items, "CreateDict")


	/**
	 * *Gets a list of blocks that*
	 * *belongs to the specified*
	 * *block tag.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * *Block tag ID*
	 *
	 * (*) = optional
	 */
	fun getBlockByMCTag(items: Items) = block(items, "GetBlockByMCTag")


	/**
	 */
	fun roundNumber(items: Items) = block(items, "RoundNumber")


	/**
	 * *Sets a location's rotation to*
	 * *face another location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to change*
	 *
	 * [LocItem]
	 *
	 * *Target location*
	 *
	 * (*) = optional
	 */
	fun faceLocation(items: Items) = block(items, "FaceLocation")


	/**
	 */
	fun getItemLoreLine(items: Items) = block(items, "GetItemLoreLine")


	/**
	 * *Sets a vector's length. This*
	 * *affects all components.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * (*) *Vector to change*
	 *
	 * [NumItem]
	 *
	 * (*) *Length*
	 *
	 * (*) = optional
	 */
	fun setVectorLength(items: Items) = block(items, "SetVectorLength")


	/**
	 * *Sets a potion effect's duration.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [PotionItem]
	 *
	 * (*) *Potion to change*
	 *
	 * [NumItem]
	 *
	 * *Duration (ticks)*
	 *
	 * (*) = optional
	 */
	fun setPotionDur(items: Items) = block(items, "SetPotionDur")


	/**
	 * *Gets a block's blast resistance.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Block to check*
	 *
	 * [LocItem]
	 *
	 * *Location to check*
	 *
	 * (*) = optional
	 */
	fun blockResistance(items: Items) = block(items, "BlockResistance")


	/**
	 * *Splits a string into a list of strings.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * *String to split*
	 *
	 * [StringItem]
	 *
	 * (*) *Splitter string*
	 *
	 * (*) = optional
	 */
	fun splitString(items: Items) = block(items, "SplitString")


	/**
	 * *Sets a variable to a normally distributed*
	 * *random number. Values closer to μ are*
	 * *more likely to be chosen.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *μ (Mean midpoint)*
	 *
	 * [NumItem]
	 *
	 * *σ (Standard deviation)*
	 *
	 * (*) = optional
	 */
	fun normalRandom(items: Items) = block(items, "NormalRandom")


	/**
	 * *Sets a potion effect's type.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [PotionItem]
	 *
	 * (*) *Potion to change*
	 *
	 * [StringItem]
	 *
	 * *Type*
	 *
	 * (*) = optional
	 */
	fun setPotionType(items: Items) = block(items, "SetPotionType")


	/**
	 * *Aligns a vector to the*
	 * *nearest axis.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * (*) *Vector to align*
	 *
	 * (*) = optional
	 */
	fun alignVector(items: Items) = block(items, "AlignVector")


	/**
	 * *Sets the given item's durability.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item*
	 *
	 * [NumItem]
	 *
	 * *Item durability*
	 *
	 * (*) = optional
	 */
	fun setItemDura(items: Items) = block(items, "SetItemDura")


	/**
	 * *Sets whether an item is*
	 * *unbreakable.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item*
	 *
	 * (*) = optional
	 */
	fun setBreakability(items: Items) = block(items, "SetBreakability")


	/**
	 * *Set an item's maximum stack size.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [NumItem]
	 *
	 * (*) *Maximum stack size*
	 * (*) *(1-99)*
	 *
	 * (*) = optional
	 */
	fun setMaxAmount(items: Items) = block(items, "SetMaxAmount")


	/**
	 */
	fun raycastEntity(items: Items) = block(items, "RaycastEntity")


	/**
	 * *Sets the given key to the value.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Dictionary to add to*
	 *
	 * [StringItem]
	 *
	 * *Key*
	 *
	 * [Item]
	 *
	 * *Value*
	 *
	 * (*) = optional
	 */
	fun setDictValue(items: Items) = block(items, "SetDictValue")


	/**
	 * *Sets a location's coordinates or*
	 * *creates a new location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to change*
	 *
	 * [NumItem]
	 *
	 * (*) *New X*
	 *
	 * [NumItem]
	 *
	 * (*) *New Y*
	 *
	 * [NumItem]
	 *
	 * (*) *New Z*
	 *
	 * [NumItem]
	 *
	 * (*) *New Pitch*
	 *
	 * [NumItem]
	 *
	 * (*) *New Yaw*
	 *
	 * (*) = optional
	 */
	fun setAllCoords(items: Items) = block(items, "SetAllCoords")


	/**
	 * *Creates a color hex based on red,*
	 * *green, and blue channels.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Red (0-255)*
	 *
	 * [NumItem]
	 *
	 * *Green (0-255)*
	 *
	 * [NumItem]
	 *
	 * *Blue (0-255)*
	 *
	 * [VarItem]
	 *
	 * *R, G, B values*
	 *
	 * (*) = optional
	 */
	fun rGBColor(items: Items) = block(items, "RGBColor")


	/**
	 * *Sets which blocks an item*
	 * *can break in Adventure Mode.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [MinecraftItem]
	 *
	 * *Breakable blocks*
	 *
	 * (*) = optional
	 */
	fun setCanDestroy(items: Items) = block(items, "SetCanDestroy")


	/**
	 * *Creates a color based on hue,*
	 * *saturation, and lightness.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Hue (Color circle, 0-360)*
	 *
	 * [NumItem]
	 *
	 * (*) *Saturation (0-100)*
	 *
	 * [NumItem]
	 *
	 * (*) *Lightness (0-100)*
	 *
	 * [VarItem]
	 *
	 * *H, S, L values*
	 *
	 * (*) = optional
	 */
	fun hSLColor(items: Items) = block(items, "HSLColor")


	/**
	 */
	fun getDirection(items: Items) = block(items, " GetDirection ")


	/**
	 * *Removes a list variable's value*
	 * *at an index and shifts all values*
	 * *after it to the left.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *List to change*
	 *
	 * [NumItem]
	 *
	 * *Index to remove*
	 *
	 * (*) = optional
	 */
	fun removeListIndex(items: Items) = block(items, "RemoveListIndex")


	/**
	 * *Gets cellular noise: A type of noise*
	 * *based on distance from cell origins.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Noise location*
	 *
	 * [NumItem]
	 *
	 * (*) *Frequency*
	 *
	 * [NumItem]
	 *
	 * (*) *Marbling*
	 *
	 * [NumItem]
	 *
	 * (*) *Octaves*
	 *
	 * [NumItem]
	 *
	 * (*) *Lacunarity*
	 *
	 * [NumItem]
	 *
	 * (*) *Gain*
	 *
	 * [NumItem]
	 *
	 * (*) *Warping*
	 *
	 * [NumItem]
	 *
	 * (*) *Resonance*
	 *
	 * [NumItem]
	 *
	 * (*) *Domains*
	 *
	 * [NumItem]
	 *
	 * (*) *Domain lacunarity*
	 *
	 * [NumItem]
	 *
	 * (*) *Domain gain*
	 *
	 * [NumItem]
	 *
	 * (*) *Generation seed*
	 *
	 * (*) = optional
	 */
	fun cellularNoise(items: Items) = block(items, "CellularNoise")


	/**
	 * *Finds the logarithm of a number.*
	 * *A logarithm is the power the*
	 * *base must be raised to to get*
	 * *the given input.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * (*) *Number input*
	 *
	 * [NumItem]
	 *
	 * *Base*
	 *
	 * (*) = optional
	 */
	fun logarithm(items: Items) = block(items, "Logarithm")


	/**
	 * *Sets the value of or creates*
	 * *a custom stored tag value.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [StringItem]
	 *
	 * *Tag name*
	 *
	 * [NumItem]
	 *
	 * *Tag value*
	 *
	 * [StringItem]
	 *
	 * *Tag value*
	 *
	 * (*) = optional
	 */
	fun setItemTag(items: Items) = block(items, "SetItemTag")


	/**
	 * *Trims a string, starting and ending*
	 * *at the given positions.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * (*) *String to trim*
	 *
	 * [NumItem]
	 *
	 * *Start character position*
	 *
	 * [NumItem]
	 *
	 * (*) *End character position*
	 *
	 * (*) = optional
	 */
	fun trimString(items: Items) = block(items, "TrimString")


	/**
	 * *Parses a MiniMessage expression from*
	 * *a string value into a styled text.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * *String to parse*
	 *
	 * (*) = optional
	 */
	fun parseMiniMessageExpr(items: Items) = block(items, "ParseMiniMessageExpr")


	/**
	 * *Gets an item's stack size.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item to get stack*
	 * *size of*
	 *
	 * (*) = optional
	 */
	fun getItemAmount(items: Items) = block(items, "GetItemAmount")


	/**
	 * *Sets a potion effect's amplifier.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [PotionItem]
	 *
	 * (*) *Potion to change*
	 *
	 * [NumItem]
	 *
	 * *Amplifier*
	 *
	 * (*) = optional
	 */
	fun setPotionAmp(items: Items) = block(items, "SetPotionAmp")


	/**
	 * *Gets which blocks an item*
	 * *can break in Adventure Mode.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item*
	 *
	 * (*) = optional
	 */
	fun getCanDestroy(items: Items) = block(items, "GetCanDestroy")


	/**
	 * *Rotates a vector around an*
	 * *axis by an angle.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * (*) *Vector to rotate*
	 *
	 * [NumItem]
	 *
	 * *Angle*
	 *
	 * (*) = optional
	 */
	fun rotateAroundAxis(items: Items) = block(items, "RotateAroundAxis")


	/**
	 * *Gets the given item's current or*
	 * *maximum durability.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item*
	 *
	 * (*) = optional
	 */
	fun getItemDura(items: Items) = block(items, "GetItemDura")


	/**
	 * *Shifts a location forward, upward,*
	 * *or sideways based on its rotation.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to shift*
	 *
	 * [NumItem]
	 *
	 * (*) *Shift distance*
	 *
	 * (*) = optional
	 */
	fun shiftInDirection(items: Items) = block(items, "ShiftInDirection")


	/**
	 * *Checks if a number is inside*
	 * *the bounds and if not, wraps*
	 * *it around the farthest bound.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * (*) *Number to wrap*
	 *
	 * [NumItem]
	 *
	 * *Lower bound (inclusive)*
	 *
	 * [NumItem]
	 *
	 * *Upper bound (exclusive)*
	 *
	 * (*) = optional
	 */
	fun wrapNum(items: Items) = block(items, "WrapNum")


	/**
	 * *Searches for part of a string*
	 * *and replaces it.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable*
	 * *to set*
	 *
	 * [StringItem]
	 *
	 * *String to change*
	 *
	 * [StringItem]
	 *
	 * *String part to replace*
	 *
	 * [StringItem]
	 *
	 * *Replacement*
	 *
	 * (*) = optional
	 */
	fun replaceString(items: Items) = block(items, "ReplaceString")


	/**
	 * *Sets whether an item is*
	 * *glowing regardless of*
	 * *its enchantments.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * (*) = optional
	 */
	fun setItemGlowing(items: Items) = block(items, "SetItemGlowing")


	/**
	 * *Sets a compass's lodestone location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [LocItem]
	 *
	 * *Lodestone location*
	 *
	 * (*) = optional
	 */
	fun setLodestoneLoc(items: Items) = block(items, "SetLodestoneLoc")


	/**
	 * *Sets a variable to a list with*
	 * *its sub-lists spread out*
	 * *into individual elements.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * (*) *List to flatten*
	 *
	 * (*) = optional
	 */
	fun flattenList(items: Items) = block(items, "FlattenList")


	/**
	 * *Gets a block's hardness value.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Block to check*
	 *
	 * [LocItem]
	 *
	 * *Location to check*
	 *
	 * (*) = optional
	 */
	fun blockHardness(items: Items) = block(items, "BlockHardness")


	/**
	 * *Gets a potion effect's amplifier.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [PotionItem]
	 *
	 * *Potion to get*
	 * *amplifier of*
	 *
	 * (*) = optional
	 */
	fun getPotionAmp(items: Items) = block(items, "GetPotionAmp")


	/**
	 * *Gets a particle effect's particle*
	 * *amount.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * *Effect to get*
	 * *amount of*
	 *
	 * (*) = optional
	 */
	fun getParticleAmount(items: Items) = block(items, "GetParticleAmount")


	/**
	 * *Gets the number of entries*
	 * *in a dictionary.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * *Dictionary to*
	 * *measure*
	 *
	 * (*) = optional
	 */
	fun getDictSize(items: Items) = block(items, "GetDictSize")


	/**
	 * *Sets an item's stack size.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [NumItem]
	 *
	 * *Stack size*
	 *
	 * (*) = optional
	 */
	fun setItemAmount(items: Items) = block(items, "SetItemAmount")


	/**
	 * *Sets a variable to the difference*
	 * *between the given vectors.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * *Vectors to subtract*
	 *
	 * (*) = optional
	 */
	fun subtractVectors(items: Items) = block(items, "SubtractVectors")


	/**
	 * *Sets a string's capitalization*
	 * *(eg. to uppercase).*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * (*) *String to change*
	 *
	 * (*) = optional
	 */
	fun setCase(items: Items) = block(items, "SetCase")


	/**
	 * *Sets a particle effect's particle*
	 * *color and color variation.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to*
	 * (*) *change*
	 *
	 * [StringItem]
	 *
	 * *Color hexadecimal*
	 *
	 * [NumItem]
	 *
	 * (*) *Color variation (%)*
	 *
	 * (*) = optional
	 */
	fun setParticleColor(items: Items) = block(items, "SetParticleColor")


	/**
	 * *Gets the light level at*
	 * *a location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Light location*
	 *
	 * (*) = optional
	 */
	fun getLight(items: Items) = block(items, "GetLight")


	/**
	 * *Gets a book's text.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Book*
	 *
	 * [NumItem]
	 *
	 * (*) *Page number*
	 *
	 * (*) = optional
	 */
	fun getBookText(items: Items) = block(items, " GetBookText ")


	/**
	 * *Gets the list of values*
	 * *in this dictionary.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * *Dictionary to*
	 * *pull from*
	 *
	 * (*) = optional
	 */
	fun getDictValues(items: Items) = block(items, "GetDictValues")


	/**
	 * *Sets a variable to a vector.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *X component*
	 *
	 * [NumItem]
	 *
	 * *Y component*
	 *
	 * [NumItem]
	 *
	 * *Z component*
	 *
	 * (*) = optional
	 */
	fun vector(items: Items) = block(items, "Vector")


	/**
	 * *Sets a variable to the distance*
	 * *between two locations.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Location 1*
	 *
	 * [LocItem]
	 *
	 * *Location 2*
	 *
	 * (*) = optional
	 */
	fun distance(items: Items) = block(items, "Distance")


	/**
	 */
	fun setItemLore(items: Items) = block(items, "SetItemLore")


	/**
	 * *Takes the root of a number.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * (*) *Number input*
	 *
	 * [NumItem]
	 *
	 * (*) *Root index*
	 *
	 * (*) = optional
	 */
	fun root(items: Items) = block(items, "Root")


	/**
	 * *Sets a particle effect's particle*
	 * *amount.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to*
	 * (*) *change*
	 *
	 * [NumItem]
	 *
	 * *Particle amount*
	 *
	 * (*) = optional
	 */
	fun setParticleAmount(items: Items) = block(items, "SetParticleAmount")


	/**
	 * *Adds an enchantment to an item.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [StringItem]
	 *
	 * *Enchantment name*
	 *
	 * [NumItem]
	 *
	 * *Enchantment level*
	 *
	 * (*) = optional
	 */
	fun addItemEnchant(items: Items) = block(items, "AddItemEnchant")


	/**
	 * *Adds a rule for breaking blocks*
	 * *to a tool item.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [NumItem]
	 *
	 * *Mining speed*
	 *
	 * [MinecraftItem]
	 *
	 * *Blocks to apply*
	 * *the rule for*
	 *
	 * [StringItem]
	 *
	 * *Block tag ID to*
	 * *apply the rule for*
	 *
	 * (*) = optional
	 */
	fun addItemToolRule(items: Items) = block(items, "AddItemToolRule")


	/**
	 * *Gets an item's material.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item to get material of*
	 *
	 * (*) = optional
	 */
	fun getItemType(items: Items) = block(items, "GetItemType")


	/**
	 * *Gets a single line from*
	 * *an item's lore.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item to get lore from*
	 *
	 * [NumItem]
	 *
	 * *Lore line to get*
	 *
	 * (*) = optional
	 */
	fun getLoreLine(items: Items) = block(items, "GetLoreLine")


	/**
	 * *Gets a particle effect's type.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * *Effect to get*
	 * *type of*
	 *
	 * (*) = optional
	 */
	fun getParticleType(items: Items) = block(items, "GetParticleType")


	/**
	 * *Sets the given item's maximum durability.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item*
	 *
	 * [NumItem]
	 *
	 * *Maximum durability*
	 *
	 * (*) = optional
	 */
	fun setItemMaxDura(items: Items) = block(items, "SetItemMaxDura")


	/**
	 * *Searches for part of a string and*
	 * *removes all instances of it.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable*
	 * *to set*
	 *
	 * [StringItem]
	 *
	 * (*) *String to change*
	 *
	 * [StringItem]
	 *
	 * *String to remove*
	 *
	 * (*) = optional
	 */
	fun removeString(items: Items) = block(items, "RemoveString")


	/**
	 * *Gets the block state tags*
	 * *at a location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Block location*
	 *
	 * (*) = optional
	 */
	fun getAllBlockData(items: Items) = block(items, "GetAllBlockData")


	/**
	 * *Sets a variable to the highest*
	 * *number in a set.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Number set*
	 * *to compare*
	 *
	 * (*) = optional
	 */
	fun maxNumber(items: Items) = block(items, "MaxNumber")


	/**
	 * *Gets the list of keys*
	 * *in this dictionary.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * *Dictionary to*
	 * *pull from*
	 *
	 * (*) = optional
	 */
	fun getDictKeys(items: Items) = block(items, "GetDictKeys")


	/**
	 * *Trims the content of styled text,*
	 * *leaving all formatting in place.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [TextItem]
	 *
	 * (*) *Text to trim*
	 *
	 * [NumItem]
	 *
	 * *Start character position*
	 *
	 * [NumItem]
	 *
	 * (*) *End character position*
	 *
	 * (*) = optional
	 */
	fun trimStyledText(items: Items) = block(items, "TrimStyledText")


	/**
	 * *Sets a particle effect's particle*
	 * *display material.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to*
	 * (*) *change*
	 *
	 * [MinecraftItem]
	 *
	 * *Particle material*
	 *
	 * (*) = optional
	 */
	fun setParticleMat(items: Items) = block(items, "SetParticleMat")


	/**
	 * *Gets a location's X, Y, Z, pitch,*
	 * *or yaw coordinate.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Location to get*
	 * *coordinate of*
	 *
	 * (*) = optional
	 */
	fun getCoord(items: Items) = block(items, "GetCoord")


	/**
	 * *Removes a custom item tag.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [StringItem]
	 *
	 * *Tag name*
	 *
	 * (*) = optional
	 */
	fun removeItemTag(items: Items) = block(items, "RemoveItemTag")


	/**
	 * *Sets a particle effect's particle*
	 * *size and size variation.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to*
	 * (*) *change*
	 *
	 * [NumItem]
	 *
	 * *Particle size*
	 *
	 * [NumItem]
	 *
	 * (*) *Size variation (%)*
	 *
	 * (*) = optional
	 */
	fun setParticleSize(items: Items) = block(items, "SetParticleSize")


	/**
	 * *Gets a potion effect's duration.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [PotionItem]
	 *
	 * *Potion to get*
	 * *duration of*
	 *
	 * (*) = optional
	 */
	fun getPotionDur(items: Items) = block(items, "GetPotionDur")


	/**
	 * *Sets the variable to a random*
	 * *location between two locations.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Location 1*
	 *
	 * [LocItem]
	 *
	 * *Location 2*
	 *
	 * (*) = optional
	 */
	fun randomLoc(items: Items) = block(items, "RandomLoc")


	/**
	 * *Sets a sound's type.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [SoundItem]
	 *
	 * (*) *Sound to change*
	 *
	 * [StringItem]
	 *
	 * *Sound name (e.g. "rabbit eat")*
	 *
	 * (*) = optional
	 */
	fun setSoundType(items: Items) = block(items, "SetSoundType")


	/**
	 * *Gets a compass's lodestone location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Compass to get lodestone*
	 * *location of*
	 *
	 * (*) = optional
	 */
	fun getLodestoneLoc(items: Items) = block(items, "GetLodestoneLoc")


	/**
	 */
	fun shiftDirection(items: Items) = block(items, "ShiftDirection")


	/**
	 */
	fun getContainerName(items: Items) = block(items, "GetContainerName")


	/**
	 * *Gets a particle effect's horizontal*
	 * *or vertical spread.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * *Effect to get*
	 * *spread of*
	 *
	 * (*) = optional
	 */
	fun getParticleSprd(items: Items) = block(items, "GetParticleSprd")


	/**
	 * *Reflects a vector off a*
	 * *surface defined by another*
	 * *vector.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * (*) *Vector to reflect*
	 *
	 * [VecItem]
	 *
	 * *Surface vector*
	 *
	 * (*) = optional
	 */
	fun reflectVector(items: Items) = block(items, "ReflectVector")


	/**
	 * *Gets a player head's owner*
	 * *name or UUID.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Head to get owner of*
	 *
	 * (*) = optional
	 */
	fun getHeadOwner(items: Items) = block(items, "GetHeadOwner")


	/**
	 */
	fun getItemEnchants(items: Items) = block(items, "GetItemEnchants")


	/**
	 * *Adds all entries from one*
	 * *dictionary into the other.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Dictionary to*
	 * *add to*
	 *
	 * [VarItem]
	 *
	 * *Dictionary*
	 * *to append*
	 *
	 * (*) = optional
	 */
	fun appendDict(items: Items) = block(items, "AppendDict")


	/**
	 */
	fun getMaxItemAmount(items: Items) = block(items, "GetMaxItemAmount")


	/**
	 * *Gets a color's RGB/HSB/HSL*
	 * *number values as a list.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * *Color hexadecimal*
	 *
	 * (*) = optional
	 */
	fun getColorChannels(items: Items) = block(items, "GetColorChannels")


	/**
	 * *Sets a location's rotation*
	 * *(pitch and yaw) to a direction.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to change*
	 *
	 * [VecItem]
	 *
	 * *Direction*
	 *
	 * (*) = optional
	 */
	fun setDirection(items: Items) = block(items, " SetDirection ")


	/**
	 * *Sets a list variable's value at*
	 * *an index.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *List to change*
	 *
	 * [NumItem]
	 *
	 * *Index*
	 *
	 * [Item]
	 *
	 * *Value to set*
	 *
	 * (*) = optional
	 */
	fun setListValue(items: Items) = block(items, "SetListValue")


	/**
	 * *Sets a book's text.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Book*
	 *
	 * [TextItem]
	 *
	 * *Pages*
	 *
	 * [TextItem]
	 *
	 * *Page text*
	 *
	 * [NumItem]
	 *
	 * *Page number*
	 *
	 * (*) = optional
	 */
	fun setBookText(items: Items) = block(items, "SetBookText")


	/**
	 * *Sets a variable to a random*
	 * *value from a set.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [Item]
	 *
	 * *Value set*
	 * *to choose from*
	 *
	 * (*) = optional
	 */
	fun randomValue(items: Items) = block(items, "RandomValue")


	/**
	 * *Sets which components of an item*
	 * *are visible, similar to /hideflags.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item*
	 *
	 * (*) = optional
	 */
	fun setItemFlags(items: Items) = block(items, " SetItemFlags ")


	/**
	 * *Sets an item's material.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [StringItem]
	 *
	 * *Material*
	 *
	 * (*) = optional
	 */
	fun setItemType(items: Items) = block(items, "SetItemType")


	/**
	 * *Gets the given sound's type.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [SoundItem]
	 *
	 * *Sound to get type of*
	 *
	 * (*) = optional
	 */
	fun getSoundType(items: Items) = block(items, "GetSoundType")


	/**
	 * *Gets a list variable's value at*
	 * *an index.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * *List to get value of*
	 *
	 * [NumItem]
	 *
	 * *Index*
	 *
	 * (*) = optional
	 */
	fun getListValue(items: Items) = block(items, "GetListValue")


	/**
	 * *Checks if a number is inside*
	 * *the bounds and if not, bounces*
	 * *it towards the other bound.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * (*) *Number to bounce*
	 *
	 * [NumItem]
	 *
	 * *Lower bound (inclusive)*
	 *
	 * [NumItem]
	 *
	 * *Upper bound (exclusive)*
	 *
	 * (*) = optional
	 */
	fun bounceNum(items: Items) = block(items, "BounceNum")


	/**
	 * *Sets a variable to the trigonometric*
	 * *tangent function of a number.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Number input*
	 *
	 * (*) = optional
	 */
	fun tangent(items: Items) = block(items, "Tangent")


	/**
	 * *Gets a Voronoi noise value: A cellular*
	 * *noise in which the value of an entire*
	 * *cell is calculated.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Noise location*
	 *
	 * [NumItem]
	 *
	 * (*) *Cell frequency*
	 *
	 * [NumItem]
	 *
	 * (*) *Cell scatter*
	 *
	 * [NumItem]
	 *
	 * (*) *Generation seed*
	 *
	 * (*) = optional
	 */
	fun voronoiNoise(items: Items) = block(items, "VoronoiNoise")


	/**
	 * *Creates a color based on hue,*
	 * *saturation, and brightness.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Hue (Color circle, 0-360)*
	 *
	 * [NumItem]
	 *
	 * (*) *Saturation (0-100)*
	 *
	 * [NumItem]
	 *
	 * (*) *Brightness (0-100)*
	 *
	 * [VarItem]
	 *
	 * *H, S, B values*
	 *
	 * (*) = optional
	 */
	fun hSBColor(items: Items) = block(items, "HSBColor")


	/**
	 * *Increments a number variable*
	 * *by 1 or more other numbers.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable*
	 * *to increment*
	 *
	 * [NumItem]
	 *
	 * (*) *Number(s) to*
	 * (*) *increment by*
	 *
	 * (*) = optional
	 */
	fun increment(items: Items) = block(items, "+=")


	/**
	 * *Gets the variant of a sound.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [SoundItem]
	 *
	 * *Sound to get variant of*
	 *
	 * (*) = optional
	 */
	fun getSoundVariant(items: Items) = block(items, "GetSoundVariant")


	/**
	 * *Gets a colorable item's color.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable*
	 * *to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item to get color of*
	 *
	 * (*) = optional
	 */
	fun getItemColor(items: Items) = block(items, "GetItemColor")


	/**
	 * *Clears all formatting from the*
	 * *given styled text.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [TextItem]
	 *
	 * (*) *Text to change*
	 *
	 * (*) = optional
	 */
	fun clearFormatting(items: Items) = block(items, "ClearFormatting")


	/**
	 * *Inserts a value into a list*
	 * *variable at an index, shifting*
	 * *all values at and after it to*
	 * *the right.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *List to change*
	 *
	 * [NumItem]
	 *
	 * *Index*
	 *
	 * [Item]
	 *
	 * *Value to insert*
	 *
	 * (*) = optional
	 */
	fun insertListValue(items: Items) = block(items, "InsertListValue")


	/**
	 * *Sets a sound's volume.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [SoundItem]
	 *
	 * (*) *Sound to change*
	 *
	 * [NumItem]
	 *
	 * *Volume*
	 *
	 * (*) = optional
	 */
	fun setSoundVolume(items: Items) = block(items, "SetSoundVolume")


	/**
	 * *Sets a location's X, Y, Z, pitch,*
	 * *or yaw coordinate.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to change*
	 *
	 * [NumItem]
	 *
	 * *Coordinate*
	 *
	 * (*) = optional
	 */
	fun setCoord(items: Items) = block(items, "SetCoord")


	/**
	 * *Sets a variable to the sum*
	 * *of the given vectors.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * *Vectors to add*
	 *
	 * (*) = optional
	 */
	fun addVectors(items: Items) = block(items, "AddVectors")


	/**
	 */
	fun setPitch(items: Items) = block(items, "SetPitch")


	/**
	 * *Gets a particle effect's particle*
	 * *fade color.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * *Effect to get*
	 * *fade color of*
	 *
	 * (*) = optional
	 */
	fun getParticleFade(items: Items) = block(items, "GetParticleFade")


	/**
	 */
	fun raycastBlock(items: Items) = block(items, "RaycastBlock")


	/**
	 * *Adds tool properties to an item.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [NumItem]
	 *
	 * (*) *Default mining speed*
	 *
	 * [NumItem]
	 *
	 * (*) *Damage per block*
	 *
	 * (*) = optional
	 */
	fun setItemTool(items: Items) = block(items, "SetItemTool")


	/**
	 * *Sets a player head's texture*
	 * *using an owning player*
	 * *or custom texture.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Player head*
	 *
	 * [StringItem]
	 *
	 * *Owner name, UUID or*
	 * *texture value*
	 *
	 * (*) = optional
	 */
	fun setHeadTexture(items: Items) = block(items, "SetHeadTexture")


	/**
	 * *Gets a Perlin noise value: A type*
	 * *of fractal gradient noise.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Noise location*
	 *
	 * [NumItem]
	 *
	 * (*) *Frequency (Scale)*
	 *
	 * [NumItem]
	 *
	 * (*) *Octaves (Perlin layers)*
	 *
	 * [NumItem]
	 *
	 * (*) *Octave frequency gain*
	 *
	 * [NumItem]
	 *
	 * (*) *Octave amplitude gain*
	 *
	 * [NumItem]
	 *
	 * (*) *Generation seed*
	 *
	 * (*) = optional
	 */
	fun perlinNoise(items: Items) = block(items, "PerlinNoise")


	/**
	 * *Gets a Worley noise value: A cellular*
	 * *noise in which the distance between*
	 * *two cells' nuclei is calculated.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Noise location*
	 *
	 * [NumItem]
	 *
	 * (*) *Cell frequency*
	 *
	 * [NumItem]
	 *
	 * (*) *Cell scatter*
	 *
	 * [NumItem]
	 *
	 * (*) *Generation seed*
	 *
	 * (*) = optional
	 */
	fun worleyNoise(items: Items) = block(items, "WorleyNoise")


	/**
	 * *Sets a colorable item's color.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [StringItem]
	 *
	 * *Color hexadecimal*
	 *
	 * (*) = optional
	 */
	fun setItemColor(items: Items) = block(items, "SetItemColor")


	/**
	 * *Gets a particle effect's particle*
	 * *color.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * *Effect to get*
	 * *color of*
	 *
	 * (*) = optional
	 */
	fun getParticleColor(items: Items) = block(items, "GetParticleColor")


	/**
	 * *Sets a sound's pitch or note*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [SoundItem]
	 *
	 * (*) *Sound to change*
	 *
	 * [NumItem]
	 *
	 * *Pitch*
	 *
	 * [StringItem]
	 *
	 * *Note*
	 *
	 * (*) = optional
	 */
	fun setSoundPitch(items: Items) = block(items, "SetSoundPitch")


	/**
	 * *Gets which blocks an item*
	 * *can be placed on in Adventure Mode.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item*
	 *
	 * (*) = optional
	 */
	fun getCanPlaceOn(items: Items) = block(items, "GetCanPlaceOn")


	/**
	 * *Sorts a list variable's values.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * (*) *List to sort*
	 *
	 * (*) = optional
	 */
	fun sortList(items: Items) = block(items, "SortList")


	/**
	 * *Sets the key of a custom sound.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [SoundItem]
	 *
	 * (*) *Sound to change*
	 *
	 * [StringItem]
	 *
	 * (*) *Sound key*
	 *
	 * (*) = optional
	 */
	fun setCustomSound(items: Items) = block(items, "SetCustomSound")


	/**
	 * *Removes the dictionary entry*
	 * *with the given key.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Dictionary to change*
	 *
	 * [StringItem]
	 *
	 * *Key to remove*
	 *
	 * [Item]
	 *
	 * (*) *Expected value(s)*
	 *
	 * (*) = optional
	 */
	fun removeDictEntry(items: Items) = block(items, "RemoveDictEntry")


	/**
	 * *Converts a numerical timestamp to*
	 * *a human-readable time/date text*
	 * *using a date format.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Time to format*
	 *
	 * [StringItem]
	 *
	 * (*) *Custom Format*
	 *
	 * (*) = optional
	 */
	fun formatTime(items: Items) = block(items, "FormatTime")


	/**
	 * *Gets the number of characters*
	 * *a string has.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * *String to measure*
	 *
	 * (*) = optional
	 */
	fun stringLength(items: Items) = block(items, "StringLength")


	/**
	 * *Gets the potion effects applied by*
	 * *an item.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item to get effects from*
	 *
	 * (*) = optional
	 */
	fun getItemEffects(items: Items) = block(items, "GetItemEffects")


	/**
	 * *Sets a variable to a styled text, or combines*
	 * *multiple values into one styled text.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [Item]
	 *
	 * (*) *Text to set to*
	 *
	 * (*) = optional
	 */
	fun styledText(items: Items) = block(items, "StyledText")


	/**
	 * *Gets the MiniMessage expression for*
	 * *a styled text value.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [TextItem]
	 *
	 * *Text to read*
	 *
	 * (*) = optional
	 */
	fun getMiniMessageExpr(items: Items) = block(items, "GetMiniMessageExpr")


	/**
	 */
	fun setYaw(items: Items) = block(items, "SetYaw")


	/**
	 * *Sets the potion effects applied by*
	 * *an item.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [PotionItem]
	 *
	 * *Item effects*
	 *
	 * (*) = optional
	 */
	fun setItemEffects(items: Items) = block(items, "SetItemEffects")


	/**
	 * *Decrements a number variable*
	 * *by 1 or more other numbers.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable*
	 * *to decrement*
	 *
	 * [NumItem]
	 *
	 * (*) *Number(s) to*
	 * (*) *decrement by*
	 *
	 * (*) = optional
	 */
	fun decrement(items: Items) = block(items, "-=")


	/**
	 * *Gets the value of a custom*
	 * *item tag.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item to get tag of*
	 *
	 * [StringItem]
	 *
	 * *Tag name*
	 *
	 * (*) = optional
	 */
	fun getItemTag(items: Items) = block(items, "GetItemTag")


	/**
	 * *Creates a list from the given*
	 * *values.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [Item]
	 *
	 * (*) *Value list*
	 *
	 * (*) = optional
	 */
	fun createList(items: Items) = block(items, "CreateList")


	/**
	 * *Adds a list to the end of*
	 * *another list variable.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *List to append to*
	 *
	 * [VarItem]
	 *
	 * *List(s) to append*
	 *
	 * (*) = optional
	 */
	fun appendList(items: Items) = block(items, "AppendList")


	/**
	 * *Gets a container's contents*
	 * *at a location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Container location*
	 *
	 * (*) = optional
	 */
	fun getContainerItems(items: Items) = block(items, "GetContainerItems")


	/**
	 * *Shifts a location toward another*
	 * *location by the given distance.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to shift*
	 *
	 * [LocItem]
	 *
	 * *Target location*
	 *
	 * [NumItem]
	 *
	 * (*) *Shift distance*
	 *
	 * (*) = optional
	 */
	fun shiftToward(items: Items) = block(items, "ShiftToward")


	/**
	 * *Trims a list, starting and ending*
	 * *at the given indices.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * (*) *List to trim*
	 *
	 * [NumItem]
	 *
	 * *Start index*
	 *
	 * [NumItem]
	 *
	 * (*) *End index*
	 *
	 * (*) = optional
	 */
	fun trimList(items: Items) = block(items, "TrimList")


	/**
	 * *Gets gradient noise: A type of noise*
	 * *based on a lattice of random gradients.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Noise location*
	 *
	 * [NumItem]
	 *
	 * (*) *Frequency*
	 *
	 * [NumItem]
	 *
	 * (*) *Marbling*
	 *
	 * [NumItem]
	 *
	 * (*) *Octaves*
	 *
	 * [NumItem]
	 *
	 * (*) *Lacunarity*
	 *
	 * [NumItem]
	 *
	 * (*) *Gain*
	 *
	 * [NumItem]
	 *
	 * (*) *Warping*
	 *
	 * [NumItem]
	 *
	 * (*) *Resonance*
	 *
	 * [NumItem]
	 *
	 * (*) *Domains*
	 *
	 * [NumItem]
	 *
	 * (*) *Domain lacunarity*
	 *
	 * [NumItem]
	 *
	 * (*) *Domain gain*
	 *
	 * [NumItem]
	 *
	 * (*) *Generation seed*
	 *
	 * (*) = optional
	 */
	fun gradientNoise(items: Items) = block(items, "GradientNoise")


	/**
	 * *Sets whether an item's tooltip*
	 * *is visible or not.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * (*) = optional
	 */
	fun setItemHideTooltip(items: Items) = block(items, "SetItemHideTooltip")


	/**
	 * *Gets the items dropped by a*
	 * *block if mined by a given tool.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Location to check*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Tool to use*
	 *
	 * (*) = optional
	 */
	fun getBlockDrops(items: Items) = block(items, "GetBlockDrops")


	/**
	 * *Removes enchantments from an item.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * (*) = optional
	 */
	fun clearEnchants(items: Items) = block(items, "ClearEnchants")


	/**
	 * *Sets a variable to the trigonometric*
	 * *cosine function of a number.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * *Number input*
	 *
	 * (*) = optional
	 */
	fun cosine(items: Items) = block(items, "Cosine")


	/**
	 * *Gets a particle effect's opacity.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to get*
	 * (*) *opacity of*
	 *
	 * (*) = optional
	 */
	fun getParticleOpac(items: Items) = block(items, "GetParticleOpac")


	/**
	 * *Gets a list of items that*
	 * *belongs to the specified*
	 * *item tag.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * *Item tag ID*
	 *
	 * (*) = optional
	 */
	fun getItemByMCTag(items: Items) = block(items, "GetItemByMCTag")


	/**
	 * *Sets a particle effect's particle*
	 * *fade color.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to*
	 * (*) *change*
	 *
	 * [StringItem]
	 *
	 * *Color hexadecimal*
	 *
	 * (*) = optional
	 */
	fun setParticleFade(items: Items) = block(items, "SetParticleFade")


	/**
	 * *Sets a vector's X, Y, or Z*
	 * *component.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * (*) *Vector to change*
	 *
	 * [NumItem]
	 *
	 * *Component*
	 *
	 * (*) = optional
	 */
	fun setVectorComp(items: Items) = block(items, "SetVectorComp")


	/**
	 * *Converts a string to a number.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * (*) *String to convert*
	 *
	 * (*) = optional
	 */
	fun parseNumber(items: Items) = block(items, "ParseNumber")


	/**
	 * *Raises a number to the power*
	 * *of an exponent.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * (*) *Number input*
	 *
	 * [NumItem]
	 *
	 * (*) *Exponent*
	 *
	 * (*) = optional
	 */
	fun exponent(items: Items) = block(items, "Exponent")


	/**
	 */
	fun shiftAllDirs(items: Items) = block(items, "ShiftAllDirs")


	/**
	 * *Searches for a value in a list*
	 * *variable and gets the index if*
	 * *found.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * *List to search in*
	 *
	 * [Item]
	 *
	 * *Value to search*
	 *
	 * (*) = optional
	 */
	fun getValueIndex(items: Items) = block(items, "GetValueIndex")


	/**
	 * *Removes an enchantment from an item.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [StringItem]
	 *
	 * *Enchantment name*
	 *
	 * (*) = optional
	 */
	fun remItemEnchant(items: Items) = block(items, "RemItemEnchant")


	/**
	 * *Adds lines to an item's lore.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [TextItem]
	 *
	 * *Lore to add*
	 *
	 * (*) = optional
	 */
	fun addItemLore(items: Items) = block(items, "AddItemLore")


	/**
	 * *Sets a particle effect's roll.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to*
	 * (*) *change*
	 *
	 * [NumItem]
	 *
	 * *Particle roll*
	 *
	 * (*) = optional
	 */
	fun setParticleRoll(items: Items) = block(items, "SetParticleRoll")


	/**
	 * *Sets the variant of a sound.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [SoundItem]
	 *
	 * (*) *Sound to change*
	 *
	 * [StringItem]
	 *
	 * (*) *Variant ID (e.g. "break1")*
	 *
	 * (*) = optional
	 */
	fun setSoundVariant(items: Items) = block(items, "SetSoundVariant")


	/**
	 */
	fun shiftLocation(items: Items) = block(items, "ShiftLocation")


	/**
	 * *Randomizes the order of a*
	 * *list variable's values.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * (*) *List to randomize*
	 *
	 * (*) = optional
	 */
	fun randomizeList(items: Items) = block(items, "RandomizeList")


	/**
	 * *Checks if a number is between*
	 * *a minimum and maximum value, and*
	 * *if not, sets it to the nearest.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [NumItem]
	 *
	 * (*) *Number to clamp*
	 *
	 * [NumItem]
	 *
	 * *Minimum*
	 *
	 * [NumItem]
	 *
	 * *Maximum*
	 *
	 * (*) = optional
	 */
	fun clampNumber(items: Items) = block(items, "ClampNumber")


	/**
	 */
	fun round(items: Items) = block(items, "Round")


	/**
	 * *Gets a sound's pitch or*
	 * *note.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [SoundItem]
	 *
	 * *Sound to get pitch or*
	 * *note of*
	 *
	 * (*) = optional
	 */
	fun getSoundPitch(items: Items) = block(items, "GetSoundPitch")


	/**
	 * *Converts legacy color codes written in*
	 * *"&" or hex format to*
	 * *functional color codes, or vice versa.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [StringItem]
	 *
	 * (*) *String to translate*
	 *
	 * (*) = optional
	 */
	fun translateColors(items: Items) = block(items, "TranslateColors")


	/**
	 * *Gets a block's current*
	 * *growth at a location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Block location*
	 *
	 * (*) = optional
	 */
	fun getBlockGrowth(items: Items) = block(items, "GetBlockGrowth")


	/**
	 * *Gets all tags registered*
	 * *on an item.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item to get tags from*
	 *
	 * (*) = optional
	 */
	fun getAllItemTags(items: Items) = block(items, "GetAllItemTags")


	/**
	 * *Removes all matching values*
	 * *from a list variable.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *List to change*
	 *
	 * [Item]
	 *
	 * *Value(s) to*
	 * *remove*
	 *
	 * (*) = optional
	 */
	fun removeListValue(items: Items) = block(items, "RemoveListValue")


	/**
	 * *Shifts a location in multiple directions*
	 * *based on its rotation.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * (*) *Location to shift*
	 *
	 * [NumItem]
	 *
	 * (*) *Forwards change*
	 *
	 * [NumItem]
	 *
	 * (*) *Upwards change*
	 *
	 * [NumItem]
	 *
	 * (*) *Sideways change (-L / +R)*
	 *
	 * (*) = optional
	 */
	fun shiftAllDirections(items: Items) = block(items, "ShiftAllDirections")


	/**
	 * *Gets value noise: A type of noise*
	 * *based on a lattice of random values.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Noise location*
	 *
	 * [NumItem]
	 *
	 * (*) *Frequency*
	 *
	 * [NumItem]
	 *
	 * (*) *Marbling*
	 *
	 * [NumItem]
	 *
	 * (*) *Octaves*
	 *
	 * [NumItem]
	 *
	 * (*) *Lacunarity*
	 *
	 * [NumItem]
	 *
	 * (*) *Gain*
	 *
	 * [NumItem]
	 *
	 * (*) *Warping*
	 *
	 * [NumItem]
	 *
	 * (*) *Resonance*
	 *
	 * [NumItem]
	 *
	 * (*) *Domains*
	 *
	 * [NumItem]
	 *
	 * (*) *Domain lacunarity*
	 *
	 * [NumItem]
	 *
	 * (*) *Domain gain*
	 *
	 * [NumItem]
	 *
	 * (*) *Generation seed*
	 *
	 * (*) = optional
	 */
	fun valueNoise(items: Items) = block(items, "ValueNoise")


	/**
	 * *Sets which blocks an item*
	 * *can be placed on in Adventure Mode.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [MinecraftItem]
	 *
	 * *Placeable blocks*
	 *
	 * (*) = optional
	 */
	fun setCanPlaceOn(items: Items) = block(items, "SetCanPlaceOn")


	/**
	 * *Gets a block's material*
	 * *at a location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Block location*
	 *
	 * (*) = optional
	 */
	fun getBlockType(items: Items) = block(items, "GetBlockType")


	/**
	 */
	fun parsePitch(items: Items) = block(items, "ParsePitch")


	/**
	 * *Get a dictionary variable's*
	 * *value for a key.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VarItem]
	 *
	 * *Dictionary to*
	 * *pull from*
	 *
	 * [StringItem]
	 *
	 * *Key*
	 *
	 * (*) = optional
	 */
	fun getDictValue(items: Items) = block(items, "GetDictValue")


	/**
	 * *Gets a container's lock key at a*
	 * *location.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Container location*
	 *
	 * (*) = optional
	 */
	fun containerLock(items: Items) = block(items, "ContainerLock")


	/**
	 * *Gets a block's redstone*
	 * *power level.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [LocItem]
	 *
	 * *Block location*
	 *
	 * (*) = optional
	 */
	fun getBlockPower(items: Items) = block(items, "GetBlockPower")


	/**
	 * *Gets a vector's length.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [VecItem]
	 *
	 * *Vector to get*
	 * *length of*
	 *
	 * (*) = optional
	 */
	fun getVectorLength(items: Items) = block(items, "GetVectorLength")


	/**
	 * *Gets the number of characters*
	 * *a styled text has, ignoring all*
	 * *formatting tags.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [TextItem]
	 *
	 * *Text to measure*
	 *
	 * (*) = optional
	 */
	fun contentLength(items: Items) = block(items, "ContentLength")


	/**
	 * *Sets the model value*
	 * *used in resource packs.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Item to change*
	 *
	 * [NumItem]
	 *
	 * *Model value*
	 *
	 * (*) = optional
	 */
	fun setModelData(items: Items) = block(items, "SetModelData")


	/**
	 */
	fun setCoords(items: Items) = block(items, "SetCoords")


	/**
	 * *Gets an item's maximum stack size.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [MinecraftItem]
	 *
	 * *Item to get maximum stack*
	 * *size of*
	 *
	 * (*) = optional
	 */
	fun getMaxAmount(items: Items) = block(items, "GetMaxAmount")


	/**
	 * *Gets a particle effect's particle*
	 * *size.*
	 *
	 * #### Args:
	 *
	 * [VarItem]
	 *
	 * *Variable to set*
	 *
	 * [GenericItem] (Particle)
	 *
	 * (*) *Effect to get*
	 * (*) *size of*
	 *
	 * (*) = optional
	 */
	fun getParticleSize(items: Items) = block(items, "GetParticleSize")

}