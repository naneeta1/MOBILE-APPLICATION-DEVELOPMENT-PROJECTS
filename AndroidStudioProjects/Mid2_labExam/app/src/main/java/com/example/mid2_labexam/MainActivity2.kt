package com.example.mid2_labexam

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.properties.Delegates

class MainActivity2 : AppCompatActivity() {
    var value1 by Delegates.notNull<Int>()
    lateinit var database: SQLiteDatabase
    lateinit var uploadimg:Button
    lateinit var name:EditText
    lateinit var qnt: EditText
    lateinit var price:EditText
    lateinit var supName:EditText
    lateinit var supE : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        database = openOrCreateDatabase("DataBase",MODE_PRIVATE,null)
        uploadimg = findViewById(R.id.upload)
        qnt = findViewById(R.id.quantity)
        name  = findViewById(R.id.Name)
        price  = findViewById(R.id.price)
        supName  = findViewById(R.id.sup_name)
        supE  = findViewById(R.id.sup_email)
        var qnty = Integer.parseInt(qnt.text.toString())

        var plus = findViewById<Button>(R.id.plus)
        var minus = findViewById<Button>(R.id.minus)
        value1 = Integer.parseInt(qnt.text.toString())
        table()
        var save = findViewById<Button>(R.id.savebtn)
        save.setOnClickListener(View.OnClickListener {
            insertValues();
        })

    }
    fun addquantity(view: View)
    {
        value1 =value1!!+1
        //qnt.text = " value1"
    }
    fun minusquantity(view: View)
    {
        value1 = value1!!-1
   //     qnt.text = " " + value1
    }

    fun table(){
        val query = "CREATE TABLE IF NOT EXISTS Product( name TEXT,price INTEGER,supemail TEXT,supplier TEXT, quantity INTEGER)"
        database.execSQL(query)
    }
    fun insertValues(){

        var insertData: ContentValues = ContentValues()
        insertData.put("name",name.text.toString())
        insertData.put("price",Integer.parseInt(price.text.toString()))
        insertData.put("quantity",Integer.parseInt(qnt.text.toString()))
        insertData.put("supemail",supName.text.toString())
        insertData.put("supplier",supName.text.toString())
    //    insertData.put("image",R.drawable.img)
        database.insert("contacts",null,insertData)
    }
}