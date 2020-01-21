package com.example.perpuleapptest.ui.auth

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {
    var email: String? = null
    var password: String? = null
    var confirm: String? = null

    var authListener: SignUpListener? = null

    fun home(view: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid email or password")
            return
        }
        authListener?.onStarted()
    }
}
