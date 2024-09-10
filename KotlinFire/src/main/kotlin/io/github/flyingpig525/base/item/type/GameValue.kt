@file:Suppress("UNUSED")

package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item

class GameValue(private val type: String, private var target: Target = Target.Default) : Item(ID.GAMEVALUE),
    JsonData {
    override fun getJsonData(): String {
        return """
			{
				"type": "$type",
				"target": "$target"
			}
		""".trimIndent()
    }

    fun target(target: Target) {
        this.target = target
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