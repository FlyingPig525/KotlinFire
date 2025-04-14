package io.github.flyingpig525.base

import io.github.flyingpig525.base.block.EntityEvent
import io.github.flyingpig525.base.block.PlayerEvent
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.type.ParameterItem

class TemplateCollection(a: TemplateCollection.() -> Unit) {
    private val templates: MutableList<Template> = mutableListOf()
    fun eventTemplate(
        event: PlayerEvent,
        applier: Template.() -> Unit
    ): EventTemplate {
        val temp = EventTemplate(event, applier)
        templates += temp
        return temp
    }

    fun eventTemplate(
        event: EntityEvent,
        applier: Template.() -> Unit
    ): EventTemplate {
        val temp = EventTemplate(event, applier)
        templates += temp
        return temp
    }

    fun template(
        type: Template.Type = Template.Type.FUNCTION,
        name: String = "PutNameHere",
        vararg args: ParameterItem,
        applier: Template.() -> Unit
    ): Template {
        val temp = Template(type = type, name = name, args = args, a = applier)
        templates += temp
        return temp
    }

    fun codeClientPlaceTemplates() {
        Template.codeClientPlaceMultipleTemplates(templates.toList())
    }
    fun getStrings(): List<String> = templates.map { it.getTemplateString() }

    init {
        apply(a)
    }
}