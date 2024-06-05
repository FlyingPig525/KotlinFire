package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item

class CallProcessBlock<T>(processName: String) : Block<T>(
    "call_process",
    mutableListOf(),
    "",
    "data: \"$processName\""
) where T : Item, T : JsonData