package com.example.perpuleapptest.ui.auth

import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import org.kodein.di.android.subKodein

class LoginViewModel:ViewModel(){

    var email: String? = null;
    var password: String? = null;

    var authListener: AuthListener? = null

    fun onLoginButtonClick(view:View) {
        val intent = Intent(view.context,SignActivity::class.java)
        view.context.startActivity(intent)
    }

    fun tosignup(view: View){
        val intent = Intent(view.context,SignActivity::class.java)
        view.context.startActivity(intent)

        /*
        val intent = Intent(view.context,SignupActivity::class.java)
        view.context.startActivity(intent)

        Intent(view.context, SignupActivity::class.java).also {
            view.context.startActivity(it)
        }
         */
    }
}