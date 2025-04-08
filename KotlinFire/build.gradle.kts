import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.SonatypeHost

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.7/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    kotlin("jvm") version "2.1.10"
    kotlin("plugin.serialization") version "2.1.10"

    id("com.vanniktech.maven.publish") version "0.31.0-rc2"
    id("org.jetbrains.dokka") version "2.0.0"
}

version = "1.3.1"
group = "io.github.flyingpig525"

//publishing {
//    publications {
//        create<MavenPublication>("gpr") {
//            from(components["java"])
//            this.artifactId = "KotlinFire"
//
//            pom {
//                name = "KotlinFire"
//                description =
//                    "KotlinFire is a Kotlin library used to manipulate code templates from the Minecraft server DiamondFire."
//                url = "https://github.com/FlyingPig525/KotlinFire"
//                licenses {
//                    license {
//                        name = "The Apache License, Version 2.0"
//                        url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
//                    }
//                }
//                developers {
//                    developer {
//                        id = "flyingpig525"
//                        name = "FlyingPig525"
//                    }
//                }
//                scm {
//                    connection = "scm:git:git://github.com/FlyingPig525/KotlinFire.git"
//                    developerConnection = "scm:git:ssh://github.com/FlyingPig525/KotlinFire.git"
//                    url = "https://github.com/FlyingPig525/KotlinFire"
//                }
//            }
//        }
//    }
//}

mavenPublishing {
//    configure(KotlinJvm(
//        javadocJar = JavadocJar.Dokka( ),
//        sourcesJar = false
//    ))

    coordinates(
        "io.github.flyingpig525",
        "kotlinfire",
        project.version.toString()
    )

    pom {
        name = "KotlinFire"
        description =
            "KotlinFire is a Kotlin library used to manipulate code templates from the Minecraft server DiamondFire."
        url = "https://github.com/FlyingPig525/KotlinFire"
        inceptionYear = "2024"

        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }
        developers {
            developer {
                id = "flyingpig525"
                name = "FlyingPig525"
            }
        }
        scm {
            connection = "scm:git:git://github.com/FlyingPig525/KotlinFire.git"
            developerConnection = "scm:git:ssh://github.com/FlyingPig525/KotlinFire.git"
            url = "https://github.com/FlyingPig525/KotlinFire"
        }
    }

    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
}
//signing {
//    useGpgCmd()
//    sign(publishing.publications)
//    this.ext {
//
//    }
//}


repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use the Kotlin JUnit 5 integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    // Use the JUnit 5 integration.
    testImplementation(libs.junit.jupiter.engine)
    testImplementation("org.testng:testng:7.1.0")

    val ktor_version = "3.1.2"
    implementation("io.ktor:ktor-client-websockets:$ktor_version")
    implementation("io.ktor:ktor-client-java:$ktor_version")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.1")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation(kotlin("stdlib-jdk8"))
}

// Apply a specific Java toolchain to ease working on different environments.
//java {
//    toolchain {
//        languageVersion = JavaLanguageVersion.of(17)
//    }
//    withSourcesJar()
//    withJavadocJar()
//}
kotlin {
    jvmToolchain(17)
}