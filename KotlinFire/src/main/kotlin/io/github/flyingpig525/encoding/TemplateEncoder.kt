package io.github.flyingpig525.encoding

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Item
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

object TemplateEncoder {
	@OptIn(ExperimentalEncodingApi::class)
	fun <T> encode(template: Template<T>): String where T : Item, T : JsonData {
		val gzipped = Gzip.encode(template.getJsonData())
		return Base64.encode(gzipped)
	}
}