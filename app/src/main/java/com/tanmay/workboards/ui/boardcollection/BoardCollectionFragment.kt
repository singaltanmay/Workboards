package com.tanmay.workboards.ui.boardcollection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tanmay.workboards.R
import com.tanmay.workboards.model.Board
import kotlinx.android.synthetic.main.board_collection_fragment.*

open class BoardCollectionFragment : Fragment() {

    private lateinit var viewModel: BoardCollectionViewModel
    private lateinit var adapter: BoardRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.board_collection_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = BoardRecyclerAdapter(listOf(), context!!)

        fragment_board_collection_recycler_view.layoutManager =
            LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        fragment_board_collection_recycler_view.adapter = adapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BoardCollectionViewModel::class.java)
        setViewModelObservers()
    }

    fun setViewModelObservers() {
        viewModel.boards.observe(viewLifecycleOwner, Observer {
            refreshAdapterData(it)
        })
    }

    fun refreshAdapterData(data: List<Board>) {
        adapter.data = data
        adapter.notifyDataSetChanged()
    }

}
