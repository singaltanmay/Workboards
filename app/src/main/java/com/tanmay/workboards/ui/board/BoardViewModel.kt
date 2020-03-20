package com.tanmay.workboards.ui.board

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanmay.workboards.model.TaskList

class BoardViewModel : ViewModel() {

    private val _tasklists = MutableLiveData<List<TaskList>>().apply {
        value = mutableListOf(
            TaskList("New Task", null),
            TaskList("New Task", null),
            TaskList("New Task", null),
            TaskList("New Task", null),
            TaskList("New Task", null),
            TaskList("New Task", null),
            TaskList("New Task", null),
            TaskList("New Task", null),
            TaskList("New Task", null)
        )
    }

    val tasklists: LiveData<List<TaskList>> = _tasklists

}
