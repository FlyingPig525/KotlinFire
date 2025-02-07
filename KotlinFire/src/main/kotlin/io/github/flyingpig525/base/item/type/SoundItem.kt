package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

class SoundItem(val sound: String, val pitch: Float = 1f, val vol: Float = 2f) : Item(ID.SOUND), JsonData {
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("pitch", pitch)
            put("vol", vol)
            put("sound", sound)
        }
//        return """
//            {
//            "pitch": $pitch,
//            "vol": $vol,
//            "sound": "$sound"
//            }
//        """.trimIndent()
    }

    companion object {
        fun String.toSoundItem(pitch: Number = 1f, vol: Number = 2f) = SoundItem(this, pitch.toFloat(), vol.toFloat())
        val String.soundItem get() = toSoundItem()
    }
}