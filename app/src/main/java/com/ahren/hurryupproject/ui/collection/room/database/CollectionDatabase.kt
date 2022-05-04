package com.ahren.hurryupproject.ui.collection.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ahren.hurryupproject.ui.collection.room.dao.CollectionDao
import com.ahren.hurryupproject.ui.collection.room.entity.CollectionEntity
import com.google.gson.internal.bind.util.ISO8601Utils

@Database(entities = [CollectionEntity::class], version = 1)
abstract class CollectionDatabase: RoomDatabase() {

    abstract fun getCollectionDao(): CollectionDao

    companion object {
        private var INSTANCE: CollectionDatabase? = null

        fun getInstance(context: Context): CollectionDatabase {
            val tmpInstance = INSTANCE
            if (tmpInstance != null) {
                return tmpInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(context.applicationContext, CollectionDatabase::class.java, "collectionDb").build()
                INSTANCE = instance
                return instance
            }

        }
    }

}