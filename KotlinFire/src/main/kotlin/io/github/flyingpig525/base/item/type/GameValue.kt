@file:Suppress("UNUSED")

package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

class GameValue <T : Item> internal constructor(private val type: String, private var target: Target = Target.Default) : Item(ID.GAMEVALUE) {
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("type", type)
            put("target", target.toString())
        }
//        return """
//			{
//				"type": "$type",
//				"target": "$target"
//			}
//		""".trimIndent()
    }

    fun target(target: Target): GameValue<T> {
        this.target = target
        return this
    }

    enum class Target {
        Default,
        Selection,
        Killer,
        Damager,
        Victim,
        Shooter,
        Projectile,
        LastEntity;

        override fun toString(): String {
            return name
        }
    }
}