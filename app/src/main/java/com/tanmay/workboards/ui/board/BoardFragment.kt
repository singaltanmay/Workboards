package com.tanmay.workboards.ui.board

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tanmay.workboards.R
import com.tanmay.workboards.model.TaskList
import kotlinx.android.synthetic.main.fragment_board.*

class BoardFragment : Fragment() {

    private lateinit var viewModel: BoardViewModel
    private lateinit var adapter: TaskListRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_board, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = TaskListRecyclerAdapter(context!!)
        fragment_board_recycler_view.adapter = adapter

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BoardViewModel::class.java)

        setViewModelObservers()

        Toast.makeText(
            context,
            "Navigate to board ${arguments?.getLong(BUNDLE_BOARD_ID_KEY).toString()}",
            Toast.LENGTH_SHORT
        ).show()

    }

    fun setViewModelObservers() {
        viewModel.tasklists.observe(viewLifecycleOwner, Observer {
            refreshAdapterData(it)
        })
    }

    fun refreshAdapterData(data: List<TaskList>) {
        adapter.data = data
        adapter.notifyDataSetChanged()
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
