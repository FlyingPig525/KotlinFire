package io.github.flyingpig525.base.item.type.tag

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonObject

internal interface TagItem : Insertable, JsonData {
    val tag: String
    val option: String
    val action: String
    val block: String
    var slot: Int

    override fun getJsonData(): JsonObject = buildJsonObject {
        putJsonObject("item") {
            put("id", Item.ID.TAG.id)
            put("data", buildJsonObject {
                put("tag", tag)
                put("option", option)
                put("action", action)
                put("block", block)
            })
        }
        put("slot", slot)
    }
}