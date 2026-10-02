package com.example.core_database.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.core_database.entity.GoalEntity
import com.example.core_database.dao.GoalDao

//room configuration
@Database(entities = [GoalEntity::class], version = 1)
@TypeConverters(GoalEntity::class)
abstract class BloomDatabase : RoomDatabase() {

    abstract fun goalDao(): GoalDao

    companion object {
        const val DATABASE_NAME = "bloom_Database.db"
    }

        }