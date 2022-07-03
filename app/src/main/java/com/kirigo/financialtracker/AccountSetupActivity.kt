package com.kirigo.financialtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class AccountSetupActivity : AppCompatActivity() {
    lateinit var tilEmail :TextInputLayout
    lateinit var tilPassword:TextInputLayout
    lateinit var etEmail:EditText
    lateinit var etPassword:EditText
    lateinit var tvSign:TextView
    lateinit var tvLogin:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_setup)
        tilEmail=findViewById(R.id.tilSecondName)
        tilPassword = findViewById(R.id.tilPassword)
        etEmail=findViewById(R.id.etSecondname)
        etPassword=findViewById(R.id.etPassword)
        tvSign = findViewById(R.id.tvSign)
        tvLogin = findViewById(R.id.tvLogin)
tvLogin.setOnClickListener {
    var intent = Intent(this,HomeActivity::class.java)
    startActivity(intent)
}
        tvSign.setOnClickListener {
            var intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }

    }
}