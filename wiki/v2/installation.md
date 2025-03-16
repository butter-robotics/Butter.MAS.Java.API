# Installation

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Prerequisites

You will need to install JDK17+ in order to use this software

## Installation

Add the following dependency to your Gradle configuration and reload gradle:
```gradle
dependencies {
    implementation group: 'com.butter.mas', name: 'mas-api', version: '${api_version}'          // 2.5.0
    implementation group: 'com.google.code.gson', name: 'gson', version: '${gson_version_2}'    // 2.11.0
}
```

## Local Repository

If you are downloading the API into a local repository, make sure to include it in your gradle configuration
```gradle
repositories {
    mavenCentral()
    maven {
        url "path/to/unzipped/release"
    }
}
```
You can find the latest `MAS-API.zip` in the [releases section](https://github.com/butter-robotics/Butter.MAS.Java.API/releases).

## Usage

### Native Java
```java
ClientHttp butterHttpClient = new ClientHttp("insert.robot.ip.here");

var response = butterHttpClient.getAvailableAnimations(false);
```

### Android Kotlin
```kotlin
val butterHttpClient = ClientHttp("insert.robot.ip.here")

CoroutineScope(Dispatchers.IO).launch {
    val response = butterHttpClient.getAvailableAnimations(false)
}
```

In addition, you will have to make sure the app have sufficient permissions:

AndroidManifest.xml
```xml
<manifest ... >
    <uses-permission android:name="android.permission.INTERNET" />
    ...
</manifest>
```

res/xml/network_security_config.xml:
```xml
<?xml version="1.0" encoding="utf-8"?>
<network-security-config>
    <base-config cleartextTrafficPermitted="true" />
</network-security-config>
```
