package com.btk.android.batteryhealth.ui.splash

import android.os.Handler
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SplashViewModel @Inject constructor() : ViewModel() {
    lateinit var navigator: SplashNavigator

    fun start() {
        val handler = Handler()
        handler.postDelayed({ navigator.openHome() }, 3000)
    }
}
