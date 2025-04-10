package org.example

import io.github.flyingpig525.base.Template.Type.*
import io.github.flyingpig525.base.TemplateCollection
import io.github.flyingpig525.base.block.PlayerEvent
import io.github.flyingpig525.base.item.type.LocItem
import io.github.flyingpig525.base.item.type.MinecraftItem
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.NumItem.Companion.toNumItem
import io.github.flyingpig525.base.item.type.ParameterItem
import io.github.flyingpig525.base.item.type.VarItem.Companion.lineVar
import io.github.flyingpig525.base.item.type.VarItem.Companion.saveVar
import io.github.flyingpig525.base.item.type.VarItem.Companion.toVarItem
import io.github.flyingpig525.base.item.type.VarItem.Scope.*
import kotlinx.serialization.json.Json
import org.testng.annotations.Test

class LibraryTest {

    @Test fun caveGenExample() {
        TemplateCollection {
            println(eventTemplate(PlayerEvent.Join) {
                PlayerAction.teleport {
                    +LocItem(0, 105, 0)
                }
                val currentLoc = "loc".toVarItem(LINE)
                val noise = "noise".toVarItem(LINE)
                Repeat.grid({
                    +currentLoc
                    +LocItem(0, 50, 0)
                    +LocItem(50, 100, 50)
                }) {
                    SetVariable.perlinNoise {
                        +noise
                        +currentLoc
                    }
                    with (IfVar) {
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
                                Control.skip {}
                            }
                        }

                    }

                }
            }.getJsonData())
//            // Uncomment this when trying out this example
//             codeClientPlaceTemplates()

        }
    }

    @Test fun clickerExample() {
        TemplateCollection {
            val playerMoney = "%uuid money".toVarItem(SAVE)

            val actionBarLoop = template(PROCESS, "actionBarLoop") {
                Repeat.forever({}) {
                    PlayerAction.actionBar {
                        +"<green>Money: $playerMoney"
                    }
                    Control.wait {
                        +(1).numItem
                    }
                }
            }

            eventTemplate(PlayerEvent.Join) {
                IfVar.varExists(
                    {
                        +"%uuid".saveVar
                    },
                    true
                ) {
                    with (SetVariable) {
                        equalTo {
                            +"%uuid".saveVar
                            +(1.numItem)
                        }
                        equalTo {
                            +playerMoney
                            +(0.numItem)
                        }
                    }
                }
                SetVariable.setItemName {
                    +"item".lineVar
                    +MinecraftItem.mcItemOf("minecraft:redstone")
                    +"<gradient:#7f52ff:#e3455d>Clicker"
                }
                PlayerAction.giveItems {
                    +"item".lineVar
                }

                invokeTemplate(actionBarLoop)
            }

            eventTemplate(PlayerEvent.RightClick) {
                SetVariable.increment {
                    +playerMoney
                }
                PlayerAction.sendMessage {
                    +"<gradient:#7f52ff:#e3455d>$playerMoney"
                }
            }
//             Uncomment this when trying out this example
//             codeClientPlaceTemplates()
        }
    }
//
    @Test
    fun helloWorldExample() {
        TemplateCollection {
            println(Json { prettyPrint = true }.encodeToString(eventTemplate(PlayerEvent.Join) {
                PlayerAction.sendMessage {
                    +"<gradient:#7f52ff:#e3455d>Hello KotlinFire World!"
                }
            }.getJsonData()))
//             Uncomment this when trying out this example
//             codeClientPlaceTemplates()
        }
    }
//     Example using function parameters
    @Test
    fun functionParameterExample() {
        TemplateCollection {
            template(FUNCTION, "parameters", ParameterItem.num("number").parameter(), ParameterItem.txt("text").parameter()) {
                val number = ParameterItem.num("number").variable()
                val text =  ParameterItem.txt("text").variable()
                Repeat.multiple({
                    +number
                }) {
                    PlayerAction.sendMessage {
                        +text
                    }
                }
            }

            eventTemplate(PlayerEvent.Join) {
                callFunction("parameters") {
                    +(4.numItem)
                    +"heeee"
                }
            }

//             Uncomment this when trying out this example
            // codeClientPlaceTemplates()
        }
    }
}