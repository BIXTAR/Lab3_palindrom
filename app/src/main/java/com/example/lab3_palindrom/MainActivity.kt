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

        buttonCheck.setOnClickListener {
            val input = editTextInput.text.toString()
            val cleaned = input.filter { it.isLetter() }.lowercase()
            val isPalindrome = cleaned == cleaned.reversed()

            textResult.text = if (input.isEmpty()) {
                "Введите строку"
            } else {
                if (isPalindrome) "Это палиндром!" else "Это не палиндром."
            }
        }

    }
}