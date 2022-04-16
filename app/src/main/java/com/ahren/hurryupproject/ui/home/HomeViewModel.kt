package com.ahren.hurryupproject.ui.home

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.util.TypedValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ahren.hurryupproject.ui.addstation.bean.StationListBindingData
import com.ahren.hurryupproject.ui.addstation.datareader.DataReader.getAllStationMapData

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    @SuppressLint("ResourceAsColor")
    private var emptyStationData =
        StationListBindingData("", "", "", 0.00, 0.00, ColorDrawable(0x3ccccccc), true)
    val _stationlist by lazy {
        MutableLiveData(
            arrayListOf(
                emptyStationData,
                emptyStationData,
                emptyStationData,
                emptyStationData,
                emptyStationData
            )
        )
    }
    private val allStationMapData by lazy { getAllStationMapData() }
    private var stateButtonPosition: Int = 0
    private var availableStationNumber: Int = 0
    private var startAppSwitched: Boolean = false
    fun addStation(context: Context, lineid: String, stationid: String) {
//        for ( i in 0 until _stationlist.value!!.size) {
//            if (_stationlist.value!![i].isEmpty){
//                _stationlist.value!![i] = allStationMapData[lineid]!![stationid]!!
//                break
//            }
//        }
        if (availableStationNumber < 5) {
            _stationlist.value!![availableStationNumber] = allStationMapData[lineid]!![stationid]!!
            availableStationNumber++
        }
    }

    fun getStation(number: Int): StationListBindingData {
        if (number > _stationlist.value!!.size) {
            return emptyStationData
        } else {
            return _stationlist.value!![number - 1]
        }
    }

    fun getStationList(): MutableLiveData<ArrayList<StationListBindingData>> {
        return _stationlist
    }

    fun moveStatePosition(direction: Int, dpValue: Int): Int {
        if (direction == 1) {
            if (stateButtonPosition < availableStationNumber) {
                stateButtonPosition++
            }
        } else {
            if (direction == 2) {
                if (stateButtonPosition > 0) {
                    stateButtonPosition--
                }
            }
        }
        return dpValue * stateButtonPosition
    }

    fun getAvailableStationNumber(): Int = availableStationNumber

    fun switchAppStart() {
        startAppSwitched = !startAppSwitched
    }

    fun getAppStartSwitch(): Boolean {
        return startAppSwitched
    }

    fun convDpToInt(dpValue: Int): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dpValue.toFloat(),
            getApplication<Application>().resources.displayMetrics
        ).toInt()
    }
}
