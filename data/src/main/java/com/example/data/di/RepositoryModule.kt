package com.example.data.di

import com.example.data.datasource.NotePadRemoteDatasource
import com.example.data.repository.NotePadRepositoryImpl
import com.example.domain.repository.NotePadRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideNotePadRepository(
        notePadRemoteDatasource: NotePadRemoteDatasource
    ): NotePadRepository {
        return NotePadRepositoryImpl(notePadRemoteDatasource)
    }
}