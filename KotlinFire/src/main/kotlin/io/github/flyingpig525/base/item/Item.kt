package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.JsonData
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonObject

abstract class Item(val id: ID) : JsonData {
    var slot = 0

    enum class ID(val id: String) {
        VAR("var"),
        STRING("txt"),
        RICHTEXT("comp"),
        NUMBER("num"),
        LOCATION("loc"),
        VECTOR("vec"),
        GAMEVALUE("g_val"),
        SOUND("snd"),
        PARAMETER("pn_el"),
        ITEM("item");


        override fun toString(): String = id
    }

    override fun toString(): String {
        return "ITEM(id: $id, slot: $slot)"
    }

    companion object {
        fun <T> getItemJsonArgument(
            item: T,
            slot: Int? = null
        ): JsonObject where T : Item, T : JsonData = buildJsonObject {
            putJsonObject("item") {
                put("id", item.id.toString())
                put("data", item.getJsonData())
            }
            put("slot", slot ?: item.slot)
        }
//            """
//			{
//				"item": {
//					"id": "${item.id}",
//					"data": ${item.getJsonData()}
//				},
//				"slot": ${slot ?: item.slot}
//			}
//		""".trimIndent()
    }
}