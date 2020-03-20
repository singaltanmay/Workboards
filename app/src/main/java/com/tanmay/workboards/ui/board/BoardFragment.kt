package com.tanmay.workboards.ui.board

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tanmay.workboards.R

class BoardFragment : Fragment() {

    private lateinit var viewModel: BoardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_board, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BoardViewModel::class.java)

        Toast.makeText(
            context,
            "Navigate to board ${arguments?.getLong(BUNDLE_BOARD_ID_KEY).toString()}",
            Toast.LENGTH_SHORT
        ).show()

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
