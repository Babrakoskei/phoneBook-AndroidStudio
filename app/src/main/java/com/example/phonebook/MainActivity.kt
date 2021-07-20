package com.example.phonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvContacts = findViewById<RecyclerView>(R.id.rvContacts)
        var contactList = listOf(
                Contacts("sarah", "07455657677", "sarah@gmail.com","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
                Contacts("Aluf", "07455657677", "hamdialuf@gmail.com.com","https://images.unsplash.com/photo-1565990315145-9b2f389b0927?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
                Contacts("Margaret", "074559905", "margaret@gmail.com","https://images.unsplash.com/photo-1522941471521-6ee21ec5cc26?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
                Contacts("Gilly", "0735565767", "oluochh@gmail.com","https://images.unsplash.com/photo-1522941471521-6ee21ec5cc26?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
                Contacts("Babra", "074556576787", "babra@gmail.com","https://images.unsplash.com/photo-1522941471521-6ee21ec5cc26?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
                Contacts("Florah", "074556576787", "florahh@gmail.com","https://images.unsplash.com/photo-1522941471521-6ee21ec5cc26?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
                Contacts("patricia", "074556576787", "patricia@gmail.com","https://images.unsplash.com/photo-1522941471521-6ee21ec5cc26?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
                Contacts("maina", "074556576787", "maina@gmail.com","https://images.unsplash.com/photo-1522941471521-6ee21ec5cc26?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
                Contacts("Serah", "074556576787", "serah@gmail.com","https://images.unsplash.com/photo-1522941471521-6ee21ec5cc26?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
                Contacts("Sandra", "074556576787", "sandra@gmail.com","https://images.unsplash.com/photo-1522941471521-6ee21ec5cc26?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
                Contacts("Brenda", "074556576787", "brenda@gmail.com","https://images.unsplash.com/photo-1522941471521-6ee21ec5cc26?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
                Contacts("Mary", "0733276787", "mary@gmail.com","https://images.unsplash.com/photo-1522941471521-6ee21ec5cc26?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),


                )
        rvContacts= findViewById(R.id.rvContacts)
       var contactAdapter = ContactAdapter(contactList,baseContext)

            rvContacts.layoutManager= LinearLayoutManager(baseContext)
            rvContacts.adapter= contactAdapter
        }

    }
