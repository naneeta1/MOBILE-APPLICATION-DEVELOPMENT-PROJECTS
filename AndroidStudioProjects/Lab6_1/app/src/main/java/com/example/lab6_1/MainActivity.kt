package com.example.lab6_1

import AdapterClass
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var contacts : Array<user> = arrayOf(
            user(R.drawable.arfa_kareem,"Arfa Kareem","arfakareem@gmail.com","03332255889"),
            user(R.drawable.malala,"Malala yousuf zai","malala@gmail.com","03332255889"),
            user(R.drawable.bilqees_bano,"Bilqees Bano","bilqeesbano@gmail.com","03332255889")
        )

            var adapter:Adapter = AdapterClass(this,R.layout.row,contacts)
            var list = findViewById<ListView>(R.id.listV)
            list.adapter = adapter as ListAdapter?

    }

}
data class user(val img: Int,val name : String,val email: String,val phone:String)

