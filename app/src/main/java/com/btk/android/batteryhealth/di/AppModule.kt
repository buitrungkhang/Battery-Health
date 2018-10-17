package com.btk.android.batteryhealth.di

import android.content.Context
import com.btk.android.batteryhealth.App
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    internal fun provideContext(app: App): Context {
        return app.applicationContext
    }
}
