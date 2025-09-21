package io.github.flyingpig525.base

import kotlinx.serialization.json.JsonObject

/**
 * An interface used to denote what classes can be serialized into json data.
 */
interface JsonData {
    fun getJsonData(): JsonObject
}