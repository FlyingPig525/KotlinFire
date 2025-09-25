# KotlinFire
KotlinFire is a Kotlin library used to manipulate code templates from the Minecraft server [DiamondFire](https://mcdiamondfire.com).
This library features a clean syntax, making use of Kotlin's lambda functions, extension functions, and operator overloading.

It is encouraged to read this entire README before using this library, as it is the only "tutorial" on its usage.

## Dependency
KotlinFire can be added to your project through Maven Central in whichever build system you use.

Gradle Kotlin DSL
```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.flyingpig525:kotlinfire:1.6.4")
}
```

KotlinFire requires java >= 17 and kotlin >= 2.2.20 be used.

## Usage

To begin constructing a template, assign a variable the `Template` class. The `Template` class contains a lambda function 
argument with the type `Template.() -> Unit` meaning you can access `Template` members inside the function. The `Template`
class contains one variable for each code block in DiamondFire with its respective name. These variables' member functions
are what will be called in the lambda function. Each member function has another lambda function as an argument. Items
And variables go in this function.

```kotlin
val template = Template { 
    SetVar.equalTo {
        // Items go here
    }
}
```
*Example code creating an empty `Set Variable>equal` code block*

To put an item in a code block, use the unaryPlus operator in the lambda. This library provides a few classes for select
item types, which can be accessed directly through their constructors or through extension functions on Kotlin primitive
types (e.g. `String.toTextItem()`)

```kotlin
val template = Template { 
    SetVar.equalTo {
        +"Variable name".toVarItem()
        +"Variable value".toTextItem()
    }
}
```
*Example code setting a variable with the name `Variable name` and `Game` scope to the text value `Variable value`*

Items can also be assigned to variables for ease of use.

```kotlin
val template = Template {
    val variable = "Very long and annoying to write name".toVarItem()
    SetVar.equalTo {
        +variable
        +(12.toNumItem())
    }
}
```
*Example code using a variable with the value of a `VarItem` to easily insert the same item in a code block*

Each method in a code block category has documentation parsed directly from the df
action dump.

You can also provide a name and type, function or process, to the `Template` constructor. These default to 
`"PutNameHere"` and `Type.FUNCTION`.

```kotlin
val template = Template(name = "Name", type = Template.Type.PROCESS) {
    val variable = "Very long and annoying to write name".toVarItem()
    SetVar.equalTo {
        +variable
        +(12.toNumItem())
    }
}
```
*Example code providing a template name ("Name") and type (process)*

Event templates can be created using the `EventTemplate` class, using the same conventions as the `Template` class.
`EventTemplate` requires the type of event to be passed as a parameter, these types can be accessed in the `PLAYEREVENT`
and `ENTITYEVENT` enums.

```kotlin
val template = EventTemplate(PLAYEREVENT.Join) {
    val variable = "Very long and annoying to write name".toVarItem()
    SetVar.equalTo {
        +variable
        +(12.toNumItem())
    }
}
```
*Example code creating a player join event template*

### New, 1.2.0!
Templates can now have parameters, permitting the use of the `ParameterItem`.

`ParameterItem` can be better constructed using its builder functions.

```kotlin
// Template with a required, non-plural parameter
Template("required", ParameterItem.num("param name").parameter()) {
    val numberParam = ParameterItem.num("param name").variable()
    // alternative:
    // val numberParam = "param name".lineVar
    PlayerAction.sendMessage {
        +numberParam
    }
}
// Template with an optional parameter
Template("optional", ParameterItem.num("name").default((43).numItem).parameter()) {
    val numberParam = ParameterItem.num("name").variable()
    // alternative:
    // val numberParam = "name".lineVar
    PlayerAction.sendMessage {
        +numberParam
    }
    
    // Invoking a template with parameters is the same as adding a codeblock
    callFunction("required") {
        +(41).numItem
    }
}
```

### New, 1.3.0!
Code blocks requiring sub actions can now be used, as a result of recreating the file generation for code blocks

```kotlin
EventTemplate(PlayerEvent.Join) {
    SetVar.equalTo {
        +"%default ticks on ground".gameVar
    }
    // IsGrounded requires no parameters
    Repeat.whileLoop({}, IfPlayerSubAction.IsGrounded) {
        SetVar.increment {
            +"%default ticks on ground".gameVar
        }
        Control.wait {
            // redundant number
            +(1.numItem)
        }
    }
}
```

### New, 1.4.0!
There are now classes given extension functions under the scope of a template. There are only a few of these classes at the time of writing this,
being: TextVariable, NumVariable, and VecVariable. These are the only ones I thought of useful functions for at the time
of writing this.

```kotlin
Template {
    val numVar = NumVariable("number variable", VarItem.Scope.Game)
    numVar++ // adds an increment
    numVar += 43 // adds an increment with 43 as a parameter
    numVar += "12" // adds an increment with a NumItem with the value "12" as a parameter
    numVar -= 2 // adds a decrement with 2 as a parameter
    numVar-- // adds a decrement
    numVar.set(5.numItem) // sets the variable "number variable" to 5
}
```

### New, 1.4.1!
While this does add a pretty large amount of functionality, I feel like it is just missing content that should have been
in 1.4.0, so this is just marked as a patch.

The above classes can now be compared using the new item comparison infix functions, allowing for a clean comparing
experience. `ifVar` can be called while in the scope of a `Template`, which takes a new class, `ItemComparison`,
as an argument. This class can be constructed through the functions provided on `VarClass` extending classes, such as
`NumVariable`. This function returns a class that contains an `Else` function (capitalized to avoid clashes with
builtin operators), which, quite obviously, allows you to add an else block to the comparison. Every comparison block
also now returns an `ElseOperation` to allow easy else addition. Replacing the old `Else` function that was a member of
`Template`, which could be called at any time.

```kotlin
Template {
    val numVar = NumVariable("numvar", VarItem.Scope.Game)
    ifVal(numVar equalTo 4.numItem) {
        // do something
    } Else {
        // do another thing
    }
    val locVar = LocVariable("loc", VarItem.Scope.Game)
    ifVal(locVar isNear locOf(14, 52, 23.5)) {
        // do something
    } // Else is not required
}
```

Every `VarClass` extender has an `equalTo` and `exists` (not infix) function, but some do not have other comparison
functions.

### New, 1.5.0!
Game value generation has been implemented in the [Generation module](https://github.com/FlyingPig525/KotlinFire/blob/master/Generation),
meaning the format has changed. Game values can now be accessed in their respective category objects: `EventValues`,
`InformationalValues`, `ItemValues`, `LocationalValues`, `PlotValues`, and `StatisticalValues`.

Each of the variables in these objects will create a new `GameValue` instance when accessed, and target can be changed
by calling the `GameValue#target(GameValue.Target)` method.

```kotlin
Template {
    val num = NumVariable("added latency", VarItem.Scope.Line)
    // Redundant setting of target, `Default` is the default
    num set 41.numItem
    num += StatisticalValues.Ping.target(GameValue.Target.Default)
}
```

More type-safety has also been added to `VarClass` extending classes.

### New, 1.6.0!
Specific classes now have the ability to be "serialized" into DiamondFire dictionaries. This can be done through
extending `DiamondFireClass` and delegating properties through the `DiamondFireClass#numProp` and
`DiamondFireClass#textProp` members (more will be added). More information on usage is found in the example code.

This feature is considered experimental and requires an `OptIn` annotation to be used.

```kotlin
Template {
    val pastVar = NumVariable("past variable", VarItem.Scope.LINE)
    pastVar set 0.numItem
    val klass = Serialized(pastVar, "serialized class")
    // must initialize variable (creates 3 codeblocks)
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

@OptIn(DiamondFireClassOptIn::class)
// scope can be universal between all `Serialized` instances, or defined individually
class Serialized(default: NumVariable, name: String, scope: VarItem.Scope = VarItem.Scope.GAME) : DiamondFireClass(name, scope) {
    // a default value must be provided
    var mutableNumber by numProp(0)
    // immutability is only enforced via the dsl, meaning an immutable property can be set though codeblocks without
    // any errors (as there is no sensible way to detect if that is occurring)
    val immutableTextProperty by textProp("str")
    // properties can also be initialized through `VarClass` inheritors
    var dynamicDefault by numProp(default)
}
```

### New, 1.6.2!
A new type has been added: `DictionaryVariable`!

This type has two comparison functions, `containsKey` and `valueEquals`. `containsKey` takes a key parameter and checks
whether the dictionary has a entry with that value as the key. `valueEquals` takes a key parameter and a list of values
and checks if the value of the key is equal to any of the values in the passed list.

`DictionaryVariable` also has the `get` and `set` operator functions defined when in a `Template`, and can be used to
get and set values in the dictionary. It also has a `getAsVariable` function, which must be used when the value type is
not a number, text, or string. It also inserts a codeblock to create a temporary variable with the value found at the
key.

```kotlin
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
```

### New, 1.6.4!
A new type has been added: `ListVariable`!

List `DictionaryVariable`, `ListVariable` is used to define DiamondFire list variables, and has a multitude of methods
to interact with the underlying item in an easy way. Every code block in the `SetVariable` category containing the word
"list" has been implemented as a member of `ListVariable` (they are actually extension functions defined in the
`Template` class)

```kotlin
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
```

### Utilities
Multiple utility functions exist, allowing the retrieval of encoded template strings and a function to interact with the
[CodeClient API](https://github.com/DFOnline/CodeClient/wiki/api). This function can be used to send individual or
multiple templates to the CodeClient API.

```kotlin
val template = Template(name = "Name", type = Template.Type.PROCESS) {
    val variable = "Very long and annoying to write name".toVarItem()
    SetVar.equalTo {
        +variable
        +(12.toNumItem())
    }
}

Template.codeClientPlaceTemplate(template)
```
*Example code sending the above constructed template to the CodeClient API*
```kotlin
val template = Template(name = "Name", type = Template.Type.PROCESS) {
    val variable = "Very long and annoying to write name".toVarItem()
    SetVar.equalTo {
        +variable
        +(12.toNumItem())
    }
}
val template2 = Template {
    PlayerAction.sendMessage {
        +"Hello, world!".toTextItem()
    }
}

Template.codeClientPlaceMultipleTemplates(template, template2)
```
*Example code sending multiple templates to the CodeClient API*

A wrapper class, `TemplateCollection`, is also provided to make sending a large amount of templates easier. When using
`TemplateCollection`, ensure you use the provided functions for template collection `template` and `eventTemplate` instead
of the class constructors.

```kotlin
TemplateCollection {
    val template = template(name = "Name", type = Template.Type.PROCESS) {
        val variable = "Very long and annoying to write name".toVarItem()
        SetVar.equalTo {
            +variable
            +(12.toNumItem())
        }
    }
    val template2 = template {
        PlayerAction.sendMessage {
            +"Hello, world!".toTextItem()
        }
    }

    codeClientPlaceTemplates()
}
```


### More Examples
More fleshed-out examples can be found in the LibraryTest.kt file in [`KotlinFire/src/test/kotlin/org/example/LibraryTest.kt`](https://github.com/FlyingPig525/KotlinFire/blob/master/KotlinFire/src/test/kotlin/org/example/LibraryTest.kt)
