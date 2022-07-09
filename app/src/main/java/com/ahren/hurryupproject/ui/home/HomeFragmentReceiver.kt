package com.ahren.hurryupproject.ui.home

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.location.Location
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.view.marginTop
import androidx.fragment.app.FragmentActivity
import com.ahren.hurryupproject.MainActivity
import com.ahren.hurryupproject.R
import com.ahren.hurryupproject.databinding.FragmentHomeBinding
import com.ahren.hurryupproject.service.LocationReminderService
import kotlinx.coroutines.withContext

class HomeFragmentReceiver(private var homeViewBinding: FragmentHomeBinding, private var homeViewModel: HomeViewModel, private var activity: FragmentActivity, private val resources: Resources): BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        var Longitude: Double = intent?.getDoubleExtra("locationLongitude", 0.00)!!
        var Latitude: Double = intent.getDoubleExtra("locationLatitude", 0.00)!!
        homeViewBinding.latitudeId.setText(Longitude.toString())
        homeViewBinding.longitudeId.setText(Latitude.toString())

        val pendingIntent: PendingIntent = Intent(context, MainActivity::class.java).let { notificationIntent ->
            PendingIntent.getActivity(context, 0, notificationIntent, PendingIntent.FLAG_IMMUTABLE)
        }


        val stationKeepAliveNotification: Notification = NotificationCompat.Builder(context!!, "station_keep_alive_notification")
            .setContentTitle("Location")
            .setContentText("Longitude: " + Longitude + "\n" + "Latitude:" + Latitude)
            .setSmallIcon(R.drawable.ic_lock_black_24dp)
            .setContentIntent(pendingIntent)
            .setTicker("App was Running")
            .build()

//        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE)

        with(NotificationManagerCompat.from(context)) {
            notify(9, stationKeepAliveNotification)
        }


        val availableStationNumber = homeViewModel.getAvailableStationNumber()
        val stateButtonPosition = homeViewModel.getStateButtonPosition()
        if ( availableStationNumber <= stateButtonPosition ) {
            closeLocationService(context)
            ButtonEnablement.setButtonEnablementOnScreen(false, activity!!, homeViewBinding, resources)
            homeViewBinding.startapp.isChecked = false
        } else {
            val stationList = homeViewModel.getStationList().value
            if ( calculateDistance(
                    stationList!![stateButtonPosition]._stationLongitude.get()!!,
                    stationList[stateButtonPosition]._stationLatitude.get()!!,
                    Longitude,
                    Latitude) < 1 ) {

                // Reached Notification
                val stationReachedNotification: Notification = NotificationCompat.Builder(context, "station_reached_notification")
                    .setContentTitle("Station Reached")
                    .setContentText("Next station: " + stationList[stateButtonPosition]._stationName.get())
                    .setSmallIcon(R.drawable.ic_lock_black_24dp)
                    .setContentIntent(pendingIntent)
                    .setTicker("Station Reached")
                    .setCategory(NotificationCompat.CATEGORY_REMINDER)
                    .setAutoCancel(true)
                    .setTimeoutAfter(5000)
                    .build()

                with(NotificationManagerCompat.from(context)) {
                    notify(10, stationReachedNotification)

                        // Move Position State Down
                val StateMovingValue by lazy { homeViewBinding.StationNum2.height + homeViewBinding.StationNum2.marginTop }
                // direction 1 down, 2 up, 0 refresh button
                val marginTopChangedVale by lazy {
                    homeViewModel.moveStatePosition(1, StateMovingValue)
                }
                val constraintSet = ConstraintSet()
                constraintSet.clone(homeViewBinding.homeconstraintlayout)
                constraintSet.connect(
                    homeViewBinding.youarehere.id,
                    ConstraintSet.TOP,
                    homeViewBinding.horizontalguideline1.id,
                    ConstraintSet.TOP,
                    marginTopChangedVale
                )
                constraintSet.applyTo(homeViewBinding.homeconstraintlayout)

                if ( availableStationNumber <= stateButtonPosition + 1 ) {
                    closeLocationService(context)
                    ButtonEnablement.setButtonEnablementOnScreen(false, activity!!, homeViewBinding, resources)
                    homeViewBinding.startapp.isChecked = false
                }
                }


            }
        }




    }

    fun closeLocationService(context: Context) {
        activity.applicationContext.stopService(Intent(context, LocationReminderService::class.java))
    }

    fun calculateDistance(x1: Double, y1: Double, x2: Double, y2: Double) :  Double {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)
    }
}