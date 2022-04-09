package com.ahren.hurryupproject.ui.addstation.datareader

import android.content.Context
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.ui.addstation.bean.LineListBindingData
import com.ahren.hurryupproject.ui.addstation.bean.LineListDataClass
import com.ahren.hurryupproject.ui.addstation.helper.PatternHelper
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.*

class LineDataReader(context: Context) {
    private val lineListData = ArrayList<LineListBindingData>()

    init {
        val stream: InputStream = context.resources.openRawResource(R.raw.line)
        val reader: BufferedReader = BufferedReader(InputStreamReader(stream))
        var jsonStr: String = ""
        while (true) {
            jsonStr += reader.readLine() ?: break
        }
        val gson: Gson = Gson()

        val tmpLineData: ArrayList<LineListDataClass> =
            gson.fromJson(jsonStr, object : TypeToken<ArrayList<LineListDataClass>>() {}.type)

        for (i in 0 until tmpLineData.size) {
            lineListData.add(
                LineListBindingData(
                    tmpLineData[i].lineId,
                    tmpLineData[i].lineName,
                    PatternHelper.getLineColor(tmpLineData[i].lineId)
                )
            )
        }
    }


    fun getLineList(): ArrayList<LineListBindingData> {

        return lineListData
    }

}