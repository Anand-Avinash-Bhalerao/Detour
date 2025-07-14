package com.a3b.detour.di

import com.a3b.detour.data.AppRepository
import com.a3b.detour.ui.screens.home.HomeViewModel
import org.koin.android.annotation.KoinViewModel
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
class AppModule {

    @Single
    fun provideAppRepository(context: android.content.Context): AppRepository {
        return AppRepository(context)
    }

    @KoinViewModel
    fun homeViewModel(appRepository: AppRepository) : HomeViewModel = HomeViewModel(
        appRepository = appRepository
    )
}