package com.tanmay.workboards.ui.board

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tanmay.workboards.R
import com.tanmay.workboards.data.entity.TaskList

class TaskListRecyclerAdapter(
    val context: Context,
    var data: List<TaskList> = listOf()
) : RecyclerView.Adapter<TaskListRecyclerAdapter.TaskListHolder>() {

    inner class TaskListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val parent = itemView
        val taskListTitleTextView = itemView.findViewById<TextView>(R.id.item_tasklist_title)
        val taskRecyclerView = itemView.findViewById<RecyclerView>(R.id.item_tasklist_recycler_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskListHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_tasklist, parent, false)
        return TaskListHolder(view)
    }

    override fun onBindViewHolder(holder: TaskListHolder, position: Int) {
        val currentTaskList = data[position]

        holder.taskListTitleTextView.text = currentTaskList.name

        val tasks = currentTaskList.tasks
        if (tasks != null) {
            holder.taskRecyclerView.adapter = TaskRecyclerAdapter(
                context,
                tasks
            )
        }
    }

    override fun getItemCount(): Int = data.size
}