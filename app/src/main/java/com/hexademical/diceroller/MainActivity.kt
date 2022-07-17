package com.hexademical.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice(){
        val dice = Dice(6)
        val rolledNumber = dice.roll()
        val rollText: TextView = findViewById(R.id.roll_number)
        rollText.text = rolledNumber.toString()
    }
}