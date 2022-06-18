@file:Suppress("UnstableApiUsage")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

rootProject.name = "GJZS"
include(
    ":app",
    ":common",
    ":mainStyle"
)

val compilerLibsDir: File = File(settingsDir, "libs")
project(":common").projectDir = File(compilerLibsDir, "ui" + File.separator + "common")
project(":mainStyle").projectDir = File(compilerLibsDir, "ui" + File.separator + "mainStyle")