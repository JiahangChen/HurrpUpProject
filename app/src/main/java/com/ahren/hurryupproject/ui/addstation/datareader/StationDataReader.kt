package com.ahren.hurryupproject.ui.addstation.datareader

import android.content.Context
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.ui.addstation.bean.StationListBindingData
import com.ahren.hurryupproject.ui.addstation.bean.StationListDataClass
import com.ahren.hurryupproject.ui.addstation.helper.PatternHelper
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.*

class StationDataReader(context: Context) {
    private val allStationListData = mutableMapOf<String, ArrayList<StationListBindingData>>()
//    private val _oneStationListData = ArrayList<StationListBindingData>()

    init {
        val stream: InputStream = context.resources.openRawResource(R.raw.station)
        val reader: BufferedReader = BufferedReader(InputStreamReader(stream))
        var jsonStr: String = ""
        while (true) {
            jsonStr += reader.readLine() ?: break
        }
        val gson: Gson = Gson()

        val tmpStationData: Map<String, ArrayList<StationListDataClass>> = gson.fromJson(
            jsonStr,
            object : TypeToken<MutableMap<String, ArrayList<StationListDataClass>>>() {}.type
        )

        for ((key, value) in tmpStationData) {

            val _oneStationListData = ArrayList<StationListBindingData>()
//            _oneStationListData.clear()
            for (i in 0 until tmpStationData[key]!!.size) {
                _oneStationListData.add(
                    StationListBindingData(
                        tmpStationData[key]!![i].stationId,
                        tmpStationData[key]!![i].stationName,
                        key,
                        tmpStationData[key]!![i].stationLongitude,
                        tmpStationData[key]!![i].stationLatitude,
                        PatternHelper.getLineColor(key)
                    )
                )

            }
            allStationListData[key] = _oneStationListData
        }
    }

    fun getStationList(lineid: String): ArrayList<StationListBindingData> {

        return allStationListData.get(lineid)!!
    }

    fun getStation(lineid: String, stationid: String): StationListBindingData {
        val map1 = allStationListData.get(lineid)?.map { it._stationId to it }?.toMap()

        return allStationListData.get(lineid)!![0]


    }
}