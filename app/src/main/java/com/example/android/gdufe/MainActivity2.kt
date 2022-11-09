package com.example.android.gdufe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button2 = findViewById<Button>(R.id.button2)

        val button4 = findViewById<Button>(R.id.button4)
        val button5= findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        button2.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)
        }
    }
}