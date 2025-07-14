package com.a3b.detour.ui.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.a3b.detour.model.AppInfo

@Composable
fun AppItem(
    appInfo: AppInfo
) {
    var isChecked by remember { mutableStateOf(false) }
    val painter = rememberAsyncImagePainter(appInfo.icon)
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(bottom = 12.dp)
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.size(48.dp)
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 12.dp)
        ) {
            Text(
                text = appInfo.appName, // Replace with actual app name
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = appInfo.packageName,
                style = MaterialTheme.typography.bodySmall
            )
        }
        Checkbox(
            checked = isChecked, // Replace with actual checked state
            onCheckedChange = {
                isChecked = !isChecked
            }
        )
    }

}