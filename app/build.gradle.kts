plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
}
android{
    compileSdkVersion(28)
    buildToolsVersion("28.0.1")
    defaultConfig{
        applicationId = "com.example.nzheng2.wiredemo"
        minSdkVersion(15)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        buildTypes {
            getByName("release") {
                isMinifyEnabled = true
                proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            }
        }
    }
}
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.2.50")
    implementation("androidx.appcompat:appcompat:1.0.0-alpha1")
    implementation("androidx.constraintlayout:constraintlayout:1.1.2")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.0-alpha3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0-alpha3")
}
