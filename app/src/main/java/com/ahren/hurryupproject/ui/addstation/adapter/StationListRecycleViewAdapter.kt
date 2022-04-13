package com.ahren.hurryupproject.ui.addstation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.StationListDatabindingBinding
import com.ahren.hurryupproject.ui.addstation.bean.StationListBindingData
import com.ahren.hurryupproject.ui.addstation.datareader.LineDataReader
import com.ahren.hurryupproject.ui.addstation.datareader.StationDataReader

class StationListRecycleViewAdapter(context: Context, private val lineid : String) : RecyclerView.Adapter<StationListRecycleViewAdapter.ViewHolder>() {

    private lateinit var stationItemClickListener: StationListRecycleViewAdapter.IstationItemClickListener
    private val stationListData by lazy { StationDataReader(context).getStationList(lineid) }

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
            stationListData[position]
                ?.let { stationdata -> stationItemClickListener.onStationItemClickListener(position, stationdata) }
        }
    }

    override fun getItemCount(): Int {
        return stationListData.size
    }

    interface IstationItemClickListener {
        fun onStationItemClickListener(position: Int, stationdata: StationListBindingData)
    }

    fun setStationItemClickListener(stationItemClickListener: IstationItemClickListener) {
        this.stationItemClickListener = stationItemClickListener
    }

}