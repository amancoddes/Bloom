package com.example.features_goals.di

import com.example.features_goals.data.repository.GoalRepository
import com.example.features_goals.data.repositoryImpl.GoalRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class FeaturesGoalsDi {

    @Binds
   abstract fun bindGoalRepository(impl: GoalRepositoryImpl): GoalRepository


}