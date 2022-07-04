package com.ahren.hurryupproject.ui.collection.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentCollectionRecycleViewBinding
import com.ahren.hurryupproject.ui.addstation.AddStationActivity
import com.ahren.hurryupproject.ui.addstation.adapter.LineListRecycleViewAdapter
import com.ahren.hurryupproject.ui.collection.adapter.CollectionListRecycleViewAdapter
import com.ahren.hurryupproject.ui.collection.room.database.CollectionDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

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


        GlobalScope.launch (Dispatchers.Main) {
            val collectionList = withContext(Dispatchers.IO) {
                collectionDao.queryCollection()
            }
            adapter.setCollection(collectionList)
        }

        val view = inflater.inflate(R.layout.fragment_collection_recycle_view, container, false)
        adapter.setCollectionItemClickListener(object: CollectionListRecycleViewAdapter.IcollectionItemClickListener {
            override fun onCollectionItemClickListener(collectionId: Int) {
                GlobalScope.launch (Dispatchers.Main) {
                    // to call collectionStationFromDatabase in homeViewModel and naviagate home
                    Toast.makeText(
                        requireContext(),
                        "Load collection ID" + collectionId,
                        Toast.LENGTH_SHORT
                    ).show()
                }
                findNavController(activity!!.parent, R.id.nav_host_fragment_activity_main).navigate(R.id.action_navigation_collection_to_navigation_home)
            }
//            Navigation.findNavController(view).navigate(R.id.action_navigation_collection_to_navigation_home)
        })

        return mBinding.root
    }


}