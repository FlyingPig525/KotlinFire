package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.BracketBlock
import io.github.flyingpig525.base.block.ElseOperation
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.item.type.tag.IfGameTags
import io.github.flyingpig525.base.item.type.tag.TagItem
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.put
import kotlin.reflect.KClass
import kotlin.reflect.full.superclasses

@Suppress("unused")
class IfGameCategory internal constructor(private val template: Template) {
    private val blocks = template.blocks

    private fun block(
        items: Items,
        action: String,
        wrappedCode: Template.() -> Unit,
        not: Boolean = false,
        tagClass: KClass<*>? = null,
        extra: JsonObjectBuilder.() -> Unit = {}
    ) {
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
        blocks += Block("if_game", collection.items, action) {
            if (not) put("attribute", "NOT")
            extra()
        }
        blocks += BracketBlock(type = "norm")
        blocks += io.github.flyingpig525.base.Template(
            io.github.flyingpig525.base.Template.Type.NONE,
            code = wrappedCode
        ).blocks
        blocks += BracketBlock(false, "norm")
    }
	/**
	 */
	fun signHasTxt(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "SignHasTxt", wrappedCode, not, tagClass = IfGameTags.SignHasTxt::class)
		return ElseOperation()
	}


	/**
	 * Checks if the container at a
	 * location has room for one or
	 * more items to be given.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to check with
	 *
	 * (*) = optional

	 * @see [IfGameTags.HasRoomForItem]
	 */
	fun hasRoomForItem(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "HasRoomForItem", wrappedCode, not, tagClass = IfGameTags.HasRoomForItem::class)
		return ElseOperation()
	}


	/**
	 * Checks if the block in a block
	 * related event is the given block.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Block(s) to check for
	 *
	 * (*) = optional
	 */
	fun eventBlockEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "EventBlockEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if the command entered
	 * in the Command Event is equal
	 * to the given string.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * String(s) to check for
	 *
	 * (*) = optional

	 * @see [IfGameTags.CommandEquals]
	 */
	fun commandEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "CommandEquals", wrappedCode, not, tagClass = IfGameTags.CommandEquals::class)
		return ElseOperation()
	}


	/**
	 * Checks if the item in a item
	 * related event is the given item.
	 *
	 * **Args:**
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to check for
	 *
	 * (*) = optional

	 * @see [IfGameTags.EventItemEquals]
	 */
	fun eventItemEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "EventItemEquals", wrappedCode, not, tagClass = IfGameTags.EventItemEquals::class)
		return ElseOperation()
	}


	/**
	 * Checks if an event attack
	 * is critical.
	 */
	fun attackIsCrit(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "AttackIsCrit", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if the container at a
	 * location has the given item.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to check for
	 *
	 * (*) = optional
	 */
	fun containerHas(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ContainerHas", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if the block at a location
	 * is the given block.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Check location
	 *
	 * [MinecraftItem]
	 *
	 * (*) Block(s) to check for
	 *
	 * [TextItem]
	 *
	 * (*) Block data
	 *
	 * *Example: "facing=up"*
	 *
	 * (*) = optional
	 */
	fun blockEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "BlockEquals", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a location collides with
	 * the hitbox of the nearest block.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Check location
	 *
	 * (*) = optional
	 */
	fun inBlock(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "InBlock", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if specific movement keys
	 * changed state in the current event.
	 */
	fun movementKey(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "MovementKey", wrappedCode, not, tagClass = IfGameTags.MovementKey::class)
		return ElseOperation()
	}


	/**
	 * Checks if the block at a location
	 * is powered by redstone.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Check location(s)
	 *
	 * (*) = optional

	 * @see [IfGameTags.BlockPowered]
	 */
	fun blockPowered(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "BlockPowered", wrappedCode, not, tagClass = IfGameTags.BlockPowered::class)
		return ElseOperation()
	}


	/**
	 * Checks if there is currently
	 * a player in the game with the
	 * given name or UUID.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * Name or UUID
	 *
	 * (*) = optional
	 */
	fun hasPlayer(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "HasPlayer", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if the container at a
	 * location has all of the given
	 * items.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Container location
	 *
	 * [MinecraftItem]
	 *
	 * Item(s) to check for
	 *
	 * (*) = optional
	 */
	fun containerHasAll(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "ContainerHasAll", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if a part of the command
	 * entered in the Command Event
	 * is equal to the given string.
	 *
	 * **Args:**
	 *
	 * [StringItem]
	 *
	 * String(s) to check for
	 *
	 * [NumItem]
	 *
	 * Argument number
	 *
	 * (*) = optional

	 * @see [IfGameTags.CmdArgEquals]
	 */
	fun cmdArgEquals(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "CmdArgEquals", wrappedCode, not, tagClass = IfGameTags.CmdArgEquals::class)
		return ElseOperation()
	}


	/**
	 * Checks if the current
	 * event is cancelled.
	 */
	fun eventCancelled(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "EventCancelled", wrappedCode, not)
		return ElseOperation()
	}


	/**
	 * Checks if the chunk at a location
	 * is currently loaded.
	 *
	 * **Args:**
	 *
	 * [LocItem]
	 *
	 * Location in chunk
	 *
	 * (*) = optional
	 */
	fun isChunkLoaded(items: Items, not: Boolean = false, wrappedCode: Template.() -> Unit): ElseOperation {
		block(items, "IsChunkLoaded", wrappedCode, not)
		return ElseOperation()
	}

}