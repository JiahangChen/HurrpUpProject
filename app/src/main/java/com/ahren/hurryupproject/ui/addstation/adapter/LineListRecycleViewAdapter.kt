package com.ahren.hurryupproject.ui.addstation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.LineListDatabindingBinding
import com.ahren.hurryupproject.ui.addstation.bean.LineListBindingData
import com.ahren.hurryupproject.ui.addstation.datareader.DataReader

class LineListRecycleViewAdapter(context: Context) : RecyclerView.Adapter<LineListRecycleViewAdapter.ViewHolder>() {

    private lateinit var lineItemClickListener: IlineItemClickListener
    private var lineListData = ArrayList<LineListBindingData>()

    init {

        lineListData = DataReader.getLineData(context)

    }

    inner class ViewHolder(var dataBinding: LineListDatabindingBinding) : RecyclerView.ViewHolder(dataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val dataBinding = DataBindingUtil.inflate<LineListDatabindingBinding>(
            LayoutInflater.from(parent.context),
            R.layout.line_list_databinding,
            parent,
            false
        )
        return ViewHolder(dataBinding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBinding.lineName = lineListData[position]
        holder.itemView.setOnClickListener {
//            lineListData[position]._id.get()
            lineListData[position].id
                ?.let { lineid -> lineItemClickListener.onLineItemClickListener(position, lineid) }
        }
    }

    override fun getItemCount(): Int {
        return lineListData.size
    }

    interface IlineItemClickListener {
        fun onLineItemClickListener(position: Int, lineid: String)
    }

    fun setLineItemClickListener(lineItemClickListener: IlineItemClickListener) {
        this.lineItemClickListener = lineItemClickListener
    }

}