package com.example.perpuleapptest.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.perpuleapptest.R
import com.example.perpuleapptest.databinding.ActivitySignUpBinding
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class SignupActivity : AppCompatActivity(), SignUpListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding: ActivitySignUpBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)
        val viewModel = ViewModelProviders.of(this).get(SignUpViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.authListener = this

    }


    override fun onStarted() {
        Toast.makeText(this,"Started", Toast.LENGTH_SHORT)
    }

    override fun onSuccess() {
        Toast.makeText(this,"Success", Toast.LENGTH_SHORT)
    }

    override fun onFailure(message: String) {
        Toast.makeText(this,message, Toast.LENGTH_SHORT)
    }
}
