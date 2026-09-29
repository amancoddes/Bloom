package com.example.core_database.di

import android.content.Context
import androidx.room.Room
import com.example.core_database.roomdatabase.BloomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object CoreDatabase_Dependency {

    @Provides
    @Singleton
    fun bloomDatabase( @ApplicationContext context: Context): BloomDatabase =
        Room.databaseBuilder(
        context, BloomDatabase::class.java,
            BloomDatabase.DATABASE_NAME
    ).build()
}
