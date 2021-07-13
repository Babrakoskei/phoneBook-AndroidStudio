package com.example.phonebook

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext

class ContactAdapter (var contactList:List<Contacts>,var context: Context):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item, parent, false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.tvNames.text = currentContact.name
        holder.tvEmailAddress.text = currentContact.email
        holder.tvPhone.text = currentContact.phone
    }


    override fun getItemCount(): Int {
      return  contactList.size
    }
}



class ContactViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
    var tvNames=itemView.findViewById<TextView>(R.id.tvNames)
    var tvPhone = itemView.findViewById<TextView>(R.id.tvphone)
    var tvEmailAddress = itemView.findViewById<TextView>(R.id.tvEmailAddress)
}
