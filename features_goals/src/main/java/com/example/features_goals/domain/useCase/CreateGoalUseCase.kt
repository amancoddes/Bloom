package com.example.features_goals.domain.useCase

import com.example.features_goals.data.repository.GoalRepository
import com.example.features_goals.domain.model.Goal
import com.example.features_goals.domain.validation.GoalValidationError
import com.example.features_goals.domain.validation.GoalValidationErrorException
import com.example.features_goals.domain.validation.GoalValidator
import java.time.Clock
import java.time.Instant
import java.time.LocalDate
import javax.inject.Inject


class CreateGoalUseCase @Inject constructor(val repository: GoalRepository,val clock: Clock){




    suspend operator fun invoke(title: String,description: String,deadLine: LocalDate?): Result<Long>{


        val normalizeTitle= GoalValidator.normalizeTitle(title = title )
        val normalizeDescription = GoalValidator.normalizeDescription(description = description)

        val error=GoalValidator.validateAll(title = normalizeTitle, description = normalizeDescription,deadLine, clock =clock )

        if (error != null){
            return  Result.failure(GoalValidationErrorException(error = error))
        }

        val userGoal=Goal(title = normalizeTitle, description = normalizeDescription, deadLine = deadLine, createdAt = Instant.now(clock))

        return runCatching {
            repository.createGoal(goal = userGoal)
        }


    }


}


