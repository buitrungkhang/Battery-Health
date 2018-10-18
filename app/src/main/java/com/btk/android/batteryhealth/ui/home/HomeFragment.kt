package com.btk.android.batteryhealth.ui.home

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.btk.android.batteryhealth.R
import com.btk.android.batteryhealth.databinding.FragmentHomeBinding
import com.btk.android.batteryhealth.ui.BaseFragment
import javax.inject.Inject

class HomeFragment : BaseFragment(), HomeNavigator {
    @Inject
    lateinit var viewModel: HomeViewModel
    private lateinit var viewDataBinding: FragmentHomeBinding
    private val batteryReceiver: BatteryReceiver = BatteryReceiver()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.start()
        viewDataBinding.viewModel = viewModel

        parent.registerReceiver(batteryReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
    }

    override fun onDestroy() {
        parent.unregisterReceiver(batteryReceiver)
        super.onDestroy()
    }

    inner class BatteryReceiver: BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            if (intent!!.action != Intent.ACTION_BATTERY_CHANGED)
                return

            val level: Int = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
            val scale: Int = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1)
            val batteryPct: Float? = level / scale.toFloat()
            Log.d("NNNN", batteryPct.toString())
            viewModel.updateBatteryChange(batteryPct!!)
        }
    }
}
