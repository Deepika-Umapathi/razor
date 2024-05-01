package com.example.razorpaypayment

import android.content.Intent
import android.database.DatabaseUtils
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.razorpaypayment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding
     var selectedTab = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this ,R.layout.activity_main)

        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.getInsetsController(window, window.decorView).apply {
            isAppearanceLightStatusBars = true
        }

        binding.frameItem.setOnClickListener {
            val intent = Intent(this, ProductDetailsActivity::class.java)
            startActivity(intent)
        }


        binding.homeLayout.setOnClickListener{

            if (selectedTab!=1){
                binding.cartText.visibility= View.GONE
                binding.notificationText.visibility= View.GONE
                binding.accountText.visibility= View.GONE

                binding.cartLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                binding.notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                binding.accountLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                binding.homeText.visibility= View.VISIBLE

                val scale = ScaleAnimation(0.8f,1.0f,1f,    1f,Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f)
                scale.duration=200
                scale.fillAfter=true
                binding.homeLayout.startAnimation(scale)
                selectedTab = 1


            }

        }
        binding.cartLayout.setOnClickListener{
            if (selectedTab!=2) {
                binding.homeText.visibility = View.GONE
                binding.notificationText.visibility = View.GONE
                binding.accountText.visibility = View.GONE

                binding.homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                binding.notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                binding.accountLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                binding.cartText.visibility = View.VISIBLE

                val scale = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    1.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                )
                scale.duration = 200
                scale.fillAfter = true
                binding.cartLayout.startAnimation(scale)
                selectedTab = 2
            }
        }
        binding.notificationLayout.setOnClickListener{
            if (selectedTab!=3) {
                binding.homeText.visibility = View.GONE
                binding.cartText.visibility = View.GONE
                binding.accountText.visibility = View.GONE

                binding.homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                binding.cartLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                binding.accountLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                binding.notificationText.visibility = View.VISIBLE

                val scale = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    1.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                )
                scale.duration = 200
                scale.fillAfter = true
                binding.notificationLayout.startAnimation(scale)
                selectedTab = 3
            }
        }
        binding.accountLayout.setOnClickListener{
            if (selectedTab!=4) {
                binding.homeText.visibility = View.GONE
                binding.notificationText.visibility = View.GONE
                binding.cartText.visibility = View.GONE

                binding.homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                binding.notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                binding.cartLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))

                binding.accountText.visibility = View.VISIBLE

                val scale = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    1.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                )
                scale.duration = 200
                scale.fillAfter = true
                binding.accountLayout.startAnimation(scale)
                selectedTab = 4
            }
        }

    }
}