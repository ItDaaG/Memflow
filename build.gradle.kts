plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

javafx {
    version = "23.0.1"
    modules = listOf("javafx.controls")
}

application {
    mainClass = "com.github.itdaag.memflow.Main"
}

repositories {
    mavenCentral()
}

dependencies {

}
