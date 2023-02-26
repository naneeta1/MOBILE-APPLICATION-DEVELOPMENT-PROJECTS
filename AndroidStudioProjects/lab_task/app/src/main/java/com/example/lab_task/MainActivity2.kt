package com.example.lab_task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater:MenuInflater = getMenuInflater()
        inflater.inflate(R.menu.main_menu,menu)
        return true
    }

    fun click1(view:View){
        var intent = Intent(this, MainActivity3::class.java)
        intent.putExtra("Pic",R.drawable.img)
        intent.putExtra("des","chinese special")
        intent.putExtra("Price",300)
        startActivityForResult(intent,123)
    }
}