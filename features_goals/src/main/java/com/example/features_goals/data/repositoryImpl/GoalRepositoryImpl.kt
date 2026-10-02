package com.example.features_goals.data.repositoryImpl

import com.example.core_database.dao.GoalDao
import com.example.features_goals.data.mapper.toEntity
import com.example.features_goals.data.repository.GoalRepository
import com.example.features_goals.domain.model.Goal
import javax.inject.Inject

class GoalRepositoryImpl @Inject constructor (private val goalDao: GoalDao): GoalRepository {

    override suspend fun createGoal(goal: Goal):Long{
       return goalDao.insert(goal.toEntity())
    }

}