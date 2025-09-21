package io.github.flyingpig525.base

import io.github.flyingpig525.base.block.EntityEvent
import io.github.flyingpig525.base.block.EventBlock
import io.github.flyingpig525.base.block.PlayerEvent
import io.github.flyingpig525.base.item.Item

/**
 * A DiamondFire event.
 *
 * Check the [README](https://github.com/FlyingPig525/KotlinFire/blob/master/README.md) to see how to use this class.
 */
class EventTemplate private constructor(
    event: EventBlock,
    a: Template.() -> Unit
) : Template(
    Type.EVENT, "", a = a
) {

    constructor(event: PlayerEvent, a: Template.() -> Unit) : this(
        EventBlock(
            event.type,
            event.event
        ), a
    )

    constructor(event: EntityEvent, a: Template.() -> Unit) : this(
        EventBlock(
            event.type,
            event.event
        ), a
    )

    init {
        blocks[0] = event
    }
}