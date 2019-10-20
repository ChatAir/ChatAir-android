package com.chatair_android.ui.screens.contacts

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.chatair_android.ui.screens.contacts.models.Contact
import kotlinx.android.synthetic.main.activity_contacts.*


class ContactsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.chatair_android.R.layout.activity_contacts)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        contactsList.layoutManager = LinearLayoutManager(this)
        contactsList.adapter = ContactsListAdapter(getDummyContacts())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(com.chatair_android.R.menu.contacts_toolbar_menu, menu)

        val searchItem = menu.findItem(com.chatair_android.R.id.action_search)

        val searchManager =
            this@ContactsActivity.getSystemService(Context.SEARCH_SERVICE) as SearchManager

        var searchView: SearchView? = null
        if (searchItem != null) {
            searchView = searchItem.actionView as SearchView
        }
        searchView?.setSearchableInfo(searchManager.getSearchableInfo(this@ContactsActivity.componentName))
        return super.onCreateOptionsMenu(menu)
    }

    private fun getDummyContacts(): List<Contact> {
        val contacts = mutableListOf<Contact>()
        for (i in 0..20) {
            contacts.add(Contact(name = "User $i", status = "Online"))
        }
        return contacts
    }
}
