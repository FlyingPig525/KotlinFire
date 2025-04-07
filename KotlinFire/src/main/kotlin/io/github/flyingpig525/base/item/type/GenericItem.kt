package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonObject

/**
 * Stand in for particles
 * @param [data] - Must be a json object, starts with { and ends with }
 *
 * Example:
 *
 * ```kt
 * GenericItem(Item.ID.PARTICLE, """
 *     {
 *         particle: "Sonic Boom",
 *         cluster: {
 *             amount: 1,
 *             horizontal: 0,
 *             vertical: 0
 *         },
 *         data: {}
 *     }""".trimIndent()
 * )
 * ```
 */
class GenericItem(id: Item.ID, val data: String) : Item(id) {
    override fun getJsonData(): JsonObject {
        return Json.parseToJsonElement(data).jsonObject
    }
}