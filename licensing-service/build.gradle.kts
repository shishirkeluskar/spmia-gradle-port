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
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")
  implementation("org.springframework.cloud:spring-cloud-starter-config")
  implementation("org.springframework.cloud:spring-cloud-config-client")

//  runtimeOnly("com.h2database:h2")
  runtimeOnly("org.postgresql:postgresql")
}

dependencyManagement {
  imports {
    mavenBom("org.springframework.cloud:spring-cloud-dependencies:Hoxton.SR5")
  }
}