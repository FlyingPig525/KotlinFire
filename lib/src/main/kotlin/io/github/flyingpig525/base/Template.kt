package io.github.flyingpig525.base

import io.github.flyingpig525.base.item.VarItem

class Template(a: Template.() -> Unit) {
    init {
        apply(a)
    }

    fun setVar(variable: VarItem): Block {
        return Block("set_var", )
    }
}
