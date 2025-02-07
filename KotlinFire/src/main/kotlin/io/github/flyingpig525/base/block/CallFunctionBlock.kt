package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.put

class CallFunctionBlock<T>(funcName: String) : Block<T>(
    "call_func",
    mutableListOf(),
    "",
    { put("data", funcName) }
//    "data: \"$funcName\""
) where T : Item, T : JsonData