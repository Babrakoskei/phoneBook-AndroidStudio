package com.example.phonebook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import java.security.AccessControlContext

class ContactAdapter (var contactList:List<Contacts>,var context: Context):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactList.get(position)

        holder.name.text = currentContact.name
        holder.email.text = currentContact.email
        holder.phone.text = currentContact.phone

        holder.cvContact.setOnClickListener {
            val intent= Intent(context,ContactDetailsActivity::class.java)
            intent.putExtra("name",currentContact.name)
            intent.putExtra("phone",currentContact.phone)
            intent.putExtra("email",currentContact.email)
            intent.putExtra("image",currentContact.imageUrl)
            context.startActivity(intent)

        }
        Picasso.get()
                .load(currentContact.imageUrl)
                .resize(80, 80)
                .centerCrop()
                .into(holder.ivContact)
    }

//        holder.cvContact.setOnClickListener {
//         var intent= Intent
//        }



    override fun getItemCount(): Int {
      return  contactList.size
    }
}



class ContactViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
    var name=itemView.findViewById<TextView>(R.id.tvName)
    var phone = itemView.findViewById<TextView>(R.id.tvPhone)
    var email= itemView.findViewById<TextView>(R.id.tvEmail)
    var ivContact = itemView.findViewById<ImageView>(R.id.ivContact)
    var cvContact = itemView.findViewById<CardView>(R.id.cvContact)
}
