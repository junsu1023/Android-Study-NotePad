package com.example.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class NotePadEntity(
    @PrimaryKey(autoGenerate = true) val id: Long? = null,
    val updateTime: Date = Date(System.currentTimeMillis()),
    val title: String? = null,
    val content: String? = null
)