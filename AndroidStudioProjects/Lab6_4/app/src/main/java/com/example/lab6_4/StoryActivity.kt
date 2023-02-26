package com.example.lab6_4

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView


class StoryActivity : AppCompatActivity() {
    lateinit var storyName: ArrayList<String>
    lateinit var story: ArrayList<String>
    lateinit var db: SQLiteDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        db = openOrCreateDatabase("DataBase", MODE_PRIVATE,null)
        createTable()

    }
    fun createTable(){
        var query = "CREATE TABLE IF NOT EXISTS stories(id INTEGER,name TEXT, story TEXT)"
        db.execSQL(query)
    }
    fun inputData(id: Int,Sname: String, story: String){
        var input: ContentValues = ContentValues()
        input.put("id",id)
        input.put("name",Sname)
        input.put("story", story)
        db.insert("stories",null,input)
    }
    fun getValues(){
        var query = "SELECT * FROM stories"
        var results: Cursor = db.rawQuery(query,null)
        results.moveToFirst()
        do{
            var uname =results.getString(1)
            var ustory =results.getString(2)
            storyName.add(uname)
            story.add(ustory)
        }while(results.moveToNext())

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,storyName)
        var list = findViewById<ListView>(R.id.listStories)
        list.adapter = arrayAdapter

    }


}