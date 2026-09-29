package com.example.core_database.typeconverter

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.TypeConverter
import java.time.LocalDate
import kotlin.time.ExperimentalTime
import kotlin.time.Instant


class GoalTypeConverter {


    //INSTANT  to LONG
    @OptIn(ExperimentalTime::class)
    @TypeConverter
    fun fromInstant(value: Instant?): Long? = value?.toEpochMilliseconds()

    //LONG  to INSTANT

    @OptIn(ExperimentalTime::class)
    @TypeConverter
    fun toInstant(value: Long?): Instant? = value?.let { Instant.fromEpochMilliseconds(it) }

    //LOCAL DATE to LONG
    @RequiresApi(Build.VERSION_CODES.O)
    @TypeConverter
    fun fromLocalDate(value: LocalDate?): Long? = value?.toEpochDay()

    //LONG to LOCAL DATE
    @RequiresApi(Build.VERSION_CODES.O)
    fun toLocalDate(value: Long?): LocalDate? = value?.let { LocalDate.ofEpochDay(it) }


}