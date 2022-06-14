package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollDice()
        rollButton.setOnClickListener {
            rollDice()
            // Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        }
    }
    private fun rollDice() {
        // Roll the dices
        val firstDice = Dice(6)
        val secondDice = Dice(6)
        firstDice.setImage(findViewById(R.id.imageView))
        secondDice.setImage(findViewById(R.id.imageView2))

    }


    class Dice(val numSides: Int) {

        fun roll(): Int{
            // Return rolled result
            return (1..numSides).random()
        }

        fun setImage(diceImage: ImageView) {
            // Set the image to ImageView
            val rollResult = roll()
            val drawableResource = when (rollResult) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.contentDescription = rollResult.toString()
            diceImage.setImageResource(drawableResource)
        }
    }
}