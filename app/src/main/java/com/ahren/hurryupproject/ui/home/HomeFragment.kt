package com.ahren.hurryupproject.ui.home

import android.Manifest
import android.app.Activity.RESULT_OK
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.marginTop
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentHomeBinding
import com.ahren.hurryupproject.service.LocationReminderService
import com.ahren.hurryupproject.ui.addstation.AddStationActivity
import com.ahren.hurryupproject.ui.collection.room.database.CollectionDatabase
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeFragment : Fragment() {

    private lateinit var register: ActivityResultLauncher<Intent>

    private val homeViewModel: HomeViewModel by activityViewModels()
    private var _homeViewBinding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val homeViewBinding get() = _homeViewBinding!!

    private val collectionDao by lazy {
        CollectionDatabase.getInstance(requireContext()).getCollectionDao()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        super.onStart()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _homeViewBinding = FragmentHomeBinding.inflate(inflater, container, false)

        getLocationPermission()

        val homeReceiver = HomeFragmentReceiver(homeViewBinding, homeViewModel, requireActivity(), resources)
        var filter = IntentFilter()
        filter.addAction("change_location")
        activity?.registerReceiver(homeReceiver, filter)

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
                ButtonEnablement.setButtonEnablementOnScreen(isChecked, activity!!, homeViewBinding, resources)
                homeViewModel.switchAppStart()
                if (isChecked) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        requireActivity().applicationContext.startForegroundService(Intent(context, LocationReminderService::class.java))

                    } else {
                        requireActivity().applicationContext.startService(Intent(context, LocationReminderService::class.java))
                    }
                    //TODO(Create the Service)
                } else {
                    requireActivity().applicationContext.stopService(Intent(context, LocationReminderService::class.java))

                    //TODO(Close the Service)
                }
            }
        })

        makeButtonDeletable()
        homeViewBinding.clearallstation.setOnClickListener {
            homeViewModel.deleteAllStation()
            refreshStationList()
            moveStatePosition(0)
        }

        homeViewBinding.collectionButton.setOnClickListener {
            homeViewModel.collectStationToDatabase(requireContext())
        }

        return homeViewBinding.root
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun getLocationPermission() {
        val locationPermissionRequest = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { permissions ->
            when {
                permissions.getOrDefault(Manifest.permission.ACCESS_FINE_LOCATION, false) -> {
                    // Precise location access granted.
                }
                permissions.getOrDefault(Manifest.permission.ACCESS_COARSE_LOCATION, false) -> {
                    // Only approximate location access granted.
                } else -> {
                // No location access granted.
            }
            }
        }

        locationPermissionRequest.launch(arrayOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_BACKGROUND_LOCATION))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _homeViewBinding = null
        requireActivity().applicationContext.stopService(Intent(context, LocationReminderService::class.java))
    }


    fun moveStatePosition(direction: Int) {
//        val StateMovingValue by lazy { homeViewBinding.StationNum2.height + homeViewBinding.StationNum2.marginTop }
        val StateMovingValue: Int = 120 + 90
        // direction 1 down, 2 up, 0 refresh button, 3 now button
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

    fun makeButtonDeletable() {
        homeViewBinding.StationNum1.setOnLongClickListener {
            if (!homeViewBinding.startapp.isChecked) {
                val removedStation = homeViewModel.deleteStation(1)
                Toast.makeText(
                    requireContext(),
                    "Successfully removed" + removedStation._stationName.get(),
                    Toast.LENGTH_SHORT
                ).show()
                refreshStationList()
                moveStatePosition(0)
            }
            true

        }
        homeViewBinding.StationNum2.setOnLongClickListener {
            if (!homeViewBinding.startapp.isChecked) {
                val removedStation = homeViewModel.deleteStation(2)
                Toast.makeText(
                    requireContext(),
                    "Successfully removed" + removedStation._stationName.get(),
                    Toast.LENGTH_SHORT
                ).show()
                refreshStationList()
                moveStatePosition(0)
            }
            true
        }
        homeViewBinding.StationNum3.setOnLongClickListener {
            if (!homeViewBinding.startapp.isChecked) {
                val removedStation = homeViewModel.deleteStation(3)
                Toast.makeText(
                    requireContext(),
                    "Successfully removed" + removedStation._stationName.get(),
                    Toast.LENGTH_SHORT
                ).show()
                refreshStationList()
                moveStatePosition(0)
            }
            true
        }
        homeViewBinding.StationNum4.setOnLongClickListener {
            if (!homeViewBinding.startapp.isChecked) {
                val removedStation = homeViewModel.deleteStation(4)
                Toast.makeText(
                    requireContext(),
                    "Successfully removed" + removedStation._stationName.get(),
                    Toast.LENGTH_SHORT
                ).show()
                refreshStationList()
                moveStatePosition(0)
            }
            true
        }
        homeViewBinding.StationNum5.setOnLongClickListener {
            if (!homeViewBinding.startapp.isChecked) {
                val removedStation = homeViewModel.deleteStation(5)
                Toast.makeText(
                    requireContext(),
                    "Successfully removed" + removedStation._stationName.get(),
                    Toast.LENGTH_SHORT
                ).show()
                refreshStationList()
                moveStatePosition(0)
            }
            true
        }
    }



}