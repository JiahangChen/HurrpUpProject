package com.ahren.hurryupproject.service

import android.annotation.SuppressLint
import android.app.*
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.ahren.hurryupproject.MainActivity
import com.ahren.hurryupproject.R


class LocationReminderService: Service() {

//    private lateinit var fusedLocationClient: FusedLocationProviderClient
//    private lateinit var locationCallback: LocationCallback
    private lateinit var locationManager: LocationManager
    private lateinit var provider: String
    private val locationListener = object: LocationListener {
        override fun onStatusChanged(provider: String, status: Int, extras: Bundle) {}
        override fun onProviderEnabled(provider: String) {}
        override fun onProviderDisabled(provider: String) {}
        override fun onLocationChanged(p0: Location) {

            val locationIntent = Intent()
            locationIntent.putExtra("locationLongitude", p0.longitude.toDouble() )
            locationIntent.putExtra("locationLatitude", p0.latitude.toDouble() )
            locationIntent.setAction("change_location")
            sendBroadcast(locationIntent)

        }
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    @SuppressLint("MissingPermission")
    override fun onCreate() {
        super.onCreate()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val pendingIntent: PendingIntent = Intent(this, MainActivity::class.java).let { notificationIntent ->
                PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_IMMUTABLE)
            }

            val stationKeepAliveChannel = createNotificationChannel(
                "station_keep_alive_notification",
                "Station Keep Alive Notification",
                NotificationManager.IMPORTANCE_LOW,
                "Station Keep Alive Channel" )


            val stationKeepAliveNotification: Notification = NotificationCompat.Builder(this, stationKeepAliveChannel)
                .setContentTitle("App was Running")
                .setContentText("Next station:")
                .setSmallIcon(R.drawable.ic_lock_black_24dp)
                .setContentIntent(pendingIntent)
                .setTicker("App was Running")
                .build()

            startForeground(9, stationKeepAliveNotification)

            Toast.makeText(
                applicationContext,
                "Successfully create service",
                Toast.LENGTH_SHORT
            ).show()

            locationManager = getSystemService(LOCATION_SERVICE) as LocationManager

            val providerList = locationManager.getProviders(true)
            if (providerList.contains(LocationManager.NETWORK_PROVIDER)) {
                provider = LocationManager.NETWORK_PROVIDER
            } else if (providerList.contains(LocationManager.GPS_PROVIDER)) {
                provider = LocationManager.GPS_PROVIDER
            } else {
                Toast.makeText(this, "No location provider to use", Toast.LENGTH_SHORT).show();
            }

            locationManager.requestLocationUpdates(
                provider,
                3000,
                10F,
                locationListener)

            val stationReachedChannel = createNotificationChannel(
                "station_reached_notification",
                "Station Reached Notification",
                NotificationManager.IMPORTANCE_HIGH,
                "Station Reached Channel" )

        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel(channelId: String, channelName: String, importance: Int, description: String): String{
        val mChannel = NotificationChannel(channelId, channelName, importance)
        mChannel.lightColor = Color.BLUE
        mChannel.description = description
        mChannel.lockscreenVisibility = Notification.VISIBILITY_PUBLIC
        val service = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        service.createNotificationChannel(mChannel)
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
        locationManager.removeUpdates(locationListener)
        super.onDestroy()
    }
}