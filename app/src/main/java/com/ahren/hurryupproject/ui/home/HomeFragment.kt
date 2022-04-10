package com.ahren.hurryupproject.ui.home

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentHomeBinding
import com.ahren.hurryupproject.ui.addstation.AddStationActivity

class HomeFragment : Fragment() {

    private lateinit var register : ActivityResultLauncher<Intent>

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

        register = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK){
                homeViewModel.addStation(requireContext(), result.data?.getStringExtra("lineid")!!, result.data?.getStringExtra("stationid")!!)
                refreshStationList()

            }
        }
        refreshStationList()

        homeViewBinding.floatingCreateStationButton.setOnClickListener {

            register.launch(Intent(requireContext(),AddStationActivity::class.java))

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
            homeViewBinding.textView.text = it[0]._stationName.get()
            homeViewBinding.textView2.text = it[1]._stationName.get()
            homeViewBinding.textView3.text = it[2]._stationName.get()
            homeViewBinding.textView4.text = it[3]._stationName.get()
            homeViewBinding.textView5.text = it[4]._stationName.get()
            homeViewBinding.textView.background = it[0]._backgroundColor.get()
            homeViewBinding.textView2.background = it[1]._backgroundColor.get()
            homeViewBinding.textView3.background = it[2]._backgroundColor.get()
            homeViewBinding.textView4.background = it[3]._backgroundColor.get()
            homeViewBinding.textView5.background = it[4]._backgroundColor.get()
        }
    }
}