package com.btk.android.batteryhealth.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.Module

@Module
class SharedModule {
    fun provideSharedViewModel(navControllerActivity: NavControllerActivity, viewModelFactory: ViewModelProvider.Factory): SharedViewModel = ViewModelProviders.of(navControllerActivity, viewModelFactory).get(SharedViewModel::class.java)
}