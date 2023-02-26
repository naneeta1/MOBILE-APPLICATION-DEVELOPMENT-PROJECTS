package com.example.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SignUp(view: View)
    {
        var intent: Intent = Intent(this, SignUpScreen::class.java )
        startActivity(intent)
    }

    fun Login(view:View)
    {
        var email = findViewById<EditText>(R.id.ed1)
        var pass = findViewById<EditText>(R.id.ed2)
        var login = findViewById<Button>(R.id.button)
        var msg = findViewById<TextView>(R.id.textView)



    }
}