package com.example.data.di

import com.example.data.dao.NotePadDao
import com.example.data.datasource.NotePadRemoteDatasource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatasourceModule {
    @Provides
    @Singleton
    fun provideNotePadDataSource(
        notePadDao: NotePadDao
    ): NotePadRemoteDatasource {
        return NotePadRemoteDatasource(notePadDao)
    }
}