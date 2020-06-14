plugins {
  java
  id("org.springframework.boot") version ("2.3.1.RELEASE")
  id("io.spring.dependency-management") version ("1.0.9.RELEASE")
}

group = "com.shishirkeluskar.spmia"
version = "0.0.1-SNAPSHOT"
description = "Licensing Service"

java {
  sourceCompatibility = JavaVersion.VERSION_14
  targetCompatibility = JavaVersion.VERSION_14
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.boot:spring-boot-starter-actuator")
}