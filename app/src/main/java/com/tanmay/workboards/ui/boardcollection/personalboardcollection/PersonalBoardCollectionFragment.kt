package com.tanmay.workboards.ui.boardcollection.personalboardcollection

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.tanmay.workboards.R
import com.tanmay.workboards.ui.boardcollection.BoardCollectionFragment
import kotlinx.android.synthetic.main.board_collection_fragment.fragment_board_collection_title_text_view as collectionTitle

class PersonalBoardCollectionFragment : BoardCollectionFragment() {

    lateinit var viewModel: ViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        collectionTitle.text = getString(R.string.board_collection_title_personal_boards)
        collectionTitle.setCompoundDrawablesWithIntrinsicBounds(
            R.drawable.ic_person_black_24dp,
            0,
            0,
            0
        )

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel =
            ViewModelProviders.of(this).get(PersonalBoardCollectionViewModel::class.java)
    }
}