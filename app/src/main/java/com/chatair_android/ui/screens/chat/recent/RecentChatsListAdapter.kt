package com.chatair_android.ui.screens.chat.recent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chatair_android.R
import com.chatair_android.ui.screens.chat.Chat

class RecentChatsListAdapter(private val chats: List<Chat>) : RecyclerView.Adapter<RecentChatsListAdapter.RecentChatVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentChatVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_recent_chat, parent, false)
        return RecentChatVH(view)
    }

    override fun getItemCount(): Int {
        return chats.size
    }

    override fun onBindViewHolder(holder: RecentChatVH, position: Int) {
        holder.bind(chats[position])
    }

    class RecentChatVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.userNameTextView)
        private val messageSnippetTextView: TextView = itemView.findViewById(R.id.messageSnippetTextView)

        fun bind(chat: Chat) {
            nameTextView.text = chat.name
            messageSnippetTextView.text = chat.messageSnippet
        }

    }
}