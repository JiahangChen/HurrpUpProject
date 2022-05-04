package com.ahren.hurryupproject.ui.collection.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userCollection")
data class CollectionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "statusPosition")
    val statusPosition: Int = 0,
    @ColumnInfo(name = "station1LineNumber")
    val station1LineNumber: String? = null,
    @ColumnInfo(name = "station1Id")
    val station1Id: String? = null,
    @ColumnInfo(name = "station2LineNumber")
    val station2LineNumber: String? = null,
    @ColumnInfo(name = "station2Id")
    val station2Id: String? = null,
    @ColumnInfo(name = "station3LineNumber")
    val station3LineNumber: String? = null,
    @ColumnInfo(name = "station3Id")
    val station3Id: String? = null,
    @ColumnInfo(name = "station4LineNumber")
    val station4LineNumber: String? = null,
    @ColumnInfo(name = "station4Id")
    val station4Id: String? = null,
    @ColumnInfo(name = "station5LineNumber")
    val station5LineNumber: String? = null,
    @ColumnInfo(name = "station5Id")
    val station5Id: String? = null,
    @ColumnInfo(name = "stationCombineDisplayName")
    val stationCombineDisplayName: String? = null,
    @ColumnInfo(name = "customDescription")
    val customDescription: String? = null
) {

}
