package com.example.razorpaypayment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.razorpaypayment.databinding.PaymentListBinding


class MyCartActivity : AppCompatActivity() {

    private lateinit var  paymentListBinding: PaymentListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        paymentListBinding = DataBindingUtil.setContentView(this ,R.layout.payment_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        WindowCompat.getInsetsController(window, window.decorView).apply {
            isAppearanceLightStatusBars = true
        }
        paymentListBinding.arrow.setOnClickListener {
            finish()
        }

        paymentListBinding.item2.setOnClickListener {
            val amount = 198
            redirectToCheckout(amount)
        }
    }

    private fun redirectToCheckout(amount: Int) {

        val razorpayLink = "https://rzp.io/l/nibOhHXt"
        val uri = Uri.parse("$razorpayLink?amount=$amount")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}