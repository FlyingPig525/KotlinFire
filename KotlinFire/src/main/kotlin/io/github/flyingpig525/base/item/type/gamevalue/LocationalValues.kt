package io.github.flyingpig525.base.item.type.gamevalue

import io.github.flyingpig525.base.item.type.GameValue
import io.github.flyingpig525.base.item.type.LocItem
import io.github.flyingpig525.base.item.type.NumItem
import io.github.flyingpig525.base.item.type.VecItem

object LocationalValues {
	/**
	 * *Gets a target's location.*
	 *
	 * **Type:** [LocItem]
	 *
	 * *Location and*
	 * *rotation, at feet height*
	 */
	val Location get() = GameValue<LocItem>("Location")

	/**
	 * *Gets the location of the*
	 * *block a target is looking at.*
	 *
	 * **Type:** [LocItem]
	 *
	 * *Block center*
	 */
	val TargetBlockLocation get() = GameValue<LocItem>("Target Block Location")

	/**
	 * *Gets the side of the*
	 * *block a target is looking*
	 * *at as a direction.*
	 *
	 * **Type:** [VecItem]
	 *
	 * *Block side*
	 */
	val TargetBlockSide get() = GameValue<VecItem>("Target Block Side")

	/**
	 * *Gets a target's location, but*
	 * *adjusted to its eye height.*
	 *
	 * **Type:** [LocItem]
	 *
	 * *Eye location*
	 * *and rotation*
	 */
	val EyeLocation get() = GameValue<LocItem>("Eye Location")

	/**
	 * *Gets the X coordinate*
	 * *of a target's position.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Coordinate*
	 */
	val XCoordinate get() = GameValue<NumItem>("X-Coordinate")

	/**
	 * *Gets the Y coordinate*
	 * *of a target's position.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Coordinate*
	 */
	val YCoordinate get() = GameValue<NumItem>("Y-Coordinate")

	/**
	 * *Gets the Z coordinate*
	 * *of a target's position.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Coordinate*
	 */
	val ZCoordinate get() = GameValue<NumItem>("Z-Coordinate")

	/**
	 * *Gets the location of the center of*
	 * *the target's bounding box.*
	 *
	 * **Type:** [LocItem]
	 *
	 * *Location and*
	 * *rotation, at midpoint*
	 */
	val MidpointLocation get() = GameValue<LocItem>("Midpoint Location")

	/**
	 * *Gets the pitch (up/down*
	 * *rotation) of a target's*
	 * *position.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *-90.0 to 90.0*
	 *
	 * **Additional Info**
	 *
	 * *-90.0° = up*
	 * *90.0° = down*
	 */
	val Pitch get() = GameValue<NumItem>("Pitch")

	/**
	 * *Gets the yaw (left/right*
	 * *rotation) of a target's*
	 * *position.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *-180.0 to 180.0*
	 *
	 * **Additional Info**
	 *
	 * *-180.0° & 180.0° = north*
	 * *-90.0° = east*
	 * *0.0° = south*
	 * *90.0° = west*
	 */
	val Yaw get() = GameValue<NumItem>("Yaw")

	/**
	 * *Gets the yaw (left/right*
	 * *rotation) of a target's*
	 * *body.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *-180.0 to 180.0*
	 *
	 * **Additional Info**
	 *
	 * *-180.0° & 180.0° = north*
	 * *-90.0° = east*
	 * *0.0° = south*
	 * *90.0° = west*
	 */
	val BodyYaw get() = GameValue<NumItem>("Body Yaw")

	/**
	 * *Gets the location of the block*
	 * *that is supporting the player.*
	 *
	 * **Type:** [LocItem]
	 *
	 * *Block center*
	 *
	 * **Additional Info**
	 *
	 * *When not grounded, this will*
	 * *return the location of the block*
	 * *at the target's location.*
	 */
	val StandingBlockLocation get() = GameValue<LocItem>("Standing Block Location")

	/**
	 * *Gets a target's original spawn*
	 * *location.*
	 *
	 * **Type:** [LocItem]
	 *
	 * *Location this*
	 * *entity was created at*
	 */
	val SpawnLocation get() = GameValue<LocItem>("Spawn Location")

	/**
	 * *Gets the speed at which a*
	 * *target is moving (not walking)*
	 * *in each direction.*
	 *
	 * **Type:** [VecItem]
	 *
	 * *Movement velocity*
	 *
	 * **Additional Info**
	 *
	 * *When grounded, a target may*
	 * *still have a downward velocity*
	 * *due to how gravity is applied.*
	 */
	val Velocity get() = GameValue<VecItem>("Velocity")

	/**
	 * *Gets the looking direction*
	 * *of a target's location as*
	 * *a vector.*
	 *
	 * **Type:** [VecItem]
	 *
	 * *Direction vector*
	 * *(length of 1.0)*
	 */
	val Direction get() = GameValue<VecItem>("Direction")

}