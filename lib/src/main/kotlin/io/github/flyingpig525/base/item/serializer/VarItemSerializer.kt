package io.github.flyingpig525.base.item.serializer

import io.github.flyingpig525.base.item.VarItem
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor

/*
    "item": {
        "id": "var",
        "data": {
            "name": "%uuid hand value",
            "scope": "unsaved"
        }
    }
 */
object VarItemSerializer : Serializer<VarItem> {
    override fun getSerialized(value: VarItem): String {
        return """"name":${value.name},"scope":${value.scope}""".trimIndent()
    }

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("item", PrimitiveKind.STRING)

}