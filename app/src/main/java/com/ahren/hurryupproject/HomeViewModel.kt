package com.ahren.hurryupproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// mange UI data
class HomeViewModel : ViewModel() {
    // UI data LiveData
    public val station1 = MutableLiveData<String>()
    private val station2 = MutableLiveData<String>()
    private val station3 = MutableLiveData<String>()


    fun getStation(): Array<MutableLiveData<String>> {
        station1.value = "111"
        station2.value = "222"
        station3.value = "333"
        return arrayOf(station1, station2, station3)
    }

    fun setStation() {
        station1.value = "111"

    }

}