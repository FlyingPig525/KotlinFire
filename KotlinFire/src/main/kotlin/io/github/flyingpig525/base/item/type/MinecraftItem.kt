package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/**
 * A generic minecraft item, created through nbt
 *
 * @param [nbt] - The raw nbt of the item, as a string
 *
 * Can be constructed through the class constructor, the string extensions, or the [mcItemOf] function.
 *
 * @see toMinecraftItem
 * @see mcItem
 * @see mcItemOf
 */
class MinecraftItem(val nbt: String) : Item(ID.ITEM) {
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("item", nbt)
        }
    }

    companion object {
        fun String.toMinecraftItem() = MinecraftItem(this.replace("\"", "\\\""))
        val String.mcItem get() = toMinecraftItem()

        /**
         * @param [type] - The id of the minecraft item, ex: `"minecraft:dirt"`
         */
        fun mcItemOf(type: String, count: Short = 1) = """{Count:${count}b,DF_NBT:3700,id:"$type"}""".toMinecraftItem()
    }
}