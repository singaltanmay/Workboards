package com.tanmay.workboards.ui.board

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tanmay.workboards.R
import com.tanmay.workboards.model.Task

class TaskRecyclerAdapter(
    val context: Context,
    var data: List<Task> = listOf()
) : RecyclerView.Adapter<TaskRecyclerAdapter.TaskHolder>() {


    inner class TaskHolder(i: View) : RecyclerView.ViewHolder(i) {
        val parent = i
        val taskBodyTextView = i.findViewById<TextView>(R.id.item_task_body)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskHolder =
        TaskHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_task_preview_card,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: TaskHolder, position: Int) {
        val currentTask = data[position]

        holder.taskBodyTextView.text = currentTask.body
    }

    override fun getItemCount(): Int = data.size
}