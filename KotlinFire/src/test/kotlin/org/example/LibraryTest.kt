/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import io.github.flyingpig525.base.EventTemplate
import io.github.flyingpig525.base.TemplateCollection
import io.github.flyingpig525.base.block.PLAYEREVENT
import io.github.flyingpig525.base.item.type.LocItem
import io.github.flyingpig525.base.item.type.MinecraftItem
import io.github.flyingpig525.base.item.type.MinecraftItem.Companion.toMinecraftItem
import io.github.flyingpig525.base.item.type.NumItem.Companion.toNumItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.toTextItem
import io.github.flyingpig525.base.item.type.VarItem.Companion.toVarItem
import kotlin.test.Test
import io.github.flyingpig525.base.item.type.VarItem.Scope.*
class LibraryTest {
    @Test fun caveGen() {
        TemplateCollection {
            println(EventTemplate(PLAYEREVENT.Join) {
                PlayerAction.teleport {
                    +LocItem(0, 100, 0)
                }
                val currentLoc = "loc".toVarItem(LINE)
                val noise = "noise".toVarItem(LINE)
                Repeat.grid({
                    +currentLoc
                    +LocItem(0, LocItem.groundYLevel, 0)
                    +LocItem(50, LocItem.groundYLevel + 50, 50)
                }) {
                    SetVariable.perlinNoise {
                        +noise
                        +currentLoc
                    }
                    IfVar.chain {
                        val a = listOf("oak_wood", "dark_oak_wood", "birch_wood", "air", "air")
                        for (i in 5 downTo 1) {
                            greaterThan({
                                +noise
                                +((i.toFloat().div(7.5)).toNumItem())
                            }) {
                                GameAction.setBlock {
                                    +MinecraftItem.mcItemOf("minecraft:${a[5 - i]}")
                                    +currentLoc
                                }
                                Control.skip()
                            }
                        }

                    }

                }
            }.getTemplateString())
            codeClientPlaceTemplates()
        }
    }

    @Test fun helloWorldExample() {
        TemplateCollection {
            val playerMoney = "%uuid money".toVarItem(SAVE)
            val onJoin = EventTemplate(PLAYEREVENT.Join) {
                IfVar.varExists(
                    {
                        +"%uuid".toVarItem(SAVE)
                    },
                    true
                ) {
                    SetVariable.chain {
                        set {
                            +"%uuid".toVarItem(SAVE)
                            +(1.toNumItem())
                        }
                        set {
                            +playerMoney
                            +(0.toNumItem())
                        }
                    }
                }
                PlayerAction.giveItems {
                    +"""{Count:1b,id:"minecraft:redstone",tag:{display:{Name:'{"italic":false,"extra":[{"color":"green","text":"clicker"}],"text":""}'}}}""".toMinecraftItem()
                }
            }
            val onRightClick = EventTemplate(PLAYEREVENT.RightClick) {
                SetVariable.increment {
                    +playerMoney
                }
                PlayerAction.sendMessage {
                    +"""<gradient:#7f52ff:#e3455d>Hello KotlinFire world!""".toTextItem()
                    +"""<gradient:#7f52ff:#e3455d>$playerMoney""".toTextItem()
                }
            }
            codeClientPlaceTemplates()
        }
    }
}
