package io.github.flyingpig525.base

// oh the pain i have for such a hacky solution for delegate setValue :'(
internal object TemplateContext {
    internal val ctx: MutableList<Template> = mutableListOf()
    internal val current get() = ctx.last()

    internal fun push(context: Template) = ctx.add(context)
    internal fun pop() = ctx.removeLast()
}