package com.ahren.hurryupproject.ui.addstation.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentStationRecycleViewBinding
import com.ahren.hurryupproject.ui.addstation.AddStationActivity
import com.ahren.hurryupproject.ui.addstation.adapter.StationListRecycleViewAdapter
import com.ahren.hurryupproject.ui.addstation.bean.StationListBindingData


class StationRecycleViewFragment(private val lineid : String) : Fragment() {
    private lateinit var mContext: Context
    private lateinit var addStationActivity: AddStationActivity
    private lateinit var mcontext: Context

    interface StationRecycleviewCallback {
        fun stationSelected(stationdata : StationListBindingData)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.mContext = requireContext()

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mcontext = context
        addStationActivity= context as AddStationActivity

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val adapter by lazy { StationListRecycleViewAdapter(mcontext, lineid) }
        val mBinding = DataBindingUtil.inflate<FragmentStationRecycleViewBinding>(
            inflater, R.layout.fragment_station_recycle_view, container, false
        )

        mBinding.rvStationList.adapter = adapter
        adapter.setStationItemClickListener(object :
            StationListRecycleViewAdapter.IstationItemClickListener {
            override fun onStationItemClickListener(position: Int, stationdata: StationListBindingData) {
                addStationActivity.stationSelected(stationdata)
                Toast.makeText(mContext, "Successfully add " + stationdata._stationName.get().toString(), Toast.LENGTH_SHORT).show()


            }
        })
        return mBinding.root

//        return inflater.inflate(R.layout.fragment_line_recycle_view, container, false)
    }

}