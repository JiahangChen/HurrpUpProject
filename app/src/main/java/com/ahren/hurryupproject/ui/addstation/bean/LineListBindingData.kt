package com.ahren.hurryupproject.ui.addstation.bean

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.widget.TextView
import androidx.databinding.ObservableField
import java.util.*

class LineListBindingData (val id: String, val lineName: String, val backgroundColor: ColorDrawable) {

    val _lineName = ObservableField<String>()
    val _id = ObservableField<String>()
    val _backgroundColor = ObservableField<ColorDrawable>()

    init {
        _id.set(id)
        _lineName.set(lineName)
        _backgroundColor.set(backgroundColor)
    }
}