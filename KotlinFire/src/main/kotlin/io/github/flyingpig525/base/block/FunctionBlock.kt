package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item

class FunctionBlock<T>(name: String = "PutNameHere") : Block<T>("func", mutableListOf(), name) where T : Item, T : JsonData {
	override fun getJsonData(): String {
		return """
            {
                "id": "block",
                "block": "$codeBlock",
                "args": {
                    "items": [
                    ]
                },
                "data": "$action"
            }
        """
	}
}