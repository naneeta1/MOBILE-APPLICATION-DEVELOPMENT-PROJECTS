package com.example.lab9_1

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btnShow)
        btn.setOnClickListener(View.OnClickListener {
            addNotification()
        })
    }
    private fun addNotification() {
        var bitmap = BitmapFactory.decodeResource(resources, R.drawable.download)
        val snoozeIntent = Intent()
        val snoozePendingIntent: PendingIntent =
            PendingIntent.getBroadcast(this, 0, snoozeIntent, 0)
        val builder: NotificationCompat.Builder = NotificationCompat.Builder(this)
            .setSmallIcon(R.drawable.pic)
            .setContentTitle("Friend Request")
            .setContentText("1 out of 3 catagories from this app")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setLargeIcon(bitmap)
            .addAction(R.drawable.pic, getString(R.string.all),
                snoozePendingIntent)
            .addAction(R.drawable.pic, getString(R.string.done),
                snoozePendingIntent)

        val notificationIntent = Intent(this, MainActivity::class.java)
        val contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
            PendingIntent.FLAG_UPDATE_CURRENT)
        builder.setContentIntent(contentIntent)

        val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(22, builder.build())
    }
}