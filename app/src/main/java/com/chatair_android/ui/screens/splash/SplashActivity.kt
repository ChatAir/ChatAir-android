package com.chatair_android.ui.screens.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.chatair_android.ui.screens.main.MainActivity
import com.chatair_android.R
import com.chatair_android.ui.screens.chat.recent.RecentChatsActivity
import com.chatair_android.ui.screens.contacts.ContactsActivity
import com.chatair_android.ui.screens.login.LoginActivity
import com.chatair_android.utils.gotoActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            this.gotoActivity(this@SplashActivity, LoginActivity::class.java)
        }, 4000)
    }
}