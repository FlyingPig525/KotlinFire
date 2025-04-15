package io.github.flyingpig525.base.item.type.gamevalue

import io.github.flyingpig525.base.item.*
import io.github.flyingpig525.base.item.type.*

object PlotValues {
	/**
	 * *Gets the amount of players*
	 * *playing on the plot.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Player count*
	 */
	val PlayerCount get() = GameValue<NumItem>("Player Count")

	/**
	 * *Gets the percentage of the*
	 * *plot's CPU being used this*
	 * *instant.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Usage as a percentage.*
	 * *Can go above 100%.*
	 */
	val CPUUsage get() = GameValue<NumItem>("CPU Usage")

	/**
	 * *Gets the amount of game Ticks*
	 * *Per Second the server is*
	 * *currently able to handle.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *20.0 (no server*
	 * *lag) or below (decreases*
	 * *with more lag)*
	 */
	val ServerTPS get() = GameValue<NumItem>("Server TPS")

	/**
	 * *Gets the current time as*
	 * *one number in seconds.*
	 * *E.g.: 1418840496.5 means*
	 * *Dec 17, 2014, 18:21:36.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Current time*
	 *
	 * **Additional Info**
	 *
	 * *The number represents*
	 * *the total seconds passed*
	 * *since 1970 (Unix Time).*
	 */
	val Timestamp get() = GameValue<NumItem>("Timestamp")

	/**
	 * *Gets the amount of targets*
	 * *in the selection.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *0 (no targets)*
	 * *or above*
	 */
	val SelectionSize get() = GameValue<NumItem>("Selection Size")

	/**
	 * *Gets the name of each target*
	 * *in the selection.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one String*
	 * *entry (name) for each*
	 * *target*
	 */
	val SelectionTargetNames get() = GameValue<VarItem>("Selection Target Names")

	/**
	 * *Gets the UUID of each target*
	 * *in the selection.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one String*
	 * *entry (UUID) for each*
	 * *target*
	 */
	val SelectionTargetUUIDs get() = GameValue<VarItem>("Selection Target UUIDs")

	/**
	 * *Gets the id of the plot as text.*
	 *
	 * **Type:** [StringItem]
	 *
	 * *Plot ID*
	 */
	val PlotID get() = GameValue<StringItem>("Plot ID")

	/**
	 * *Gets the size of the plot.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Plot size in blocks*
	 *
	 * **Additional Info**
	 *
	 * *A basic plot will return 51.*
	 * *A large plot will return 101.*
	 * *A massive plot will return 301.*
	 * *A mega plot will return 1001*
	 */
	val PlotSize get() = GameValue<NumItem>("Plot Size")

	/**
	 * *Gets the number of microseconds*
	 * *elapsed since the first player*
	 * *joined the plot. The decimal*
	 * *part represents nanoseconds.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Microseconds*
	 */
	val MicrosecondsSinceStartup get() = GameValue<NumItem>("Microseconds Since Startup")

	/**
	 * *Gets the number of block transactions a plot is executing.*
	 *
	 * **Type:** [NumItem]
	 *
	 * *Active Block Transactions*
	 */
	val ActiveBlockTransactions get() = GameValue<NumItem>("Active Block Transactions")

	/**
	 * *Gets the name of each player*
	 * *on the plot.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one String*
	 * *entry (name) for each*
	 * *player*
	 */
	val PlotPlayerNames get() = GameValue<VarItem>("Plot Player Names")

	/**
	 * *Gets the UUID of each player*
	 * *on the plot.*
	 *
	 * **Type:** [VarItem]
	 *
	 * *Contains one String*
	 * *entry (UUID) for each*
	 * *player*
	 */
	val PlotPlayerUUIDs get() = GameValue<VarItem>("Plot Player UUIDs")

}