package com.a3b.detour.ui.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.a3b.detour.ui.screens.components.AppItem
import org.koin.compose.viewmodel.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = koinViewModel(),
) {
    val appList by viewModel.apps.collectAsState()

    // add a scaffold with a top app bar and a text
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detour") }
            )
        },
        content = { paddingValues ->

            Surface(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(start = 8.dp, end = 8.dp)
                    .fillMaxSize()
            ) {

                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp)
                ) {
                    items(appList) { app ->
                        AppItem(app)
                    }
                }
            }
        }
    )
}