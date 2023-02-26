package com.example.contentprovider

import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.READ_CONTACTS)==PackageManager.PERMISSION_GRANTED){

            val textV = findViewById<TextView>(R.id.tview)
            val cursor = contentResolver.query(
                ContactsContract.Contacts.CONTENT_URI,
                arrayOf(ContactsContract.Contacts.DISPLAY_NAME),
                null,
                null,
                "ASC"
            )

            cursor!!.moveToFirst()
            var data = cursor.getString(0);
            cursor.moveToNext();
            data += "\n"+cursor.getString(0);
            cursor.moveToNext();
            data += "\n"+cursor.getString(0);
            cursor.moveToNext();
            data += "\n"+cursor.getString(0);
            textV.text = data
        }
        else{
            requestPermissions((arrayOf(android.Manifest.permission.READ_CONTACTS,android.Manifest.permission.WRITE_CONTACTS)),22)
        }


    }

}