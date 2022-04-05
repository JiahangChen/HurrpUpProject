package com.ahren.hurryupproject.ui.addstation.bean

import androidx.databinding.ObservableField

class  StationListBindingData (var id: String, var StationName: String) {

    val _stationName = ObservableField<String>()
    val _id = ObservableField<String>()

    init {
        _id.set(id)
        _stationName.set(StationName)

    }

}