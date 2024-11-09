package com.example.todoapp

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createAt: Date
)
