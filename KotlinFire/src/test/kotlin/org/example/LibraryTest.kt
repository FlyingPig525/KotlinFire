/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.item.type.NumItem.Companion.toNumItem
import io.github.flyingpig525.base.item.type.StringItem.Companion.toStringItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.toTextItem
import io.github.flyingpig525.base.item.type.VarItem
import io.github.flyingpig525.base.item.type.VarItem.Companion.toVarItem
import kotlin.test.Test
import io.github.flyingpig525.base.item.type.VarItem.Scope.*

class LibraryTest {
    @Test fun someLibraryMethodReturnsTrue() {
        val playerMoney = "%uuid money".toVarItem(SAVE)
        val onJoin = Template(name = "onJoin") {
            IfVar.varExists({
                +"%uuid".toVarItem(SAVE)
            }) {}
            Else {
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
                +"Clicker".toStringItem()
            }
        }
        val onRightClick = Template(name = "onRightClick") {
            SetVariable.increment {
                +playerMoney
            }
            PlayerAction.sendMessage {
                +"Hello KotlinFire world!".toTextItem()
            }
        }
        Template.codeClientPlaceMultipleTemplates(listOf(onJoin, onRightClick))
    }
}
