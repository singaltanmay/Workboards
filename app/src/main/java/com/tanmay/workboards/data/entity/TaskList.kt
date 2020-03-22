package com.tanmay.workboards.data.entity

data class TaskList(
    var name : String,
    var tasks : List<Task>? = null
)