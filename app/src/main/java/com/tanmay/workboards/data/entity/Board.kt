package com.tanmay.workboards.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "boards")
data class Board(
    @PrimaryKey(autoGenerate = true) @NotNull val id: Long? = null,
    var name: String = "Untitled"
)