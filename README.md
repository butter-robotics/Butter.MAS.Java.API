# Butter MAS Java API
HTTP client java API for Butter MAS platform.

[![licence](https://img.shields.io/github/license/butter-robotics/Butter.MAS.JavascriptAPI.svg)](https://github.com/butter-robotics/Butter.MAS.JavascriptAPI/blob/master/LICENSE)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

You will need to install JDK17+ in order to use this software

### Installation

Add the following dependencie to your Gradle configuration and reload gradle:
```gradle
dependencies {
    implementation group: 'com.butter.mas.api', name: 'mas.api', version: '${api_version}'
}
```

### Local Repository
If you are downloadind the API into a local repository, make sure to include it in your gradle configuration
```gradle
repositories {
    mavenCentral()
    maven {
        url "path/to/unzipped/release"
    }
}
```

## Usage

```java
ClientHttp butterHttpClient= new ClientHttp("insert.robot.ip.here");

var response = butterHttpClient.getAvailableAnimations(false);
```

<!--
## Documentation
- 👨🏼‍💻 [API]((https://butterrobotics.com/#/library/documentation/mas_java_api),
- 🖋  [Licence](https://github.com/butter-robotics/Butter.MAS.JavaAPI/blob/master/LICENSE) -->
