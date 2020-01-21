package com.example.perpuleapptest.ui.auth

interface SignUpListener {
    fun onSuccess()
    fun onFailure(message:String)
    fun onStarted()
}