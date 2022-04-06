package com.ahren.hurryupproject.ui.addstation.datareader

import android.content.Context
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.ui.addstation.bean.LineListBindingData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.*

object DataReader {

    private val lineListData = ArrayList<LineListBindingData>()

    fun getLineData(context: Context): ArrayList<LineListBindingData> {

        val stream: InputStream = context.resources.openRawResource(R.raw.line)
        val reader: BufferedReader = BufferedReader(InputStreamReader(stream))
        var jsonStr: String = ""
        while (true) {
            jsonStr += reader.readLine() ?: break
        }
        val gson: Gson = Gson()

        return gson.fromJson(jsonStr, object : TypeToken<ArrayList<LineListBindingData>>() {}.type)
    }
}