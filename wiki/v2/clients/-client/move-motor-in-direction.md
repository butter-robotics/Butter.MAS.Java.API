//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.clients](../index.md)/[Client](index.md)/[moveMotorInDirection](move-motor-in-direction.md)

# moveMotorInDirection

[jvm]\
open fun [moveMotorInDirection](move-motor-in-direction.md)(motorName: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), direction: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), velocity: [Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html), units: [RotationUnits](../../data/-rotation-units/index.md)): [Response](../../data/-response/index.md)

Move motor to a certain direction (relative to the motor's current position)

#### Return

Response containing execution result.

#### Parameters

jvm

| | |
|---|---|
| motorName | Motor name (as configured on the configurator). |
| direction | Motor movement direction (left, right, stop). |
| velocity | Motor movement speed (in units / sec). |
| units | Rotation units. |