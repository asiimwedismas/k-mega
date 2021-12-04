package me.asiimwedismas.buildsrc

object Versions {
    const val ktLint = "0.42.1"
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.3"
    const val ktLint = "com.pinterest:ktlint:${Versions.ktLint}"

    object GoogleMaps {
        const val maps = "com.google.android.libraries.maps:maps:3.1.0-beta"
        const val mapsKtx = "com.google.maps.android:maps-v3-ktx:2.2.0"
    }

    object Volley {
        const val volley = "com.android.volley:volley:1.2.0"
    }

    object Accompanist {
        const val version = "0.19.0"
        const val insets = "com.google.accompanist:accompanist-insets:$version"
    }

    object Kotlin {
        private const val version = "1.5.31"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"

        object Coroutines {
            private const val version = "1.5.2"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
            const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
        }
    }

    object AndroidX {
        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.3.1"
        }

        const val appcompat = "androidx.appcompat:appcompat:1.3.0"

        const val coreKTX = "androidx.core:core-ktx:1.7.0"

        object Compose {
            const val version = "1.1.0-beta01"

            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$version"
            const val material = "androidx.compose.material3:material3:1.0.0-alpha01"
            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val animation = "androidx.compose.animation:animation:$version"
            const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
            const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$version"
        }

        object Lifecycle {
            private const val version = "2.4.0-rc01"
            const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$version"
            const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val runTimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
        }

        object Room {
            private const val version = "2.3.0"
            const val room = "androidx.room:room-runtime:$version"
            const val annotationProcessor = "androidx.room:room-compiler:$version"
            const val testHelper = "androidx.room:room-testing:$version"
        }

        object Test {
            private const val version = "1.4.0"
            const val core = "androidx.test:core:$version"
            const val runner = "androidx.test:runner:$version"
            const val rules = "androidx.test:rules:$version"
            object Ext {
                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }
            const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        }

    }

    object Hilt {
        private const val version = "2.39"

        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
        const val android = "com.google.dagger:hilt-android:$version"
        const val compiler = "com.google.dagger:hilt-compiler:$version"
        const val testing = "com.google.dagger:hilt-android-testing:$version"
    }

    object Material {
        private const val version = "1.5.0-alpha04"
        const val material = "com.google.android.material:material:$version"
    }

    object JUnit {
        private const val version = "4.13.2"
        const val junit = "junit:junit:$version"
    }

    object Coil {
        const val coilCompose = "io.coil-kt:coil-compose:1.3.2"
    }

    object Truth {
        private const val version = "1.1.3"
        const val truth = "com.google.truth:truth:$version"
        const val java8Extension = "com.google.truth.extensions:truth-java8-extension:$version"
    }

}

//object Urls {
//    const val mavenCentralSnapshotRepo = "https://oss.sonatype.org/content/repositories/snapshots/"
//    const val composeSnapshotRepo = "https://androidx.dev/snapshots/builds/" +
//            "${Libs.AndroidX.Compose.snapshot}/artifacts/repository/"
//}
