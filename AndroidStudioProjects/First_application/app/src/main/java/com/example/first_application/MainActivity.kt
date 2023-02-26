package com.example.first_application

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var random = Random()
        var num = random.nextInt(99)
        var userInput = findViewById<android.widget.EditText>(R.id.editTextNum)
        var btn1 = findViewById<Button>(R.id.button)
        var txt = findViewById<TextView>(R.id.textView)
        btn1.setOnClickListener(View.OnClickListener{
            var userNumber: Int = Integer.parseInt(userInput.text.toString())
            if(userNumber>num)
            {
                txt.text = "Too High"
            }
            else if(userNumber<num){
                txt.text="Too Low"
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
            else{
                txt.text = "Hurraay!! You Won"

            }
        })
    }
}