package com.example.hana

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageView: TextView = findViewById(R.id.messageView)
        val flowerImage: ImageView = findViewById(R.id.flowerImage)
        val waterBtn: Button = findViewById(R.id.waterBtn)
        val resetBtn: Button = findViewById(R.id.resetBtn)

        var count = 0
        waterBtn.setOnClickListener {
            count++
            when (count) {
                in 1..9 -> {
                    messageView.text = getString(R.string.message0)
                    flowerImage.setImageResource(R.drawable.f0)
                }

                in 10..19 -> {
                    messageView.text = getString(R.string.message1)
                    flowerImage.setImageResource(R.drawable.f1)
                }

                in 20..29 -> {
                    messageView.text = getString(R.string.message2)
                    flowerImage.setImageResource(R.drawable.f2)
                }

                in 30..39 -> {
                    messageView.text = getString(R.string.message3)
                    flowerImage.setImageResource(R.drawable.f3)
                }

                in 40..49 -> {
                    messageView.text = getString(R.string.message4)
                    flowerImage.setImageResource(R.drawable.f4)
                }

                else -> {
                    messageView.text = getString(R.string.message5)
                    flowerImage.setImageResource(R.drawable.f5)
                    waterBtn.visibility = View.INVISIBLE
                    resetBtn.visibility = View.VISIBLE
                }
            }

            resetBtn.setOnClickListener {
                count = 0
                messageView.text = getString(R.string.message)
                flowerImage.setImageResource(R.drawable.f0)
                waterBtn.visibility = View.VISIBLE
                resetBtn.visibility = View.INVISIBLE
            }
        }
    }
}
