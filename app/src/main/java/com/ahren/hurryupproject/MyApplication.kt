package com.ahren.hurryupproject

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()

//        ProcessLifecycleOwner.get().lifecycle.addObserver(MyLifecycleObserver())
    }
}