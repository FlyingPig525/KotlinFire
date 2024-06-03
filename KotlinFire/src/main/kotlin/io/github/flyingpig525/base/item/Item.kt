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

	override fun toString(): String {
		return "ITEM(id: $id, slot: $slot)"
	}

	companion object {
		fun <T> getItemJsonArgument(item: T, slot: Int? = null): String where T : Item, T : JsonData = """
			{
				"item": {
					"id": "${item.id}",
					"data": ${item.getJsonData()}
				},
				"slot": ${slot ?: item.slot}
			}
		""".trimIndent()
	}
}