package com.alpesh1.mvvm_pattern.Repository

import androidx.lifecycle.LiveData
import com.alpesh1.mvvm_pattern.Database.UserDao
import com.alpesh1.mvvm_pattern.Database.UserModel

class UserRepository(private val userDao: UserDao) {

    suspend fun insertdata(userModel: UserModel) {

        userDao.insertUser(userModel)

    }

    fun getUsers(): LiveData<List<UserModel>> {

        return userDao.getUsers()

    }

}