package com.bbbrrr8877.testmobile.domain

interface SignInRepository {

    suspend fun moveToLogIn()

    suspend fun signIn(firstName: String) : UserItem

}