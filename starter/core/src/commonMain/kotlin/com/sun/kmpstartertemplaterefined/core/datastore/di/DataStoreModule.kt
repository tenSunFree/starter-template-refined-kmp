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

package com.sun.kmpstartertemplaterefined.core.datastore.di

import com.sun.kmpstartertemplaterefined.core.datastore.common.CommonDataStore
import com.sun.kmpstartertemplaterefined.core.datastore.onboarding.OnboardingDataStore
import com.sun.kmpstartertemplaterefined.core.datastore.theme.ThemeDataStore
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module




val dataStoreModule = module {
    singleOf(::ThemeDataStore)
    singleOf(::OnboardingDataStore)
    singleOf(::CommonDataStore)
}