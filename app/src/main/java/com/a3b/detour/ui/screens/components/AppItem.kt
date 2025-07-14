package com.a3b.detour.ui.screens.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.a3b.detour.model.AppInfo

@Composable
fun AppItem(
    appInfo: AppInfo
) {
    var isChecked by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier.fillMaxWidth()
    ){
        Column(
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
        ) {
            Text(
                text = appInfo.appName, // Replace with actual app name
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = appInfo.packageName,
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Checkbox(
            checked = isChecked, // Replace with actual checked state
            onCheckedChange = {
                isChecked = !isChecked
            },
            modifier = Modifier
                .align(alignment = Alignment.CenterEnd)
        )
    }

}