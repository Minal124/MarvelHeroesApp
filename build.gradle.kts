buildscript {
    extra.apply {
        set("compose_ui_version", "1.2.1")
    }

}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.google.devtools.ksp") version Versions.ksp apply false
}