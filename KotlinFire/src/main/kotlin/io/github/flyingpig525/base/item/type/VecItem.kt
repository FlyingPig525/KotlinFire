package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.VecItem.Companion.toVecItem
import io.github.flyingpig525.base.item.type.VecItem.Companion.vecItem
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/**
 * A DiamondFire vector.
 *
 * Can be constructed through the class constructor, the list extensions, or the [vecOf] function.
 *
 * For a DF variable containing this type, use [VecVariable].
 *
 * @see toVecItem
 * @see vecItem
 * @see vecOf
 */
class VecItem(x: Number, y: Number, z: Number) : Item(ID.VECTOR) {
    val x = x.toFloat()
    val y = y.toFloat()
    val z = z.toFloat()

    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("x", x)
            put("y", y)
            put("z", z)
        }
    }

    companion object {
        fun List<Number>.toVecItem(): VecItem {
            if (this.size == 3) return VecItem(this[0].toFloat(), this[1].toFloat(), this[2].toFloat())
            throw IncompatibleListSizeException()
        }
        val List<Number>.vecItem get() = toVecItem()
    }
}

fun vecOf(x: Number, y: Number, z: Number) = VecItem(x, y, z)

@Suppress("NOTHING_TO_INLINE")
class VecVariable(name: String, scope: VarItem.Scope) : VarClass<VecItem>(name, scope, VecItem::class) {
    // Length
    context(_: Template)
    inline fun setLength(length: Number) = setLength(length.numItem)
    context(_: Template)
    inline fun setLength(length: NumVariable) = setLength(length.numItem)
    context(t: Template)
    inline fun setLength(length: NumItem) {
        t.SetVariable.setVectorLength {
            +item
            +length
        }
    }
}