package com.hexademical.diceroller

class Dice(private val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}