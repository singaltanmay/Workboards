package com.tanmay.workboards.data.entity

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "boards")
data class Board(
    @PrimaryKey(autoGenerate = true) @NotNull var id: Long? = null,
    var name: String = "Untitled",
    @Ignore
    var taskList: MutableList<TaskList> = mutableListOf()
)