package com.kirigo.financialtracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kirigo.financialtracker.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding = ActivityHome2Binding.inflate(layoutInflater)
//        setContentView(binding.root)
//        setupBottomNav()
    }

    fun setupBottomNav() {
        binding.bnvBottom.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.Home -> {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvHome, HomeFragment())
                    transaction.commit()
                    true
                }
                R.id.Wallets -> {
                    val trasaction = supportFragmentManager.beginTransaction()
                    trasaction.replace(R.id.fcvHome, WalletFragment())
                    trasaction.commit()
                    true

                }
                R.id.Analytics -> {
                    val trasaction = supportFragmentManager.beginTransaction()
                    trasaction.replace(R.id.fcvHome, AnalyticsFragment())
                    trasaction.commit()
                    true

                }
                R.id.Profile -> {
                    val trasaction = supportFragmentManager.beginTransaction()
                    trasaction.replace(R.id.fcvHome, ProfileFragment())
                    trasaction.commit()
                    true

                }
                else -> false
            }
        }
    }
}

