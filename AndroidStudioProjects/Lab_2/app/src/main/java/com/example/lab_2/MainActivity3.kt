package com.example.lab_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.reflect.Modifier

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var btn1 =findViewById<Button>(R.id.one)
        var btn2 =findViewById<Button>(R.id.two)
        var btn3 =findViewById<Button>(R.id.three)
        var btn4 =findViewById<Button>(R.id.four)
        var btn5 =findViewById<Button>(R.id.five)
        var btn6 =findViewById<Button>(R.id.six)
        var btn7 =findViewById<Button>(R.id.seven)
        var btn8 =findViewById<Button>(R.id.eight)
        var btn9 =findViewById<Button>(R.id.nine)
        var btn10 =findViewById<Button>(R.id.zero)
        var btnplus =findViewById<Button>(R.id.plus)
        var btnminus =findViewById<Button>(R.id.minus)
        var btndivide =findViewById<Button>(R.id.divide)
        var btnmultiply =findViewById<Button>(R.id.multiply)
        var clear = findViewById<Button>(R.id.allclear)
        var equal = findViewById<Button>(R.id.equal)
        var Mod = findViewById<Button>(R.id.mod)
        var textV = findViewById<TextView>(R.id.textView8)
        textV.text = ""
        var textAppend = ""
        var result = ""
        btn1.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"1"
        })
        btn2.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"2"
        })
        btn3.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"3"
        })
        btn4.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"4"
        })
        btn5.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"5"
        })
        btn6.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"6"
        })
        btn7.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"7"
        })
        btn8.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"8"
        })
        btn9.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"9"
        })
        btn10.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"0"
        })
        btnplus.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"+"
        })
        btnminus.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"-"
        })
        btndivide.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"/"
        })
        btnmultiply.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"*"
        })
        equal.setOnClickListener(View.OnClickListener {
            result = textV.text.toString()
            
        })
        clear.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=""
        })
        Mod.setOnClickListener(View.OnClickListener {
            textAppend = textV.text.toString()
            textV.text=textAppend+"%"
        })
    }




}