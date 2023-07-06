package com.alpesh1.mvvm_pattern.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserModel::class], version = 1)
abstract class RoomDBHelper : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {

        private var INSTANCE: RoomDBHelper? = null

        fun init(context: Context):RoomDBHelper{

//            synchronized(this){
//                if (INSTANCE != null){
                    INSTANCE = Room.databaseBuilder(context
                    ,RoomDBHelper::class.java,
                    "Students").build()
//                }
//            }
            return INSTANCE!!
        }

    }

}