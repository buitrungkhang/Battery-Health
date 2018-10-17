package com.btk.android.batteryhealth.di

import com.btk.android.batteryhealth.ui.NavControllerActivity
import com.btk.android.batteryhealth.ui.SharedModule
import com.btk.android.batteryhealth.ui.splash.SplashFragment
import com.btk.android.batteryhealth.ui.splash.SplashModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class Binders {
    @ContributesAndroidInjector(modules = [SharedModule::class])
    abstract fun bindNavControllerActivity(): NavControllerActivity

    @ContributesAndroidInjector(modules = [SplashModule::class])
    abstract fun bindSplashFragment(): SplashFragment
}