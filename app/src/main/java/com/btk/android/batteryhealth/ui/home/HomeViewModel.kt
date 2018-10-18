package com.btk.android.batteryhealth.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor() : ViewModel() {
    val batteryPercent: MutableLiveData<Float> = MutableLiveData()

    lateinit var navigator: HomeNavigator

    fun start() {
        batteryPercent.postValue(0f)
    }

    fun updateBatteryChange(batteryPer: Float) = {
        batteryPercent.postValue(batteryPer)
    }
}
