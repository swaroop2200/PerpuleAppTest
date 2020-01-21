package com.example.perpuleapptest.ui.auth

import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
<<<<<<< HEAD
import com.example.perpuleapptest.ui.home.HomeActivity
=======
import org.kodein.di.android.subKodein
>>>>>>> 54f91645320b2e837f841b19897ac431bf204ff0

class LoginViewModel:ViewModel(){

    var email: String? = null;
    var password: String? = null;

    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View) {
        /*
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure()
            return
<<<<<<< HEAD
        }*/

        val intent = Intent(view.context,HomeActivity::class.java)
=======
        }
    }

    fun tosignup(view: View){
        authListener?.onSuccess()

        val intent = Intent(view.context,SignupActivity::class.java)
>>>>>>> 54f91645320b2e837f841b19897ac431bf204ff0
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