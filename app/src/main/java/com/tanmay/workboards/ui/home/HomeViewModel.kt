package com.tanmay.workboards.ui.home

import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanmay.workboards.ui.boardcollection.personalboardcollection.PersonalBoardCollectionFragment

class HomeViewModel : ViewModel() {

    val frag1 = MutableLiveData<Fragment>().apply {
        value = PersonalBoardCollectionFragment()
    }

}