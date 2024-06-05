package io.github.flyingpig525.encoding

import io.github.flyingpig525.base.item.Item
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

object TemplateEncoder {
    @OptIn(ExperimentalEncodingApi::class)
    fun <T> encode(template: io.github.flyingpig525.base.Template<T>): String where T : Item, T : io.github.flyingpig525.base.JsonData {
        val gzipped = Gzip.encode(template.getJsonData())
        return Base64.encode(gzipped)
    }
}