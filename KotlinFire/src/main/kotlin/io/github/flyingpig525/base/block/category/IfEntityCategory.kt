package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.*
import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.block.*
import io.github.flyingpig525.base.block.subaction.*
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put

class IfEntityCategory<T : Item> internal constructor(private val template: Template<T>) {
    private val blocks = template.blocks

    private fun block(
        items: Items<T>,
        action: String,
        wrappedCode: Template<T>.() -> Unit,
        not: Boolean = false,
        extra: JsonObjectBuilder.() -> Unit = {}
    ) {
        blocks += Block("if_entity", ItemCollection(items).items, action) {
            if (not) put("attribute", "NOT")
            extra()
        }
        blocks += BracketBlock(type = "norm")
        blocks += io.github.flyingpig525.base.Template(
            io.github.flyingpig525.base.Template.Type.NONE,
            a = wrappedCode
        ).blocks
        blocks += BracketBlock(false, "norm")
    }
	/**
	 * *Checks if an entity*
	 * *is a boat or minecart.*
	 */
	fun isVehicle(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "IsVehicle", wrappedCode, not)


	/**
	 * *Checks if an entity is*
	 * *supported by a block.*
	 */
	fun isGrounded(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "IsGrounded", wrappedCode, not)


	/**
	 * *Checks if an entity is the*
	 * *given type.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * *Spawn egg,*
	 * *projectile, or vehicle*
	 *
	 * (*) = optional
	 */
	fun isType(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "IsType", wrappedCode, not)


	/**
	 * *Checks if an entity*
	 * *is a projectile.*
	 */
	fun isProj(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "IsProj", wrappedCode, not)


	/**
	 * *Checks if an entity*
	 * *is a mob.*
	 */
	fun isMob(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "IsMob", wrappedCode, not)


	/**
	 * *Checks if an entity has a*
	 * *given custom tag, and (if*
	 * *provided) whether the tag*
	 * *matches the given value.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *Tag name*
	 *
	 * [NumItem]
	 *
	 * (*) *Tag value*
	 *
	 * [StringItem]
	 *
	 * (*) *Tag value*
	 *
	 * (*) = optional
	 */
	fun hasCustomTag(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "HasCustomTag", wrappedCode, not)


	/**
	 * *Checks if a sheep is*
	 * *sheared.*
	 */
	fun isSheared(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "IsSheared", wrappedCode, not)


	/**
	 * *Checks if an entity*
	 * *is an item.*
	 */
	fun isItem(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "IsItem", wrappedCode, not)


	/**
	 * *Checks if an entity is riding*
	 * *another entity.*
	 *
	 * #### Args:
	 *
	 * [MinecraftItem]
	 *
	 * (*) *Spawn egg,*
	 * (*) *projectile, or vehicle*
	 *
	 * [StringItem]
	 *
	 * (*) *Entity UUID*
	 *
	 * [TextItem]
	 *
	 * (*) *Entity name*
	 *
	 * (*) = optional
	 */
	fun isRiding(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, " IsRiding ", wrappedCode, not)


	/**
	 * *Checks if an entity still*
	 * *exists in the world.*
	 */
	fun exists(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "Exists", wrappedCode, not)


	/**
	 * *Checks if an entity is within a*
	 * *range of a location.*
	 *
	 * #### Args:
	 *
	 * [LocItem]
	 *
	 * *Center location*
	 *
	 * [NumItem]
	 *
	 * (*) *Range*
	 *
	 * (*) = optional
	 */
	fun isNear(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "IsNear", wrappedCode, not)


	/**
	 * *Checks if an entity has a*
	 * *potion effect of a certain*
	 * *type active.*
	 *
	 * #### Args:
	 *
	 * [PotionItem]
	 *
	 * *Effect(s)*
	 * *to check for*
	 *
	 * (*) = optional
	 */
	fun hasPotion(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "HasPotion", wrappedCode, not)


	/**
	 */
	fun standingOn(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "StandingOn", wrappedCode, not)


	/**
	 * *Checks if an entity's name or*
	 * *custom name is equal to the*
	 * *given text.*
	 *
	 * #### Args:
	 *
	 * [StringItem]
	 *
	 * *UUID to check for*
	 *
	 * [TextItem]
	 *
	 * *Name to check for*
	 *
	 * (*) = optional
	 */
	fun nameEquals(items: Items<T>, not: Boolean = false, wrappedCode: Template<T>.() -> Unit) = block(items, "NameEquals", wrappedCode, not)

}