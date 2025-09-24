package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.Template

/**
 * An internal class used for providing clean comparison syntax
 */
@ConsistentCopyVisibility
data class ItemComparison internal constructor(private val inserted: Template.(not: Boolean, nested: Template.() -> Unit) -> Unit) {
    private var not = false
    operator fun not(): ItemComparison = apply {
        not = !not
    }

    operator fun invoke(template: Template, nested: Template.() -> Unit) {
        inserted.invoke(template, not, nested)
    }
}