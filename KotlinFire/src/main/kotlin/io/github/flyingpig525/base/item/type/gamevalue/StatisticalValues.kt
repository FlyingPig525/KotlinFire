package io.github.flyingpig525.base.item.type.gamevalue

import io.github.flyingpig525.base.item.type.GameValue
import io.github.flyingpig525.base.item.type.NumItem

object StatisticalValues {
	/**
	 * *Gets a target's remaining*
	 * *health points.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 (dead) up*
	 * *to the target's maximum*
	 * *health (20.0 by default)*
	 *
	 * **Additional Info**
	 *
	 * *❤ = 2 Health*
	 */
	val CurrentHealth get() = GameValue<NumItem>("Current Health")

	/**
	 * *Gets a target's maximum*
	 * *health points.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Maximum*
	 * *health, 1.0 or above*
	 *
	 * **Additional Info**
	 *
	 * *❤ = 2 Health*
	 */
	val MaximumHealth get() = GameValue<NumItem>("Maximum Health")

	/**
	 * *Gets a target's*
	 * *absorption health*
	 * *(golden hearts).*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Absorption*
	 * *health*
	 *
	 * **Additional Info**
	 *
	 * *❤ = 2 Health*
	 */
	val AbsorptionHealth get() = GameValue<NumItem>("Absorption Health")

	/**
	 * *Gets a target's remaining*
	 * *food points.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0 (starving)*
	 * *to 20 (full bar)*
	 */
	val FoodLevel get() = GameValue<NumItem>("Food Level")

	/**
	 * *Gets a target's saturation level,*
	 * *which depends on the types*
	 * *of food consumed.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 (minimum), up to*
	 * *the player's food level*
	 *
	 * **Additional Info**
	 *
	 * *If saturation is > 0.0, the*
	 * *player's food level will not drop.*
	 */
	val FoodSaturation get() = GameValue<NumItem>("Food Saturation")

	/**
	 * *Gets a target's exhaustion*
	 * *level, which is increased*
	 * *by the player's actions.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 (minimum) to*
	 * *4.0 (reset point)*
	 *
	 * **Additional Info**
	 *
	 * *When exhaustion resets*
	 * *from 4.0 to 0.0, a player's*
	 * *saturation decreases by 1.*
	 */
	val FoodExhaustion get() = GameValue<NumItem>("Food Exhaustion")

	/**
	 * *Gets a target's attack damage,*
	 * *which has a base value that*
	 * *can be altered by items.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 or higher*
	 * *(more damage)*
	 *
	 * **Additional Info**
	 *
	 * *Default base value = 1.0*
	 */
	val AttackDamage get() = GameValue<NumItem>("Attack Damage")

	/**
	 * *Gets a target's attack speed,*
	 * *which has a base value that*
	 * *can be altered by items.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 or higher*
	 * *(faster)*
	 *
	 * **Additional Info**
	 *
	 * *Default base value = 4.0*
	 */
	val AttackSpeed get() = GameValue<NumItem>("Attack Speed")

	/**
	 * *Gets a target's current attack*
	 * *cooldown as a percentage of the*
	 * *way to fully charged*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 (fully uncharged)*
	 * *to 100.0 (fully charged)*
	 */
	val AttackCooldown get() = GameValue<NumItem>("Attack Cooldown")

	/**
	 * *Gets the number of ticks*
	 * *it will take to fully charge a*
	 * *target's attack cooldown after*
	 * *attacking with their held item.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 (instant)*
	 * *or above*
	 *
	 * **Additional Info**
	 *
	 * *This value is set to -1*
	 * *if it will never recharge.*
	 */
	val AttackCooldownTicks get() = GameValue<NumItem>("Attack Cooldown Ticks")

	/**
	 * *Gets a target's armor points,*
	 * *which has a base value that*
	 * *can be altered by items.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 (no armor)*
	 * *to 20.0 (full bar)*
	 *
	 * **Additional Info**
	 *
	 * *Default base value = 0.0*
	 */
	val ArmorPoints get() = GameValue<NumItem>("Armor Points")

	/**
	 * *Gets a target's armor toughness,*
	 * *which has a base value that*
	 * *can be altered by items.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 or above (full*
	 * *set of diamond armor = 8.0)*
	 *
	 * **Additional Info**
	 *
	 * *Armor Toughness increases *
	 * *the amount of damage required*
	 * *to penetrate one armor point.*
	 * *Default base value = 0.0*
	 */
	val ArmorToughness get() = GameValue<NumItem>("Armor Toughness")

