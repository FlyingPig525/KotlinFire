package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.Sounds
import io.github.flyingpig525.base.item.type.SoundItem.Companion.soundItem
import io.github.flyingpig525.base.item.type.SoundItem.Companion.toSoundItem
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/**
 * A DiamondFire sound.
 *
 * Can be constructed through the class constructor, the string extensions, or through [Sounds].
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

    fun pitch(pitch: Float): SoundItem = SoundItem(sound, pitch, vol)
    fun vol(vol: Float): SoundItem = SoundItem(sound, pitch, vol)

    companion object {
        fun String.toSoundItem(pitch: Number = 1f, vol: Number = 2f) = SoundItem(this, pitch.toFloat(), vol.toFloat())
        val String.soundItem get() = toSoundItem()
    }
}