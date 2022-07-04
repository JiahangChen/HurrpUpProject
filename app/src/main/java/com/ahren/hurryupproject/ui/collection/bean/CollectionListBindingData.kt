package com.ahren.hurryupproject.ui.collection.bean

import androidx.databinding.ObservableField

class CollectionListBindingData (val collectionId: Int?, val collectionName: String?, val collectionText: String?) {

    val _collectionId = ObservableField<Int>()
    val _collectionName = ObservableField<String>()
    val _collectionText = ObservableField<String>()

    init {
        _collectionId.set(collectionId)
        _collectionName.set(collectionName)
        _collectionText.set(collectionText)

    }
}