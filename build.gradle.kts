//import cuchaz.enigma.command.ComposeMappingsCommand

plugins {
    java
    id("com.solarmc.eclipse") version "1.2-SNAPSHOT"
}

group = "com.solarmc"
version = "1.0-SNAPSHOT"

repositories {
    maven(url = "https://maven.fabricmc.net/")
    mavenCentral()
}

dependencies {
    // Mapping
    implementation("cuchaz", "enigma-swing", "0.27.3")
}

tasks.register("exportMappingsOfficial") {
            doLast {
                logger.lifecycle(":exporting mappings")
                val args = listOf(
                        "tiny",
                        "/home/hydos/.gradle/caches/solarmc-eclipse/1.16.5/intermediary.tiny",
                        "enigma",
                        file("mappings/").absolutePath,
                        "enigma",
                        file("mappings_official/").absolutePath,
                        "right"
                )

//                ComposeMappingsCommand().run(args)
            }
}
//
//task importMappingsOfficial(dependsOn: invertIntermediary) {
//    def composeInput = invertIntermediary.output
//
//            doLast {
//                logger.lifecycle(":importing mappings")
//                String[] args = [
//                        "tiny",
//                        composeInput.getAbsolutePath(),
//                        "enigma",
//                        file("mappings_official/").getAbsolutePath(),
//                        "enigma",
//                        file("mappings/").getAbsolutePath(),
//                        "right"
//                ]
//
//                new ComposeMappingsCommand().run(args)
//            }
//}

solarEclipse {
    version = com.solarmc.eclipse.util.lunar.Version.v1_16
}