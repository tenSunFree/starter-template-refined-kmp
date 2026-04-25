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

package com.sun.kmpstartertemplaterefined.utils.di

import com.sun.kmpstartertemplaterefined.utils.datastore.AppDataStore
import com.sun.kmpstartertemplaterefined.utils.intents.IntentUtils
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformUtilsModule = module {
    singleOf(::AppDataStore)
    singleOf(::IntentUtils)
}