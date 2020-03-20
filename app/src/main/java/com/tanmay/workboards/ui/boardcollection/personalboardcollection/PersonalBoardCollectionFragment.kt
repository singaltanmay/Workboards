package com.tanmay.workboards.ui.boardcollection.personalboardcollection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.tanmay.workboards.R
import com.tanmay.workboards.ui.boardcollection.BoardCollectionFragment
import kotlinx.android.synthetic.main.board_collection_fragment.fragment_board_collection_title_text_view as board_collection_text_view

class PersonalBoardCollectionFragment : BoardCollectionFragment() {

    lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val x = super.onCreateView(inflater, container, savedInstanceState)

        viewModel =
            ViewModelProviders.of(this).get(PersonalBoardCollectionViewModel::class.java)

        return x
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        board_collection_text_view.text = getString(R.string.board_collection_title_personal_boards)
        board_collection_text_view.setCompoundDrawablesWithIntrinsicBounds(
            R.drawable.ic_person_black_24dp,
            0,
            0,
            0
        )

    }
}