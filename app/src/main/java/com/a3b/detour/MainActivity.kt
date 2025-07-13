package com.a3b.detour

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.a3b.detour.ui.navigation.NavigationRoot
import com.a3b.detour.ui.theme.DetourTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DetourTheme {
                NavigationRoot()
            }
        }
    }
}