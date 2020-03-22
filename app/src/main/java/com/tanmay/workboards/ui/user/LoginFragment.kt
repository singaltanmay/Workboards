package com.tanmay.workboards.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.tanmay.workboards.R
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.frag_user_login_cancel_button as cancelButton
import kotlinx.android.synthetic.main.fragment_login.frag_user_login_next_button as loginButton
import kotlinx.android.synthetic.main.fragment_login.frag_user_login_sing_up_button as signUpButton

class LoginFragment : Fragment() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onStart() {
        super.onStart()
        (activity as AppCompatActivity).supportActionBar?.hide()
        Thread { setupListeners() }.start()
    }

    private fun setupListeners() {
        cancelButton.setOnClickListener {
            findNavController().popBackStack()
        }
        loginButton.setOnClickListener {
//            listener?.onLogin(-1)
        }
        signUpButton.setOnClickListener {
//            findNavController().navigate(R.id.action_userLoginFragment_to_userCreationFragment)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        viewModel.email.observe(viewLifecycleOwner, Observer {
            frag_user_login_email_id_edit_text.text = it
        })

        viewModel.password.observe(viewLifecycleOwner, Observer {
            frag_user_login_password_edit_text.text = it
        })

    }

    override fun onPause() {
        super.onPause()
        (activity as AppCompatActivity).supportActionBar?.show()
    }

    interface OnUserLoginListener {
        fun onLogin(userId: Long)
    }

}
