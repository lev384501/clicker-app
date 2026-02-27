package com.example.clickerapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton: Button = findViewById(R.id.click_button)
        val countTextView: TextView = findViewById(R.id.count_text_view)

        clickButton.setOnClickListener { 
            clickCount++
            countTextView.text = "Clicks: $clickCount"
        }
    }
}