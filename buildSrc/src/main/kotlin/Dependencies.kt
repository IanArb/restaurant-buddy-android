import Versions.appCompatVersion
import Versions.calendarSquareTimesVersion
import Versions.cardviewVersion
import Versions.composeVersion
import Versions.constraintLayoutVersion
import Versions.coroutinesAdapterVersion
import Versions.coroutinesVersion
import Versions.daggerVersion
import Versions.glideVersion
import Versions.googleTruthVersion
import Versions.gradleToolsVersion
import Versions.gsonVersion
import Versions.jacocoVersion
import Versions.jodaTimeAndroidVersion
import Versions.jodaTimeVersion
import Versions.junitVersion
import Versions.kotlinExtensionsVersion
import Versions.kotlinMockVersion
import Versions.kotlinMockito
import Versions.kotlinMockitoVersion
import Versions.kotlinVersion
import Versions.lifecycleVersion
import Versions.materialComponentsVersion
import Versions.mockitoVersion
import Versions.moshiKotlinVersion
import Versions.navigationVersion
import Versions.okHttpVersion
import Versions.pagingVersion
import Versions.recyclerviewVersion
import Versions.retrofitVersion
import Versions.roomVersion
import Versions.rxAndroidVersion
import Versions.rxBindingVersion
import Versions.rxJavaVersion
import Versions.threetenadpVersion
import Versions.timberVersion
import Versions.workManagerVersion

object Versions {
    //SDK
    const val compileSDKVersion = 29
    const val minSDKVersion = 21
    const val targetSDKVersion = 29
    const val versionCode = 1
    const val versionName = "1.0"

    //Kotlin
    const val kotlinVersion = "1.3.60"
    const val coroutinesVersion = "1.3.2"
    const val kotlinExtensionsVersion = "1.0.1"
    const val kotlinMockito = "2.1.0"

    //Android
    const val appCompatVersion = "1.1.0"
    const val materialComponentsVersion = "1.0.0"
    const val constraintLayoutVersion = "2.0.0-beta3"
    const val cardviewVersion = "1.0.0"
    const val recyclerviewVersion = "1.1.0"

    //Dagger
    const val daggerVersion = "2.25.2"

    //Rx
    const val rxJavaVersion = "2.1.14"
    const val rxAndroidVersion = "2.0.2"
    const val rxBindingVersion = "2.1.1"

    //Architecture components
    const val lifecycleVersion = "2.0.0"
    const val roomVersion = "2.2.0"
    const val navigationVersion = "1.0.0-alpha02"
    const val pagingVersion = "2.0.0-rc01"
    const val workManagerVersion = "1.0.0-alpha01"

    //Test
    const val junitVersion = "4.12"
    const val googleTruthVersion = "0.27"
    const val mockitoVersion = "2.23.0"
    const val kotlinMockitoVersion = "2.1.0"
    const val kotlinMockVersion = "1.9.3.kotlin12"

    //Network
    const val okHttpVersion = "3.13.1"
    const val retrofitVersion = "2.6.0"
    const val moshiKotlinVersion = "1.6.0"
    const val coroutinesAdapterVersion = "0.9.2"

    //Logging
    const val timberVersion = "4.7.1"

    //Glide
    const val glideVersion = "4.10.0"

    //Gradle
    const val gradleToolsVersion = "3.5.2"
    const val jacocoVersion = "0.1.4"

    //Joda
    const val jodaTimeAndroidVersion = "2.10.1.2"
    const val jodaTimeVersion = "2.3"

    //Calendar
    const val calendarSquareTimesVersion = "1.7.10@aar"

    //Gson
    const val gsonVersion = "2.8.5"

    //Three ten Android backport
    const val threetenadpVersion = "1.2.1"

    //Compose
    const val composeVersion = "0.1.0-dev02"


}

object KotlinDeps {
    //Kotlin
    val kotlin_extensions_library = "androidx.core:core-ktx:$kotlinExtensionsVersion"
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    //Coroutines
    val coroutines_android_library = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
    val coroutines_core_library = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
    val coroutines_test_library = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion"
}

object AndroidDeps {
    //Android
    val appCompat_library = "androidx.appcompat:appcompat:$appCompatVersion"
    val material_components_library = "com.google.android.material:material:$materialComponentsVersion"
    val constraint_layout_library = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    val cardView_library = "androidx.cardview:cardview:$cardviewVersion"
    val recyclerView_library = "androidx.recyclerview:recyclerview:$recyclerviewVersion"
}

object DaggerDeps {
    //Dagger
    val dagger_library = "com.google.dagger:dagger:$daggerVersion"
    val dagger_compiler_library = "com.google.dagger:dagger-compiler:$daggerVersion"
}

