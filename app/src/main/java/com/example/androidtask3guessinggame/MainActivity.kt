package com.example.androidtask3guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val secretKey = findViewById<EditText>(R.id.secretKey)
        val guessedInputValue = findViewById<TextInputLayout>(R.id.guess)
        val clickMeButton = findViewById<TextView>(R.id.clickEvent)
        val result = findViewById<TextView>(R.id.resultMessage)

        clickMeButton.setOnClickListener {

            val actualSecretKey = secretKey.text?.toString()?.toInt()
            val actualGuessValue = guessedInputValue.editText?.text?.toString()?.toInt()
            val maskedValue =
                if (actualSecretKey!! > actualGuessValue!!) {

                    "No MY Number is Bigger dude!!!"
                }
                else if(actualSecretKey!! < actualGuessValue!!)
                {
                    "NO MY Number is Smaller Dude!!!"
                }
                else
                {
                    "Yes You Are Right:)"
                }
            result.text="$maskedValue"
        }



    }
}