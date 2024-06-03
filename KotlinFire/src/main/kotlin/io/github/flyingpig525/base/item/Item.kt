package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.JsonData

open class Item(val id: ID) {
	var slot = 0

	enum class ID(private val id: String) {
		VAR("var"),
		STRING("txt"),
		RICHTEXT("comp"),
		NUMBER("num"),
		LOCATION("loc"),
		VECTOR("vec"),
		GAMEVALUE("g_val"),
		ITEM("item");


		override fun toString(): String = id
	}

	companion object {
		fun <T> getItemJsonArgument(item: T): String where T : Item, T : JsonData = """
			{
				"item": {
					"id": "${item.id}",
					"data": ${item.getJsonData()}
				},
				"slot": ${item.slot}
			}
		""".trimIndent()
	}
}