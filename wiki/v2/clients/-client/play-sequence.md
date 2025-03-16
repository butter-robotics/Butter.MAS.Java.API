//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.clients](../index.md)/[Client](index.md)/[playSequence](play-sequence.md)

# playSequence

[jvm]\
open fun [playSequence](play-sequence.md)(animationSequence: [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;, lenient: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html), relative: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)): [Response](../../data/-response/index.md)

Play animation sequence on the robot

#### Return

Response containing execution result.

#### Parameters

jvm

| | |
|---|---|
| animationSequence | Animation sequence. |
| lenient | Wait for current playing animation (if present) to finish. |
| relative | Play animation relative to the current robot position. |