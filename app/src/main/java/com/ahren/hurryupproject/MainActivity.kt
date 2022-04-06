package com.ahren.hurryupproject

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.ahren.hurryupproject.databinding.ActivityMainBinding
import com.ahren.hurryupproject.ui.addstation.AddStationActivity

class MainActivity : AppCompatActivity() {

    private lateinit var MainViewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(MyLifecycleObserver())

        MainViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(MainViewBinding.root)

        val navView: BottomNavigationView = MainViewBinding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        MainViewBinding.floatingCreateStationButton.setOnClickListener {

            val intent = Intent(this, AddStationActivity::class.java)
            startActivity(intent)
        }
    }
}