package com.example.core_database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.core_database.entity.GoalEntity


@Dao
interface GoalDao {

    @Insert
   suspend fun insert(user: GoalEntity): Long

}