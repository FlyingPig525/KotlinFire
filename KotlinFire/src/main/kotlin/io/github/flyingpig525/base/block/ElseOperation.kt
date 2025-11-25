package io.github.flyingpig525.base.block

import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.Template.Type

/**
 * A class that contains an `Else` function to easily add an else block
 */
class ElseOperation internal constructor() {
    context(t: Template)
    infix fun Else(wrappedCode: Template.() -> Unit) {
        t.blocks += ElseBlock()
        t.blocks += BracketBlock(type = "norm")
        t.blocks += Template(
            Type.NONE,
            code = wrappedCode
        ).blocks
        t.blocks += BracketBlock(false, "norm")
    }
}