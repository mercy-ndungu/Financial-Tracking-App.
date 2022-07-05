package com.kirigo.financialtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import com.kirigo.financialtracker.databinding.ActivityAccountSetupBinding
import com.kirigo.financialtracker.databinding.ActivitySignupBinding

class AccountSetupActivity : AppCompatActivity() {
    lateinit var binding: ActivityAccountSetupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAccountSetupBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.tvLogin.setOnClickListener {
    val intent = Intent(this,HomeActivity::class.java)
    validation()
    startActivity(intent)
}
        binding.tvSign.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            validation()
            startActivity(intent)
        }


    }
    fun validation(){
        var email = binding.etSecondname.text.toString()
        var password = binding.etPassword.text.toString()
//
        var error = false
        if(email.isBlank()){
            binding.tilSecondName.error = "Email is required"
            error= true
        }
        if(password.isBlank()){
            binding.tilPassword.error="First name is required."
            error= true
        }
        if(!error){
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }

}