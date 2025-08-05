plugins {
    id("com.android.library")
}

android {
    namespace = "com.unnamed.b.atv"
    compileSdk = 35

    defaultConfig {
      //  applicationId = "com.unnamed.b.atv"
        minSdk = 23
        targetSdk = 35
      //  versionCode = 1
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
  //  compile(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("androidx.appcompat:appcompat:1.6.1")
}