plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "ltdd.lt.bai11"
    compileSdk = 36

    defaultConfig {
        applicationId = "ltdd.lt.bai11"
        minSdk = 24
        targetSdk = 36
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
    buildFeatures {
        viewBinding = true
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
    // Thư viện Glide để tải ảnh (giống bài 9)
    implementation("com.github.bumptech.glide:glide:4.12.0")

    // --- THÊM MỚI ---
    // Thư viện cho ViewPager2
    implementation("androidx.viewpager2:viewpager2:1.1.0")

    // Thư viện Fragment (nếu bạn dùng Kotlin)
    implementation("androidx.fragment:fragment-ktx:1.7.1")
    // (Nếu dùng Java, thư viện fragment đã có trong appcompat)

    // Các thư viện test (giống bài 9)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}