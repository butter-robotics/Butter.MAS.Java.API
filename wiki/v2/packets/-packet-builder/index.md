//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.packets](../index.md)/[PacketBuilder](index.md)

# PacketBuilder

[jvm]\
open class [PacketBuilder](index.md)

Builds a command packet using the builder design pattern

## Constructors

| | |
|---|---|
| [PacketBuilder](-packet-builder.md) | [jvm]<br>constructor(ip: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), port: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), target: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), protocol: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))<br>Creates an instance of PacketBuilder. |

## Properties

| Name | Summary |
|---|---|
| [ANY_TARGET](-a-n-y_-t-a-r-g-e-t.md) | [jvm]<br>open var [ANY_TARGET](-a-n-y_-t-a-r-g-e-t.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

## Functions

| Name | Summary |
|---|---|
| [addArgument](add-argument.md) | [jvm]<br>open fun [addArgument](add-argument.md)(argument: [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)): [PacketBuilder](index.md)<br>Add argument |
| [addArguments](add-arguments.md) | [jvm]<br>open fun [addArguments](add-arguments.md)(arguments: [Array](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-array/index.html)&lt;[Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)&gt;): [PacketBuilder](index.md)<br>Add arguments |
| [addCommand](add-command.md) | [jvm]<br>open fun [addCommand](add-command.md)(command: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [PacketBuilder](index.md)<br>Add command |
| [addKeyValuePair](add-key-value-pair.md) | [jvm]<br>open fun [addKeyValuePair](add-key-value-pair.md)(key: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), value: [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)): [PacketBuilder](index.md)<br>Add key value pair |
| [addParameter](add-parameter.md) | [jvm]<br>open fun [addParameter](add-parameter.md)(parameter: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [PacketBuilder](index.md)<br>Add parameter |
| [addParameters](add-parameters.md) | [jvm]<br>open fun [addParameters](add-parameters.md)(parameters: [Array](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-array/index.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;): [PacketBuilder](index.md)<br>Add parameters |
| [build](build.md) | [jvm]<br>open fun [build](build.md)(): [Packet](../-packet/index.md)<br>Builds the packet |