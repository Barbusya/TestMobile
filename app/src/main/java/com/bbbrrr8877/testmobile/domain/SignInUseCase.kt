package com.bbbrrr8877.testmobile.domain

class SignInUseCase(
    private val signInRepository: SignInRepository
) {

    suspend fun signIn(firstName: String) : UserItem {
        return signInRepository.signIn(firstName)
    }
}