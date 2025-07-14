package com.a3b.detour.di

import com.a3b.detour.ui.screens.home.HomeViewModel
import org.koin.android.annotation.KoinViewModel
import org.koin.core.annotation.Module

@Module
class AppModule {
    @KoinViewModel
    fun homeViewModel() : HomeViewModel = HomeViewModel()
}