package com.example.lab_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var data2 = intent.extras
        var story1 = data2?.getString("story")
        var plcholdr = data2?.getStringArray("placeholder")
        var indd = data2?.getInt("ind")

        var total = Integer.parseInt(plcholdr?.size.toString())
        var arrayWord = Array(total){""}
        var okBtn = findViewById<Button>(R.id.button2)
        var textV = findViewById<EditText>(R.id.editTextTextPersonName)
        var label = findViewById<TextView>(R.id.textView3)
        label.text = "" + (total) + "word(s) left"
        var index = 0
        var textPlace = findViewById<TextView>(R.id.textView4)
        textPlace.text = plcholdr?.get(0)

        okBtn.setOnClickListener(View.OnClickListener {
            if(textV.text.toString() != "") {
                arrayWord[index] = textV.text.toString()
                story1 = story1?.replace(plcholdr?.get(index).toString(),arrayWord[index])

                textV.text.clear()
                textPlace.text = plcholdr?.get(index)

                label.text = "" + (total - index-1) + "word(s) left"

                if(index == total-1) {

                    var intent2 = Intent(this, MainActivity3::class.java)
                    intent2.putExtra("words",story1)
                    startActivity(intent2)
                }
                index++
            }
        })
    }
}