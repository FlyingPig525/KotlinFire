package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.item.serializer.ItemArgumentSerializer
import io.github.flyingpig525.base.item.serializer.ItemType
import kotlinx.serialization.Serializable

@Serializable(with = ItemArgumentSerializer::class)
open class ItemArgument<T : ItemType>(val id: ItemId, val data: T) {

    var slot = 0
}