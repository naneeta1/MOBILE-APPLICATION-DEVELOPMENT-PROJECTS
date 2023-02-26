package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceControl
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    lateinit var manager: FragmentManager
    lateinit var transaction : FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        manager = supportFragmentManager
    }

    fun changeFragment(view: View)
    {
        transaction = manager.beginTransaction()
        if(view.id == R.id.frag1)
        {
            val frag : Fragment1 = Fragment1()
            transaction.replace(R.id.placeholder , frag)
        }
        else if(view.id == R.id.frag2) {
            val frag : Fragment2 = Fragment2()
            transaction.replace(R.id.placeholder , frag)
        }
        transaction.commit()
    }
}