plugins {
    kotlin("jvm") apply true
    kotlin("plugin.serialization") apply true

    id("com.vanniktech.maven.publish") version "0.34.0"
    id("org.jetbrains.dokka") version "2.0.0"
}

version = "1.7.0-SNAPSHOT"
group = "io.github.flyingpig525"

mavenPublishing {
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
    publishToMavenCentral(automaticRelease = true)
}


repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    val ktor_version = "3.3.0"
    implementation("io.ktor:ktor-client-websockets:$ktor_version")
    implementation("io.ktor:ktor-client-java:$ktor_version")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
}

kotlin {
    jvmToolchain(17)
    compilerOptions {
        freeCompilerArgs = listOf("-Xcontext-parameters")
    }
}