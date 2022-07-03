package com.kirigo.financialtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TeaserActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teaser)
        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            var intent= Intent(this,SecondTeaserActivity::class.java)
            startActivity(intent)
        }
    }
}
//lateinit var btnWelcome:Button
//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
//    btnWelcome = findViewById(R.id.btnWelcome)
//    btnWelcome.setOnClickListener {
//        var intent =Intent(this, PictureOne::class.java)
//        startActivity(intent)