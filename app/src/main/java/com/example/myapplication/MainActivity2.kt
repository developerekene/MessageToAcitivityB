package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }


    override fun onResume() {
        super.onResume()
        val textView = findViewById<TextView>(R.id.textViewNew)

        val data = intent.getStringExtra("MY_DATA")

        data?.let {
            textView.text = data
        }
    }
}