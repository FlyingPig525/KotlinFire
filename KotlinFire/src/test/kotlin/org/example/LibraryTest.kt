/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import io.github.flyingpig525.base.Template.Type.*
import io.github.flyingpig525.base.TemplateCollection
import io.github.flyingpig525.base.block.PLAYEREVENT
import io.github.flyingpig525.base.item.type.MinecraftItem
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.textItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.toTextItem
import io.github.flyingpig525.base.item.type.VarItem.Companion.lineVar
import io.github.flyingpig525.base.item.type.VarItem.Companion.saveVar
import io.github.flyingpig525.base.item.type.VarItem.Scope.*
import io.github.flyingpig525.base.item.type.VarItem.Companion.toVarItem
import org.testng.annotations.Test

class LibraryTest {

//    @Test fun caveGenExample() {
//        TemplateCollection {
//            println(EventTemplate(PLAYEREVENT.Join) {
//                PlayerAction.teleport {
//                    +LocItem(0, 100, 0)
//                }
//                val currentLoc = "loc".toVarItem(LINE)
//                val noise = "noise".toVarItem(LINE)
//                Repeat.grid({
//                    +currentLoc
//                    +LocItem(0, LocItem.groundYLevel, 0)
//                    +LocItem(50, LocItem.groundYLevel + 50, 50)
//                }) {
//                    SetVariable.perlinNoise {
//                        +noise
//                        +currentLoc
//                    }
//                    IfVar.chain {
//                        val a = listOf("oak_wood", "dark_oak_wood", "birch_wood", "air", "air")
//                        for (i in 5 downTo 1) {
//                            greaterThan({
//                                +noise
//                                +((i.toFloat().div(7.5)).toNumItem())
//                            }) {
//                                GameAction.setBlock {
//                                    +MinecraftItem.mcItemOf("minecraft:${a[5 - i]}")
//                                    +currentLoc
//                                }
//                                Control.skip()
//                            }
//                        }
//
//                    }
//
//                }
//            }.getJsonData())
//            // Uncomment this when trying out this example
//             codeClientPlaceTemplates()
//
//        }
//    }

        @Test fun clickerExample() {
        TemplateCollection {
            val playerMoney = "%uuid money".toVarItem(SAVE)

            val actionBarLoop = Template(PROCESS, "actionBarLoop") {
                Repeat.forever {
                    PlayerAction.actionBar {
                        +"<green>Money: $playerMoney".toTextItem()
                    }
                    Control.wait {
                        +(1).numItem
                    }
                }
            }

            EventTemplate(PLAYEREVENT.Join) {
                IfVar.varExists(
                    {
                        +"%uuid".saveVar
                    },
                    true
                ) {
                    SetVariable.chain {
                        set {
                            +"%uuid".saveVar
                            +(1.numItem)
                        }
                        set {
                            +playerMoney
                            +(0.numItem)
                        }
                    }
                }
                SetVariable.setItemName {
                    +"item".lineVar
                    +MinecraftItem.mcItemOf("minecraft:redstone")
                    +"<gradient:#7f52ff:#e3455d>Clicker".toTextItem()
                }
                PlayerAction.giveItems {
                    +"item".lineVar
                }

                invokeTemplate(actionBarLoop)
            }

            EventTemplate(PLAYEREVENT.RightClick) {
                SetVariable.increment {
                    +playerMoney
                }
                PlayerAction.sendMessage {
                    +"<gradient:#7f52ff:#e3455d>$playerMoney".textItem
                }
            }
            // Uncomment this when trying out this example
            // codeClientPlaceTemplates()
        }
    }
//    @Test
//    fun helloWorldExample() {
//        TemplateCollection {
//            println(Json { prettyPrint = true }.encodeToString(EventTemplate(PLAYEREVENT.Join) {
//                PlayerAction.sendMessage {
//                    +"<gradient:#7f52ff:#e3455d>Hello KotlinFire World!".textItem
//                }
//            }.getJsonData()))
//      //       Uncomment this when trying out this example
//      //       codeClientPlaceTemplates()
//        }
//    }
}
