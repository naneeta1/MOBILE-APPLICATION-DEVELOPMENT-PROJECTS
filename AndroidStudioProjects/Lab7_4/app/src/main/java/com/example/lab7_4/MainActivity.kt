package com.example.lab7_4

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat.getSystemService

class MainActivity : AppCompatActivity() {
    lateinit var almanager: AlarmManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        almanager = getSystemService(ALARM_SERVICE) as AlarmManager
        var intent =Intent(this,AlarmReceiver::class.java)
        var pIntent = PendingIntent.getBroadcast(this,12,intent,PendingIntent.FLAG_UPDATE_CURRENT)
        almanager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() *1000 * 60 * 1,pIntent)
    }
}
class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(p0: Context?, p1: Intent?) {
        p1?.let {
            handleAlaramData(p0, it)
        }
    }

    private fun handleAlaramData(context: Context?, intent: Intent) {
        context?.let {

            val title = intent.getStringExtra("title")
            val description = intent.getStringExtra("desp")

            createNotificationChannel(context = it)

            if (description != null) {
                if (title != null) {
                    createNotification(
                        context = it,
                        title = title,
                        description = description,
                        id = 211,
                        subscriptionId = 565
                    )
                }
            }

        }
    }

    private fun createNotification(
        context: Context,
        title: String,
        description: String,
        id: Int,
        subscriptionId: Long
    ) {
        // Create an explicit intent for an Activity in your app
        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent: PendingIntent =
            PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_IMMUTABLE)

        val builder = NotificationCompat.Builder(context, "CHANNEL_ID")
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(title)
            .setContentText(description)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            // Set the intent that will fire when the user taps the notification
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)

        with(NotificationManagerCompat.from(context)) {
            // notificationId is a unique int for each notification that you must define
            notify(System.currentTimeMillis().toInt()+5000, builder.build())
        }
    }


    private fun createNotificationChannel(context: Context) {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("CHANNEL_ID", "CHANNEL_NAME", importance).apply {
                description = "CHANNEL_DESP"
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)

        }

    }
}