object Versions {
    const val ksp = "1.8.10-1.0.9"
    const val compose_bom = "2023.01.00"
    const val composeCompiler = "1.4.3"
    const val core = "1.8.10"
    const val lifecycle = "2.5.1"
    const val target_android_sdk = 33
    const val min_android_sdk = 24
    const val timber = "4.7.1"
    const val nav_version = "2.5.3"
    const val room_version = "2.4.3"
    const val gson = "2.8.9"
    const val retrofit = "2.9.0"
    const val activityContext = "1.6.1"
    const val squareInterceptor = "4.10.0"
}

object Dependencies {
    val android = listOf(
        "androidx.core:core-ktx:${Versions.core}",
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    )

    const val material =
        "com.google.android.material:material:1.8.0"

    const val timber =
        "com.jakewharton.timber:timber:${Versions.timber}"

    val compose = listOf(
        "io.coil-kt:coil-compose:2.3.0",
        "androidx.compose.ui:ui",
        "androidx.compose.material:material",
        "androidx.compose.ui:ui-tooling-preview",
        "androidx.activity:activity-compose",
        "androidx.compose.material:material-icons-extended",
        "androidx.appcompat:appcompat:1.6.1",
    )

    const val composeBom =
        "androidx.compose:compose-bom:${Versions.compose_bom}"

    val debug = listOf(
        "androidx.compose.ui:ui-tooling",
        "androidx.compose.ui:ui-test-manifest"
    )

    val unitTests = listOf(
        "junit:junit:4.13.2",
    )

    val androidTests = listOf(
        "androidx.test.ext:junit:1.1.3",
        "androidx.test.espresso:espresso-core:3.4.0",
        "androidx.compose.ui:ui-test-junit4"
    )

    const val composeNavigation =
        "androidx.navigation:navigation-compose:${Versions.nav_version}"

    val firebase = listOf(
        "com.google.firebase:firebase-crashlytics-ktx",
        "com.google.firebase:firebase-analytics-ktx",
        "com.google.firebase:firebase-config-ktx"
    )

    val gson = listOf(
        "com.google.code.gson:gson:${Versions.gson}"
    )

    val retrofit = listOf(
        "com.squareup.retrofit2:retrofit:${Versions.retrofit}",
        "com.squareup.okhttp3:logging-interceptor:${Versions.squareInterceptor}",
        "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    )

    val room = listOf(
        "androidx.room:room-runtime:${Versions.room_version}",
        "androidx.room:room-common:2.5.0",
        "androidx.room:room-ktx:${Versions.room_version}"
    )

    val room_kapt = listOf(
        "androidx.room:room-compiler:${Versions.room_version}"
    )

}
