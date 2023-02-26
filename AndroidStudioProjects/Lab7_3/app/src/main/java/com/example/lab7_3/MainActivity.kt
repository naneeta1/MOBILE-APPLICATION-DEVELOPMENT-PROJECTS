package com.example.lab7_3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnStartService: Button = findViewById(R.id.btnPlay);
        var btnStopService: Button = findViewById(R.id.btnPause);
        btnStartService.setOnClickListener(View.OnClickListener() {
                startService()
        })
        btnStopService.setOnClickListener(View.OnClickListener() {

                stopService()

        })
    }
    fun startService() {
        val serviceIntent = Intent(this, Foreground::class.java)
        serviceIntent.putExtra("inputExtra", "Foreground Service Example in Android")
        ContextCompat.startForegroundService(this, serviceIntent)
    }
    fun stopService() {
        val serviceIntent = Intent(this, Foreground::class.java)
        stopService(serviceIntent)
    }
}