package com.example.lab_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import kotlin.properties.Delegates

class MainActivity2 : AppCompatActivity() {
    var value1 by Delegates.notNull<Int>()
    lateinit var textf: TextView
    lateinit var plusBtn: Button
    lateinit var minusBtn: Button
    lateinit var sumry: TextView
    var choc by Delegates.notNull<Boolean>()
    var creamm by Delegates.notNull<Boolean>()
    lateinit var chocolate: CheckBox
    lateinit var cream: CheckBox
    var total by Delegates.notNull<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        plusBtn = findViewById(R.id.button3)
        minusBtn = findViewById(R.id.button2)
        textf = findViewById(R.id.textView3)
        sumry = findViewById(R.id.textView6)

        chocolate = findViewById(R.id.choc)
        cream = findViewById(R.id.cream)
        choc =  false
        creamm = false

        value1 = Integer.parseInt(textf.text.toString())

    }

    fun addquantity(view: View)
    {
        value1 =value1!!+1
        textf.text = " " + value1
    }
    fun minusquantity(view: View)
    {
        value1 = value1!!-1
        textf.text = " " + value1
    }
    fun order(view:View){
        total = 200
            if(cream.isChecked){
                creamm = true
                total+=50
            }
            if(chocolate.isChecked){
                choc = true
                total+=100
            }
        total *=value1
            sumry.text ="Add whipped cream? $creamm \n Add Chocolate? $choc \n Quantity? $value1 \n\n Price: $total  \n Thank You!"
    }
}