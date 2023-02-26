package com.example.lab7_2

import android.R.attr.button
import android.content.ContentValues.TAG
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import kotlin.concurrent.thread
import kotlin.properties.Delegates


class MainActivity: AppCompatActivity() {
    lateinit var image: ImageView
    lateinit var btnToggle: Button
    var rotating by Delegates.notNull<Boolean>()
    var wasRotating by Delegates.notNull<Boolean>()
    var animFadein: Animation? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        image = findViewById(R.id.imgvw)
        btnToggle = findViewById(R.id.btnRClk)
        rotating = false;
        wasRotating = false;

        runTimer()
        btnToggle.setOnClickListener(View.OnClickListener {
            rotating = !rotating
        })

        if (savedInstanceState != null) {
            rotating = savedInstanceState
                .getBoolean("rotating")
            wasRotating = savedInstanceState
                .getBoolean("wasRotating")
        }
    }
    override fun onPause() {
        super.onPause()
        wasRotating = rotating
        rotating = false
    }
    override fun onResume() {
        super.onResume()
        if (wasRotating) {
            rotating = true
        }
    }
    private fun runTimer() {

        val handler = Handler()

        handler.post(object : Runnable {
            override fun run() {
                if(rotating) {
                    val animation = AnimationUtils.loadAnimation(
                        applicationContext,
                        R.anim.rotate_clockwise
                    )
                    image.startAnimation(animation);
                }
                handler.postDelayed(this, 1000)
            }
        })
    }
    override fun onSaveInstanceState(
        savedInstanceState: Bundle
    ) {
        super.onSaveInstanceState(savedInstanceState)

        savedInstanceState
            .putBoolean("rotating", rotating)
        savedInstanceState
            .putBoolean("wasRotating", wasRotating)
    }

}
