package com.example.perpuleapptest.ui.splash

import java.lang.Exception

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.perpuleapptest.R
import com.example.perpuleapptest.ui.auth.LoginActivity

class ActivitySplash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        val background = object:Thread()
        {
            override fun run()
            {
                try {
                    Thread.sleep(2950)
                    val intent = Intent(baseContext,
                        LoginActivity::class.java)
                    startActivity(intent)
                }
                catch (e: Exception)
                {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}