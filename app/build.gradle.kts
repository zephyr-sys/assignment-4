
plugins {

        alias(libs.plugins.android.application)
        alias(libs.plugins.google.services) // This uses the version from libs.versions.toml

}

android {
    namespace = "com.example.assignmentapp" // Change this to your actual package name
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.assignmentapp"
        minSdk = 24 // Required for ZXing QR Scanner
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    // Ensure Java 8 compatibility for the libraries
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    // --- FIREBASE (Requirement 1 & 2) ---
    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))
    implementation("com.google.firebase:firebase-auth")

    // --- QR SCANNER (Requirement 3) ---
    implementation("com.journeyapps:zxing-android-embedded:4.3.0")
    implementation("com.google.zxing:core:3.4.1")

    // --- STANDARD UI ---
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation(libs.firebase.auth)
}