package io.github.flyingpig525.base.item

import io.github.flyingpig525.base.item.serializer.Serializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

abstract class Item<T : Serializer<B>, B>(val serializer: T)