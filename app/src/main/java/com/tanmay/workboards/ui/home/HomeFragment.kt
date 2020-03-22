package com.tanmay.workboards.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.tanmay.workboards.R
import com.tanmay.workboards.application.WorkboardsApplication
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val fragmentHolder = R.id.fragment_home_board_collection_holder_linear_layout

        if (true /*Check here is boards exist*/) {
            homeViewModel.frag1.observe(viewLifecycleOwner, Observer {
                val beginTransaction = childFragmentManager.beginTransaction()
                beginTransaction.replace(
                    fragmentHolder,
                    it
                )
                beginTransaction.commit()
            })

        }

        fragment_home_create_new_board_fab.setOnClickListener {
            if (/*!*/(context?.applicationContext as WorkboardsApplication).userLoggedIn) {
                findNavController().navigate(R.id.action_nav_home_to_loginFragment)
            } else {
                findNavController().navigate(R.id.action_nav_home_to_boardCreationFragment)
            }
        }

    }
}
