package com.a3b.detour

import android.app.Application
import com.a3b.detour.di.initKoin
import org.koin.android.ext.koin.androidContext

class DetourApplication : Application() {
    override fun onCreate() {
        super.onCreate()
         initKoin {
            androidContext(this@DetourApplication)
         }
    }
}