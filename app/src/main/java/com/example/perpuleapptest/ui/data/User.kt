package com.example.perpuleapptest.ui.data



import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName = "Login")
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var emailId: String? = null,
    var password: String? = null
)