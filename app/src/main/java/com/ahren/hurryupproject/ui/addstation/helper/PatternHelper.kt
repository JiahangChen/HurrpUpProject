package com.ahren.hurryupproject.ui.addstation.helper

import android.annotation.SuppressLint
import android.graphics.drawable.ColorDrawable
import android.util.Base64.encode
import com.ahren.hurryupproject.R

object PatternHelper {
    @SuppressLint("ResourceAsColor")
    fun getLineColor(lineid : String): ColorDrawable {

        return when (lineid) {
            "line1" -> ColorDrawable(0xFFef3b3a.toInt())
            "line2" -> ColorDrawable(0xFF97cd00.toInt())
            "line3" -> ColorDrawable(0xFFffcc63.toInt())
            "line4" -> ColorDrawable(0xFF7e5db4.toInt())
            "line5" -> ColorDrawable(0xFFa475d3.toInt())
            "line6" -> ColorDrawable(0xFFf3399c.toInt())
            "line7" -> ColorDrawable(0xFFff763e.toInt())
            "line8" -> ColorDrawable(0xFF369ce7.toInt())
            "line9" -> ColorDrawable(0xFF7fcfea.toInt())
            "line10" -> ColorDrawable(0xFFc9aad3.toInt())
            "line11" -> ColorDrawable(0xFF934541.toInt())
            "line12" -> ColorDrawable(0xFF159655.toInt())
            "line13" -> ColorDrawable(0xFFff96bf.toInt())
            "line16" -> ColorDrawable(0xFF82d3d6.toInt())
            else -> {
                println("Wrong line id input when get line color")
                return ColorDrawable(R.color.black)
            }
        }
    }

}