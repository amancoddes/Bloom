package com.example.features_goals.data.repository

import com.example.features_goals.domain.model.Goal


interface GoalRepository {
    suspend fun createGoal(goal: Goal): Long

}