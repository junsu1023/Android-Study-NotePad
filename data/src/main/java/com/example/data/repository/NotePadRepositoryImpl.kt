package com.example.data.repository

import com.example.data.datasource.NotePadRemoteDatasource
import com.example.data.mapper.toNotePadEntity
import com.example.data.mapper.toNotePadModel
import com.example.domain.model.NotePadModel
import com.example.domain.repository.NotePadRepository
import javax.inject.Inject

class NotePadRepositoryImpl @Inject constructor(
    private val notePadRemoteDatasource: NotePadRemoteDatasource
): NotePadRepository {
    override suspend fun insertNotePadModel(notePadModel: NotePadModel): Result<Unit> {
        return try {
            notePadRemoteDatasource.insertNotePadEntity(notePadModel.toNotePadEntity())
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        } catch (t: Throwable) {
            Result.failure(t)
        }
    }

    override suspend fun deleteNotePadModel(notePadModel: NotePadModel): Result<Unit> {
        return try {
            notePadRemoteDatasource.deleteNotePadEntity(notePadModel.toNotePadEntity())
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        } catch (t: Throwable) {
            Result.failure(t)
        }
    }

    override suspend fun getAllNotePadModel(): Result<List<NotePadModel>> {
        return try {
            val notePadList = notePadRemoteDatasource.getAllNotePad().getOrThrow()
            Result.success(notePadList.map { it.toNotePadModel() })
        } catch (e: Exception) {
            Result.failure(e)
        } catch (t: Throwable) {
            Result.failure(t)
        }
    }
}