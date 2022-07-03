package com.kirigo.financialtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondTeaserActivity : AppCompatActivity() {
    lateinit var btnTonext:Button
    lateinit var btnPrevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_teaser)
        btnTonext=findViewById(R.id.btnTonext)
        btnPrevious = findViewById(R.id.btnPrevious)
        btnPrevious.setOnClickListener {
            var intent = Intent(this,TeaserActivity::class.java)
            startActivity(intent)
        }
        btnTonext.setOnClickListener {
            var intent = Intent(this,AccountSetupActivity::class.java )
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