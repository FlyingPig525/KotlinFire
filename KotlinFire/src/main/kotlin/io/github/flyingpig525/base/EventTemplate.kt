package io.github.flyingpig525.base

import io.github.flyingpig525.base.block.EntityEvent
import io.github.flyingpig525.base.block.EventBlock
import io.github.flyingpig525.base.block.PlayerEvent

/**
 * A DiamondFire event.
 *
 * Check the [README](https://github.com/FlyingPig525/KotlinFire/blob/master/README.md) to see how to use this class.
 */
class EventTemplate private constructor(
    event: EventBlock,
    code: Template.() -> Unit
) : Template(
    Type.EVENT, "", code = code
) {

    constructor(event: PlayerEvent, code: Template.() -> Unit) : this(
        EventBlock(
            event.type,
            event.event
        ), code
    )

    constructor(event: EntityEvent, code: Template.() -> Unit) : this(
        EventBlock(
            event.type,
            event.event
        ), code
    )

    init {
        blocks[0] = event
    }
}