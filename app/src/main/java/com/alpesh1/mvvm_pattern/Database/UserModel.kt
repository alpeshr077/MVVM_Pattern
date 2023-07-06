package com.alpesh1.mvvm_pattern.Database

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.annotation.ColorInt
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserModel(
    @ColumnInfo(name = "name") val name:String,
    @ColumnInfo(name = "surname") val surname:String,
    @ColumnInfo(name = "mobile") val mobile:String,
    @ColumnInfo(name = "email") val email:String,
    @ColumnInfo(name = "password") val password:String,
) {
    @PrimaryKey(autoGenerate = true) var id = 0
}


