package com.example.phonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.squareup.picasso.Picasso

class ContactDetailsActivity : AppCompatActivity() {
    lateinit var cvcontact: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)
        var name = intent.getStringExtra("name")
        var phone= intent.getStringExtra("phone")
        var  email= intent.getStringExtra("email")
        var imageUrl= intent.getStringExtra("image")

        var intentName = findViewById<TextView>(R.id.tvName1)
        var phone1 = findViewById<TextView>(R.id.tvPhone1)
        var email1 = findViewById<TextView>(R.id.tvEmail1)
        var image = findViewById<ImageView>(R.id.ivContact1)

        Picasso.get()
            .load(imageUrl)
            .resize(80, 80)
            .centerCrop()
            .into(image)

        intentName.text= name
        phone1.text= phone
        email1.text= email


    }
}