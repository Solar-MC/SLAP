rootProject.name = "SLAP"

pluginManagement {
    repositories {
        maven(url = "https://plugins.gradle.org/m2/")
        maven(url = "https://maven.quiltmc.org/")
        maven(url = "https://maven.fabricmc.net/")
        maven(url = "https://jitpack.io")
        maven(url = "gcs://devan-maven")
        mavenCentral()
    }
}