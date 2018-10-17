package com.btk.android.batteryhealth.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.greenrobot.eventbus.EventBus
import javax.inject.Inject

class HomeViewModel @Inject constructor(): ViewModel() {
    val batteryPercent: MutableLiveData<Float> = MutableLiveData()

    fun start() {

    }
}
