package com.ahren.hurryupproject.ui.addstation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.ui.addstation.bean.StationListBindingData
import com.ahren.hurryupproject.ui.addstation.fragment.LineRecycleViewFragment
import com.ahren.hurryupproject.ui.addstation.fragment.StationRecycleViewFragment

class AddStationActivity : AppCompatActivity(), LineRecycleViewFragment.LineRecycleviewCallback , StationRecycleViewFragment.StationRecycleviewCallback{

    private val lineRecycleViewFragment = LineRecycleViewFragment()
//    private val stationRecycleViewFragment = StationRecycleViewFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_station)

        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.add(R.id.add_station_fragment,lineRecycleViewFragment, "line")
        fragmentManager.commitAllowingStateLoss()
        title = "Line Name"


    }

    override fun lineSelected(lineid: String) {
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.add(R.id.add_station_fragment,StationRecycleViewFragment(lineid), "station")
        fragmentManager.remove(lineRecycleViewFragment)
        fragmentManager.commitAllowingStateLoss()
        title = "Station Name"
    }

    override fun stationSelected(stationdata: StationListBindingData) {
        val resultIntent = Intent()
        resultIntent.putExtra("stationid",stationdata.stationId)
        resultIntent.putExtra("lineid",stationdata.lineId)
        setResult(Activity.RESULT_OK,resultIntent)
        finish()
    }

}