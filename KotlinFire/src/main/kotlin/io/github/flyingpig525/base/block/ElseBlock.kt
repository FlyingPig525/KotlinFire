package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.item.Item

class ElseBlock<T> : Block<T>("else", mutableListOf(), "") where T : Item, T : io.github.flyingpig525.base.JsonData {
    override fun getJsonData(): String {
        return """
			{
				"id": "block",
				"block": "$codeBlock"
			}
		""".trimIndent()
    }
}