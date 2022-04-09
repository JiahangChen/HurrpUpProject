package com.ahren.hurryupproject.ui.addstation.helper

import android.annotation.SuppressLint
import android.graphics.drawable.ColorDrawable
import com.ahren.hurryupproject.R

object PatternHelper {
    @SuppressLint("ResourceAsColor")
    fun getLineColor(lineid : String): ColorDrawable {
        return when (lineid) {
            "line1" -> ColorDrawable(R.color.black)
            "line2" -> ColorDrawable(R.color.purple_200)
            "line3" -> ColorDrawable(0x3ccccccc)
            else -> {
                println("Wrong line id input when get line color")
                return ColorDrawable(R.color.black)
            }
        }
    }

}