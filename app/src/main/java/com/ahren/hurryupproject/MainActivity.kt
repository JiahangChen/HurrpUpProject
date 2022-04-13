package com.ahren.hurryupproject

import android.annotation.SuppressLint
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.ahren.hurryupproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var MainViewBinding: ActivityMainBinding

    @SuppressLint("UseCompatLoadingForDrawables")
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
                R.id.navigation_home, R.id.navigation_collection, R.id.navigation_setting
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

//        val actionBarMenu = findViewById<BottomNavigationView>(R.id.nav_view)?.menu
//        actionBarMenu?.findItem(R.id.navigation_collection)?.isEnabled = false
//        actionBarMenu?.findItem(R.id.navigation_setting)?.isEnabled = false
//        actionBarMenu?.findItem(R.id.navigation_home)?.isEnabled = false
//        actionBarMenu?.findItem(R.id.navigation_collection)?.icon =
//                ResourcesCompat.getDrawable(
//                    resources,
//                    R.drawable.ic_lock_black_24dp,
//                    null
//                )
//        actionBarMenu?.findItem(R.id.navigation_setting)?.icon =
//            ResourcesCompat.getDrawable(
//                resources,
//                R.drawable.ic_lock_black_24dp,
//                null
//            )
//        actionBarMenu?.findItem(R.id.navigation_home)?.icon =
//            ResourcesCompat.getDrawable(
//                resources,
//                R.drawable.ic_lock_black_24dp,
//                null
//            )


    }
}