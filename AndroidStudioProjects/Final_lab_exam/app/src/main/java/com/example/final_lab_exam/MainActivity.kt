package com.example.final_lab_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import androidx.appcompat.app.AlertDialog
import androidx.core.view.updateLayoutParams
import java.util.*
import kotlin.collections.ArrayList
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
     var count by Delegates.notNull<Int>()
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button
    lateinit var btn5 : Button
    lateinit var btn6 : Button
    lateinit var btn7 : Button
    lateinit var btn8 : Button
    lateinit var arr: ArrayList<Button>
    var sorted by Delegates.notNull<Boolean>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        arr = arrayListOf(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8)
        arr.shuffle()
        sorted = false
        var grd = findViewById<GridLayout>(R.id.grid1)
        var rand = Random(8)
        if(sorted){
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Android Alert")
            builder.setMessage("We have a message")


        }



    }

    fun start(view: View){
        btn1.isClickable = true;
        btn2.isClickable = true;
        btn3.isClickable = true;
        btn4.isClickable = true;
        btn5.isClickable = true;
        btn6.isClickable = true;
        btn7.isClickable = true;
        btn8.isClickable = true;

    }

    fun btn1(view: View){

    }
}