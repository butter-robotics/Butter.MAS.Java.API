//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.clients](../index.md)/[Client](index.md)/[moveMotorToPosition](move-motor-to-position.md)

# moveMotorToPosition

[jvm]\
open fun [moveMotorToPosition](move-motor-to-position.md)(motorName: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), position: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), velocity: [Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html), acceleration: [Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html), units: [RotationUnits](../../data/-rotation-units/index.md)): [Response](../../data/-response/index.md)

Move motor to a certain position (relative to the motor's zero position)

#### Return

Response containing execution result.

#### Parameters

jvm

| | |
|---|---|
| motorName | Motor name (as configured on the configurator). |
| position | Motor final position (in units). |
| velocity | Motor movement speed (in units / sec). |
| acceleration | Motor maximal acceleration (in units / sec^2). |
| units | Rotation units. |