package com.example.myupdatetestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.os.BuildCompat
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.textView)
        val button = findViewById<TextView>(R.id.button)

        button.setOnClickListener {
            checkForUpdates()
        }
    }

    private fun checkForUpdates() {
        AppUpdater(context = this)
            .checkForUpdates()
    }
}