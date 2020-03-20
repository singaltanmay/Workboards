package com.tanmay.workboards.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.tanmay.workboards.R
import com.tanmay.workboards.ui.boardcollection.BoardCollectionFragment
import com.tanmay.workboards.ui.boardcollection.personalboardcollection.PersonalBoardCollectionFragment

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val fragmentHolder = R.id.fragment_home_board_collection_holder_linear_layout

        if (true /*Check here is boards exist*/) {
            val beginTransaction = childFragmentManager.beginTransaction()
            beginTransaction.add(fragmentHolder,
                PersonalBoardCollectionFragment()
            )
            beginTransaction.commit()
        }

//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            text_home.text = it
//        })
    }
}
