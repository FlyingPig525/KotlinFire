package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.Template

data class ItemComparison internal constructor(private val inserted: Template.(not: Boolean, nested: Template.() -> Unit) -> Unit) {
    private var not = false
    fun not() {
        not = true
    }

    operator fun invoke(template: Template, nested: Template.() -> Unit) {
        inserted.invoke(template, not, nested)
    }
}