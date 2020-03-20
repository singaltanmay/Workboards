package com.tanmay.workboards.ui.boardcollection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanmay.workboards.model.Board

open class BoardCollectionViewModel : ViewModel() {

    private val _boards = MutableLiveData<List<Board>>().apply {
        value = mutableListOf(
            Board(1),
            Board(2),
            Board(3),
            Board(4),
            Board(5),
            Board(6),
            Board(7),
            Board(8),
            Board(9)
        )
    }

    val boards: LiveData<List<Board>> = _boards

}
