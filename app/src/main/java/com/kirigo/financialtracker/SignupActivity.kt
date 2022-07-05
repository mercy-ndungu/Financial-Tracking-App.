package com.kirigo.financialtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kirigo.financialtracker.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvLog.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    fun validation(){
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()
        var confirmPassword = binding.etConfirmPassword.text.toString()
        var firstName = binding.etFirstname.text.toString()
        var secondName = binding.etSecondname.text.toString()
        var error = false
        if(email.isBlank()){
            binding.tilEmail.error = "Email is required"
            error= true
        }
        if(firstName.isBlank()){
            binding.tilFirstname.error="First name is required."
            error= true
        }
        if(secondName.isBlank()){
            binding.tilSecondName.error="Second name is required."
            error= true
        }
        if(password.isBlank()){
            binding.tilPassword.error = "Password is required"
            error= true
        }
        if(password!=confirmPassword){
            binding.tilConfirmPassword.error="Password does not match."
            error= true
        }
        if(!error){
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}


//class SignUpActivity : AppCompatActivity() {
//    lateinit var binding:ActivitySignUpBinding
//
//
//    //    tvLogin2.setOnClickListener {
////        val intent = Intent(this, LoginActivity::class.java)
////        startActivity(intent)
////    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivitySignUpBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//
//        binding.tvLogin2.setOnClickListener {
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//        }
//        binding.btnSignUp.setOnClickListener {
//            val intent = Intent(this, HomeActivity::class.java)
//            startActivity(intent)
//        }
//        binding.btnSignUp.setOnClickListener {
//            validity()
//        }
//    }
//    fun validity(){
//        var password1 = binding.etEnterPassword.text.toString()
//        var password2 = binding.etConfirmPassword.text.toString()
//        if(password1!=password2){
//            binding.tilConfirmPassword.error = "Password does not match!"
//        }
//
////        fun validation(){
////            var email = etEmail.text.toString()
////            var password = etPassword.text.toString()
////            if(email.isBlank()){
////                tilEmail.error = "Email is required"
////            }
////            if(password.isBlank()){
////                tilPassword.error = "Password is required"
////            }
////        }
////    }
//    }
//}