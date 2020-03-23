package com.tanmay.workboards.ui.board

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tanmay.workboards.application.WorkboardsApplication
import com.tanmay.workboards.data.entity.Task
import com.tanmay.workboards.data.entity.TaskList

class BoardViewModel(application: Application) : AndroidViewModel(application) {

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

    val mApp = application

    var boardId: Long = -1

    private var _memTaskList = MutableLiveData<List<TaskList>>().apply {
        value = (application as WorkboardsApplication).db.find { it.id == boardId }?.taskList
    }

    fun refreshTaskList() {
        _memTaskList = MutableLiveData<List<TaskList>>().apply {
            value = (mApp as WorkboardsApplication).db.find { it.id == boardId }?.taskList
        }
    }

    val tasklists: LiveData<List<TaskList>> = _memTaskList

    fun addDummyData() {
        _memTaskList = MutableLiveData<List<TaskList>>().apply {
            val x: List<TaskList> = _tasklists.value!!

            value = x
        }
    }

}
