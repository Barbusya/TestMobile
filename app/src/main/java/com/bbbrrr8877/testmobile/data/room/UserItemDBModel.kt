package com.bbbrrr8877.testmobile.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_item")
data class UserItemDBModel(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
)