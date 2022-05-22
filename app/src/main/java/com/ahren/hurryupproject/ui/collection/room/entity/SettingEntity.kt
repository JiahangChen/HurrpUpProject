package com.ahren.hurryupproject.ui.collection.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userSetting")
data class SettingEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int = 0,
    @ColumnInfo(name = "languageId")
    val languageId: Int = 0,
    @ColumnInfo(name = "languageName")
    val languageName: String = "English",
    @ColumnInfo(name = "rangeId")
    val rangeId: Int = 0,
    @ColumnInfo(name = "rangeLength")
    val rangeLength: Double = 2.0
) {

}
