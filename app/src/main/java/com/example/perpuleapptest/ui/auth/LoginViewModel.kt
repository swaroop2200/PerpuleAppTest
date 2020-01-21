package com.example.perpuleapptest.ui.auth

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.perpuleapptest.ui.home.HomeActivity

class LoginViewModel:ViewModel(){

    var email: String? = null;
    var password: String? = null;

    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View) {

        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure()
            return
        }


        }


    fun tosignup(view: View){


        val intent = Intent(view.context,SignActivity::class.java)
        view.context.startActivity(intent)


    }


}
