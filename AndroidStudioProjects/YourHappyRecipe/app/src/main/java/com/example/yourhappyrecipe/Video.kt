package com.example.yourhappyrecipe
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast


class Video : AppCompatActivity() {
    lateinit var web :WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        web = findViewById(R.id.webViewId)

        //Get extras
        val extras = intent.extras

        if (extras != null) {
            val link = extras.get("link")
            //Invoking WebView
            web.loadUrl(link.toString())
            finish()
        } else {
            Toast.makeText(this, "Invalid Link", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}