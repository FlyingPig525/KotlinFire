@file:Suppress("UNUSED")

package io.github.flyingpig525.base.block.category

import io.github.flyingpig525.base.block.Block
import io.github.flyingpig525.base.block.BracketBlock
import io.github.flyingpig525.base.item.Item
import io.github.flyingpig525.base.item.ItemCollection
import io.github.flyingpig525.base.item.type.*

class RepeatCategory<T> internal constructor(private val template: io.github.flyingpig525.base.Template<T>) where T : Item, T : io.github.flyingpig525.base.JsonData {
    private val blocks = template.blocks

    private fun block(
        items: io.github.flyingpig525.base.Items<T>,
        action: String,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) {
        blocks += Block("repeat", ItemCollection(items).items, action)
        blocks += BracketBlock(type = "repeat")
        blocks += io.github.flyingpig525.base.Template(
            io.github.flyingpig525.base.Template.Type.NONE,
            a = wrappedCode
        ).blocks
        blocks += BracketBlock(false, "repeat")
    }

    fun chain(a: RepeatCategory<T>.() -> Unit) {
        apply(a)
    }

    /**
     * Repeats code once for each
     * block adjacent to a location.
     *
     * ARGUMENTS:
     *
     * [VarItem]
     *
     * Gets the current
     * block location each iteration
     *
     * [LocItem]
     *
     * Center block
     *
     * (*) = Optional
     */
    fun adjacent(
        items: io.github.flyingpig525.base.Items<T>,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "Adjacent", wrappedCode)

    /**
     * Repeats code once for
     * each interpolated point in
     * a path of locations.
     *
     * ARGUMENTS:
     *
     * [VarItem]
     *
     * Gets the current
     * path location each iteration
     *
     * [LocItem](s)
     *
     * Path locations
     *
     * (*)[NumItem]
     *
     * Point spacing
     *
     * (*) = Optional
     */
    fun path(
        items: io.github.flyingpig525.base.Items<T>,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "Path", wrappedCode)

    /**
     * Repeats code multiple times.
     *
     * ARGUMENTS:
     *
     * (*)[VarItem]
     *
     * Gets the
     * current index each iteration
     *
     * [NumItem]
     *
     * Amount
     *
     * (*) = Optional
     */
    fun multiple(
        items: io.github.flyingpig525.base.Items<T>,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "Multiple", wrappedCode)

    /**
     * Repeats code once for each
     * block in a region.
     *
     * ARGUMENTS:
     *
     * [VarItem]
     *
     * Gets the current
     * block location each iteration
     *
     * [LocItem]
     *
     * Start of region
     *
     * [LocItem]
     *
     * End of region
     *
     * (*) = Optional
     */
    fun grid(
        items: io.github.flyingpig525.base.Items<T>,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "Grid", wrappedCode)

    /**
     * Repeats code as long as a
     * condition is true.
     *
     * ARGUMENTS:
     *
     * (*) = Optional
     */
    fun whileLoop(
        items: io.github.flyingpig525.base.Items<T>,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "While", wrappedCode)

    fun range(
        items: io.github.flyingpig525.base.Items<T>,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "Range", wrappedCode)

    /**
     * Repeats code once for each
     * index of a list.
     *
     * ARGUMENTS:
     *
     * [VarItem]
     *
     * Gets the current
     * value each iteration
     *
     * [VarItem]
     *
     * List to repeat through
     *
     * (*) = Optional
     */
    fun forEach(
        items: io.github.flyingpig525.base.Items<T>,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "ForEach", wrappedCode)

    /**
     * Repeats code once for every
     * evenly distributed sphere point.
     *
     * ARGUMENTS:
     *
     * [VarItem]
     *
     * Gets the current
     * sphere location each iteration
     *
     * [LocItem]
     *
     * Sphere center
     *
     * [NumItem]
     *
     * Sphere radius
     *
     * (*)[NumItem]
     *
     * Sphere points
     *
     * (*) = Optional
     */
    fun sphere(
        items: io.github.flyingpig525.base.Items<T>,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "Sphere", wrappedCode)

    /**
     * Repeats code indefinitely.
     */
    fun forever(
        items: io.github.flyingpig525.base.Items<T>,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "Forever", wrappedCode)

    /**
     * Repeats code once per entry in
     * a dictionary
     *
     * ARGUMENTS:
     *
     * [VarItem]
     *
     * Gets the current key
     * each iteration
     *
     * [VarItem]
     *
     * Gets the current value
     * each iteration
     *
     * []
     *
     * Dictionary to
     * repeat through
     *
     * (*) = Optional
     */
    fun forEachEntry(
        items: io.github.flyingpig525.base.Items<T>,
        wrappedCode: io.github.flyingpig525.base.Template<T>.() -> Unit
    ) = block(items, "ForEachEntry", wrappedCode)

}