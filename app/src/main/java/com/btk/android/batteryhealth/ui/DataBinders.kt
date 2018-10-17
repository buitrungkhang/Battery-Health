package com.btk.android.batteryhealth.ui

import android.view.View
import androidx.databinding.BindingAdapter

class DataBinders {
    @BindingAdapter("appVisible")
    fun setViewVisiableWithAnimation(view: View, visible: Boolean) {
        view.visibility = if (visible) View.VISIBLE else View.GONE
        val distance: Int = view.height
        view.animate().translationY(if (visible) distance.toFloat() else 0f)
    }
}