package com.example.urskin.data.pref

data class UserModel(
    val email: String,
    val token: String,
    val isLogin: Boolean = false
)
