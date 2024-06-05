package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item

class BracketBlock<T>(val open: Boolean = true, val type: String) : JsonData,
    Block<T>("bracket", mutableListOf(), "") where T : Item, T : JsonData {
    override fun getJsonData(): String {
        return """{
      		"id": "bracket",
      		"direct": "${if (open) "open" else "close"}",
      		"type": "$type"
    	}""".trimIndent()
    }

}