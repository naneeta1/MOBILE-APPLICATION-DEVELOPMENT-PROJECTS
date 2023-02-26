package com.example.httpurlconnection

import android.graphics.Bitmap
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.ImageRequest
import com.android.volley.toolbox.Volley
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

class MainActivity : AppCompatActivity() {
    lateinit var data:String
    lateinit var img : ImageView
    val stringUrl = "https://www.w3schools.com/Jquery/demo_test.asp";
    lateinit var txt :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.button)
        txt =findViewById<TextView>(R.id.textView)
        img = findViewById(R.id.imageView)
        data = ""
        //create a variable
    }

    fun getHttpUrlData(view: View){
        //1-url creation
        var url : URL = URL(stringUrl)

        var th = Thread(Runnable(){
            //2
            val connection = url.openConnection()

            //3
            val inputStream = BufferedReader(InputStreamReader(connection.getInputStream()))

            var line = inputStream.readLine()
            while(line!=null){
                data += line
                line = inputStream.readLine()
            }

            runOnUiThread(Runnable {
                txt.text= data;
            })
            inputStream.close()

        }).start()


    }

    fun fetchImage(view: View){
        var url:String = "https://images.pexels.com/photos/302743/pexels-photo-302743.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
        val queue = Volley.newRequestQueue(this)
        val imageRqst = ImageRequest(url,Response.Listener<Bitmap>{
            img.setImageBitmap(it);
            Toast.makeText(this,"Done",Toast.LENGTH_SHORT)
        }, 600, 600, null, null,
            Response.ErrorListener {
                txt.text = "There was an error"
        })
        queue.add(imageRqst)
    }
}