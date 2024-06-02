package com.example.urskin.view.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.urskin.R
import com.example.urskin.databinding.ActivityOnboardingBinding
import com.example.urskin.view.login.LoginActivity
import com.example.urskin.view.signup.SignupActivity

class OnboardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAction()

    }

    private fun setupAction(){
        binding.btnSignup.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}