object RxDeps {
    //Rx
    val rxAndroid_library = "io.reactivex.rxjava2:rxandroid:$rxAndroidVersion"
    val rxJava_library = "io.reactivex.rxjava2:rxjava:$rxJavaVersion"
    val rxBinding2_library = "com.jakewharton.rxbinding2:rxbinding:$rxBindingVersion"
    val rxBinding2_design_library = "com.jakewharton.rxbinding2:rxbinding-design:$rxBindingVersion"
    val rxBinding2_support_library = "com.jakewharton.rxbinding2:rxbinding-support-v4:$rxBindingVersion"
    val rxBinding2_kotlin_library = "com.jakewharton.rxbinding2:rxbinding-kotlin:$rxBindingVersion"
    val rxBinding2_kotlin_design_library = "com.jakewharton.rxbinding2:rxbinding-design-kotlin:$rxBindingVersion"
    val rxBinding2_kotlin_support_library = "com.jakewharton.rxbinding2:rxbinding-support-v4-kotlin:$rxBindingVersion"
}

object TestDeps {
    //Test
    val junit_library = "junit:junit:$junitVersion"
    val google_truth_library =  "com.google.truth:truth:$googleTruthVersion"
    val mockito_library = "org.mockito:mockito-core:$mockitoVersion"
    val mockito_inline_library = "org.mockito:mockito-inline:$mockitoVersion"
    val mockito_kotlin_library = "com.nhaarman.mockitokotlin2:mockito-kotlin:$kotlinMockitoVersion"
    val mock_kotlin_library = "io.mockk:mockk:$kotlinMockVersion"
}

object JetpackDeps {
    //Architecture components
    val lifecycle_library = "androidx.lifecycle:lifecycle-extensions:$lifecycleVersion"
    val lifecycle_compiler_library = "androidx.lifecycle:lifecycle-compiler:$lifecycleVersion"
    val room_library = "androidx.room:room-runtime:$roomVersion"
    val room_compiler_library = "androidx.room:room-compiler:$roomVersion"
    val room_kotlin_library = "androidx.room:room-ktx:$roomVersion"
    val room_coroutines_library = "androidx.room:room-coroutines:$roomVersion"
    val room_test_library = "androidx.room:room-testing:$roomVersion"
    val navigation_fragment_library = "android.arch.navigation:navigation-fragment:$navigationVersion"
    val navigation_ui_library =  "android.arch.navigation:navigation-ui:$navigationVersion"
    val paging_library =  "android.arch.navigation:navigation-ui:$pagingVersion"
    val paging_test_library = "androidx.paging:paging-common:$pagingVersion"
    val rxPaging_library =  "android.arch.paging:rxjava2:$pagingVersion"
    val work_manager_kts_library = "android.arch.work:work-runtime-ktx:$workManagerVersion"
    val work_manager_test_library = "android.arch.work:work-testing:$workManagerVersion"
}

object NetworkDeps {
    //Network
    val okHttp3_library = "com.squareup.okhttp3:okhttp:$okHttpVersion"
    val okHttp3_logging_interceptor_library = "com.squareup.okhttp3:logging-interceptor:$okHttpVersion"
    val retrofit2_library = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    val retrofit2_moshi_converter_library = "com.squareup.retrofit2:converter-moshi:$retrofitVersion"
    val retrofit2_gson_converter = "com.squareup.retrofit2:converter-gson:2.5.0"
    val retrofit2_coroutines_adapter_library = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:$coroutinesAdapterVersion"
    val moshi_kotlin_library = "com.squareup.moshi:moshi-kotlin:$moshiKotlinVersion"
}

object UtilityDeps {
    //Logging
    val timber_library = "com.jakewharton.timber:timber:$timberVersion"

    //Glide
    val glide_library = "com.github.bumptech.glide:glide:$glideVersion"
    val glide_compiler_library = "com.github.bumptech.glide:compiler:$glideVersion"

    //Joda
    val joda_time_android_library = "net.danlew:android.joda:$jodaTimeAndroidVersion"
    val joda_time_library = "joda-time:joda-time:$jodaTimeVersion"

    //Threetenadbp
    val androidThreeTenbp = "com.jakewharton.threetenabp:threetenabp:$threetenadpVersion"

    //Calendar
    val square_times_calendar_library = "com.squareup:android-times-square:$calendarSquareTimesVersion"

    //Gson
    val gson_library = "com.google.code.gson:gson:$gsonVersion"
}

object GradleDeps {
    //Gradle
    val gradle_tools_library = "com.android.tools.build:gradle:$gradleToolsVersion"
    val gradle_kotlin_library = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    val gradle_navigation_architecture_library = "android.arch.navigation:navigation-safe-args-gradle-plugin:$navigationVersion"
    val gradle_jacoco_library = "com.dicedmelon.gradle:jacoco-android:$jacocoVersion"
}
