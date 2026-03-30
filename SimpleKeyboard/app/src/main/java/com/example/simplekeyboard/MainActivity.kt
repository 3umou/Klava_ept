package com.example.simplekeyboard

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button1: Button
    private lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)

        button1.setOnClickListener {
            textView.text = "1"
        }

        button2.setOnClickListener {
            textView.text = "2"
        }
    }
}
