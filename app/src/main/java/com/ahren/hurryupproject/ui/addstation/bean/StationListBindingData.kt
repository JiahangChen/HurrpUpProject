package com.ahren.hurryupproject.ui.addstation.bean

import android.graphics.drawable.ColorDrawable
import androidx.databinding.ObservableField

class StationListBindingData(
    var stationId: String,
    var StationName: String,
    var lineId: String,
    var stationLongitude: Double,
    var stationLatitude: Double,
    var backgroundColor: ColorDrawable,
    var isEmpty: Boolean = false
) {

    val _stationName = ObservableField<String>()
    val _stationId = ObservableField<String>()
    val _lineId = ObservableField<String>()
    val _stationLongitude = ObservableField<Double>()
    val _stationLatitude = ObservableField<Double>()
    val _backgroundColor = ObservableField<ColorDrawable>()
    val _isEmpty = ObservableField<Boolean>()

    init {
        _stationId.set(stationId)
        _stationName.set(StationName)
        _lineId.set(lineId)
        _stationLongitude.set(stationLongitude)
        _stationLatitude.set(stationLatitude)
        _backgroundColor.set(backgroundColor)
        _isEmpty.set(isEmpty)

    }

}