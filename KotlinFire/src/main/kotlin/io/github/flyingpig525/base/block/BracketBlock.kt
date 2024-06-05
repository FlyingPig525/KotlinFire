package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.item.Item

class BracketBlock<T>(val open: Boolean = true, val type: String) : io.github.flyingpig525.base.JsonData,
    Block<T>("bracket", mutableListOf(), "") where T : Item, T : io.github.flyingpig525.base.JsonData {
    override fun getJsonData(): String {
        return """{
      		"id": "bracket",
      		"direct": "${if (open) "open" else "close"}",
      		"type": "$type"
    	}""".trimIndent()
    }

}