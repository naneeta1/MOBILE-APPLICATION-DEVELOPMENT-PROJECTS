package com.example.backgroundservice_example

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(intent.getIntExtra("AlarmId",-1)==5){
            Toast.makeText(this,"ShowAlarm",Toast.LENGTH_SHORT).show()
        }

    }
    fun restartApp(view: View){
        val alarmManager:AlarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        var intent  = Intent(this, MainActivity::class.java)
        intent.putExtra("Alarm",5)
        val pIntent =PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_CANCEL_CURRENT)
        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+5000,pIntent)
    }
}