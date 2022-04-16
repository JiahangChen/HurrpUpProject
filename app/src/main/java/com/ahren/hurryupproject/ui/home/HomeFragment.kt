package com.ahren.hurryupproject.ui.home

import android.annotation.SuppressLint
import android.app.Activity.RESULT_OK
import android.content.ClipData
import android.content.ClipData.Item
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.Dimension.DP
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.marginTop
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentHomeBinding
import com.ahren.hurryupproject.ui.addstation.AddStationActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeFragment : Fragment() {

    private lateinit var register: ActivityResultLauncher<Intent>

    private val homeViewModel: HomeViewModel by activityViewModels()
    private var _homeViewBinding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val homeViewBinding get() = _homeViewBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _homeViewBinding = FragmentHomeBinding.inflate(inflater, container, false)

        register =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                if (result.resultCode == RESULT_OK) {
                    homeViewModel.addStation(
                        requireContext(),
                        result.data?.getStringExtra("lineid")!!,
                        result.data?.getStringExtra("stationid")!!
                    )
                    refreshStationList()

                }
            }
        refreshStationList()
        moveStatePosition(0)

        homeViewBinding.floatingCreateStationButton.setOnClickListener {
            if (homeViewModel.getAvailableStationNumber() < 5) {
                register.launch(Intent(requireContext(), AddStationActivity::class.java))
            } else {
                Toast.makeText(requireContext(), "Too Much Station", Toast.LENGTH_SHORT).show()
            }
        }

        homeViewBinding.stationup.setOnClickListener {
            moveStatePosition(2)
        }

        homeViewBinding.stationdown.setOnClickListener {
            moveStatePosition(1)
        }

        homeViewBinding.startapp.isChecked = homeViewModel.getAppStartSwitch()

        homeViewBinding.startapp.setOnCheckedChangeListener(object :
            CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(switchView: CompoundButton?, isChecked: Boolean) {
                setButtonEnablementOnScreen(isChecked)
                homeViewModel.switchAppStart()
            }
        })

        return homeViewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _homeViewBinding = null
    }

    fun refreshStationList() {
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

    fun moveStatePosition(direction: Int) {
        val StateMovingValue by lazy { homeViewBinding.StationNum2.height + homeViewBinding.StationNum2.marginTop }

        // direction 1 down, 2 up, 0 refresh button
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

    fun setButtonEnablementOnScreen(isEnabled: Boolean) {
        val actionBarMenu = activity?.findViewById<BottomNavigationView>(R.id.nav_view)?.menu
        if (isEnabled) {
            homeViewBinding.floatingCreateStationButton.isEnabled = false
            homeViewBinding.stationup.isEnabled = false
            homeViewBinding.stationdown.isEnabled = false
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