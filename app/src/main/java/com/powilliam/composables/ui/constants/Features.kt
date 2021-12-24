package com.powilliam.composables.ui.constants

import android.os.Build

object Features {
    val isDynamicColorSchemeSupported: Boolean = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
}