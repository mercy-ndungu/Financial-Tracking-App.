package com.kirigo.financialtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teaser)
        startActivity(Intent(this, TeaserActivity::class.java))
        finish()
    }
}