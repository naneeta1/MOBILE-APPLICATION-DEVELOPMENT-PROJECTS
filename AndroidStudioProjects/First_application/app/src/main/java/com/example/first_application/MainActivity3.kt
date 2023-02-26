package com.example.first_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var eye = findViewById<CheckBox>(R.id.Eyes)

        var ear = findViewById<CheckBox>(R.id.Ears)
        var eyebrows = findViewById<CheckBox>(R.id.Eyebrows)
        var Hat = findViewById<CheckBox>(R.id.Hat)
        var glasses = findViewById<CheckBox>(R.id.Glasses)
        var mouth = findViewById<CheckBox>(R.id.Mouth)
        var Arms = findViewById<CheckBox>(R.id.Arms)
        var mustache = findViewById<CheckBox>(R.id.Mustache)
        var nose = findViewById<CheckBox>(R.id.Nose)
        var shoes = findViewById<CheckBox>(R.id.Shoes)
        var frame = findViewById<ImageView>(R.id.imageView2)



    }



}