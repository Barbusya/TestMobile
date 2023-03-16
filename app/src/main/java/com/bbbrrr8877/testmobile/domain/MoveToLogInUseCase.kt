package com.bbbrrr8877.testmobile.domain

class MoveToLogInUseCase(
    private val signInRepository: SignInRepository
) {

    suspend fun moveToLogIn() {
        signInRepository.moveToLogIn()
    }
}