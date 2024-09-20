package com.example.domain.usecase

import com.example.domain.model.NotePadModel
import com.example.domain.repository.NotePadRepository
import javax.inject.Inject

class NotePadDeleteUseCase @Inject constructor(
    private val notePadRepository: NotePadRepository
) {
    suspend operator fun invoke(
        notePadModel: NotePadModel
    ): Result<Unit> {
        return try {
            notePadRepository.deleteNotePadModel(notePadModel)
            Result.success(Unit)
        } catch (t: Throwable) {
            Result.failure(t)
        }
    }
}