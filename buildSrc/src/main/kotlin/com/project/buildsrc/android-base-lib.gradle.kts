import com.android.build.gradle.BaseExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun android(configuration: BaseExtension.() -> Unit) = configure(configuration)

android {
    compileSdkVersion(Versions.target_android_sdk)
    defaultConfig {
        minSdk = Versions.min_android_sdk
        targetSdk = Versions.target_android_sdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    tasks.withType<KotlinCompile>() {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}