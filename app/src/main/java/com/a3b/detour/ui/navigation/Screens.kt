package com.a3b.detour.ui.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Screen : NavKey {
    @Serializable
    data object Home : Screen()

}