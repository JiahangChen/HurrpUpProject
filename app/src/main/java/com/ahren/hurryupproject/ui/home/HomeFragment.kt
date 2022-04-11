package com.ahren.hurryupproject.ui.home

import android.app.Activity.RESULT_OK
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.Dimension.DP
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.marginTop
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ahren.hurryupproject.databinding.FragmentHomeBinding
import com.ahren.hurryupproject.ui.addstation.AddStationActivity


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

        homeViewBinding.floatingCreateStationButton.setOnClickListener {

            register.launch(Intent(requireContext(), AddStationActivity::class.java))

        }

        homeViewBinding.stationup.setOnClickListener {
            moveStatePosition(false)
        }

        homeViewBinding.stationdown.setOnClickListener {
            moveStatePosition(true)
        }

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

    fun moveStatePosition(direction: Boolean) {
        val StateMovingValue by lazy { homeViewBinding.StationNum2.height + homeViewBinding.StationNum2.marginTop }

        val marginTopChangedVale by lazy {
            if (direction) {
                homeViewModel.getDownState(StateMovingValue)
            } else {
                homeViewModel.getUpState(StateMovingValue)
            }
        }
        val c = ConstraintSet()
        c.clone(homeViewBinding.homeconstraintlayout)
        c.connect(
            homeViewBinding.youarehere.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP,
            homeViewBinding.youarehere.marginTop + marginTopChangedVale
        )
        c.applyTo(homeViewBinding.homeconstraintlayout)


    }

}