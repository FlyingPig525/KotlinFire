package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.JsonData

class LocItem(val x: Float, val y: Float, val z: Float, val pitch: Float = 0f, val yaw: Float = 0f) : Item(ID.LOCATION), JsonData {

	constructor(x: Int, y: Int, z: Int, pitch: Int = 0, yaw: Int = 0) : this(x.toFloat(), y.toFloat(), z.toFloat(), pitch.toFloat(), yaw.toFloat())

	override fun getJsonData(): String = """
		{
			"isBlock": false,
			"loc": {
				"x": $x,
				"y": $y,
				"z": $z,
				"pitch": $pitch,
				"yaw": $yaw
			}
		}
	""".trimIndent()

	companion object {
		val groundYLevel = 50
		fun List<Number>.toLocItem(): LocItem? {
			if (this.size == 3) {
				return LocItem(this[0].toFloat(), this[1].toFloat(), this[2].toFloat())
			} else if (this.size == 5) {
				return LocItem(this[0].toFloat(),
					this[1].toFloat(),
					this[2].toFloat(),
					this[3].toFloat(),
					this[4].toFloat()
				)
			}
			return null
		}
	}
}