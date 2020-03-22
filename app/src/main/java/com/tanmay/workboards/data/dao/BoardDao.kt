package com.tanmay.workboards.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.tanmay.workboards.data.entity.Board

@Dao
interface BoardDao {

    @Query("SELECT * FROM boards")
    fun getAllBoards(): LiveData<List<Board>>

}