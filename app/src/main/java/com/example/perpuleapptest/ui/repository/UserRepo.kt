package com.example.perpuleapptest.ui.repository

import com.example.perpuleapptest.ui.data.UserDatabase

class UserRepo(val db:UserDatabase){



     fun getUser(email:String,password:String)=db.getUserDao().getUser(email,password)

     //fun saveUser(email:String,password:String)=db.getUserDao().upsert()


}