package com.example.lab7_3

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {
    lateinit var tv :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)



    }
    fun generate()
    {
        val channelID : String = "Text"
        val channelName : String = "Android"
        val manager : NotificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

        val intent2 = Intent(this,MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(this,0,intent2,0)
        val builder = NotificationCompat.Builder(this,channelID)
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentTitle("Music Player")
            .setContentText(tv.text.toString())
            .addAction(0,"Previous",null)
            .addAction(0,"Play",null)
            .addAction(0,"Next",null)


        val notification : Notification = builder.build()

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val notificationChannel: NotificationChannel = NotificationChannel(channelID,channelName,NotificationManager.IMPORTANCE_DEFAULT)
            manager.createNotificationChannel(notificationChannel)
            manager.notify(1234,notification)

        }
    }
    fun prev(view: View)
    {
        var mediaPlayer = MediaPlayer.create(this,R.raw.c)
        tv.text = "Song C"
        mediaPlayer.start()
        generate()
    }
    fun next(view: View)
    {
        var mediaPlayer = MediaPlayer.create(this,R.raw.b)
        tv.text = "Song B"
        mediaPlayer.start()
        generate()
    }
    fun play(view: View)
    {
        var mediaPlayer = MediaPlayer.create(this,R.raw.a)
        tv.text = "Song A"
        mediaPlayer.start()
        generate()
    }
}