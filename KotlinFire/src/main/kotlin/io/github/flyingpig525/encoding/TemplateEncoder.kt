package io.github.flyingpig525.encoding

import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Item
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

object TemplateEncoder {
    @OptIn(ExperimentalEncodingApi::class)
    fun encode(template: Template): String {
        val gzipped = Gzip.encode(Json.encodeToString(template.getJsonData()))
        return Base64.encode(gzipped)
    }
}