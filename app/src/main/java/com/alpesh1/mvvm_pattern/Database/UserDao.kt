package com.alpesh1.mvvm_pattern.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface UserDao {

    @Insert
    fun insertUser(userModel: UserModel)

    @Query("SELECT * FROM users")
    fun getUsers():LiveData<List<UserModel>>

}