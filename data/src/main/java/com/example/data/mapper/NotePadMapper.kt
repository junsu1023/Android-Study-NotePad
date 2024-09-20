package com.example.data.mapper

import com.example.data.entity.NotePadEntity
import com.example.domain.model.NotePadModel

fun NotePadEntity.toNotePadModel(): NotePadModel =
    NotePadModel(
        this.id,
        this.updateTime,
        this.title,
        this.content
    )

fun NotePadModel.toNotePadEntity(): NotePadEntity =
    NotePadEntity(
        this.id,
        this.updateTime,
        this.title,
        this.content
    )