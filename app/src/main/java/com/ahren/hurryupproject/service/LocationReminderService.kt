package com.ahren.hurryupproject.service

import android.annotation.SuppressLint
import android.app.*
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.location.Location
import android.location.LocationRequest
import android.os.Build
import android.os.IBinder
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.location.LocationRequestCompat
import androidx.fragment.app.activityViewModels
import com.ahren.hurryupproject.MainActivity
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.ui.home.HomeViewModel
import com.google.android.gms.location.*
import com.google.android.gms.tasks.Task
import com.google.gson.internal.UnsafeAllocator.create

class LocationReminderService: Service() {

    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var locationCallback: LocationCallback


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

            fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

            fusedLocationClient.lastLocation.addOnSuccessListener { location: Location ->
                var aaa = "aaa"
            }

            val locationRequest = com.google.android.gms.location.LocationRequest.create()?.apply {
                interval = 10000
                fastestInterval = 5000
                priority = com.google.android.gms.location.LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
            }

            val builder = LocationSettingsRequest.Builder()
                .addLocationRequest(locationRequest)
            val client: SettingsClient = LocationServices.getSettingsClient(this)
            val task: Task<LocationSettingsResponse> = client.checkLocationSettings(builder.build())
            task.addOnSuccessListener { locationSettingsReponse ->
                var a = locationSettingsReponse.locationSettingsStates

            }


//            locationCallback = object : LocationCallback() {
//                override fun onLocationResult(locationResult: LocationResult?) {
//
//                    var aaa = "aaa"
//                    locationResult ?: return
//                    for (location in locationResult.locations){
//                        var aaa = "aaa"
////                        Log.d(TAG, "result is: ${location.altitude}")
//                        // Update UI with location data
//                        // ...
//                    }
//                }
//            }
//
////            startLocationUpdates(locationRequest!!, locationCallback)
//
//            fusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper())

            val stationReachedChannel = createNotificationChannel(
                "station_reached_notification",
                "Station Reached Notification",
                NotificationManager.IMPORTANCE_HIGH,
                "Station Reached Channel" )

            val stationReachedNotification: Notification = NotificationCompat.Builder(this, stationReachedChannel)
                .setContentTitle("Station Reached")
                .setContentText("Next station:")
                .setSmallIcon(R.drawable.ic_lock_black_24dp)
                .setContentIntent(pendingIntent)
                .setTicker("Station Reached")
                .setCategory(NotificationCompat.CATEGORY_REMINDER)
                .setAutoCancel(true)
                .setTimeoutAfter(5000)
                .build()

            with(NotificationManagerCompat.from(this)) {
                notify(10, stationReachedNotification)
            }
        }




    }

    @SuppressLint("MissingPermission")
    private fun startLocationUpdates(locationRequest: com.google.android.gms.location.LocationRequest, locationCallback: LocationCallback) {
        fusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper())
    }

    private fun stopLocationUpdates() {
        fusedLocationClient.removeLocationUpdates(locationCallback)
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
//        stopLocationUpdates()
        super.onDestroy()
    }

}