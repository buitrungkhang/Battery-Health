package com.btk.android.batteryhealth.ui.history

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.btk.android.batteryhealth.R

class HistoryFragment : Fragment() {

    private var mViewModel: HistoryViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_history, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProviders.of(this).get(HistoryViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {

        fun newInstance(): HistoryFragment {
            return HistoryFragment()
        }
    }

}
