package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.BracketBlock
import io.github.flyingpig525.base.block.ElseOperation
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put

class IfEntityCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(
        items: Items,
        action: String,
        wrappedCode: Template.() -> Unit,
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
	fun isVehicle(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsVehicle", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity is*
	 * *supported by a block.*
	 */
	fun isGrounded(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsGrounded", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity is the*
	 * *given type.*
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * *Spawn egg,*
	 * *projectile, or vehicle*
	 *
	 * (*) = optional
	 */
	fun isType(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsType", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity*
	 * *is a projectile.*
	 */
	fun isProj(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsProj", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity*
	 * *is a mob.*
	 */
	fun isMob(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsMob", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity has a*
	 * *given custom tag, and (if*
	 * *provided) whether the tag*
	 * *matches the given value.*
	 *
	 * **Args:**
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
	fun hasCustomTag(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "HasCustomTag", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if a sheep is*
	 * *sheared.*
	 */
	fun isSheared(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsSheared", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity*
	 * *is an item.*
	 */
	fun isItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsItem", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity is riding*
	 * *another entity.*
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * *Spawn egg,*
	 * *projectile, or vehicle*
	 *
	 * [StringItem]
	 *
	 * *Entity UUID*
	 *
	 * [TextItem]
	 *
	 * *Entity name*
	 *
	 * (*) = optional
	 */
	fun isRiding(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, " IsRiding ", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity still*
	 * *exists in the world.*
	 */
	fun exists(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "Exists", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity's hitbox is*
	 * *within a range of a location.*
	 *
	 * **Args:**
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
	fun isHitboxNear(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsHitboxNear", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity is within a*
	 * *range of a location.*
	 *
	 * **Args:**
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
	fun isNear(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsNear", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity has a*
	 * *potion effect of a certain*
	 * *type active.*
	 *
	 * **Args:**
	 *
	 * [PotionItem]
	 *
	 * *Effect(s)*
	 * *to check for*
	 *
	 * (*) = optional
	 */
	fun hasPotion(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "HasPotion", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 */
	fun standingOn(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "StandingOn", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * *Checks if an entity's name or*
	 * *custom name is equal to the*
	 * *given text.*
	 *
	 * **Args:**
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
	fun nameEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "NameEquals", wrappedCode, not)
		return ElseOperation()
	}

}