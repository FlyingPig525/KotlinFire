# KotlinFire
KotlinFire is a Kotlin library used to manipulate code templates from the Minecraft server [DiamondFire](https://mcdiamondfire.com).
This library features a clean syntax, making use of Kotlin's lambda functions, extension functions, and operator overloading.
dont use this it actually sucks

## Usage
**Currently, the only way to use KotlinFire is to clone this repository and make changes to the testing entrypoint, but will soon be
available on gradle and maven.**

To begin constructing a template, assign a variable the `Template` class. The `Template` class contains a lambda function 
argument with the type `Template.() -> Unit` meaning you can access `Template` members inside the function. The `Template`
class contains one variable for each code block in DiamondFire with its respective name. These variables' member functions
are what will be called in the lambda function. Each member function has another lambda function as an argument. Items
And variables go in this function.

```kotlin
val template = Template { 
    SetVar.set {
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
    SetVar.set {
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
    SetVar.set {
        +variable
        +(12.toNumItem())
    }
}
```
*Example code using a variable with the value of a `VarItem` to easily insert the same item in a code block*

Each method in a code block category has documentation parsed directly from the [CodeClient](https://github.com/DFOnline/CodeClient)
action dump.

You can also provide a name and type, function or process, to the `Template` constructor. These default to 
`"PutNameHere"` and `Type.FUNCTION`.

```kotlin
val template = Template(name = "Name", type = Template.Type.PROCESS) {
    val variable = "Very long and annoying to write name".toVarItem()
    SetVar.set {
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
    SetVar.set {
        +variable
        +(12.toNumItem())
    }
}
```
*Example code creating a player join event template*

### Utilities
Multiple utility functions exist, allowing the retrieval of encoded template strings and a function to interact with the
[CodeClient API](https://github.com/DFOnline/CodeClient/wiki/api). This function can be used to send individual or
multiple templates to the CodeClient API.

```kotlin
val template = Template(name = "Name", type = Template.Type.PROCESS) {
    val variable = "Very long and annoying to write name".toVarItem()
    SetVar.set {
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
    SetVar.set {
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
        SetVar.set {
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

### Contributors
- FlyingPig525
