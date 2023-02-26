package com.example.lab5_1

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.ArrayList


class MainActivity2 : AppCompatActivity() {
    lateinit var list : ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var data = intent.extras
        list = data?.getStringArrayList("names") as ArrayList<String>
        var lv = findViewById<ListView>(R.id.ListV)

        val arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            list
        )
        lv.adapter = arrayAdapter
       // Toast.makeText(this,list,Toast.LENGTH_SHORT).show()


    }





}