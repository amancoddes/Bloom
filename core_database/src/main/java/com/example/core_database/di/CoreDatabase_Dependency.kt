package com.example.core_database.di

import android.content.Context
import androidx.room.Dao
import androidx.room.Room
import com.example.core_database.dao.GoalDao
import com.example.core_database.roomdatabase.BloomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object CoreDatabaseDependency {

    @Provides
    @Singleton
    fun bloomDatabase(@ApplicationContext context: Context): BloomDatabase {
   return Room.databaseBuilder(context, BloomDatabase::
    class.java, BloomDatabase.DATABASE_NAME).build()

}


    @Provides
    @Singleton
    fun bloomDatabaseDao(bloomDatabaseObj: BloomDatabase): GoalDao {
        return bloomDatabaseObj.goalDao()
    }





}