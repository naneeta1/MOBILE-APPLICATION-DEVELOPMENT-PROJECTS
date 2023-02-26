package com.example.lab7_1


import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {
    lateinit var btnStart: Button
    lateinit var btnStop: Button
    lateinit var btnReset: Button
    lateinit var textF: TextView
    var seconds by Delegates.notNull<Int>();
    // Is the stopwatch running?
    var running by Delegates.notNull<Boolean>();
    var wasRunning by Delegates.notNull<Boolean>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wasRunning = false
        running = false
        seconds = 0

        if (savedInstanceState != null) {
            // Get the previous state of the stopwatch
            // if the activity has been
            // destroyed and recreated.
            seconds = savedInstanceState
                .getInt("seconds")
            running = savedInstanceState
                .getBoolean("running")
            wasRunning = savedInstanceState
                .getBoolean("wasRunning")
        }
        runTimer()

        btnStart = findViewById(R.id.btnStart)
        btnStop = findViewById(R.id.btnStop)
        btnReset = findViewById(R.id.btnReset)
        textF = findViewById(R.id.textView)


        btnStart.setOnClickListener(View.OnClickListener {
            running = true;
        })

        btnStop.setOnClickListener(View.OnClickListener {
            running = false;
        })

        btnReset.setOnClickListener(View.OnClickListener {
            running = false;
            seconds = 0;
        })
    }
    override fun onPause() {
        super.onPause()
        wasRunning = running
        running = false
    }
    override fun onResume() {
        super.onResume()
        if (wasRunning) {
            running = true
        }
    }
    private fun runTimer() {

        // Get the text view.

        // Creates a new Handler
        val handler = Handler()

        // Call the post() method,
        // passing in a new Runnable.
        // The post() method processes
        // code without a delay,
        // so the code in the Runnable
        // will run almost immediately.
        handler.post(object : Runnable {
            override fun run() {
                val hours = seconds / 3600
                val minutes = seconds % 3600 / 60
                val secs = seconds % 60

                // Format the seconds into hours, minutes,
                // and seconds.
                val time: String = java.lang.String
                    .format(
                        Locale.getDefault(),
                        "%d:%02d:%02d", hours,
                        minutes, secs
                    )

                // Set the text view text.
                textF.text = time

                // If running is true, increment the
                // seconds variable.
                if (running) {
                    seconds++
                }

                // Post the code again
                // with a delay of 1 second.
                handler.postDelayed(this, 1000)
            }
        })
    }

    override fun onSaveInstanceState(
        savedInstanceState: Bundle
    ) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState
            .putInt("seconds", seconds)
        savedInstanceState
            .putBoolean("running", running)
        savedInstanceState
            .putBoolean("wasRunning", wasRunning)
    }
}