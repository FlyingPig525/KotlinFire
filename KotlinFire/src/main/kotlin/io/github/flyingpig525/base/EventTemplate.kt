package io.github.flyingpig525.base

import io.github.flyingpig525.base.block.ENTITYEVENT
import io.github.flyingpig525.base.block.EventBlock
import io.github.flyingpig525.base.block.PLAYEREVENT
import io.github.flyingpig525.base.item.Item

class EventTemplate<T : Item> private constructor(
    event: EventBlock<T>,
    a: Template<T>.() -> Unit
) : Template<T>(
    Type.EVENT, "", a = a
) {

    constructor(event: PLAYEREVENT, a: Template<T>.() -> Unit) : this(
        EventBlock(
            event.type,
            event.event
        ), a
    )

    constructor(event: ENTITYEVENT, a: Template<T>.() -> Unit) : this(
        EventBlock(
            event.type,
            event.event
        ), a
    )

    init {
        blocks[0] = event
    }
}