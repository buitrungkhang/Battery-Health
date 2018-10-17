package com.btk.android.batteryhealth.ui.splash

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.Module

@Module
class SplashModule {
    fun provideSplashViewModel(
        splashFragment: SplashFragment,
        viewModelProvider: ViewModelProvider.Factory
    ): SplashViewModel = ViewModelProviders.of(splashFragment, viewModelProvider).get(SplashViewModel::class.java)
}