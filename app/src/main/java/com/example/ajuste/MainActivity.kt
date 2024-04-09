package com.example.ajuste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateButton = findViewById<Button>(R.id.btnCalcular)
        calculateButton.setOnClickListener {
            val amountEditText = findViewById<TextInputEditText>(R.id.textInputLayout)
            val amount = amountEditText.text.toString().toDoubleOrNull()

        }
    }
}