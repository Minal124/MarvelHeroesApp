plugins {
    id("com.android.library")
    id("kotlin-android")
    `android-base-lib`
}

android {
    namespace = "com.project.commons"

    // ===== compose =====
    buildFeatures.compose = true
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
}

dependencies {

    // ===== android =====
    implementation(Dependencies.android)

    // ===== compose =====
    val composeBom = platform(Dependencies.composeBom)
    implementation(composeBom)
    androidTestImplementation(composeBom)
    implementation(Dependencies.compose)
    implementation(Dependencies.debug)
}