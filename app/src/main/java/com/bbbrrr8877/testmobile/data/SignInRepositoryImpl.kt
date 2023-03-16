package com.bbbrrr8877.testmobile.data

import com.bbbrrr8877.testmobile.data.room.UsersDao
import com.bbbrrr8877.testmobile.data.room.UsersMapper
import com.bbbrrr8877.testmobile.domain.SignInRepository
import com.bbbrrr8877.testmobile.domain.UserItem

class SignInRepositoryImpl(
    private val usersDao: UsersDao,
    private val mapper: UsersMapper,
) : SignInRepository {

    override suspend fun moveToLogIn() {
        TODO("Not yet implemented")
    }

    override suspend fun signIn(firstName: String): UserItem {
        TODO("Not yet implemented")
    }

}