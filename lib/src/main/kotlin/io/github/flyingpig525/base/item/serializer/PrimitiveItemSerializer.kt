package io.github.flyingpig525.base.item.serializer

import io.github.flyingpig525.base.item.PrimitiveItem
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor

object PrimitiveItemSerializer : Serializer<PrimitiveItem<Any>> {
    override fun getSerialized(value: PrimitiveItem<Any>): String {
        return """
            "item": "${value.value}"
        """.trimIndent()
    }

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("item", PrimitiveKind.STRING)

}