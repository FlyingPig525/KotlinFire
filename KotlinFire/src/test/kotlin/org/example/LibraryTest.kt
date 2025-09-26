package org.example

import io.github.flyingpig525.base.Template
import io.github.flyingpig525.base.Template.Type.FUNCTION
import io.github.flyingpig525.base.Template.Type.PROCESS
import io.github.flyingpig525.base.TemplateCollection
import io.github.flyingpig525.base.block.PlayerEvent
import io.github.flyingpig525.base.item.type.*
import io.github.flyingpig525.base.item.type.NumItem.Companion.numItem
import io.github.flyingpig525.base.item.type.NumItem.Companion.toNumItem
import io.github.flyingpig525.base.item.type.TextItem.Companion.textItem
import io.github.flyingpig525.base.item.type.VarItem.Companion.lineVar
import io.github.flyingpig525.base.item.type.VarItem.Companion.saveVar
import io.github.flyingpig525.base.item.type.VarItem.Companion.toVarItem
import io.github.flyingpig525.base.item.type.VarItem.Scope.*
import io.github.flyingpig525.base.item.type.gamevalue.InformationalValues
import io.github.flyingpig525.base.item.type.gamevalue.LocationalValues
import io.github.flyingpig525.base.item.type.tag.PlayerActionTags
import io.github.flyingpig525.serialization.DiamondFireClass
import io.github.flyingpig525.serialization.DiamondFireClassOptIn
import kotlinx.serialization.json.Json
import kotlin.test.Test

class LibraryTest {
    val json = Json { prettyPrint = true }

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

    @Test
    fun itemComparisonExample() {
        TemplateCollection {
            val v = NumVariable("variable", GAME)
            val example = template(type = Template.Type.FUNCTION, name = "example") {
                Repeat.forever({}) {
                    ifVal(v equalTo 12.numItem) {
                        PlayerAction.sendMessage {
                            +"wow it equals :O"
                        }
                        Control.stopRepeat {  }
                    } Else {
                        PlayerAction.sendMessage {
                            +"nope :("
                        }
                    }
                    Control.wait {  }
                }
            }
            val proc = template(PROCESS, "proc") {
                Control.wait {
                    +(16.numItem)
                }
                v set 12.numItem
            }
            val join = eventTemplate(PlayerEvent.Join) {
                proc(this)
                example(this)
            }
            println(getStrings())
        }
    }
    @OptIn(DiamondFireClassOptIn::class)
    @Test
    // taken from README.md
    fun serializedTest() {
        val t = Template {
            val pastVar = NumVariable("past variable", VarItem.Scope.LINE)
            pastVar set 0.numItem
            val klass = Serialized(pastVar, "serialized class")
            klass.init()
            // setting mutable properties will create a `SetVariable#setDictValue` codeblock
            // they also must be using `Item` inheritors or `VarClass` inheritors
            klass.mutableNumber = 12.numItem
            PlayerAction.sendMessage {
                // will be transformed into a TextItem("%entry(serialized class,immutableTextProperty)")
                // should send the player "str"
                +klass.immutableTextProperty
                // should send the player "0"
                +klass.dynamicDefault
            }
        }
//        Template.codeClientPlaceTemplate(t)
    }

    @Test
    fun dictionaryTest() {
        Template {
            val dict = DictionaryVariable("%default data", VarItem.Scope.SAVE)
            ifVal(dict containsKey "hasJoined") {
                dict["firstJoin"] = 0
            } Else {
                dict["firstJoin"] = 1
                dict["hasJoined"] = 1
            }
            dict["initialLocation"] = LocationalValues.Location

            // later
            // if the value at key "firstJoin" equal 1, teleport the player to their initialLocation
            ifVal(dict.valueEquals("firstJoin", 1.numItem)) {
                // not a number, text, or string, so the value must be read as a VarItem
                val initialLocation = dict.getAsVariable("initialLocation", VarItem.Scope.LINE)
                PlayerAction.teleport {
                    +initialLocation
                }
            }
        }
    }

    @Test
    fun listTest() {
        Template {
            // the ListVariable constructor is internal, so you must use `emptyListVar` or `listVarOf`
            val list = emptyListVar("listName", VarItem.Scope.GAME)

            // setting indices
            list[0] = 52.numItem
            // appending values
            list += InformationalValues.Name
            // overwriting a value
            list[1] = vecOf(2, 51, 921)
            // removing duplicates
            list += 52.numItem

            list.dedup()
            // getting values
            PlayerAction.sendMessage {
                // gets return a string, which can be transformed into a num, text, or string
                // here, it is getting appended to another string and transformed into a text
                +("The 0th index in the list is " + list[0]).textItem
                // if the value might not be a num, text, or string, use `getAsVariable`
                +("Its not a num, text, or string! ")
                +list.getAsVariable(1)
            }

            // performing an operation and saving the result to another variable
            val newList = emptyListVar("newList", VarItem.Scope.LINE)
            // newList is passed to the `out` parameter
            list.reverse(newList)

            // ListVariable also has comparisons
            ifVal(!(list contains "random text")) {
                PlayerAction.sendMessage {
                    +"The list does not contain a text item with the content \"random text\"".textItem
                }
            }
        }
    }

    @Test
    fun tagTest() {
        val t = Template {
            PlayerAction.sendMessage {
                +"Hello World!".textItem

                +PlayerActionTags.SendMessage.AlignmentMode.Centered
            }
        }
        println(Json { prettyPrint = true }.encodeToString(t.getJsonData()))
        println(t.getTemplateString())
        Template.codeClientPlaceTemplate(t)
    }
}
@OptIn(DiamondFireClassOptIn::class)
// scope can be universal between all `Serialized` instances, or defined individually
class Serialized(default: NumVariable, name: String, scope: VarItem.Scope = VarItem.Scope.GAME) : DiamondFireClass(name, scope) {
    // a default value must be provided
    var mutableNumber by numProp(0)
    // immutability is also only enforced via the dsl, meaning an immutable property can be set though codeblocks, without
    // any errors
    val immutableTextProperty by textProp("str")
    // properties can also be initialized through `VarClass` inheritors
    var dynamicDefault by numProp(default)
}