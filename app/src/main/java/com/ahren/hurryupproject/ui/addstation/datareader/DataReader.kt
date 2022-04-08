package com.ahren.hurryupproject.ui.addstation.datareader

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.ColorDrawable
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.ui.addstation.bean.LineListBindingData
import com.ahren.hurryupproject.ui.addstation.bean.LineListDataClass
import com.ahren.hurryupproject.ui.addstation.bean.StationListBindingData
import com.ahren.hurryupproject.ui.addstation.bean.StationListDataClass
import com.ahren.hurryupproject.ui.addstation.helper.PatternHelper
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.*

object DataReader {

    fun getLineList(context: Context): ArrayList<LineListBindingData> {

        val stream: InputStream = context.resources.openRawResource(R.raw.line)
        val reader: BufferedReader = BufferedReader(InputStreamReader(stream))
        var jsonStr: String = ""
        while (true) {
            jsonStr += reader.readLine() ?: break
        }
        val gson: Gson = Gson()

        val tmpLineData: ArrayList<LineListDataClass> = gson.fromJson(jsonStr, object : TypeToken<ArrayList<LineListDataClass>>() {}.type)
        val lineListData = ArrayList<LineListBindingData>()

        for (i in 0 until tmpLineData.size) {
            lineListData.add(LineListBindingData(tmpLineData[i].id, tmpLineData[i].lineName, PatternHelper.getLineColor(tmpLineData[i].id)))
        }
        return lineListData
    }

    fun getStationList(context: Context, lineid: String): ArrayList<StationListBindingData> {

        val stream: InputStream = context.resources.openRawResource(R.raw.station)
        val reader: BufferedReader = BufferedReader(InputStreamReader(stream))
        var jsonStr: String = ""
        while (true) {
            jsonStr += reader.readLine() ?: break
        }
        val gson: Gson = Gson()

        val tmpStationData: Map<String, ArrayList<StationListDataClass>> = gson.fromJson(jsonStr, object : TypeToken<Map<String, ArrayList<StationListDataClass>>>() {}.type)
        val stationListData = ArrayList<StationListBindingData>()

        for (i in 0 until tmpStationData.size) {
            stationListData.add(StationListBindingData(
                tmpStationData[lineid]!![i].id,
                tmpStationData[lineid]!![i].stationName,
                tmpStationData[lineid]!![i].stationLongitude,
                tmpStationData[lineid]!![i].stationLatitude,
                PatternHelper.getLineColor(lineid)))
        }
        return stationListData
    }
}