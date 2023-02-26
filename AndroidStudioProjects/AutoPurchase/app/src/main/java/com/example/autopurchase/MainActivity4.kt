package com.example.autopurchase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var menuInf : MenuInflater = getMenuInflater()
        menuInf.inflate(R.menu.main_menu,menu)
        return true
    }
}