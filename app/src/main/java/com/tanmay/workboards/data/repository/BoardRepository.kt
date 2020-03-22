package com.tanmay.workboards.data.repository

import androidx.lifecycle.LiveData
import com.tanmay.workboards.data.dao.BoardDao
import com.tanmay.workboards.data.entity.Board

class BoardRepository(private val dao: BoardDao) {

    val allBoards : LiveData<List<Board>> = dao.getAllBoards()

}