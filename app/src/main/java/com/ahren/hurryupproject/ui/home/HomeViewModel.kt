package com.ahren.hurryupproject.ui.home

import android.annotation.SuppressLint
import android.app.Application
import android.content.ContentValues.TAG
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.util.TypedValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ahren.hurryupproject.MyApplication
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentHomeBinding
import com.ahren.hurryupproject.ui.addstation.bean.StationListBindingData
import com.ahren.hurryupproject.ui.addstation.bean.StationListDataClass
import com.ahren.hurryupproject.ui.addstation.datareader.StationDataReader

class HomeViewModel(application : Application) : AndroidViewModel(application) {

    @SuppressLint("ResourceAsColor")
    private var emptyStationData = StationListBindingData("","","",0.00,0.00, ColorDrawable(0x3ccccccc), true)
    val _stationlist by lazy {
        MutableLiveData(arrayListOf(emptyStationData, emptyStationData, emptyStationData, emptyStationData, emptyStationData))
    }
    private var stateButtonPosition: Int = 0
    private var startAppSwitched : Boolean = false
    fun addStation(context: Context, lineid:String, stationid: String) {
        for ( i in 0 until _stationlist.value!!.size) {
            if (_stationlist.value!![i].isEmpty){
                _stationlist.value!![i] = StationDataReader(context).getStation(lineid, stationid)
                break
            }
        }
    }

    fun getStation(number: Int): StationListBindingData{
        if (number > _stationlist.value!!.size){
            return emptyStationData
        }else {
            return _stationlist.value!![number - 1]
        }
    }

    fun getStationList(): MutableLiveData<ArrayList<StationListBindingData>> {
        return _stationlist
    }

    fun getUpState(dpValue: Int): Int {
        if (stateButtonPosition > 0) {
            if (!_stationlist.value!![stateButtonPosition - 1].isEmpty) {
                stateButtonPosition--
                return - dpValue
            }
        }
        return 0
    }

    fun getDownState(dpValue: Int): Int {
        if (stateButtonPosition < 5) {
            if (!_stationlist.value!![stateButtonPosition].isEmpty) {
                stateButtonPosition++
                return dpValue
            }
        }
        return 0

    }

    fun moveStatePosition(direction: Int, dpValue: Int) : Int {
        if (direction == 1) {
            if (stateButtonPosition < 5) {
                if (!_stationlist.value!![stateButtonPosition].isEmpty) {
                    stateButtonPosition++
                }
            }
        } else {
            if (direction == 2) {
                if (stateButtonPosition > 0) {
                    if (!_stationlist.value!![stateButtonPosition - 1].isEmpty) {
                        stateButtonPosition--
                    }
                }
            }
        }
        return dpValue * stateButtonPosition
    }

    fun switchAppStart(){
        startAppSwitched = !startAppSwitched
    }

    fun getAppStartSwitch(): Boolean {
        return startAppSwitched
    }

    fun convDpToInt(dpValue: Int): Int {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), getApplication<Application>().resources.displayMetrics).toInt()
    }
}
