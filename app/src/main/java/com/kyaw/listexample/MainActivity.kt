package com.kyaw.listexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val personList = listOf<Person>(Person("1","Sam"),Person("2","Kyaw"),Person("3","Swar"))

        val recycler = findViewById<RecyclerView>(R.id.mainRecycler)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recycler.layoutManager = layoutManager

        val adapter = NameRecyclerAdapter()
        recycler.adapter = adapter
        adapter.submitList(personList)

    }
}