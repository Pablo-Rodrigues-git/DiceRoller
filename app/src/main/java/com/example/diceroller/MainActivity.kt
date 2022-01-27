package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.R.id.count_up
import com.example.diceroller.R.id.roll_button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(roll_button)
        rollButton.setOnClickListener { rollDice() }

        val CountButton: Button = findViewById(count_up)
        CountButton.setOnClickListener { addOne() }

    }

    private fun addOne() {
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello World") {
            resultText.text = "1"
        } else {
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt ++
                resultText.text = resultInt.toString()
            }
        }

    }

    private fun rollDice() {

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "1"


        //Toast.makeText(
            //this, "button clicked",
            //Toast.LENGTH_SHORT
        //).show()
    }
}