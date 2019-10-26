package com.chatair_android.ui.screens.contacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chatair_android.R
import com.chatair_android.ui.screens.contacts.models.Contact

class ContactsListAdapter(private val contacts: List<Contact>) : RecyclerView.Adapter<ContactsListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_contact, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(contacts[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.userNameTextView)
        private val statusTextView: TextView = itemView.findViewById(R.id.statusTextView)

        fun bind(contact: Contact) {
            nameTextView.text = contact.name
            statusTextView.text = contact.status
        }

    }
}