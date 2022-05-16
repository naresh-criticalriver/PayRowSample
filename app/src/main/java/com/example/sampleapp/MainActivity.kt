package com.example.sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.payrowlibrary.DashboardActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DashboardActivity.displayToast("Welcome",this)
    }
}