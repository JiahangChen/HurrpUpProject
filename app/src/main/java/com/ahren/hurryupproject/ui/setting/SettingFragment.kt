package com.ahren.hurryupproject.ui.setting

import android.app.Activity
import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.room.ColumnInfo
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentSettingBinding
import com.ahren.hurryupproject.ui.collection.room.database.CollectionDatabase
import com.ahren.hurryupproject.ui.collection.room.entity.SettingEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SettingFragment : Fragment() {

    private var _binding: FragmentSettingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val settingDao by lazy {
        CollectionDatabase.getInstance(requireContext()).getSettingDao()
    }
    private val collectionDao by lazy {
        CollectionDatabase.getInstance(requireContext()).getCollectionDao()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSettingBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val languageSpinner = binding.languageSpinner
        val rangeSpinner = binding.rangeSpinner


        GlobalScope.launch (Dispatchers.IO) {
            if (settingDao.querySetting() == null) {
                settingDao.addSetting(
                    SettingEntity(
                        id = 0,
                        languageId = 0,
                        languageName = "English",
                        rangeId = 3,
                        rangeLength = 3.0
                    )
                )
            }
            withContext(Dispatchers.Main) {
                ArrayAdapter.createFromResource(
                    requireContext(),
                    R.array.language_array,
                    android.R.layout.simple_spinner_item
                ).also { adapter ->
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    languageSpinner.adapter = adapter
                }
            }
            languageSpinner.setSelection(settingDao.querySetting().languageId, true)

            withContext(Dispatchers.Main) {
                languageSpinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                        Thread {
                            val settingList = settingDao.querySetting()
                            settingDao.changeSetting(
                                SettingEntity(
                                    id = 0,
                                    languageId = p2,
                                    languageName = languageSpinner.getItemAtPosition(p2) as String,
                                    rangeId = settingList.rangeId,
                                    rangeLength = settingList.rangeLength
                                )
                            )
                        }.start()

                    }

                    override fun onNothingSelected(p0: AdapterView<*>?) {
                    }
                }

                binding.rangeText.setOnClickListener {
                    Thread {
                        val collectionList = settingDao.querySetting()
                        Log.d(ContentValues.TAG, "result is: $collectionList")
                    }.start()
                }

                ArrayAdapter.createFromResource(
                    requireContext(),
                    R.array.range_array,
                    android.R.layout.simple_spinner_item
                ).also { adapter ->
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    rangeSpinner.adapter = adapter
                }
            }
            rangeSpinner.setSelection(settingDao.querySetting().rangeId, true)

            withContext(Dispatchers.Main) {
                rangeSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                        Thread {
                            val settingList = settingDao.querySetting()
                            settingDao.changeSetting(
                                SettingEntity(
                                    id = 0,
                                    languageId = settingList.languageId,
                                    languageName = settingList.languageName,
                                    rangeId = p2,
                                    rangeLength = rangeSpinner.getItemAtPosition(p2).toString().toDouble()
                                )
                            )
                        }.start()

                    }

                    override fun onNothingSelected(p0: AdapterView<*>?) {
                    }
                }

                binding.button.setOnClickListener {
                    Thread {
                        val collectionList = collectionDao.queryCollection()
                        for ( collectionEntity in collectionList ) {
                            collectionDao.deleteCollection(
                                collectionEntity
                            )
                        }
                    }.start()
                }
            }

        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}