package com.ahren.hurryupproject.ui.collection.room.dao

import androidx.room.*
import com.ahren.hurryupproject.ui.collection.room.entity.CollectionEntity
import com.ahren.hurryupproject.ui.collection.room.entity.SettingEntity

@Dao
interface SettingDao {

    @Update
    fun changeSetting(vararg userEntity: SettingEntity)

    @Insert
    fun addSetting(vararg userEntity: SettingEntity)

    @Query("select * from userSetting where id = 0")
    fun querySetting(): SettingEntity

}