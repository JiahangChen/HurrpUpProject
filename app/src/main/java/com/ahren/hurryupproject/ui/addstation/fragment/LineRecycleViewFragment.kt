package com.ahren.hurryupproject.ui.addstation.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentLineRecycleViewBinding
import com.ahren.hurryupproject.ui.addstation.AddStationActivity
import com.ahren.hurryupproject.ui.addstation.adapter.LineListRecycleViewAdapter


class LineRecycleViewFragment : Fragment() {

//    private lateinit var mContext: Context
    private lateinit var lineRecycleviewCallback : LineRecycleviewCallback
    private lateinit var addStationActivity: AddStationActivity
    private lateinit var mcontext: Context

    interface LineRecycleviewCallback {
        fun lineSelected(lineid : String)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        this.mContext = requireContext()
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
        val mBinding = DataBindingUtil.inflate<FragmentLineRecycleViewBinding>(
            inflater, R.layout.fragment_line_recycle_view,container,false
        )
        val adapter = LineListRecycleViewAdapter(mcontext)

        mBinding.rvLineList.adapter = adapter
        adapter.setLineItemClickListener(object: LineListRecycleViewAdapter.IlineItemClickListener {
            override fun onLineItemClickListener(position: Int, lineid: String) {
                addStationActivity.lineSelected(lineid)
//                Toast.makeText(mContext, position.toString() + id, Toast.LENGTH_SHORT).show()

            }
        })
        return mBinding.root

//        return inflater.inflate(R.layout.fragment_line_recycle_view, container, false)
    }
}



