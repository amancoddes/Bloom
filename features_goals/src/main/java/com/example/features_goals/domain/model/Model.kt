package com.example.features_goals.domain.model

import java.time.LocalDate
import java.time.Instant

data class Goal (
    val goalId: Long?=null,
    val title: String,
    val description:String?=null,
    val createdAt: Instant,
    val deadLine : LocalDate?=null,
)