package com.alpesh1.mvvm_pattern.Database.UserViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alpesh1.mvvm_pattern.Repository.UserRepository

class MyViewModelFactory(private val userRepository: UserRepository) :ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return UserViewModel(userRepository) as T
    }

}