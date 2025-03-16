//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.clients](../index.md)/[ClientFactory](index.md)

# ClientFactory

[jvm]\
open class [ClientFactory](index.md)

Client factory for different types of protocols

## Constructors

| | |
|---|---|
| [ClientFactory](-client-factory.md) | [jvm]<br>constructor() |

## Functions

| Name | Summary |
|---|---|
| [getClient](get-client.md) | [jvm]<br>open fun [getClient](get-client.md)(ip: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), protocol: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [Client](../-client/index.md)<br>open fun [getClient](get-client.md)(ip: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), port: [Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html), protocol: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [Client](../-client/index.md)<br>Creates new client |
| [getClientClass](get-client-class.md) | [jvm]<br>open fun &lt;[T](get-client-class.md) : [Client](../-client/index.md)?&gt; [getClientClass](get-client-class.md)(protocol: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;out [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)&gt;<br>Get client class |