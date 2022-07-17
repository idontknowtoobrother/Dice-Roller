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
            rollDice() // called function rollDice()
        }
    }

    /**
     *
     *  rollDice function
     *  make a new dice has 6 sides
     *  and roll number to display on phone screen
     *
     */
    private fun rollDice(){
        val dice = Dice(6) // Create dice
        val rolledNumber = dice.roll() // Roll dice and assign to 'rolledNumber'
        val rollText: TextView = findViewById(R.id.roll_number) // Get the roll_number text view
        rollText.text = rolledNumber.toString() // set a rolled number to textview ( don't forget to change it to string)
    }
}