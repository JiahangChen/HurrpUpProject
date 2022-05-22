package com.ahren.hurryupproject.ui.collection.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.ahren.hurryupproject.ui.collection.room.dao.CollectionDao
import com.ahren.hurryupproject.ui.collection.room.dao.SettingDao
import com.ahren.hurryupproject.ui.collection.room.entity.CollectionEntity
import com.ahren.hurryupproject.ui.collection.room.entity.SettingEntity
import com.google.gson.internal.bind.util.ISO8601Utils

@Database(entities = [CollectionEntity::class, SettingEntity::class], version = 2, exportSchema = false)
abstract class CollectionDatabase : RoomDatabase() {

    abstract fun getCollectionDao(): CollectionDao

    abstract fun getSettingDao(): SettingDao

    companion object {

        private val MIGRATION_1_2 = object :Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL(
                    """
                        create table userSetting (
                        id integer primary key not null,
                        languageId integer not null,
                        languageName text not null,
                        rangeId integer not null,
                        rangeLength real not null
                        )
                    """.trimIndent()
                )
            }
        }

        @Volatile
        private var INSTANCE: CollectionDatabase? = null

        fun getInstance(context: Context): CollectionDatabase {
            val tmpInstance = INSTANCE
            if (tmpInstance != null) {
                return tmpInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CollectionDatabase::class.java,
                    "collectionDb"
                )
                    .addMigrations(MIGRATION_1_2)
                    .build()
                INSTANCE = instance
                return instance
            }

        }
    }

}