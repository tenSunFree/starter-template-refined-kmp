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

package com.sun.kmpstartertemplaterefined.feature_core_domain.logics.onboarding

import com.sun.kmpstartertemplaterefined.feature_core_domain.repositories.OnboardingRepository

class SetOnboardedLogic(
    private val repository: OnboardingRepository,
) {

    suspend operator fun invoke(value: Boolean) {
        repository.setOnboarded(value)
    }
}