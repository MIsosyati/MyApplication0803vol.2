package com.example.myapplication0803vol2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        var number = 0
        val button2 = findViewById<Button>(R.id.button2)
        val button3= findViewById<Button>(R.id.button3)
        textView.setText(number.toString())
        button.setOnClickListener{
            number = number+1
            textView.setText(number.toString())


        }
        button2.setOnClickListener{
            number = number-1
            textView.setText(number.toString())


        }
        button3.setOnClickListener{
            number = 0
            textView.setText(number.toString())


        }
    }
}