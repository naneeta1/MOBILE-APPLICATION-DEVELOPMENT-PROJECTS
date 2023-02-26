package com.example.lab_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
       var data = intent.extras
        var arr = data?.getString("words")
        var textf = findViewById<TextView>(R.id.story)
        textf.text = arr.toString()
    }
}