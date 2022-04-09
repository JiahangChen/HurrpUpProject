package com.ahren.hurryupproject.ui.addstation.bean

import android.graphics.drawable.ColorDrawable
import androidx.databinding.ObservableField

class LineListBindingData (val lineId: String, val lineName: String, val backgroundColor: ColorDrawable) {

    val _lineName = ObservableField<String>()
    val _lineId = ObservableField<String>()
    val _backgroundColor = ObservableField<ColorDrawable>()

    init {
        _lineId.set(lineId)
        _lineName.set(lineName)
        _backgroundColor.set(backgroundColor)
    }
}