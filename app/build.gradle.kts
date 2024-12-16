plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.android.meal"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.android.meal"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

}


dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation ("com.google.android.material:material:1.7.0")

    implementation("com.android.volley:volley:1.2.1")

    implementation ("com.github.bumptech.glide:glide:4.14.2")

    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
}