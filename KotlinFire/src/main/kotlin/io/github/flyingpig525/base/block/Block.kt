package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item

open class Block<T>(val codeBlock: String, var items: MutableList<T>, val action: String) :
    JsonData where T : Item, T : JsonData {
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

    override fun getJsonData(): String {
        var string = """
            {
                "id": "block",
                "block": "$codeBlock",
                "args": {
                    "items": [
          
        """.trimIndent()
        var i = 1
        for (item in items) {
            string += Item.getItemJsonArgument(item)
            if (items.size > i) string += ','
            i++
        }

        string += """
                    ]
                },
                "action": "$action"
            }
        """
        return string
    }

}