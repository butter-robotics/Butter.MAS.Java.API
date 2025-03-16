//[Butter.MAS.JavaAPI](../../../index.md)/[com.butter.mas.clients](../index.md)/[Client](index.md)/[observeAnimation](observe-animation.md)

# observeAnimation

[jvm]\
open fun [observeAnimation](observe-animation.md)(animationName: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [Response](../../data/-response/index.md)

Observe animation status ['ANIMATING', 'QUEUED', 'STOPPED', 'PAUSED', 'IDLE']

#### Return

Response containing execution result.

#### Parameters

jvm

| | |
|---|---|
| animationName | Animation name (if none provided, will check global status). |