//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.clients](../index.md)/[Client](index.md)/[setMotorRegister](set-motor-register.md)

# setMotorRegister

[jvm]\
open fun [setMotorRegister](set-motor-register.md)(motorName: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), registerName: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), value: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [Response](../../data/-response/index.md)

Set motor register value (for Dynamixel motors only)

#### Return

Response containing execution result.

#### Parameters

jvm

| | |
|---|---|
| motorName | Motor name (as configured on the configurator). |
| registerName | Register name. |
| value | Value to set. |