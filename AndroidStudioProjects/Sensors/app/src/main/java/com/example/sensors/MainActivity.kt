package com.example.sensors

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(), SensorEventListener {

    lateinit var sensorManager:SensorManager
    lateinit var sensor: Sensor
    lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.tview)

        //1- initialize sensor manager
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager

        //2- initialize the sensor
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)

        //3- register Listener on sensor by using sensor manager
        //listener is an interface
        sensorManager.registerListener(this, sensor,100)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        val x = event!!.values[0]
        val y = event!!.values[1]
        val z = event!!.values[2]

        textView.text = "X"+x+"Y"+y+"Z"+z ;
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
        //TODO("Not yet implemented")
    }
}