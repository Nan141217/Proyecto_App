plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/main
    namespace = "com.example.inicio"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.inicio"
<<<<<<< HEAD
        minSdk = 26
        targetSdk = 34
=======
    namespace = "com.example.tofulltoc"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.tofulltoc"
        minSdk = 34
        targetSdk = 36
>>>>>>> origin/main
=======
        minSdk = 36
        targetSdk = 36
>>>>>>> origin/main
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
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> origin/main
=======

>>>>>>> origin/main
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
<<<<<<< HEAD
<<<<<<< HEAD

    // Retrofit para consumir API REST
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.11.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")

    // Coroutines para operaciones asíncronas
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
=======
>>>>>>> origin/main
=======
>>>>>>> origin/main
}