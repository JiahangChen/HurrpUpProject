package com.ahren.hurryupproject.ui.addstation.bean

import android.graphics.drawable.ColorDrawable
import androidx.databinding.ObservableField

class  StationListBindingData (var id: String,
                               var StationName: String,
                               val stationLongitude: Double,
                               val stationLatitude: Double,
                               val backgroundColor: ColorDrawable) {

    val _stationName = ObservableField<String>()
    val _id = ObservableField<String>()
    val _stationLongitude = ObservableField<Double>()
    val _stationLatitude = ObservableField<Double>()
    val _backgroundColor = ObservableField<ColorDrawable>()

    init {
        _id.set(id)
        _stationName.set(StationName)
        _stationLongitude.set(stationLongitude)
        _stationLatitude.set(stationLatitude)
        _backgroundColor.set(backgroundColor)

    }

}