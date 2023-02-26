package com.example.lab_practice

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun callMyFun(view: View){

            showNotification()
            sleep(1000)

    }
    fun showNotification(){
        index++
        val channel_id : String = "Test"
        val Channel_Name : String = "Android"

        //step 1 - initialize object of notification manager
        val manager: NotificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        val intent : Intent = Intent(this,MainActivity::class.java)
        val pIntent : PendingIntent = PendingIntent.getActivity(this, 0 , intent,PendingIntent.FLAG_IMMUTABLE)

        //step 2 -Create notification to show
        // Icon is required parameter in notification
        //Builder helps in creating notific easily
        var builder  = NotificationCompat.Builder(this,channel_id)
            .setSmallIcon(R.drawable.ic_baseline_notifications_active_24)
            .setContentTitle("Test$index")
            .setContentText("This is a test message$index")
            .setContentIntent(pIntent)

        var notification : Notification = builder.build()

        //Step3 -creating notification Channel
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel : NotificationChannel = NotificationChannel(
                channel_id,Channel_Name,
                NotificationManager.IMPORTANCE_DEFAULT
            )
            manager.createNotificationChannel(channel)
            //channel.vibrationPattern= longArrayOf(100,200,300,400,500)
            //manager.createNotificationChannel(channel)
            channel.enableVibration(true)
        }

        //step 4 -Show the notifications
        manager.notify(12+index,notification)
    }

}