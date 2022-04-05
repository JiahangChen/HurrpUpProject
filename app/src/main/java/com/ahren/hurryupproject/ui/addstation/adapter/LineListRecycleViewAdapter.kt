package com.ahren.hurryupproject.ui.addstation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.LineListDatabindingBinding
import com.ahren.hurryupproject.ui.addstation.bean.LineListBindingData

class LineListRecycleViewAdapter : RecyclerView.Adapter<LineListRecycleViewAdapter.ViewHolder>() {

    private lateinit var lineItemClickListener: IlineItemClickListener
    private val lineListData = ArrayList<LineListBindingData>()

    init {
        for (i in 1..3) {
            lineListData.add(LineListBindingData("$i","Line $i "))
        }
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
            lineListData[position]._id.get()
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