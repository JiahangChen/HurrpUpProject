package com.ahren.hurryupproject.service

import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.IBinder
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.content.ContentProviderCompat.requireContext
import com.ahren.hurryupproject.MainActivity
import com.ahren.hurryupproject.R

class LocationReminderService: Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val pendingIntent: PendingIntent = Intent(this, MainActivity::class.java).let { notificationIntent ->
                PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_IMMUTABLE)
            }

            val channelId = createNotificationChannel("my_service", "MyBackground Service")


            val notification: Notification = Notification.Builder(this, channelId)
                .setContentTitle("test")
                .setContentText("testText")
                .setSmallIcon(R.drawable.ic_lock_black_24dp)
                .setContentIntent(pendingIntent)
                .setTicker("testTicker")
                .build()
            startForeground(9, notification)
            Toast.makeText(
                applicationContext,
                "Successfully create service",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel(channelId: String, channelName: String): String{
        val chan = NotificationChannel(channelId,
            channelName, NotificationManager.IMPORTANCE_NONE)
        chan.lightColor = Color.BLUE
        chan.lockscreenVisibility = Notification.VISIBILITY_PRIVATE
        val service = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        service.createNotificationChannel(chan)
        return channelId
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        Toast.makeText(
            applicationContext,
            "Successfully destroy service",
            Toast.LENGTH_SHORT
        ).show()
        super.onDestroy()
    }
}