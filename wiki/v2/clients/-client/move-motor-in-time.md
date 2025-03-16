//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.clients](../index.md)/[Client](index.md)/[moveMotorInTime](move-motor-in-time.md)

# moveMotorInTime

[jvm]\
open fun [moveMotorInTime](move-motor-in-time.md)(motorName: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), position: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), duration: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html), units: [RotationUnits](../../data/-rotation-units/index.md)): [Response](../../data/-response/index.md)

Move motor to a certain position (relative to the motor's zero position) in fixed duration

#### Return

Response containing execution result.

#### Parameters

jvm

| | |
|---|---|
| motorName | Motor name (as configured on the configurator). |
| position | Motor final position (in units). |
| duration | Motor movement duration (in milliseconds). |
| units | Rotation units. |