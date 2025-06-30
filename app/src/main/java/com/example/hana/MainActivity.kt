package com.example.hana

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageView: TextView = findViewById(R.id.messageView)
        val flowerImage: ImageView= findViewById(R.id.flowerImage)
        val waterBtn: Button = findViewById(R.id.waterBtn)
        val resetBtn: Button = findViewById(R.id.resetBtn)

        var count = 0
        waterBtn.setOnClickListener{
            count++
        messageView.text = "$count"
        }
    }
}