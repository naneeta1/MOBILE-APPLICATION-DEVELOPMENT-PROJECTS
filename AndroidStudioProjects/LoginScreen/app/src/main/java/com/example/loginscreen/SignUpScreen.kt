package com.example.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)
    }

    fun ClickOnTextView(view: View)
    {
        var intent: Intent = Intent(this, MainActivity::class.java )
        startActivity(intent)
    }

    fun Register(view:View)
    {
        var name = findViewById<EditText>(R.id.ed3)
        var email = findViewById<EditText>(R.id.ed4)
        var pass = findViewById<EditText>(R.id.ed5)
        var login = findViewById<Button>(R.id.button2)
        var msg = findViewById<TextView>(R.id.textView2)


    }
}