package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.GlobalActionDump
import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item

open class Block<T>(val codeBlock: String, var items: MutableList<T>, val action: String, private val extra: String = "") :
    JsonData where T : Item, T : JsonData {
    init {
        var i = 0
        items = items.map { item ->
            val copy = i
            val newItem = item.apply {
                slot = copy
            }
            i++
            newItem
        }.toMutableList()

    }

    override fun getJsonData(): String {
        var tags = ""
        var string = """
            {
                "id": "block",
                "block": "$codeBlock",
                "args": {
                    "items": [
          
        """.trimIndent()
        var i = 1
        tags = GlobalActionDump.getTags(this)
        val tagCount = GlobalActionDump.tagAmount(tags)
        for (item in items.take(26-tagCount)) {
            string += Item.getItemJsonArgument(item, i - 1)
            if (items.size > i || tagCount != 0) string += ','
            i++
        }
        string += tags

        string += """
                    ]
                },
                "action": "$action" ${if (extra != "") ", $extra" else ""}
            }
        """
        return string
    }

}