package com.bbbrrr8877.testmobile.domain

data class UserItem(
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    var id: Long = UNDEFINED_ID,
) {
    companion object {
        const val  UNDEFINED_ID = 0L
    }
}
