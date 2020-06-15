plugins {
  java
  id("org.springframework.boot") version("2.3.1.RELEASE")
  id("io.spring.dependency-management") version("1.0.8.RELEASE")
}

group = "com.shishirkeluskar.spmia"
version = "0.0.1-SNAPSHOT"
description = "Configuration Service"

java {
  sourceCompatibility = JavaVersion.VERSION_14
  targetCompatibility = JavaVersion.VERSION_14
}

dependencies {
  implementation("org.springframework.cloud:spring-cloud-starter-config")
  implementation("org.springframework.cloud:spring-cloud-config-server")
}

dependencyManagement {
  imports {
    mavenBom("org.springframework.cloud:spring-cloud-dependencies:Hoxton.SR5")
  }
}