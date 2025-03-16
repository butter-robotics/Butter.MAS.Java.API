//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.clients](../index.md)/[Client](index.md)/[getMotorRegisterRange](get-motor-register-range.md)

# getMotorRegisterRange

[jvm]\
open fun [getMotorRegisterRange](get-motor-register-range.md)(motorName: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), registerName: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [Response](../../data/-response/index.md)

Get motor register value range (for Dynamixel motors only)

#### Return

Response containing register range value.

#### Parameters

jvm

| | |
|---|---|
| motorName | Motor name (as configured on the configurator). |
| registerName | Register name. |