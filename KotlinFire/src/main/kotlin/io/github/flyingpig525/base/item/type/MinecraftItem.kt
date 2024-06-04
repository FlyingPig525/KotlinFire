package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item

/**
 * @param [nbt] NEVER making an item creator thing, so you have to get the nbt data yourself
 */
class MinecraftItem(val nbt: String) : Item(ID.ITEM), JsonData {
	override fun getJsonData(): String {
		return """
			{
				"item": "$nbt"
			}
		""".trimIndent()
	}

	companion object {
		fun String.toMinecraftItem() = MinecraftItem(this.replace("\"", "\\\""))
		fun mcItemOf(type: String, count: Short) = """{Count:${count}b,id:"$type"}""".toMinecraftItem()
	}
}