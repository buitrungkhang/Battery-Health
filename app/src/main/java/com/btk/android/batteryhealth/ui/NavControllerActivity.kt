package com.btk.android.batteryhealth.ui

import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.btk.android.batteryhealth.R
import com.btk.android.batteryhealth.databinding.ActivityNavControllerBinding
import dagger.android.support.DaggerAppCompatActivity
import org.greenrobot.eventbus.EventBus
import javax.inject.Inject

class NavControllerActivity : DaggerAppCompatActivity() {
    @Inject lateinit var viewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewDataBinding: ActivityNavControllerBinding = DataBindingUtil.setContentView(this, R.layout.activity_nav_controller)
        viewDataBinding.viewModel = viewModel
        viewDataBinding.setLifecycleOwner(this)
        viewDataBinding.executePendingBindings()

        registerBatteryChange()
    }

    fun registerBatteryChange() {
        val batteryStatus: Intent? = IntentFilter(Intent.ACTION_BATTERY_CHANGED).let { filter ->
            registerReceiver(null, filter)
        }

        val batteryPct: Float? = batteryStatus?.let { intent ->
            val level: Int = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
            val scale: Int = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1)
            level / scale.toFloat()
        }

        EventBus.getDefault().post(batteryPct)
    }
}
