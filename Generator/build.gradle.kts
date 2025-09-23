plugins {
    kotlin("jvm") apply true
    kotlin("plugin.serialization") apply true
}

group = "io.github.flyingpig525"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

java {
    manifest {
        attributes["Main-Class"] = "io.github.flyingpig525.MainKt"
    }
}