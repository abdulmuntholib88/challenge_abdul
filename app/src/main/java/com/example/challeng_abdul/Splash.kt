package com.example.challeng_abdul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splash: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler(Looper.getMainLooper()).postDelayed( {
            val intentRadio = Intent(this@Splash, MainActivity::class.java)

            startActivity(intentRadio)

        }, 1000)
    }
}