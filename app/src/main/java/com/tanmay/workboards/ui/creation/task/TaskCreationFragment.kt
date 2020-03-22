package com.tanmay.workboards.ui.creation.task

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.tanmay.workboards.R

class TaskCreationFragment : Fragment() {

    companion object {
        fun newInstance() = TaskCreationFragment()
    }

    private lateinit var viewModel: TaskCreationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_creation_task, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TaskCreationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
