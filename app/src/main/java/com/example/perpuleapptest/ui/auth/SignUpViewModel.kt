package com.example.perpuleapptest.ui.auth

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {
    var email: String? = null
    var password: String? = null
    var confirm: String? = null

    var signupListener: SignUpListener? = null

    fun home(view: View) {
        signupListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            signupListener?.onFailure("Invalid email or password")
            return
        }
        signupListener?.onStarted()
    }
}
