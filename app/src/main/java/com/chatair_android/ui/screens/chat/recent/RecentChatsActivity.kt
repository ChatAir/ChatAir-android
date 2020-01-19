package com.chatair_android.ui.screens.chat.recent

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.chatair_android.R
import com.chatair_android.ui.screens.chat.Chat
import com.chatair_android.ui.screens.contacts.ContactsActivity
import com.chatair_android.utils.gotoActivity
import com.chatair_android.utils.showLongToast
import kotlinx.android.synthetic.main.activity_recent_chats.*

class RecentChatsActivity : AppCompatActivity(), OnItemClickListener {


    companion object {
        private val TAG: String = RecentChatsActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recent_chats)

        setSupportActionBar(toolbar_recent_chats)

        recentChatsRV.layoutManager = LinearLayoutManager(this)
        recentChatsRV.adapter = RecentChatsListAdapter(getDummyRecentChats(), this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.recent_chats_toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_option_zero -> showLongToast("Option 0 clicked")
            R.id.action_option_one -> showLongToast("Option 1 clicked")
            R.id.action_option_two -> showLongToast("Option 2 clicked")
            else -> Log.d(TAG, "Default case of onOptionsItemSelected")
        }
        return super.onOptionsItemSelected(item)
    }

    private fun getDummyRecentChats(): List<Chat> {
        val recentChats = mutableListOf<Chat>()
        for (i in 0..20) {
            recentChats.add(Chat(name = "User Name $i", messageSnippet = "Message"))
        }
        return recentChats
    }

    override fun onItemClicked(chat: Chat) {
        showLongToast("Open the Chat Screen for chat with ${chat.name} ")
    }

    fun openContactsActivity(view: View) {
        this.gotoActivity(view.context, ContactsActivity::class.java)
    }

}
