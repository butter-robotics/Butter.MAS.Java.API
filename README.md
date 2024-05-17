# Butter MAS Java API
HTTP client java API for Butter MAS platform.

[![licence](https://img.shields.io/github/license/butter-robotics/Butter.MAS.JavascriptAPI.svg)](https://github.com/butter-robotics/Butter.MAS.JavascriptAPI/blob/master/LICENSE)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Installation


Add thefollowing dependencie to your Gradle configuration:
```gradle
dependencies {
    implementation group: 'com.butter.mas.api', name: 'mas.api', version: '2.0.0'
}
```

### Local Repository
If you are downloadind the API into a local repository, make sure to include it in your gradle configuration
```gradle
repositories {
    mavenCentral()
    maven {
        url "path/to/downloaded/release"
    }
}
```

## Usage

```java
ClientHttp mHttpClient= new ClientHttp("<insert robot ip here>");

var response = mHttpClient.getAvailableAnimations(false);
```
