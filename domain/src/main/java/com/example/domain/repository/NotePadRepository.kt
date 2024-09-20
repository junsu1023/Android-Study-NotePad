package com.example.domain.repository

import com.example.domain.model.NotePadModel

interface NotePadRepository {
    suspend fun insertNotePadModel(notePadModel: NotePadModel): Result<Unit>

    suspend fun deleteNotePadModel(notePadModel: NotePadModel): Result<Unit>

    suspend fun getAllNotePadModel(): Result<List<NotePadModel>>
}