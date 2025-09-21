package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import io.github.flyingpig525.base.item.Sounds

/**
 * A DiamondFire sound.
 *
 * Can be constructed through the class constructor, through the string extensions, or through [Sounds].
 *
 * @see toSoundItem
 * @see soundItem
 * @see Sounds
 */
class SoundItem(val sound: String, val pitch: Float = 1f, val vol: Float = 2f) : Item(ID.SOUND) {
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("pitch", pitch)
            put("vol", vol)
            put("sound", sound)
        }
    }

    companion object {
        fun String.toSoundItem(pitch: Number = 1f, vol: Number = 2f) = SoundItem(this, pitch.toFloat(), vol.toFloat())
        val String.soundItem get() = toSoundItem()
    }
}