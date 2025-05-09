package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

class BracketBlock(val open: Boolean = true, val type: String) : JsonData,
    Block("bracket", mutableListOf(), "") {
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("id", "bracket")
            put("direct", if (open) "open" else "close")
            put("type", type)
        }
//        return """{
//      		"id": "bracket",
//      		"direct": "${if (open) "open" else "close"}",
//      		"type": "$type"
//    	}""".trimIndent()
    }

}