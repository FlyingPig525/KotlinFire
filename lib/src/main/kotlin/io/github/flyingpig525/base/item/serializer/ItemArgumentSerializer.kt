package io.github.flyingpig525.base.item.serializer

import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemArgument
import kotlinx.serialization.Contextual
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder

typealias ItemType = Item<Serializer<Any>, Any>

/*
    "item": {
        "id": "var",
        "data": {
            "name": "%uuid hand value",
            "scope": "unsaved"
        }
    }
 */
object ItemArgumentSerializer : Serializer<ItemArgument<ItemType>> {
    override fun getSerialized(value: ItemArgument<ItemType>): String {
        return """
            "id": "${value.id}",
            "data": {${value.data.serializer.getSerialized(value.data)}}
        """.trimIndent()
    }

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("item", PrimitiveKind.STRING)
}