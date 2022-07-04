package com.ahren.hurryupproject.ui.collection.room.dao

import androidx.room.*
import com.ahren.hurryupproject.ui.collection.room.entity.CollectionEntity

@Dao
interface CollectionDao {

    @Insert
    fun addCollection(vararg userEntity: CollectionEntity)

    @Delete
    fun deleteCollection(vararg userEntity: CollectionEntity)

    @Query("select * from userCollection")
    fun queryCollection(): List<CollectionEntity>

    @Query("select * from userCollection where id = :collectionId")
    fun searchCollectionById(vararg collectionId: Int): List<CollectionEntity>

}