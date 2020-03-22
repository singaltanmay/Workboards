package com.tanmay.workboards.ui.creation.tasklist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.tanmay.workboards.R
import kotlinx.android.synthetic.main.fragment_creation_task_list.*

class TaskListCreationFragment : Fragment() {

    companion object {
        fun newInstance() = TaskListCreationFragment()
    }

    private lateinit var viewModel: TaskListCreationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_creation_task_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TaskListCreationViewModel::class.java)
        // TODO: Use the ViewModel

        taskListCreationFragment_create_task.setOnClickListener {
            findNavController().navigate(R.id.action_taskListCreationFragment_to_taskCreationFragment)
        }

    }

}
