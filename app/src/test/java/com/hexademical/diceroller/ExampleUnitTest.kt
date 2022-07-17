package com.hexademical.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generateNumber(){
        val dice = Dice(6)
        val result = dice.roll()
        assertTrue("Is in range ${6}", result in 1..6)
    }
}