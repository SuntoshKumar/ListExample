package com.kyaw.listexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.google.android.material.card.MaterialCardView

class NameRecyclerAdapter : ListAdapter<Person,NameViewHolder>(PersonDiff()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {

        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.list_card,parent,false) as MaterialCardView

        return NameViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        val data = getItem(position)
        holder.setDate(data.date)
        holder.setName(data.name)
    }
}

class PersonDiff : DiffUtil.ItemCallback<Person>(){
    override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {

        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean {
        return oldItem.name == newItem.name
    }

}