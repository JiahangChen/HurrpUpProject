package com.ahren.hurryupproject.ui.collection.bean

import android.graphics.drawable.ColorDrawable
import androidx.databinding.ObservableField

class CollectionListBindingData (val collectionId: Int?, val collectionName: String?, val collectionText: String?, val collectionBackgroundColor: ColorDrawable) {

    val _collectionId = ObservableField<Int>()
    val _collectionName = ObservableField<String>()
    val _collectionText = ObservableField<String>()
    val _collectionBackgroundColor = ObservableField<ColorDrawable>()

    init {
        _collectionId.set(collectionId)
        _collectionName.set(collectionName)
        _collectionText.set(collectionText)
        _collectionBackgroundColor.set(collectionBackgroundColor)

    }
}