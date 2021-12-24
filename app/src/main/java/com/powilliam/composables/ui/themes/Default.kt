package com.powilliam.composables.ui.themes

import android.content.Context
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.powilliam.composables.ui.constants.Features

@Composable
fun DefaultMaterialTheme(
    context: () -> Context,
    isDark: Boolean = isSystemInDarkTheme(),
    isDynamicColorSchemeSupported: Boolean = Features.isDynamicColorSchemeSupported,
    content: @Composable () -> Unit
) {
    val indication = rememberRipple()

    val colorScheme = when {
        isDark and isDynamicColorSchemeSupported -> dynamicDarkColorScheme(context())
        !isDark and isDynamicColorSchemeSupported -> dynamicLightColorScheme(context())
        isDark and !isDynamicColorSchemeSupported -> darkColorScheme()
        else -> lightColorScheme()
    }

    MaterialTheme(colorScheme) {
        CompositionLocalProvider(LocalIndication provides indication) {
            content()
        }
    }
}