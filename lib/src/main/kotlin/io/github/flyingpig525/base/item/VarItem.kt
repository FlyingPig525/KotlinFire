package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.item.serializer.ItemType
import io.github.flyingpig525.base.item.serializer.Serializer
import io.github.flyingpig525.base.item.serializer.VarItemSerializer
import kotlinx.serialization.Contextual
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
/*
    "item": {
        "id": "var",
        "data": {
            "name": "%uuid hand value",
            "scope": "unsaved"
        }
    }
 */
@Serializable(with = VarItemSerializer::class)
class VarItem(val name: String, val scope: Scope) : Item<VarItemSerializer, VarItem>(VarItemSerializer) {

    @Serializable
    enum class Scope(val value: String) {
        GAME("unsaved"),
        LOCAL("local"),
        SAVE("saved"),
        LINE("line");

        @OptIn(ExperimentalSerializationApi::class)
        override fun toString(): String = serializer().descriptor.getElementName(ordinal)
    }
}