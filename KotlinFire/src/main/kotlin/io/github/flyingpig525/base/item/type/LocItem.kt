package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemComparison
import io.github.flyingpig525.base.item.type.VarClass.Companion.assertInsertable
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonObject

/**
 * A DiamondFire location.
 *
 * Can be constructed through the class constructor, extension functions for lists, or the [locOf] function.
 *
 * For a DF variable containing this type, use [LocVariable].
 *
 * @see toLocItem
 * @see locOf
 * @see LocVariable
 */
class LocItem(val x: Float, val y: Float, val z: Float, val pitch: Float = 0f, val yaw: Float = 0f) : Item(ID.LOCATION),
    JsonData {

    constructor(x: Int, y: Int, z: Int, pitch: Int = 0, yaw: Int = 0) : this(
        x.toFloat(),
        y.toFloat(),
        z.toFloat(),
        pitch.toFloat(),
        yaw.toFloat()
    )

    override fun getJsonData(): JsonObject =  buildJsonObject {
        put("isBlock", false)
        putJsonObject("loc") {
            put("x", x)
            put("y", y)
            put("z", z)
            put("pitch", pitch)
            put("yaw", yaw)
        }
    }

    companion object {
        fun List<Number>.toLocItem(): LocItem {
            if (this.size == 3) {
                return LocItem(this[0].toFloat(), this[1].toFloat(), this[2].toFloat())
            } else if (this.size == 5) {
                return LocItem(
                    this[0].toFloat(),
                    this[1].toFloat(),
                    this[2].toFloat(),
                    this[3].toFloat(),
                    this[4].toFloat()
                )
            }
            throw IncompatibleListSizeException()
        }
        val List<Number>.locItem: LocItem
            get() = this.toLocItem()
    }
}

class IncompatibleListSizeException() : Exception("List does not conform to an expected size.")

fun locOf(
    x: Number,
    y: Number,
    z: Number,
    pitch: Number = 0f,
    yaw: Number = 0f
): LocItem = LocItem(
    x.toFloat(),
    y.toFloat(),
    z.toFloat(),
    pitch.toFloat(),
    yaw.toFloat()
)

class LocVariable(name: String, scope: VarItem.Scope) : VarClass<LocItem>(name, scope, LocItem::class) {
    private fun isNear(other: Insertable): ItemComparison {
        assertInsertable(other)
        return ItemComparison { not, nested ->
            IfVar.isNear({
                +item
                +other
            }, not, nested)
        }
    }
    infix fun isNear(other: LocVariable) = isNear(other as Insertable)
    infix fun isNear(other: LocItem) = isNear(other as Insertable)
    infix fun isNear(other: GameValue<LocItem>) = isNear(other as Insertable)
}