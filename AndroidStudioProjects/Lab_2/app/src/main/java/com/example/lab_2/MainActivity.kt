package com.example.lab_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun eatCookie(view: View){
        var imageV: ImageView = findViewById(R.id.imageView)
        var textV: TextView = findViewById(R.id.textView)
        var but: Button = findViewById(R.id.button)
        imageV.setImageResource(R.drawable.happy)
        textV.text = "I am so full"
        but.text = "Done"
        var intent = Intent(this,MainActivity3::class.java)
        startActivity(intent)

    }

}