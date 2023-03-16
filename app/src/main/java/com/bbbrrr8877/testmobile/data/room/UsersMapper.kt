package com.bbbrrr8877.testmobile.data.room

import com.bbbrrr8877.testmobile.domain.UserItem

class UsersMapper {

    fun mapEntityToDbModel(userItem: UserItem) = UserItemDBModel(
        id = userItem.id,
        firstName = userItem.firstName,
        lastName = userItem.lastName,
        email = userItem.email,
        password = userItem.password,
    )

    fun mapDbModelToEntity(userItemDBModel: UserItemDBModel) = UserItem(
        id = userItemDBModel.id,
        firstName = userItemDBModel.firstName,
        lastName = userItemDBModel.lastName,
        email = userItemDBModel.email,
        password = userItemDBModel.password,
    )
}