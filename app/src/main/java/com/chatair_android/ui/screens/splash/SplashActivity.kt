package com.chatair_android.ui.screens.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.chatair_android.R
import com.chatair_android.ui.screens.users.UsersActivity
import com.chatair_android.utils.gotoActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            this.gotoActivity(this@SplashActivity, UsersActivity::class.java)
        }, 4000)
    }
}