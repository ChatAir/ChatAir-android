package com.chatair_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnProfile.setOnClickListener { v ->
            val profileIntent = Intent(applicationContext, ProfileActivity::class.java)
            startActivity(profileIntent)
        }
    }
}
