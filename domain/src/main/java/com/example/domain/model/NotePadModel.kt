package com.example.domain.model

import java.util.Date

data class NotePadModel(
    val id: Long? = null,
    val updateTime: Date = Date(System.currentTimeMillis()),
    val title: String? = null,
    val content: String? = null
)