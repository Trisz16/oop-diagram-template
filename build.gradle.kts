plugins {
    kotlin("jvm") version "2.0.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // Tambahkan junit di sini jika nanti pakai unit test
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

kotlin {
    jvmToolchain(17) // atau 21 sesuai JDK Anda
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("com.polman.oop.diagram2code.MainCheckKt")
}