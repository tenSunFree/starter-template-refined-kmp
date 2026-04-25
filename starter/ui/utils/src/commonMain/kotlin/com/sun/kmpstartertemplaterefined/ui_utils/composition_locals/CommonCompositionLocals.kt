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

package com.sun.kmpstartertemplaterefined.ui_utils.composition_locals

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.compositionLocalOf
import com.sun.kmpstartertemplaterefined.core.events.enums.ThemeMode

@OptIn(ExperimentalMaterial3Api::class)
val LocalThemeMode = compositionLocalOf { ThemeMode.SYSTEM }
