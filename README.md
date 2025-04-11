# KotlinFire
KotlinFire is a Kotlin library used to manipulate code templates from the Minecraft server [DiamondFire](https://mcdiamondfire.com).
This library features a clean syntax, making use of Kotlin's lambda functions, extension functions, and operator overloading.

**Now with automatic tag insertion!**

## Dependency
KotlinFire can be added to your project through Maven Central in whichever build system you use.

Gradle Kotlin DSL
```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.flyingpig525:kotlinfire:1.4.0")
}
```

KotlinFire requires java >=17 and kotlin >=2.1.10 be used.

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

#### New, 1.2.0!
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
There are now classes given extension functions under the scope of a template. There are only a few of these classes,
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

A wrapper class, `TemplateCollection`, is also provided to make sending a large amount of templates easier.

```kotlin
TemplateCollection {
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

    codeClientPlaceTemplates()
}
```


### More Examples
More fleshed-out examples can be found in the LibraryTest.kt file in [`KotlinFire/src/test/kotlin/org/example/LibraryTest.kt`](https://github.com/FlyingPig525/KotlinFire/blob/master/KotlinFire/src/test/kotlin/org/example/LibraryTest.kt)

### Contributors
- FlyingPig525
