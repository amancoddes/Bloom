package com.example.core_database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.time.LocalDate


@Entity(tableName = "goals_Table")
data class GoalEntity(

    @PrimaryKey(autoGenerate = true)
    val goalId: Long = 0L,

    val title: String,

    val description: String? = null,

    val deadLine: LocalDate? = null,

    val createdAt: Instant
)