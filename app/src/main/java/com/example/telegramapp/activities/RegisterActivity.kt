package com.example.telegramapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.telegramapp.R
import com.example.telegramapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var mBinding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }
}