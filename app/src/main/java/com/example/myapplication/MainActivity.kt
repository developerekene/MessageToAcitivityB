package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.button = findViewById(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)


            val txtname = findViewById<EditText>(R.id.edittext)
            val name = txtname.text.toString()
            intent.putExtra("git init", name)




            startActivity(intent)

        }
    }
}