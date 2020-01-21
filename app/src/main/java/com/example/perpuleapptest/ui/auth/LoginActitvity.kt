package com.example.perpuleapptest.ui.auth

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.perpuleapptest.R
import com.example.perpuleapptest.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(),AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        binding.viewModel = viewModel

        viewModel.authListener = this
    }

    override fun onStarted() {
        Toast.makeText(this,"started",Toast.LENGTH_SHORT).show();
    }

    override fun onSuccess() {
        Toast.makeText(this,"success",Toast.LENGTH_SHORT).show();
    }

    override fun onFailure() {
        Toast.makeText(this,"failed",Toast.LENGTH_SHORT).show();
    }
}