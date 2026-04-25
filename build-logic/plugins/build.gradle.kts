/*
 *
 *  *
 *  *  * Copyright (c) 2026
 *  *  *
 *  *  * Author: Athar Gul
 *  *  * GitHub: https://github.com/DevAtrii/Kmp-Starter-Template
 *  *  * YouTube: https://www.youtube.com/@devatrii/videos
 *  *  *
 *  *  * All rights reserved.
 *  *
 *  *
 *
 */

plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.bundles.gradle.plugins)
    compileOnly(libs.kotlin.gradle.plugin.api)
}

gradlePlugin {
    plugins {
        registerPlugin(
            id = "com.sun.kmpstartertemplaterefined.plugins.composemultiplatform",
            implementationClass = "ComposeMultiplatformPlugin",
        )
        registerPlugin(
            id = "com.sun.kmpstartertemplaterefined.plugins.koin",
            implementationClass = "KoinPlugin",
        )
        registerPlugin(
            id = "com.sun.kmpstartertemplaterefined.plugins.koincompose",
            implementationClass = "KoinComposePlugin",
        )
        registerPlugin(
            id = "com.sun.kmpstartertemplaterefined.plugins.common",
            implementationClass = "CommonPlugin",
        )
    }
}

fun NamedDomainObjectContainer<PluginDeclaration>.registerPlugin(
    id: String,
    implementationClass: String,
) {
    // For simplicity, we use id as the name of the plugin declaration
    register(id) {
        this.id = id
        this.implementationClass = implementationClass
    }
}