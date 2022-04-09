package com.ahren.hurryupproject.ui.home

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.graphics.drawable.ColorDrawable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ahren.hurryupproject.MyApplication
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.ui.addstation.bean.StationListBindingData
import com.ahren.hurryupproject.ui.addstation.bean.StationListDataClass
import com.ahren.hurryupproject.ui.addstation.datareader.StationDataReader

class HomeDataBinding : ViewModel(){

    private var _stationlist = ArrayList<MutableLiveData<StationListBindingData>>()
    @SuppressLint("ResourceAsColor")
    private val emptyStationData = StationListBindingData("","","",0.00,0.00, ColorDrawable(R.color.white))

    fun addStation(context: Context, lineid:String, stationid: String) {
        if (_stationlist.size < 5) {

//            _stationlist.add(MutableLiveData<StationListBindingData>(stationData))
            StationDataReader(context).getStation(lineid, stationid)


        }
    }

    fun getStation(number: Int): StationListBindingData{
        if (number > _stationlist.size){
            return emptyStationData
        }else {
            return _stationlist[number - 1].value!!
        }
    }
}