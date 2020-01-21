package com.example.perpuleapptest.ui.auth

import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import com.example.perpuleapptest.ui.Util.Coroutines
import com.example.perpuleapptest.ui.data.User
import com.example.perpuleapptest.ui.repository.UserRepo
import org.kodein.di.android.subKodein



class LoginViewModel:ViewModel(){

    var email: String? = null
    var password: String? = null

    var authListener: AuthListener? = null

    var repo :UserRepo ?=null

    fun onLoginButtonClick(view:View) {
        authListener?.onStarted()
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            //failure
            authListener?.onFailure()
            return
        }


                val user= repo?.getUser(email!!, password!!)
                if(user?.emailId==email && user?.password==password){
                    //go to home page
                }
                else {
                    //show failure

                }


    }

    fun tosignup(view: View){
        val intent = Intent(view.context,SignActivity::class.java)
        view.context.startActivity(intent)
    }
}