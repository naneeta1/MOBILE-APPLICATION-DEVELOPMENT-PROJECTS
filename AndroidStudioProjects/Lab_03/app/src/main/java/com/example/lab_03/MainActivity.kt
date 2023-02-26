package com.example.lab_03

import android.opengl.Visibility
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
    fun msgClick(view: View){
        var fullname: EditText = findViewById(R.id.fullname)
        var login: Button = findViewById(R.id.btnLogin)
        var msg: TextView = findViewById(R.id.tvMsg)
        if(login.text.equals("LOGIN")){
            fullname.visibility = View.VISIBLE
            msg.text = "Already Registered! Log me in."
            login.text = "Register"
        } else{
            fullname.visibility = View.INVISIBLE
            msg.text = "Not a member? Sign up now."
            login.text = "LOGIN"
        }
    }

}