	/**
	 * *Gets a target's remaining*
	 * *ticks of invulnerability.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0 (can be hurt)*
	 * *or above (invulnerable)*
	 *
	 * **Additional Info**
	 *
	 * *This value is set to 10*
	 * *upon taking damage.*
	 */
	val InvulnerabilityTicks get() = GameValue<NumItem>("Invulnerability Ticks")

	/**
	 * *Gets a target's experience*
	 * *level.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0 (no levels)*
	 * *or above*
	 */
	val ExperienceLevel get() = GameValue<NumItem>("Experience Level")

	/**
	 * *Gets a target's experience*
	 * *progress percentage to*
	 * *the next level.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0% (no progress)*
	 * *to 100.0% (next level)*
	 */
	val ExperienceProgress get() = GameValue<NumItem>("Experience Progress")

	/**
	 * *Gets the remaining ticks a*
	 * *target is on fire for.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0 (not on fire)*
	 * *or above (burning)*
	 */
	val FireTicks get() = GameValue<NumItem>("Fire Ticks")

	/**
	 * *Gets the remaining ticks a*
	 * *target is freezing for.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0 (not frozen)*
	 * *or above (freezing)*
	 */
	val FreezeTicks get() = GameValue<NumItem>("Freeze Ticks")

	/**
	 * *Gets a target's remaining*
	 * *air ticks.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0 (drowning)*
	 * *to 300 (maximum air)*
	 *
	 * **Additional Info**
	 *
	 * *One breath bubble is*
	 * *equal to 30 air ticks.*
	 */
	val RemainingAir get() = GameValue<NumItem>("Remaining Air")

	/**
	 * *Gets a target's distance fallen*
	 * *in blocks.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0.0 (not falling)*
	 * *or higher (falling down)*
	 *
	 * **Additional Info**
	 *
	 * *Resets to 0 upon landing.*
	 * *Works on the Damage Event.*
	 */
	val FallDistance get() = GameValue<NumItem>("Fall Distance")

	/**
	 * *Gets a target's selected*
	 * *hotbar slot index.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *1 (leftmost slot)*
	 * *to 9 (rightmost slot)*
	 */
	val HeldSlot get() = GameValue<NumItem>("Held Slot")

	/**
	 * *Gets the latency between*
	 * *a player and the server*
	 * *in milliseconds.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Player ping*
	 * *,,╻╻┃ 0 to 149*
	 * *,,╻╻┃ 150 to 299*
	 * *,,╻╻┃ 300 to 599*
	 * *,,╻╻┃ 600 to 999*
	 * *,,╻╻┃ over 1000*
	 */
	val Ping get() = GameValue<NumItem>("Ping")

	/**
	 * *While a player is steering*
	 * *an entity, gets the sideways*
	 * *movement of the steering.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *-1.0 (right)*
	 * *to 1.0 (left)*
	 */
	val SteerSidewaysMovement get() = GameValue<NumItem>("Steer Sideways Movement")

	/**
	 * *While a player is steering*
	 * *an entity, gets the forward*
	 * *movement of the steering.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *-1.0 (backward)*
	 * *to 1.0 (forward)*
	 */
	val SteerForwardMovement get() = GameValue<NumItem>("Steer Forward Movement")

	/**
	 * *Gets the progress percentage*
	 * *of a target using their held*
	 * *item, such as food.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0 (not using an item),*
	 * *or 0.0% (start) to 100.0%*
	 *
	 * **Additional Info**
	 *
	 * *Bows, crossbows and tridents*
	 * *remain at 100.0% until they*
	 * *are released.*
	 */
	val ItemUsageProgress get() = GameValue<NumItem>("Item Usage Progress")

	/**
	 * *Gets a target's flight*
	 * *speed as a percentage.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Flight speed*
	 * *percentage (0% to 1000%)*
	 */
	val FlightSpeed get() = GameValue<NumItem>("Flight Speed")

	/**
	 * *Gets a target's walk*
	 * *speed as a percentage.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Walk speed*
	 * *percentage (0% to 500%)*
	 */
	val WalkSpeed get() = GameValue<NumItem>("Walk Speed")

	/**
	 * *Gets the width of an entity's*
	 * *bounding box.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Width in blocks*
	 */
	val EntityWidth get() = GameValue<NumItem>("Entity Width")

	/**
	 * *Gets the height of an entity's*
	 * *bounding box.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Height in blocks*
	 */
	val EntityHeight get() = GameValue<NumItem>("Entity Height")

}