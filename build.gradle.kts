import org.apache.tools.ant.filters.ReplaceTokens

// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.3.0-alpha03")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.50")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks {
    "initConfig"(Copy::class) {

        //        val tokens = mapOf("version" to "2.3.1")
//        inputs.properties(tokens)
//
//        from("src/main/config") {
//            include("**/*.properties")
//            include("**/*.xml")
//            filter<ReplaceTokens>("tokens" to tokens)
//        }
//
//        from("src/main/languages") {
//            rename("EN_US_(.*)", "$1")
//        }
//
//        into("build/target/config")
//        exclude("**/*.bak")
//        includeEmptyDirs = false
    }
    "clean"(Delete::class) {
        delete(buildDir)
    }
}