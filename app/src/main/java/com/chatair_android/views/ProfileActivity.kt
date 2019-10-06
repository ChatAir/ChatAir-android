package com.chatair_android.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.chatair_android.R
import com.chatair_android.models.User
import com.chatair_android.viewmodels.ProfileViewModel
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    private lateinit var profileViewModel: ProfileViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        initViewModel()
    }

    fun initViewModel(){
        profileViewModel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(ProfileViewModel::class.java)
        // example
        val user = User("galihsatriawan","galih","galihsatriawan")
        profileViewModel.setUser(user)
        profileViewModel.getUser().observe(this, Observer { user ->
            showProfile(user)
        })
    }
    private fun showProfile(user:User?){
        tvUsername.text = user?.username
        tvFullname.text = user?.fullname
    }
}
