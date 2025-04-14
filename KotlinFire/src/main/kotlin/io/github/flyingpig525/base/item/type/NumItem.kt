package io.github.flyingpig525.base.item.type

import io.github.flyingpig525.base.JsonData
import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.Insertable
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.ItemComparison
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlin.reflect.KProperty

class NumItem(private val value: String) : Item(ID.NUMBER) {

    constructor(value: Number) : this(value.toString())

    override fun getJsonData() = buildJsonObject {
        put("name", value)
    }
//        """
//		{
//			"name": "$value"
//		}
//	""".trimIndent()

    companion object {
        fun Number.toNumItem(): NumItem = NumItem(this)
        val Number.numItem get() = toNumItem()
        fun String.toNumItem(): NumItem = NumItem(this)
        val String.numItem get() = toNumItem()
    }
}

class NumVariable(name: String, scope: VarItem.Scope) : VarClass(name, scope, NumItem::class) {
    private fun lessThan(other: Insertable): ItemComparison {
        if (other !is VarClass && other !is Item) throw IllegalArgumentException("this should never happen, other is type ${other::class.simpleName}")
        return ItemComparison { not, nested ->
            IfVar.lessThan({
                +item
                +other
            }, not, nested)
        }
    }
    infix fun lessThan(other: NumVariable) = lessThan(other as Insertable)
    infix fun lessThan(other: NumItem) = lessThan(other as Insertable)

    private fun lessThanOrEqual(other: Insertable): ItemComparison {
        if (other !is VarClass && other !is Item) throw IllegalArgumentException("this should never happen, other is type ${other::class.simpleName}")
        return ItemComparison { not, nested ->
            IfVar.lessThanOrEqual({
                +item
                +other
            }, not, nested)
        }
    }
    infix fun lessThanOrEqual(other: NumVariable) = lessThanOrEqual(other as Insertable)
    infix fun lessThanOrEqual(other: NumItem) = lessThanOrEqual(other as Insertable)

    private fun greaterThan(other: Insertable): ItemComparison {
        if (other !is VarClass && other !is Item) throw IllegalArgumentException("this should never happen, other is type ${other::class.simpleName}")
        return ItemComparison { not, nested ->
            IfVar.greaterThan({
                +item
                +other
            }, not, nested)
        }
    }
    infix fun greaterThan(other: NumVariable) = greaterThan(other as Insertable)
    infix fun greaterThan(other: NumItem) = greaterThan(other as Insertable)

    private fun greaterThanOrEqual(other: Insertable): ItemComparison {
        if (other !is VarClass && other !is Item) throw IllegalArgumentException("this should never happen, other is type ${other::class.simpleName}")
        return ItemComparison { not, nested ->
            IfVar.greaterThanOrEqual({
                +item
                +other
            }, not, nested)
        }
    }
    infix fun greaterThanOrEqual(other: NumVariable) = greaterThanOrEqual(other as Insertable)
    infix fun greaterThanOrEqual(other: NumItem) = greaterThanOrEqual(other as Insertable)
}
