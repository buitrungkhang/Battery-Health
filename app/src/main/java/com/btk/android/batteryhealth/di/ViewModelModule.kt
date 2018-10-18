package com.btk.android.batteryhealth.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.btk.android.batteryhealth.ui.SharedViewModel
import com.btk.android.batteryhealth.ui.ViewModelFactory
import com.btk.android.batteryhealth.ui.ViewModelKey
import com.btk.android.batteryhealth.ui.home.HomeViewModel
import com.btk.android.batteryhealth.ui.splash.SplashViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(SharedViewModel::class)
    abstract fun bindSharedViewModel(sharedViewModel: SharedViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun bindSplashViewModel(splashViewModel: SplashViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}