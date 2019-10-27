package com.chatair_android.ui.screens.users

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.chatair_android.ui.screens.users.model.User
import kotlinx.android.synthetic.main.activity_contacts.toolbar
import kotlinx.android.synthetic.main.activity_users.*

class UsersActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.chatair_android.R.layout.activity_users)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerViewUsers.layoutManager = LinearLayoutManager(this)
        recyclerViewUsers.adapter = UsersAdapter(getDummyContacts())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(com.chatair_android.R.menu.users_toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun getDummyContacts(): List<User> {
        val users = mutableListOf<User>()
        for (i in 0..20) {
            users.add(User("User $i", "Message $i"))
        }
        return users
    }
}
