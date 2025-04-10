package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

class ElseBlock : Block("else", mutableListOf(), "") {
    override fun getJsonData(): JsonObject {
        return buildJsonObject {
            put("id", "block")
            put("block", codeBlock)
        }
//        return """
//			{
//				"id": "block",
//				"block": "$codeBlock"
//			}
//		""".trimIndent()
    }
}