package com.ahren.hurryupproject.ui.addstation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.StationListDatabindingBinding
import com.ahren.hurryupproject.ui.addstation.bean.StationListBindingData

class StationListRecycleViewAdapter : RecyclerView.Adapter<StationListRecycleViewAdapter.ViewHolder>() {

    private lateinit var stationItemClickListener: StationListRecycleViewAdapter.IstationItemClickListener
    private val stationListData = ArrayList<StationListBindingData>()

    init {
        for (i in 1..3) {
            stationListData.add(StationListBindingData("$i","Station $i "))
        }
    }

    inner class ViewHolder(var dataBinding: StationListDatabindingBinding) : RecyclerView.ViewHolder(dataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val dataBinding = DataBindingUtil.inflate<StationListDatabindingBinding>(
            LayoutInflater.from(parent.context),
            R.layout.station_list_databinding,
            parent,
            false
        )
        return ViewHolder(dataBinding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBinding.stationName = stationListData[position]
        holder.itemView.setOnClickListener {
            stationListData[position]._id.get()
                ?.let { stationid -> stationItemClickListener.onStationItemClickListener(position, stationid) }
        }
    }

    override fun getItemCount(): Int {
        return stationListData.size
    }

    interface IstationItemClickListener {
        fun onStationItemClickListener(position: Int, stationid: String)
    }

    fun setStationItemClickListener(stationItemClickListener: IstationItemClickListener) {
        this.stationItemClickListener = stationItemClickListener
    }

}