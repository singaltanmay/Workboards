package com.tanmay.workboards.ui.creation.tasklist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.tanmay.workboards.R
import com.tanmay.workboards.application.WorkboardsApplication
import com.tanmay.workboards.data.entity.TaskList
import kotlinx.android.synthetic.main.fragment_creation_task_list.*

class TaskListCreationFragment : Fragment() {

    private lateinit var viewModel: TaskListCreationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_creation_task_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TaskListCreationViewModel::class.java)

        val listNameString = oissdob.text.toString()
        val boardIdlong = arguments?.getLong(BUNDLE_BOARD_ID_KEY)

        nfvoiNVeb.setOnClickListener {
            val db = (context?.applicationContext as WorkboardsApplication).db
            val board = db.find { b -> b.id == boardIdlong }
            if (board != null) {
                db.remove(board)
                board?.taskList?.add(TaskList(listNameString))
                db.add(board)
            }
            findNavController().popBackStack()
        }

    }


    companion object {
        const val BUNDLE_BOARD_ID_KEY = "foins390"

        fun navToBoard(boardId: Long): Bundle {
            val bundle = Bundle()
            bundle.putLong(Companion.BUNDLE_BOARD_ID_KEY, boardId)
            return bundle
        }
    }


}
