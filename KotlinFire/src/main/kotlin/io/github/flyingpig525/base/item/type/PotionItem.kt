package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/**
 * A DiamondFire potion.
 *
 * Can be constructed through the class constructor or the builder.
 *
 * @see Builder
 */
class PotionItem(val pot: String, val duration: Int, val amplifier: Int) : Item(ID.POTION) {
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("pot", pot)
            put("dur", duration)
            put("amp", amplifier)
        }
    }

    class Builder internal constructor() {
        internal var pot: String = "Saturation"
        internal var dur: Int = 0
        internal var amp: Int = 1
        val item: PotionItem get() = PotionItem(pot, dur, amp)

        fun infinite() = apply { dur = 1000000 }
        fun duration(dur: Int) = apply { this.dur = dur }
        fun amplifier(amp: Int) = apply { this.amp = amp }
    }
    companion object {
        fun pot(name: String): Builder = Builder().apply {
            pot = name
        }
        fun infinite(name: String): Builder = Builder().apply {
            pot = name
            infinite()
        }
    }
}