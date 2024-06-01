package io.github.flyingpig525.base

import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemArgument
import io.github.flyingpig525.base.item.ItemId
import io.github.flyingpig525.base.item.VarItem
import io.github.flyingpig525.base.item.serializer.ItemType
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class Block <T : ItemType> private constructor(
    @SerialName("block") val codeBlock: String,
    var items: MutableList<ItemArgument<@Contextual T>>,
    val action: String
) {

    constructor(
        codeBlock: String,
        items: List<ItemArgument<@Contextual T>>,
        action: String
    ) : this(codeBlock, items.toMutableList(), action)

    init {
        var i = 0
        items = items.map { item ->
            val newItem = item.apply {
                slot = i
            }
            i++
            return@map newItem
        }.toMutableList()
    }

    fun item(dfItem: VarItem) {
        ItemArgument(ItemId.VAR, dfItem)
    }

    fun item(item: ItemArgument<T>) {
        items += item.apply {
            slot = this@Block.items.size
        }
    }
}