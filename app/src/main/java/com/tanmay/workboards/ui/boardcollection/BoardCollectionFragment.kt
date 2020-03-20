package com.tanmay.workboards.ui.boardcollection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.tanmay.workboards.R

open class BoardCollectionFragment : Fragment() {

    companion object {
        fun newInstance() =
            BoardCollectionFragment()
    }

    private lateinit var viewModel: BoardCollectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.board_collection_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BoardCollectionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
