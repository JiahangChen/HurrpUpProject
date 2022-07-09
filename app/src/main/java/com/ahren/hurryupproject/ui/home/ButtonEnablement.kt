package com.ahren.hurryupproject.ui.home

import android.content.res.Resources
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.FragmentActivity
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

object ButtonEnablement {
    fun setButtonEnablementOnScreen(isEnabled: Boolean, activity: FragmentActivity, homeViewBinding: FragmentHomeBinding, resources: Resources) {
        val actionBarMenu = activity?.findViewById<BottomNavigationView>(R.id.nav_view)?.menu
        if (isEnabled) {
            homeViewBinding.floatingCreateStationButton.isEnabled = false
            homeViewBinding.stationup.isEnabled = false
            homeViewBinding.stationdown.isEnabled = false
            homeViewBinding.clearallstation.isEnabled = false
            actionBarMenu?.findItem(R.id.navigation_collection)?.isEnabled = false
            actionBarMenu?.findItem(R.id.navigation_setting)?.isEnabled = false
            actionBarMenu?.findItem(R.id.navigation_home)?.isEnabled = false
            actionBarMenu?.findItem(R.id.navigation_collection)?.icon =
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_lock_black_24dp,
                    null
                )
            actionBarMenu?.findItem(R.id.navigation_setting)?.icon =
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_lock_black_24dp,
                    null
                )
            actionBarMenu?.findItem(R.id.navigation_home)?.icon =
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_lock_black_24dp,
                    null
                )
        } else {
            homeViewBinding.floatingCreateStationButton.isEnabled = true
            homeViewBinding.stationup.isEnabled = true
            homeViewBinding.stationdown.isEnabled = true
            homeViewBinding.clearallstation.isEnabled = true
            actionBarMenu?.findItem(R.id.navigation_collection)?.isEnabled = true
            actionBarMenu?.findItem(R.id.navigation_setting)?.isEnabled = true
            actionBarMenu?.findItem(R.id.navigation_home)?.isEnabled = true
            actionBarMenu?.findItem(R.id.navigation_collection)?.icon =
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_like_yellow_24dp,
                    null
                )
            actionBarMenu?.findItem(R.id.navigation_setting)?.icon =
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_setting_yellow_24dp,
                    null
                )
            actionBarMenu?.findItem(R.id.navigation_home)?.icon =
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_home_black_24dp,
                    null
                )
        }
    }
}