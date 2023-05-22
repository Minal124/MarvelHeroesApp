plugins {
    id("com.android.library")
    id("kotlin-android")
    `android-base-lib`
}

android {
    namespace = "com.project.marvelheroes"

    // ===== compose =====
    buildFeatures.compose = true
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
}

dependencies {


    // ===== android =====
    implementation(Dependencies.android)

    // ===== material =====
    implementation(Dependencies.material)

    // ===== compose =====
    val composeBom = platform(Dependencies.composeBom)
    implementation(composeBom)
    androidTestImplementation(composeBom)
    implementation(Dependencies.compose)
    implementation(Dependencies.debug)

    // ===== navigation =====
    api(Dependencies.composeNavigation)

    // ===== tests =====
    testImplementation(Dependencies.unitTests)
    androidTestImplementation(Dependencies.androidTests)

}