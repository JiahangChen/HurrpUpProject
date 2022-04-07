package com.ahren.hurryupproject.ui.addstation.bean

import android.graphics.drawable.ColorDrawable
import androidx.databinding.ObservableField

class  StationListBindingData (var id: String, var StationName: String, val backgroundColor: ColorDrawable) {

    val _stationName = ObservableField<String>()
    val _id = ObservableField<String>()
    val _backgroundColor = ObservableField<ColorDrawable>()

    init {
        _id.set(id)
        _stationName.set(StationName)
        _backgroundColor.set(backgroundColor)

    }

}