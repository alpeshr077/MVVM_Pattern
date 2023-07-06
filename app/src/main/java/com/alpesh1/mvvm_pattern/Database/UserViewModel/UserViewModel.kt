package com.alpesh1.mvvm_pattern.Database.UserViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alpesh1.mvvm_pattern.Database.UserModel
import com.alpesh1.mvvm_pattern.Repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {

    fun insertUser(userModel: UserModel) {

        viewModelScope.launch(Dispatchers.IO) {

            userRepository.insertdata(userModel)

        }
    }

    fun getUsers(): LiveData<List<UserModel>> {

       return userRepository.getUsers()
    }
}