# <img src="build/theme/resources/CT_cube_200px.png" width="40" align="center"></img> commercetools JAVA SDK


[![][maven img]][maven]
[![][snyk img]][snyk]
[![][license img]][license]

## Introduction

This repository contains the commercetools platform and import-api java sdks generated from our api reference.

* [Getting Started](docs/GettingStarted.md)

## Installation

### Java SDK with Gradle

The latest stable SDK release can be retrieved from [jcenter](https://bintray.com/bintray/jcenter?filterByPkgName=commercetools-sdk-java) with:


```gradle
ext {
    versions = [
        commercetools: "2.0.1"
    ]
}

sourceCompatibility = 1.8

repositories {
    jcenter()
}

dependencies {
    implementation "com.commercetools.sdk:commercetools-http-client:${versions.commercetools}"
    implementation "com.commercetools.sdk:commercetools-sdk-java-api:${versions.commercetools}"
    implementation "com.commercetools.sdk:commercetools-sdk-java-importapi:${versions.commercetools}"
    implementation "com.commercetools.sdk:commercetools-sdk-java-ml:${versions.commercetools}"
}
```

### Java SDK with Maven

```maven
<properties>
    <commercetools.version>2.0.1</commercetools.version>
</properties>
<dependencies>
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-http-client</artifactId>
      <version>${commercetools.version}</version>
    </dependency>
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-sdk-java-api</artifactId>
      <version>${commercetools.version}</version>
    </dependency>
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-sdk-java-importapi</artifactId>
      <version>${commercetools.version}</version>
    </dependency>
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-sdk-java-ml</artifactId>
      <version>${commercetools.version}</version>
    </dependency>
</dependencies>
<profiles>
    <profile>
        <repositories>
            <repository>
                <snapshots>
                    <enabled>false</enabled>
                </snapshots>
                <id>central</id>
                <name>bintray</name>
                <url>https://jcenter.bintray.com</url>
            </repository>
        </repositories>
        <pluginRepositories>
            <pluginRepository>
                <snapshots>
                    <enabled>false</enabled>
                </snapshots>
                <id>central</id>
                <name>bintray-plugins</name>
                <url>https://jcenter.bintray.com</url>
            </pluginRepository>
        </pluginRepositories>
        <id>bintray</id>
    </profile>
</profiles>
```

### Modules

* `commercetools-http-client`: alias for commercetools-okhttp-client4
* `commercetools-okhttp-client3`: uses OkHttp client 3.0
* `commercetools-okhttp-client4`: uses OkHttp client 4.0
* `commercetools-sdk-java-api`: models and request builders for the product API
* `commercetools-sdk-java-importapi`: models and request builders for the import API
* `commercetools-sdk-java-ml`: models and request builders for the machine learning API

## Documentation

* [Documentation](docs/Readme.md)

[](definitions for the top badges)

[snyk]:https://snyk.io/test/github/commercetools/commercetools-sdk-java-v2
[snyk img]:https://snyk.io/test/github/commercetools/commercetools-sdk-java-v2/badge.svg

[maven]:https://search.maven.org/search?q=g:com.commercetools.sdk%20AND%20a:commercetools-sdk-java-api
[maven img]:https://maven-badges.herokuapp.com/maven-central/com.commercetools.sdk/commercetools-sdk-java-api/badge.svg

[mavenimportapi]:https://search.maven.org/search?q=g:com.commercetools.sdk%20AND%20a:commercetools-sdk-java-importapi
[mavenimportapi img]:https://maven-badges.herokuapp.com/maven-central/com.commercetools.sdk/commercetools-sdk-java-importapi/badge.svg

[license]:LICENSE.md
[license img]:https://img.shields.io/badge/License-Apache%202-blue.svg
