package com.ahren.hurryupproject.ui.collection.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.CollectionListItemDatabindingBinding
import com.ahren.hurryupproject.ui.addstation.adapter.LineListRecycleViewAdapter
import com.ahren.hurryupproject.ui.addstation.helper.PatternHelper
import com.ahren.hurryupproject.ui.collection.bean.CollectionListBindingData
import com.ahren.hurryupproject.ui.collection.room.database.CollectionDatabase
import com.ahren.hurryupproject.ui.collection.room.entity.CollectionEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.NonDisposableHandle.parent
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CollectionListRecycleViewAdapter(context: Context): RecyclerView.Adapter<CollectionListRecycleViewAdapter.ViewHolder>() {
    private val collectionListData = mutableListOf<CollectionListBindingData>()
    private val collectionDao by lazy {
        CollectionDatabase.getInstance(context).getCollectionDao()
    }
    private lateinit var collectionItemClickListener: CollectionListRecycleViewAdapter.IcollectionItemClickListener
    private lateinit var mContext: Context

    @SuppressLint("NotifyDataSetChanged")
    fun setCollection (collection: List<CollectionEntity>) {
        if (collection.isNotEmpty()) {
            for (collectionItem in collection) {
                collectionListData.add(CollectionListBindingData(collectionItem.id,collectionItem.customDescription,collectionItem.stationCombineDisplayName,PatternHelper.getLineColor(collectionItem.station1LineNumber!!)))
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
        mContext = parent.context

        return ViewHolder(dataBinding)

    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.dataBinding.collectionName = collectionListData[position]
        holder.itemView.setOnClickListener {
            collectionListData[position]._collectionId.get()
                ?.let { collectionId -> collectionItemClickListener.onCollectionItemClickListener(collectionId) }
        }
        holder.itemView.setOnLongClickListener {
            GlobalScope.launch (Dispatchers.IO) {
                collectionDao.deleteCollection(CollectionEntity(collectionListData[position]._collectionId.get()!!))
                collectionListData.removeAt(position)
                withContext(Dispatchers.Main) {
                    notifyDataSetChanged()
                    Toast.makeText(
                        mContext,
                        "Successfully Delete Collection",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            true
        }

    }

    override fun getItemCount(): Int {
        return collectionListData.size
    }

    interface IcollectionItemClickListener {
        fun onCollectionItemClickListener(collectionId: Int)
    }

    fun setCollectionItemClickListener(collectionItemClickListener: CollectionListRecycleViewAdapter.IcollectionItemClickListener) {
        this.collectionItemClickListener = collectionItemClickListener
    }

}