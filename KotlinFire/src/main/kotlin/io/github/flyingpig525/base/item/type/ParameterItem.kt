package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.type.VarItem.Companion.lineVar
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonObject

/**
 * A DiamondFire parameter for functions.
 *
 * Can be constructed through the class constructor, or the provided builder for a nicer, more understandable experience.
 *
 * @see Builder
 * @see num
 * @see str
 * @see snd
 * @see txt
 * @see gameVal
 * @see item
 * @see loc
 * @see vec
 */
class ParameterItem(val paramId: ID, val name: String, val plural: Boolean, val optional: Boolean, val optionalItem: Item?) : Item(ID.PARAMETER) {
    override fun getJsonData(): JsonObject = buildJsonObject {
        put("name", name)
        put("type", paramId.id)
        put("plural", plural)
        put("optional", optional)
        if (optionalItem != null) {
            putJsonObject("default_value") {
                put("id", optionalItem.id.toString())
                put("data", optionalItem.getJsonData())
            }
        }
    }

    companion object {
        class Builder(val name: String) {
            private var optional = false
            private var optionalDefault: Item? = null
            private var plural = false
            private var id = ID.STRING

            fun plural() = apply {
                if (optional) throw InvalidParameterOptionException("Optional parameters cannot be plural")
                plural = true
            }
            fun default(value: Item) = apply {
                if (plural) throw InvalidParameterOptionException("Plural parameters cannot be optional")
                if (value.id != id) throw InvalidParameterOptionException("Default value cannot be different than parameter type")
                optional = true
                optionalDefault = value
            }
            internal fun id(id: ID) = apply { this.id = id }

            fun num() = id(ID.NUMBER)
            fun str() = id(ID.STRING)
            fun snd() = id(ID.SOUND)
            fun txt() = id(ID.RICHTEXT)
            fun gameVal() = id(ID.GAMEVALUE)
            fun item() = id(ID.ITEM)
            fun loc() = id(ID.LOCATION)
            fun vec() = id(ID.VECTOR)

            fun parameter(): ParameterItem = ParameterItem(id, name, plural, optional, optionalDefault)
            fun variable(): VarItem = name.lineVar

            inner class InvalidParameterOptionException(message: String) : Exception(message)
        }

        private fun id(name: String, id: ID) = Builder(name).id(id)
        fun num(name: String) = id(name, ID.NUMBER)
        fun str(name: String) = id(name, ID.STRING)
        fun snd(name: String) = id(name, ID.SOUND)
        fun txt(name: String) = id(name, ID.RICHTEXT)
        fun gameVal(name: String) = id(name, ID.GAMEVALUE)
        fun item(name: String) = id(name, ID.ITEM)
        fun loc(name: String) = id(name, ID.LOCATION)
        fun vec(name: String) = id(name, ID.VECTOR)
    }
}