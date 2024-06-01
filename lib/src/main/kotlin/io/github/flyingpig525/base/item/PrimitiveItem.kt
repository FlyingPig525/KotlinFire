package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.item.serializer.ItemType
import io.github.flyingpig525.base.item.serializer.PrimitiveItemSerializer
import kotlinx.serialization.Serializable

@Serializable(with = PrimitiveItemSerializer::class)
class PrimitiveItem<T : Any>(val value: T) : Item<PrimitiveItemSerializer, PrimitiveItem<Any>>(PrimitiveItemSerializer) {
}