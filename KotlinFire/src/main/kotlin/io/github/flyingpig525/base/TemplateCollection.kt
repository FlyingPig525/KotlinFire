package io.github.flyingpig525.base

import io.github.flyingpig525.base.block.ENTITYEVENT
import io.github.flyingpig525.base.block.PLAYEREVENT
import io.github.flyingpig525.base.item.Item

class TemplateCollection<T>(a: TemplateCollection<T>.() -> Unit) where T : Item, T : JsonData {
    private val templates: MutableList<Template<T>> = mutableListOf()
    fun EventTemplate(
        event: PLAYEREVENT,
        applier: Template<T>.() -> Unit
    ): EventTemplate<T> {
        val temp = EventTemplate<T>(event, applier)
        templates += temp
        return temp
    }

    fun EventTemplate(
        event: ENTITYEVENT,
        applier: Template<T>.() -> Unit
    ): EventTemplate<T> {
        val temp = EventTemplate<T>(event, applier)
        templates += temp
        return temp
    }

    fun Template(
        type: Template.Type = Template.Type.FUNCTION,
        name: String = "PutNameHere",
        applier: Template<T>.() -> Unit
    ): Template<T> {
        val temp = Template(type, name, applier)
        templates += temp
        return temp
    }

    fun codeClientPlaceTemplates() {
        Template.codeClientPlaceMultipleTemplates(templates.toList())
    }

    init {
        apply(a)
    }
}