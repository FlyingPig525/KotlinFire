package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.put

class CallProcessBlock<T>(processName: String) : Block<T>(
    "start_process",
    mutableListOf(),
    "",
    { put("data", processName) }
//    "data: \"$processName\""
) where T : Item, T : JsonData
