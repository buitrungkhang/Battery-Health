package com.btk.android.batteryhealth.ui

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerFragment

abstract class BaseFragment: DaggerFragment() {
    protected lateinit var parent: NavControllerActivity
    protected lateinit var sharedViewModel: SharedViewModel

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        if (context is NavControllerActivity) parent = context
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedViewModel = ViewModelProviders.of(parent).get(SharedViewModel::class.java)
    }
}