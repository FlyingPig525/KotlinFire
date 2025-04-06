@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.annotation.*
import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.BracketBlock
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*
import kotlinx.serialization.json.put

class IfEntityCategory<T : Item> internal constructor(private val template: Template<T>) {
    private val blocks = template.blocks

    private fun block(
        items: Items<T>,
        action: String,
        wrappedCode: Template<T>.() -> Unit,
        not: Boolean = false
    ) {
        blocks += Block("if_game", ItemCollection(items).items, action) {
            if (not) put("attribute", "NOT")
//            if (not) "attribute: \"NOT\"" else ""
        }
        blocks += BracketBlock(type = "norm")
        blocks += io.github.flyingpig525.base.Template(
            io.github.flyingpig525.base.Template.Type.NONE,
            a = wrappedCode
        ).blocks
        blocks += BracketBlock(false, "norm")
    }

    fun chain(a: IfEntityCategory<T>.() -> Unit) {
        apply(a)
    }

    /**
     * Checks if an entity
     * is a boat or minecart.
     */
    fun isVehicle(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "IsVehicle", wrappedCode, not)

    /**
     * Checks if an entity is
     * supported by a block.
     */
    fun isGrounded(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "IsGrounded", wrappedCode, not)

    /**
     * Checks if an entity is the
     * given type.
     *
     * ARGUMENTS:
     *
     * [ENTITY_TYPE](s)
     *
     * Spawn egg,
     * projectile, or vehicle
     *
     * (*) = Optional
     */
    fun isType(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "IsType", wrappedCode, not)

    /**
     * Checks if an entity
     * is a projectile.
     */
    fun isProj(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "IsProj", wrappedCode, not)

    /**
     * Checks if an entity
     * is a mob.
     */
    fun isMob(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "IsMob", wrappedCode, not)

    /**
     * Checks if an entity has a
     * given custom tag, and (if
     * provided) whether the tag
     * matches the given value.
     *
     * ARGUMENTS:
     *
     * [TextItem]
     *
     * Tag name
     *
     * (*)[NumItem]
     *
     * Tag value
     *
     * (*)[TextItem]
     *
     * Tag value
     *
     * (*) = Optional
     */
    fun hasCustomTag(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "HasCustomTag", wrappedCode, not)

    /**
     * Checks if a sheep is
     * sheared.
     */
    fun isSheared(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "IsSheared", wrappedCode, not)

    /**
     * Checks if an entity
     * is an item.
     */
    fun isItem(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "IsItem", wrappedCode, not)

    /**
     * Checks if an entity still
     * exists in the world.
     */
    fun exists(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "Exists", wrappedCode, not)

    /**
     * Checks if an entity is within a
     * range of a location.
     *
     * ARGUMENTS:
     *
     * [LocItem](s)
     *
     * Center location
     *
     * (*)[NumItem]
     *
     * Range
     *
     * (*) = Optional
     */
    fun isNear(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "IsNear", wrappedCode, not)

    /**
     * Checks if an entity has a
     * potion effect of a certain
     * type active.
     *
     * ARGUMENTS:
     *
     * [POTION](s)
     *
     * Effect(s)
     * to check for
     *
     * (*) = Optional
     */
    fun hasPotion(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "HasPotion", wrappedCode, not)

    fun isRiding(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "IsRiding", wrappedCode, not)

    fun standingOn(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "StandingOn", wrappedCode, not)

    /**
     * Checks if an entity's name or
     * custom name is equal to the
     * given text.
     *
     * ARGUMENTS:
     *
     * [TextItem](s)
     *
     * UUID to check for
     *
     * [COMPONENT](s)
     *
     * Name to check for
     *
     * (*) = Optional
     */
    fun nameEquals(
        items: Items<T>,
        not: Boolean = false,
        wrappedCode: Template<T>.() -> Unit
    ) = block(items, "NameEquals", wrappedCode, not)

}