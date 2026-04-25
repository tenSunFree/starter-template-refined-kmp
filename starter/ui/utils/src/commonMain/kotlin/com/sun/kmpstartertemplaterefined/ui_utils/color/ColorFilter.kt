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

package com.sun.kmpstartertemplaterefined.ui_utils.color

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import com.sun.kmpstartertemplaterefined.core.events.enums.ThemeMode
import com.sun.kmpstartertemplaterefined.ui_utils.composition_locals.LocalThemeMode

@Composable
fun ColorFilter.Companion.lightDarkTint() = tint(
    color = when(LocalThemeMode.current ){
        ThemeMode.LIGHT -> Color.Black
        ThemeMode.DARK -> Color.White
        ThemeMode.SYSTEM -> if (isSystemInDarkTheme()) Color.White else Color.Black
    }
)