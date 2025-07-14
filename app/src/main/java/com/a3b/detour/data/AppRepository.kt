package com.a3b.detour.data

import android.content.Context
import android.content.pm.PackageManager
import com.a3b.detour.model.AppInfo

class AppRepository(private val context: Context) {
    fun getInstalledApps(): List<AppInfo> {
        val pm = context.packageManager
        return pm.getInstalledApplications(PackageManager.GET_META_DATA)
            .filter { pm.getLaunchIntentForPackage(it.packageName) != null }
            .map {
                AppInfo(
                    appName = pm.getApplicationLabel(it).toString(),
                    packageName = it.packageName,
                    icon = pm.getApplicationIcon(it)
                )
            }
            .sortedBy { it.appName.lowercase() }
    }
}