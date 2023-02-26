package com.example.lab6_4

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    lateinit var  dataB : SQLiteDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        dataB = openOrCreateDatabase("Story", MODE_PRIVATE,null)
        var q = "CREATE TABLE IF NOT EXISTS stories(id INTEGER, name TEXT , Story TEXT)"
        dataB.execSQL(q)
        var data = intent.extras
        var arr = data?.getString("words")
        var textf = findViewById<TextView>(R.id.story)
        textf.text = arr.toString()
        var content = ContentValues()
        content.put("id",1)
        content.put("name","ABC")
        content.put("Story",arr.toString())
        dataB.insert("stories",null,content)
        



    }
}