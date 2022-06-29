package com.ahren.hurryupproject.ui.collection.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.CollectionListItemDatabindingBinding
import com.ahren.hurryupproject.ui.collection.bean.CollectionListBindingData
import com.ahren.hurryupproject.ui.collection.room.database.CollectionDatabase
import com.ahren.hurryupproject.ui.collection.room.entity.CollectionEntity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CollectionListRecycleViewAdapter(context: Context): RecyclerView.Adapter<CollectionListRecycleViewAdapter.ViewHolder>() {
    private val collectionListData = mutableListOf<CollectionListBindingData>()
    private val collectionDao by lazy {
        CollectionDatabase.getInstance(context).getCollectionDao()
    }

    fun setCollection (collection: List<CollectionEntity>) {
        if (collection.isNotEmpty()) {
            for (collectionItem in collection) {
                collectionListData.add(CollectionListBindingData(collectionItem.station1Id,collectionItem.station1Id,collectionItem.station1Id))
            }
            notifyDataSetChanged()
        }
    }

    inner class ViewHolder(var dataBinding: CollectionListItemDatabindingBinding) : RecyclerView.ViewHolder(dataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val dataBinding = DataBindingUtil.inflate<CollectionListItemDatabindingBinding>(
            LayoutInflater.from(parent.context),
            R.layout.collection_list_item_databinding,
            parent,
            false
        )

        return ViewHolder(dataBinding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.dataBinding.collectionName = collectionListData[position]

    }

    override fun getItemCount(): Int {
        return collectionListData.size
    }


}