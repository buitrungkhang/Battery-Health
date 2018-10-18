package com.btk.android.batteryhealth.ui.home

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.Module

@Module
class HomeModule {
    fun provideHomeViewModel(homeFragment: HomeFragment, viewModelFactory: ViewModelProvider.Factory): HomeViewModel = ViewModelProviders.of(homeFragment, viewModelFactory).get(HomeViewModel::class.java)
}
