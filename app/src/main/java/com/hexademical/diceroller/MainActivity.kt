package com.hexademical.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
     *  display image dice siede that get from rolled number to shwo on phone screen
     *
     */
    private fun rollDice(){
        val dice = Dice(6) // Create dice
        val rolledNumber = dice.roll() // Roll dice and assign to 'rolledNumber'
        val diceImage: ImageView = findViewById(R.id.roll_image) // Get the roll_number text view

        val diceSideImage = when (rolledNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(diceSideImage)
        diceImage.contentDescription = "Rolled get number ${rolledNumber.toString()}"
    }
}