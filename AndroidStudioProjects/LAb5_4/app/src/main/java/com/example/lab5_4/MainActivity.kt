package com.example.lab5_4

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
lateinit var db : SQLiteDatabase
lateinit var list : ListView
lateinit var btn : Button
lateinit var tf : EditText
lateinit var arr : ArrayList<String>
var count by Delegates.notNull<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = openOrCreateDatabase("DataBase", MODE_PRIVATE,null)
        list = findViewById<ListView>(R.id.listV)
        btn = findViewById<Button>(R.id.add)
        tf = findViewById<EditText>(R.id.textF)
        table()
        tf.setOnClickListener(View.OnClickListener {
            addItems()
            getValues()
        })
    }
    fun table(){
        var query = "CREATE TABLE IF NOT EXISTS todo(id INTEGER PRIMARY KEY,item TEXT)"
        db.execSQL(query)

    }

    fun addItems(){
        count++
        var data: ContentValues = ContentValues()
        data.put("id",count)
        data.put("todo",tf.text.toString())
        db.insert("todo",null,data)

    }
    fun getValues(){


    }
}