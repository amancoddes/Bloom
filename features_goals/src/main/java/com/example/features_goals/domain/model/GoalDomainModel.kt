package com.example.features_goals.domain.model

import java.time.LocalDate
import java.time.Instant

data class Goal (
    val goalId: Long,
    val title: String,
    val createdAt: Instant,
    val deadLine : LocalDate?=null,
    val description:String?=null,
)