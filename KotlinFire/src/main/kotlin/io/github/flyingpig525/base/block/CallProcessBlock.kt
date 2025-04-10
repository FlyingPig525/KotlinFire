package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.Items
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import kotlinx.serialization.json.put

class CallProcessBlock(processName: String, items: Items) : Block(
    "start_process",
    ItemCollection(items).items,
    "",
    { put("data", processName) }
//    "data: \"$processName\""
)
