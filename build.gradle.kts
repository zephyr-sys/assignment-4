// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // These core plugins must be defined here so the app module can find them
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

    // This is the Google Services plugin you were trying to add
    alias(libs.plugins.google.services) apply false
}
