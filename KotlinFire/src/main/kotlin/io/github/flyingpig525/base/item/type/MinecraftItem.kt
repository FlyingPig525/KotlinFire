package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/**
 * @param [nbt] NEVER making an nbt builder, so you have to get the nbt data yourself
 */
class MinecraftItem(val nbt: String) : Item(ID.ITEM) {
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("item", nbt)
        }
//        return """
//			{
//				"item": "$nbt"
//			}
//		""".trimIndent()
    }

    companion object {
        fun String.toMinecraftItem() = MinecraftItem(this.replace("\"", "\\\""))
        val String.mcItem get() = toMinecraftItem()
        fun mcItemOf(type: String, count: Short = 1) = """{Count:${count}b,DF_NBT:3700,id:"$type"}""".toMinecraftItem()
    }
}