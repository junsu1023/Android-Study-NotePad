package com.example.domain.usecase

import com.example.domain.model.NotePadModel
import com.example.domain.repository.NotePadRepository
import javax.inject.Inject

class NotePadGetUseCase @Inject constructor(
    private val notePadRepository: NotePadRepository
) {
    suspend operator fun invoke(): Result<List<NotePadModel>> {
        return try {
            return Result.success(notePadRepository.getAllNotePadModel().getOrThrow())
        } catch (t: Throwable) {
            Result.failure(t)
        }
    }
}