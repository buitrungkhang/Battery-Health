package com.btk.android.batteryhealth.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.btk.android.batteryhealth.R
import com.btk.android.batteryhealth.databinding.ActivityNavControllerBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class NavControllerActivity : DaggerAppCompatActivity() {
    @Inject lateinit var viewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewDataBinding: ActivityNavControllerBinding = DataBindingUtil.setContentView(this, R.layout.activity_nav_controller)
        viewDataBinding.viewModel = viewModel
        viewDataBinding.setLifecycleOwner(this)
        viewDataBinding.executePendingBindings()
    }
}
