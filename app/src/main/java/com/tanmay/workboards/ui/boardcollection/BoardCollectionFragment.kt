package com.tanmay.workboards.ui.boardcollection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tanmay.workboards.R
import com.tanmay.workboards.model.Board
import com.tanmay.workboards.ui.board.BoardFragment
import kotlinx.android.synthetic.main.fragment_board_collection.*

open class BoardCollectionFragment : Fragment() {

    private lateinit var viewModel: BoardCollectionViewModel
    private lateinit var adapter: BoardRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_board_collection, container, false)

    val navigateToBoardLambda: (Long, String) -> Unit = { id, name ->
        val navController = findNavController()
        navController.graph.get(R.id.boardFragment).label = name
        navController.navigate(
            R.id.action_nav_home_to_boardFragment,
            BoardFragment.navToBoard(id)
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = BoardRecyclerAdapter(context!!, navigateToBoardLambda)

        fragment_board_collection_recycler_view.layoutManager =
            LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        fragment_board_collection_recycler_view.adapter = adapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BoardCollectionViewModel::class.java)
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
