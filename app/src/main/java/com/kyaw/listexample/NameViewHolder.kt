package com.kyaw.listexample

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.google.android.material.card.MaterialCardView

class NameViewHolder(itemView: MaterialCardView) : ViewHolder(itemView) {

    fun setDate(date:String){
        itemView.findViewById<TextView>(R.id.date).text = date
    }

    fun setName(name:String){
        itemView.findViewById<TextView>(R.id.name).text = name
    }
}