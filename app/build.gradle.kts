// build.gradle (Module: app)
plugins {
    id 'com.android.application'
    // This plugin MUST be here for Firebase to function
    id 'com.google.gms.google-services'
}

android {
    namespace 'com.example.assignmentapp' // Make sure this matches your package name!
    compileSdk 34  // Must be at least 33 or 34 for newer libraries

    defaultConfig {
        applicationId "com.example.assignmentapp"
        minSdk 24      // ZXing scanner requires at least API 24
        targetSdk 34
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }
}

dependencies {
    // --- FIREBASE (Using BOM to prevent errors) ---
    implementation platform('com.google.firebase:firebase-bom:32.7.1')
    implementation 'com.google.firebase:firebase-auth'

    // --- QR CODE SCANNER ---
    implementation 'com.journeyapps:zxing-android-embedded:4.3.0'
    implementation 'com.google.zxing:core:3.4.1'

    // --- STANDARD UI LIBRARIES ---
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'

    // Testing (Optional, but usually included by default)
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
}