package com.example.lab9_2

import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.Telephony
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.READ_SMS)== PackageManager.PERMISSION_GRANTED){

            var textv = findViewById<TextView>(R.id.tv)
            val cursor = contentResolver.query(
                Telephony.Sms.CONTENT_URI,
                null,
                null,
                null,
                null
            )
            if (cursor!!.moveToFirst()) { // must check the result to prevent exception
                    var msgData = cursor!!.getString(12)

                    Toast.makeText(this,msgData,Toast.LENGTH_LONG).show();
                textv.text = msgData;
            }
        }
        else{
            requestPermissions(arrayOf(android.Manifest.permission.READ_SMS),25)
        }

    }
}