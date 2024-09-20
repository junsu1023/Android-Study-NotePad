package com.example.data.datasource

import com.example.data.dao.NotePadDao
import com.example.data.entity.NotePadEntity
import javax.inject.Inject

class NotePadRemoteDatasource @Inject constructor(
    private val notePadDao: NotePadDao
) {
    suspend fun insertNotePadEntity(notePadEntity: NotePadEntity): Result<Unit> = notePadDao.insertNotePadEntity(notePadEntity)

    suspend fun deleteNotePadEntity(notePadEntity: NotePadEntity): Result<Unit> = notePadDao.deleteNotePadEntity(notePadEntity)

    suspend fun getAllNotePad(): Result<List<NotePadEntity>> = notePadDao.getAllNotePad()
}