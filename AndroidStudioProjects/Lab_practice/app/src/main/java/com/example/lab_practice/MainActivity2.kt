package com.example.lab_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun armClick(view: View){
        var armImg: ImageView = findViewById<ImageView>(R.id.imageView4)
        var armCB: CheckBox = findViewById<CheckBox>(R.id.checkBox)
        if(armCB.isChecked){
            armImg.visibility = View.VISIBLE
        }else{
            armImg.visibility = View.INVISIBLE
        }
    }
}