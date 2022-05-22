package com.ahren.hurryupproject.ui.setting.dropdown

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.ahren.hurryupproject.databinding.FragmentHomeBinding
import com.ahren.hurryupproject.databinding.FragmentSettingBinding
import com.ahren.hurryupproject.ui.collection.room.dao.SettingDao
import com.ahren.hurryupproject.ui.collection.room.database.CollectionDatabase
import com.ahren.hurryupproject.ui.collection.room.entity.SettingEntity
import com.ahren.hurryupproject.ui.home.HomeFragment

//private var _settingDao = null
//
//private var settingDao get() = _settingDao!!
//
//class RangeSpinnerActivity: Activity(), AdapterView.OnItemSelectedListener {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        val _settingDao by lazy {
//            CollectionDatabase.getInstance(this).getSettingDao()
//        }
//    }
//    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
//        Thread{
//            val settingList = settingDao.querySetting()
//            settingDao.changeSetting(
//                SettingEntity(
//                    id = 0,
//                    languageId = settingList.languageId,
//                    languageName = settingList.languageName,
//                    rangeId = p2,
//                    rangeLength = rangeSpinner.getItemAtPosition(p2).toString().toDouble()
//                )
//            )
//        }.start()
//
//    }