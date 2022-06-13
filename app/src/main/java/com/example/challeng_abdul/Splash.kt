package com.example.challeng_abdul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.bumptech.glide.Glide

class Splash: AppCompatActivity() {
    lateinit var imageBinar : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        imageBinar = findViewById(R.id.iv_binar)

        Glide.with(this)
                .load("https://i.ibb.co/NF1rvdX/Kertas-int.png")
                .into(imageBinar)


        Handler(Looper.getMainLooper()).postDelayed( {
            val intentRadio = Intent(this@Splash, MainActivity::class.java)

            startActivity(intentRadio)

        }, 1000)
    }

    private fun requestLocationPermission() {
        TODO("Not yet implemented")
    }
}