/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import io.github.flyingpig525.base.TemplateCollection
import io.github.flyingpig525.base.block.PLAYEREVENT
import io.github.flyingpig525.base.item.type.MinecraftItem.Companion.toMinecraftItem
import io.github.flyingpig525.base.item.type.NumItem.Companion.toNumItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.toTextItem
import io.github.flyingpig525.base.item.type.VarItem.Companion.toVarItem
import kotlin.test.Test
import io.github.flyingpig525.base.item.type.VarItem.Scope.*
class LibraryTest {
    @Test fun someLibraryMethodReturnsTrue() {
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
            val onRightClick = Template(name = "onRightClick") {
                SetVariable.increment {
                    +playerMoney
                }
                PlayerAction.sendMessage {
                    +"""<gradient:#7f52ff:#e3455d>Hello KotlinFire world!""".toTextItem()
                }
            }
            val rc = EventTemplate(PLAYEREVENT.RightClick) {
                callFunction(onRightClick)
            }
            codeClientPlaceTemplates()
        }
    }
}
