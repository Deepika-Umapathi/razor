package com.example.razorpaypayment

import android.content.Intent
import android.database.DatabaseUtils
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.razorpaypayment.databinding.ActivityMainBinding
import com.example.razorpaypayment.databinding.ProductDetailsBinding

class ProductDetailsActivity : AppCompatActivity() {

     private lateinit var binding: ProductDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this ,R.layout.product_details)
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.getInsetsController(window, window.decorView).apply {
            isAppearanceLightStatusBars = true
        }

        binding.item2.setOnClickListener {
            val intent = Intent(this, MyCartActivity::class.java)
            startActivity(intent)
        }

    }
}