package com.tanmay.workboards.ui.boardcollection

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tanmay.workboards.application.WorkboardsApplication
import com.tanmay.workboards.data.entity.Board

open class BoardCollectionViewModel(application: Application) : AndroidViewModel(application) {

//    private val repository: BoardRepository

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

    private val _memBoards = MutableLiveData<List<Board>>().apply {
        value = (application as WorkboardsApplication).db
    }

    val allBoards: LiveData<List<Board>> = _memBoards

    init {
//        val boardDao = AppDatabase.getDatabase(application).boardDao()
//        repository = BoardRepository(boardDao)

        //allBoards = repository.allBoards
    }

}
