//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.packets](../index.md)/[PacketFactory](index.md)

# PacketFactory

[jvm]\
open class [PacketFactory](index.md)

Packet factory for different types of protocols

## Constructors

| | |
|---|---|
| [PacketFactory](-packet-factory.md) | [jvm]<br>constructor() |

## Functions

| Name | Summary |
|---|---|
| [getPacket](get-packet.md) | [jvm]<br>open fun [getPacket](get-packet.md)(ip: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), port: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), query: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), protocol: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)<br>Creates new client |
| [getPacketClass](get-packet-class.md) | [jvm]<br>open fun [getPacketClass](get-packet-class.md)(protocol: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;out [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)&gt;<br>Get packet class |