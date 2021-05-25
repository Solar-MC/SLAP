plugins {
    java
    id("com.solarmc.eclipse") version "1.0-SNAPSHOT"
}

group = "com.solarmc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

solarEclipse {
    version = com.solarmc.eclipse.util.lunar.Version.v1_16
}