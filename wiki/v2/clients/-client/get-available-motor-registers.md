//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.clients](../index.md)/[Client](index.md)/[getAvailableMotorRegisters](get-available-motor-registers.md)

# getAvailableMotorRegisters

[jvm]\
open fun [getAvailableMotorRegisters](get-available-motor-registers.md)(motorName: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), readableOnly: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)): [Response](../../data/-response/index.md)

Get all available motor registers (for Dynamixel motors only)

#### Return

Response containing all the available motor registers.

#### Parameters

jvm

| | |
|---|---|
| motorName | Motor name (as configured on the configurator). |
| readableOnly | Get readable registers only if true. |