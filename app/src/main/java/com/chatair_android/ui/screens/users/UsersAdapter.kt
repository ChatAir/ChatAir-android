package com.chatair_android.ui.screens.users

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chatair_android.R
import com.chatair_android.ui.screens.users.model.User


class UsersAdapter(private val users: List<User>) :
    RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtName.text = users[position].Name
        holder.txtMessage.text = users[position].latestMessage
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent,false) as View)
    }

    override fun getItemCount() = users.size

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val txtName: TextView = itemView.findViewById(R.id.txt_username)
        val txtMessage: TextView = itemView.findViewById(R.id.txt_message)

    }
}