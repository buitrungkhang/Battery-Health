package com.btk.android.batteryhealth.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SharedViewModel @Inject constructor(): ViewModel() {
    var showNavigationBottomBar: MutableLiveData<Boolean> = MutableLiveData()

    fun setNavigationVisible(visible: Boolean) {
        showNavigationBottomBar.postValue(visible)
    }
}
