package com.btk.android.batteryhealth.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.btk.android.batteryhealth.R
import com.btk.android.batteryhealth.databinding.FragmentSplashBinding
import com.btk.android.batteryhealth.ui.BaseFragment
import javax.inject.Inject

class SplashFragment : BaseFragment(), SplashNavigator {
    @Inject
    lateinit var viewModel: SplashViewModel
    private lateinit var viewDataBinding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container, false)
        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.navigator = this
        viewDataBinding.viewModel = viewModel
        viewDataBinding.setLifecycleOwner(this)
        viewDataBinding.executePendingBindings()

        sharedViewModel.setNavigationVisible(false)
        viewModel.start()
    }

    override fun openHome() {
        sharedViewModel.setNavigationVisible(true)
        Navigation.findNavController(parent, R.id.container).navigate(R.id.homeFragment)
    }
}
