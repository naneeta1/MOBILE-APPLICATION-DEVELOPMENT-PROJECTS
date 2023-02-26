package com.example.autopurchase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var text2 = findViewById<TextView>(R.id.textView2)
        text2.text = "DONE"

    }
    fun getIn(view: View){
        var intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
   override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       var menuInf : MenuInflater = getMenuInflater()
       menuInf.inflate(R.menu.main_menu,menu)
       return true
   }
}