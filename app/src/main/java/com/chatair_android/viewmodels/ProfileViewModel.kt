package com.chatair_android.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chatair_android.models.User

class ProfileViewModel : ViewModel(){
    val user = MutableLiveData<User>()
    internal fun setUser(user : User){

        this.user.postValue(user)
    }
    internal fun getUser():LiveData<User>{
        return user
    }
}