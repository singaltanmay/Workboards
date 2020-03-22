package com.tanmay.workboards.ui.user

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _email = MutableLiveData<Editable>()
    private val _password = MutableLiveData<Editable>()

    val email: LiveData<Editable> = _email
    val password: LiveData<Editable> = _password

}
