package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.item.Item

class CallFunctionBlock<T>(funcName: String) : Block<T>(
    "call_func",
    mutableListOf(),
    "",
    "data: \"$funcName\""
) where T : Item, T : io.github.flyingpig525.base.JsonData