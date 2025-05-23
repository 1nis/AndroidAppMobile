// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
        classpath ("com.android.tools.build:gradle:8.7.3")
    }
}



plugins {
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
    id("com.google.devtools.ksp") version "1.9.24-1.0.20" apply false // KSP
    id("com.android.application") version "8.7.3" apply false
    id("com.android.library") version "8.7.3" apply false
}
