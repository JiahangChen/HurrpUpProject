package com.ahren.hurryupproject.ui.home

import android.content.Context
import android.content.res.Resources
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.marginTop
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

object HomeFragmentHelper {
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

    fun moveStatePosition(homeViewBinding: FragmentHomeBinding, homeViewModel: HomeViewModel, direction: Int) {
        homeViewBinding.StationNum2.post {
            val StateMovingValue by lazy { homeViewBinding.StationNum2.height + homeViewBinding.StationNum2.marginTop }
            val marginTopChangedVale by lazy {
                homeViewModel.moveStatePosition(direction, StateMovingValue)
            }
            val constraintSet = ConstraintSet()
            constraintSet.clone(homeViewBinding.homeconstraintlayout)
            constraintSet.connect(
                homeViewBinding.youarehere.id,
                ConstraintSet.TOP,
                homeViewBinding.horizontalguideline1.id,
                ConstraintSet.TOP,
                marginTopChangedVale
            )
            constraintSet.applyTo(homeViewBinding.homeconstraintlayout)
        }
    }

    fun refreshStationList(homeViewBinding: FragmentHomeBinding, homeViewModel: HomeViewModel, viewLifecycleOwner: LifecycleOwner) {
        homeViewModel.getStationList().observe(viewLifecycleOwner) {
            homeViewBinding.StationNum1.text = it[0]._stationName.get()
            homeViewBinding.StationNum2.text = it[1]._stationName.get()
            homeViewBinding.StationNum3.text = it[2]._stationName.get()
            homeViewBinding.StationNum4.text = it[3]._stationName.get()
            homeViewBinding.StationNum5.text = it[4]._stationName.get()
            homeViewBinding.StationNum1.background = it[0]._backgroundColor.get()
            homeViewBinding.StationNum2.background = it[1]._backgroundColor.get()
            homeViewBinding.StationNum3.background = it[2]._backgroundColor.get()
            homeViewBinding.StationNum4.background = it[3]._backgroundColor.get()
            homeViewBinding.StationNum5.background = it[4]._backgroundColor.get()
        }
    }

    fun makeButtonDeletable(homeViewBinding: FragmentHomeBinding, homeViewModel: HomeViewModel, viewLifecycleOwner: LifecycleOwner, context: Context) {
        homeViewBinding.StationNum1.setOnLongClickListener {
            if (!homeViewBinding.startapp.isChecked) {
                val removedStation = homeViewModel.deleteStation(1)
                Toast.makeText(
                    context,
                    "Successfully removed" + removedStation._stationName.get(),
                    Toast.LENGTH_SHORT
                ).show()
                refreshStationList(homeViewBinding, homeViewModel, viewLifecycleOwner)
                moveStatePosition(homeViewBinding, homeViewModel, 0)
            }
            true

        }
        homeViewBinding.StationNum2.setOnLongClickListener {
            if (!homeViewBinding.startapp.isChecked) {
                val removedStation = homeViewModel.deleteStation(2)
                Toast.makeText(
                    context,
                    "Successfully removed" + removedStation._stationName.get(),
                    Toast.LENGTH_SHORT
                ).show()
                refreshStationList(homeViewBinding, homeViewModel, viewLifecycleOwner)
                moveStatePosition(homeViewBinding, homeViewModel, 0)
            }
            true
        }
        homeViewBinding.StationNum3.setOnLongClickListener {
            if (!homeViewBinding.startapp.isChecked) {
                val removedStation = homeViewModel.deleteStation(3)
                Toast.makeText(
                    context,
                    "Successfully removed" + removedStation._stationName.get(),
                    Toast.LENGTH_SHORT
                ).show()
                refreshStationList(homeViewBinding, homeViewModel, viewLifecycleOwner)
                moveStatePosition(homeViewBinding, homeViewModel, 0)
            }
            true
        }
        homeViewBinding.StationNum4.setOnLongClickListener {
            if (!homeViewBinding.startapp.isChecked) {
                val removedStation = homeViewModel.deleteStation(4)
                Toast.makeText(
                    context,
                    "Successfully removed" + removedStation._stationName.get(),
                    Toast.LENGTH_SHORT
                ).show()
                refreshStationList(homeViewBinding, homeViewModel, viewLifecycleOwner)
                moveStatePosition(homeViewBinding, homeViewModel, 0)
            }
            true
        }
        homeViewBinding.StationNum5.setOnLongClickListener {
            if (!homeViewBinding.startapp.isChecked) {
                val removedStation = homeViewModel.deleteStation(5)
                Toast.makeText(
                    context,
                    "Successfully removed" + removedStation._stationName.get(),
                    Toast.LENGTH_SHORT
                ).show()
                refreshStationList(homeViewBinding, homeViewModel, viewLifecycleOwner)
                moveStatePosition(homeViewBinding, homeViewModel, 0)
            }
            true
        }
    }
}