plugins {
    id("com.android.application") version "8.0.0" apply false
    id("kotlin-android") version "1.8.0" apply false
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.clickerapp"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

tasks.register<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>("compileKotlin") {
    kotlinOptions.jvmTarget = "1.8"
}