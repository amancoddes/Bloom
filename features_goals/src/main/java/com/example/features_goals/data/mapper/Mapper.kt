package com.example.features_goals.data.mapper

import com.example.core_database.entity.GoalEntity
import com.example.features_goals.domain.model.Goal


fun Goal.toEntity(): GoalEntity{
    return GoalEntity(
        goalId = goalId,
        title = title,
        description = description,
        deadLine = deadLine,
        createdAt = createdAt
    )
}

fun GoalEntity.toModelData(): Goal{
    return Goal(
        goalId = goalId,
        title = title,
        description = description,
        deadLine = deadLine,
        createdAt = createdAt
    )
}