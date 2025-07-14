package com.a3b.detour.ui.screens.home

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.koin.compose.viewmodel.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = koinViewModel(),
) {
    // add a scaffold with a top app bar and a text
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Home") }
            )
        },
        content = { paddingValues ->
            Row (
                modifier = modifier
                    .padding(paddingValues)
                    .padding(16.dp)
            ){
                Text(
                    text = "Welcome to Detour!",
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    )


}