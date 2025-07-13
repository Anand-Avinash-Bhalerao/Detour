package com.a3b.detour.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSavedStateNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.ui.rememberSceneSetupNavEntryDecorator
import com.a3b.detour.ui.screens.home.HomeScreen

@Composable
fun NavigationRoot() {

    val backStack = rememberNavBackStack<Screen>(Screen.Home)
    NavDisplay(
        backStack = backStack,
        entryDecorators = listOf(
            rememberSavedStateNavEntryDecorator(),
            rememberViewModelStoreNavEntryDecorator(),
            rememberSceneSetupNavEntryDecorator()
        ),
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Screen.Home> {
                HomeScreen(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                )
            }
        }
    )
}