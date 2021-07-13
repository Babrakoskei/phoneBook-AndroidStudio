package com.example.phonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvContacts = findViewById<RecyclerView>(R.id.rvContacts)
        var contactList = listOf(
                Contacts("sarah", "07455657677", "sarah@gmail.com"),
                Contacts("Aluf", "07455657677", "hamdialuf@gmail.com.com"),
                Contacts("Margaret", "074559905", "margaret@gmail.com"),
                Contacts("Gilly", "0735565767", "oluochh@gmail.com"),
                Contacts("Babra", "074556576787", "babra@gmail.com"),
                Contacts("Florah", "074556576787", "florahh@gmail.com"),
                Contacts("patricia", "074556576787", "patricia@gmail.com"),
                Contacts("maina", "074556576787", "maina@gmail.com"),
                Contacts("Serah", "074556576787", "serah@gmail.com"),
                Contacts("Sandra", "074556576787", "sandra@gmail.com"),
                Contacts("Brenda", "074556576787", "brenda@gmail.com"),
                Contacts("Mary", "0733276787", "mary@gmail.com"),


                )
        rvContacts.layoutManager = LinearLayoutManager(baseContext)
        val contactAdapter = ContactAdapter(contactList, baseContext)
        rvContacts.adapter = contactAdapter

    }
}