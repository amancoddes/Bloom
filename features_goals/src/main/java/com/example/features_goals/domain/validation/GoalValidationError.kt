package com.example.features_goals.domain.validation



sealed interface GoalValidationError {

    data object TitleEmpty : GoalValidationError

    data object TitleTooLong : GoalValidationError

    data object DescriptionTooLong : GoalValidationError

    data object DeadlineInPast : GoalValidationError

}
