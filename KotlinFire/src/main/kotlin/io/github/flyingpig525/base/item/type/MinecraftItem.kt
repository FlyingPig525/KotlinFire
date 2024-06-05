package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.item.Item

/**
 * @param [nbt] NEVER making an item creator thing, so you have to get the nbt data yourself
 */
class MinecraftItem(val nbt: String) : Item(ID.ITEM), io.github.flyingpig525.base.JsonData {
    override fun getJsonData(): String {
        return """
			{
				"item": "$nbt"
			}
		""".trimIndent()
    }

    companion object {
        fun String.toMinecraftItem() = MinecraftItem(this.replace("\"", "\\\""))
        fun mcItemOf(type: String, count: Short = 1) = """{Count:${count}b,DF_NBT:3700,id:"$type"}""".toMinecraftItem()
    }
}