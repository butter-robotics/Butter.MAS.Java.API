//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.packets](../index.md)/[Packet](index.md)

# Packet

abstract class [Packet](index.md)

Represents an abstract data packet

#### Inheritors

| |
|---|
| [PacketHttp](../-packet-http/index.md) |
| [PacketTcp](../-packet-tcp/index.md) |
| [PacketUdp](../-packet-udp/index.md) |

## Constructors

| | |
|---|---|
| [Packet](-packet.md) | [jvm]<br>constructor(ip: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), port: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), query: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))<br>Creates an instance of Packet. |

## Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | [jvm]<br>open fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)<br>Compares this packet to another packet |
| [hashCode](hash-code.md) | [jvm]<br>open fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |
| [send](send.md) | [jvm]<br>abstract fun [send](send.md)(timeout: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)): [Response](../../data/-response/index.md)<br>Send packet abstract method |