package com.bbbrrr8877.testmobile.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bbbrrr8877.testmobile.domain.UserItem
import kotlinx.coroutines.flow.Flow

@Dao
interface UsersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addUserItem(userItemDBModel: UserItemDBModel)

    @Query("SELECT * FROM user_item WHERE id=:userItem LIMIT 1")
    suspend fun getUser(userItem: UserItem): Flow<UserItemDBModel>

}
