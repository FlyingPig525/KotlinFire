package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

class VecItem(x: Number, y: Number, z: Number) : Item(ID.VECTOR), JsonData {
    val x = x.toFloat()
    val y = y.toFloat()
    val z = z.toFloat()

    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("x", x)
            put("y", y)
            put("z", z)
        }
//        return """{
//            "x": $x,
//            "y": $y,
//            "z": $z
//        }""".trimIndent()
    }

    companion object {
        fun List<Number>.toVecItem(): VecItem? {
            if (this.size == 3) return VecItem(this[0].toFloat(), this[1].toFloat(), this[2].toFloat())
            return null
        }
    }

}