package com.ahren.hurryupproject.ui.collection.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentCollectionRecycleViewBinding
import com.ahren.hurryupproject.ui.addstation.AddStationActivity
import com.ahren.hurryupproject.ui.addstation.adapter.LineListRecycleViewAdapter
import com.ahren.hurryupproject.ui.collection.adapter.CollectionListRecycleViewAdapter
import com.ahren.hurryupproject.ui.collection.room.database.CollectionDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CollectionRecycleViewFragment : Fragment() {

    private lateinit var mcontext: Context
    private val collectionDao by lazy {
        CollectionDatabase.getInstance(requireContext()).getCollectionDao()
    }
    private lateinit var adapter: CollectionListRecycleViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mcontext = context

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val mBinding = DataBindingUtil.inflate<FragmentCollectionRecycleViewBinding>(
            inflater, R.layout.fragment_collection_recycle_view,container,false
        )
        adapter = CollectionListRecycleViewAdapter(mcontext)

        mBinding.rvCollectionList.adapter = adapter


        GlobalScope.launch (Dispatchers.IO) {
            val collectionList = collectionDao.queryCollection()
            activity?.runOnUiThread(object: Runnable {
                override fun run() {
                    adapter.setCollection(collectionList)
                }
            })
        }

        return mBinding.root
    }


}