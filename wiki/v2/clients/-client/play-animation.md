//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.clients](../index.md)/[Client](index.md)/[playAnimation](play-animation.md)

# playAnimation

[jvm]\
open fun [playAnimation](play-animation.md)(animationName: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), lenient: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html), relative: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)): [Response](../../data/-response/index.md)

Play animation on the robot

#### Return

Response containing execution result.

#### Parameters

jvm

| | |
|---|---|
| animationName | Animation name. |
| lenient | Wait for current playing animation (if present) to finish. |
| relative | Play animation relative to the current robot position. |