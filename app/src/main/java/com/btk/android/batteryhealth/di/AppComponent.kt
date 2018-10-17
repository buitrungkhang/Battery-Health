package com.btk.android.batteryhealth.di

import com.btk.android.batteryhealth.App
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

import javax.inject.Singleton

@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, ViewModelModule::class, Binders::class])
@Singleton
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}
