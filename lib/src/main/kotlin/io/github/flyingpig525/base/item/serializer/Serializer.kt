package io.github.flyingpig525.base.item.serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

interface Serializer<T> : KSerializer<T> {
    fun getSerialized(value: T): String

    override fun serialize(encoder: Encoder, value: T) {
        encoder.encodeString(getSerialized(value))
    }

    override fun deserialize(decoder: Decoder): T {
        TODO("Not yet implemented")
    }
}