package io.github.flyingpig525.base

import io.github.flyingpig525.base.block.EntityEvent
import io.github.flyingpig525.base.block.PlayerEvent
import io.github.flyingpig525.base.item.type.ParameterItem

/**
 * A helper class providing easy definition and sending of multiple [Template]s.
 */
class TemplateCollection(a: TemplateCollection.() -> Unit) : Iterable<Template> {
    private val templates: MutableList<Template> = mutableListOf()

    /**
     * Creates a player event template held in `TemplateCollection` scope, allowing `TemplateCollection` helper methods
     * to access it.
     */
    fun eventTemplate(
        event: PlayerEvent,
        code: Template.() -> Unit
    ): EventTemplate {
        val temp = EventTemplate(event, code)
        templates += temp
        return temp
    }

    /**
     * Creates an entity event template held in `TemplateCollection` scope, allowing `TemplateCollection` helper methods
     * to access it.
     */
    fun eventTemplate(
        event: EntityEvent,
        code: Template.() -> Unit
    ): EventTemplate {
        val temp = EventTemplate(event, code)
        templates += temp
        return temp
    }

    /**
     * Creates a template held in `TemplateCollection` scope, allowing `TemplateCollection` helper methods to access it.
     */
    fun template(
        type: Template.Type = Template.Type.FUNCTION,
        name: String = "PutNameHere",
        vararg args: ParameterItem,
        code: Template.() -> Unit
    ): Template {
        val temp = Template(type = type, name = name, args = args, code = code)
        templates += temp
        return temp
    }

    /**
     * Places all templates held in scope using `Template.codeClientPlaceMultipleTemplates`
     *
     * @see Template.codeClientPlaceMultipleTemplates
     */
    fun codeClientPlaceTemplates() {
        Template.codeClientPlaceMultipleTemplates(toList())
    }

    /**
     * @return A list of all template strings held by this collection
     */
    fun getStrings(): List<String> = map { it.getTemplateString() }

    override fun iterator(): Iterator<Template> = templates.toList().iterator()

    init {
        apply(a)
    }
}