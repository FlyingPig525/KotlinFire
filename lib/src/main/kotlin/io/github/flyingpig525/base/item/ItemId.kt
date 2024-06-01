package io.github.flyingpig525.base.item

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.serializer

@Serializable
enum class ItemId {
    @SerialName("var") VAR,
    @SerialName("txt") TEXT,
    @SerialName("num") NUMBER,
    @SerialName("vec") VECTOR,
    @SerialName("item") ITEM;

    @OptIn(ExperimentalSerializationApi::class)
    override fun toString(): String = serializer().descriptor.getElementName(ordinal)

}