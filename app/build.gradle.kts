plugins {
    id("com.android.application")
}

var packageName = properties["package_name"] as String
var javaVersion = JavaVersion.toVersion(properties["java_version"] as Any)

android {
    namespace = packageName
    compileSdk = 34

    defaultConfig {
        applicationId = packageName
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = javaVersion
        targetCompatibility = javaVersion
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:${properties["app_compat_version"]}")
    implementation("com.google.android.material:material:${properties["material_version"]}")
    implementation("androidx.constraintlayout:constraintlayout:${properties["constraint_layout_version"]}")
    implementation("androidx.navigation:navigation-fragment:${properties["navigation_version"]}")
    implementation("androidx.navigation:navigation-ui:${properties["navigation_version"]}")
    testImplementation("junit:junit:${properties["junit_version"]}")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
