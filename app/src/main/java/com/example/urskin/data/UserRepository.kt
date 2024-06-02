package com.example.urskin.data

import com.example.urskin.data.pref.UserModel
import com.example.urskin.data.pref.UserPreference
import com.example.urskin.data.retrofit.ApiService
import kotlinx.coroutines.flow.Flow

class UserRepository private constructor(
    private val userPreference: UserPreference,
    private val apiService: ApiService
){

    suspend fun saveSession(user: UserModel){
        userPreference.saveSession(user)
    }

    fun getSession(): Flow<UserModel> {
        return userPreference.getSession()
    }


    //login
    //regist
    //logout
    //check
    //history

    companion object{
        @Volatile
        private var instance: UserRepository? = null

        fun getInstance(
            userPreferences: UserPreference,
            apiService: ApiService
        )= UserRepository (userPreferences, apiService)
    }
}