plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id("kotlinx-serialization")
}

android {
    namespace = "mende273.ktorandroidclient"
    compileSdk = 33

    defaultConfig {
        applicationId = "mende273.ktorandroidclient"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.5"
    }
    packagingOptions {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {

    implementation ("androidx.core:core-ktx:1.10.1")
    implementation ("org.jetbrains.kotlin:kotlin-bom:1.8.0")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation ("androidx.activity:activity-compose:1.7.2")
    implementation ("androidx.compose:compose-bom:2023.06.01")
    implementation ("androidx.compose.ui:ui")
    implementation ("androidx.compose.ui:ui-graphics")
    implementation ("androidx.compose.ui:ui-tooling-preview")
    implementation ("androidx.compose.material3:material3:1.1.1")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.compose:compose-bom:2023.06.01")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:1.4.3")
    debugImplementation ("androidx.compose.ui:ui-tooling:1.4.3")
    debugImplementation ("androidx.compose.ui:ui-test-manifest")

    // ktor
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation("io.ktor:ktor-client-android:1.5.0")
    implementation("io.ktor:ktor-client-serialization:1.5.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
    implementation("io.ktor:ktor-client-logging-jvm:1.5.0")
}