package com.example.volleynetwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.RequestFuture
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    lateinit var txt :TextView
    val stringUrl = "https://www.w3schools.com/Jquery/demo_test.asp";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt=findViewById(R.id.textView)
    }
    fun getVolleyData(view: View){
        val queue = Volley.newRequestQueue(this)

        val stringRequest =StringRequest(Request.Method.GET,stringUrl,Response.Listener<String>{
            txt.text= it

        },
        Response.ErrorListener {
            txt.text = "There was an error"
        })
        queue.add(stringRequest)
    }
}