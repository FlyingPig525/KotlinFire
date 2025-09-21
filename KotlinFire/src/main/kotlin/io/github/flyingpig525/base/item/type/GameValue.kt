@file:Suppress("UNUSED")

package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import io.github.flyingpig525.base.item.type.gamevalue.*

/**
 * A DiamondFire game value variable.
 *
 * Cannot be constructed, and instances must be acquired through objects:
 * @see EventValues
 * @see InformationalValues
 * @see ItemValues
 * @see LocationalValues
 * @see PlotValues
 * @see StatisticalValues
 */
class GameValue <T : Item> internal constructor(private val type: String, private var target: Target = Target.Default) : Item(ID.GAMEVALUE) {
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("type", type)
            put("target", target.toString())
        }
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