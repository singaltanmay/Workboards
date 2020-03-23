package com.tanmay.workboards.ui.creation.board

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.tanmay.workboards.R
import com.tanmay.workboards.application.WorkboardsApplication
import com.tanmay.workboards.data.entity.Board
import kotlinx.android.synthetic.main.fragment_creation_board.*

class BoardCreationFragment : Fragment() {

    private lateinit var viewModel: BoardCreationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_creation_board, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BoardCreationViewModel::class.java)
        // TODO: Use the ViewModel

        boardcreationdone.setOnClickListener {
            val db = (context?.applicationContext as WorkboardsApplication).db
            db.add(Board(db.size.toLong(), spfndgnb.text.toString()))
            findNavController().popBackStack()
        }

    }

}
