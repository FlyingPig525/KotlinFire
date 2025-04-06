package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import kotlinx.serialization.json.put

class CallFunctionBlock<T>(funcName: String, items: Items<T>) : Block<T>(
    "call_func",
    ItemCollection(items).items,
    "",
    { put("data", funcName) }
//    "data: \"$funcName\""
) where T : Item, T : JsonData