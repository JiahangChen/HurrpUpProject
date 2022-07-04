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
import com.ahren.hurryupproject.ui.collection.room.database.CollectionDatabase
import com.ahren.hurryupproject.ui.collection.room.entity.CollectionEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    @SuppressLint("ResourceAsColor")
    private var emptyStationData =
        StationListBindingData("", "", "", 0.00, 0.00, ColorDrawable(0x3ccccccc), true)
    private val collectionDao by lazy {
        CollectionDatabase.getInstance(application).getCollectionDao()
    }
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

    fun deleteStation(deleteStationNumber: Int): StationListBindingData {
        if (deleteStationNumber <= availableStationNumber) {
            if (deleteStationNumber <= stateButtonPosition) {
                stateButtonPosition--
            }
            availableStationNumber--
            _stationlist.value!!.add(emptyStationData)
            return _stationlist.value!!.removeAt(deleteStationNumber-1)
        } else {
            return emptyStationData
        }
    }

    fun deleteAllStation() {
        _stationlist.value!!.clear()
        _stationlist.value!!.add(emptyStationData)
        _stationlist.value!!.add(emptyStationData)
        _stationlist.value!!.add(emptyStationData)
        _stationlist.value!!.add(emptyStationData)
        _stationlist.value!!.add(emptyStationData)
        stateButtonPosition = 0
        availableStationNumber = 0
    }

    fun switchAppStart() {
        startAppSwitched = !startAppSwitched
    }

    fun getAppStartSwitch(): Boolean {
        return startAppSwitched
    }

    fun collectStationToDatabase() {
        if (availableStationNumber != 0) {
            Thread {
                var displayNameInCollection: String = _stationlist.value!![0]._stationName.get()!!
                for (i in 1 until availableStationNumber) {
                    displayNameInCollection += "->" + _stationlist.value!![i]._stationName.get()
                }
                collectionDao.addCollection(
                    CollectionEntity(
                        statusPosition = stateButtonPosition,
                        station1LineNumber = _stationlist.value!![0].lineId,
                        station1Id = _stationlist.value!![0].stationId,
                        station2LineNumber = _stationlist.value!![1].lineId,
                        station2Id = _stationlist.value!![1].stationId,
                        station3LineNumber = _stationlist.value!![2].lineId,
                        station3Id = _stationlist.value!![2].stationId,
                        station4LineNumber = _stationlist.value!![3].lineId,
                        station4Id = _stationlist.value!![3].stationId,
                        station5LineNumber = _stationlist.value!![4].lineId,
                        station5Id = _stationlist.value!![4].stationId,
                        stationCombineDisplayName = displayNameInCollection,
                        customDescription = ""
                    )
                )
            }.start()
        }
    }

    suspend fun collectionStationFromDatabase(id: Int) {
        var collectionStation: CollectionEntity
        withContext(Dispatchers.IO) {
            collectionStation = collectionDao.searchCollectionById(id)!![0]
        }
        withContext(Dispatchers.Main) {
            deleteAllStation()
            stateButtonPosition = collectionStation.statusPosition
            if (collectionStation.station1Id != "") {
                _stationlist.value!![availableStationNumber] = allStationMapData[collectionStation.station1LineNumber]!![collectionStation.station1Id]!!
                availableStationNumber++
            }
            if (collectionStation.station2Id != "") {
                _stationlist.value!![availableStationNumber] = allStationMapData[collectionStation.station2LineNumber]!![collectionStation.station2Id]!!
                availableStationNumber++
            }
            if (collectionStation.station3Id != "") {
                _stationlist.value!![availableStationNumber] = allStationMapData[collectionStation.station3LineNumber]!![collectionStation.station3Id]!!
                availableStationNumber++
            }
            if (collectionStation.station4Id != "") {
                _stationlist.value!![availableStationNumber] = allStationMapData[collectionStation.station4LineNumber]!![collectionStation.station4Id]!!
                availableStationNumber++
            }
            if (collectionStation.station5Id != "") {
                _stationlist.value!![availableStationNumber] = allStationMapData[collectionStation.station5LineNumber]!![collectionStation.station5Id]!!
                availableStationNumber++
            }
        }
    }

    fun convDpToInt(dpValue: Int): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dpValue.toFloat(),
            getApplication<Application>().resources.displayMetrics
        ).toInt()
    }
}
