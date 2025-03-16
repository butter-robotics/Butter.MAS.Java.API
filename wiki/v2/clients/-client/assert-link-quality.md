//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.clients](../index.md)/[Client](index.md)/[assertLinkQuality](assert-link-quality.md)

# assertLinkQuality

[jvm]\
open fun [assertLinkQuality](assert-link-quality.md)(clientIp: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [Response](../../data/-response/index.md)

Validate robot connection and assert link quality This validation assets minimal lower bound link quality, and do not take worst case scenarios into account ICMP protocol is assumed to be supported and enabled on the machine network

#### Return

Response whether this machine is reachable within the defined link parameter

#### Parameters

jvm

| | |
|---|---|
| clientIp | this machine ip address |