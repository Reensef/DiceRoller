package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*
import org.junit.Assert.assertTrue

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generate_number() {
        val dice = MainActivity.Dice(6)
        assertTrue("The value of rollResult was not between 1 and 6",
            dice.roll() in 1..6)
    }
}