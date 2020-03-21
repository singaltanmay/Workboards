package com.tanmay.workboards.ui.board

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanmay.workboards.data.entity.Task
import com.tanmay.workboards.data.entity.TaskList

class BoardViewModel : ViewModel() {

    private val _tasklists = MutableLiveData<List<TaskList>>().apply {
        value = mutableListOf(
            TaskList(
                "New Task",
                listOf(
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task")
                )
            ),
            TaskList("New Task", null),
            TaskList(
                "New Task",
                listOf(
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task")
                )
            ),
            TaskList("New Task", null),
            TaskList("New Task", null),
            TaskList(
                "New Task",
                listOf(
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task"),
                    Task("This is the body of a task")
                )
            ),
            TaskList("New Task", null)
        )
    }

    val tasklists: LiveData<List<TaskList>> = _tasklists

}
