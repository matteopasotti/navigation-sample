package com.example.navigationsample

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigationsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var drawerLayout : DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        drawerLayout = binding.drawerLayout


        // Link the NavController to our ActionBar.
        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController , drawerLayout)
        // Set up the navigation to know about the NavigationView
        NavigationUI.setupWithNavController(binding.navView , navController)
    }

    // here we specify what happens when we press the up button (arrow on top left)
    // we need to have the Activity handle the navigateUp action from our Activity.
    // To do this we override onSupportNavigateUp, find the nav controller, and then we call navigateUp().
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp( navController , drawerLayout)
    }


}