package com.example.features_goals.domain.validation

import android.app.wallpaper.WallpaperDescription
import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.Clock

object GoalValidator {


    const val MAXIMUM_TITLE_LENGTH=50
    const val MAXIMUM_DESCRIPTION_LENGTH=100

    fun normalizeTitle(title: String): String=title.trim()


    fun validateTitle(title: String):GoalValidationError?{
        return when{
            title.isEmpty() -> GoalValidationError.TitleEmpty
            title.length > MAXIMUM_TITLE_LENGTH -> GoalValidationError.TitleTooLong

            else -> null
        }
    }


    fun normalizeDescription(description: String): String?=description.trim().takeIf { it.isNotEmpty() }

    fun validateDescription(description: String?): GoalValidationError? {
        return when {
            description == null -> null
            description.length > MAXIMUM_DESCRIPTION_LENGTH -> GoalValidationError.DescriptionTooLong
            else -> null
        }

    }


    fun validateDeadLine(deadLine: LocalDate?, clock: Clock): GoalValidationError?=
        when{
            deadLine==null -> null
            deadLine.isBefore(LocalDate.now(clock)) -> GoalValidationError.DeadlineInPast
            else -> null
        }



    //check All

    fun validateAll(title: String,description: String?,deadLine: LocalDate?,clock: Clock): GoalValidationError?{
        return listOfNotNull(
            validateTitle(title),
            validateDescription(description),
            validateDeadLine(deadLine,clock)
        ).firstOrNull()
    }





}
