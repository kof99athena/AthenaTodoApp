// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.com.android.application) apply false
    alias(libs.plugins.org.jetbrains.kotlin.android) apply false

    //1. 힐트 라이브러리 추가하자
    id("com.google.dagger.hilt.android") version "2.44.2" apply false
    //id 'com.android.library' version '7.3.1' apply false
    id ("com.android.library") version "7.3.1" apply false

}