package io.github.flyingpig525.base

import kotlinx.serialization.json.JsonObject

interface JsonData {
    fun getJsonData(): JsonObject
}