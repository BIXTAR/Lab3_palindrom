package com.example.lab3_palindrom

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextInput = findViewById<EditText>(R.id.editTextInput)
        val buttonCheck = findViewById<Button>(R.id.buttonCheck)
        val textResult = findViewById<TextView>(R.id.textResult)
    }
}