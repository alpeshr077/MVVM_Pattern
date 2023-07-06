package com.alpesh1.mvvm_pattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alpesh1.mvvm_pattern.Database.RoomDBHelper
import com.alpesh1.mvvm_pattern.Database.UserDao
import com.alpesh1.mvvm_pattern.Database.UserModel
import com.alpesh1.mvvm_pattern.Database.UserViewModel.MyViewModelFactory
import com.alpesh1.mvvm_pattern.Database.UserViewModel.UserViewModel
import com.alpesh1.mvvm_pattern.Repository.UserRepository
import com.alpesh1.mvvm_pattern.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var userDao = RoomDBHelper.init(this).userDao()
        var repository = UserRepository(userDao)
        var viewmodel = MyViewModelFactory(repository).create(UserViewModel::class.java)

        viewmodel.getUsers().observe(this,{

            binding.txtText.text = it.toString()+"\n\n"

        })

        binding.btnAdd.setOnClickListener {
            var data = UserModel("Alpesh","Rathava","9685741236","alpesh1@gmail.com","12345678")
            viewmodel.insertUser(data)

        }

    }
}