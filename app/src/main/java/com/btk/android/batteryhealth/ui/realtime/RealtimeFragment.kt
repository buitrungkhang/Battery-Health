package com.btk.android.batteryhealth.ui.realtime

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.btk.android.batteryhealth.R

class RealtimeFragment : Fragment() {

    private var mViewModel: RealtimeViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_realtime, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProviders.of(this).get(RealtimeViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {

        fun newInstance(): RealtimeFragment {
            return RealtimeFragment()
        }
    }

}
