package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

// We can handle user interaction in this Kotlin file
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Connect the XML file with this Kotlin file
        setContentView(R.layout.activity_main)

        val editTxt  = findViewById<EditText>(R.id.editText)
        val viewTxt = findViewById<TextView>(R.id.textView)
        val txtColorBtn = findViewById<Button>(R.id.buttonTxtClr)
        val txtStringBtn = findViewById<Button>(R.id.buttonTxtStr)
        val bgColorBtn = findViewById<Button>(R.id.buttonViewClr)
        val bgView = findViewById<ConstraintLayout>(R.id.backgroundView)

        // REQUIRED
        // Tap a button to change the label text color
        txtColorBtn.setOnClickListener {
            viewTxt.setTextColor(Color.parseColor("#634832"))
        }

        // BONUSES
        // Tap a button to change the background view color
        bgColorBtn.setOnClickListener {
            bgView.setBackgroundColor(Color.parseColor("#3c99dc"))
        }

        // Tap a button to change the label text string
        txtStringBtn.setOnClickListener {
            if (editTxt.text.isEmpty()) {
                viewTxt.text = "Android is Awesome!"
            } else {
                viewTxt.text = editTxt.text.toString()
            }
        }

        // Tap on the background view to reset all views to default
        bgView.setOnClickListener {
            bgView.setBackgroundColor(Color.parseColor("#339966"))
            viewTxt.setTextColor(Color.parseColor("#fffef2"))
            viewTxt.text = "Hello from Sienna!"
        }
    }
}