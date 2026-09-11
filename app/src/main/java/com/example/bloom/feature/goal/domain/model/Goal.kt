package com.example.bloom.feature.goal.domain.model
import java.time.LocalDate
import java.time.Instant

data class Goal (
    val deadLine : LocalDate?=null,
    val goalId: Long,
    val description:String?=null,
    val title: String,
    val createdAt: Instant
)
