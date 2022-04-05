package com.ahren.hurryupproject.ui.addstation.bean

import android.widget.TextView
import androidx.databinding.ObservableField
import java.util.*

class LineListBindingData (var id: String, var lineName: String) {

    val _lineName = ObservableField<String>()
    val _id = ObservableField<String>()

    init {
        _id.set(id)
        _lineName.set(lineName)
    }
}