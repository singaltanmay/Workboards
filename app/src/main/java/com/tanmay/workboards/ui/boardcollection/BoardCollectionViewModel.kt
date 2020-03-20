package com.tanmay.workboards.ui.boardcollection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanmay.workboards.model.Board

open class BoardCollectionViewModel : ViewModel() {

    //    private val _text = MutableLiveData<String>().apply {
//        value = "This is home Fragment"
//    }
//    val text: LiveData<String> = _text

    private val _boards = MutableLiveData<List<Board>>().apply {
        value = mutableListOf(
            Board(),
            Board(),
            Board(),
            Board(),
            Board(),
            Board(),
            Board(),
            Board(),
            Board()
        )
    }

    val boards: LiveData<List<Board>> = _boards

}
