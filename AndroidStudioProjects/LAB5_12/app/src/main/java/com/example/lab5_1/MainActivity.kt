package com.example.lab5_1

import android.content.ContentValues
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

lateinit var database: SQLiteDatabase
lateinit var name: EditText
lateinit var phone: EditText
lateinit var email: EditText
lateinit var street: EditText
lateinit var city: EditText
lateinit var btnSave: Button
lateinit var arr: ArrayList<String>
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arr = ArrayList()
        database = openOrCreateDatabase("DataB",MODE_PRIVATE,null)
        name = findViewById(R.id.tfName)
        phone = findViewById(R.id.tfPhone)
        street = findViewById(R.id.tfStreet)
        email = findViewById(R.id.tfEmail)
        city = findViewById(R.id.tfCity)
        btnSave = findViewById(R.id.button)
        table()
        btnSave.setOnClickListener(View.OnClickListener {
            insertValues()
            getValus()
        })

    }
    fun table(){
        val query = "CREATE TABLE IF NOT EXISTS contacts(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, phone TEXT, street TEXT,"+
        "email TEXT, city TEXT)"
        database.execSQL(query)
    }
    fun insertValues(){

        var insertData: ContentValues = ContentValues()
        insertData.put("id",1)
        insertData.put("name",name.text.toString())
        insertData.put("phone",phone.text.toString())
        insertData.put("street",street.text.toString())
        insertData.put("email",email.text.toString())
        insertData.put("city",city.text.toString())
        database.insert("contacts",null,insertData)


    }
    fun getValus(){
        var query = "SELECT * FROM contacts"
        var results:Cursor = database.rawQuery(query,null)
        results.moveToFirst()
        do{
            var uname = results.getString(1)
            arr.add(uname)
        }while (results.moveToNext())

        var intent = Intent(this,MainActivity2::class.java)
        intent.putExtra("names",arr)
        startActivity(intent)
    }

}