package com.tanmay.workboards.ui.boardcollection

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanmay.workboards.data.AppDatabase
import com.tanmay.workboards.data.entity.Board
import com.tanmay.workboards.data.repository.BoardRepository

open class BoardCollectionViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: BoardRepository

    private val _boards = MutableLiveData<List<Board>>().apply {
        value = mutableListOf(
            Board(),
            Board(2, "Nuthin'"),
            Board(3),
            Board(4),
            Board(5, "Lp"),
            Board(6),
            Board(
                9, "pmsggnsooen\tsdng\n" +
                        "sgkm\n" +
                        "kdgskm\n" +
                        "sdmkb\n"
            ),
            Board(7, "me"),
            Board(8),
            Board(
                9, "pmsggnsooen\tsdng\n" +
                        "sgkm\n" +
                        "kdgskm\n" +
                        "sdmkb\n"
            ),
            Board(3),
            Board(4),
            Board(5, "Lp"),
            Board(6),
            Board(
                9, "pmsggnsooen\tsdng\n" +
                        "sgkm\n" +
                        "kdgskm\n" +
                        "sdmkb\n"
            ),
            Board(7, "me"),
            Board(3),
            Board(4),
            Board(5, "Lp"),
            Board(6),
            Board(
                9, "pmsggnsooen\tsdng\n" +
                        "sgkm\n" +
                        "kdgskm\n" +
                        "sdmkb\n"
            ),
            Board(7, "me"),
            Board(3),
            Board(4),
            Board(5, "Lp"),
            Board(6),
            Board(
                9, "pmsggnsooen\tsdng\n" +
                        "sgkm\n" +
                        "kdgskm\n" +
                        "sdmkb\n"
            ),
            Board(7, "me"),
            Board(3),
            Board(4),
            Board(5, "Lp"),
            Board(6),
            Board(
                9, "pmsggnsooen\tsdng\n" +
                        "sgkm\n" +
                        "kdgskm\n" +
                        "sdmkb\n"
            ),
            Board(7, "me"),
            Board(3),
            Board(4),
            Board(5, "Lp"),
            Board(6),
            Board(
                9, "pmsggnsooen\tsdng\n" +
                        "sgkm\n" +
                        "kdgskm\n" +
                        "sdmkb\n"
            ),
            Board(7, "me")
        )
    }

    val allBoards: LiveData<List<Board>> = _boards

    init {
        val boardDao = AppDatabase.getDatabase(application).boardDao()
        repository = BoardRepository(boardDao)

        //allBoards = repository.allBoards
    }

}
