package com.example.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.data.entity.NotePadEntity

@Dao
interface NotePadDao {
    @Insert
    fun insertNotePadEntity(notePadEntity: NotePadEntity): Result<Unit>

    @Delete
    fun deleteNotePadEntity(notePadEntity: NotePadEntity): Result<Unit>

    @Query("select * from NotePadEntity")
    fun getAllNotePad(): Result<List<NotePadEntity>>
}